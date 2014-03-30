package platform.test;

import platform.util.HexUtils;
import platform.util.Util;

public class TestDecode {
	public static void main(String[] args) throws Exception {
		short value = 2003;
		byte[] bytes = new byte[2];
		Util.updateShortHex(bytes, 0, value);
		System.out.println(HexUtils.hexString(bytes[0]) +" " + HexUtils.hexString(bytes[1]));
		value = Util.getShortHex(bytes, 0);
		System.out.println(" Value : " +value);
		
		Float fValue = Util.getShortFloatHex(bytes, 0);
		System.out.println("Float Value : " +fValue);
		
		int intValue = 1534534;
		byte[] intBytes = new byte[4];
		Util.updateIntHex(intBytes, 0, intValue);
		System.out.println(HexUtils.hexString(intBytes[0]) + " " + HexUtils.hexString(intBytes[1]) + " " + HexUtils.hexString(intBytes[2]) + " " + HexUtils.hexString(intBytes[3]));
		intValue = Util.getIntHex(intBytes, 0);
		System.out.println("Int Value : " +intValue);
		Double dValue = Util.getIntDoubleHex(intBytes, 0);
		System.out.println("Double Value : " +dValue);
	
	}
}	
