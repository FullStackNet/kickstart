package platform.webservice.service;

import platform.helper.SessionHelper;
import platform.resource.BaseResource;
import platform.resource.login;
import platform.util.ApplicationException;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;

public class LogoutService extends BaseService {
    public LogoutService() {
        super(new login());
    }

    public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
        SessionHelper.getInstance().deleteById(ctx.getSessionId());
    }
}
