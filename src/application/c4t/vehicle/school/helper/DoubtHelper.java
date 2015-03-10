package application.c4t.vehicle.school.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.db.Expression;
import platform.db.JoinField;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.util.ApplicationException;
import application.c4t.vehicle.school.resource.doubt;


public class DoubtHelper extends BaseHelper {
	
	DoubtHelper() {
		super(new doubt());
		// TODO Auto-generated constructor stub
	}
	private static DoubtHelper instance;
	
	public static DoubtHelper getInstance() {
		if (instance == null)
			instance = new DoubtHelper();
		return instance;
	}
	
	
	
	public ArrayList<Map<String, Object>> getByJoin4StudentId(String student_id,ArrayList<JoinField> list) throws ApplicationException {
		Expression e = new Expression(doubt.FIELD_STUDENT_ID, REL_OP.EQ, student_id);
		return getByJoining(e,list, new String[]{doubt.FIELD_CREATION_TIME});
	}
}
