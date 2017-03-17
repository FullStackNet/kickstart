package platform.webservice.servlet;

import platform.resource.login;
import platform.webservice.BaseServlet;
import platform.webservice.service.LoginService;

public class LogoutServlet extends BaseServlet {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public LogoutServlet() {
        super(new login(), new LoginService());
    }
}
