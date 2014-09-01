package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.work_sheet;


public class Work_sheetHelper extends BaseHelper {
	
	public Work_sheetHelper() {
		super(new work_sheet());
		// TODO Auto-generated constructor stub
	}
	private static Work_sheetHelper instance;
	
	public static Work_sheetHelper getInstance() {
		if (instance == null)
			instance = new Work_sheetHelper();
		return instance;
	}
}
