package platform.webservice.ui;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import platform.helper.SessionHelper;
import platform.resource.session;
import platform.util.ApplicationException;
import platform.webservice.UAgentInfo;
import platform.webservice.ui.util.PageBuilder;



public class UIServletContext {
	String currentURL;
	
	String domainName;
	String userAgent;
	private session _session;
	String sessionId;
	PageBuilder mPageBuilder;
	UAgentInfo uagentInfo;
	String mobile;
	Map<String , String> params;
	HttpServletResponse response;
	String path;

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getCurrentURL() {
		return currentURL;
	}

	public void setCurrentURL(String currentURL) {
		this.currentURL = currentURL;
	}
	
	public void setServletPath(String path) {
		this.path= path;
	}
	
	public String getServletPath() {
		return path;
	}
	
	
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

	public String getContextId() {
		return _session.getContext_id();
	}
	
	public String getContextName() {
		return _session.getContext_name();
	}
	
	public boolean isSuperUser() {
		if ("Y".equals(_session.getSuper_user())) {
			return true;
		}
		return false;
	}

	
	public String getCustomerId() {
		return _session.getCustomer_id();
	}
	
	public String getCustomerName() {
		return _session.getCustomer_name();
	}

	public String getStudentId() {
		return _session.getCustomer_id();
	}
	
	public String getUserType() {
		return _session.getUser_type();
	}
	
	public String getUserName() {
		return _session.getUser_name();
	}
	
	public String getRole() {
		return _session.getRole();
	}
	
	public void setStudentId(String studentId) {
		session __session = new session(sessionId);
		__session.setStudent_id(studentId);
		try {
			SessionHelper.getInstance().update(__session);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		_session.setStudent_id(studentId);
	}
	
	public void setContextId(String contextId) {
		session __session = new session(sessionId);
		__session.setContext_id(contextId);
		try {
			SessionHelper.getInstance().update(__session);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		_session.setContext_id(contextId);
	}
	
	public void setContextName(String contextName) {
		session __session = new session(sessionId);
		__session.setContext_name(contextName);
		try {
			SessionHelper.getInstance().update(__session);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		_session.setContext_name(contextName);
	}
	
	public void setRole(String role) {
		session __session = new session(sessionId);
		__session.setRole(role);
		try {
			SessionHelper.getInstance().update(__session);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		_session.setRole(role);
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
		__session.setUser_id(superUser);
		try {
			SessionHelper.getInstance().update(__session);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		_session.setSuper_user(superUser);
	}

	public void setReadonlyUser(String readonly) {
		session __session = new session(sessionId);
		__session.setReadonly_user(readonly);
		try {
			SessionHelper.getInstance().update(__session);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		_session.setReadonly_user(readonly);
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
	
	public void setCustomerName(String customerName) {
		session __session = new session(sessionId);
		__session.setCustomer_name(customerName);
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

	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}
	public Map<String, String> getParams() {
		return params;
	}
}