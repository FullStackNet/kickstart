package application.c4t.dg.helper;

import java.util.ArrayList;

import platform.helper.BaseHelper;
import platform.helper.User_mapHelper;
import platform.resource.BaseResource;
import platform.resource.appliance;
import application.c4t.dg.resource.dg_summary;


public class Dg_summaryHelper extends BaseHelper {
	public Dg_summaryHelper() {
		super(new dg_summary());
		// TODO Auto-generated constructor stub
	}
	
	private static Dg_summaryHelper instance;

	public static Dg_summaryHelper getInstance() {
		if (instance == null)
			instance = new Dg_summaryHelper();
		return instance;
	}
	
	public dg_summary getUserSummary(String userId) {
		ArrayList<BaseResource> list = User_mapHelper.getInstance().getApplinaces(userId);
		dg_summary _summary = new dg_summary();
		if (list == null || (list.size() == 0)) return _summary;
		int total_dg = 0;
		int total_running = 0;
		int total_not_running = 0;
		double fuel_quantity = 0;
		int today_run_time= 0;
		int current_month_run_time = 0;
		double today_fuel_consumed = 0;
		double current_month_fuel_consumed = 0;
		double today_fuel_loss = 0;
		double current_month_fuel_loss = 0;
		int number_of_low_fuel = 0;
		int number_of_low_battery = 0;
		int number_of_high_canopy_temp = 0;
		int number_of_high_water_temp = 0;
		int number_of_high_coolant_temp = 0;
		int number_of_dg_grid_both_not_running = 0;
		int number_of_dg_grid_both_running = 0;

		for(int i=0; i < list.size(); i++) {
			appliance _appliance = (appliance)list.get(i);
			if ("Y".equals(_appliance.getState())) {
				total_running++;
			} else {
				total_not_running++;
			}
			if ("Y".equals(_appliance.getLowFuelState())) {
				number_of_low_fuel++;
			} 
			if ("Y".equals(_appliance.getLowBatteryState())) {
				number_of_low_battery++;
			}
			if ("Y".equals(_appliance.getHigh_canopy_temperature())) {
				number_of_high_canopy_temp++;
			}
			if ("Y".equals(_appliance.getHigh_dg_water_temperature())) {
				number_of_high_water_temp++;
			}
			if ("Y".equals(_appliance.getHigh_coolant_temperature())) {
				number_of_high_coolant_temp++;
			}
			fuel_quantity = fuel_quantity + _appliance.getFuel_quantity().doubleValue();
			today_fuel_consumed = today_fuel_consumed + _appliance.getToday_fuel_consumption().doubleValue();
			current_month_fuel_consumed = current_month_fuel_consumed + _appliance.getCurrent_month_fuel_consumption().doubleValue();
			today_fuel_loss = today_fuel_loss + _appliance.getToday_fuel_loss().doubleValue();
			current_month_fuel_loss = current_month_fuel_loss + _appliance.getCurrent_month_fuel_loss().doubleValue();
			total_dg++;
		}
		_summary.setFuel_quantity(fuel_quantity);
		_summary.setNumber_of_dg_off(total_not_running);
		_summary.setNumber_of_dg_on(total_running);
		_summary.setNumber_of_high_canopy_temp(number_of_high_canopy_temp);
		_summary.setNumber_of_high_coolant_temp(number_of_high_coolant_temp);
		_summary.setNumber_of_high_water_temp(number_of_high_water_temp);
		_summary.setNumber_of_low_fuel(number_of_low_fuel);
		_summary.setToday_fuel_consumed(today_fuel_consumed);
		_summary.setCurrent_month_fuel_consumed(current_month_fuel_consumed);
		_summary.setToday_fuel_loss(today_fuel_loss);
		_summary.setCurrent_month_fuel_loss(current_month_fuel_loss);
		_summary.setNumber_of_dg_grid_both_not_running(number_of_dg_grid_both_not_running);
		_summary.setNumber_of_dg_grid_both_running(number_of_dg_grid_both_running);
		_summary.setToday_run_time(today_run_time);
		_summary.setCurrent_month_run_time(current_month_run_time);
		_summary.setTotal_dg(total_dg);
		_summary.setNumber_of_low_battery(number_of_low_battery);
		_summary.setCurrent_month_fuel_loss(current_month_fuel_loss);
		return _summary;
	}
}