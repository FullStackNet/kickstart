package platform.webservice.servlet;

import platform.resource.controller;
import platform.webservice.BaseServlet;
import platform.webservice.service.ControllerService;

public class ControllerServlet extends BaseServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ControllerServlet() {
		super(new controller(), new ControllerService());
	}

}
