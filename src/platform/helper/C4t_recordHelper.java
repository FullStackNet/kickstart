package platform.helper;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import platform.db.Expression;
import platform.db.JoinField;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.c4t_object;
import platform.resource.c4t_record;
import platform.util.ApplicationException;
import platform.util.Util;


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
	
	
	public void updateSend(String id) throws ApplicationException {
		c4t_record _record = new c4t_record(id);
		_record.setSent("Y");
		_record.setSent_time(new Date().getTime());
		update(_record);
	}
	
	public BaseResource[] getByRelationMap(String from_id, Expression condition, String relation_type,String[] orderby) {
		String[] ids = C4t_record_mapHelper.getInstance().getByRelationMap(from_id, relation_type);
		if (Util.isEmpty(ids)) {
			return null;
		}
		Expression e1 = new Expression(c4t_object.FIELD_ID, REL_OP.IN, ids);
		Expression e = new Expression(condition, LOG_OP.AND, e1);
		return C4t_recordHelper.getInstance().getByExpression(e,orderby);
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
	
	public ArrayList<Map<String, Object>> getByListMapCommunityIdForDateByUserId(String communityId,String userId,String record_type,
			String[] order,long from_time, long to_time, Expression expression) {
			ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
			HelperFactory.getInstance().register(this);
			Expression e1 = new Expression(c4t_record.FIELD_RECORD_TYPE, REL_OP.EQ, record_type);
			Expression e2 = new Expression(c4t_record.FIELD_COMMUNITY_ID, REL_OP.EQ, communityId);
			Expression e3 = new Expression(e1, LOG_OP.AND, e2);
			Expression e4 = new Expression(c4t_record.FIELD_EVENT_DATE, REL_OP.GTEQ, from_time);
			Expression e5 = new Expression(c4t_record.FIELD_EVENT_DATE, REL_OP.LT, to_time);
			Expression e6 = new Expression(e4, LOG_OP.AND, e5);
			Expression e7 = new Expression(e3, LOG_OP.AND, e6);
			Expression e8 = new Expression(c4t_record.FIELD_USER_ID, REL_OP.EQ, userId);
			Expression e9 = new Expression(e7, LOG_OP.AND, e8);
			Expression e = e9;
			if (expression != null) {
				e = new Expression(e9, LOG_OP.AND, expression);
			}
				
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
	
	public BaseResource[] getRecordByCommunityIdForDate(String communityId,String record_type,
			String[] order,long from_time, long to_time, Expression expression) {
			Expression e1 = new Expression(c4t_record.FIELD_RECORD_TYPE, REL_OP.EQ, record_type);
			Expression e2 = new Expression(c4t_record.FIELD_COMMUNITY_ID, REL_OP.EQ, communityId);
			Expression e3 = new Expression(e1, LOG_OP.AND, e2);
			Expression e4 = new Expression(c4t_record.FIELD_EVENT_DATE, REL_OP.GTEQ, from_time);
			Expression e5 = new Expression(c4t_record.FIELD_EVENT_DATE, REL_OP.LT, to_time);
			Expression e6 = new Expression(e4, LOG_OP.AND, e5);
			Expression e7 = new Expression(e3, LOG_OP.AND, e6);
			Expression e = e7;
			if (expression != null) {
				e = new Expression(e7, LOG_OP.AND, expression);
			}
			return getByExpression(e,order);
	}
	
	public ArrayList<Map<String, Object>> getByListMapCommunityIdForDate(String communityId,String record_type,
			String[] order,long from_time, long to_time, Expression expression) {
			ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
			HelperFactory.getInstance().register(this);
			Expression e1 = new Expression(c4t_record.FIELD_RECORD_TYPE, REL_OP.EQ, record_type);
			Expression e2 = new Expression(c4t_record.FIELD_COMMUNITY_ID, REL_OP.EQ, communityId);
			Expression e3 = new Expression(e1, LOG_OP.AND, e2);
			Expression e4 = new Expression(c4t_record.FIELD_EVENT_DATE, REL_OP.GTEQ, from_time);
			Expression e5 = new Expression(c4t_record.FIELD_EVENT_DATE, REL_OP.LT, to_time);
			Expression e6 = new Expression(e4, LOG_OP.AND, e5);
			Expression e7 = new Expression(e3, LOG_OP.AND, e6);
			Expression e = e7;
			if (expression != null) {
				e = new Expression(e7, LOG_OP.AND, expression);
			}
				
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
	
	
	public ArrayList<Map<String, Object>> getByListMapUserIdWithCommunityName(String userId,String record_type,
			String[] order,long from_time, long to_time, Expression expression) {
			String[] ids = User_mapHelper.getInstance().getCommunityIds(userId);
			ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
			HelperFactory.getInstance().register(this);
			Expression e1 = new Expression(c4t_record.FIELD_RECORD_TYPE, REL_OP.EQ, record_type);
			Expression e2 = new Expression(c4t_record.FIELD_COMMUNITY_ID, REL_OP.IN, ids);
			Expression e3 = new Expression(e1, LOG_OP.AND, e2);
			Expression e4 = new Expression(c4t_record.FIELD_EVENT_DATE, REL_OP.GTEQ, from_time);
			Expression e5 = new Expression(c4t_record.FIELD_EVENT_DATE, REL_OP.LT, to_time);
			Expression e6 = new Expression(e4, LOG_OP.AND, e5);
			Expression e7 = new Expression(e3, LOG_OP.AND, e6);
			Expression e = e7;
			if (expression != null) {
				e = new Expression(e7, LOG_OP.AND, expression);
			}
				
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
	
	public c4t_record getById(String id) {
		return (c4t_record)super.getById(id);
	}
	
	public void updateSentCounter(String id,int total_users_sent, int total_sms_sent, int total_email_sent, 
			int total_app_notification_sent)  {
		c4t_record _record = new c4t_record(id);
		_record.setTotal_user_sent(total_users_sent);
		_record.setTotal_sms_sent(total_sms_sent);
		_record.setTotal_email_sent(total_email_sent);
		_record.setTotal_app_notification_sent(total_app_notification_sent);
		try {
			C4t_recordHelper.getInstance().update(_record);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
