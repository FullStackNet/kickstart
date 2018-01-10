package platform.util;

import com.eaio.uuid.UUID;
import platform.log.ApplicationLogger;
import platform.resource.c4t_object;

import java.io.*;
import java.math.BigInteger;
import java.net.NetworkInterface;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;

public class Util {
	public static Long uniqueNumber = new Long(0);


	public static double getLimitedDouble(double number, int maxDigitsAfterDecimal) {
		int multiplier = (int) Math.pow(10, maxDigitsAfterDecimal);
		double truncated = (double) ((long) ((number) * multiplier)) / multiplier;
		return truncated;
	}
	public static void pause(long mSecs) {
		try {
			Thread.sleep(mSecs);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String getFin_year(int month, int year) {
		if (month < 4) {
			return "" + (year - 1) + "-" + year;
		} else {
			return "" + year + "-" + (year + 1);
		}
	}

	private static final Random generator = new Random();

	public static long nextNumber() {
		synchronized (uniqueNumber) {
			if (uniqueNumber == 99) {
				uniqueNumber = new Long(0);
			}
			return ++uniqueNumber;
		}
	}
	public static byte[] getByte(short data) {
		byte[] packet = new byte[2];
		packet[0] = (byte) (data & 0xff);
		packet[1] = (byte) ((data >> 8) & 0xff);
		return packet;
	}

	public static void updateShort(byte[] packet, int index, short data) {
		packet[index] = (byte) (data & 0xff);
		packet[index + 1] = (byte) ((data >> 8) & 0xff);
	}

	public static void updateByteHex(byte[] packet, int index, short data) {
		String str = ""+data;
		data = Byte.parseByte(str, 16);
		packet[index] = (byte) ((data) & 0xff);
	}

	public static void updateShortHex(byte[] packet, int index, short data) {
		String str = ""+data;
		data = Short.parseShort(str, 16);
		packet[index + 1] = (byte) (data & 0xff);
		packet[index] = (byte) ((data >> 8) & 0xff);
	}

	public static void updateInt(byte[] packet, int index, int data) {
		packet[index] = (byte) (data & 0xff);
		packet[index + 1] = (byte) ((data >> 8) & 0xff);
		packet[index + 2] = (byte) ((data >> 16) & 0xff);
		packet[index + 3] = (byte) ((data >> 24) & 0xff);
	}

	public static void updateIntHex(byte[] packet, int index, int data) {
		String str = ""+data;
		data = Integer.parseInt(str, 16);
		packet[index + 3] = (byte) (data & 0xff);
		packet[index + 2] = (byte) ((data >> 8) & 0xff);
		packet[index + 1] = (byte) ((data >> 16) & 0xff);
		packet[index] = (byte) ((data >> 24) & 0xff);
	}

	public static void updateLong(byte[] packet, int index, long data) {
		packet[index] = (byte) (data & 0xff);
		packet[index + 1] = (byte) ((data >> 8) & 0xff);
		packet[index + 2] = (byte) ((data >> 16) & 0xff);
		packet[index + 3] = (byte) ((data >> 24) & 0xff);
	}

	public static void updateLongHex(byte[] packet, int index, long data) {
		String str = ""+data;
		data = Long.parseLong(str, 16);
		packet[index + 3] = (byte) (data & 0xff);
		packet[index + 2] = (byte) ((data >> 8) & 0xff);
		packet[index + 1] = (byte) ((data >> 16) & 0xff);
		packet[index] = (byte) ((data >> 24) & 0xff);
	}

	public static void updateString(byte[] packet, int index, String data,
									int maxLength) {
		int i = 0;
		if (data != null) {
			byte[] byteData = data.getBytes();
			int dataLength = data.length();
			while ((i < maxLength) && (i < dataLength)) {
				packet[index + i] = (byte) byteData[i];
				i++;
			}
		}
		while (i < maxLength) {
			packet[index + i] = (byte) 0;
			i++;
		}
	}


	public static void updateBytes(byte[] packet, int index, byte[] data) {
		int i = 0;
		int dataLength = data.length;
		while (i < dataLength) {
			packet[index + i] = (byte) data[i];
			i++;
		}
	}

	public static boolean isDataSyncNeed(c4t_object _community) {
		if (_community == null)
			return false;

		if (Util.isEmpty(_community.getServer_url())) {
			return false;
		}
		if (Util.isEmpty(_community.getAuthentication_server_url())) {
			return false;
		}
		if (!_community.getServer_url().equals(_community.getAuthentication_server_url())) {
			return true;
		}
		return false;
	}

	public static short getShort(byte[] packet, int index) {
		int data;
		data = (int) (packet[index + 1] & 0xff);
		data = (data << 8);
		data = (data | (packet[index] & 0xff));
		System.out.println(data);
		return (short) data;
	}
	public static short getReverseShort(byte[] packet, int index) {
		int data;
		data = (short) (packet[index] & 0xff);
		data = (data << 8);
		data = (data | (packet[index+1] & 0xff));
		return (short) data;
	}

	public static short getShortHex(byte[] packet, int index) {
		String str = HexUtils.hexString(packet[index]) + HexUtils.hexString(packet[index+1]);
		return Short.parseShort(str);
	}

	public static byte getByteHex(byte[] packet, int index) {
		String str = HexUtils.hexString(packet[index]);
		return Byte.parseByte(str);
	}


	public static float getShortFloatHex(byte[] packet, int index) {
		Double value = 0.0;
		Byte decimalValue =  Byte.parseByte(HexUtils.hexString(packet[index]));
		Byte fractionValue =  Byte.parseByte(HexUtils.hexString(packet[index+1]));
		value = decimalValue + fractionValue/100.0;
		return value.floatValue();
	}

	public static int getInt(byte[] packet, int index) {
		int data;
		int temp;

		temp = (int) (packet[index + 3] & 0xff);
		temp = (int) (temp << 24);
		data = temp;

		temp = (int) (packet[index + 2] & 0xff);
		temp = (int) (temp << 16);
		data = temp | data;

		temp = (int) (packet[index + 1] & 0xff);
		temp = (int) (temp << 8);
		data = temp | data;

		temp = (int) (packet[index] & 0xff);

		data = (int) (data | temp);

		return data;
	}

	public static double getIntDoubleHex(byte[] packet, int index) {
		double value = 0.0;
		short decimalValue =  Short.parseShort(HexUtils.hexString(packet[index])+ HexUtils.hexString(packet[index+1]));
		short fractionValue =  Short.parseShort(HexUtils.hexString(packet[index+2])+HexUtils.hexString(packet[index+3]));
		value = decimalValue + (fractionValue/10000.0);
		return value;
	}


	public static int getIntHex(byte[] packet, int index) {
		String str = HexUtils.hexString(packet[index]) + HexUtils.hexString(packet[index+1]) +  HexUtils.hexString(packet[index+2]) +  HexUtils.hexString(packet[index+3]);
		return Integer.parseInt(str);
	}

	public static long getLong(byte[] packet, int index) {
		long data;
		long temp;

		temp = (int) (packet[index + 3] & 0xff);
		temp = (int) (temp << 24);
		data = temp;

		temp = (int) (packet[index + 2] & 0xff);
		temp = (int) (temp << 16);
		data = temp | data;

		temp = (int) (packet[index + 1] & 0xff);
		temp = (int) (temp << 8);
		data = temp | data;

		temp = (int) (packet[index] & 0xff);

		data = (int) (data | temp);

		return data;
	}

	public static long getReverseLong(byte[] packet, int index) {
		long data;
		long temp;

		temp = (int) (packet[index] & 0xff);
		temp = (int) (temp << 24);
		data = temp;

		temp = (int) (packet[index + 1] & 0xff);
		temp = (int) (temp << 16);
		data = temp | data;

		temp = (int) (packet[index + 2] & 0xff);
		temp = (int) (temp << 8);
		data = temp | data;

		temp = (int) (packet[index+3] & 0xff);

		data = (int) (data | temp);

		return data;
	}

	public static long getLongHex(byte[] packet, int index) {
		String str = HexUtils.hexString(packet[index]) + HexUtils.hexString(packet[index+1]) +  HexUtils.hexString(packet[index+2]) +  HexUtils.hexString(packet[index+3]);
		return Long.parseLong(str);

	}



	public static byte dec2Hex(byte data) {
		byte decData = 0;
		String hexString = "";
		if (((Integer.toHexString(0xFF & data).toUpperCase().length()) < 2) && (data < 16)) {
			hexString = hexString + "0";
		}
		hexString = hexString
				+ Integer.toHexString(0xFF & data).toUpperCase();

		decData = Byte.parseByte(hexString);
		return decData;
	}


	public static String hexString(byte data) {
		String hexString = "";
		if (((Integer.toHexString(0xFF & data).toUpperCase().length()) < 2) && (data < 16)) {
			hexString = hexString + "0";
		}
		hexString = hexString
				+ Integer.toHexString(0xFF & data).toUpperCase();

		return hexString;
	}

	public static float getFloat(byte[] packet, int index) {
		String myString = "";
		for(int i=0; i < 4; i++) {
			if (((Integer.toHexString(0xFF & packet[index+i]).toUpperCase().length()) < 2) && (packet[index+i] < 16)) {
				myString = myString + "0";
			}
			myString = myString + Integer.toHexString(0xFF & packet[index+i]).toUpperCase();
		}
		Integer i = Integer.parseInt(myString, 16);
		Float f = Float.intBitsToFloat(i.intValue());
		return  f.floatValue();
	}

	public static void updateFloat(byte[] packet, int index, float value) {
		int int_value  = Float.floatToIntBits(value);
		String hexString = Integer.toHexString(int_value);
		int len = hexString.length();
		while (len < 8) {
			hexString = "0"+hexString;
			len++;
		}
		int i = 0;
		String str = hexString.substring(0, 2);
		byte val_byte = (byte)Integer.parseInt(str,16);
		packet[index+i] = val_byte;
		i++;
		str = hexString.substring(2, 4);
		val_byte = (byte)Integer.parseInt(str,16);
		packet[index+i] = val_byte;
		i++;

		str = hexString.substring(4, 6);
		val_byte = (byte)Integer.parseInt(str,16);
		packet[index+i] = val_byte;
		i++;

		str = hexString.substring(6, 8);
		val_byte = (byte)Integer.parseInt(str,16);
		packet[index+i] = val_byte;
		i++;
	}

	public static int getReading(byte[] packet, int index) {
		int data = 0;

		byte val = dec2Hex(packet[index]);
		data = val;
		val = dec2Hex(packet[index+1]);
		data =  val*100+data;

		val = dec2Hex(packet[index+2]);
		data =  val*10000+data;
		return data;
	}


	public static String getString(byte[] packet, int index, int length) {
		String data = new String();
		int i = 0;
		while (i < length) {
			if (packet[index + i] == 0) break;
			data = data + (char) packet[index + i];
			i++;
		}
		return data;
	}

	public static byte[] getBytes(byte[] packet, int index, int length) {
		byte[] data = new byte[length];
		int i = 0;


		while (i < length) {
			data[i] = packet[index + i];
			i++;
		}
		return data;
	}

	public static void appendByte(byte[] data, byte[] dataToAppend) {

	}

	public static void copyByte(byte[] data, byte[] dataToAppend, int startIndex) {

	}


	public static void dump(String title, byte[] data) {
		System.out.print(title + " ---> ");
		int i = 0;
		while (i < data.length) {
			System.out.print((int)(data[i]& 0xFF) + " ");
			i++;
		}
		System.out.print("\n");
	}

	public static void dumpLogger(String title, byte[] data,int length) {
		String str  = title + " ---> ";
		int i = 0;
		while (i < length) {
			str  = str + (int)(data[i]& 0xFF) + " ";
			i++;
		}
		ApplicationLogger.info(str, Util.class);
	}

	public static void dumpLoggerHex(String title, byte[] data,int length) {
		String str  = title + " ---> ";
		int i = 0;
		while (i < length) {
			str  = str + hexString((byte)(data[i]& 0xFF)) + " ";
			i++;
		}
		ApplicationLogger.info(str, Util.class);
	}

	public static void dumpLogger(String title, byte[] data) {
		String str  = title + " ---> ";
		int i = 0;
		while (i < data.length) {
			str  = str + (int)(data[i]& 0xFF) + " ";
			i++;
		}
		ApplicationLogger.info(str, Util.class);
	}
	public static String getString(byte[] data) {
		String str = "";
		int i = 0;
		while (i < data.length) {
			str = str + (int) (data[i]& 0xFF) + " ";
			i++;
		}
		return str;
	}

	public static String getString(byte[] data,int len) {
		String str = "";
		int i = 0;
		while (i < len) {
			if ((char)(data[i]& 0xFF) == 0) {
				return str;
			}
			str = str + (char)(data[i]& 0xFF);
			i++;
		}
		return str;
	}

	public static String getData(byte[] data) {
		String str = "";
		int i = 0;
		while (i < data.length) {
			str = str + (int) data[i];
			i++;
		}
		return str;
	}

	public static void dump(String title, char[] data) {
		byte[] byteData = new byte[data.length];
		int i = 0;
		while (i < data.length) {
			byteData[i] = (byte) data[i];
			i++;
		}
		dump(title, byteData);
		byteData = null;
	}

	public static boolean parseBoolean(String value, boolean defaultVal) {
		try {
			return Boolean.parseBoolean(value);
		} catch (Exception ex) {
			return defaultVal;
		}
	}

	/**
	 *
	 * @param value
	 * @param defaultVal
	 * @return
	 */
	public static int parseInt(String value, int defaultVal) {
		try {
			return Integer.parseInt(value);
		} catch (Exception ex) {
			return defaultVal;
		}
	}

	/**
	 *
	 * @param value
	 * @param defaultVal
	 * @return
	 */
	public static long parseLong(String value, long defaultVal) {
		try {
			return Long.parseLong(value);
		} catch (Exception ex) {
			return defaultVal;
		}
	}

	/**
	 *
	 * @param value
	 * @param defaultVal
	 * @return
	 */
	public static double parseDouble(String value, double defaultVal) {
		try {
			return Double.parseDouble(value);
		} catch (Exception ex) {
			return defaultVal;
		}
	}

	public static String getUniqueId() {
		UUID uuid = null;
		uuid = new UUID();
		return "" + uuid +"-"+nextNumber();
	}

	public static String convertByteToHexString(byte[] bytes) {
		String hexString = "";
		boolean first = true;
		for (int i = 0; i < bytes.length; i++) {
			if (!first)
				hexString = hexString + "-";
			first = false;
			if (((Integer.toHexString(0xFF & bytes[i]).toUpperCase().length()) < 2) && (bytes[i] < 16)) {
				hexString = hexString + "0";
			}
			hexString = hexString
					+ Integer.toHexString(0xFF & bytes[i]).toUpperCase();
		}
		return hexString;
	}

	public static String base48Encode(Long no) {
		Double num = Double.valueOf(no);
		String charSet = "23456789abcdefghijkmnpqrstuvwxyzABCDEFGHIJKLMNPQRSTUVWXYZ";
		Integer length = charSet.length();
		String encodeString = new String();
		while(num > length) {
			encodeString = charSet.charAt(num.intValue() % length)+encodeString;
			num = Math.ceil(new Double(num / length) - 1) ;
		}
		encodeString = charSet.charAt(num.intValue())+encodeString;

		return encodeString;
	}

	public static byte[] convertHexToByte(String hexString) {
		if (hexString == null) return null;
		String[] byteStrings = hexString.split("-");
		byte[] bytes = new byte[byteStrings.length];
		for (int i = 0; i < byteStrings.length; i++) {
			String token = byteStrings[i];
			bytes[i] = (byte) Integer.parseInt(token, 16);
		}
		return bytes;
	}

	public static byte[] convertStringIPToBytes(String string) {
		byte[] bytes = new byte[4];
		for (int i = 0; i < 4; i++) {
			bytes[i] = 0;
		}
		if (string == null) return bytes;
		String[] byteStrings = string.split("\\.");
		for (int i = 0; i < byteStrings.length && i < 4; i++) {
			String token = byteStrings[i];
			bytes[i] = (byte) Integer.parseInt(token);
		}
		return bytes;
	}

	public static String readFileFromLocal(String template,
										   Map<String, String> params) {
		return readFileFromLocal(template, params,"html");
	}

	public static String readFileFromLocal(String template,
										   Map<String, String> params,String extension) {
		String messageWithTokens = "";
		String currentdir = System.getProperty("user.dir");
		if (currentdir == null) {
			currentdir = ".";
		}
		try {
			String file = currentdir
					+ File.separator + "conf" + File.separator
					+ "mail_templates" + File.separator + template + "."+extension;
			FileInputStream fstream = new FileInputStream(file);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while ((strLine = br.readLine()) != null) {
				messageWithTokens = messageWithTokens + strLine;
			}
			br.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
		if (params != null) {
			for (Map.Entry<String, String> param : params.entrySet()) {
				String value = param.getValue();
				String key = "!!!"+param.getKey()+"!!!";
				messageWithTokens = messageWithTokens.replaceAll(key, value);
			}
		}
		return messageWithTokens;
	}

	public static String readPrintFormat(String template,
										 Map<String, String> params) {
		String messageWithTokens = "";
		String currentdir = System.getProperty("user.dir");
		if (currentdir == null) {
			currentdir = ".";
		}
		try {
			String file = currentdir
					+ File.separator + "conf" + File.separator
					+ "templates" + File.separator + template + ".fmt";
			FileInputStream fstream = new FileInputStream(file);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while ((strLine = br.readLine()) != null) {
				messageWithTokens = messageWithTokens + strLine+"\r\n";
			}
			br.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
		if (params != null) {
			for (Map.Entry<String, String> param : params.entrySet()) {
				String value = param.getValue();
				String key = "!!!"+param.getKey()+"!!!";
				messageWithTokens = messageWithTokens.replaceAll(key, value);
			}
		}
		return messageWithTokens;
	}

	// if the directory does not exist, create it
	public static boolean createFolder(String path) {
		File theDir = new File(path);
		if (!theDir.exists()) {
			try{
				theDir.mkdir();
				return true;
			}
			catch(SecurityException se){

			}
		}
		return false;
	}

	public static String readSMSFileFromLocal(String template,
											  Map<String, String> params) {
		String messageWithTokens = "";
		String currentdir = System.getProperty("user.dir");
		if (currentdir == null) {
			currentdir = ".";
		}
		try {
			String file = currentdir
					+ File.separator + "conf" + File.separator
					+ "sms_templates" + File.separator + template + ".html";
			FileInputStream fstream = new FileInputStream(file);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while ((strLine = br.readLine()) != null) {
				messageWithTokens = messageWithTokens + strLine;
			}
			br.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
		if (params != null) {
			for (Map.Entry<String, String> param : params.entrySet()) {
				String value = param.getValue();
				String key = "!!!"+param.getKey()+"!!!";
				messageWithTokens = messageWithTokens.replaceAll(key, value);
			}
		}
		return messageWithTokens;
	}

	public static String readTempleteFileFromLocal(String template,
												   Map<String, String> params) {
		String text = "";
		String directory = "context/root/templete/";
		try {
			String file = directory+template + ".html";
			File _file = new File(file);
			if (!_file.exists()) {
				directory = "templete/";
				file = directory+template + ".html";
			}
			FileInputStream fstream = new FileInputStream(file);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while ((strLine = br.readLine()) != null) {
				text = text + strLine+"\n";
			}
			br.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
		if ((params != null) && !Util.isEmpty(text)) {
			for (Map.Entry<String, String> param : params.entrySet()) {
				String value = param.getValue();
				if (Util.isEmpty(param.getKey()))
					continue;
				String key = "!!!"+param.getKey()+"!!!";
				if (!Util.isEmpty(value))
					text = text.replaceAll(key, value);
				else {
					text = text.replaceAll(key, "");
				}
			}
		}
		return text;
	}

	public static String readTempleteFileFromLocal(File file,
												   Map<String, String> params) {
		String text = "";
		try {
			FileInputStream fstream = new FileInputStream(file);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while ((strLine = br.readLine()) != null) {
				text = text + strLine+"\n";
			}
			br.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
		if ((params != null) && !Util.isEmpty(text)) {
			for (Map.Entry<String, String> param : params.entrySet()) {
				String value = param.getValue();
				if (Util.isEmpty(param.getKey()))
					continue;
				String key = "!!!"+param.getKey()+"!!!";
				if (!Util.isEmpty(value))
					text = text.replaceAll(key, value);
				else {
					text = text.replaceAll(key, "");
				}
			}
		}
		return text;
	}

	public static String readNotificationFileFromLocal(String template,
													   Map<String, String> params) {
		String messageWithTokens = "";
		String currentdir = System.getProperty("user.dir");
		if (currentdir == null) {
			currentdir = ".";
		}
		try {
			String file = currentdir
					+ File.separator + "conf" + File.separator
					+ "notification_templates" + File.separator + template + ".html";
			FileInputStream fstream = new FileInputStream(file);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while ((strLine = br.readLine()) != null) {
				messageWithTokens = messageWithTokens + strLine;
			}
			br.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
		if (params != null) {
			for (Map.Entry<String, String> param : params.entrySet()) {
				String value = param.getValue();
				String key = "!!!"+param.getKey()+"!!!";
				messageWithTokens = messageWithTokens.replaceAll(key, value);
			}
		}
		return messageWithTokens;
	}
	public static  boolean isHex (String in) {
		boolean ret = false;
		try {
			Integer.parseInt(in, 16);
			ret = true;
		} catch (NumberFormatException e) {
			ret = false;
		}
		return (ret);
	}

	public static boolean isValidAMRId(String amrId) {
		String[] tokens = amrId.split("-");
		if (tokens.length != 6) {
			return false;
		}
		for(String token : tokens) {
			if (!isHex(token)) {
				return false;
			}
		}
		return true;
	}

	public static  boolean isValidHanId(String amrId) {
		String[] tokens = amrId.split("-");
		if (tokens.length != 6) {
			return false;
		}
		for(String token : tokens) {
			if (!isHex(token)) {
				return false;
			}
		}
		return true;
	}

	public static void copyFile(String srFile, String dtFile) throws IOException {
		File f1 = new File(srFile);
		File f2 = new File(dtFile);
		InputStream in = new FileInputStream(f1);
		OutputStream out = new FileOutputStream(f2);
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) > 0){
			out.write(buf, 0, len);
		}
		in.close();
		out.close();
	}

	public static String getReplicaFileName() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy",Locale.US);
		String y = sdf.format(d);
		sdf = new SimpleDateFormat("MM",Locale.US);
		String month = sdf.format(d);
		sdf = new SimpleDateFormat("dd", Locale.US);
		String day = sdf.format(d);
		sdf = new SimpleDateFormat("mm",Locale.US);
		String m = sdf.format(d);
		sdf = new SimpleDateFormat("HH",Locale.US);
		String h = sdf.format(d);
		return y+"-"+month+"-"+day+"-"+h+"-"+ m;
	}

	public static int getInt(byte inputValue) {
		int val = ((int)inputValue & 0xFF);
		return val;
	}

	public static int getInt(short inputValue) {
		int val = ((int)inputValue & 0xFFFF);
		return val;
	}

	public static boolean isUnspecified(Object object) {
		if (object == null) return true;
		if (object.toString().length() == 0) return true;
		return false;
	}

	public static long currentTimeMS() {
		return System.currentTimeMillis();
	}


	public static long getTimeElapsed(Date startTime) {
		Date endTime= new Date();
		return endTime.getTime()-startTime.getTime();
	}


	public static String formatTime(long msec) {
		long second = msec/1000L;
		long min = 0;
		long hrs = 0;
		long day = 0;
		String str ="";
		if (second > 60) {
			min = second/60L;
			second = second % 60;
		}
		if (min > 60) {
			hrs = min/60L;
			min = min % 60;
		}
		if (hrs > 24) {
			day = hrs/24L;
			hrs = hrs % 24;
		}

		if (day > 0) {
			str = str+day+" days ";
		}

		if (hrs > 0) {
			str = str+hrs+" hrs ";
		}
		if (min > 0) {
			str = str+min+" mins ";
		}
		if (second > 0) {
			str = str+second+" secs ";
		}
		return str;
	}

	public static byte[] getBroadCastDICId() {
		byte[] dicId = {9,9,9,9,9,9,9,9,9,9};
		return dicId;
	}

	public static boolean isBroadCastDICId(String dicId) {
		String broadcardDICId = convertByteToHexString(getBroadCastDICId());
		if (broadcardDICId.equals(dicId))
			return true;
		return false;
	}


	public static String getFirstLetterUpperCase(String str) {
		char[] stringArray = str.toCharArray();
		stringArray[0] = Character.toUpperCase(stringArray[0]);
		return new String(stringArray);
	}

	public static String getCurrentTimeString() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		return dateFormat.format(date);

	}

	public static java.sql.Date getSqlCurrentDate() {
		Date date = new Date();
		java.sql.Date dt = new java.sql.Date(date.getTime());
		return dt;
	}

	@SuppressWarnings("deprecation")
	public static java.sql.Date getSqlDate(int year,int month, int day) {
		Date date = new Date();
		date.setYear(year-1900);
		date.setMonth(month-1);
		date.setDate(day);
		java.sql.Date dt = new java.sql.Date(date.getTime());
		return dt;
	}

	public static java.sql.Date getSqlDateString() {
		Date date = new Date();
		java.sql.Date dt = new java.sql.Date(date.getTime());
		return dt;
	}

	public static byte getByte(Map<String, Object> map,String key) {
		Object value = (Object)map.get(key);
		if (value == null)
			return 0;
		if (value  instanceof Byte) {
			return ((Byte)value).byteValue();
		}
		if (value  instanceof Long) {
			return ((Long)value).byteValue();
		}
		if (value  instanceof Integer) {
			return ((Integer)value).byteValue();
		}
		if (value  instanceof Short) {
			return ((Short)value).byteValue();
		}

		return 0;
	}

	public static short getShort(Map<String, Object> map,String key) {
		Object value = map.get(key);
		if (value == null)
			return 0;
		if (value  instanceof Byte) {
			return ((Byte)value).shortValue();
		}
		if (value  instanceof Long) {
			return ((Long)value).shortValue();
		}
		if (value  instanceof Integer) {
			return ((Integer)value).shortValue();
		}
		if (value  instanceof Short) {
			return ((Short)value).shortValue();
		}
		return 0;
	}

	public static String getFileContent(String filePath) throws ApplicationException {
		String fileContent="";
		File file = new File(filePath);
		FileReader fileReader = null;
		BufferedReader bufferReader = null;
		try {
			fileReader = new FileReader(file);
			bufferReader = new BufferedReader(fileReader);
			while(true) {
				String line	= bufferReader.readLine();
				if (line == null)
					break;
				fileContent =  fileContent + line;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ApplicationException(ExceptionSeverity.ERROR, "File Read Failed");
		} finally {
			if (bufferReader != null) {
				try {
					bufferReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		//System.out.println("File Content ::"+fileContent);
		return fileContent;
	}

	public static int getIntFromNumber(Number number, int multiple) {
		if (number == null) return 0;
		Double dValue = number.doubleValue()*multiple;
		return dValue.intValue();
	}

	public static long getLongFromNumber(Number number, int multiple) {
		if (number == null) return 0;
		Double dValue = number.doubleValue()*multiple;
		return dValue.longValue();
	}

	public static String getEnabledBitString(int number) {
		String str = "";
		for(int i= 0; i < 32; i++) {
			int pow = 1 << i;
			if ((number & pow) == pow) {
				if (!str.equals(""))
					str = str + ",";
				str = str + (i+1);
			}
		}
		return str;
	}

	public static boolean matchMacAddress(String macId) {
		macId = macId.trim();
		try {
			Enumeration<NetworkInterface> e = NetworkInterface.getNetworkInterfaces();
			while(e.hasMoreElements()) {
				NetworkInterface ni = (NetworkInterface) e.nextElement();
				byte bytes[] = ni.getHardwareAddress();
				if (bytes == null) continue;
				for(int i=0; i < bytes.length; i++) {
					bytes[i] = (byte)(0xFF-bytes[i]);
				}
				String address = convertByteToHexString(bytes);
				address = address.trim();
				if (macId.equals(address))
					return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public static short getCRC(String fileName) {
		return 0;
	}

	public static String getArrayListToHTML(ArrayList<Map<String, Object>> list) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<table border=\"1\">");
		for(int i=0; i< list.size(); i++) {
			Map<String, Object> map = list.get(i);
			if (i == 0) {
				buffer.append("<tr>");
				Iterator<Entry<String, Object>> itr = map.entrySet().iterator();
				while (itr.hasNext()) {
					buffer.append("<td>");
					Map.Entry<String, Object> pair = itr.next();
					buffer.append(pair.getKey());
					buffer.append("</td>");
				}
				buffer.append("</tr>");
			}
			buffer.append("<tr>");
			Iterator<Entry<String, Object>> itr = map.entrySet().iterator();
			while (itr.hasNext()) {
				buffer.append("<td>");
				Map.Entry<String, Object> pair = itr.next();
				if (pair.getValue() != null)
					buffer.append(pair.getValue());
				else
					buffer.append("-");
				buffer.append("</td>");
			}
			buffer.append("</tr>");
		}
		buffer.append("</table>");
		return buffer.toString();
	}

	public static String getMapToHTML(Map<String, Object> map) {
		StringBuffer buffer = new StringBuffer();
		Object[] objArr = new Object[map.size()];
		Iterator<Entry<String, Object>> itr = map.entrySet().iterator();
		int i = 0;
		while (itr.hasNext()) {
			buffer.append("<tr>");
			Map.Entry<String, Object> pair = itr.next();
			objArr[i] = pair.getKey();
			i++;
		}
		buffer.append("<table border=\"1\">");
		Arrays.sort(objArr);
		buffer.append("<table border=\"1\">");
		for (Object str : objArr) {
			buffer.append("<tr>");
			buffer.append("<td>");
			buffer.append(str);
			buffer.append("</td>");
			buffer.append("<td>");
			Object value = map.get(str);
			if (value != null)
				buffer.append(value);
			else
				buffer.append("-");
			buffer.append("</td>");
			buffer.append("</tr>");
		}

		buffer.append("</table>");
		return buffer.toString();
	}
	public static String getGatewayOption() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<table cellspacing=\"4\">");
		buffer.append("<tr>");
		buffer.append("<td>");
		buffer.append("<a href=\"/\">Configuration</a>");
		buffer.append("</td>");
		buffer.append("<td>");
		buffer.append("<a href=\"/session\">Session</a>");
		buffer.append("</td>");
		buffer.append("</tr>");
		buffer.append("</table>");
		return buffer.toString();
	}

	public static String md5(String input){
		String result = input;

		if (input != null) {
			MessageDigest md;
			try {
				md = MessageDigest.getInstance("MD5");
				md.update(input.getBytes());
				BigInteger hash = new BigInteger(1, md.digest());
				result = hash.toString(16);
				while(result.length() < 32) {
					result = "0" + result;
				}
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}

		}
		return result;
	}

	public static String doubleMD5(String input){
		return md5(md5(input));
	}

	public static double getIncrementUnit(long lastUpdate, double mf) {
		long timediff = (System.currentTimeMillis() - lastUpdate) / 1000;
		return timediff * mf;
	}



	public static double round(double value) {
		long factor = (long) Math.pow(10, 2);
		double value2 = value * factor;
		long tmp = Math.round(value2);
		return (double) tmp / factor;
	}


	public static boolean isDefined(Integer value) {
		if (value == null) return false;
		if (value  == 0) return false;
		return true;
	}

	public static boolean isDefined99(Integer value) {
		if (value == null) return false;
		if (value  == 99) return false;
		return true;
	}






	public static String getDBString(String name, String str) {
		return getDBString(name, str, "=");
	}

	public static String getDBString(String name, String str, String opr) {
		return " "+name+" "+opr+"'"+str+"'" +" ";
	}

	public static String getDBInt(String name, String str, String opr) {
		return " "+name+" "+opr+" "+str+" ";
	}

	public static long getMsecForMinutes(long min) {
		return min*60L*1000L;
	}

	public static long getMsecForHours(long hrs) {
		return hrs*60*60L*1000L;
	}
	public static boolean isEmpty(String s) {
		return s == null || s.isEmpty();
	}

	public static boolean isEmpty(Double s) {
		if (s == null) {
			return true;
		}
		return false;
	}

	public static boolean isEmpty(byte[] array) {
		return array == null || array.length == 0;
	}

	public static boolean isEmpty(int[] array) {
		return array == null || array.length == 0;
	}

	public static <T> boolean isEmpty(T[] array) {
		return array == null || array.length == 0;
	}

	public static <T> boolean isEmpty(Collection<T> collection) {
		return collection == null || collection.size() == 0;
	}

	public static byte[] strToBytes(String str) throws ApplicationException {
		if (isEmpty(str))
			return new byte[0];

		try {
			return str.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new ApplicationException(ExceptionSeverity.ERROR, e.toString());
		}
	}

	public static String bytesToStr(byte[] bytes) throws ApplicationException {
		if (bytes == null || bytes.length == 0)
			return "";

		try {
			return new String(bytes, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new ApplicationException(ExceptionSeverity.ERROR, e.toString());
		}
	}


	public static boolean isEmpty(Map<?, ?> map) {
		return map == null || map.size() == 0;
	}


	public static boolean hasValue(Double val) {
		if ((val != null) && (val > 0)) {
			return true;
		}
		return false;
	}

	public static boolean hasValue(Number val) {
		if ((val != null) && (val.doubleValue() > 0)) {
			return true;
		}
		return false;
	}

	public static boolean hasValue(Integer val) {
		if ((val != null) && (val > 0)) {
			return true;
		}
		return false;
	}

	public static boolean hasValue(Long val) {
		if ((val != null) && (val > 0)) {
			return true;
		}
		return false;
	}

	public static boolean hasValue(Short val) {
		if ((val != null) && (val > 0)) {
			return true;
		}
		return false;
	}

	public static boolean hasValue(Byte val) {
		if ((val != null) && (val > 0)) {
			return true;
		}
		return false;
	}
	public static double round(double value,int precesion) {
		double val = value;
		DecimalFormat f = new DecimalFormat("#################.00");
		if (precesion == 3) {
			f = new DecimalFormat("#################.000");
		}
		String valString = f.format(val);
		return Double.parseDouble(valString);
	}

	public static String byteString(long value) {
		if (value > 1024L*1024L*1024L*1024L) {
			return ""+Util.round((value*1.0)/(1024L*1024L*1024L*1024), 2)+" TB";
		}
		if (value > 1024L*1024L*1024L) {
			return ""+Util.round((value*1.0)/(1024L*1024L*1024L), 2)+" GB";
		}
		if (value > 1024L*1024L) {
			return ""+Util.round((value*1.0)/(1024L*1024L), 2)+" MB";
		}
		if (value > 1024) {
			return ""+Util.round((value*1.0)/(1024L), 2)+" KB";
		}
		return ""+value+" B";
	}

	public static double convertLongitudeToDouble(String str) {
		int multipler = 1;
		str = str.replace("E", "");
		if (str.contains("W")) {
			str = str.replace("W", "");
			multipler = -1;
		}
		str = str.replace(".", "-");
		String[] decSplit = str.split("-");
		String firstString = decSplit[0];
		String str1 = firstString.substring(firstString.length()-2, firstString.length());
		String str2 = firstString.substring(0, firstString.length()-2);
		double value = Integer.parseInt(str2)+Double.parseDouble(str1+"."+decSplit[1])/60;
		System.out.println(str);
		System.out.println(str1+"-"+str2);
		return (multipler)*value;
	}

	public static double convertLatitudeToDouble(String str) {
		int multipler = 1;
		str = str.replace("N", "");
		if (str.contains("S")) {
			str = str.replace("S", "");
			multipler = -1;
		}
		str = str.replace(".", "-");
		String[] decSplit = str.split("-");
		String firstString = decSplit[0];
		String str1 = firstString.substring(firstString.length()-2, firstString.length());
		String str2 = firstString.substring(0, firstString.length()-2);
		System.out.println(str);
		System.out.println(str1+"-"+str2);
		int value2 = 0;
		if (!Util.isEmpty(str2)) {
			value2 = Integer.parseInt(str2);
		}
		double value = value2+Double.parseDouble(str1+"."+decSplit[1])/60;
		return (multipler)*value;
	}

	public synchronized static String getRandonToken() {

		long number = 1000 + generator.nextInt(9000);
		return "" +number;
	}

	public static String getClassSectionName(String class_name, String section_name) {
		String class_section_name = "";
		if (class_name != null) {
			class_section_name = class_name;
		}

		if (section_name != null) {
			class_section_name = class_section_name+" "+section_name;
		}
		return class_name+" "+section_name;
	}

	public static boolean isNumeric(String str)
	{
		try
		{
			Double.parseDouble(str);
		}
		catch(NumberFormatException nfe)
		{
			return false;
		}
		return true;
	}

	public static long getAverage(List<Object> list) {
		if (list == null)
			return 0;
		if (list.size() == 0)
			return 0;
		long sum = 0;
		long count = 0;
		for(int i=0; i < list.size(); i++) {
			sum = sum + (Long)list.get(i);
			count++;
		}
		return (long) (sum/count);
	}

	public static String[] getDayTimeArray() {
		ArrayList<String> list  = new ArrayList<String>();
		int hrs = 0;
		while(hrs < 24) {
			int min = 0;
			while (min < 60) {
				list.add(String.format("%02d:%02d", hrs,min));
				min ++;
			}
			hrs++;
		}
		return list.toArray(new String[list.size()]);
	}


	public static synchronized void saveDataInFile(String filename, String data) {
		FileWriter fileWritter;
		try {
			fileWritter = new FileWriter("logs/"+filename,true);
			BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
			bufferWritter.write(new Date()+"::"+data);
			bufferWritter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	public static void savetoFile(String filename, ByteArrayOutputStream byteArrayOutputStream) {
		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(filename);
			try {
				byteArrayOutputStream.writeTo(outputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}


	public static void replaceTextInFile(String filename, String[] searchText, String[] replaceText) {
		Path wiki_path = Paths.get(filename);
		try {
			List<String> lines = Files.readAllLines(wiki_path, StandardCharsets.UTF_16);
			for (int i = 0; i < lines.size(); i++) {
				String line = lines.get(i);
				//System.out.println("before : "+line);
				for (int index = 0; index < searchText.length; index++) {
					line = line.replace(searchText[index], replaceText[index]);
				}
				lines.set(i, line);
				//System.out.println("after : "+line);
			}
			try {
				PrintWriter writer = new PrintWriter(filename, "UTF-16");
				for (int i = 0; i < lines.size(); i++) {
					String line = lines.get(i);
					writer.println(line);
				}
				writer.close();
			} catch (Exception e) {
				// do something
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static String getPathSeperator() {
		return java.nio.file.FileSystems.getDefault().getSeparator();
	}

}
