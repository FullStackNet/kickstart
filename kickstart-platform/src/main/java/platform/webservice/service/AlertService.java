package platform.webservice.service;

import java.util.Date;
import java.util.Map;

import platform.appliances.Appliance;
import platform.db.Expression;
import platform.db.REL_OP;
import platform.exception.ExceptionEnum;
import platform.helper.AlertHelper;
import platform.helper.ApplianceHelper;
import platform.helper.HelperUtils;
import platform.helper.User_mapHelper;
import platform.message.Alert;
import platform.resource.BaseResource;
import platform.resource.alert;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;


public class AlertService extends BaseService{
	public AlertService() {
		super(AlertHelper.getInstance(),new alert());
	}

	void clear_alarm(ServletContext ctx, BaseResource resource) {
		alert _alert = (alert)AlertHelper.getInstance().getById(resource.getId());
		if (_alert == null)
			return;
		alert upd_alert = new alert(_alert.getId());
		upd_alert.setCleared("Y");
		upd_alert.setAlarm_cleared_time(new Date().getTime());
		upd_alert.setAlert_cleared_type("MANUAL");
		try {
			AlertHelper.getInstance().update(upd_alert);
		} catch (ApplicationException e) {
			e.printStackTrace();
		}
		if (Appliance.isAppliance(_alert.getDevice_type())) {
			ApplianceHelper.getInstance().updateAlertSummary(_alert.getDevice_id());
		}
	}
	public void action(ServletContext ctx, BaseResource resource,String action) throws ApplicationException {
		if (action.equalsIgnoreCase("clear")) {
			clear_alarm(ctx, resource);
			return;
		}
	}
	
	private enum QueryTypes {

		//Expects emailId. Returns the profile associated with this emailId.
		QUERY_USER_ALERT {
			public String toString() {
				return "QUERY_USER_ALERT";
			}
		},
		QUERY_CUSTOMER_ALERT {
			public String toString() {
				return "QUERY_CUSTOMER_ALERT";
			}
		}
	};

	public BaseResource[] getQuery(ServletContext ctx, String queryId, Map<String, Object> map) throws ApplicationException {
		if(QueryTypes.QUERY_USER_ALERT.toString().equals(queryId)) {
			System.out.println("Received Query "+queryId);
			String userId = ctx.getUserId();
			if (userId == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Session is expired or not authenticated.");
			}
			return User_mapHelper.getInstance().getAlertArray(userId);
		} else if(QueryTypes.QUERY_CUSTOMER_ALERT.toString().equals(queryId)) {
			Expression e = new Expression(alert.FIELD_CLEARED, REL_OP.EQ,"N");
			return  AlertHelper.getInstance().getByCustomerId(e,ctx.getCustomerId(), new String[]{alert.FIELD_ALERT_TIME+ " desc"});
		}
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_QUERY);
	}
}
