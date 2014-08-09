package platform.manager;

import java.util.Date;
import java.util.Map;

import platform.helper.ApplianceHelper;
import platform.helper.ControllerHelper;
import platform.log.ApplicationLogger;
import platform.resource.appliance;
import platform.resource.controller;
import platform.util.ApplicationException;
import platform.util.Util;

public class C4T_DG_SNG_01VendorDataHandler extends VendorDataHandler {
	
	public double getVoltageDivider() {
		return 4.0;
	}
	
	
	@Override
	public void processPortData(String id,Map<String, Object> map, long time) {
		// TODO Auto-generated method stub		
		//AC I/P Sense	Port ID : 1000, State : ON/OFF (1 / 0)
		//Water Level Threshold	Port ID : 1001, State : HIGH/LOW (1 / 0)
		//High Coolant Temp. Lamp	Port ID : 1002, State : ON/OFF (1 / 0)
		//DG Switch Status	Port ID : 1003
		//DG Switch	Port ID : 2000, Status : ON/OFF (1 / 0)
		//Fuel Level	Port ID : 3000, in ltrs 0 to 65536 ltrs
		//Battery V/G	Port ID : 3001, in Volts
		//Temp Sensor	Port ID : 3002, in Deg Celcius
		if (time  == 0) {
			time = new Date().getTime();
		}
		controller _controller = (controller)ControllerHelper.getInstance().getById(id);
		if (_controller.getAppliance_id() == null) {
			ApplicationLogger.error("No appliance for " + id, this.getClass());
			return;
		}
		controller __controller = new controller(_controller.getId());
		__controller.setLast_data_received(new Date().getTime());
		__controller.setConnected("Y");
		try {
			ControllerHelper.getInstance().update(__controller);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		appliance _appliance = (appliance) ApplianceHelper.getInstance().getById(_controller.getAppliance_id());
		if (_appliance == null) {
			ApplicationLogger.error("Wrong appliance for " + id , this.getClass());
			return;
		}
		//byte bAcOn = (Byte)map.get("port1000");
		//byte bWaterLevelThreshold = (Byte)map.get("port1001");
		//byte bCoolantTemp = (Byte)map.get("port1002");
		byte bAcOn = 0;
		byte bWaterLevelThreshold = 0;
		byte bCoolantTemp = 0;
		byte bOverSpeed = 0;
		byte bOilPressure = 0;
		byte bStarterRelayTriggered = 0;
		byte bWaterInFuel = 0;
		
		bOilPressure = (Byte)map.get("port1000");		
		bCoolantTemp = (Byte)map.get("port1001");
		bOverSpeed = (Byte)map.get("port1002");
		bWaterInFuel = (Byte)map.get("port1003");
		byte bSwitchStatus = (Byte)map.get("port1004");
		bStarterRelayTriggered = (Byte)map.get("port1005");
		
		
		double fuelQuantity = 0.0;
		double cBatteryVoltage = 0.0;
		double ctemperature = 0.0;
		double coolantTemperature=0.0;
		Short batteryVoltage = (Short)map.get("port3000");
		cBatteryVoltage = batteryVoltage*_controller.getMultiple_factor_port3000Ex();
		cBatteryVoltage = Util.round(cBatteryVoltage, 2);
		Short fuelLevel = (Short)map.get("port3001");
		fuelQuantity = fuelLevel*_controller.getMultiple_factor_port3001Ex();
		fuelQuantity = Util.round(fuelQuantity, 3);
		Short canopyTemperature = (Short)map.get("port3002");
		ctemperature =  canopyTemperature*_controller.getMultiple_factor_port3002Ex();
		ctemperature = Util.round(ctemperature, 2);
		Short _coolantTemperature = (Short)map.get("port3003");
		coolantTemperature =  _coolantTemperature*_controller.getMultiple_factor_port3003Ex();
		coolantTemperature = Util.round(coolantTemperature, 2);
		
		ApplianceHelper.getInstance().updateDGData(_controller, _appliance, 
				fuelLevel.doubleValue(), fuelQuantity, ctemperature, cBatteryVoltage, 
				coolantTemperature,bSwitchStatus, bAcOn, bCoolantTemp, bWaterLevelThreshold, 
				bOverSpeed,bOilPressure,bStarterRelayTriggered,bWaterInFuel,time);
	}
}
