package platform.communication;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

import platform.log.ApplicationLogger;
import platform.manager.GlobalDataManager;
import platform.message.Message;
import platform.util.ApplicationException;


public class Client extends Communication {
	private ClientContext context;
	private Message authenticateMessage;
	//	private int authenticateFailed = 0;
	public Client(ClientContext context) {
		super(context.getProtocolProvider(), null);
		this.context = context;
		if (context != null)
			init(context);
	}

	public String getConnectString() {
		return context.getServer()+"::"+context.getPort();
	}
	public void init(ClientContext _context) {
		handle = null;
		if (session == null)
			session = new Session();
		this.context = _context;
		if (_context != null) {
			setMe(_context.getMyName());
			setPeer(_context.getPeerName());
		}
	}

	public void afterConnected() {
		GlobalDataManager.getInstance().setConnected(true);
	}

	public String getIP() {
		return context.getServer();
	}
	public void connectNonSSL() throws Exception {
		try {
			System.out.println("Connecting to Server "+context.getServer()+" on Port " + context.getPort()+ " .....");
			connected = false;
			InetAddress addr = InetAddress.getByName(context.getServer());
			SocketAddress sockaddr = new InetSocketAddress(addr, context.getPort());
			handle = new Socket();
			int timeoutMs = 2000;   // 2 seconds
			((Socket)handle).setSoTimeout(timeoutMs);
			((Socket)handle).connect(sockaddr, timeoutMs);
			((Socket)handle).setKeepAlive(true);
			afterConnected();
			ApplicationLogger.info("Connected Server "+context.getServer()+" on Port " + context.getPort()+ " .....", Client.class);
			connected = true;
			session.setClientId(context.getClientId());
			session.setApplication(context.getApplication());
		} catch (UnknownHostException e) {
			e.printStackTrace();
			ApplicationLogger.error("Unable to connect with Server "+context.getServer()+" on Port" +context.getPort() + e.getMessage()+" .....", Client.class);
			throw e;
		} catch (SocketTimeoutException e) {
			e.printStackTrace();
			ApplicationLogger.error("Unable to connect with Server "+context.getServer()+" on Port" +context.getPort() + " .....", Client.class);
			throw e;
		} catch (IOException e) {
			e.printStackTrace();
			ApplicationLogger.error("Unable to connect with Server "+context.getServer()+"on Port" +context.getPort() + e.getMessage()+" .....", Client.class);
			throw e;
		}

	}
	// Listen for incoming connections and handle them
	public void connect() throws Exception {
		if (context.getSsl() == 1) {
			connectSSL();
		} else {
			connectNonSSL();
		}
	}

	public void connectSSL() throws Exception {
		ApplicationLogger.init();
		try {
			connected = false;
			System.setProperty("javax.net.ssl.keyStore",context.getKeystore());
			System.setProperty("javax.net.ssl.keyStorePassword",context.getKeystorePassword());
			System.setProperty("javax.net.ssl.trustStore", context.getKeystore());
			System.setProperty("javax.net.ssl.trustStorePassword", context.getKeystorePassword());

			SSLSocketFactory sslsocketfactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
			handle = (SSLSocket) sslsocketfactory.createSocket(context.getServer(), context.getPort());
			ApplicationLogger.info("Connected Server "+context.getServer()+" on Port " +context.getPort() + " .....", Client.class);
			connected = true;
		} catch (UnknownHostException e) {
			e.printStackTrace();
			ApplicationLogger.error("Unable to connect with Server "+context.getServer()+" on Port" +context.getPort() + e.getMessage()+" .....", Client.class);
			throw e;
		} catch (SocketTimeoutException e) {
			e.printStackTrace();
			ApplicationLogger.error("Unable to connect with Server "+context.getServer()+" on Port" +context.getPort() + " .....", Client.class);
			throw e;
		} catch (IOException e) {
			e.printStackTrace();
			ApplicationLogger.error("Unable to connect with Server "+context.getServer()+"on Port" +context.getPort() + e.getMessage()+" .....", Client.class);
			throw e;
		}
	}

	public void afterDisconnect() {
		GlobalDataManager.getInstance().setConnected(false);
		GlobalDataManager.getInstance().setReady(false);
		GlobalDataManager.getInstance().setAuthenticated(false);
	}

	public void disconnect() {
		try {
			ApplicationLogger.info("Closing the connection", this.getClass());
			if (handle != null)
				((Socket)handle).close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		connected = false;
		afterDisconnect();
	}


	void authenticate() {
		if (authenticateMessage != null) {
			sendMessage(authenticateMessage);
		}
	}

	public void start() {
		while (true) {
			try {
				connect();
				authenticate();
				messageHandler();
				disconnect();
			} catch(Exception e) {
				e.printStackTrace();
				disconnect();
			}
			try {
				Thread.sleep(10000L);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	protected void executeCommandFromMessageQueue() {

		if (!GlobalDataManager.getInstance().isAuthenticated())
			return;
		//System.out.println("I have "+ClientMessageQueue.getInstance().getSize() + " Waiting in queue");
		Message msg;
		if (ClientUrgentMessageQueue.getInstance().getSize() > 0) {
			msg = ClientUrgentMessageQueue.getInstance().getMessage();
		} else {
			msg = ClientMessageQueue.getInstance().getMessage();
		}
		if (msg == null)
			return;
		sendMessage(msg);
	}

	public boolean validateSession(long heartBeatInterval) {
		if ((session != null) && (session.getLastUpdateTime() > 0)) {
			long currentTime = System.currentTimeMillis();
			if (session.getLastUpdateTime()+(heartBeatInterval*2) < currentTime) {
				return false;
			}
		}
		return true;
	}

	public void checkAlive() {

	}
	public void messageHandler() {
		ApplicationLogger.info("Initialize the message handler " + context.getServer(), this.getClass());
		// Get input from the client
		while(isConnected()) {
			executeCommandFromMessageQueue();
			try {
				Message msg = getProtocolProvider().getReader().read(session, getReaderHandle(), protocolProvider.getMessageManager());
				if (msg != null) {
					processMessage(msg);
				} 
				
				if (context.getDisconnectDetectInterval() != null) {
					long currentTime = System.currentTimeMillis();
					if ((currentTime - session.getLastUpdateTime()) > (context.getDisconnectDetectInterval()*1000L)) {
						ApplicationLogger.error("Detected no message for long time ("+(currentTime - session.getLastUpdateTime())+") disconnecting now ...", this.getClass());
						break;
					}
				}
			} catch (ApplicationException e) {
				break;
			}
			responseMessageQueue.cleanUnAttendedMessage(session);
		}
	}

	public Message getAuthenticateMessage() {
		return authenticateMessage;
	}

	public void setAuthenticateMessage(Message authenticateMessage) {
		this.authenticateMessage = authenticateMessage;
	}
	public ClientContext getContext() {
		return context;
	}

	@Override
	public DataInputStream getReaderHandle() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		try {
			return new DataInputStream (((Socket)handle).getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public PrintStream getWriterHandle() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		try {
			return new PrintStream(((Socket)handle).getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}