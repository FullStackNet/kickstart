package platform.webservice.service;

import platform.exception.ExceptionEnum;
import platform.helper.ApplianceHelper;
import platform.helper.Appliance_planHelper;
import platform.helper.Appliance_policyHelper;
import platform.helper.Billing_planHelper;
import platform.resource.*;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.TimeUtil;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;

import java.util.Map;

public class Appliance_planService extends BaseService{
	public Appliance_planService() {
		super(Appliance_planHelper.getInstance(),new appliance_plan());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		appliance_plan _resource = (appliance_plan)resource;
		appliance _appliance = (appliance) ApplianceHelper.getInstance().getById(_resource.getAppliance_id());
		_resource.setAppliance_name(_appliance.getName());
		_resource.setAppliance_serialno(_appliance.getSerial_no());
		billing_plan _plan = (billing_plan) Billing_planHelper.getInstance().getById(_resource.getPlan_id());
		_resource.setPlan_name(_plan.getName());
		_resource.setStart_date(TimeUtil.getTimeFromDateString(_appliance.getTimeZone(), _resource.getStart_date_str()));
		getHelper().add(resource);
	}

	public void action(ServletContext ctx, BaseResource resource,String action) throws ApplicationException {
		if (action.equalsIgnoreCase(WebServiceContants.OPERATION_MODIFY)) {
			update(ctx, resource);
		} 
	}
	public void update(ServletContext ctx, BaseResource resource) throws ApplicationException {
		appliance_plan _resource = (appliance_plan)resource;
		billing_plan _plan = (billing_plan) Billing_planHelper.getInstance().getById(_resource.getPlan_id());
		_resource.setPlan_name(_plan.getName());
		getHelper().update(resource);
	}


	public BaseResource[] getQuery(ServletContext ctx, String queryId, Map<String, Object> map) throws ApplicationException {
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_QUERY);
	}
}
