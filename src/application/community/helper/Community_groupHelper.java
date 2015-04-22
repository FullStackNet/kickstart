package application.community.helper;

import platform.helper.BaseHelper;
import application.community.resource.community_group;

public class Community_groupHelper extends BaseHelper {
	private static Community_groupHelper instance;

	public static Community_groupHelper getInstance() {
		if (instance == null)
			instance = new Community_groupHelper();
		return instance;
	}
	
	public Community_groupHelper() {
		super(new community_group());
		// TODO Auto-generated constructor stub
	}
}
