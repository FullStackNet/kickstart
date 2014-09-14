package platform.webservice.servlet;

import platform.resource.unsubscribe_email;
import platform.webservice.BaseServlet;
import platform.webservice.service.Unsubscribe_emailService;

public class Unsubscribe_emailServlet extends BaseServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Unsubscribe_emailServlet() {
		super(new unsubscribe_email(), new Unsubscribe_emailService());
	}

}
