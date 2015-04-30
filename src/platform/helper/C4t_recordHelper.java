package platform.helper;

import platform.resource.c4t_record;


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
}
