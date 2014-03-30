package platform.webservice.servlet;

import platform.resource.device;
import platform.webservice.BaseServlet;
import platform.webservice.service.DeviceService;

public class DeviceServlet extends BaseServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public DeviceServlet() {
		super(new device(), new DeviceService());
	}

}
