package application.community.helper;

import platform.helper.BaseHelper;
import platform.resource.c4t_object;

public class Community_groupHelper extends BaseHelper {
	private static Community_groupHelper instance;

	public static Community_groupHelper getInstance() {
		if (instance == null)
			instance = new Community_groupHelper();
		return instance;
	}
	
	public Community_groupHelper() {
		super(new c4t_object());
		// TODO Auto-generated constructor stub
	}
}
