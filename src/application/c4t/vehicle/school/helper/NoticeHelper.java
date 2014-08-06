package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.notice;


public class NoticeHelper extends BaseHelper {
	
	NoticeHelper() {
		super(new notice());
		// TODO Auto-generated constructor stub
	}
	private static NoticeHelper instance;
	
	public static NoticeHelper getInstance() {
		if (instance == null)
			instance = new NoticeHelper();
		return instance;
	}
	
	
	
}
