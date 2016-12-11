package platform.helper;

import platform.resource.sim;


public class SimHelper extends BaseHelper {
	
	public SimHelper() {
		super(new sim());
		// TODO Auto-generated constructor stub
	}
	private static SimHelper instance;
	
	public static SimHelper getInstance() {
		if (instance == null)
			instance = new SimHelper();
		return instance;
	}
}
