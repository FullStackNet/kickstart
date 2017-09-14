package platform.webservice.servlet;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import platform.datasync.DataSyncManager;
import platform.datasync.DataSyncMessage;
import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.C4t_objectHelper;
import platform.helper.CustomerHelper;
import platform.helper.SessionHelper;
import platform.helper.UserHelper;
import platform.resource.BaseResource;
import platform.resource.c4t_object;
import platform.resource.customer;
import platform.resource.login;
import platform.resource.user;
import platform.util.ApplicationException;
import platform.util.Util;
import platform.version.VersionManager;
import platform.webservice.BaseServlet;
import platform.webservice.service.LoginService;
import application.c4t.vehicle.school.helper.Student_parentHelper;
import application.c4t.vehicle.school.resource.student_parent;

public class LoginServlet extends BaseServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super(new login(), new LoginService());
	}
	
	@Override
	protected boolean isLoginRequired() {
		return false;
	}
	
	protected void postProcessing(platform.webservice.ServletContext ctx, HttpServletRequest request, HttpServletResponse response, BaseResource resource, String action) throws ApplicationException {
		if (resource == null)
			return;

		login _login = (login)resource;
		user _user = UserHelper.getInstance().getByEmailId(_login.getEmail_id());
		if (_user == null)
			_user = UserHelper.getInstance().getByMobileId(_login.getEmail_id());
		ctx.setCustomerId(_user.getCustomer_id());
		ctx.setUserId(_user.getId());
		ctx.setUserName(_user.getName());
		ctx.setUserType(_user.getType());
		ctx.setSuperUser(_user.getSuper_user());
		customer _customer = (customer)CustomerHelper.getInstance().getById(_user.getCustomer_id());
		if (_customer != null) {
			ctx.setCustomerName(_customer.getName());
		}
		// Add cookie for this session
		_login.setSession_id(ctx.getSessionId());
		_login.setApi_version(VersionManager.API_VERSION);
		addSessionCookie(request, response, ctx.getSessionId(), null);
		if (_user != null) {
			user new_user = new user(_user.getId());
			new_user.setLast_login(new java.util.Date().getTime());
			UserHelper.getInstance().update(new_user);
			student_parent fetched_student_parent = Student_parentHelper.getInstance().getByMobileOrEmailId(_user.getMobile_no(), _user.getEmail_id());
			if (fetched_student_parent != null) {
				student_parent _student_parent = new student_parent(fetched_student_parent.getId());
				_student_parent.setLast_login(new java.util.Date().getTime());
				_student_parent.setInstalled_app("Y");
				Student_parentHelper.getInstance().update(_student_parent);
			}
			// copy the session in the other m/c
			String user_id = ctx.getUserId();
			Expression e1 = new Expression(c4t_object.FIELD_OBJECT_TYPE, REL_OP.EQ, "COMMUNITY_USER");
			Expression e2 = new Expression(c4t_object.FIELD_USER_ID, REL_OP.EQ, user_id);
			Expression e = new Expression(e1, LOG_OP.AND, e2);
			BaseResource[] resources =  C4t_objectHelper.getInstance().getByExpression(e,new String[]{c4t_object.FIELD_NAME});
			if (!Util.isEmpty(resources)) {
				Map<String, Boolean> map = new HashMap<String, Boolean>();
				for(int i=0; i < resources.length ; i++) {
					c4t_object _object = (c4t_object)resources[i];
					if (_object == null)
						continue;
					c4t_object _community = C4t_objectHelper.getInstance().getById(_object.getParent_id());
					if (_community == null)
						_community = C4t_objectHelper.getInstance().getById(_object.getCommunity_id());
					if (_community == null)
						continue;	
					String server_url = _community.getServer_url(); 
					if (Util.isEmpty(server_url))
						continue;
					if (Util.isDataSyncNeed(_community)) {
						if (map.get(server_url) == null) {
							DataSyncMessage message = new DataSyncMessage(_community.getServer_url(), SessionHelper.getInstance(), ctx.getSessionId());
							DataSyncManager.getInstance().send(message);
						}
						map.put(_community.getServer_url(), true);
					}
				}
			}
		}
		
	}
}
