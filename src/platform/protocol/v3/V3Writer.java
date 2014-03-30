package platform.protocol.v3;


import java.io.IOException;
import java.io.PrintStream;

import platform.communication.ClientMessageQueue;
import platform.communication.Session;
import platform.log.ApplicationLogger;
import platform.manager.GlobalDataManager;
import platform.message.ControllerPacketCapture;
import platform.message.Message;
import platform.protocol.Writer;
import platform.util.ApplicationConstants;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Util;

public class V3Writer extends Writer{
	PrintStream handle;
	String sender;
	String reciever;
	
	public V3Writer(String sender,String reciever) {
		// TODO Auto-generated constructor stub
		this.sender = sender;
		this.reciever = reciever;
	}
	
	
	public void  write(Session session, Object _handle, Message message) throws ApplicationException {
		PrintStream handle = (PrintStream)_handle;
		message.populateMessageId();
		byte[] buffer  = getBuffer(message);
		try {
			ControllerPacketCapture packetCaptureMessage = new ControllerPacketCapture();
			if (GlobalDataManager.getInstance().isCapturePacket(""+session.getClientId())) {
				packetCaptureMessage.setController_id(""+session.getClientId());
				packetCaptureMessage.setPacket_type("SENT");
				packetCaptureMessage.setMessage_time(System.currentTimeMillis());
				packetCaptureMessage.setData(Util.getString(buffer,buffer.length));
			}
			handle.write(buffer);
			if (GlobalDataManager.getInstance().isCapturePacket(""+session.getClientId())) {
				ClientMessageQueue.getInstance().addMessage(GlobalDataManager.getInstance().getClientId(),
						ApplicationConstants.APPLICATION_NAME_MANAGER,packetCaptureMessage);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ApplicationException(ExceptionSeverity.ERROR, "SOCKET_WRITE_ERROR");
		}
		Util.dumpLoggerHex(message.getName()+"::"+sender+"::"+reciever+"::"+message.getName()+"::"+message.getMessageId(), buffer, buffer.length);
	}
	
	public byte[]  getBuffer(Message message) {
		byte checksum = 0;
		message.populateHeader();
		byte[] messagePacket = V3Encoder.encode(message.getField(), message.convertMessageToMap(), message.getMessageSize());
		byte[] headerPacket = V3Encoder.encodeHeader(message.getHeader());
		message.dump();
		byte[] buffer = new byte[messagePacket.length+headerPacket.length+2+1+2];
		int index = 0;
		buffer[index] = (byte)V3ProtocolProvider.START_CHAR;
		index++;
		buffer[index] = (byte)V3ProtocolProvider.START_CHAR;
		index++;
		Util.updateBytes(buffer, index, headerPacket);
		index = index + headerPacket.length;
		Util.updateBytes(buffer, index, messagePacket);
		index = index + messagePacket.length;
		buffer[index] = checksum;
		index++;
		buffer[index] = (byte)V3ProtocolProvider.END_CHAR;
		index++;
		buffer[index] = (byte)V3ProtocolProvider.END_CHAR;
		ApplicationLogger.info("Finally Sent message "+ message.getName() + " Serial Number " + message.getSequenceNumber(), this.getClass());
		message.dump();
		return buffer;
	}
	
	public short  getCRC(String file) {
		return 0;
	}
}