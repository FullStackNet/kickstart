package platform.protocol.mobd;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Map;

import platform.communication.Session;
import platform.exception.ExceptionEnum;
import platform.log.ApplicationLogger;
import platform.message.Message;
import platform.message.MessageHeader;
import platform.message.MessageManager;
import platform.protocol.Reader;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Field;

public class MOBDReader extends Reader {
	char startchar;
	public MOBDReader(char startChar) {
		super();
		this.startchar = startChar;
	}
	
	public Message data2Message(Session session,MessageManager messageManager, String data) {
		
		String[] tokens = data.split(",");
		int index = 0;
		String header = tokens[index];
		index++;
		String imei = tokens[index];
		if (session.getClientId() == null) {
			session.setClientId(imei);
			session.setReady(true);
			session.setAuthenticated(true);
		}
		index++;
		String commandStr = tokens[index].trim();
		int command = Integer.parseInt(commandStr.substring(1, 3), 16);
		int category =  Integer.parseInt(commandStr.substring(0, 1), 16);
		index++;
		String[] payloads = new String[tokens.length - 4+1];
		for(int i=0 ; i< (payloads.length -1); i++) {
			payloads[i] = tokens[index];
			index++;
		}
		
		String lastToken = tokens[index];
		String[] lastTokens = lastToken.split("\\*");
		payloads[payloads.length-1] = lastTokens[0];
		System.out.println("Data :: " + data);
		System.out.println("Header :: " + header);
		System.out.println("imei :: " + imei);
		System.out.println("Command :: " + command);
		System.out.println("Category :: " + category);
		for(int i=0; i < payloads.length ; i++) {
			System.out.println(i+" :: " + payloads[i]);
		}
		MessageHeader messageHeader = new MessageHeader((byte)category, (byte)command, Message.PACKET_TYPE_RESPONSE);
		Message message = messageManager.getMessage(messageHeader.getCommandKey());
		if (message == null) {
			messageHeader = new MessageHeader((byte)category, (byte)command, (byte)Message.PACKET_TYPE_REQUEST);
			 message = messageManager.getMessage(messageHeader.getCommandKey());
			if (message == null) {
				System.out.println("Invalid Message ...." + messageHeader.getCommandKey());
				return null;
			}
		}
		index = 0;
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("Number of Fields :: "+message.getField().length);
		if (payloads.length !=  message.getField().length) {
			System.out.println("Mismatch in message and paylod count ...." + messageHeader.getCommandKey());
		}
		boolean isEventCommand = false;  
		if (messageHeader.getCommandKey().equals("10_170_1_1")) {
			isEventCommand = true;
			System.out.println("It is T68 Event Command");
		}
		String code = "";
		for(Field field : message.getField()) {
			try {
				
				if (index == payloads.length)
					break;
				System.out.println("Field "+index+":: "+field.getName()+" -> " +payloads[index] +"!!");
				if (isEventCommand) {
							if (field.getName().equalsIgnoreCase("RFID")) {
								System.out.println("It is T68 Event Command");
								continue;
							}
							if (field.getName().equalsIgnoreCase("pitcure")) {
								System.out.println("skipping the picture");
								continue;
							}
							if (field.getName().equalsIgnoreCase("fence")) {
								System.out.println("skipping the fence");
								continue;
							}
				}
				if ((payloads[index] == null) || (payloads[index].equals("")))
				{
					index++;
					continue;
				}

				if (field.getType().equals("byte")) {
					map.put(field.getName(), Byte.parseByte(payloads[index]));
				} else if (field.getType().equals("short")) {
					map.put(field.getName(), Short.parseShort(payloads[index]));
				} else if (field.getType().equals("int")) {
					map.put(field.getName(), Integer.parseInt(payloads[index]));
				} else if (field.getType().equals("long")) {
					map.put(field.getName(), Long.parseLong(payloads[index]));
				} else if (field.getType().equals("float")) {
					map.put(field.getName(), Float.parseFloat(payloads[index]));
				}else if (field.getType().equals("String")) {
					map.put(field.getName(), payloads[index]);
				} else if (field.getType().equals("byte[]")) {
				} else if (field.getType().equals("int[]")) {
				} else if (field.getType().equals("short[]")) {
				} else if (field.getType().equals("float[]")) {
				}
				if (isEventCommand) {
					if (field.getName().equals("code")) {
						code = payloads[index];
						System.out.println("Code is " +code);
					}
				}
				index++;
			} catch(Exception e) {
				e.printStackTrace();
				System.out.println("Parsing value ("+payloads[index]+") for the "+field.getName() + " Failed ");
			}
		}
		message.convertMapToMessage(map);
		return message;
	}
	
	@Override
	public Message read(Session session, Object _handle, MessageManager messageManager) throws ApplicationException {
		// TODO Auto-generated method stub
		DataInputStream handle = (DataInputStream)_handle;
		StringBuffer data  = new StringBuffer();
		int dataLength = 0;
		char ch;
		char lastchar = 0;
		boolean startSignatureFound= false;
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
					throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.PEER_DISCONNECTED, ExceptionEnum.PEER_DISCONNECTED.toString());
				}
				ch = (char) ch_int;
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
				throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.PEER_DISCONNECTED, ExceptionEnum.PEER_DISCONNECTED.toString());
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
				misses++;
				if ((misses < MISSES_ALLOWED) &&  (dataLength > 0)) continue; 
				return null;
			} catch (IOException e) {
				misses++;
				if ((misses < MISSES_ALLOWED) &&  (dataLength > 0)) continue; 
				e.printStackTrace();
				throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.PEER_DISCONNECTED, ExceptionEnum.PEER_DISCONNECTED.toString());
			}
			if ((ch == startchar) && 
					(lastchar == startchar)) {
				ApplicationLogger.debug("Message Signature found .....",this.getClass());
				startSignatureFound = true; 
				dataLength = 0;
				data =new  StringBuffer();
				lastchar = ch;
				continue;
			} 
			if (startSignatureFound) {
				if ((ch == '\n' && 
						(lastchar == '\r'))) {
					ApplicationLogger.debug("Message end found .....",this.getClass());
					return data2Message(session, messageManager, data.toString());
				}
			}
			lastchar = ch;
			data = data.append(ch);
			dataLength++;
			if (dataLength >= MOBDProtocolProvider.MAX_MESSAGE_LENGTH) {
				ApplicationLogger.error("Bad Packet received .....",this.getClass());
				throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.BAD_PACKET, ExceptionEnum.BAD_PACKET.toString());
				
			}
		}
	}

	@Override
	public Message readWrite(Session session, Object handle,
			Object writeHandle, MessageManager messageManager)
			throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}
}
