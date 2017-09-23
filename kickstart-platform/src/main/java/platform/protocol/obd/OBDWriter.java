package platform.protocol.obd;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Map;

import platform.communication.Session;
import platform.exception.ExceptionEnum;
import platform.message.Message;
import platform.protocol.Writer;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Field;

public class OBDWriter extends Writer {

	char startchar;
	public OBDWriter(char startChar) {
		this.startchar = startChar;
	}
	
	public String getCheckSum(String data) {
		byte bytes[] = data.getBytes();
		short checksum = 0;
		for(int i=0; i < bytes.length; i++) {
			checksum = (short) (checksum + bytes[i]);
		}
		System.out.println(checksum);
		String hexString = Integer.toString(checksum, 16);
		System.out.println(hexString);
		return hexString.substring(hexString.length()-2, hexString.length()).toUpperCase();
	}
	
	public String getPacket(Session session,Message message) {
		StringBuffer data = new StringBuffer();
		data.append(startchar);
		data.append(startchar);
		
		StringBuffer payload = new StringBuffer();
		payload.append(","+session.getClientId());
		payload.append(",");
		if (message.getCategory() < 16) {
			payload.append("0"+Integer.toHexString(message.getCategory()).toUpperCase());
		} else {
			payload.append(Integer.toHexString(message.getCategory()).toUpperCase());
		}
		if (message.getCommand() < 16) {
			payload.append("0"+Integer.toHexString(message.getCommand()).toUpperCase());
		} else {
			payload.append(Integer.toHexString(message.getCommand()).toUpperCase());
		}
		for(Field field : message.getField()) {
			payload.append(",");
			Map<String, Object> map = message.convertMessageToMap();
			if (map.get(field.getName()) != null) {
				Object value = map.get(field.getName());
				payload.append(value.toString());
			} else {
				payload.append("");
			}
		}
		data.append(message.getPacketFlag()+(payload.length()+5));
		data.append(payload.toString());
		data.append("*");
		String checkSum = getCheckSum(data.toString());
		//data.getBytes();
		data.append(checkSum);
		data.append('\r');
		data.append('\n');
		return data.toString();
	}
	@Override
	public void write(Session session, Object _handle, Message message) throws ApplicationException {
		// TODO Auto-generated method stub
		
		PrintStream handle = (PrintStream)_handle;
		String data = getPacket(session, message);
		try {
			handle.write(data.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ApplicationException(ExceptionSeverity.ERROR,ExceptionEnum.WRITE_FAILED);
		}
	}

}
