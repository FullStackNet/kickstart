package platform.webservice;

import java.util.HashMap;
import java.util.Map;

import platform.helper.CustomerHelper;
import platform.helper.SessionHelper;
import platform.resource.customer;
import platform.resource.session;
import platform.util.ApplicationException;



public class ServletContext {
	private session _session;
	String path;
	Map<String , String> params;
	
	public ServletContext(session _session) throws ApplicationException {
		//Don't start a new session or add it to DB if no session id is coming
		//Ex: API calls made without logging in
		 _session = (session) SessionHelper.getInstance().getById(_session.getId());
		this._session = _session;
		params = new HashMap<String , String>();
	}

	public void addParam(String name,String value) {
		params.put(name, value);
	}
	
	public String getParamValue(String name) {
		return params.get(name);
	}
	
	public String getSessionId() {
		return _session.getId();
	}
	
	public String getUserId() {
		return _session.getUser_id();
	}

	public String getCustomerId() {
		return _session.getCustomer_id();
	}

	public String getCustomerName() {
		if (_session.getCustomer_name() == null) {
			if (_session.getCustomer_id() != null) {
			customer _customer = (customer)CustomerHelper.getInstance().getById(_session.getCustomer_id());
			if (_customer != null)
				setCustomerName(_customer.getName());
			}
		}
		return _session.getCustomer_name();
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
		_session.setUser_id(userId);
		session __session = new session(_session.getId());
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
		_session.setSuper_user(superUser);
		session __session = new session(_session.getId());
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
		_session.setUser_name(userName);
		session __session = new session(_session.getId());
		__session.setUser_name(userName);
		try {
			SessionHelper.getInstance().update(__session);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setUserType(String type) {
		_session.setUser_type(type);
		session __session = new session(_session.getId());
		__session.setUser_type(type);
		try {
			SessionHelper.getInstance().update(__session);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void setServletPath(String path) {
		this.path= path;
	}
	
	public String getServletPath() {
		return path;
	}
	
	public void setCustomerId(String customerId) {
		_session.setCustomer_id(customerId);
		session __session = new session(_session.getId());
		__session.setCustomer_id(customerId);
		try {
			SessionHelper.getInstance().update(__session);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setCustomerName(String customerName) {
		_session.setCustomer_name(customerName);
		session __session = new session(_session.getId());
		__session.setCustomer_name(customerName);
		try {
			SessionHelper.getInstance().update(__session);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void delete() throws ApplicationException {
		SessionHelper.getInstance().deleteById(_session.getId());
	}
}