package platform.webservice.service;

import java.util.Map;

import platform.exception.ExceptionEnum;
import platform.helper.InviteHelper;
import platform.helper.UserHelper;
import platform.resource.BaseResource;
import platform.resource.invite;
import platform.resource.user;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Util;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;
import application.c4t.vehicle.school.helper.StudentHelper;
import application.c4t.vehicle.school.helper.Student_mapHelper;
import application.c4t.vehicle.school.resource.student;

public class InviteService extends BaseService{
	public InviteService() {
		super(InviteHelper.getInstance(),new invite());
	}


	public void action(ServletContext ctx, BaseResource resource,String action) throws ApplicationException {
		if (action.equalsIgnoreCase(WebServiceContants.OPERATION_CONFIRM)) {
			invite _resource = (invite) resource;
			if (_resource.getPassword() == null) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Empty Password not allowed");
			}
			
			if (!_resource.getPasswordEx().equals(_resource.getConfirm_password())) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Password and confirm password not matching");
			}
			invite _fetched_resource = (invite)getHelper().getById(_resource.getId());
			if (invite.INVITE_TYPE_JOIN_SCHOOL_TRACK_SERVICE.equals(_fetched_resource.getInvite_type())) {
				// check the user if exists
				user _user = UserHelper.getInstance().getByMobileOrEmailId(_fetched_resource.getMobile_no(), _fetched_resource.getEmail_id());
				if (_user == null) {
					 _user = new user();
					 _user.setType(user.USER_TYPE_USER);
				}
				if (_user.getMobile_no() == null)
					_user.setMobile_no(_fetched_resource.getMobile_no());
				if (_user.getEmail_id() == null)
					_user.setEmail_id(_fetched_resource.getEmail_id());
				if (_user.getName() == null)
					_user.setName(_fetched_resource.getName());
				_user.setPassword(Util.doubleMD5(_resource.getPasswordEx()));
				UserHelper.getInstance().add(_user);
				Student_mapHelper.getInstance().addUser(_fetched_resource.getReference_id(), _user.getId());
				//User_mapHelper.getInstance().addApplianr(userId, applianceId);
				student _student = (student)StudentHelper.getInstance().getById(_fetched_resource.getReference_id());
				if (_student == null)
					return;
			}
		} 
	}

	
	public BaseResource[] getQuery(ServletContext ctx, String queryId, Map<String, Object> map) throws ApplicationException {
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_QUERY);
	}
}
