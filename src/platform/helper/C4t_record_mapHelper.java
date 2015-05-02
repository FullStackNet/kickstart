package platform.helper;

import platform.resource.c4t_record_map;
import platform.util.ApplicationException;


public class C4t_record_mapHelper extends BaseHelper {
	
	public C4t_record_mapHelper() {
		super(new c4t_record_map());
		// TODO Auto-generated constructor stub
	}
	private static C4t_record_mapHelper instance;
	
	public static C4t_record_mapHelper getInstance() {
		if (instance == null)
			instance = new C4t_record_mapHelper();
		return instance;
	}	
	
	public String[] getByRelationMap(String from_id, String relation_type) {
		String id =  c4t_record_map.getMapId(from_id, relation_type);
		c4t_record_map _map = (c4t_record_map)C4t_record_mapHelper.getInstance().getById(id);
		if (_map == null)
			return null;
		return _map.getRecord_map().toArray(new String[_map.getRecord_map().size()]);
	}
	
	
	public void addRelationMap(String record_id,String to_id, String relation_type) {
		String id = c4t_record_map.getMapId(record_id, relation_type);
		c4t_record_map relation = new c4t_record_map(id);
		relation.setRecord_id(record_id);
		relation.setReference_id(to_id);
		relation.setRecord_map_type(relation_type);
		relation.addRecord_map(to_id);
		try {
			C4t_record_mapHelper.getInstance().AddOrUpdate(relation);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
