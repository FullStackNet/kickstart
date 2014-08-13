package platform.webservice.service;

import platform.helper.InviteHelper;
import platform.helper.UserHelper;
import platform.resource.BaseResource;
import platform.resource.invite;
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
		if (_login.getEmail_id() != null) 
			_login.setEmail_id(_login.getEmail_id().toLowerCase());
		user _user = UserHelper.getInstance().getByEmailId(_login.getEmail_id());
		if (_user == null)
			_user = UserHelper.getInstance().getByMobileId(_login.getEmail_id());
		
		if (_user != null) {
			if (_login.getPassword().equals(_user.getPassword())) {
				return;
			}
			String doubleMd5 = Util.doubleMD5(_login.getPassword());
			if (doubleMd5.equals(_user.getPassword())){
				return;
			}
		}
		invite _invite = InviteHelper.getInstance().validateActivtion(_login.getEmail_id(),_login.getPassword());
		if (_invite != null) {
			if (_user == null)
				throw new ApplicationException(ExceptionSeverity.ERROR, _invite.getId()+"::RESET_PASSWORD");
			else {
				return;
			}
		}
		throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid User Id or Password");

	}	
}
