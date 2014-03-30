package platform.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.customer;
import platform.util.Util;


public class CustomerHelper extends BaseHelper {
	
	public CustomerHelper() {
		super(new customer());
		// TODO Auto-generated constructor stub
	}
	private static CustomerHelper instance;
	
	public static CustomerHelper getInstance() {
		if (instance == null) {
			instance = new CustomerHelper();
			HelperFactory.getInstance().register(instance);
		}
		return instance;
	}
	public ArrayList<Map<String, Object>> getFleetCustomerListMap() {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Expression expression = new Expression(customer.FIELD_FLEETSERVICE, REL_OP.EQ, "Y");
		BaseResource[] resources = getByExpression(expression);
		if (Util.isEmpty(resources))
			return list;
		for (BaseResource resource : resources) {
			list.add(resource.convertResourceToMap());
		}
		return list;
	}
	
	public ArrayList<Map<String, Object>> getDGCustomerListMap() {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Expression expression = new Expression(customer.FIELD_DGSERVICE, REL_OP.EQ, "Y");
		BaseResource[] resources = getByExpression(expression);
		if (Util.isEmpty(resources))
			return list;
		for (BaseResource resource : resources) {
			list.add(resource.convertResourceToMap());
		}
		return list;
	}
}
