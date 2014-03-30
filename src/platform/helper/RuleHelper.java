package platform.helper;

import platform.resource.rule;


public class RuleHelper extends BaseHelper {
	
	public RuleHelper() {
		super(new rule());
		// TODO Auto-generated constructor stub
	}
	private static RuleHelper instance;
	
	public static RuleHelper getInstance() {
		if (instance == null)
			instance = new RuleHelper();
		return instance;
	}
}
