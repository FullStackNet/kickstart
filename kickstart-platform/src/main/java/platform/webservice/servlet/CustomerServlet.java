package platform.webservice.servlet;

import platform.resource.customer;
import platform.webservice.BaseServlet;
import platform.webservice.service.CustomerService;

public class CustomerServlet extends BaseServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public CustomerServlet() {
		super(new customer(), new CustomerService());
	}
}
