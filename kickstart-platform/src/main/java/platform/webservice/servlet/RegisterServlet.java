package platform.webservice.servlet;

import platform.resource.register;
import platform.webservice.BaseServlet;
import platform.webservice.service.RegisterService;

public class RegisterServlet extends BaseServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RegisterServlet() {
		super(new register(), new RegisterService());
	}
}
