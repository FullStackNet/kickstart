package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import platform.util.ApplicationException;
import application.c4t.vehicle.school.resource.test;


public class TestHelper extends BaseHelper {
	
	TestHelper() {
		super(new test());
		// TODO Auto-generated constructor stub
	}
	private static TestHelper instance;
	
	public static TestHelper getInstance() {
		if (instance == null)
			instance = new TestHelper();
		return instance;
	}
	
	public void incrementAttempted(String testId) {
		incrementAttempted(testId,1);
	}
	public void incrementAttempted(String testId,int increment) {
		try {
			TestHelper.getInstance().incrementCounter(testId, test.FIELD_TOTAL_STUDENT_ATTEMPTED, increment);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	public void updateHighestMarks(String testId,Double marks) {
		if (marks == null)
			return;
		test _test = (test)TestHelper.getInstance().getById(testId);
		test __test = new test(testId);
		try {
			if (_test.getHighest_marksEx() < marks) {
				__test.setHighest_marks(marks.longValue());	
				TestHelper.getInstance().update(__test);
			}
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
