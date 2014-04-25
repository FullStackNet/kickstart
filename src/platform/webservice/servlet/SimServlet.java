package platform.webservice.servlet;

import platform.resource.sim;
import platform.webservice.BaseServlet;
import platform.webservice.service.SimService;

public class SimServlet extends BaseServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public SimServlet() {
		super(new sim(), new SimService());
	}

}
