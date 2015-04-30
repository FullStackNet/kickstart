package platform.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.db.Expression;
import platform.db.JoinField;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.c4t_object;
import platform.resource.c4t_record;
import platform.resource.c4t_relation;
import platform.resource.customer;
import platform.resource.sms_daily_analysis;
import platform.util.ApplicationException;


public class C4t_objectHelper extends BaseHelper {
	
	public C4t_objectHelper() {
		super(new c4t_object());
		// TODO Auto-generated constructor stub
	}
	private static C4t_objectHelper instance;
	
	public static C4t_objectHelper getInstance() {
		if (instance == null)
			instance = new C4t_objectHelper();
		return instance;
	}
	
	public BaseResource[] getByObjectType(String object_type, String[] orderby) {
		Expression e = new Expression(c4t_object.FIELD_OBJECT_TYPE, REL_OP.EQ, object_type);
		return getByExpression(e,orderby);
	}
	
	public BaseResource[] getByObjectTypeByCustomerId(String customerId,String object_type, String[] orderby) {
		Expression e1 = new Expression(c4t_object.FIELD_OBJECT_TYPE, REL_OP.EQ, object_type);
		Expression e2 = new Expression(c4t_object.FIELD_CUSTOMER_ID, REL_OP.EQ, customerId);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e,orderby);
	}
	
	public BaseResource[] getByParentId(String parent_id,String object_type, String[] orderby) {
		Expression e1 = new Expression(c4t_object.FIELD_OBJECT_TYPE, REL_OP.EQ, object_type);
		Expression e2 = new Expression(c4t_object.FIELD_PARENT_ID, REL_OP.EQ, parent_id);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e,orderby);
	}
	
	public BaseResource[] getByRelation(String from_id, String relation_type,String[] orderby) {
		BaseResource[] resources = C4t_relationHelper.getInstance().getByRelation(from_id, relation_type);
		return C4t_objectHelper.getInstance().getById(resources, c4t_relation.FIELD_TO_ID,orderby);
	}	
	
	public BaseResource[] getByRelationMap(String from_id, String relation_type,String[] orderby) {
		String[] ids = C4t_relationHelper.getInstance().getByRelationMap(from_id, relation_type);
		return C4t_objectHelper.getInstance().getById(ids,orderby);
	}	

	
	/*public ArrayList<Map<String, Object>> getListMapByUserId(String userId,String record_type,ArrayList<JoinField> joinFields, String[] order) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		String[] ids = User_mapHelper.getInstance().getCommunityIds(userId);
		Expression e1 = new Expression(c4t_record.FIELD_RECORD_TYPE, REL_OP.IN, record_type);
		Expression e2 = new Expression(c4t_record.FIELD_COMMUNITY_ID, REL_OP.IN, ids);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		
		try {
			list =  getByJoining(e,joinFields,order);
		} catch (ApplicationException exp1) {
			// TODO Auto-generated catch block
			exp1.printStackTrace();
		}
		return list;
	}

	public BaseResource[] getByUserId(String userId,String record_type, String[] order) {
		String[] ids = User_mapHelper.getInstance().getCommunityIds(userId);
		Expression e1 = new Expression(c4t_record.FIELD_RECORD_TYPE, REL_OP.IN, record_type);
		Expression e2 = new Expression(c4t_record.FIELD_COMMUNITY_ID, REL_OP.IN, ids);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e,order);
	}
	
	public ArrayList<Map<String, Object>> getByListMapUserIdWithCommunityName(String userId, String[] order) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		HelperFactory.getInstance().register(this);
		ArrayList<JoinField> joinList = new ArrayList<>();
		JoinField jfield = new JoinField("c4t_object", c4t_record.FIELD_COMMUNITY_ID, "community_name");
		joinList.add(jfield);
		String[] ids = User_mapHelper.getInstance().getCommunityIds(userId);
		Expression e = new Expression(c4t_record.FIELD_COMMUNITY_ID, REL_OP.IN, ids);
		try {
			list =  getByJoining(e,joinList,order);
			return list;
		} catch (ApplicationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return list;
		
	}*/
}
