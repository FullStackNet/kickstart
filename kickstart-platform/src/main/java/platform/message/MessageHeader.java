package platform.message;


public class MessageHeader {
	byte protocolVersion;
	byte messageVersion;
	byte packetType; 
	byte retryCount; 
	long sequenceNumber ;
	short payloadLength;
	byte category;
	byte command;
	short destinationGateway;
	short destinationPort;
	byte encrypted;
	byte year;
	byte month;
	byte day;
	byte hour;
	byte minute;
	byte second;
	String sessionId;
	
	
	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public MessageHeader() {
		messageVersion = 1;
		protocolVersion = 1;
		retryCount = 0;
	}
	
	public MessageHeader(byte category, byte command,byte packetType) {
		this();
		this.command = command;
		this.category = category;
		this.packetType = packetType;
	}
	
	public byte getRetryCount() {
		return retryCount;
	}

	public void setRetryCount(byte retryCount) {
		this.retryCount = retryCount;
	}
	
	public byte getProtocolVersion() {
		return protocolVersion;
	}
	
	public void setProtocolVersion(byte protocolVersion) {
		this.protocolVersion = protocolVersion;
	}
	
	public long getSequenceNumber() {
		return sequenceNumber;
	}
	
	public void setSequenceNumber(long sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	
	
	public void setPayloadLength(short payloadLength) {
		this.payloadLength = payloadLength;
	}

	public byte getMessageVersion() {
		return messageVersion;
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

	
	public short getPayloadLength() {
		return payloadLength;
	}

	public void setPayloadLength(Short payloadLength) {
		this.payloadLength = payloadLength;
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

	
	
	public void dump() {
		System.out.println("\nHeader dump :");
		System.out.println("\t Protocol Version :" + protocolVersion);
		System.out.println("\t Message Version :" + messageVersion);
		System.out.println("\t PacketType :" + packetType);
		System.out.println("\t RetryCount :" + retryCount);
		System.out.println("\t sequenceNumber :" + sequenceNumber);
		System.out.println("\t Payload Length :" + payloadLength);
		System.out.println("\t Category :" + category);
		System.out.println("\t Command :" + command);
		System.out.println("\t Destination Port :" + destinationPort);
		System.out.println("\t Destination Gateway :" + destinationGateway);
		System.out.println("\t Year :" + year);
		System.out.println("\t Month :" + month);
		System.out.println("\t Day :" + day);
		System.out.println("\t Hours :" + hour);
		System.out.println("\t Minute :" + minute);
		System.out.println("\t Second :" + second);
		System.out.println("\n\n");
	}
	
	
	public String getCommandKey() {
		String key = new String();
		key = key + ""+  (category   & 0xff);
		key = key + "_"+ (command    & 0xff);
		key = key + "_"+ (packetType & 0xff);
		key = key + "_"+ (messageVersion &  0xff);
		return key;
	}

	public short getDestinationPort() {
		return destinationPort;
	}

	public void setDestinationPort(short destinationPort) {
		this.destinationPort = destinationPort;
	}

	public byte getEncrypted() {
		return encrypted;
	}

	public void setEncrypted(byte encrypted) {
		this.encrypted = encrypted;
	}

	public short getDestinationGateway() {
		return destinationGateway;
	}

	public void setDestinationGateway(short destinationGateway) {
		this.destinationGateway = destinationGateway;
	}

	public byte getYear() {
		return year;
	}

	public void setYear(byte year) {
		this.year = year;
	}

	public byte getMonth() {
		return month;
	}

	public void setMonth(byte month) {
		this.month = month;
	}

	public byte getDay() {
		return day;
	}

	public void setDay(byte day) {
		this.day = day;
	}

	public byte getHour() {
		return hour;
	}

	public void setHour(byte hh) {
		this.hour = hh;
	}

	public byte getMinute() {
		return minute;
	}

	public void setMinute(byte mm) {
		this.minute = mm;
	}

	public byte getSecond() {
		return second;
	}

	public void setSecond(byte ss) {
		this.second = ss;
	}
}
