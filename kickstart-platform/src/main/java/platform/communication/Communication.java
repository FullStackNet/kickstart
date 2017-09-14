package platform.communication;
import java.io.DataInputStream;
import java.io.PrintStream;

import platform.log.ApplicationLogger;
import platform.message.Message;
import platform.protocol.ProtocolProvider;


public abstract class Communication {
	public Object getHandle() {
		return handle;
	}
	public void setHandle(Object handle) {
		this.handle = handle;
	}
	// Listen for incoming connections and handle them
	protected Object handle;
	boolean ssl;
	protected Session session = null;
	
	static long sequenceNumber = 1;
	protected ResponseMessageQueue responseMessageQueue;
	protected boolean connected;
	protected String me;
	protected String peer;
	protected ProtocolProvider protocolProvider;
	
	public abstract DataInputStream getReaderHandle();
	public abstract PrintStream getWriterHandle();
	
	public String getMe() {
		return me;
	}

	public void setMe(String me) {
		this.me = me;
	}

	public String getPeer() {
		return peer;
	}

	public void setPeer(String peer) {
		this.peer = peer;
	}
	
	public ProtocolProvider getProtocolProvider() {
		return protocolProvider;
	}
	
	public Communication(ProtocolProvider protocolProvider, Object handle) {
		this.protocolProvider = protocolProvider;
		this.handle = handle;
		ssl = false;
		responseMessageQueue = new ResponseMessageQueue();
	}

	public String getIP() {
		return "UNKNOWN";
	}

	
	public int sendMessage(Message msg) {
		System.out.println("Sending Message :  " + msg.getName());
		msg.setSequenceNumber(protocolProvider.nextSequenceNumber());
		try {
			msg.process_before_send();
			protocolProvider.getWriter().write(session, (Object)getWriterHandle(),msg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ApplicationLogger.error("Sent Message of failed : "+msg.getName(), this.getClass());
			return -1;
		}
		return 0;
	}

	int sendResponse(Message request, Message response) {
		response.setSequenceNumber(request.getSequenceNumber());
		try {
			protocolProvider.getWriter().write(session, getWriterHandle(),response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ApplicationLogger.error("Sent Response of failed : "+request.getName(), this.getClass());
			return -1;
		}
		ApplicationLogger.info("Sent response of Message : "+request.getName(), this.getClass());
		return 0;
	}

	int process_response(Message response) {
		Long number = response.getSequenceNumber();
		Message request = responseMessageQueue.getMessage(number, session.getClientId());
		if (request != null) {
			request.setResponseMessage(response);
			responseMessageQueue.addMessage(session.getClientId(), request);
		}
		response.request_process(session, request);
		return 0;
	}

	
	int processMessage(Message message) {
		if (session != null)
			session.setLastUpdateTime(System.currentTimeMillis());
		if (message.getPacketType() == Message.PACKET_TYPE_RESPONSE) {
			process_response(message);
		} else {
			Message response = message.request_process(session,null);
			if (response != null) {
					sendResponse(message, response);
			}
		}
		return 0;
	}
	
	public boolean isConnected() {
		return connected;
	}
	public void setConnected(boolean connected) {
		this.connected = connected;
	}
}