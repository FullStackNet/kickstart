package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.book_chapter;


public class Book_chapterHelper extends BaseHelper {
	
	Book_chapterHelper() {
		super(new book_chapter());
		// TODO Auto-generated constructor stub
	}
	private static Book_chapterHelper instance;
	
	public static Book_chapterHelper getInstance() {
		if (instance == null)
			instance = new Book_chapterHelper();
		return instance;
	}
	
}
