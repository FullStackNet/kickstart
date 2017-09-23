package platform.helper;

import platform.resource.rule_condition;


public class Rule_conditionHelper extends BaseHelper {
	
	public Rule_conditionHelper() {
		super(new rule_condition());
		// TODO Auto-generated constructor stub
	}
	private static Rule_conditionHelper instance;
	
	public static Rule_conditionHelper getInstance() {
		if (instance == null)
			instance = new Rule_conditionHelper();
		return instance;
	}
}
