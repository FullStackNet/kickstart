package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.batch_signup_book;


public class Batch_signup_bookHelper extends BaseHelper {
	
	Batch_signup_bookHelper() {
		super(new batch_signup_book());
		// TODO Auto-generated constructor stub
	}
	private static Batch_signup_bookHelper instance;
	
	public static Batch_signup_bookHelper getInstance() {
		if (instance == null)
			instance = new Batch_signup_bookHelper();
		return instance;
	}
}
