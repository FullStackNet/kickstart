package application.community.helper;

import platform.helper.BaseHelper;
import application.community.resource.community_member;

public class Community_memberHelper extends BaseHelper {
	private static Community_memberHelper instance;

	public static Community_memberHelper getInstance() {
		if (instance == null)
			instance = new Community_memberHelper();
		return instance;
	}
	
	public Community_memberHelper() {
		super(new community_member());
		// TODO Auto-generated constructor stub
	}
}
