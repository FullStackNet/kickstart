package service;

import application.helper.$Resource-nameHelper;
import application.resource.$resource-name;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.webservice.BaseService;

import platform.webservice.ServletContext;
import java.util.Map;

public class $Resource-nameService extends BaseService {

    public $Resource-nameService() {
        super($Resource-nameHelper.getInstance(), new $resource-name());
    }

    public BaseResource[] getQuery(ServletContext ctx, String queryId, Map<String, Object> map) throws ApplicationException {
        
		/*
		if ("GET_ALL".equals(queryId)) {
            BaseResource[] res = $Resource-nameHelper.getInstance().getAll();
            return res;
        }
		*/
		
        throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Query");
    }
}
