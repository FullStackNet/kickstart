package platform.manager;

import java.util.Date;
import java.util.Map;

import platform.helper.ApplianceHelper;
import platform.helper.ControllerHelper;
import platform.log.ApplicationLogger;
import platform.resource.appliance;
import platform.resource.controller;
import platform.util.ApplicationException;

public class C4T_POWER_SNG_01VendorDataHandler extends VendorDataHandler {
	
	public double getVoltageDivider() {
		return 4.0;
	}
	
	
	@Override
	public void processPortData(String id,Map<String, Object> map, long time) {
		// TODO Auto-generated method stub		
		//AC I/P Sense	Port ID : 1000, State : ON/OFF (1 / 0)
		//Voltage	Port ID : 3000, in Voltage
		//Current	Port ID : 3001, in mA
		//Power	Port ID : 3002, in Watt
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
		byte bOnff = 0;
		
		Byte bSwitchStatus = (Byte)map.get("port1000");	
		if (bSwitchStatus != null) {
			bOnff = bSwitchStatus;
		}
		double cVolatge = 0.0;
		double cCurrent = 0.0;
		double cPower = 0.0;
		Short sVoltage = (Short)map.get("port3000");
		Short sCurrent = (Short)map.get("port3001");
		Short sPower = (Short)map.get("port3002");
		cVolatge =  sVoltage*_controller.getMultiple_factor_port3000Ex();
		cCurrent =  sCurrent*_controller.getMultiple_factor_port3001Ex();
		cPower =  sPower*_controller.getMultiple_factor_port3002Ex();
		ApplianceHelper.getInstance().updateHAPowerDeviceData(_controller, _appliance, 
				bOnff, (int)cVolatge, (int)cCurrent, cPower,time);
	}
}
