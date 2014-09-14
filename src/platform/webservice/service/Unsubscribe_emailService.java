package platform.webservice.service;

import java.util.Map;

import platform.exception.ExceptionEnum;
import platform.helper.Unsubscribe_emailHelper;
import platform.resource.BaseResource;
import platform.resource.unsubscribe_email;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;

public class Unsubscribe_emailService extends BaseService{
	public Unsubscribe_emailService() {
		super(Unsubscribe_emailHelper.getInstance(),new unsubscribe_email());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		unsubscribe_email _resource = (unsubscribe_email) resource;
		getHelper().add(_resource);
	}
	
	public void action(ServletContext ctx, BaseResource resource,String action) throws ApplicationException {
		if (action.equalsIgnoreCase(WebServiceContants.OPERATION_DELETE)) {
			Unsubscribe_emailHelper.getInstance().deleteById(resource.getId());
		} else {
			unsubscribe_email _resource = (unsubscribe_email) resource;
			getHelper().add(_resource);
		}
	}
	
	public BaseResource[] getQuery(ServletContext ctx, String queryId, Map<String, Object> map) throws ApplicationException {
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_QUERY);
	}
}
