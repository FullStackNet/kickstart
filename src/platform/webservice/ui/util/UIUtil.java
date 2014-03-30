package platform.webservice.ui.util;

import platform.webservice.ui.definition.IdValue;

public class UIUtil {
	
	public static IdValue[] getYesNOoption() {
		IdValue[] yesNooptions = {new IdValue("N", "No"), new IdValue("Y", "Yes")};
		return yesNooptions;
	}
	
	public static IdValue[] getTimeZoneoption() {
		IdValue[] options = {new IdValue("IST", "IST"), new IdValue("GMT", "GMT")};
		return options;
	}
}
