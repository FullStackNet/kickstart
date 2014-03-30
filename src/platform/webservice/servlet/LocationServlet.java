package platform.webservice.servlet;

import platform.resource.location;
import platform.webservice.BaseServlet;
import platform.webservice.service.LocationService;

public class LocationServlet extends BaseServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public LocationServlet() {
		super(new location(), new LocationService());
	}

}
