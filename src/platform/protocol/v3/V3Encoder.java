package platform.protocol.v3;
import java.util.Map;

import platform.message.MessageHeader;
import platform.util.Field;
import platform.util.Util;


public class V3Encoder  {
	public static byte[]  encode(Field[] fields, Map<String, Object> map,int messagesize) {
		// TODO Auto-generated method stub
		int index = 0;
		byte[] bytes = new byte[messagesize];
		
		for(Field field : fields) {
			if (field.getType().equals("byte")) {
				Byte val = (Byte) map.get(field.getName());
				if (val != null)
					bytes[index] = val;
				index = index + 1;
			} else if (field.getType().equals("short")) {
				Short val = (Short) map.get(field.getName());
				if (val != null)
					Util.updateShort(bytes, index, val);
				index = index + 2;
			} else if (field.getType().equals("int")) {
				Integer val = (Integer) map.get(field.getName());
				if (val != null)
					Util.updateInt(bytes, index, val);
				index = index + 4;
			} else if (field.getType().equals("long")) {
				Long val = (Long) map.get(field.getName());
				if (val != null)
					Util.updateLong(bytes, index, val);
				index = index + 4;
			} else if (field.getType().equals("String")) {
				String val = (String) map.get(field.getName());
				if (val != null)
					Util.updateString(bytes, index, val,field.getLength());
				index = index + field.getLength();
			} else if (field.getType().equals("byte[]")) {
				 byte[] val = (byte[]) map.get(field.getName());
				if (val != null)
					Util.updateBytes(bytes, index, val);
				index = index + field.getLength();
			} else if (field.getType().equals("int[]")) {
				 int[] val = (int[]) map.get(field.getName());
				if (val != null) {
					for(int i=0;i<val.length;i++) {
						Util.updateInt(bytes, index, val[i]);
						index = index + 4;
					}
				}
			} else if (field.getType().equals("short[]")) {
				 short[] val = (short[]) map.get(field.getName());
				if (val != null) {
					for(int i=0;i<val.length;i++) {
						Util.updateShort(bytes, index, val[i]);
						index = index + 2;
					}
				}
			} else if (field.getType().equals("float[]")) {
				 float[] val = (float[]) map.get(field.getName());
					if (val != null) {
						for(int i=0;i<val.length;i++) {
							Util.updateFloat(bytes, index, val[i]);
							index = index + 4;
						}
					}
			} else if (field.getType().equals("float")) {
				Float val = (Float) map.get(field.getName());
				if (val != null)
					Util.updateFloat(bytes, index, val);
				index = index + 4;
			}
		}
		return bytes;
	}

	public static byte[] encodeHeader(MessageHeader header) {
		// TODO Auto-generated method stub
		//encrypted	1 , Destination Gateway	2 ,Destination Port	2 ,command number	2
		// Packet type	1, command	1, Payload length	1
				
		byte[] bytes = null;
		int index = 0;
		bytes = new byte[V3ProtocolProvider.HEADER_SIZE];
		bytes[index] = header.getEncrypted();
		index++;
		
		Util.updateShortHex(bytes, index, header.getDestinationPort());
		index = index+ 2;

		
		Util.updateByteHex(bytes, index, header.getDay());
		index++;
		
		Util.updateByteHex(bytes, index, header.getMonth());
		index++;
		
		Util.updateByteHex(bytes, index, header.getYear());
		index++;
	
		Util.updateByteHex(bytes, index, header.getHour());
		index++;
	

		Util.updateByteHex(bytes, index, header.getMinute());
		index++;

		Util.updateByteHex(bytes, index, header.getSecond());
		index++;
		
		Util.updateShort(bytes, index, (short)header.getSequenceNumber());
		index = index+ 2;
		
		bytes[index] = header.getPacketType();
		index++;
		
		bytes[index] = header.getCommand();
		index++;

		bytes[index] = (byte)header.getPayloadLength();
		index++;

		return bytes;
	}

}
