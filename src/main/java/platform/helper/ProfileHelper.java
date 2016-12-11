package platform.helper;

import platform.resource.profile;


public class ProfileHelper extends BaseHelper {
	
	public ProfileHelper() {
		super(new profile());
		// TODO Auto-generated constructor stub
	}
	private static ProfileHelper instance;
	
	public static ProfileHelper getInstance() {
		if (instance == null)
			instance = new ProfileHelper();
		return instance;
	}
}
