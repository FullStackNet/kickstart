package application.brushupskills.helper;

import platform.helper.BaseHelper;
import application.brushupskills.resource.consumption;

public class ConsumptionHelper extends BaseHelper {

	private static ConsumptionHelper instance;

	public static ConsumptionHelper getInstance() {
		if (instance == null)
			instance = new ConsumptionHelper();
		return instance;
	}
	
	public ConsumptionHelper() {
		super(new consumption());
		// TODO Auto-generated constructor stub
	}
}
