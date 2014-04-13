package platform.helper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import platform.alert.AlertFactory;
import platform.db.Expression;
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
