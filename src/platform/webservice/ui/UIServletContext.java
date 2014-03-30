package platform.webservice.ui;

import java.util.HashMap;
import java.util.Map;

import platform.helper.SessionHelper;
import platform.resource.session;
import platform.util.ApplicationException;
import platform.webservice.UAgentInfo;
import platform.webservice.ui.util.PageBuilder;



public class UIServletContext {
	private session _session;
	String sessionId;
	PageBuilder mPageBuilder;
	UAgentInfo uagentInfo;
	String mobile;
	Map<String , String> params;
	public void setMobileRequest(String mobile) {
		this.mobile = mobile;
	}
	
	public boolean isMobileRequest() {
		if (mobile != null) {
			if (mobile.equalsIgnoreCase("yes")) {
				return true;
			}
		}
		if (uagentInfo == null)
			return false;
		if (uagentInfo.detectMobileQuick()) {
	        return true;
	    }
	    return false;
	}
    
	public UIServletContext(String sessionId) throws ApplicationException {
		//Don't start a new session or add it to DB if no session id is coming
		//Ex: API calls made without logging in
		_session = (session) SessionHelper.getInstance().getById(sessionId);
		if (_session == null) {
			_session = new session(sessionId);
			SessionHelper.getInstance().add(_session);
		}
		this.sessionId = sessionId;
		mPageBuilder = new PageBuilder(this);
		params = new HashMap<String , String>();
	}
	
	public void addParam(String name,String value) {
		params.put(name, value);
	}
	
	public String getParamValue(String name) {
		return params.get(name);
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

	public PageBuilder getPageBuilder() {
		return mPageBuilder;
	}

	public void setPageBuilder(PageBuilder pageBuilder) {
		this.mPageBuilder = pageBuilder;
	}

	public UAgentInfo getUagentInfo() {
		return uagentInfo;
	}

	public void setUagentInfo(UAgentInfo uagentInfo) {
		this.uagentInfo = uagentInfo;
	}
}