package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import platform.util.ApplicationException;
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
	public void updateSend(String id) throws ApplicationException {
		notice _notice = new notice(id);
		_notice.setSent("Y");
		update(_notice);
	}
}
