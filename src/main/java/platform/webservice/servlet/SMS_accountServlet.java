package platform.webservice.servlet;

import platform.resource.sms_account;
import platform.webservice.BaseServlet;
import platform.webservice.service.SMS_accountService;

public class SMS_accountServlet extends BaseServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public SMS_accountServlet() {
		super(new sms_account(), new SMS_accountService());
	}

}
