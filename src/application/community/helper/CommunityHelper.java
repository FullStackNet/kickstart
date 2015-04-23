package application.community.helper;

import platform.helper.BaseHelper;
import platform.resource.c4t_object;

public class CommunityHelper extends BaseHelper   {
	private static CommunityHelper instance;

	public static CommunityHelper getInstance() {
		if (instance == null)
			instance = new CommunityHelper();
		return instance;
	}
	public CommunityHelper() {
		super(new c4t_object());
		// TODO Auto-generated constructor stub
	}
}
