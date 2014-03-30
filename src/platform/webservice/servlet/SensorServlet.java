package platform.webservice.servlet;

import platform.resource.sensor;
import platform.webservice.BaseServlet;
import platform.webservice.service.SensorService;

public class SensorServlet extends BaseServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public SensorServlet() {
		super(new sensor(), new SensorService());
	}

}
