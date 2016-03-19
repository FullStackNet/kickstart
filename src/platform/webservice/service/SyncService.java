package platform.webservice.service;

import java.util.Map;

import platform.exception.ExceptionEnum;
import platform.helper.CustomerHelper;
import platform.resource.BaseResource;
import platform.resource.customer;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;

public class SyncService extends BaseService{
	public SyncService() {
		super(CustomerHelper.getInstance(),new customer());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		getHelper().add(resource);
	}

	public BaseResource[] getQuery(ServletContext ctx, String queryId, Map<String, Object> map) throws ApplicationException {
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_QUERY);
	}
}
