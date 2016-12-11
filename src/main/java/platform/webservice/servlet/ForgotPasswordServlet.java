package platform.webservice.servlet;

import platform.resource.user;
import platform.webservice.BaseServlet;
import platform.webservice.service.UserService;

public class ForgotPasswordServlet extends BaseServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ForgotPasswordServlet() {
		super(new user(), new UserService());
	}
}
