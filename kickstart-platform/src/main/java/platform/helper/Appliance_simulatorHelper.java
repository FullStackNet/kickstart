package platform.helper;

import application.c4t.vehicle.helper.RouteHelper;
import application.c4t.vehicle.helper.Route_stopageHelper;
import application.c4t.vehicle.helper.StopageHelper;
import application.c4t.vehicle.resource.route;
import application.c4t.vehicle.resource.route_stopage;
import application.c4t.vehicle.resource.stopage;
import platform.alert.AlertFactory;
import platform.appliances.Appliance;
import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.notification.NotificationFactory;
import platform.resource.*;
import platform.sensor.C4T_PARAMETER;
import platform.util.ApplicationException;
import platform.util.TimeUtil;
import platform.util.Util;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class Appliance_simulatorHelper extends BaseHelper {

	public Appliance_simulatorHelper() {
		super(new appliance_simulator());
		// TODO Auto-generated constructor stub
	}
	private static Appliance_simulatorHelper instance;

	public static Appliance_simulatorHelper getInstance() {
		if (instance == null) {
			instance = new Appliance_simulatorHelper();
			HelperFactory.getInstance().register(instance);
		}
		return instance;
	}
}
