package platform.webservice.servlet;

import platform.resource.invite;
import platform.webservice.BaseServlet;
import platform.webservice.service.InviteService;

public class InviteServlet extends BaseServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InviteServlet() {
		super(new invite(), new InviteService());
	}
	
	@Override
	protected boolean isLoginRequired() {
		return false;
	}
}
