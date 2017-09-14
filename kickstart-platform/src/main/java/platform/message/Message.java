package platform.message;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import platform.communication.Session;
import platform.manager.GlobalDataManager;
import platform.util.Field;
import platform.util.Util;



public abstract class Message implements Cloneable,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String FIELD_COMMAND_ID = "COMMAND_ID";
	public static final String FIELD_CATEGORY_ID = "CATEGORY_ID";
	public static final String FIELD_PACKET_TYPE = "PACKET_TYPE";
	public static final String FIELD_SENDER = "SENDER";
	public static final String FIELD_TARGET = "TARGET";
	public static final String FIELD_FORWARD_TO = "FORWARD_TO";
	public static final String FIELD_SEQUENCE_NUMBER = "SEQUENCE_NUMBER";
	public static final String FIELD_MESSAGE_TIME = "MESSAGE_TIME";
	
	public static int STATUS_UNPROCESSED = 1;
	public static int STATUS_WAIT = 2;
	public static int STATUS_PROCESSED = 3;
	public static byte PACKET_TYPE_REQUEST = 1;
	public static byte PACKET_TYPE_RESPONSE = 2;
	public static long DEFAULT_RESPONSE_TIME = 60*1000L;
	
	private byte category;
	private byte command;
	private byte packetType;
	private byte messageVersion;
	private boolean response;
	
	private MessageHeader header;
	private boolean ackOnly;
	protected long sequenceNumber;
	protected Field[] fields;
	private int status;
	private Message responseMessage;
	private Date sentTime;
	private String externalIdentified;
	
	public ArrayList<String> messageDeviceIdFields;
	public String messageId;
	private Date receivedTime;
	
	public String target;
	public String sender;
	public String forwardTo;
	public short  destinationGateway;
	public short  destinationPort;
	private Date messageTime;
	
	private boolean persistent;
	
	public Message() {
		ackOnly = false;
		messageVersion = 1;
		packetType = 0;
		response = true;
		messageDeviceIdFields = new ArrayList<String>();
		messageId = "";
		messageTime = new Date();
		persistent = false;
	}

	protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
	
	public String getMessageId() {
		return messageId;
	}

	
	
	public boolean isSingleMessage() {
		return false;
	}
	
	public boolean ignoreDuplicateMessage() {
		return false;
	}
	
	public boolean isDuplicate(Message message) {
		return false;
	}
	
	public boolean removeOldDuplicateMessage() {
		return false;
	}
	
	public boolean isResponse() {
		return response;
	}
	
	public void setResponse(boolean enable) {
		response = enable;
	}
	
	public void populateHeader() {
		if (header == null) {
				header = new MessageHeader();
		}
		header.setCommand(getCommand());
		header.setCategory(getCategory());
		header.setPayloadLength((short)getMessageSize());
		header.setMessageVersion(getMessageVersion());
		header.setPacketType(getPacketType());
		header.setRetryCount((byte)0);
		header.setSequenceNumber(getSequenceNumber());
	}
	
	
	abstract public void populate_field();
	
	public Field[] getField() {
		if (fields == null)
			populate_field();
		return fields;
	}
	public boolean isSecurityBitSet() {
		return false;
	}
	
	public boolean isAckOnly() {
		return ackOnly;
	}
	public void setAckOnly(boolean ackOnly) {
		this.ackOnly = ackOnly;
	}
	public byte getMessageVersion() {
		return messageVersion;
	}

	public void addMessageIdField(String fieldName) {
		messageDeviceIdFields.add(fieldName);
	}
	
	public void setMessageVersion(byte messageVersion) {
		this.messageVersion = messageVersion;
	}

	public byte getPacketType() {
		return packetType;
	}

	public void setPacketType(byte packetType) {
		this.packetType = packetType;
	}

	public byte getCategory() {
		return category;
	}

	public void setCategory(byte category) {
		this.category = category;
	}
	
	public byte getCommand() {
		return command;
	}

	public void setCommand(byte command) {
		this.command = command;
	}

	
	//abstract public Map<String, Object> convertMessageToMap();
	public Map<String, Object> convertMessageToMap() {
			return null;
	}
	public void convertMapToMessage(Map<String, Object> map) {
		
	}
	//abstract public void convertMapToMessage(Map<String, Object> map);
	abstract public int getMessageSize() ;
	abstract public Message request_process(Session session,Message parentMessage);
	abstract public void process_aftersent(Session session);
	abstract public void process_response(Session session);
	abstract public void process_timeout(Session session);
	abstract public void process_error(Session session,Message reply);
	public void process_before_send() {
		
	}

	public String getCommandKey() {
		String key = new String();
		key = key + ""+  (category   & 0xff);
		key = key + "_"+ (command    & 0xff);
		key = key + "_"+ (packetType & 0xff);
		key = key + "_"+ (messageVersion &  0xff);
		return key;
	}
	
	public String getAMRCommandKey() {
		String key = new String();
		key = key + ""+  (category   & 0xff);
		key = key + "_"+ (command    & 0xff);
		return key;
	}
	
	public void dump() {
		
	}
	
	public String getDump() {
		return "";
	}
	public String getName() {
		return "Unknown";
	}
	
	public MessageHeader getHeader() {
		if (header == null) {
			header = new MessageHeader();
		}
		return header;
	}
	
	public long getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(long sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public boolean isAuthenticationRequired() {
		return true;
	}
	public Message getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(Message responseMessage) {
		this.responseMessage = responseMessage;
	}
	public Date getSentTime() {
		return sentTime;
	}
	
	public void setSentTime(java.util.Date date) {
		this.sentTime = date;
	}
	public String getExternalIdentified() {
		return externalIdentified;
	}
	public void setExternalIdentified(String externalIdentified) {
		this.externalIdentified = externalIdentified;
	}
	
	public void setHeader(MessageHeader header) {
		this.header = header;
	}
	
	public long getResponseTime() {
		return GlobalDataManager.getInstance().getMessage_response_medium();
	}
	
	public boolean needToSendResponse() {
		return true;
	}
	
	Field getField(String fieldName) {
		for(Field field: fields) {
			if (field.getName().equals(fieldName)) {
				return field;
			}
		}
		return null;
	}
	
	public void populateMessageId() {
		if (fields == null) return;
		Map<String, Object> map = convertMessageToMap();
		messageId = "";
		for(String fieldName: messageDeviceIdFields) {
				Object value = map.get(fieldName);
				Field field = getField(fieldName);
				if (value == null) continue;
				if (field == null) continue;
				if (field.isArray()) {
					if (!messageId.equals("")) {
						messageId = messageId +":";
					}
					messageId = messageId + Util.convertByteToHexString((byte[])value);
				} else {
					messageId = messageId + value;
				}
		}
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}
	
	public Date getReceivedTime() {
		return receivedTime;
	}


	public void setReceivedTime(Date receivedTime) {
		this.receivedTime = receivedTime;
	}
	
	public String getForwardTo() {
		return forwardTo;
	}

	public void setForwardTo(String forwardTo) {
		this.forwardTo = forwardTo;
	}

	public String getPacketFlag() {
		 return null;
	}
	
	public Date getMessageTime() {
		return messageTime;
	}

	public void setMessageTime(Date messageTime) {
		this.messageTime = messageTime;
	}

	public short getDestinationGateway() {
		return destinationGateway;
	}

	public void setDestinationGateway(short destinationGatewayId) {
		this.destinationGateway = destinationGatewayId;
	}

	public short getDestinationPort() {
		return destinationPort;
	}

	public void setDestinationPort(short destinationPort) {
		this.destinationPort = destinationPort;
	}

	public boolean isPersistent() {
		return persistent;
	}

	public void setPersistent(boolean persistent) {
		this.persistent = persistent;
	}
}
