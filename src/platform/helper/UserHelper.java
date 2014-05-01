package platform.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.db.Expression;
import platform.db.JoinField;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.user;
import platform.util.Util;


public class UserHelper extends BaseHelper {

	public UserHelper() {
		super(new user());
		// TODO Auto-generated constructor stub
	}
	private static UserHelper instance;

	public static UserHelper getInstance() {
		if (instance == null) {
			instance = new UserHelper();
			HelperFactory.getInstance().register(instance);
		}
		return instance;
	}

	public boolean isExistsByEmailId(String emailId) {
		Expression e = new Expression(user.FIELD_EMAIL_ID, REL_OP.EQ, emailId);
		BaseResource[] resources = UserHelper.getInstance().getByExpression(e);
		if (!Util.isEmpty(resources))
			return true;
		return false;
	}

	public user getByEmailId(String emailId) {
		Expression e = new Expression(user.FIELD_EMAIL_ID, REL_OP.EQ, emailId);
		BaseResource[] resources = UserHelper.getInstance().getByExpression(e);
		if (!Util.isEmpty(resources)) {
			return (user)resources[0];
		}
		return null;
	}

	public user getByMobileId(String mobileno) {
		Expression e = new Expression(user.FIELD_MOBILE_NO, REL_OP.EQ, mobileno);
		BaseResource[] resources = UserHelper.getInstance().getByExpression(e);
		if (!Util.isEmpty(resources)) {
			return (user)resources[0];
		}
		return null;
	}
	
	public user getByMobileOrEmailId(String mobileno,String emailId) {
		Expression e1 = null, e2 = null, e = null;
		if (!mobileno.isEmpty()) {
			e1 = new Expression(user.FIELD_MOBILE_NO, REL_OP.EQ, mobileno);
		}
		if (!emailId.isEmpty()) {
			e2 = new Expression(user.FIELD_EMAIL_ID, REL_OP.EQ, emailId);
		}
		
		if ((e1 != null) && (e2 != null)) {
			e = new Expression(e1, LOG_OP.OR, e2);
		} else {
			if (e1 != null) {
				e = e1;
			} else {
				e = e2;
			}
		}
		
		BaseResource[] resources = getByExpression(e);
		if (!Util.isEmpty(resources)) {
			return (user)resources[0];
		}
		return null;
	}
	public ArrayList<Map<String, Object>> getC4TAdmin() {
		ArrayList<Map<String, Object>>  users = new ArrayList<Map<String, Object>>();
		Expression expression = new Expression(user.FIELD_TYPE, REL_OP.EQ, user.USER_TYPE_C4T_ADMIN);
		BaseResource[] userResources = getByExpression(expression);
		if (Util.isEmpty(userResources))
			return users;
		String[] ids = new String[userResources.length];
		for(int i=0; i < userResources.length; i++) {
			ids[i] = userResources[i].getId();
		}
		return UserHelper.getInstance().getListMapById(ids,null);
	}

	public ArrayList<Map<String, Object>> getAccountManager() {
		ArrayList<Map<String, Object>>  users = new ArrayList<Map<String, Object>>();
		Expression expression = new Expression(user.FIELD_TYPE, REL_OP.EQ, user.USER_TYPE_ACCOUNT_MANAGER);
		BaseResource[] userResources = getByExpression(expression);
		if (Util.isEmpty(userResources))
			return users;
		String[] ids = new String[userResources.length];
		for(int i=0; i < userResources.length; i++) {
			ids[i] = userResources[i].getId();
		}
		return UserHelper.getInstance().getListMapById(ids,null);
	}
	
	public ArrayList<Map<String, Object>> getCustomerAdmin(ArrayList<JoinField> joinFields) {
		ArrayList<Map<String, Object>>  users = new ArrayList<Map<String, Object>>();
		Expression expression = new Expression(user.FIELD_TYPE, REL_OP.EQ, user.USER_TYPE_CUSTOMER_ADMIN);
		BaseResource[] userResources = getByExpression(expression);
		if (Util.isEmpty(userResources))
			return users;
		String[] ids = new String[userResources.length];
		for(int i=0; i < userResources.length; i++) {
			ids[i] = userResources[i].getId();
		}
		return UserHelper.getInstance().getByJoining(ids, joinFields,null);
	}
	
}
