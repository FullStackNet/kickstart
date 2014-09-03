package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.topic;


public class TopicHelper extends BaseHelper {
	
	TopicHelper() {
		super(new topic());
		// TODO Auto-generated constructor stub
	}
	private static TopicHelper instance;
	
	public static TopicHelper getInstance() {
		if (instance == null)
			instance = new TopicHelper();
		return instance;
	}
	public BaseResource[] getByChapterId(String chapterId) {
		Expression e = new Expression(topic.FIELD_CHAPTER_ID, REL_OP.EQ, chapterId);
		return getByExpression(e);
	}
}
