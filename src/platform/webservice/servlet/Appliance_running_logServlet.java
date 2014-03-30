package platform.webservice.servlet;

import platform.resource.appliance_running_log;
import platform.webservice.BaseServlet;
import platform.webservice.service.Appliance_running_logService;

public class Appliance_running_logServlet extends BaseServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Appliance_running_logServlet() {
		super(new appliance_running_log(), new Appliance_running_logService());
	}

}
