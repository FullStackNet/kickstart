package platform.webservice.service;

import platform.exception.ExceptionEnum;
import platform.helper.ApplianceHelper;
import platform.helper.Appliance_policyHelper;
import platform.helper.Appliance_rechargeHelper;
import platform.resource.BaseResource;
import platform.resource.appliance;
import platform.resource.appliance_policy;
import platform.resource.appliance_recharge;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;

import java.util.Map;

public class Appliance_rechargeService extends BaseService{
	public Appliance_rechargeService() {
		super(Appliance_rechargeHelper.getInstance(),new appliance_recharge());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		appliance_recharge _resource = (appliance_recharge)resource;
		_resource.setCustomer_id(ctx.getCustomerId());
		appliance _appliance = (appliance) ApplianceHelper.getInstance().getById(_resource.getId());
		if (_appliance != null) {
			_resource.setAppliance_name(_appliance.getName());
			_resource.setAppliance_serialno(_appliance.getSerial_no());
			_resource.setLocation_id(_appliance.getLocation_id());
			_resource.setLocation_name(_appliance.getLocation_name());
			appliance _a = new appliance(_appliance.getId());
			_a.setBalance_amount(_a.getBalance_amount()+_resource.getRecharge_amountEx());
			ApplianceHelper.getInstance().update(_a);
		}
		getHelper().add(_resource);
	}

	public void action(ServletContext ctx, BaseResource resource,String action) throws ApplicationException {

	}
	public void update(ServletContext ctx, BaseResource resource) throws ApplicationException {
		getHelper().update(resource);
	}


	public BaseResource[] getQuery(ServletContext ctx, String queryId, Map<String, Object> map) throws ApplicationException {
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_QUERY);
	}
}
