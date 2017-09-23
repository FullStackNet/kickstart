package platform.message;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.SerializationUtils;

import platform.log.ApplicationLogger;


public class MessageFactory {
	static MessageFactory instance;
	
	
	HashMap<String, Message> messageTable = null;
	
	public void registerMessages(HashMap<String, Message> list) {
		for (Map.Entry<String, Message> entry : list.entrySet()) {
			registerMessage(entry.getValue());
		}
		
	}
	
	public void registerMessage(Message message) {
		ApplicationLogger.info(" Registered Message for listening "+message.getName(), this.getClass());
		System.out.println(" Registered Message for listening "+message.getName() + " Key "+message.getCommandKey());
		if (messageTable.get(message.getCommandKey()) != null) {
			ApplicationLogger.error(" Duplicate Message regisrty"+message.getName() + " Already registered "+messageTable.get(message.getCommandKey()).getName(),this.getClass());
			System.exit(1);
		}
		messageTable.put(message.getCommandKey(), message);
	}
	
	public void registerMessage(String key,Message message) {
		ApplicationLogger.info(" Registered Message for listening "+message.getName(), this.getClass());
		System.out.println(" Registered Message for listening "+message.getName() + " Key "+key);
		messageTable.put(key, message);
	}
	
	
	public MessageFactory() {
		messageTable = new HashMap<String, Message>();
	}
	
	public synchronized Message getMessage(String key) {
		return (Message) SerializationUtils.clone(messageTable.get(key));
	}
	
	public HashMap<String, Message> getMessageTable() {
		return messageTable;
	}
	
	
}
