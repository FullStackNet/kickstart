package platform.webservice.service;

import java.util.Map;

import platform.exception.ExceptionEnum;
import platform.helper.ScheduleHelper;
import platform.resource.BaseResource;
import platform.resource.schedule;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;

public class ScheduleService extends BaseService{
	public ScheduleService() {
		super(ScheduleHelper.getInstance(),new schedule());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		schedule _resource = (schedule) resource;
		getHelper().add(_resource);
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
