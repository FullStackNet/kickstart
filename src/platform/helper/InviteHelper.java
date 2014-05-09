package platform.helper;

import application.c4t.vehicle.school.helper.School_user_mapHelper;
import application.c4t.vehicle.school.helper.StudentHelper;
import application.c4t.vehicle.school.helper.Student_mapHelper;
import application.c4t.vehicle.school.helper.TeacherHelper;
import application.c4t.vehicle.school.helper.Teacher_mapHelper;
import application.c4t.vehicle.school.resource.student;
import application.c4t.vehicle.school.resource.teacher;
import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.invite;
import platform.resource.user;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Util;


public class InviteHelper extends BaseHelper {

	public InviteHelper() {
		super(new invite());
		// TODO Auto-generated constructor stub
	}
	private static InviteHelper instance;

	public static InviteHelper getInstance() {
		if (instance == null)
			instance = new InviteHelper();
		return instance;
	}

	public invite getByEmailId(String emailId) {
		Expression e = new Expression(user.FIELD_EMAIL_ID, REL_OP.EQ, emailId);
		BaseResource[] resources = getByExpression(e);
		if (!Util.isEmpty(resources)) {
			return (invite)resources[0];
		}
		return null;
	}

	public invite getInvite(String mobileno,String emailId,String referenceId) {
		if (mobileno == null) {
			mobileno = "dummy";
		}
		Expression e1 = new Expression(user.FIELD_MOBILE_NO, REL_OP.EQ, mobileno);
		Expression e2 = new Expression(user.FIELD_EMAIL_ID, REL_OP.EQ, emailId);
		Expression e3 = new Expression(e1, LOG_OP.OR, e2);
		Expression e4 = new Expression(invite.FIELD_REFERENCE_ID, REL_OP.EQ, referenceId);
		Expression e = new Expression(e3, LOG_OP.AND, e4);
			
		BaseResource[] resources = getByExpression(e);
		if (!Util.isEmpty(resources)) {
			return (invite)resources[0];
		}
		return null;
	}

	public invite getByReferenceId(String referenceId) {
		Expression e = new Expression(invite.FIELD_REFERENCE_ID, REL_OP.EQ, referenceId);
		BaseResource[] resources = getByExpression(e);
		if (!Util.isEmpty(resources)) {
			return (invite)resources[0];
		}
		return null;
	}
	
	public void updateStatus(String inviteId,String status) {
		if (inviteId == null) return;
		if (status == null) return;

		invite _invite = new invite(inviteId);
		_invite.setStatus(status);
		try {
			update(_invite);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public invite verifyKey(String inviteId,String key) throws ApplicationException {
		if (key == null) 
			throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid key");

		invite _invite = (invite)getById(inviteId);

		if (_invite != null) {
			if (key.equals(_invite.getKey())) {
				if (_invite.getStatusEx().equals(invite.INVITE_STATUS_JOINED)) {
					throw new ApplicationException(ExceptionSeverity.ERROR, "Already Joined");
				}
				return _invite;
			}
		} else {
			throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Invitation");
		}
		throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid key");
	}

	public invite getByMobileId(String mobileno) {
		Expression e = new Expression(user.FIELD_MOBILE_NO, REL_OP.EQ, mobileno);
		BaseResource[] resources = getByExpression(e);
		if (!Util.isEmpty(resources)) {
			return (invite)resources[0];
		}
		return null;
	}
	
	public void parentInviteAccepted(invite _invite, String userId ) throws ApplicationException {
		//Student_mapHelper.getInstance().addUser(_fetched_resource.getReference_id(), _user.getId());
		//User_mapHelper.getInstance().addApplianr(userId, applianceId);
		student _student = (student)StudentHelper.getInstance().getById(_invite.getReference_id());
		if (_student != null) {
			Student_mapHelper.getInstance().addUser(_student.getId(), userId);
			School_user_mapHelper.getInstance().addStudent(userId,_student.getId());
		}
	}
	
	public void teacherInviteAccepted(invite _invite, String userId ) throws ApplicationException {
		teacher _teacher = (teacher)TeacherHelper.getInstance().getById(_invite.getReference_id());
		if (_teacher != null) {
			Teacher_mapHelper.getInstance().addUser(_teacher.getId(), userId);
			School_user_mapHelper.getInstance().addStudent(userId,_teacher.getId());
		}
	}
	
	public void acceptInvite(invite _invite) throws ApplicationException {
		invite _fetched_resource = (invite)getById(_invite.getId());
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
		if (_invite.getPasswordEx() != null)
			_user.setPassword(Util.doubleMD5(_invite.getPasswordEx()));
		if (invite.INVITE_TYPE_JOIN_SCHOOL_TRACK_SERVICE.equals(_fetched_resource.getInvite_type())) {
			// check the user if exists
			_user.setSchoolTrackerService("Y");
			_user.setParentService("Y");
			InviteHelper.getInstance().parentInviteAccepted(_fetched_resource, _user.getId());
		}
		if (invite.INVITE_TYPE_JOIN_TEACHER.equals(_fetched_resource.getInvite_type())) {
			// check the user if exists
			_user.setTeacherService("Y");
			InviteHelper.getInstance().teacherInviteAccepted(_fetched_resource, _user.getId());
		}
		UserHelper.getInstance().AddOrUpdate(_user);
	}
}
