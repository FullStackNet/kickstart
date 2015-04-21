package application.community.helper;

import platform.helper.BaseHelper;
import application.community.resource.community;

public class CommunityHelper extends BaseHelper {
	private static CommunityHelper instance;

	public static CommunityHelper getInstance() {
		if (instance == null)
			instance = new CommunityHelper();
		return instance;
	}
	
	public CommunityHelper() {
		super(new community());
		// TODO Auto-generated constructor stub
	}
}
