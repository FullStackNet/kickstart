package application.c4t.vehicle.school.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.db.Expression;
import platform.db.JoinField;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.helper.HelperFactory;
import platform.util.ApplicationException;
import application.c4t.vehicle.school.resource.video_collection;


public class Video_collectionHelper extends BaseHelper {
	
	Video_collectionHelper() {
		super(new video_collection());
		// TODO Auto-generated constructor stub
	}
	private static Video_collectionHelper instance;
	
	public static Video_collectionHelper getInstance() {
		if (instance == null)
			instance = new Video_collectionHelper();
		return instance;
	}
	public void updateSend(String id) throws ApplicationException {
		video_collection _video_collection = new video_collection(id);
		_video_collection.setSent("Y");
		update(_video_collection);
	}
	public void addSchool(String video_collectionId,String schoolId) {
		video_collection _video_collection = new video_collection();
		_video_collection.setId(video_collectionId);
		_video_collection.addSchools(schoolId);
		try {
			Video_collectionHelper.getInstance().update(_video_collection);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addSchool(String video_collectionId,String[] schoolIds) {
		video_collection _video_collection = new video_collection();
		_video_collection.setId(video_collectionId);
		for(int i=0 ; i < schoolIds.length; i++) {
			_video_collection.addSchools(schoolIds[i]);
		}
		try {
			Video_collectionHelper.getInstance().update(_video_collection);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void removeSchool(String video_collectionId,String schoolId) {
		video_collection _video_collection = new video_collection();
		_video_collection.setId(video_collectionId);
		_video_collection.addSchools(schoolId);
		try {
			Video_collectionHelper.getInstance().unset(_video_collection);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateSentCounter(String id,int total_students_sent, 
			int total_users_sent, int total_sms_sent, int total_email_sent, 
			int total_app_notification_sent)  {
		video_collection _video_collection = new video_collection(id);
		_video_collection.setTotal_student_sent(total_students_sent);
		_video_collection.setTotal_user_sent(total_users_sent);
		_video_collection.setTotal_sms_sent(total_sms_sent);
		_video_collection.setTotal_email_sent(total_email_sent);
		_video_collection.setTotal_app_notification_sent(total_app_notification_sent);
		try {
			update(_video_collection);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Map<String, Object>> getForSchools(String[] schools,String[] order,long fromtime,long totime) throws ApplicationException  {
		try {
			HelperFactory.getInstance().register(SchoolHelper.getInstance());
			HelperFactory.getInstance().register(Video_collectionHelper.getInstance());
			ArrayList<JoinField> list = new ArrayList<JoinField>();
			JoinField field = new JoinField("school", "school_id", "school_name");
			list.add(field);
			
			Expression e2 = new Expression(video_collection.FIELD_SCHOOL_ID, REL_OP.IN, schools);
			Expression e1 = new Expression(video_collection.FIELD_SCHOOLS, REL_OP.EACH_ELEMENT_IN, schools);
			Expression e3 = new Expression(e1,LOG_OP.OR, e2);

			Expression e4 = new Expression(video_collection.FIELD_ACTIVITY_DATE, REL_OP.GTEQ, fromtime);
			Expression e5 = new Expression(video_collection.FIELD_ACTIVITY_DATE, REL_OP.LT, totime);
			
			Expression e6 = new Expression(e4, LOG_OP.AND, e5);
			Expression e = new Expression(e3, LOG_OP.AND, e6);
			return getByJoining(e,list,order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ArrayList<Map<String, Object>>();		
	}
}
