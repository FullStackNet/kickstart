package platform.communication;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLServerSocketFactory;

import platform.event.EventManager;
import platform.event.interfaces.Event;
import platform.event.interfaces.GenericEventListener;
import platform.events.ShutDownProcessEvent;
import platform.log.ApplicationLogger;
import platform.manager.GlobalDataManager;
import platform.message.Message;
import platform.protocol.ProtocolProvider;

public class Server  {
	public static final int NUM_THREADS = 10000;
	private ServerContext context;
	private boolean stop ;
	//private ExecutorService executorService;
	public ServerContext getContext() {
		return context;
	}

	public void setContext(ServerContext context) {
		this.context = context;
	}

	private ServerSocket listener;
	private long numberOfConnection;

	public synchronized void incrementConnection() {
		numberOfConnection ++;
		ApplicationLogger.info("Incremented connections for " + context.getName()+"("+context.getPort()+") -> total connection -> "+ numberOfConnection , this.getClass());
	}

	public synchronized void decrementConnection() {
		numberOfConnection --;
		ApplicationLogger.info("Decremented connections for " +context.getName()+"("+context.getPort()+") -> total connection  ->  "+ numberOfConnection , this.getClass());
	}

	public Server(ServerContext context) {
		this.context = context;
		stop = false;
		listener = null;
		//executorService = Executors.newFixedThreadPool(NUM_THREADS);
	}

