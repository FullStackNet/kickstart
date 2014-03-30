package platform.notification;

import platform.appliances.ApplianceConstants;
import platform.helper.ApplianceHelper;
import platform.helper.Appliance_mapHelper;
import platform.helper.User_mapHelper;
import platform.resource.BaseResource;
import platform.resource.appliance;
import platform.resource.notification;
import platform.resource.user;
import platform.util.ApplicationException;
import platform.util.Util;

public class FuelAddedNotificationTask extends NotificationTask {

	public FuelAddedNotificationTask() {
		super(NotificationFactory.NOTIFICATION_FUEL_ADDED);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process(notification notification) {
		// TODO Auto-generated method stub
		String applianceId = notification.getApplinace_id();
		appliance _appliance = ApplianceHelper.getInstance().getById(applianceId);
		if (_appliance == null) return;
		try {
			Appliance_mapHelper.getInstance().addNotification(applianceId, notification.getId());
			if (_appliance.getType().equals(ApplianceConstants.APPLIANCE_TYPE_DG)) {
				BaseResource[] admins = Appliance_mapHelper.getInstance().getAdmins(applianceId);
				if (!Util.isEmpty(admins)) {
					for(BaseResource resource : admins) {
						user admin = (user) resource;
						User_mapHelper.getInstance().addNotification(admin.getId(), notification.getId());
					}
				}
			}
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
