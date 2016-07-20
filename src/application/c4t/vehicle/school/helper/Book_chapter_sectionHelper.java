package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.book_chapter_section;


public class Book_chapter_sectionHelper extends BaseHelper {
	
	Book_chapter_sectionHelper() {
		super(new book_chapter_section());
		// TODO Auto-generated constructor stub
	}
	private static Book_chapter_sectionHelper instance;
	
	public static Book_chapter_sectionHelper getInstance() {
		if (instance == null)
			instance = new Book_chapter_sectionHelper();
		return instance;
	}
}
