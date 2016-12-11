package platform.helper;

import platform.resource.c4t_mandi_record;


public class C4t_mandi_recordHelper extends BaseHelper {
	
	public C4t_mandi_recordHelper() {
		super(new c4t_mandi_record());
		// TODO Auto-generated constructor stub
	}
	private static C4t_mandi_recordHelper instance;
	
	public static C4t_mandi_recordHelper getInstance() {
		if (instance == null)
			instance = new C4t_mandi_recordHelper();
		return instance;
	}	
}
