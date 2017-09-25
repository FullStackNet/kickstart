package platform.webservice.service;

import platform.helper.InviteHelper;
import platform.helper.SessionHelper;
import platform.helper.UserHelper;
import platform.resource.*;
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
			String doubleMd5 = Util.doubleMD5(_login.getPassword());
			if (doubleMd5.equals(_user.getPassword()) ||
					_login.getPassword().equals(_user.getPassword())){
				String sessionId = Util.getUniqueId();
				session _session = new session();
				_session.setId(sessionId);
				_session.setUser_id(_user.getId());
				_session.setUser_type(_user.getType());
				_session.setUser_name(_user.getName());
				_session.setCustomer_id(_user.getCustomer_id());
				_session.setSuper_user(_user.getSuper_user());
				SessionHelper.getInstance().add(_session);
				_login.setSession_id(_session.getId());
				return;
			}
		}
		invite _invite = InviteHelper.getInstance().validateActivtion(_login.getEmail_id(),_login.getPassword());
		if (_invite != null) {
			if (_user == null)
				throw new ApplicationException(ExceptionSeverity.ERROR, _invite.getId()+"::RESET_PASSWORD");
			else {
				String sessionId = Util.getUniqueId();
				session _session = new session();
				_session.setId(sessionId);
				_session.setUser_id(_user.getId());
				_session.setUser_type(_user.getType());
				_session.setUser_name(_user.getName());
				_session.setCustomer_id(_user.getCustomer_id());
				_session.setSuper_user(_user.getSuper_user());
				SessionHelper.getInstance().add(_session);
				_login.setSession_id(_session.getId());

				return;
			}
		}
			throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid User Id or Password");

	}	
}
