package platform.test;

import platform.util.Util;

public class TestByteString {
	public static void main(String[] args) throws Exception {
		String str = Util.byteString(1024);
		System.out.println("1024 = >" + str);
		str = Util.byteString(1024*2+100);
		System.out.println((1024*2+1)+"= >" + str);
		str = Util.byteString(2024*1024);
		System.out.println((2024*1024)+" = >" + str);
		str = Util.byteString(469673408L*1024L);
		System.out.println((469673408L*1024L)+" = >" + str);
		str = Util.byteString(1469673408L*1024L);
		System.out.println((1469673408L*1024L)+" = >" + str);
	}
}	
