package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.chapter;


public class ChapterHelper extends BaseHelper {
	
	ChapterHelper() {
		super(new chapter());
		// TODO Auto-generated constructor stub
	}
	private static ChapterHelper instance;
	
	public static ChapterHelper getInstance() {
		if (instance == null)
			instance = new ChapterHelper();
		return instance;
	}
}
