package platform.helper;

import platform.resource.c4t_object;


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
	
}
