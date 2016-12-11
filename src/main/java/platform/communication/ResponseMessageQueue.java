package platform.communication;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import platform.log.ApplicationLogger;
import platform.message.Message;


public class ResponseMessageQueue {
	class theLock extends Object {
	}
    public theLock lockObject = new theLock();
 
	 
	HashMap<Object, HashMap<Long,Message>> messageTable;
	public ResponseMessageQueue() {
		messageTable = new HashMap<Object, HashMap<Long,Message>>();
	}
	
	public synchronized void addMessage(Object clientId, Message message) {
		 synchronized (lockObject) {
			ApplicationLogger.info("For Client : "+clientId + " Message " +message.getName() + " added in to queue", this.getClass());
			System.out.println("For Client : "+clientId + " Message " +message.getName() + " added in to queue");
			HashMap<Long, Message> list = messageTable.get(clientId);
			if (list == null) {
				list = new HashMap<Long, Message>();
			}
			list.put(message.getSequenceNumber(),message);
			messageTable.put(clientId, list);
		 }
	}
	
	public synchronized Message getMessage(Long sequenceNumber,Object clientReferenceId) {
		HashMap<Long,Message> list = messageTable.get(clientReferenceId);
		if ((list == null) || (list.size() == 0)) {
			return null;
		}
		System.out.println("Size of Message list is for "+clientReferenceId+" " + list.size());
		Message msg =  list.get(sequenceNumber);
		if (msg != null)
			System.out.println("Retrieve the message from action list "+ msg.getName());
		else 
			ApplicationLogger.error("Missed the message for sequence number  "+ sequenceNumber + "for clientId : "+clientReferenceId,ResponseMessageQueue.class);
		return msg;
	}
	
	public synchronized void cleanUnAttendedMessage() {
		 synchronized (lockObject) {
			long currenttime = Calendar.getInstance().getTime().getTime();
			for (Map.Entry<Object, HashMap<Long, Message>> entry : messageTable.entrySet()) {
				HashMap<Long, Message> childMap = entry.getValue(); 
				for (Map.Entry<Long, Message> childEntry : childMap.entrySet()) {
					Message message = childEntry.getValue();
					Object key = childEntry.getKey();
					long timelimit = message.getSentTime().getTime()+Message.DEFAULT_RESPONSE_TIME*2;
					//System.out.println(" Time to expire : "+ timelimit + " --> current time : "+currenttime);
					if (currenttime > timelimit) {
						Message msg = childMap.get(key);
						if (msg != null)
							msg.process_timeout(null);
						childMap.remove(key);
						return;
					}
				}
			}
			int count = activeMessages();
			if (count > 0)
				System.out.println("Active Messages : " + count);
		 }
	}
	
	public int  activeMessages() {
		int count = 0;
		for (Map.Entry<Object, HashMap<Long, Message>> entry : messageTable.entrySet()) {
			HashMap<Long, Message> childMap = entry.getValue(); 
			if (childMap != null)
				count = count + childMap.size();
		}
		return count;
	}
	public synchronized void cleanUnAttendedMessage(Session session) {
		 synchronized (lockObject) {
			long currenttime = Calendar.getInstance().getTime().getTime();
			for (Map.Entry<Object, HashMap<Long, Message>> entry : messageTable.entrySet()) {
				HashMap<Long, Message> childMap = entry.getValue(); 
				for (Map.Entry<Long, Message> childEntry : childMap.entrySet()) {
					Message message = childEntry.getValue();
					Object key = childEntry.getKey();
					long timelimit = message.getSentTime().getTime()+Message.DEFAULT_RESPONSE_TIME;
					System.out.println(message.getName()+" Time to expire : "+ timelimit + " --> current time : "+currenttime);
					if (currenttime > timelimit) {
						Message msg = childMap.get(key);
						if (msg != null)
							msg.process_timeout(session);
						childMap.remove(key);
						return;
					}
				}
			}
		 }
	}
	
	public synchronized Message deleteMessage(Long sequenceNumber,Object clientId) {
		synchronized (lockObject) {
			HashMap<Long,Message> list = messageTable.get(clientId);
			if ((list == null) || (list.size() == 0)) {
				return null;
			}
			System.out.println("deleteMessage::Size of Message list is for "+clientId+" " + list.size());
			Message msg =  list.remove(sequenceNumber);
			if (msg != null)
				System.out.println("deleteMessage::Deleted the message from action list "+ msg.getName());
			else 
				ApplicationLogger.error("deleteMessage::Missed the message for sequence number  "+ sequenceNumber + "for clientId : "+clientId,ResponseMessageQueue.class);
			return msg;
		}
	}
}
