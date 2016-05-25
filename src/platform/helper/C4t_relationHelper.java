package platform.helper;

import java.util.ArrayList;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.c4t_relation;
import platform.util.ApplicationException;
import platform.util.Util;


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
	
	public String[] getByRelation(String from_id, String relation_type, String[] order) {
		Expression e1 = new Expression(c4t_relation.FIELD_FROM_ID, REL_OP.EQ, from_id);
		Expression e2 = new Expression(c4t_relation.FIELD_RELATION_TYPE, REL_OP.EQ, relation_type);
		Expression e = new Expression(e1, LOG_OP.AND,e2);
		
		BaseResource[] resources = C4t_relationHelper.getInstance().getByExpression(e,order);
		if (Util.isEmpty(resources))
			return null;
		
		java.util.List<String> list = new ArrayList<>();
		for(int i=0; i < resources.length; i++) {
			list.add(((c4t_relation)resources[i]).getTo_id());
		}
		return list.toArray(new String[list.size()]);
	}
	
	public String[] getByRelationMap(String from_id, String relation_type) {
		String id =  c4t_relation.getMapId(from_id, relation_type);
		c4t_relation _relation = (c4t_relation)C4t_relationHelper.getInstance().getById(id);
		if (_relation == null)
			return null;
		return _relation.getObject_map().toArray(new String[_relation.getObject_map().size()]);
	}
	
	public String[] getByRelationMap(String from_ids[], String relation_type) {
		ArrayList<String> list = new ArrayList<>();
		
		String[] ids = new String[from_ids.length];
		for(int i =0; i < from_ids.length; i++) {
			ids[i] = c4t_relation.getMapId(from_ids[i], relation_type);
		}
		BaseResource[] _relations = C4t_relationHelper.getInstance().getById(ids);
		if (Util.isEmpty(_relations))
			return null;
		for(int i=0; i < _relations.length; i++) {
			c4t_relation _relation = (c4t_relation)_relations[i];
			if (!Util.isEmpty(_relation.getObject_map())) {
				for(int j=0; j < _relation.getObject_map().size(); j++) {
					list.add(_relation.getObject_map().get(j).toString());
				}
			}
		}
		return list.toArray(new String[list.size()]);
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
		
		relation = new c4t_relation(c4t_relation.id(to_id, from_id, relation_type));
		relation.setFrom_id(to_id);
		relation.setTo_id(from_id);
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
		
		id = c4t_relation.getMapId(to_id, relation_type);
		relation = new c4t_relation(id);
		relation.setFrom_id(to_id);
		relation.setTo_id(from_id);
		relation.setRelation_type(relation_type);
		relation.addObject_map(from_id);
		try {
			C4t_relationHelper.getInstance().AddOrUpdate(relation);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	public void removeRelationMap(String from_id, String relation_type) {
		String id = c4t_relation.getMapId(from_id, relation_type);
		String[] referIds = getByRelationMap(from_id,relation_type);
		if (Util.isEmpty(referIds))
			return;
		C4t_relationHelper.getInstance().deleteById(id);
		for(String referId : referIds) {
			String refer_id = c4t_relation.getMapId(referId, relation_type);
			c4t_relation relation = new c4t_relation(refer_id);
			relation.addObject_map(from_id);
			try {
				C4t_relationHelper.getInstance().unset(relation);
			} catch (ApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
	
	public void removeRelationMap(String from_id,String to_id, String relation_type) {
		String id = c4t_relation.getMapId(from_id, relation_type);
		c4t_relation relation = new c4t_relation(id);
		relation.setFrom_id(from_id);
		relation.setTo_id(to_id);
		relation.setRelation_type(relation_type);
		relation.addObject_map(to_id);
		try {
			C4t_relationHelper.getInstance().unset(relation);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		id = c4t_relation.getMapId(to_id, relation_type);
		relation = new c4t_relation(id);
		relation.setFrom_id(to_id);
		relation.setTo_id(from_id);
		relation.setRelation_type(relation_type);
		relation.addObject_map(from_id);
		try {
			C4t_relationHelper.getInstance().unset(relation);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
}
