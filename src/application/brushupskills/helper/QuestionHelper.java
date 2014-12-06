package application.brushupskills.helper;

import platform.helper.BaseHelper;
import application.brushupskills.resource.question;

public class QuestionHelper extends BaseHelper {

	private static QuestionHelper instance;

	public static QuestionHelper getInstance() {
		if (instance == null)
			instance = new QuestionHelper();
		return instance;
	}
	
	public QuestionHelper() {
		super(new question());
		// TODO Auto-generated constructor stub
	}

}
