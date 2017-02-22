package platform.webservice.ui.util;

import platform.util.ApplicationConstants;
import platform.webservice.ui.definition.IdValue;

public class UIConstants {
	public final static String DATA_TYPE_INT = "INT";
	public final static String DATA_TYPE_STRING = "STRING";
	public final static String DATA_TYPE_STRING_ARRAY = "STRING_ARRAY";
	public final static String DATA_TYPE_DOUBLE = "DOUBLE";
	public final static String DATA_TYPE_TIMESTAMP = "TIMESTAMP";
	public final static String DATA_TYPE_TIME = "TIME";
	public final static String DATA_TYPE_DURATION = "DURATION";
	
	public final static String DATA_TYPE_BLOB = "BLOB";
	public final static String DATA_TYPE_DATE = "DATE";
	public final static String COMPONENT_TYPE_HEADING = "HEADING";
	public final static String COMPONENT_TYPE_TEXTINPUT = "TEXTINPUT";
	public final static String COMPONENT_TYPE_DATEPICKER = "DATEPICKER";
	public final static String COMPONENT_TYPE_HR = "HR";
	public final static String COMPONENT_TYPE_TEXTAREA = "TEXTAREA";
	public final static String COMPONENT_TYPE_BUTTON = "BUTTON";
	public final static String COMPONENT_TYPE_HIDDEN = "HIDDEN";
	public final static String COMPONENT_TYPE_FILEUPLOAD = "FILEUPLOAD";
	public final static String COMPONENT_TYPE_PHOTOUPLOAD = "PHOTOUPLOAD";
	public final static String COMPONENT_TYPE_PHOTO = "PHOTO";
	
	public final static String COMPONENT_TYPE_PASSWORD = "PASSWORD";
	public final static String COMPONENT_TYPE_LINK = "LINK";
	public final static String COMPONENT_TYPE_DATE = "DATE";
	public final static String COMPONENT_TYPE_COMBO = "COMBO";
	public final static String COMPONENT_TYPE_CHECKBOX = "CHECKBOX";
	public final static String COMPONENT_TYPE_AUTOCOMPLETE = "AUTOCOMPLETE";
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
			"PRE PRIMARYSr. K.G.",
			"PRE PRIMARYNursery",
			"PRE PRIMARYJr. K.G.",
			"PRE PRIMARYPlayschool",
			"Day Care",
			"Day Care/Toddler",
			"Day Care/NURSERY",
			"Day Care/LKG",
			"Day Care/UKG",
	};
	
	public final static String[] GENDER_ENUM = new String[] {
		"Male",
		"Female"
	};

	public final static String[] CONTEXT_STATUS_ENUM = new String[]{
			"NOT-AVAILABLE",
			"OPEN",
			"STARTED",
			"COMPLETED"
	};
	
	public final static String[] COLOR_ENUM = new String[] {
		"Red",
		"Green",
		"White",
		"Yellow",
		"Orange",
		"Blue",
};
	public final static String[] REPORT_CARD_TEMPLETE_ENUM = new String[] {
		"BRIGHT-KID-NURSERY",
	};
	public final static String[] ASSESSMENT_TYPE_ENUM = new String[] {
		"Half Yearly",
		"Annually",
	};
	public final static String[] RATING_ENUM = new String[] {
		"Excellent",
		"Very Good",
		"Good",
		"Poor",
		"Very poor",
		"N/A"
	};
	public final static String[] SECTION_ENUM = new String[] {
		"MORNING SESSION",
		"AFTERNOON SESSION",
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
		"ALL"
};

	public final static IdValue[] NOTICE_TYPE_ENUM = new IdValue[] {
		new IdValue("SCHOOL", "Whole Branch/Centre"),
		new IdValue("CLASS", "Whole class"),
		new IdValue("SECTION", "Particluler Section"),
		new IdValue("BATCH", "Particluler Batch"),
		new IdValue("PARENTS", "Particluler Parents"),
	};
	

	public final static IdValue[] NOTICE_COACHING_TYPE_ENUM = new IdValue[] {
		new IdValue("SCHOOL", "Whole Branch/Centre"),
		new IdValue("BATCH", "Particluler Batch"),
	};
	
	public final static IdValue[] NEWS_TYPE_ENUM = new IdValue[] {
		new IdValue("SCHOOL", "Whole School"),
		new IdValue("CLASS", "Whole class"),
		new IdValue("SECTION", "Particluler Section"),
	};
	
	public final static IdValue[] PRESNT_TYPE_ENUM = new IdValue[] {
		new IdValue("SCHOOL", "In School"),
		new IdValue("BUS", "In Bus"),
		new IdValue("OFFICE", "In Office"),
		new IdValue("OTHER", "Other"),
		//new IdValue("VAN", "All Van users"),
	};
	
	public final static IdValue[] DAY_ENUM = new IdValue[] {
		new IdValue("0", "Sunday"),
		new IdValue("1", "Monday"),
		new IdValue("2", "TuesDay"),
		new IdValue("3", "Wednesday"),
		new IdValue("4", "Thursday"),
		new IdValue("5", "Friday"),
		new IdValue("6", "Saturday"),
	};
	
	public final static IdValue[] PERIOD_ENUM = new IdValue[] {
		new IdValue("1", "1"),
		new IdValue("2", "2"),
		new IdValue("3", "3"),
		new IdValue("4", "4"),
		new IdValue("5", "5"),
		new IdValue("6", "6"),
		new IdValue("7", "7"),
		new IdValue("8", "8"),
		new IdValue("9", "9"),
	};
	
	public final static IdValue[] PRESNT_SUB_TYPE_ENUM = new IdValue[] {
		new IdValue("NA", "N/A"),
		new IdValue("PICKUP", "Pickup"),
		new IdValue("DROP", "Drop"),
		//new IdValue("VAN", "All Van users"),
	};
	
	public final static IdValue[] PRESENT_RECORD_TYPE = new IdValue[] {
		new IdValue("ENTRY", "Entry"),
		new IdValue("EXIT", "Exit"),
		//new IdValue("VAN", "All Van users"),
	};
	
	public final static IdValue[] PRIMARY_CONTACT_ENUM = new IdValue[] {
		new IdValue("STUDENT", "STUDENT"),
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
