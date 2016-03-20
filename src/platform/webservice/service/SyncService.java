package platform.webservice.service;

import java.util.Map;

import platform.exception.ExceptionEnum;
import platform.helper.C4t_objectHelper;
import platform.helper.C4t_relationHelper;
import platform.helper.CustomerHelper;
import platform.helper.UserHelper;
import platform.helper.User_mapHelper;
import platform.resource.BaseResource;
import platform.resource.c4t_object;
import platform.resource.c4t_relation;
import platform.resource.customer;
import platform.resource.user;
import platform.resource.user_map;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Json;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;

public class SyncService extends BaseService{
	public SyncService() {
		super(CustomerHelper.getInstance(),new customer());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		c4t_object _object = (c4t_object) resource;
		
		if (_object.getType().equalsIgnoreCase("c4t_object")) {
			c4t_object _obj = (c4t_object)Json.stringToResource(_object.getDescription(), c4t_object.class);
			C4t_objectHelper.getInstance().AddOrUpdate(_obj);
		} else if (_object.getType().equalsIgnoreCase("customer")) {
			customer _obj = (customer)Json.stringToResource(_object.getDescription(), customer.class);
			CustomerHelper.getInstance().AddOrUpdate(_obj);
		} else if (_object.getType().equalsIgnoreCase("user")) {
			user _obj = (user)Json.stringToResource(_object.getDescription(), user.class);
			UserHelper.getInstance().AddOrUpdate(_obj);
		}  else if (_object.getType().equalsIgnoreCase("user_map")) {
			user_map _obj = (user_map)Json.stringToResource(_object.getDescription(), user_map.class);
			User_mapHelper.getInstance().AddOrUpdate(_obj);
		}  else if (_object.getType().equalsIgnoreCase("c4t_relation")) {
			c4t_relation _obj = (c4t_relation)Json.stringToResource(_object.getDescription(), c4t_relation.class);
			C4t_relationHelper.getInstance().AddOrUpdate(_obj);
		}
		
	}

	public BaseResource[] getQuery(ServletContext ctx, String queryId, Map<String, Object> map) throws ApplicationException {
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_QUERY);
	}
}
