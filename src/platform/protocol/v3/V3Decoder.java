package platform.protocol.v3;

import java.util.HashMap;
import java.util.Map;

import platform.message.MessageHeader;
import platform.util.Field;
import platform.util.Util;


public class V3Decoder {

	public static Map<String, Object> decode(Field[] fields, byte[] bytes) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String, Object>();
		int index = 0;
		for(Field field : fields) {
			if (field.getType().equals("byte")) {
				map.put(field.getName(), bytes[index]);
				index = index + 1;
			} else if (field.getType().equals("short")) {
				short val = Util.getShort(bytes, index);
				map.put(field.getName(), val);
				index = index + 2;
			} else if (field.getType().equals("int")) {
				int val = Util.getInt(bytes, index);
				map.put(field.getName(), val);
				index = index + 4;
			} else if (field.getType().equals("long")) {
				long val = Util.getLong(bytes, index);
				map.put(field.getName(), val);
				index = index + 4;
			} else if (field.getType().equals("float")) {
				float val = Util.getFloat(bytes, index);
				map.put(field.getName(), val);
				index = index + 4;
			} else if (field.getType().equals("double")) {
				double val = Util.getIntDoubleHex(bytes, index);
				map.put(field.getName(), val);
				index = index + 4;
			} else if (field.getType().equals("String")) {
				String val = Util.getString(bytes, index, field.getLength());
				map.put(field.getName(), val);
				index = index + field.getLength();
			} else if (field.getType().equals("byte[]")) {
				byte[] val = Util.getBytes(bytes, index, field.getLength());
				map.put(field.getName(), val);
				index = index + field.getLength();
			} else if (field.getType().equals("int[]")) {
				int[] val = new int[field.getLength()];
				for(int i=0; i < field.getLength(); i++) {
					val[i] = Util.getIntHex(bytes, index);
					index = index + 4;
				}
				map.put(field.getName(), val);
			} else if (field.getType().equals("short[]")) {
				short[] val = new short[field.getLength()];
				for(int i=0; i < field.getLength(); i++) {
					val[i] = Util.getShort(bytes, index);
					index = index + 2;
				}
				map.put(field.getName(), val);
			} else if (field.getType().equals("float[]")) {
				float[] val = new float[field.getLength()];
				for(int i=0; i < field.getLength(); i++) {
					val[i] = Util.getShortFloatHex(bytes, index);
					index = index + 4;
				}
				map.put(field.getName(), val);
			}
		}
		return map;
	}



	public static MessageHeader decodeHeader(byte[] bytes) {
		// TODO Auto-generated method stub
		//encrypted	1 , Destination Gateway	2 ,Destination Port	2 ,command number	2
		// Packet type	1, command	1, Payload length	1
		
		MessageHeader header = new MessageHeader();
		int index = 0;
		header.setEncrypted(bytes[index]);
		index++;
		
		header.setDestinationPort(Util.getShortHex(bytes, index));
		index = index + 2;
		
		header.setDay(Util.getByteHex(bytes,index));
		index = index + 1;
		
		header.setMonth(Util.getByteHex(bytes,index));
		index = index + 1;
		
		header.setYear(Util.getByteHex(bytes,index));
		index = index + 1;
		
		header.setHour(Util.getByteHex(bytes,index));
		index = index + 1;
		
		header.setMinute(Util.getByteHex(bytes,index));
		index = index + 1;
	
		header.setSecond(Util.getByteHex(bytes,index));
		index = index + 1;
		
		header.setSequenceNumber(Util.getShort(bytes, index));
		index = index + 2;
		
		header.setPacketType(bytes[index]);
		index++;

		header.setCategory((byte)0);
		
		header.setCommand(bytes[index]);
		index++;
		
		header.setPayloadLength(bytes[index]);
		index++;
		
		return header;
	}

}
