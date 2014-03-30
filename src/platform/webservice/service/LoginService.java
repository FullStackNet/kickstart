package platform.webservice.service;

import platform.helper.UserHelper;
import platform.resource.BaseResource;
import platform.resource.login;
import platform.resource.user;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Util;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;

public class LoginService extends BaseService{
	public LoginService() {
		super(new login());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		login _login = (login) resource;
		user _user = UserHelper.getInstance().getByEmailId(_login.getEmail_id());
		if (_user == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid User Id or Password");
		if (_login.getPassword().equals(_user.getPassword())) {
			return;
		}
		String doubleMd5 = Util.doubleMD5(_login.getPassword());
		if (doubleMd5.equals(_user.getPassword())){
			return;
		}
		throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid User Id or Password");

	}	
}
