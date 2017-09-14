package platform.webservice.ui.util;

import platform.webservice.ui.definition.IdValue;

public class UIUtil {
	
	public static IdValue[] getYesNOoption() {
		IdValue[] options = {new IdValue("N", "No"), new IdValue("Y", "Yes")};
		return options;
	}
	
	public static IdValue[] getYesNODisableoption() {
		IdValue[] options = {new IdValue("N", "No"), new IdValue("Y", "Yes"),new IdValue("D", "Disable")};
		return options;
	}
	
	public static IdValue[] getFuelTypeOption() {
		IdValue[] options = {new IdValue("PETROL", "Petrol"), new IdValue("DIESAL", "Diesel")};
		return options;
	}
	
	public static IdValue[] getTimeZoneoption() {
		IdValue[] options = {new IdValue("IST", "IST"), new IdValue("GMT", "GMT")};
		return options;
	}
	
	public static IdValue[] getCurrency() {
		IdValue[] options = {new IdValue("DOLLER", "Doller"), new IdValue("INR", "INR")};
		return options;
	}
}
