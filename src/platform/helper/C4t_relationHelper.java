package platform.helper;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.c4t_relation;
import platform.util.ApplicationException;


public class C4t_relationHelper extends BaseHelper {
	
	public C4t_relationHelper() {
		super(new c4t_relation());
		// TODO Auto-generated constructor stub
	}
	private static C4t_relationHelper instance;
	
	public static C4t_relationHelper getInstance() {
		if (instance == null)
			instance = new C4t_relationHelper();
		return instance;
	}
	
	public BaseResource[] getByRelation(String from_id, String relation_type) {
		Expression e1 = new Expression(c4t_relation.FIELD_FROM_ID, REL_OP.EQ, from_id);
		Expression e2 = new Expression(c4t_relation.FIELD_RELATION_TYPE, REL_OP.EQ, relation_type);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e);	
	}
	
	public String[] getByRelationMap(String from_id, String relation_type) {
		String id =  c4t_relation.getMapId(from_id, relation_type);
		c4t_relation _relation = (c4t_relation)C4t_relationHelper.getInstance().getById(id);
		if (_relation == null)
			return null;
		return _relation.getObject_map().toArray(new String[_relation.getObject_map().size()]);
	}
	
	public void addRelation(String from_id,String to_id, String relation_type) {
		c4t_relation relation = new c4t_relation(c4t_relation.id(from_id, to_id, relation_type));
		relation.setFrom_id(from_id);
		relation.setTo_id(to_id);
		relation.setRelation_type(relation_type);
		try {
			C4t_relationHelper.getInstance().AddOrUpdate(relation);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	public void addRelationMap(String from_id,String to_id, String relation_type) {
		String id = c4t_relation.getMapId(from_id, relation_type);
		c4t_relation relation = new c4t_relation(id);
		relation.setFrom_id(from_id);
		relation.setTo_id(to_id);
		relation.setRelation_type(relation_type);
		relation.addObject_map(to_id);
		try {
			C4t_relationHelper.getInstance().AddOrUpdate(relation);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
