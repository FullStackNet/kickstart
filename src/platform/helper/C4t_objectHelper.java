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
import platform.util.ApplicationException;
import platform.util.Util;


public class C4t_objectHelper extends BaseHelper {
	
	public C4t_objectHelper() {
		super(new c4t_object());
		// TODO Auto-generated constructor stub
	}
	private static C4t_objectHelper instance;
	
	public c4t_object getById(String id) {
		return (c4t_object)super.getById(id);
	}
	public static C4t_objectHelper getInstance() {
		if (instance == null)
			instance = new C4t_objectHelper();
		return instance;
	}
	
	public void updateUserId(String id, String userId) {
		c4t_object _object = new c4t_object();
		_object.setId(id);
		_object.setUser_id(userId);
		try {
			C4t_objectHelper.getInstance().update(_object);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	
	public BaseResource[] getByCommunityId(String community_id,String object_type, String[] orderby) {
		Expression e1 = new Expression(c4t_object.FIELD_OBJECT_TYPE, REL_OP.EQ, object_type);
		Expression e2 = new Expression(c4t_object.FIELD_COMMUNITY_ID, REL_OP.EQ, community_id);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e,orderby);
	}
	
	public BaseResource[] getProducts(String community_id, String[] orderby) {
		Expression e1 = new Expression(c4t_object.FIELD_OBJECT_TYPE, REL_OP.EQ, "COMMUNITY_PRODUCT");
		Expression e2 = new Expression(c4t_object.FIELD_COMMUNITY_ID, REL_OP.EQ, community_id);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e,orderby);
	}
	
	public BaseResource[] getMentors(String community_id, String[] orderby) {
		Expression e1 = new Expression(c4t_object.FIELD_OBJECT_TYPE, REL_OP.EQ, "COMMUNITY_MEMBER");
		Expression e2 = new Expression(c4t_object.FIELD_COMMUNITY_ID, REL_OP.EQ, community_id);
		Expression e3 = new Expression(c4t_object.FIELD_MENTOR, REL_OP.EQ, "Y");
		Expression e4 = new Expression(e1, LOG_OP.AND, e2);
		Expression e = new Expression(e3, LOG_OP.AND, e4);
		return getByExpression(e,orderby);
	}
	
	public BaseResource[] getMemeberByMentor(String community_id,String mentorId, String[] orderby) {
		Expression e1 = new Expression(c4t_object.FIELD_OBJECT_TYPE, REL_OP.EQ, "COMMUNITY_MEMBER");
		Expression e2 = new Expression(c4t_object.FIELD_COMMUNITY_ID, REL_OP.EQ, community_id);
		Expression e3 = new Expression(c4t_object.FIELD_MENTOR_ID, REL_OP.EQ, mentorId);
		Expression e4 = new Expression(e1, LOG_OP.AND, e2);
		Expression e = new Expression(e3, LOG_OP.AND, e4);
		return getByExpression(e,orderby);
	}
	
	public BaseResource[] getByRelation(String[] from_ids, String relation_type) {
		String[] ids = C4t_relationHelper.getInstance().getByRelationMap(from_ids, relation_type);
		if (Util.isEmpty(ids)) {
			return null;
		}
		return C4t_objectHelper.getInstance().getById(ids);
	}	
	
	public BaseResource[] getByRelation(String[] from_ids, String relation_type,String[] orderby) {
		String[] ids = C4t_relationHelper.getInstance().getByRelationMap(from_ids, relation_type);
		if (Util.isEmpty(ids)) {
			return null;
		}
		return C4t_objectHelper.getInstance().getById(ids,orderby);
	}	
	
	public BaseResource[] getByRelation(String from_id, String relation_type,String[] orderby) {
		BaseResource[] resources = C4t_relationHelper.getInstance().getByRelation(from_id, relation_type);
		if (Util.isEmpty(resources)) {
			return null;
		}
		return C4t_objectHelper.getInstance().getById(resources, c4t_relation.FIELD_TO_ID,orderby);
	}	
	
	public BaseResource[] getByRelationMap(String from_id, String relation_type,String[] orderby) {
		String[] ids = C4t_relationHelper.getInstance().getByRelationMap(from_id, relation_type);
		if (Util.isEmpty(ids)) {
			return null;
		}
		return C4t_objectHelper.getInstance().getById(ids,orderby);
	}	

