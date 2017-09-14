package platform.webservice.servlet;

import platform.resource.managed_object;
import platform.webservice.BaseServlet;
import platform.webservice.service.ManagedObjectService;

public class ManagedObjectServlet extends BaseServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ManagedObjectServlet() {
		super(new managed_object(), new ManagedObjectService());
	}

}
