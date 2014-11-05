package platform.webservice.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import platform.helper.UserHelper;
import platform.resource.BaseResource;
import platform.resource.login;
import platform.resource.user;
import platform.util.ApplicationException;
import platform.version.VersionManager;
import platform.webservice.BaseServlet;
import platform.webservice.service.LoginService;
import platform.webservice.ui.UIServletContext;
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

	protected void postProcessing(UIServletContext ctx, HttpServletRequest request, HttpServletResponse response, BaseResource resource, String action) throws ApplicationException {
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
		}
		
	}
}
