package platform.helper;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.c4t_object;
import platform.resource.c4t_relation;
import platform.resource.customer;


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
}
