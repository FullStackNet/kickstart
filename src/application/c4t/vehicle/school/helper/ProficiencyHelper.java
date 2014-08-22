package application.c4t.vehicle.school.helper;



import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.proficiency;
import application.c4t.vehicle.school.resource.proficiency_master;


public class ProficiencyHelper extends BaseHelper {
	
	ProficiencyHelper() {
		super(new proficiency());
		// TODO Auto-generated constructor stub
	}
	private static ProficiencyHelper instance;
	
	public static ProficiencyHelper getInstance() {
		if (instance == null)
			instance = new ProficiencyHelper();
		return instance;
	}	
	
	public BaseResource[] getForStudent(String studentId) {
		Expression e = new Expression(proficiency.FIELD_STUDENT_ID, REL_OP.EQ, studentId);
		return getByExpression(e, new String[]{proficiency_master.FIELD_TITLE});
	}
}
