package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.book_allocation;
import application.c4t.vehicle.school.resource.test_allocation;


public class Book_allocationHelper extends BaseHelper {
	
	Book_allocationHelper() {
		super(new book_allocation());
		// TODO Auto-generated constructor stub
	}
	private static Book_allocationHelper instance;
	
	public static Book_allocationHelper getInstance() {
		if (instance == null)
			instance = new Book_allocationHelper();
		return instance;
	}
	
	public BaseResource[]  getByBatchId(String batch_id) {
		Expression e = new Expression(test_allocation.FIELD_BATCH_ID,REL_OP.EQ, batch_id);
		return getByExpression(e);
	}
}
