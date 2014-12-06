package application.brushupskills.helper;

import platform.helper.BaseHelper;
import application.brushupskills.resource.question_category;

public class Question_categoryHelper extends BaseHelper {

	private static Question_categoryHelper instance;

	public static Question_categoryHelper getInstance() {
		if (instance == null)
			instance = new Question_categoryHelper();
		return instance;
	}
	
	public Question_categoryHelper() {
		super(new question_category());
		// TODO Auto-generated constructor stub
	}

}
