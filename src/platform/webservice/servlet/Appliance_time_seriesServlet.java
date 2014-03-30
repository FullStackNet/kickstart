package platform.webservice.servlet;

import platform.resource.appliance_time_series;
import platform.webservice.BaseServlet;
import platform.webservice.service.Appliance_time_seriesService;

public class Appliance_time_seriesServlet extends BaseServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Appliance_time_seriesServlet() {
		super(new appliance_time_series(), new Appliance_time_seriesService());
	}

}
