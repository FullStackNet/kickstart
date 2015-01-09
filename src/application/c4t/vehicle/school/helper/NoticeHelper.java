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
import application.c4t.vehicle.school.resource.notice;


public class NoticeHelper extends BaseHelper {
	
	NoticeHelper() {
		super(new notice());
		// TODO Auto-generated constructor stub
	}
	private static NoticeHelper instance;
	
	public static NoticeHelper getInstance() {
		if (instance == null)
			instance = new NoticeHelper();
		return instance;
	}
	public void updateSend(String id) throws ApplicationException {
		notice _notice = new notice(id);
		_notice.setSent("Y");
		update(_notice);
	}
	public void addSchool(String noticeId,String schoolId) {
		notice _notice = new notice();
		_notice.setId(noticeId);
		_notice.addSchools(schoolId);
		try {
			NoticeHelper.getInstance().update(_notice);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addSchool(String noticeId,String[] schoolIds) {
		notice _notice = new notice();
		_notice.setId(noticeId);
		for(int i=0 ; i < schoolIds.length; i++) {
			_notice.addSchools(schoolIds[i]);
		}
		try {
			NoticeHelper.getInstance().update(_notice);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void removeSchool(String noticeId,String schoolId) {
		notice _notice = new notice();
		_notice.setId(noticeId);
		_notice.addSchools(schoolId);
		try {
			NoticeHelper.getInstance().unset(_notice);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateSentCounter(String id,int total_students_sent, 
			int total_users_sent, int total_sms_sent, int total_email_sent, 
			int total_app_notification_sent)  {
		notice _notice = new notice(id);
		_notice.setTotal_student_sent(total_students_sent);
		_notice.setTotal_user_sent(total_users_sent);
		_notice.setTotal_sms_sent(total_sms_sent);
		_notice.setTotal_email_sent(total_email_sent);
		_notice.setTotal_app_notification_sent(total_app_notification_sent);
		try {
			update(_notice);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Map<String, Object>> getForSchools(String[] schools) throws ApplicationException  {
		HelperFactory.getInstance().register(SchoolHelper.getInstance());
		HelperFactory.getInstance().register(NoticeHelper.getInstance());
		ArrayList<JoinField> list = new ArrayList<JoinField>();
		JoinField field = new JoinField("school", "school_id", "school_name");
		list.add(field);
		Expression e2 = new Expression(notice.FIELD_SCHOOL_ID, REL_OP.IN, schools);
		Expression e1 = new Expression(notice.FIELD_SCHOOLS, REL_OP.EACH_ELEMENT_IN, schools);
		Expression e = new Expression(e1,LOG_OP.OR, e2);
		
		return getByJoining(e,list, new String[]{notice.FIELD_NOTICE_DATE + " desc"});
	}
}
