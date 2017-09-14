package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.book;


public class BookHelper extends BaseHelper {
	
	BookHelper() {
		super(new book());
		// TODO Auto-generated constructor stub
	}
	private static BookHelper instance;
	
	public static BookHelper getInstance() {
		if (instance == null)
			instance = new BookHelper();
		return instance;
	}
	
}
