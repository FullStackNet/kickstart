package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import application.c4t.vehicle.school.resource.daily_activity;
import application.c4t.vehicle.school.resource.signature;


public class SignatureHelper extends BaseHelper {
	
	SignatureHelper() {
		super(new signature());
		// TODO Auto-generated constructor stub
	}
	private static SignatureHelper instance;
	
	public static SignatureHelper getInstance() {
		if (instance == null)
			instance = new SignatureHelper();
		return instance;
	}
	public BaseResource[] getForSchools(String[] schools) {
		Expression e = new Expression(daily_activity.FIELD_SCHOOL_ID, REL_OP.IN, schools);
		return getByExpression(e, new String[]{signature.FIELD_NAME});
	}
	
	public BaseResource[] getForAdmin(String userId) {
		String[] schoolIds = School_user_mapHelper.getInstance().getSchoolIds(userId);
		return  SignatureHelper.getInstance().getForSchools(schoolIds);
	}
	
	public void updateFileName(String id,String filename) {
		signature _record = new signature();
		_record.setId(id);
		_record.setFilename(filename);
		try {
			update(_record);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
