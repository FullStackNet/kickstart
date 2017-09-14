package platform.schedule;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.schedule;
import platform.util.ApplicationException;
import platform.util.Util;
import application.c4t.vehicle.school.helper.Test_allocation_studentHelper;
import application.c4t.vehicle.school.resource.test_allocation_student;

public class ResultDeclareScheduleTask extends ScheduleTask {

	public ResultDeclareScheduleTask() {
		super(ScheduleFactory.RESULT_DECLARE);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void process(schedule _schedule) {
		// TODO Auto-generated method stub
			System.out.println("Need to process the Result Declare task " + _schedule.getId());
			String allocation_id = _schedule.getReference_id();
			Expression e = new Expression(test_allocation_student.FIELD_TEST_ALLOCATION_ID, REL_OP.EQ, allocation_id);
			BaseResource[] resources = Test_allocation_studentHelper.getInstance().getByExpression(e);
			if (Util.isEmpty(resources))
				return;
			for(int i=0; i < resources.length; i++) {
				test_allocation_student _student_allocation = new test_allocation_student(resources[i].getId());
				_student_allocation.setShow_result("Y");
				try {
					Test_allocation_studentHelper.getInstance().update(_student_allocation);
				} catch (ApplicationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
	}

}
