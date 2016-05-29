package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.test_allocation_student;


public class Test_allocation_studentHelper extends BaseHelper {
	
	Test_allocation_studentHelper() {
		super(new test_allocation_student());
		// TODO Auto-generated constructor stub
	}
	private static Test_allocation_studentHelper instance;
	
	public static Test_allocation_studentHelper getInstance() {
		if (instance == null)
			instance = new Test_allocation_studentHelper();
		return instance;
	}
	
	public BaseResource[] getByAllocationId(String allocation_id) {
		Expression e = new Expression(test_allocation_student.FIELD_TEST_ALLOCATION_ID, REL_OP.EQ, allocation_id);
		return getByExpression(e, new String[]{test_allocation_student.FIELD_STUDENT_NAME});
	}
}
