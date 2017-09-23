package platform.alert;

import platform.appliances.ApplianceConstants;
import platform.helper.ApplianceHelper;
import platform.helper.Appliance_mapHelper;
import platform.helper.User_mapHelper;
import platform.resource.BaseResource;
import platform.resource.alert;
import platform.resource.appliance;
import platform.resource.user;
import platform.util.ApplicationException;
import platform.util.Util;

public class LowFuelLevelAlertTask extends AlertTask {

	public LowFuelLevelAlertTask() {
		super(AlertFactory.ALERT_LOW_FUEL);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process(alert alert) {
		// TODO Auto-generated method stub
		String applianceId = alert.getApplinace_id();
		appliance _appliance = ApplianceHelper.getInstance().getById(applianceId);
		if (_appliance == null) return;
		try {
			Appliance_mapHelper.getInstance().addAlert(applianceId, alert.getId());
			if (_appliance.getType().equals(ApplianceConstants.APPLIANCE_TYPE_DG)) {
				BaseResource[] admins = Appliance_mapHelper.getInstance().getAdmins(applianceId);
				if (!Util.isEmpty(admins)) {
					for(BaseResource resource : admins) {
						user admin = (user) resource;
						User_mapHelper.getInstance().addAlert(admin.getId(), alert.getId());
					}
				}
			}
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
