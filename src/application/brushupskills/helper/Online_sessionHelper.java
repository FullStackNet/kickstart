package application.brushupskills.helper;

import platform.helper.BaseHelper;
import application.brushupskills.resource.online_session;

public class Online_sessionHelper extends BaseHelper {

	private static Online_sessionHelper instance;

	public static Online_sessionHelper getInstance() {
		if (instance == null)
			instance = new Online_sessionHelper();
		return instance;
	}
	
	public Online_sessionHelper() {
		super(new online_session());
		// TODO Auto-generated constructor stub
	}
}
