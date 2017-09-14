package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.book_allocation_student;


public class Book_allocation_studentHelper extends BaseHelper {
	
	Book_allocation_studentHelper() {
		super(new book_allocation_student());
		// TODO Auto-generated constructor stub
	}
	private static Book_allocation_studentHelper instance;
	
	public static Book_allocation_studentHelper getInstance() {
		if (instance == null)
			instance = new Book_allocation_studentHelper();
		return instance;
	}
	
	public BaseResource[] getByAllocationId(String allocation_id) {
		Expression e = new Expression(book_allocation_student.FIELD_BOOK_ALLOCATION_ID, REL_OP.EQ, allocation_id);
		return getByExpression(e, new String[]{book_allocation_student.FIELD_STUDENT_NAME});
	}
	
	public BaseResource[] getByStudentId(String[] studentIds) {
		Expression e = new Expression(book_allocation_student.FIELD_STUDENT_ID, REL_OP.IN, studentIds);
		return getByExpression(e, new String[]{book_allocation_student.FIELD_BOOK_NAME});
	}
}
