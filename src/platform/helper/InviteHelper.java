package platform.helper;

import javax.print.attribute.standard.Severity;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.invite;
import platform.resource.profile;
import platform.resource.user;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Util;


public class InviteHelper extends BaseHelper {
	
	public InviteHelper() {
		super(new profile());
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

	public invite getByMobileOrEmailId(String mobileno,String emailId) {
		Expression e1 = new Expression(user.FIELD_MOBILE_NO, REL_OP.EQ, mobileno);
		Expression e2 = new Expression(user.FIELD_EMAIL_ID, REL_OP.EQ, emailId);
		Expression e = new Expression(e1, LOG_OP.OR, e2);
		
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
	public invite verifyKey(String mobileno,String emailId,String key) throws ApplicationException {
		if (key == null) 
			throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid key");
		Expression e1 = new Expression(user.FIELD_MOBILE_NO, REL_OP.EQ, mobileno);
		Expression e2 = new Expression(user.FIELD_EMAIL_ID, REL_OP.EQ, emailId);
		Expression e = new Expression(e1, LOG_OP.OR, e2);
		BaseResource[] resources = getByExpression(e);
		
		if (!Util.isEmpty(resources)) {
			for(int i= 0; i < resources.length; i++) {
				invite _invite = (invite)resources[i];
				if (key.equals(_invite.getKey()))
				if (_invite.getStatusEx().equals(invite.INVITE_STATUS_JOINED)) {
					throw new ApplicationException(ExceptionSeverity.ERROR, "Already Joined");
				}
				updateStatus(_invite.getId(), invite.INVITE_STATUS_JOINED);
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
}
