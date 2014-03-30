package platform.message;




public class MessageManager  {
	MessageFactory messageFactory ;
	public MessageFactory getMessageFactory() {
		return messageFactory;
	}

	public void setMessageFactory(MessageFactory messageFactory) {
		this.messageFactory = messageFactory;
	}

	public void registerMessage(Message message) {
		if (messageFactory == null)
			messageFactory = new MessageFactory();
		this.messageFactory.registerMessage(message);
	}
	
	static MessageManager instance = null;
	
	
	public Message getMessage(String key) {
		return messageFactory.getMessage(key);
	}
	
	public Message getMessage(byte category,byte command,byte packetType, byte messageVersion) {
		String key="";
		key = key + ""+  (category   & 0xff);
		key = key + "_"+ (command    & 0xff);
		key = key + "_"+ (packetType & 0xff);
		key = key + "_"+ (messageVersion &  0xff);
		return getMessage(key);
	}
	
}
