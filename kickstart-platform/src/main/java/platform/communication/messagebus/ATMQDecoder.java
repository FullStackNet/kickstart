package platform.communication.messagebus;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.jms.JMSException;

import platform.message.Message;
import platform.message.MessageHeader;
import platform.message.MessageManager;
import platform.util.Field;

public class ATMQDecoder {

	public Map<String, Object> decode(Field[] fields, javax.jms.Message message) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String, Object>();
		for(Field field : fields) {
			try {
				if (field.getType().equals("byte")) {
					if (message.getObjectProperty(field.getName()) != null)
						map.put(field.getName(), message.getByteProperty(field.getName()));
				} else if (field.getType().equals("short")) {
					if (message.getObjectProperty(field.getName()) != null)
						map.put(field.getName(), message.getShortProperty(field.getName()));
				} else if (field.getType().equals("int")) {
					if (message.getObjectProperty(field.getName()) != null)
						map.put(field.getName(), message.getIntProperty(field.getName()));
				} else if (field.getType().equals("long")) {
					if (message.getObjectProperty(field.getName()) != null)
						map.put(field.getName(), message.getLongProperty(field.getName()));
				} else if (field.getType().equals("float")) {
					if (message.getObjectProperty(field.getName()) != null)
						map.put(field.getName(), message.getFloatProperty(field.getName()));
				} else if (field.getType().equals("double")) {
					if (message.getObjectProperty(field.getName()) != null)
						map.put(field.getName(), message.getDoubleProperty(field.getName()));
				} else if (field.getType().equals("String")) {
					if (message.getObjectProperty(field.getName()) != null)
						map.put(field.getName(), message.getStringProperty(field.getName()));
				} else if (field.getType().equals("byte[]")) {

				} else if (field.getType().equals("int[]")) {
				} else if (field.getType().equals("short[]")) {
				} else if (field.getType().equals("float[]")) {
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

		return map;
	}
	public Message decode(javax.jms.Message message, MessageManager messageManager) {
		try {
			byte command = message.getByteProperty(Message.FIELD_COMMAND_ID);
			byte category = message.getByteProperty(Message.FIELD_CATEGORY_ID);
			byte packetType = message.getByteProperty(Message.FIELD_PACKET_TYPE);
			String sender = message.getStringProperty(Message.FIELD_SENDER);
			String target = message.getStringProperty(Message.FIELD_TARGET);
			String forwarTo = message.getStringProperty(Message.FIELD_FORWARD_TO);
			long sequenceNumber = message.getLongProperty(Message.FIELD_SEQUENCE_NUMBER);
			long messageTime = message.getLongProperty(Message.FIELD_MESSAGE_TIME);
			
			MessageHeader header = new MessageHeader(category,command, packetType);
			Message c4tMessage = messageManager.getMessage(header.getCommandKey());
			if (c4tMessage != null) {
				c4tMessage.setSender(sender);
				c4tMessage.setTarget(target);
				if (messageTime > 0) {
					c4tMessage.setMessageTime(new Date(messageTime));
				}
				else 
					c4tMessage.setMessageTime(new Date());
				
				if (forwarTo != null)
					c4tMessage.setForwardTo(forwarTo);
				c4tMessage.setSequenceNumber(sequenceNumber);
				Map<String, Object> map = decode(c4tMessage.getField(), message);
				c4tMessage.convertMapToMessage(map);
				return c4tMessage;
			} else {
				System.out.println("Invalid Message or not registered  ...."+header.getCommandKey());
			}
		} catch (JMSException e) {
			e.printStackTrace();
		}
		return null;
	}
}
