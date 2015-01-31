package platform.helper;

import platform.resource.BaseResource;
import platform.resource.sms_daily_analysis;
import platform.resource.sms_log;
import platform.util.ApplicationException;
import application.c4t.vehicle.school.helper.BaseSchoolHelper;



public class Sms_daily_analysisHelper extends BaseSchoolHelper {
	public Sms_daily_analysisHelper(BaseResource resource) {
		super(resource);
		// TODO Auto-generated constructor stub
	}

	private static Sms_daily_analysisHelper instance;

	public static Sms_daily_analysisHelper getInstance() {
		if (instance == null)
			instance = new Sms_daily_analysisHelper();
		return instance;
	}

	Sms_daily_analysisHelper() {
		super(new sms_daily_analysis());
		// TODO Auto-generated constructor stub
	}
	
	public String createAnalysis(sms_log _log) {
		String key = sms_daily_analysis.id(_log.getDate(), _log.getSchool_id(), _log.getReason());
		sms_daily_analysis _analysis = (sms_daily_analysis)Sms_daily_analysisHelper.getInstance().getById(key);
		if (_analysis == null) {
			_analysis = new sms_daily_analysis(key);
			_analysis.setDate(_log.getDate());
			_analysis.setReason(_log.getReason());
			_analysis.setSchool_id(_log.getSchool_id());
			_analysis.setSchool_name(_log.getSchool_name());
			_analysis.setInvoke_count(1);
			try {
				Sms_daily_analysisHelper.getInstance().add(_analysis);
			} catch (ApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try {
				Sms_daily_analysisHelper.getInstance().incrementCounter(key, sms_daily_analysis.FIELD_INVOKE_COUNT, 1);
			} catch (ApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return key;
	}
	
}