	public void stop() {
		stop = true;

		try {
			if (listener != null)
				listener.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		listener = null;
	}
	// Listen for incoming connections and handle them

	public void start() {
		try{
			//BinaryMessageQueue.getInstance().test();
			listener = new ServerSocket(context.getPort());
			Socket client;
			ApplicationLogger.info("Started "+context.getName()+" Server on Port " + context.getPort() + " .....", Server.class);
			GenericEventListener processShutDownListner = new GenericEventListener() {
				@Override
				public void eventTriggered(Object sender, Event event) {
					// TODO Auto-generated method stub
					//executorService.shutdownNow();
					stop();
				}
			}; 
			EventManager.getInstance().registerEventListener(processShutDownListner, ShutDownProcessEvent.class);
			numberOfConnection = 0;
			while(!stop){
				try {
					client = listener.accept();
					if (GlobalDataManager.getInstance().isShutdown()) {
						ApplicationLogger.info("Not accepting connection as about to shut down", this.getClass());
						client.close();
						listener.close();
						break;
					}
					if (numberOfConnection >= context.getMaxConnection()) {
						ApplicationLogger.error("Closing peer connection ... Max connection limit reached for "+context.getPort()+" ... "+context.getMaxConnection()+"....Not allowing the more connection", this.getClass());
						client.close();
						continue;
					}
					ClientReadHandler  clientHandler= new ClientReadHandler(this,context.getProtocolProvider().getClone(), client);
					Thread thread = new Thread(clientHandler);
					thread.setName("CLIENT_HANDLING_THREAD");
					clientHandler.setThread(thread);
					thread.start();

				} catch(Exception e) {
					e.printStackTrace();
					ApplicationLogger.error("Error in client handling", this.getClass());
				}
			}
			EventManager.getInstance().unregisterEventListener(processShutDownListner, ShutDownProcessEvent.class);
		} catch (IOException ioe) {
			ApplicationLogger.error("IOException on socket listen at port "+ context.getPort() + ioe, Server.class);
			ioe.printStackTrace();
			System.exit(-1);
		}
		try {
			if (listener != null)
				listener.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void startSSL() {

		ApplicationLogger.init();
		try{
			//BinaryMessageQueue.getInstance().test();
			System.setProperty("javax.net.ssl.keyStore",context.getKeystore());
			System.setProperty("javax.net.ssl.keyStorePassword",context.getKeystorePassword());
			ServerSocketFactory ssocketFactory = SSLServerSocketFactory.getDefault();
			ServerSocket listener = ssocketFactory.createServerSocket(context.getPort());
			Socket client;
			ApplicationLogger.info("Started "+context.getName()+" Server on Port " + context.getPort() + " .....", Server.class);
			GenericEventListener processShutDownListner = new GenericEventListener() {
				@Override
				public void eventTriggered(Object sender, Event event) {
					// TODO Auto-generated method stub
					ApplicationLogger.info("Shuting down server...."+ context.getName()+"::"+context.getPort(), this.getClass());
					stop();
				}
			}; 
			EventManager.getInstance().registerEventListener(processShutDownListner, ShutDownProcessEvent.class);
			while(!stop){
				try {
					client = listener.accept();
					client.setSoTimeout(3000);
					ClientReadHandler conn_c= new ClientReadHandler(this,context.getProtocolProvider(), client,context.isSsl());
					if (GlobalDataManager.getInstance().isShutdown()) {
						ApplicationLogger.info("Not accepting connection as about to shut down", this.getClass());
						client.close();
						listener.close();
						break;
					}
					Thread t = new Thread(conn_c);
					t.start();
				} catch(Exception e) {
					e.printStackTrace();
					ApplicationLogger.error("Error in client handling", this.getClass());
				}
			}
		} catch (IOException ioe) {
			ApplicationLogger.error("IOException on socket listen: " + ioe, Server.class);
			ioe.printStackTrace();
			//System.exit(-1);
		}
	}
}

class ClientReadHandler extends Communication implements Runnable {
	Server server;
	Thread thread;
	public void setThread(Thread thread) {
		this.thread = thread;
	}
	public ClientReadHandler(Server server,ProtocolProvider protocolProvider, Socket handle) throws SocketException {
		super(protocolProvider, handle);
		this.server = server;
		handle.setKeepAlive(true);
		handle.setSoTimeout(3000);
		session = new Session();
		session.setKey(handle.toString());
		session.setMax_message_queue_per_client(server.getContext().getMaxMessageQueueSizePerClient());
		SessionManager.getInstance().addSession(session);
		ApplicationLogger.info("Connection received from client  ....for "+server.getContext().getName()+"("+server.getContext().getPort()+")",this.getClass());
		server.incrementConnection();
	}


	public ClientReadHandler(Server server,ProtocolProvider protocolProvider, Socket handle,boolean ssl) throws SocketException {
		this(server,protocolProvider, handle);
		this.ssl = ssl;
	}

	void executeCommandFromMessageQueue() {
		if ((session != null) && (session.getClientId() != null) && session.isAuthenticated() && session.isReady()) {
			while (true) {
				Message msg ;
				msg = ServerMessageQueue.getInstance().getMessage(session.getClientId());
				if (msg == null)
					break;
				sendMessage(msg);
			}
		}
	}

	public boolean isValidSession() {
		//if (SessionManager.getInstance().getSession(session.getSessionKey()) == null) {
		//	return false;
		//}
		return true;
	}

	public void run () {
		while(true) {
			if (session.getClientId() != null) {
				if (!("CLIENT_HANDLING_THREAD_"+session.getClientId()).equals(Thread.currentThread().getName())) {
					thread.setName("CLIENT_HANDLING_THREAD_"+session.getClientId());
				}
			}
			if (!isValidSession()) {
				ApplicationLogger.info("Invalid session terminating it ...."+session.getClientId() +" for "+server.getContext().getName()+"("+server.getContext().getPort()+")", this.getClass());
				break;
			}
			if (session.isDelete() && getProtocolProvider().getReader().isOk2Exit()) {
				ApplicationLogger.info("Session mark deleted ...."+session.getClientId(), this.getClass());
				break;
			}
			if (GlobalDataManager.getInstance().isShutdown()) {
				ApplicationLogger.info("Shuting down client connection ...." +session.getClientId() + "for "+server.getContext().getName()+"("+server.getContext().getPort()+")" , this.getClass());
				break;
			}
			try {
				executeCommandFromMessageQueue();

				Message msg = null;
				msg = getProtocolProvider().getReader().read(session, getReaderHandle(), protocolProvider.getMessageManager());
				if (msg == null) {
					msg = getProtocolProvider().getReader().readWrite(session, getReaderHandle(), getWriterHandle(),protocolProvider.getMessageManager());
				}
				if (msg != null) {
					session.setLastUpdateTime(System.currentTimeMillis());
				}
				if ((msg != null ) && msg.isAuthenticationRequired()) {
					if (!session.isAuthenticated()) {
						continue;
					}
				}
				if (msg != null) {
					processMessage(msg);
					session.incrementProcessedMessage();
				}
				responseMessageQueue.cleanUnAttendedMessage(session);
			} catch (Exception e) {
				e.printStackTrace();
				ApplicationLogger.info("Exiting the Session due to exception and Pending messages are " + session.getPendingMessage()+"->"+e.getMessage()+"...."+session.getClientId(), this.getClass());
				session.setDelete(true);
			}
		}
		
		try {
			if (!((Socket)handle).isClosed()) {
				getReaderHandle().close();
				getWriterHandle().close();
			}
			((Socket)handle).close();
			ApplicationLogger.warn("Peered closed the connection closing the connection "+session.getClientId()+" for "+server.getContext().getName()+"("+server.getContext().getPort()+")", this.getClass());
		} catch(Exception e) {
			e.printStackTrace();
		}
		session.setExited(true);
		SessionManager.getInstance().deleteSession(handle.toString());
		server.decrementConnection();
	}


	@Override
	public DataInputStream getReaderHandle() {
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
		try {
			if (((Socket)handle).isClosed()) {
				return null;
			}
			return new PrintStream(((Socket)handle).getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}