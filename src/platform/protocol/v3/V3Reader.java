package platform.protocol.v3;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.Map;

import platform.communication.ClientMessageQueue;
import platform.communication.Session;
import platform.log.ApplicationLogger;
import platform.manager.GlobalDataManager;
import platform.message.ControllerPacketCapture;
import platform.message.Message;
import platform.message.MessageHeader;
import platform.message.MessageManager;
import platform.protocol.Reader;
import platform.util.ApplicationConstants;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Util;



public class V3Reader extends Reader {
	Message message;
	String sender;
	String reciever;

	public V3Reader(String sender, String reciever) {
		// TODO Auto-generated constructor stub
		message = null;
		this.sender = sender;
		this.reciever = reciever;
	}

	Message data2Message(Session session,byte[] data,int dataLength,MessageManager messageManager) {
		ControllerPacketCapture packetCaptureMessage = new ControllerPacketCapture();
		if (GlobalDataManager.getInstance().isCapturePacket(""+session.getClientId())) {
			packetCaptureMessage.setController_id(""+session.getClientId());
			packetCaptureMessage.setPacket_type("RECEIVED");
			packetCaptureMessage.setMessage_time(System.currentTimeMillis());
			packetCaptureMessage.setData(Util.getString(data,dataLength));
		}

		Util.dumpLogger("Packet Recieved ", data, dataLength);
		byte[] messageHeader = new byte[V3ProtocolProvider.HEADER_SIZE];
		int i = 0;
		while (i < V3ProtocolProvider.HEADER_SIZE) {
			messageHeader[i] = data[i];
			i++;
		}
		MessageHeader header = new MessageHeader();
		header = V3Decoder.decodeHeader(messageHeader);
		header.dump();
		System.out.println("Data Length : "+data.length+" Header Payload Length :"+header.getPayloadLength()+" dataLength : "+dataLength+ "Const Header Length : "+ V3ProtocolProvider.HEADER_SIZE);
		if ((header.getPayloadLength()) != (dataLength -V3ProtocolProvider.HEADER_SIZE-2)) {
			ApplicationLogger.error("Data Length mismatch",this.getClass());
			Util.dumpLoggerHex("UnKnown"+"::"+sender+"::"+reciever, data, dataLength);
			if (GlobalDataManager.getInstance().isCapturePacket(""+session.getClientId())) {
				ClientMessageQueue.getInstance().addMessage(GlobalDataManager.getInstance().getClientId(),
						ApplicationConstants.APPLICATION_NAME_MANAGER,packetCaptureMessage);
			}
			return null;
		}
		i = 0;
		int packetLength = dataLength -V3ProtocolProvider.HEADER_SIZE;
		byte[] messagePacket = new byte[packetLength];
		while(i <packetLength) {
			messagePacket[i] = data[V3ProtocolProvider.HEADER_SIZE+i];
			i++;
		}
		message = messageManager.getMessage(header.getCommandKey());
		if (message != null) {
			if (GlobalDataManager.getInstance().isCapturePacket(""+session.getClientId())) {
				packetCaptureMessage.setMessage_type(message.getName());
			}
			message.setHeader(header);
			message.setSequenceNumber(header.getSequenceNumber());
			message.setDestinationGateway(header.getDestinationGateway());
			message.setDestinationPort(header.getDestinationPort());
			ApplicationLogger.info("Received message "+ message.getName() + " Serial Number " + message.getSequenceNumber(), this.getClass());
			Map<String, Object> map = V3Decoder.decode(message.getField(), messagePacket);
			message.convertMapToMessage(map);
			message.populateMessageId();
			Util.dumpLoggerHex(message.getName()+"::"+sender+"::"+reciever, data, dataLength);
			ApplicationLogger.info("Recieved Message Dump"+ message.getDump(), this.getClass());
		} else {
			ApplicationLogger.error("Invalid Message recieved  : Key :"+header.getCommandKey()+" data : "+ Util.getData(data), this.getClass());
			Util.dumpLoggerHex(sender+"::"+reciever, data, dataLength);
		}
		if (GlobalDataManager.getInstance().isCapturePacket(""+session.getClientId())) {
			ClientMessageQueue.getInstance().addMessage(GlobalDataManager.getInstance().getClientId(),
					ApplicationConstants.APPLICATION_NAME_MANAGER,packetCaptureMessage);
		}
		return message;
	}

	public Message read(Session session, Object _handle, MessageManager messageManager) throws ApplicationException {
		DataInputStream handle = (DataInputStream)_handle;
		byte[] data;
		byte ch;
		int dataLength = 0;
		byte lastchar = 0;
		message = null;
		boolean startSignatureFound= false;
		data =new byte[V3ProtocolProvider.MAX_MESSAGE_LENGTH];
		int misses = 0;
		final int MISSES_ALLOWED = 5; 
		while (true) {
			try {
				//System.out.println("Waiting someone to talk to me ...");
				int ch_int = handle.read();
				if (ch_int == -1) {
					misses++;
					if ((misses < MISSES_ALLOWED) &&  (dataLength > 0))  {
						try {
							Thread.sleep(200);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						continue; 
					}
					ApplicationLogger.info("Connection closed from peer .....",this.getClass());
					throw new ApplicationException(ExceptionSeverity.ERROR,"SOCKET_CLOSED");
				}
				ch = (byte) ch_int;
			} catch (SocketException e) {
				// TODO Auto-generated catch block
				misses++;
				if ((misses < MISSES_ALLOWED) &&  (dataLength > 0)) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					continue;
				}
				e.printStackTrace();
				ApplicationLogger.info("Connection closed from peer .....",this.getClass());
				throw new ApplicationException(ExceptionSeverity.ERROR,"SOCKET_CLOSED");
			} catch (SocketTimeoutException e) {
				misses++;
				if ((misses < MISSES_ALLOWED) &&  (dataLength > 0))  {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					continue; 
				}
				return null;
			} catch (EOFException e) {
				ApplicationLogger.info("Connection closed from peer .....",this.getClass());
				throw new ApplicationException(ExceptionSeverity.ERROR,"SOCKET_CLOSED");
			} catch (IOException e) {
				misses++;
				if ((misses < MISSES_ALLOWED) &&  (dataLength > 0)) continue; 
				e.printStackTrace();
				return null;
				//return -3;
			}
			if ((ch == V3ProtocolProvider.START_CHAR) && 
					(lastchar == V3ProtocolProvider.START_CHAR)) {
				ApplicationLogger.debug("Message Signature found .....",this.getClass());
				startSignatureFound = true; 
				dataLength = 0;
				data =new byte[V3ProtocolProvider.MAX_MESSAGE_LENGTH];
				lastchar = ch;
				continue;
			} 
			if (startSignatureFound) {
				if ((ch == V3ProtocolProvider.END_CHAR && 
						(lastchar == V3ProtocolProvider.END_CHAR) && (dataLength > V3ProtocolProvider.HEADER_SIZE))) {
					ApplicationLogger.debug("Message end found .....",this.getClass());
					Message _message = data2Message(session, data, dataLength, messageManager);
					if (_message == null)
						//return -2;
						return null;
					return  _message;
					//return 0;
				}
			}
			lastchar = ch;
			data[dataLength] = ch;
			dataLength++;
			if (dataLength >= V3ProtocolProvider.MAX_MESSAGE_LENGTH) {
				ApplicationLogger.error("Bad Packet received .....",this.getClass());
				Util.dumpLoggerHex("Bad Packet", data,dataLength);
				return null;
			}
		}
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	@Override
	public Message readWrite(Session session, Object handle,
			Object writeHandle, MessageManager messageManager)
			throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}
}