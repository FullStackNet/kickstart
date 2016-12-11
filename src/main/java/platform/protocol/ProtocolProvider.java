package platform.protocol;

import platform.message.MessageManager;

public abstract class ProtocolProvider {
	Reader reader;
	Writer writer;
	long sequenceNumber ;
	MessageManager messageManager;
	
	public MessageManager getMessageManager() {
		return messageManager;
	}

	public ProtocolProvider(Reader reader, Writer writer, MessageManager messageManager) {
		this.reader = reader;
		this.writer = writer;
		sequenceNumber = 0;
		this.messageManager = messageManager;
		messageManager = new MessageManager();
	}
	
	
	public abstract ProtocolProvider getClone();
	public Reader getReader() {
		return reader;
	}
	
	public Writer getWriter() {
		return writer;
	}
	
	public long nextSequenceNumber() {
		if (sequenceNumber == 65534) {
			sequenceNumber = 1;
		}
		return sequenceNumber++;
	}
}
