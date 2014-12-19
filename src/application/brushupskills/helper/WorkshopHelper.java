package application.brushupskills.helper;

import platform.helper.BaseHelper;
import application.brushupskills.resource.workshop;

public class WorkshopHelper extends BaseHelper {

	private static WorkshopHelper instance;

	public static WorkshopHelper getInstance() {
		if (instance == null)
			instance = new WorkshopHelper();
		return instance;
	}
	
	public WorkshopHelper() {
		super(new workshop());
		// TODO Auto-generated constructor stub
	}
}
