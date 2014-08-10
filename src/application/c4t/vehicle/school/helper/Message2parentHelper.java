package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.message2parent;


public class Message2parentHelper extends BaseHelper {
	
	Message2parentHelper() {
		super(new message2parent());
		// TODO Auto-generated constructor stub
	}
	private static Message2parentHelper instance;
	
	public static Message2parentHelper getInstance() {
		if (instance == null)
			instance = new Message2parentHelper();
		return instance;
	}
	
	public BaseResource[] getBySchool(String[] schoolIds) {
		Expression e = new Expression(message2parent.FIELD_SCHOOL_ID,REL_OP.IN, schoolIds);
		return getByExpression(e, new String[]{message2parent.FIELD_LAST_UPDATED +" desc"});
	}
	
	public BaseResource[] getByStudent(String studentId) {
		Expression e = new Expression(message2parent.FIELD_STUDENT_ID,REL_OP.EQ, studentId);
		return getByExpression(e, new String[]{message2parent.FIELD_LAST_UPDATED +" desc"});
	}
	
	public BaseResource[] getByUser(String userId) {
		String[] schoolIds = School_user_mapHelper.getInstance().getSchoolIds(userId);
		return getBySchool(schoolIds);
	}
		
}
