package application.c4t.vehicle.school.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.db.Expression;
import platform.db.JoinField;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.helper.HelperFactory;
import platform.util.ApplicationException;
import application.c4t.vehicle.school.resource.daily_activity;
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
	
	public ArrayList<Map<String, Object>> getForSchools(String[] schools) throws ApplicationException  {
		HelperFactory.getInstance().register(SchoolHelper.getInstance());
		HelperFactory.getInstance().register(NoticeHelper.getInstance());
		ArrayList<JoinField> list = new ArrayList<JoinField>();
		JoinField field = new JoinField("school", "school_id", "school_name");
		list.add(field);
		Expression e = new Expression(daily_activity.FIELD_SCHOOL_ID, REL_OP.IN, schools);
		return getByJoining(e,list, new String[]{notice.FIELD_NOTICE_DATE + " desc"});
	}
}
