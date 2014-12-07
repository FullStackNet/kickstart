package application.brushupskills.helper;

import platform.helper.BaseHelper;
import platform.util.ApplicationException;
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

	public void addCategory(String id,String categoryId) {
		question _question = new question(id);
		_question.addCategories(categoryId);
		try {
			QuestionHelper.getInstance().update(_question);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
