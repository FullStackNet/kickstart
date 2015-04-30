package platform.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.db.Expression;
import platform.db.JoinField;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.c4t_record;
import platform.util.ApplicationException;


public class C4t_recordHelper extends BaseHelper {
	
	public C4t_recordHelper() {
		super(new c4t_record());
		// TODO Auto-generated constructor stub
	}
	private static C4t_recordHelper instance;
	
	public static C4t_recordHelper getInstance() {
		if (instance == null)
			instance = new C4t_recordHelper();
		return instance;
	}	
	
	public BaseResource[] getForCommunity(String[] ids,String record_type, String[] orderby, long fromtime, long totime) {
		Expression e1 = new Expression(c4t_record.FIELD_RECORD_TYPE, REL_OP.EQ, record_type);
		Expression e2 = new Expression(c4t_record.FIELD_COMMUNITY_ID, REL_OP.IN, ids);
		Expression e3 = new Expression(e1, LOG_OP.AND, e2);
		Expression e4 = new Expression(c4t_record.FIELD_EVENT_DATE, REL_OP.GTEQ, fromtime);
		Expression e5 = new Expression(c4t_record.FIELD_EVENT_DATE, REL_OP.LT, totime);
		Expression e6 = new Expression(e4, LOG_OP.AND, e5);
		Expression e = new Expression(e3, LOG_OP.AND, e6);
		return getByExpression(e,orderby);
	}

	public BaseResource[] getRecordForCommunities(String userId,String record_type,String[] order,String timeFieldName,long from_time, long to_time) {
		String[] ids = User_mapHelper.getInstance().getCommunityIds(userId);
		try {
			return  getForCommunity(ids,record_type, new String[]{c4t_record.FIELD_EVENT_DATE},from_time,to_time);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList<Map<String, Object>> getByListMapUserIdWithCommunityName(String userId,String record_type,
		String[] order,long from_time, long to_time) {
		String[] ids = User_mapHelper.getInstance().getCommunityIds(userId);
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		HelperFactory.getInstance().register(this);
		Expression e1 = new Expression(c4t_record.FIELD_RECORD_TYPE, REL_OP.EQ, record_type);
		Expression e2 = new Expression(c4t_record.FIELD_COMMUNITY_ID, REL_OP.IN, ids);
		Expression e3 = new Expression(e1, LOG_OP.AND, e2);
		Expression e4 = new Expression(c4t_record.FIELD_EVENT_DATE, REL_OP.GTEQ, from_time);
		Expression e5 = new Expression(c4t_record.FIELD_EVENT_DATE, REL_OP.LT, to_time);
		Expression e6 = new Expression(e4, LOG_OP.AND, e5);
		Expression e = new Expression(e3, LOG_OP.AND, e6);
		
		ArrayList<JoinField> joinList = new ArrayList<>();
		JoinField jfield = new JoinField("c4t_object", c4t_record.FIELD_COMMUNITY_ID, "community_name");
		joinList.add(jfield);
		try {
			list =  getByJoining(e,joinList,order);
			return list;
		} catch (ApplicationException exp1) {
			// TODO Auto-generated catch block
			exp1.printStackTrace();
		}
		return list;
		
	}
}
