package application.brushupskills.helper;

import platform.helper.BaseHelper;
import application.brushupskills.resource.ask_question;

public class ask_questionHelper extends BaseHelper {

	private static ask_questionHelper instance;

	public static ask_questionHelper getInstance() {
		if (instance == null)
			instance = new ask_questionHelper();
		return instance;
	}
	
	public ask_questionHelper() {
		super(new ask_question());
		// TODO Auto-generated constructor stub
	}
}
