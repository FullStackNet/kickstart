package platform.util;

public class HexUtils {
	
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
	
	public  static String hexString(byte data) {
		String hexString = "";
		if (((Integer.toHexString(0xFF & data).toUpperCase().length()) < 2) && (data < 16)) {
			hexString = hexString + "0";
		}
		hexString = hexString
				+ Integer.toHexString(0xFF & data).toUpperCase();

		return hexString;
	}
	
	public static double getShort2Double(byte b1, byte b2) {
		double d = 0.0;
		d = Byte.parseByte(HexUtils.hexString(b1));
		d = d + Byte.parseByte(HexUtils.hexString(b2))/100.0;
		return d;
	}
	
	public static byte getByte2Hex(byte b1) {
		String str = ""+b1;
		return (byte)Integer.parseInt(str,16);
	}
}
