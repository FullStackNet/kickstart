package platform.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.db.JoinField;
import platform.resource.controller;
import platform.resource.customer_map;
import platform.resource.sensor;
import platform.util.ApplicationException;


public class Customer_mapHelper extends BaseHelper {
	
	public Customer_mapHelper() {
		super(new customer_map());
		// TODO Auto-generated constructor stub
	}
	private static Customer_mapHelper instance;
	
	public static Customer_mapHelper getInstance() {
		if (instance == null)
			instance = new Customer_mapHelper();
		return instance;
	}
	

	public ArrayList<Map<String, Object>> getSensorsMapList(String customerId) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		customer_map _customer_map = (customer_map)getSelectedFieldsById(customerId,
				customer_map.FIELD_SENSORS);
		if ((_customer_map == null) || (_customer_map.getSensors() == null))
			return list;
		list = SensorHelper.getInstance().getListMapById(_customer_map.getSensors().toArray(new String[_customer_map.getSensors().size()]),
				new String[]{sensor.FIELD_NAME}); 
		return list;
	}
	
	public ArrayList<Map<String, Object>> getControllerMapList(String customerId,ArrayList<JoinField> joinFields) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		customer_map _customer_map = (customer_map)getSelectedFieldsById(customerId,
				customer_map.FIELD_CONTROLLERS);
		if ((_customer_map == null) || (_customer_map.getControllers() == null))
			return list;
		return ControllerHelper.getInstance().getByJoining(_customer_map.getControllers().toArray(new String[_customer_map.getControllers().size()]),
				joinFields,new String[]{controller.FIELD_NAME});
	}
	
	public ArrayList<Map<String, Object>> getControllerMapList(String customerId) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		customer_map _customer_map = (customer_map)getSelectedFieldsById(customerId,
				customer_map.FIELD_CONTROLLERS);
		if ((_customer_map == null) || (_customer_map.getControllers() == null))
			return list;
		return ControllerHelper.getInstance().getListMapById(_customer_map.getControllers().toArray(new String[_customer_map.getControllers().size()]),
				new String[]{controller.FIELD_NAME});
	}
	
	public void addSensor(String customerId,String sensorId) throws ApplicationException {
		customer_map _customer_map = new customer_map();
		_customer_map.setId(customerId);
		_customer_map.addSensors(sensorId);
		AddOrUpdate(_customer_map);
	}
	
	public void addLocation(String customerId,String locationId) throws ApplicationException {
		customer_map _customer_map = new customer_map();
		_customer_map.setId(customerId);
		_customer_map.addLocations(locationId);
		AddOrUpdate(_customer_map);
	}
	
	public void addController(String customerId,String controllerId) throws ApplicationException {
		customer_map _customer_map = new customer_map();
		_customer_map.setId(customerId);
		_customer_map.addControllers(controllerId);
		AddOrUpdate(_customer_map);
	}
	
	public void removeController(String customerId,String controllerId) throws ApplicationException {
		customer_map _customer_map = new customer_map();
		_customer_map.setId(customerId);
		_customer_map.addControllers(controllerId);
		unset(_customer_map);
	}
}
