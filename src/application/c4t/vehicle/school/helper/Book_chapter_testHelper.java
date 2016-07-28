package application.c4t.vehicle.school.helper;

import application.c4t.vehicle.school.resource.book_chapter_test;
import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;


public class Book_chapter_testHelper extends BaseHelper {
	
	Book_chapter_testHelper() {
		super(new book_chapter_test());
		// TODO Auto-generated constructor stub
	}
	private static Book_chapter_testHelper instance;
	
	public static Book_chapter_testHelper getInstance() {
		if (instance == null)
			instance = new Book_chapter_testHelper();
		return instance;
	}
	
	public BaseResource[] getTestByChapterId(String chapterId) {
		Expression e = new Expression(book_chapter_test.FIELD_CHAPTER_ID, REL_OP.EQ, chapterId);
		return getByExpression(e, new String[]{"order"});
	}
}
