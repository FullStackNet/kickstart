package platform.helper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import platform.alert.AlertFactory;
import platform.appliances.Appliance;
import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.notification.NotificationFactory;
import platform.resource.BaseResource;
import platform.resource.alert;
import platform.resource.appliance;
import platform.resource.appliance_running_log;
import platform.resource.appliance_time_series;
import platform.resource.controller;
import platform.resource.notification;
import platform.sensor.C4T_PARAMETER;
import platform.util.ApplicationException;
import platform.util.TimeUtil;
import platform.util.Util;
import application.c4t.vehicle.helper.RouteHelper;
import application.c4t.vehicle.helper.Route_stopageHelper;
import application.c4t.vehicle.helper.StopageHelper;
import application.c4t.vehicle.resource.route;
import application.c4t.vehicle.resource.route_stopage;
import application.c4t.vehicle.resource.stopage;


public class ApplianceHelper extends BaseHelper {

	public ApplianceHelper() {
		super(new appliance());
		// TODO Auto-generated constructor stub
	}
	private static ApplianceHelper instance;

	public static ApplianceHelper getInstance() {
		if (instance == null) {
			instance = new ApplianceHelper();
			HelperFactory.getInstance().register(instance);
		}
		return instance;
	}

	public appliance getById(String id) {
		return (appliance)super.getById(id);
	}
	public BaseResource[] getCustomerVehicle(String customerId) {
		return ApplianceHelper.getInstance().getByCustomerIdForType(customerId,"VEHICLE");

	}
	public BaseResource[] getUserVehicle(String userId) {
		return User_mapHelper.getInstance().getApplinaceResources(userId);
	}

