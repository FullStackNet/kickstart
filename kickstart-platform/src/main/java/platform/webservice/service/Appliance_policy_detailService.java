package platform.webservice.service;

import platform.exception.ExceptionEnum;
import platform.helper.*;
import platform.resource.*;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Util;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;

import java.util.Map;

public class Appliance_policy_detailService extends BaseService{
	public Appliance_policy_detailService() {
		super(Appliance_policy_detailHelper.getInstance(),new appliance_policy_detail());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		appliance_policy_detail _resource = (appliance_policy_detail)resource;
		_resource.setCustomer_id(ctx.getCustomerId());
		if (Util.isEmpty(_resource.getThreshold_profile_id())) {
			throw new ApplicationException(ExceptionSeverity.ERROR, "Please specify the Profile");
		}
		appliance_threshold_templete _profile = (appliance_threshold_templete) Appliance_threshold_templeteHelper.getInstance().getById(_resource.getThreshold_profile_id());
		if (_profile == null) {
			throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid  Profile");
		}
		_resource.setThreshold_profile_name(_profile.getName());
		getHelper().add(resource);
	}

	public void action(ServletContext ctx, BaseResource resource,String action) throws ApplicationException {
		if (action.equalsIgnoreCase(WebServiceContants.OPERATION_MODIFY)) {
			update(ctx, resource);
		} 
	}
	public void update(ServletContext ctx, BaseResource resource) throws ApplicationException {
		getHelper().update(resource);
	}


	public BaseResource[] getQuery(ServletContext ctx, String queryId, Map<String, Object> map) throws ApplicationException {
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_QUERY);
	}
}
