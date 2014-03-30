package platform.test;

import platform.util.Util;


public class TestRound {
	public static void main(String[] args) throws Exception {
		for(int i=0; i < 4096; i++) {
			double voltage = i*(3.0/4096)*4;
			double conversionFactor = 50/(3.0*4);
			double fuelQuantity = voltage*conversionFactor;
			fuelQuantity = Util.round(fuelQuantity, 2);
			System.out.println(i+"="+fuelQuantity);
		}
	}
}
