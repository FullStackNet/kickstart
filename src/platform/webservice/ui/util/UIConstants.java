package platform.webservice.ui.util;

import platform.util.ApplicationConstants;
import platform.webservice.ui.definition.IdValue;

public class UIConstants {
	public final static String DATA_TYPE_INT = "INT";
	public final static String DATA_TYPE_STRING = "STRING";
	public final static String DATA_TYPE_STRING_ARRAY = "STRING_ARRAY";
	public final static String DATA_TYPE_DOUBLE = "DOUBLE";
	public final static String DATA_TYPE_TIMESTAMP = "TIMESTAMP";
	public final static String DATA_TYPE_DURATION = "DURATION";
	
	public final static String DATA_TYPE_BLOB = "BLOB";
	public final static String DATA_TYPE_DATE = "DATE";
	public final static String COMPONENT_TYPE_HEADING = "HEADING";
	public final static String COMPONENT_TYPE_TEXTINPUT = "TEXTINPUT";
	public final static String COMPONENT_TYPE_DATEPICKER = "DATEPICKER";
	public final static String COMPONENT_TYPE_TEXTAREA = "TEXTAREA";
	public final static String COMPONENT_TYPE_BUTTON = "BUTTON";
	public final static String COMPONENT_TYPE_HIDDEN = "HIDDEN";
	public final static String COMPONENT_TYPE_FILEUPLOAD = "FILEUPLOAD";
	public final static String COMPONENT_TYPE_PHOTOUPLOAD = "PHOTOUPLOAD";
	
	public final static String COMPONENT_TYPE_PASSWORD = "PASSWORD";
	public final static String COMPONENT_TYPE_LINK = "LINK";
	public final static String COMPONENT_TYPE_DATE = "DATE";
	public final static String COMPONENT_TYPE_COMBO = "COMBO";
	public final static String COMPONENT_TYPE_LABEL = "LABEL";
	public final static IdValue[] YES_NO_ENUM = {new IdValue("Y","Yes"), new IdValue("N", "No")};
	public final static IdValue[] ENABLE_DISABLE_ENUM = {new IdValue("E","Enable"), new IdValue("D", "Disable")};
	public final static String[] APPLICATION_ENUM = {"AMR","HEMS","IBMS"};
	public final static String OPERATION_CUSTOM = "CUSTOM";
	public final static String OPERATION_VIEW = "VIEW";
	public final static String OPERATION_ALL = "ALL";
	public final static String IMAGE_PATH = "";
	public final static IdValue[] MONITOR_TYPE_ENUM = {new IdValue("1","HEART BEAT"), new IdValue("2", "PORT-SCAN")};	
	public final static String[] MANAGED_OBJECT_TYPE_ENUM = {
			ApplicationConstants.APPLICATION_NAME_AGENT.toUpperCase(),
			ApplicationConstants.APPLICATION_NAME_ALERT_MANAGER,
			ApplicationConstants.APPLICATION_NAME_APPLICATION_SERVER,
			ApplicationConstants.APPLICATION_NAME_GATEWAY,
			ApplicationConstants.APPLICATION_NAME_MANAGER,
			ApplicationConstants.APPLICATION_NAME_MONGODB,
			ApplicationConstants.APPLICATION_NAME_MESSAGE_BUS
	};
	public final static String[] EXTERNAL_MONITOR_MANAGED_OBJECT_ENUM = {
		ApplicationConstants.APPLICATION_NAME_APPLICATION_SERVER,
		ApplicationConstants.APPLICATION_NAME_MONGODB,
		ApplicationConstants.APPLICATION_NAME_MONGODB_CONFIG_SERVER,
		ApplicationConstants.APPLICATION_NAME_MONGODB_DATA_SERVER,
		ApplicationConstants.APPLICATION_NAME_MONGODB_ROUTE_SERVER,
		ApplicationConstants.APPLICATION_NAME_MESSAGE_BUS
	};
	public final static String[] CLASSES_ENUM = new String[] {
			"TODDLER",
			"PLAY SCHOOL",
			"NURSERY",
			"LKG",
			"UKG",
			"I",
			"II",
			"III",
			"IV",
			"V",
			"VI",
			"VII",
			"VIII",
			"IX",
			"X",
			"XI",
			"XII",
	};

	public final static String[] SECTION_ENUM = new String[] {
		"A",
		"B",
		"C",
		"D",
		"E",
		"F",
		"G",
		"H",
		"I",
		"J",
		"K",
		"L",
		"M",
		"N",
		"O",
		"P",
		"Q",
		"R",
		"S",
		"T",
		"U",
		"V",
		"W",
		"X",
		"Y",
		"Z",		
};

	public final static IdValue[] NOTICE_TYPE_ENUM = new IdValue[] {
		new IdValue("SCHOOL", "Whole School"),
		new IdValue("CLASS", "Whole class"),
		new IdValue("SECTION", "Particluler Section"),
		//new IdValue("VAN", "All Van users"),
	};
	
	public final static IdValue[] PRIMARY_CONTACT_ENUM = new IdValue[] {
		new IdValue("MOTHER", "MOTHER"),
		new IdValue("FATHER", "FATHER"),
		new IdValue("BOTH", "BOTH"),
		new IdValue("OTHER", "OTHER"),
		//new IdValue("VAN", "All Van users"),
	};
	
	public final static IdValue[] PHONE_TYPE_ENUM = new IdValue[] {
		new IdValue("SMARTPHONE", "SMARTPHONE"),
		new IdValue("NORMAL", "NORMAL")
	};
	
	public static Object getValue(IdValue[] list, Object value) {
		for (int i = 0; i < list.length; i++) {
			IdValue idvalue = list[i];
			if (idvalue.getId().equals(value)) {
				return list[i].getValue();
			}
		}
		return null;
	}
}
