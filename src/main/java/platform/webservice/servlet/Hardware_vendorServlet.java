package platform.webservice.servlet;

import platform.resource.hardware_vendor;
import platform.webservice.BaseServlet;
import platform.webservice.service.Hardware_vendorService;

public class Hardware_vendorServlet extends BaseServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Hardware_vendorServlet() {
		super(new hardware_vendor(), new Hardware_vendorService());
	}

}
