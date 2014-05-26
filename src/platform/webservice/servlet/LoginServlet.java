package platform.webservice.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import platform.helper.UserHelper;
import platform.resource.BaseResource;
import platform.resource.login;
import platform.resource.user;
import platform.util.ApplicationException;
import platform.version.VersionManager;
import platform.webservice.BaseServlet;
import platform.webservice.ServletContext;
import platform.webservice.service.LoginService;

public class LoginServlet extends BaseServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super(new login(), new LoginService());
	}

	protected void postProcessing(ServletContext ctx, HttpServletRequest request, HttpServletResponse response, BaseResource resource, String action) throws ApplicationException {
		if (resource == null)
			return;

		login _login = (login)resource;
		user _user = UserHelper.getInstance().getByEmailId(_login.getEmail_id());
		if (_user == null)
			_user = UserHelper.getInstance().getByMobileId(_login.getEmail_id());
		ctx.setCustomerId(_user.getCustomer_id());
		ctx.setUserId(_user.getId());
		ctx.setUserName(_user.getName());
		ctx.setUserType(_user.getType());
		// Add cookie for this session
		_login.setSession_id(ctx.getSessionId());
		_login.setApi_version(VersionManager.API_VERSION);
		addSessionCookie(request, response, ctx.getSessionId(), null);
	}
}
