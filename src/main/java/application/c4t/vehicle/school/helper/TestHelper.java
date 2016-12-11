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
	
	public void updateMarkStat(String testId,Double marks) {
		if (marks == null)
			return;
		test _test = (test)TestHelper.getInstance().getById(testId);
		test __test = new test(testId);
		try {
			__test.setTotal_student_attempted(_test.getTotal_student_attemptedEx()+1);
			__test.setTotal_test_marks(_test.getTotal_test_marksEx()+marks.longValue());
			__test.setAverage_marks(__test.getTotal_test_marksEx()/__test.getTotal_student_attempted());
			if (_test.getHighest_marksEx() < marks) {
				__test.setHighest_marks(marks.longValue());	
			}
			TestHelper.getInstance().update(__test);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
