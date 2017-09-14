package platform.webservice.servlet;

import platform.resource.email_account;
import platform.webservice.BaseServlet;
import platform.webservice.service.Email_accountService;

public class Email_accountServlet extends BaseServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Email_accountServlet() {
		super(new email_account(), new Email_accountService());
	}

}
