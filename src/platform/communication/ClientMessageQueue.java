package platform.communication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import platform.log.ApplicationLogger;
import platform.message.Message;

public class ClientMessageQueue {
	private int max_size = 4096;
	ArrayList<Message> messageTable;
	
	static public ClientMessageQueue instance;
	static class theLock extends Object {
	}
	static public theLock lockObject = new theLock();
	
	public synchronized static ClientMessageQueue getInstance() {
		if (instance == null)
			instance = new ClientMessageQueue();
		
		return instance;
	}
	
	ClientMessageQueue() {
		messageTable = new  ArrayList<Message>();
	}
	
	
	public void waitMe() {
		try {
			synchronized (messageTable) {
				System.out.println("Going to wait for message ....");
				messageTable.wait();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void addMessage(Message message) {
		ApplicationLogger.info("For SDP : Message " +message.getName() + " added in to queue", this.getClass());
		synchronized (lockObject) {
			while (messageTable.size() > max_size) {
				Message msg = messageTable.remove(0);
				ApplicationLogger.error("Dropping the message due message queue size exceeded :: "+msg.getDump(), this.getClass());
			}
			messageTable.add(message);
		}
		synchronized (messageTable) {
			System.out.println("Going to notify for message ....");
			messageTable.notify();		
		}
	}
	
	public synchronized void addMessage(String sender, String target, Message message) {
		message.setSender(sender);
		message.setTarget(target);
		ApplicationLogger.info("For "+target+" : Message " +message.getName() + " added in to queue", this.getClass());
		synchronized (lockObject) {
			while (messageTable.size() > max_size) {
				Message msg = messageTable.remove(0);
				ApplicationLogger.error("Dropping the message due message queue size exceeded :: "+msg.getDump(), this.getClass());
			}

			messageTable.add(message);
		}
		synchronized (messageTable) {
			System.out.println("Going to notify for message ....");
			messageTable.notify();		
		}

	}

	public synchronized void addMessage(String sender, String target, String forwardTo, Message message) {
		message.setSender(sender);
		message.setTarget(target);
		message.setForwardTo(forwardTo);
		ApplicationLogger.info("For "+target+" : Message " +message.getName() + " added in to queue", this.getClass());
		synchronized (lockObject) {
			while (messageTable.size() > max_size) {
				Message msg = messageTable.remove(0);
				ApplicationLogger.error("Dropping the message due message queue size exceeded :: "+msg.getDump(), this.getClass());
			}
			messageTable.add(message);
		}
		synchronized (messageTable) {
			System.out.println("Going to notify for message ....");
			messageTable.notify();		
		}

	}
	public synchronized void addMessageAtTop(String sender,String target, Message message) {
		message.setSender(sender);
		message.setTarget(target);
		addMessageAtTop(message);
	}
	public synchronized void addMessageAtTop(Message message) {
		ApplicationLogger.info("For "+message.getTarget()+" : Message " +message.getName() + " added in to queue", this.getClass());
		synchronized (lockObject) {
			while (messageTable.size() > max_size) {
				Message msg = messageTable.remove(0);
				ApplicationLogger.error("Dropping the message due message queue size exceeded :: "+msg.getDump(), this.getClass());
			}
			messageTable.add(0,message);
		}
		synchronized (messageTable) {
			System.out.println("Going to notify for message ....");
			messageTable.notify();		
		}

	}
	
	public synchronized Message getMessage() {
		if (messageTable.size() > 0) {
			Message msg;
			synchronized (lockObject) {
				msg =  messageTable.remove(0);
				ApplicationLogger.info("Retrieve the message from action list "+ msg.getName(),this.getClass());
				return msg;
			}
			
		}
		return null;
	}
	
	public synchronized int getSize() {
		synchronized (lockObject) {
			return messageTable.size();
		}
	}
	
	public synchronized void setMaxSize(int size) {
		max_size = size;
	}
	
	public  boolean hasMessage(Message message) {
		if (messageTable.size() > 0) {
			for(Message msg : messageTable) {
				if (msg.getCommandKey().equals(message.getCommandKey())) {
					return true;
				}
			}
		}
		return false;
	}
	
	public  boolean hasMessage(String key,Message message) {
		if (messageTable.size() > 0) {
			for(Message msg : messageTable) {
				if (msg.getCommandKey().equals(key)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public synchronized ArrayList<Map<String, Object>>  getQueue() {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		synchronized (lockObject) {
			for(int i= 0; i < messageTable.size(); i++) {
				 Message message = messageTable.get(i);
				 Map<String, Object> map = new HashMap<String, Object>();
				 map.put("message", message.getName());
				 map.put("messageId", message.getMessageId());
				 map.put("dump", message.getDump());
				 map.put("recieved_time", message.getReceivedTime());
				 list.add(map);
			 }
		 }
		return list;
	}

	public int getMax_size() {
		return max_size;
	}

	public void setMax_size(int max_size) {
		this.max_size = max_size;
	}
}
