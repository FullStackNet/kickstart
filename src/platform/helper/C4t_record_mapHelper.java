package platform.helper;

import platform.resource.BaseResource;
import platform.resource.c4t_record;
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
	
	public void manageRecentEntry(String key,String relation_type,int max_entry) {
		String id = c4t_record_map.getMapId(key, relation_type);
		c4t_record_map _map = (c4t_record_map) C4t_record_mapHelper.getInstance().getById(id);
		if (_map == null)
			return;
		if (_map.getRecord_map().size() > max_entry) {
			String[] ids = _map.getRecord_map().toArray(new String[_map.getRecord_map().size()]);
			BaseResource[] resources = C4t_recordHelper.getInstance().getById(ids, new String[]{c4t_record.FIELD_CREATION_TIME+" desc"});
			int extra = resources.length - max_entry;
			while (extra > 0) {
				c4t_record_map _record_map = new c4t_record_map(id);
				_record_map.addRecord_map(resources[max_entry+extra-1].getId());
				try {
					C4t_record_mapHelper.getInstance().unset(_record_map);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				extra--;
			}
		}
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
