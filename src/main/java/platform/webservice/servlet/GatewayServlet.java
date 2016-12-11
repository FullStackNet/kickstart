package platform.webservice.servlet;

import platform.resource.gateway;
import platform.webservice.BaseServlet;
import platform.webservice.service.GatewayService;

public class GatewayServlet extends BaseServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public GatewayServlet() {
		super(new gateway(), new GatewayService());
	}

}
