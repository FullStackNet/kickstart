package platform.helper;

import platform.resource.profile;


public class Rule_actionHelper extends BaseHelper {
	
	public Rule_actionHelper() {
		super(new profile());
		// TODO Auto-generated constructor stub
	}
	private static Rule_actionHelper instance;
	
	public static Rule_actionHelper getInstance() {
		if (instance == null)
			instance = new Rule_actionHelper();
		return instance;
	}
}
