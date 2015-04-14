package application.c4t.vehicle.school.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.db.Expression;
import platform.db.JoinField;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.helper.Sms_daily_analysisHelper;
import platform.resource.BaseResource;
import platform.resource.sms_daily_analysis;
import platform.util.ApplicationException;

public class BaseSchoolHelper extends BaseHelper {

	public BaseSchoolHelper(BaseResource resource) {
		super(resource);
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<Map<String, Object>> getForSchools(String userId,String[] order) {
		String[] schoolIds = School_user_mapHelper.getInstance().getSchoolIds(userId);
		try {
			return  getForSchools(schoolIds,new String[]{sms_daily_analysis.FIELD_DATE});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ArrayList<Map<String, Object>>();
	}
	
	
	
	public ArrayList<Map<String, Object>> getListMapByUserId(String userId,ArrayList<JoinField> joinFields, String[] order) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		String[] schoolIds = School_user_mapHelper.getInstance().getSchoolIds(userId);
		Expression e = new Expression("school_id", REL_OP.IN, schoolIds);
		try {
			list =  getByJoining(e,joinFields,order);
		} catch (ApplicationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return list;
	}
}
