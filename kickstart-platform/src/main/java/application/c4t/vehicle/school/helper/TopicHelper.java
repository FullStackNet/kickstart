package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
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
	
	public void updateFileName(String id,String filename) {
		topic _topic = new topic();
		_topic.setId(id);
		_topic.setFile_name(filename);
		try {
			update(_topic);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
