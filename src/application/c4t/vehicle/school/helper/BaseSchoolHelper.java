package application.c4t.vehicle.school.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.helper.BaseHelper;
import platform.helper.Sms_daily_analysisHelper;
import platform.resource.BaseResource;
import platform.resource.sms_daily_analysis;

public class BaseSchoolHelper extends BaseHelper {

	public BaseSchoolHelper(BaseResource resource) {
		super(resource);
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<Map<String, Object>> getForSchools(String userId,String[] order) {
		String[] schoolIds = School_user_mapHelper.getInstance().getSchoolIds(userId);
		try {
			return  Sms_daily_analysisHelper.getInstance().getForSchools(schoolIds,new String[]{sms_daily_analysis.FIELD_DATE});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ArrayList<Map<String, Object>>();
	}
}
