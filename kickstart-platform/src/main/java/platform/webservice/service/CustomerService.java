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
import platform.webservice.WebServiceContants;

public class CustomerService extends BaseService {
    public CustomerService() {
        super(CustomerHelper.getInstance(), new customer());
    }

    public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
        getHelper().add(resource);
    }

    public void action(ServletContext ctx, BaseResource resource, String action) throws ApplicationException {
        if (action.equalsIgnoreCase(WebServiceContants.OPERATION_MODIFY)) {
            update(ctx, resource);
        }
    }

    public void update(ServletContext ctx, BaseResource resource) throws ApplicationException {
        getHelper().update(resource);
    }

    private enum QueryTypes {
        QUERY_GET_BY_ID
    }

    public BaseResource[] getQuery(ServletContext ctx, String queryId, Map<String, Object> map) throws ApplicationException {
        if (QueryTypes.QUERY_GET_BY_ID.toString().equals(queryId)) {
            String id = (String) map.get("id");
            BaseResource customer = CustomerHelper.getInstance().getById(id);
            if (customer == null)
                return null;
            BaseResource[] resources = new customer[1];
            resources[0] = customer;
            return resources;
        }
        throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_QUERY);
    }
}