	public BaseResource[] getByRelationMap(String from_id, Expression condition, String relation_type,String[] orderby) {
		String[] ids = C4t_relationHelper.getInstance().getByRelationMap(from_id, relation_type);
		if (Util.isEmpty(ids)) {
			return null;
		}
		Expression e1 = new Expression(c4t_object.FIELD_ID, REL_OP.IN, ids);
		Expression e = new Expression(condition, LOG_OP.AND, e1);
		return C4t_objectHelper.getInstance().getByExpression(e,orderby);
	}	
	
	public BaseResource[] getByRelationMap(String from_id, String relation_type) {
		String[] ids = C4t_relationHelper.getInstance().getByRelationMap(from_id, relation_type);
		if (Util.isEmpty(ids)) {
			return null;
		}
		return C4t_objectHelper.getInstance().getById(ids);
	}	
	
	public BaseResource[] getByRecordMap(String from_id, String relation_type,String[] orderby) {
		String[] ids = C4t_record_mapHelper.getInstance().getByRelationMap(from_id, relation_type);
		if (Util.isEmpty(ids)) {
			return null;
		}
		return C4t_objectHelper.getInstance().getById(ids,orderby);
	}	

	public BaseResource[] getByRecordMap(String from_id, String relation_type) {
		String[] ids = C4t_record_mapHelper.getInstance().getByRelationMap(from_id, relation_type);
		if (Util.isEmpty(ids)) {
			return null;
		}
		return C4t_objectHelper.getInstance().getById(ids);
	}
	
	public BaseResource[] getByRecordMap(String[] from_id, String relation_type) {
		String[] ids = C4t_record_mapHelper.getInstance().getByRelationMap(from_id, relation_type);
		if (Util.isEmpty(ids)) {
			return null;
		}
		return C4t_objectHelper.getInstance().getById(ids);
	}
	
	public ArrayList<Map<String, Object>> getListMapByUserIdForCommunity(String userId,String record_type,ArrayList<JoinField> joinFields, String[] order) {
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

	public BaseResource[] getByUserIdForCommunity(String userId,String record_type, String[] order) {
		String[] ids = User_mapHelper.getInstance().getCommunityIds(userId);
		Expression e1 = new Expression(c4t_record.FIELD_RECORD_TYPE, REL_OP.EQ, record_type);
		Expression e2 = new Expression(c4t_record.FIELD_COMMUNITY_ID, REL_OP.IN, ids);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e,order);
	}
	
	public BaseResource[] getForCommunity(String userId,String communityId, String object_type, String[] order) {
		//String[] ids = User_mapHelper.getInstance().getCommunityIds(userId);
		/// need to check here validity
		Expression e1 = new Expression(c4t_object.FIELD_OBJECT_TYPE, REL_OP.EQ, object_type);
		Expression e2 = new Expression(c4t_record.FIELD_COMMUNITY_ID, REL_OP.EQ, communityId);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e,order);
	}
	
	public c4t_object getByFlat_no(String community_id,String flat_no) {
		Expression e1 = new Expression(c4t_object.FIELD_OBJECT_TYPE, REL_OP.EQ, "COMMUNITY_FLAT");
		Expression e2 = new Expression(c4t_object.FIELD_NAME, REL_OP.EQ, flat_no);
		Expression e3 = new Expression(c4t_object.FIELD_PARENT_ID, REL_OP.EQ, community_id);
		Expression e4 = new Expression(e1, LOG_OP.AND, e2);
		Expression e = new Expression(e3, LOG_OP.AND, e4);
		BaseResource[] resources =  C4t_objectHelper.getInstance().getByExpression(e);
		if (Util.isEmpty(resources)) 
			return null;
		return (c4t_object)resources[0];
	}

	public BaseResource[] getByGlobal4ObjectTypeByMobileNo(String mobile_no) {
		Expression e1 = new Expression(c4t_object.FIELD_OBJECT_TYPE, REL_OP.EQ, "COMMUNITY_MEMBER");
		Expression e2 = new Expression(c4t_object.FIELD_MOBILE_NO, REL_OP.EQ, mobile_no);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return  C4t_objectHelper.getInstance().getByExpression(e);
	}
	
	/*public ArrayList<Map<String, Object>> getByListMapUserIdWithCommunityName(String userId, String[] order) {
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