	public BaseResource[] getSchoolVehicle(String[] schoolIds) {
		Expression e1 = new Expression(appliance.FIELD_TYPE, REL_OP.EQ, Appliance.APPLIANCE_VEHICLE);
		Expression e2 = new Expression(appliance.FIELD_LOCATION_ID, REL_OP.IN, schoolIds);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e);
	}
	
	public BaseResource[] getCommunityAppliance(String communityId) {
		Expression e = new Expression(appliance.FIELD_COMMUNITY_ID, REL_OP.EQ, communityId);
		BaseResource[] appliances = getByExpression(e, new String[]{appliance.FIELD_NAME});
		if (Util.isEmpty(appliances)) 
			return null;
		for(BaseResource resource : appliances) {
			appliance _appliance = (appliance) resource;
			String connected = "U";
			BaseResource[] _controllers = ControllerHelper.getInstance().getByApplianceId(_appliance.getId());
			if (!Util.isEmpty(_controllers)) {
				connected = "Y";
				controller _controller = (controller)_controllers[0];
				_appliance.setController_id(_controller.getId());
				if (_appliance.getLast_update_time() == null) {
					connected = "U";
				} else {
					long diff = System.currentTimeMillis()-_appliance.getLast_update_time();
					if (diff > (_controller.getHeartbeat_interval()*3*1000L)) {
						connected = "N";
					}
				}
			}
			_appliance.setConnected(connected);
		}
		return appliances;
	}
	
	public BaseResource[] getSchoolReader(String[] schoolId) {
		Expression e1 = new Expression(appliance.FIELD_TYPE, REL_OP.EQ, Appliance.APPLIANCE_READER);
		Expression e2 = new Expression(appliance.FIELD_LOCATION_ID, REL_OP.IN, schoolId);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		BaseResource[] appliances = getByExpression(e);
		if (Util.isEmpty(appliances)) 
			return null;
		for(BaseResource resource : appliances) {
			appliance _appliance = (appliance) resource;
			String connected = "U";
			BaseResource[] _controllers = ControllerHelper.getInstance().getByApplianceId(_appliance.getId());
			if (!Util.isEmpty(_controllers)) {
				connected = "Y";
				controller _controller = (controller)_controllers[0];
				_appliance.setController_id(_controller.getId());
				if (_appliance.getLast_update_time() == null) {
					connected = "U";
				} else {
					long diff = System.currentTimeMillis()-_appliance.getLast_update_time();
					if (diff > (_controller.getHeartbeat_interval()*3*1000L)) {
						connected = "N";
					}
				}
			}
			_appliance.setConnected(connected);
		}
		return appliances;
	}

	public BaseResource getApplianceLocation(String applianceId) {
		return ApplianceHelper.getInstance().getSelectedFieldsById(applianceId, new String[]{appliance.FIELD_ID,appliance.FIELD_LATITUDE,
				appliance.FIELD_LANGITUDE,
				appliance.FIELD_LAST_UPDATE_TIME,
				appliance.FIELD_SPEED});
	}
	
	public BaseResource[] getSchoolBusAdminDetail(String customerId, String[] schoolIds) {
		BaseResource[] appliances;
		if (!Util.isEmpty(schoolIds)) {
			appliances = ApplianceHelper.getInstance().getSchoolVehicle(schoolIds);
		} else {
			appliances = ApplianceHelper.getInstance().getByCustomerIdForType(customerId,"VEHICLE");
		}
		if (Util.isEmpty(appliances)) 
			return null;
		for(BaseResource resource : appliances) {
			appliance _appliance = (appliance) resource;
			route _route = (route)RouteHelper.getInstance().getById(_appliance.getCurrentRouteId());
			if ((_route != null) && RouteHelper.getInstance().isValidRoute(_route, _appliance.getTimeZone())) {
				_appliance.setCurrent_route_name(_route.getName());
				route_stopage _route_stopage = (route_stopage)Route_stopageHelper.getInstance().getById(_appliance.getLastStopageId());
				if (_route_stopage != null) {
					if (!_route_stopage.getRoute_id().equals(_route.getId())) {
						_appliance.setCurrent_route_name(null);
					} else {
						_appliance.setCurrent_route_schedule(_route.getStart_timeEx()+"-"+_route.getEnd_timeEx());
						stopage _stopage = (stopage)StopageHelper.getInstance().getById(_route_stopage.getStopage_id());
						if (_stopage != null) {
							_appliance.setLast_stopage_name(_stopage.getName());
							_appliance.setLast_stopage_reached_time(_route_stopage.getReached_timeEx());
						}
					}
				}
			}
			String connected = "U";
			BaseResource[] _controllers = ControllerHelper.getInstance().getByApplianceId(_appliance.getId());
			if (!Util.isEmpty(_controllers)) {
				connected = "Y";
				controller _controller = (controller)_controllers[0];
				_appliance.setController_id(_controller.getId());
				if (_appliance.getLast_update_time() == null) {
					connected = "U";
				} else {
					long diff = System.currentTimeMillis()-_appliance.getLast_update_time();
					if (diff > (_controller.getHeartbeat_interval()*3*1000L)) {
						connected = "N";
					}
				}
			}
			if (_route != null) {
				Map<String,Object> extrMap = new HashMap<String,Object>();
				extrMap.put("teacher_present", "N");
				extrMap.put("notify_teacher_present", _route.getNotifiy_teacher_present());
				if ( "Y".equalsIgnoreCase(_route.getNotifiy_teacher_present()) && (_route.getTeacher_present_time() != null) && 
						TimeUtil.isSameDate(null,_route.getTeacher_present_time(),new Date().getTime())) {
					extrMap.put("teacher_present", "Y");
				}
				_appliance.setExtra_data(extrMap);
			}
			_appliance.setConnected(connected);
		}
		return appliances;
	}

	public void cleanData(String userId,BaseResource resource) {
		appliance _fetchedAppliance = getById(resource.getId());
		if (_fetchedAppliance == null) return;

		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_AIRFLOW);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_ATMOSHERICPRESSURE);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_AVERAGE_FUEL_CONSUMPTION);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_AVERAGE_FUEL_CONSUMPTION);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_BATTERY_LEVEL);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_BATTERYVOLTAGE);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_CANOPY_TEMPERATURE);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_COOLANT_TEMPERATURE);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_CURRENT);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_CURRENT_FUEL_CONSUMPTION);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_CURRENT_MONTH_FUEL_CONSUMPTION);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_CURRENT_MONTH_FUEL_LOSS);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_CURRENT_MONTH_RUN_TIME);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_DG_READING);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_DG_UNIT_CLOSING);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_DG_UNIT_CONSUMED);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_ENGINELOAD);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_ENGINETEMPERATURE);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_FUEL_LEVEL);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_FUEL_QUANTITY);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_GRID_UNIT_CLOSING);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_GRID_UNIT_CONSUMED);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_HUMIDITY);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_INTAKEAIRTEMPERATURE);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_INTAKETUBEABSOLUTEPRESSURE);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_LEVEL);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_LEVEL_FLOAT);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_MANIFOLDABSPRESSURE);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_NUMBEROFDTC);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_OILPRESSURE);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_POWER);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_RPM);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_SPEED);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_TIMING_ADVANCE);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_TEMPERATURE);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_TODAY_FUEL_CONSUMPTION);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_TODAY_FUEL_LOSS);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_TODAY_RUN_TIME);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_TROTTLEPOSITION);
		reset(_fetchedAppliance,resource.getId(), appliance.FIELD_VOLTAGE);

		Expression expression = new Expression(appliance_time_series.FIELD_APPLIANCE_ID, REL_OP.EQ, resource.getId());
		Appliance_time_seriesHelper.getInstance().deleteByExpression(expression);

		expression = new Expression(appliance_running_log.FIELD_APPLIANCE_ID, REL_OP.EQ, resource.getId());
		Appliance_running_logHelper.getInstance().deleteByExpression(expression);

		expression = new Expression(alert.FIELD_APPLINACE_ID, REL_OP.EQ, resource.getId());
		AlertHelper.getInstance().deleteByExpression(expression);

		expression = new Expression(notification.FIELD_APPLINACE_ID, REL_OP.EQ, resource.getId());
		NotificationHelper.getInstance().deleteByExpression(expression);

	}

	public long  getApplianceCount4ControllerId(String controller_id) {
		Expression e = new Expression(appliance.FIELD_CONTROLLER_ID, REL_OP.EQ,controller_id);
		return ApplianceHelper.getInstance().getCount(e);
	}

	public void updateLastDataUpdateTime(String applianceId, Date time) {
		if (applianceId ==null) return;
		
		appliance _appliance = new appliance();
		_appliance.setId(applianceId);
		_appliance.setLast_update_time(time.getTime());
		try {
			ApplianceHelper.getInstance().update(_appliance);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateLastStopage(String applianceId,String lastStopageId) {
		appliance _appliance = new appliance(applianceId);
		_appliance.setLastStopageId(lastStopageId);
		try {
			ApplianceHelper.getInstance().update(_appliance);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateOverSpeedState(String applianceId,String state) {
		appliance _appliance = new appliance(applianceId);
		_appliance.setOverSpeedState(state);
		try {
			ApplianceHelper.getInstance().update(_appliance);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateCurrentRoute(String applianceId,String currentRouteId) {
		appliance _appliance = new appliance(applianceId);
		_appliance.setCurrentRouteId(currentRouteId);
		try {
			ApplianceHelper.getInstance().update(_appliance);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateHAPowerDeviceData(controller _controller,
			appliance _appliance,
			byte state,
			int voltage, int current,double power, long time) {
		appliance __appliance = new appliance(_controller.getAppliance_id());
		__appliance.setState("N");
		if (state == 1) {
			__appliance.setState("Y");
		}
		__appliance.setVoltage(voltage);
		__appliance.setCurrent(current);
		__appliance.setEnergy(power);
		__appliance.setLast_reading_updated(time);
		__appliance.setConnected("Y");
		try {
			ApplianceHelper.getInstance().update(__appliance);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void updateDGData(controller _controller,
			appliance _appliance,
			double fuelLevel, double fuelQuantity,double canopyTemperature,
			double batteryVoltage,double coolantTemperature,
			byte dgstate,byte gridState,byte highCoolantTempeatureState, byte waterLevelState, 
			byte bOverSpeed,byte bOilPressure,byte bStarterRelayTriggered,byte bWaterInFuel,
			long time) {
		double current_fuel_consumption = 0.0;
		double current_fuel_filling = 0.0;

		//Update the Appliance state and data
		appliance __appliance = new appliance(_controller.getAppliance_id());
		__appliance.setGrid_state("N");
		__appliance.setState("N");
		__appliance.setHigh_dg_water_temperature("N");
		__appliance.setHigh_coolant_temperature("N");	
		__appliance.setLowOilPressureState("N");
		__appliance.setWaterInFuel("N");
		__appliance.setOverSpeedState("N");
		__appliance.setStarterTriggered("N");


		if (bOilPressure == 1) {
			__appliance.setLowOilPressureState("Y");
		}
		if (bWaterInFuel == 1) {
			__appliance.setWaterInFuel("Y");
		}

		if (bOverSpeed == 1) {
			__appliance.setOverSpeedState("Y");
		}
		if (bStarterRelayTriggered == 1) {
			__appliance.setStarterTriggered("Y");
		}
		if (gridState == 1) {
			__appliance.setGrid_state("Y");
		}

		if (waterLevelState == 1) {
			__appliance.setHigh_dg_water_temperature("Y");
		}

		if (highCoolantTempeatureState == 1) {
			__appliance.setHigh_coolant_temperature("Y");
		}

		if (dgstate == 1) {
			__appliance.setState("Y");
		}

		// Notification and alerts
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put(C4T_PARAMETER.FUEL_QUANTITY.toString(), fuelQuantity);	
		if (_appliance.getFuel_quantity() != null) {
			if (fuelQuantity < _appliance.getFuel_quantity().doubleValue()) {
				double fuel_consumption = _appliance.getFuel_quantity().doubleValue() - fuelQuantity;
				current_fuel_consumption = _appliance.getCurrent_fuel_consumption().doubleValue()+fuel_consumption;
				__appliance.setCurrent_fuel_consumption(current_fuel_consumption);
				dataMap.put(C4T_PARAMETER.FUEL_CONSUMPTION.toString(), current_fuel_consumption);	
			} else if (fuelQuantity >  _appliance.getFuel_quantity().doubleValue()) {
				current_fuel_filling = fuelQuantity - _appliance.getFuel_quantity().doubleValue();
			}
		}

		if ("N".equals(_appliance.getState())) {
			if (dgstate == 1) {
				current_fuel_consumption = 0.0;
				__appliance.setCurrent_fuel_consumption(current_fuel_consumption);
				NotificationHelper.getInstance().addNotificationFromAppliance(_appliance, 
						NotificationFactory.NOTIFICATION_STARTED, NotificationFactory.SEVERIRY_INFO, dataMap, new Date(time));
			}
		}
		if ("Y".equals(_appliance.getState())) {
			if (dgstate == 0) {
				NotificationHelper.getInstance().addNotificationFromAppliance(_appliance, 
						NotificationFactory.NOTIFICATION_STOPPED,
						NotificationFactory.SEVERIRY_INFO, dataMap, new Date(time));
			}
		}

		if (_appliance.getThreshold_fuel_level().doubleValue() > 0.0) {
			if (fuelQuantity < _appliance.getThreshold_fuel_level().doubleValue()) {
				if (!"Y".equals(_appliance.getLowFuelState())) {
					__appliance.setLowFuelState("Y");
					AlertHelper.getInstance().addAlertFromAppliance(__appliance, 
							AlertFactory.ALERT_LOW_FUEL, (int)AlertFactory.SEVERIRY_CRITICAL,null,new Date(time));
				}
			}

			if (fuelQuantity > _appliance.getThreshold_fuel_level().doubleValue()) {
				if ("Y".equals(_appliance.getLowFuelState())) {
					__appliance.setLowFuelState("N");
					AlertHelper.getInstance().addAlertFromAppliance(__appliance, 
							AlertFactory.ALERT_LOW_FUEL_NORMAL, (int)AlertFactory.SEVERIRY_INFO,null,new Date(time));
				}
			}
		}

		if (_appliance.getThreshold_temperature_max_level().doubleValue() > 0.0) {
			if (canopyTemperature > _appliance.getThreshold_temperature_max_level().doubleValue()) {
				if (!"Y".equals(_appliance.getHigh_canopy_temperature())) {
					__appliance.setHigh_canopy_temperature("Y");
					AlertHelper.getInstance().addAlertFromAppliance(__appliance, 
							AlertFactory.ALERT_HIGH_CANOPY_TEMPERATURE, (int)AlertFactory.SEVERIRY_CRITICAL,null,new Date(time));
				}
			}

			if (canopyTemperature < _appliance.getThreshold_temperature_max_level().doubleValue()) {
				if ("Y".equals(_appliance.getHigh_canopy_temperature())) {
					__appliance.setHigh_canopy_temperature("N");
					AlertHelper.getInstance().addAlertFromAppliance(__appliance, 
							AlertFactory.ALERT_NORMAL_CANOPY_TEMPERATURE, (int)AlertFactory.SEVERIRY_INFO,null,new Date(time));
				}
			}
		}
		if (_appliance.getThreshold_voltage_min_level().doubleValue() > 0.0) {
			if (batteryVoltage < _appliance.getThreshold_voltage_min_level().doubleValue()) {
				if (!"Y".equals(_appliance.getLowBatteryState())) {
					__appliance.setLowBatteryState("Y");
					AlertHelper.getInstance().addAlertFromAppliance(__appliance, 
							AlertFactory.ALERT_LOW_BATTERY_VOLTAGE, (int)AlertFactory.SEVERIRY_CRITICAL,null,new Date(time));
				}
			}

			if (batteryVoltage > _appliance.getThreshold_voltage_min_level().doubleValue()) {
				if ("Y".equals(_appliance.getLowBatteryState())) {
					__appliance.setLowBatteryState("N");
					AlertHelper.getInstance().addAlertFromAppliance(__appliance, 
							AlertFactory.ALERT_NORMAL_BATTERY_VOLTAGE, (int)AlertFactory.SEVERIRY_INFO,null,new Date(time));
				}
			}
		}

		// Update the daily/monthly fuel consumption /fuel loss /run hours

		if ("Y".equals(_appliance.getState())) {
			long last_reading_updated = _appliance.getLast_reading_updated();
			int run_time = (int) (time -last_reading_updated);
			if (!TimeUtil.isSameDate(_appliance.getTimeZone(), last_reading_updated, time)) {
				run_time = (int)TimeUtil.todayTimePassed(_appliance.getTimeZone(),time);
				__appliance.setToday_run_time(run_time);
			} else {
				__appliance.setToday_run_time(_appliance.getToday_run_timeEx()+run_time);
			}
			if (!TimeUtil.isSameMonth(_appliance.getTimeZone(), last_reading_updated, time)) {
				run_time = (int)TimeUtil.todayTimePassed(_appliance.getTimeZone(),time);
				__appliance.setCurrent_month_run_time(run_time);
			} else {
				__appliance.setCurrent_month_run_time(_appliance.getCurrent_month_run_timeEx()+run_time);
			}

			if (fuelQuantity < _appliance.getFuel_quantity().doubleValue()) {
				double fuel_consumption = _appliance.getFuel_quantity().doubleValue() - fuelQuantity;
				if (!TimeUtil.isSameDate(_appliance.getTimeZone(), last_reading_updated, time)) {
					__appliance.setToday_fuel_consumption(fuel_consumption);
				} else {
					__appliance.setToday_fuel_consumption(_appliance.getToday_fuel_consumption().doubleValue()+fuel_consumption);
				}
				if (!TimeUtil.isSameMonth(_appliance.getTimeZone(), last_reading_updated, time)) {
					__appliance.setCurrent_month_fuel_consumption(fuel_consumption);
				} else {
					__appliance.setCurrent_month_fuel_consumption(_appliance.getCurrent_month_fuel_consumption().doubleValue()+fuel_consumption);
				}
			} 
			if ((_appliance.getCurrent_month_fuel_consumption().doubleValue() > 0.0) &&  (__appliance.getCurrent_month_run_time() > 0)) {
				double avarge_fuel_consumption = (__appliance.getCurrent_month_fuel_consumption().doubleValue()*60*60*1000)/__appliance.getCurrent_month_run_time();
				__appliance.setAverage_fuel_consumption(avarge_fuel_consumption);
			}
		} else {
			if (fuelQuantity < _appliance.getFuel_quantity().doubleValue()) {
				double fuel_consumption = _appliance.getFuel_quantity().doubleValue() - fuelQuantity;
				long last_reading_updated = _appliance.getLast_reading_updated();
				if (!TimeUtil.isSameDate(_appliance.getTimeZone(), last_reading_updated, time)) {
					__appliance.setToday_fuel_loss(fuel_consumption);
				} else {
					__appliance.setToday_fuel_loss(_appliance.getToday_fuel_loss().doubleValue()+fuel_consumption);
				}
				if (!TimeUtil.isSameMonth(_appliance.getTimeZone(), last_reading_updated, time)) {
					__appliance.setCurrent_month_fuel_loss(fuel_consumption);
				} else {
					__appliance.setCurrent_month_fuel_loss(_appliance.getCurrent_month_fuel_loss().doubleValue()+fuel_consumption);
				}
			} 
		}
		__appliance.setFuel_quantity(fuelQuantity);
		__appliance.setBatteryVoltage(batteryVoltage);
		__appliance.setCanopy_temperature(canopyTemperature);
		__appliance.setCoolant_temperature(coolantTemperature);
		__appliance.setLast_reading_updated(time);
		__appliance.setConnected("Y");
		try {
			ApplianceHelper.getInstance().update(__appliance);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		// update time series Data
		try {
			Appliance_time_seriesHelper.getInstance().addTimeSeries(_controller.getAppliance_id(), 
					C4T_PARAMETER.FUEL_QUANTITY.toString(), new Date(time), fuelQuantity);
			if (current_fuel_filling > 0.0) {
				Appliance_time_seriesHelper.getInstance().addTimeSeries(_controller.getAppliance_id(), 
						C4T_PARAMETER.FUEL_FILLING.toString(), new Date(time), current_fuel_filling);
				Map<String, Object> fuelAddedData = new HashMap<String, Object>();
				fuelAddedData.put("Fuel Added", current_fuel_filling);
				NotificationHelper.getInstance().addNotificationFromAppliance(_appliance, 
						NotificationFactory.NOTIFICATION_FUEL_ADDED, NotificationFactory.SEVERIRY_INFO, fuelAddedData, new Date(time));
			}
			if ((current_fuel_consumption > 0.0) && 
					(!"Y".equalsIgnoreCase(_appliance.getState()) && dgstate == 0)) {
				Appliance_time_seriesHelper.getInstance().addTimeSeries(_controller.getAppliance_id(), 
						C4T_PARAMETER.FUEL_LOSS.toString(), new Date(time), current_fuel_consumption);
			}
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
