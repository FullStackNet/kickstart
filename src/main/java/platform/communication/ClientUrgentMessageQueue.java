package platform.communication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import platform.log.ApplicationLogger;
import platform.message.Message;


public class ClientUrgentMessageQueue {
	static public ClientUrgentMessageQueue instance;
	static class theLock extends Object {
	}
	static public theLock lockObject = new theLock();
	public synchronized static ClientUrgentMessageQueue getInstance() {
		if (instance == null)
			instance = new ClientUrgentMessageQueue();
		
		return instance;
	}
	
	ArrayList<Message> messageTable;
	
	ClientUrgentMessageQueue() {
		messageTable = new  ArrayList<Message>();
	}
	
	public synchronized void addMessage(Message message) {
		ApplicationLogger.info("For SDP : Message " +message.getName() + " added in to queue", this.getClass());
		synchronized (lockObject) {
			messageTable.add(message);
		}
		
	}
	
	public synchronized void addMessageAtTop(Message message) {
		ApplicationLogger.info("For SDP : Message " +message.getName() + " added at to queue", this.getClass());
		synchronized (lockObject) {
			messageTable.add(0,message);
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
}
