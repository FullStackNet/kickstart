package platform.communication;

import java.util.ArrayList;
import java.util.HashMap;

import platform.log.ApplicationLogger;
import platform.message.Message;

public class ServerMessageQueue {
	private long max_queue_size_4_client;
	private long max_size;
	private static ServerMessageQueue instance;
	private long numberOfMessages;
	static class theLock extends Object {
	}
    static public theLock lockObject = new theLock();
	
	public synchronized static ServerMessageQueue getInstance() {
		if (instance == null)
			instance = new ServerMessageQueue();
		
		return instance;
	}
	
	HashMap<Object, ArrayList<Message>> messageTable;
	HashMap<Object, Long> clientMQSizeTable;
	
	ServerMessageQueue() {
		messageTable = new HashMap<Object, ArrayList<Message>>();
		clientMQSizeTable = new HashMap<Object, Long>();
		numberOfMessages = 0;
		max_size = 65096;
		max_queue_size_4_client = 256;
	}
	
	public synchronized void setMaxQueueSize4Client(Object clientId, long size) {
		ApplicationLogger.info("Max Queue size For Client : "+clientId + " set to " +size, this.getClass());
		clientMQSizeTable.put(clientId, size);
	}
	
	synchronized long getMaxQueueSize4Client(Object clientId) {
		Long size  = clientMQSizeTable.get(clientId);
		if (size  == null) {
			size = max_queue_size_4_client;
		}
		return size.longValue();
	}
	
	public synchronized void addMessage(Object clientId, Message message) {
		 synchronized (lockObject) {
			ApplicationLogger.info("For Client : "+clientId + " Message " +message.getName() + " added in to queue", this.getClass());
			System.out.println("For Client : "+clientId + " Message " +message.getName() + " added in to queue");
			ArrayList<Message> queue = messageTable.get(clientId);
			if (queue == null) {
				queue = new ArrayList<Message>();
			}
			long max_queue_size = getMaxQueueSize4Client(clientId);
			if (queue.size() >=  max_queue_size) {
				Message msg = queue.remove(0);
				ApplicationLogger.error("Dropping the message due message queue size exceeded :: "+msg.getDump(), this.getClass());
			}
			if (numberOfMessages >= max_size) {
				ApplicationLogger.error("Dropping the message due message queue size exceeded :: "+message.getDump(), this.getClass());
				return; 
			}
			queue.add(message);
			messageTable.put(clientId, queue);
			numberOfMessages++;
		 }
	}
	
	public synchronized Message getMessage(Object clientId) {
		 synchronized (lockObject) {
			ArrayList<Message> queue = messageTable.get(clientId);
			if ((queue == null) || (queue.size() == 0)) {
				return null;
			}
			Message msg =  (Message) queue.remove(0);
			messageTable.put(clientId,queue);
			numberOfMessages--;
			System.out.println("Retrieve the message from ServerMessageQueue "+ msg.getName()+", Total Message in server queue left "+ numberOfMessages +" Total Message in client message queue "+ queue.size());
			return msg;
		 }
	}
	
	public  long getMax_size() {
		return this.max_size;
	}

	public void setMax_size(long max_size) {
		this.max_size = max_size;
	}
}
