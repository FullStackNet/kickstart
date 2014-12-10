package application.brushupskills.helper;

import platform.helper.BaseHelper;
import application.brushupskills.resource.answer;

public class AnswerHelper extends BaseHelper {

	private static AnswerHelper instance;

	public static AnswerHelper getInstance() {
		if (instance == null)
			instance = new AnswerHelper();
		return instance;
	}
	
	public AnswerHelper() {
		super(new answer());
		// TODO Auto-generated constructor stub
	}
}
