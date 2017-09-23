package platform.communication.messagebus;

import java.util.Map;

import javax.jms.JMSException;

import platform.message.Message;
import platform.util.Field;

public class ATMQEncoder {
	
	public void encode(Field[] fields, Map<String, Object> map, javax.jms.Message message) {
		// TODO Auto-generated method stub
		
			for(Field field : fields) {
				//System.out.println(field.getName() + " -> " + map.get(field.getName()));
				try {
				if (field == null) continue;
				if (field.getType() == null) continue;
				if (field.getName() == null) continue;
				if (map.get(field.getName()) == null) continue;
				if (field.getType().equals("byte")) {
					message.setByteProperty(field.getName(), (Byte)map.get(field.getName()));
				} else if (field.getType().equals("short")) {
					message.setShortProperty(field.getName(), (Short)map.get(field.getName()));
				} else if (field.getType().equals("int")) {
					message.setIntProperty(field.getName(), (Integer)map.get(field.getName()));
				} else if (field.getType().equals("long")) {
					message.setLongProperty(field.getName(), (Long)map.get(field.getName()));
				} else if (field.getType().equals("float")) {
					message.setFloatProperty(field.getName(), (Float)map.get(field.getName()));
				} else if (field.getType().equals("double")) {
					message.setDoubleProperty(field.getName(), (Double)map.get(field.getName()));
				} else if (field.getType().equals("String")) {
					message.setStringProperty(field.getName(), (String)map.get(field.getName()));
				} else if (field.getType().equals("byte[]")) {
					
				} else if (field.getType().equals("int[]")) {
				} else if (field.getType().equals("short[]")) {
				} else if (field.getType().equals("float[]")) {
				}
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
	}
	
	public void encode(javax.jms.Message msg, Message message) {
		try {
			msg.setStringProperty(Message.FIELD_SENDER, message.getSender());
			msg.setStringProperty(Message.FIELD_TARGET, message.getTarget());
			msg.setStringProperty(Message.FIELD_FORWARD_TO, message.getForwardTo());
			msg.setByteProperty(Message.FIELD_COMMAND_ID, message.getCommand());
			msg.setByteProperty(Message.FIELD_CATEGORY_ID, message.getCategory());
			msg.setByteProperty(Message.FIELD_PACKET_TYPE, message.getPacketType());
			msg.setLongProperty(Message.FIELD_SEQUENCE_NUMBER, message.getSequenceNumber());
			msg.setLongProperty(Message.FIELD_MESSAGE_TIME, message.getMessageTime().getTime());
			Map<String, Object> map = message.convertMessageToMap();
			encode(message.getField(), map, msg);
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}
