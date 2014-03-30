package platform.webservice.servlet;

import platform.resource.appliance;
import platform.webservice.BaseServlet;
import platform.webservice.service.ApplianceService;

public class ApplianceServlet extends BaseServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ApplianceServlet() {
		super(new appliance(), new ApplianceService());
	}

}
