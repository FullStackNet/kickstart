package platform.helper;

import java.util.HashMap;
import java.util.Map;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.gateway;
import platform.resource.managed_object;
import platform.util.ApplicationException;
import platform.util.Util;


public class Managed_objectHelper extends BaseHelper {

	public Managed_objectHelper() {
		super(new managed_object());
		// TODO Auto-generated constructor stub
	}
	private static Managed_objectHelper instance;

	public static Managed_objectHelper getInstance() {
		if (instance == null) {
			instance = new Managed_objectHelper();
			HelperFactory.getInstance().register(instance);
		}
		return instance;
	}
	
	public void updateNumberOfController(String gatewayId) {
		gateway _gateway = (gateway)GatewayHelper.getInstance().getById(gatewayId);
		managed_object object = new managed_object(gatewayId);
		if (_gateway == null) 
			return;
		if (Util.isEmpty(_gateway.getControllers())) {
			object.setNumber_of_controllers(0);
		} else {
			object.setNumber_of_controllers(_gateway.getControllers().size());
		}
		try {
			update(object);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public BaseResource[] getAllProcessForAgent(String ip_address) {
		Expression e = new Expression(managed_object.FIELD_IP_ADDRESS, REL_OP.EQ, ip_address);
		return getByExpression(e);
	}

	public Map<String, Long>  getTypes() {
		BaseResource[] reasources = getAll();
		Map<String, Long> map = new HashMap<String, Long>();
		for(BaseResource resource : reasources) {
			managed_object object = (managed_object)resource;
			if (object.getType() == null) continue;
			Long count = map.get(object.getType());
			if (count == null)
				count = 0L;
			count++;
			map.put(object.getType(), count);
		}
		return map;
	}
	
	public Map<String, Long>  getLocation() {
		BaseResource[] reasources = getAll();
		Map<String, Long> map = new HashMap<String, Long>();
		for(BaseResource resource : reasources) {
			managed_object object = (managed_object)resource;
			if (object.getLocation() == null) continue;
			Long count = map.get(object.getLocation());
			if (count == null)
				count = 0L;
			count++;
			map.put(object.getLocation(), count);
		}
		return map;
	}
	
	public Map<String, Long>  getIPAddress() {
		BaseResource[] reasources = getAll();
		Map<String, Long> map = new HashMap<String, Long>();
		for(BaseResource resource : reasources) {
			managed_object object = (managed_object)resource;
			if (object.getIp_address() == null) continue;
			Long count = map.get(object.getIp_address());
			if (count == null)
				count = 0L;
			count++;
			map.put(object.getIp_address(), count);
		}
		return map;
	}
	
	public void delete(String userId,String customerId,String id) throws ApplicationException {
		deleteById(id);
	}
}
