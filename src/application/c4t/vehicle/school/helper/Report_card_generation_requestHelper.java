package application.c4t.vehicle.school.helper;



import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.report_card_generation_request;


public class Report_card_generation_requestHelper extends BaseHelper {

	Report_card_generation_requestHelper() {
		super(new report_card_generation_request());
		// TODO Auto-generated constructor stub
	}
	private static Report_card_generation_requestHelper instance;

	public static Report_card_generation_requestHelper getInstance() {
		if (instance == null)
			instance = new Report_card_generation_requestHelper();
		return instance;
	}	

	BaseResource[] getSchoolRequest(String[] schoolIds) {
		Expression e = new Expression(report_card_generation_request.FIELD_SCHOOL_ID, REL_OP.IN, schoolIds);
		return getByExpression(e, new String[]{report_card_generation_request.FIELD_CREATION_TIME + " desc"});
	}
	
	public BaseResource[] getRequest(String userId) {
		String[] schoolIds = School_user_mapHelper.getInstance().getSchoolIds(userId);
		return  getSchoolRequest(schoolIds);
	}
}
