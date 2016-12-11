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

	public boolean isExistsByMobile(String mobileno) {
		if ((mobileno != null) && mobileno.startsWith("91")) {
			if (mobileno.length() > 10) 
				mobileno = mobileno.substring(2, mobileno.length());
		}
		if ((mobileno != null) &&  mobileno.startsWith("+91")) {
			if (mobileno.length() > 10) 
				mobileno = mobileno.substring(3, mobileno.length());
		}
		Expression e = new Expression(user.FIELD_MOBILE_NO, REL_OP.EQ, mobileno);
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
		if ((mobileno != null) && mobileno.startsWith("91")) {
			if (mobileno.length() > 10) 
				mobileno = mobileno.substring(2, mobileno.length());
		}
		if ((mobileno != null) &&  mobileno.startsWith("+91")) {
			if (mobileno.length() > 10) 
				mobileno = mobileno.substring(3, mobileno.length());
		}
		Expression e = new Expression(user.FIELD_MOBILE_NO, REL_OP.EQ, mobileno);
		BaseResource[] resources = UserHelper.getInstance().getByExpression(e);
		if (!Util.isEmpty(resources)) {
			return (user)resources[0];
		}
		return null;
	}
	
	public user getByMobileOrEmailId(String mobileno,String emailId) {
		Expression e = null;
		
		if (!Util.isEmpty(mobileno)) {
			if ((mobileno != null) && mobileno.startsWith("91")) {
				if (mobileno.length() > 10) 
					mobileno = mobileno.substring(2, mobileno.length());
			}
			if ((mobileno != null) &&  mobileno.startsWith("+91")) {
				if (mobileno.length() > 10) 
					mobileno = mobileno.substring(3, mobileno.length());
			}
			e = new Expression(user.FIELD_MOBILE_NO, REL_OP.EQ, mobileno);
			BaseResource[] resources = getByExpression(e);
			if (!Util.isEmpty(resources)) {
				return (user)resources[0];
			}
		}
		if (!Util.isEmpty(emailId)) {
			e = new Expression(user.FIELD_EMAIL_ID, REL_OP.EQ, emailId);
			BaseResource[] resources = getByExpression(e);
			if (!Util.isEmpty(resources)) {
				return (user)resources[0];
			}
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
	
	public BaseResource[]  getCustomerAdmin(String customerId) {
		Expression e1= new Expression(user.FIELD_TYPE, REL_OP.EQ, user.USER_TYPE_CUSTOMER_ADMIN);
		Expression e2= new Expression(user.FIELD_CUSTOMER_ID, REL_OP.EQ, customerId);
		Expression e= new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e);
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
		return UserHelper.getInstance().getByJoining(ids, joinFields,new String[]{user.FIELD_NAME});
	}
	
	public ArrayList<Map<String, Object>> getCustomerAdminByCustomerId(String customerId,ArrayList<JoinField> joinFields) {
		ArrayList<Map<String, Object>>  users = new ArrayList<Map<String, Object>>();
		Expression e1 = new Expression(user.FIELD_TYPE, REL_OP.EQ, user.USER_TYPE_CUSTOMER_ADMIN);
		Expression e2 = new Expression(user.FIELD_CUSTOMER_ID, REL_OP.EQ, customerId);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
				
		BaseResource[] userResources = getByExpression(e);
		if (Util.isEmpty(userResources))
			return users;
		String[] ids = new String[userResources.length];
		for(int i=0; i < userResources.length; i++) {
			ids[i] = userResources[i].getId();
		}
		return UserHelper.getInstance().getByJoining(ids, joinFields,new String[]{user.FIELD_NAME});
	}
	
	public ArrayList<Map<String, Object>> getUserByCustomerId(String customerId,ArrayList<JoinField> joinFields) {
		ArrayList<Map<String, Object>>  users = new ArrayList<Map<String, Object>>();
		Expression e1 = new Expression(user.FIELD_TYPE, REL_OP.EQ, user.USER_TYPE_USER);
		Expression e2 = new Expression(user.FIELD_CUSTOMER_ID, REL_OP.EQ, customerId);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
				
		BaseResource[] userResources = getByExpression(e);
		if (Util.isEmpty(userResources))
			return users;
		String[] ids = new String[userResources.length];
		for(int i=0; i < userResources.length; i++) {
			ids[i] = userResources[i].getId();
		}
		return UserHelper.getInstance().getByJoining(ids, joinFields,new String[]{user.FIELD_NAME});
	}
}
