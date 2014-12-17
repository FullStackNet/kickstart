package application.brushupskills.helper;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.Util;
import application.brushupskills.resource.question;
import application.brushupskills.resource.question_category;

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
	BaseResource[] getQuestionsByCategory(String categoryId) {
		question_category _category = (question_category)Question_categoryHelper.getInstance().getById(categoryId);
		if (_category.getQuestions() == null || _category.getQuestions().size() == 0)
			return null;
		Set<String> idset = _category.getQuestions().keySet();
		String[] ids = idset.toArray(new String[idset.size()]);
		BaseResource[] resouces = QuestionHelper.getInstance().getById(ids, null);
		for(BaseResource resouce : resouces) {
			question _question = (question)resouce;
			Long order = (Long)_category.getQuestions().get(_question.getId());
			if (order != null) {
				_question.setQuestion_order(order);
			}
		}
		return resouces;
	}
	
	public question orderExist(BaseResource[] questions,String questionId, Long order) {
		for(int i =0; i < questions.length; i++) {
			question _question = (question)questions[i];
			if (order == _question.getQuestion_order()) {
				if (!_question.getId().equals(questionId))
					return _question;
			}
		}
		return null;
	}	
	
	public void changeOrder(String categoryId,String questionId, Long order) {
		if (order == null)
			return;
		BaseResource[] questions = getQuestionsByCategory(categoryId);
		if (Util.isEmpty(questions))
			return;
		question _question = orderExist(questions,questionId,order);
		if (_question == null)
			return;
		long newOrder = order;
		for(int i =0; i < questions.length; i++) {
			_question = (question)questions[i];
			if (_question.getId().equals(questionId))
				continue;
			if (order <=  _question.getQuestion_order()) {
				if (newOrder >= _question.getQuestion_order()) {
					newOrder = _question.getQuestion_order()+1;
					question_category _pcat = new question_category(categoryId);
					Map<String, Object> map = new HashMap<>();
					map.put(_question.getId(), newOrder);
					_pcat.setQuestions(map);
					try {
						Question_categoryHelper.getInstance().update(_pcat);
					} catch (ApplicationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
	public void addAnswer(String id,String answerId) {
		question _question = new question(id);
		_question.addAnswers(answerId);
		try {
			QuestionHelper.getInstance().update(_question);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
