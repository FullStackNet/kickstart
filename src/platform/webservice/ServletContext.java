package platform.webservice;

import platform.helper.SessionHelper;
import platform.resource.session;
import platform.util.ApplicationException;



public class ServletContext {
	private session _session;
	String sessionId;
	
	public ServletContext(String sessionId) throws ApplicationException {
		//Don't start a new session or add it to DB if no session id is coming
		//Ex: API calls made without logging in
		_session = (session) SessionHelper.getInstance().getById(sessionId);
		if (_session == null) {
			_session = new session(sessionId);
			SessionHelper.getInstance().add(_session);
		}
		this.sessionId = sessionId;
	}

	public String getSessionId() {
		return sessionId;
	}
	
	public String getUserId() {
		return _session.getUser_id();
	}

	public String getCustomerId() {
		return _session.getCustomer_id();
	}

	public String getUserType() {
		return _session.getUser_type();
	}
	
	public String getUserName() {
		return _session.getUser_name();
	}
	
	public String getSuperUser() {
		return _session.getSuper_user();
	}
	
	
	public void setUserId(String userId) {
		session __session = new session(sessionId);
		__session.setUser_id(userId);
		try {
			SessionHelper.getInstance().update(__session);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		_session.setUser_id(userId);
	}
	
	public void setSuperUser(String superUser) {
		session __session = new session(sessionId);
		__session.setSuper_user(superUser);
		try {
			SessionHelper.getInstance().update(__session);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		_session.setSuper_user(superUser);
	}
	

	public void setUserName(String userName) {
		session __session = new session(sessionId);
		__session.setUser_name(userName);
		try {
			SessionHelper.getInstance().update(__session);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setUserType(String type) {
		session __session = new session(sessionId);
		__session.setUser_type(type);
		try {
			SessionHelper.getInstance().update(__session);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void setCustomerId(String customerId) {
		session __session = new session(sessionId);
		__session.setCustomer_id(customerId);
		try {
			SessionHelper.getInstance().update(__session);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void delete() throws ApplicationException {
		SessionHelper.getInstance().deleteById(sessionId);
	}
}