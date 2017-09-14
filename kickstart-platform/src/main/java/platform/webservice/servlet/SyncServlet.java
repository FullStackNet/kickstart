package platform.webservice.servlet;

import platform.resource.c4t_object;
import platform.webservice.BaseServlet;
import platform.webservice.service.SyncService;

public class SyncServlet extends BaseServlet {
	/**
	 * 
	 */
	@Override
	protected boolean isLoginRequired() {
		return false;
	}
	
	private static final long serialVersionUID = 1L;
	public SyncServlet() {
		super(new c4t_object(), new SyncService());
	}
}
