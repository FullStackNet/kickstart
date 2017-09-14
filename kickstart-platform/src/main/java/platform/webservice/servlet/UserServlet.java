package platform.webservice.servlet;

import platform.resource.user;
import platform.webservice.BaseServlet;
import platform.webservice.service.UserService;

public class UserServlet extends BaseServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public UserServlet() {
		super(new user(), new UserService());
	}
	
	@Override
	protected boolean isLoginRequired() {
		return false;
	}
}
