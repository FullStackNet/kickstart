package platform.helper;

import platform.resource.c4t_record_map;


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
	
	
}
