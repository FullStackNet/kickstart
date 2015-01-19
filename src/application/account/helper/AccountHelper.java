package application.account.helper;

import java.util.ArrayList;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.Util;
import application.account.resource.account;

public class AccountHelper extends BaseHelper{

	private static AccountHelper instance;

	public static AccountHelper getInstance() {
		if (instance == null)
			instance = new AccountHelper();
		return instance;
	}

	public AccountHelper() {
		super(new account());
		// TODO Auto-generated constructor stub
	}
	public BaseResource[] getCustomerBalance(String customer_id) {
		Expression e = new Expression(account.FIELD_CUSTOMER_ID, REL_OP.EQ, customer_id);
		BaseResource[] resources = getByExpression(e,new String[]{account.FIELD_NAME});
		if (Util.isEmpty(resources))
			return null;
		return resources;

	}

	public BaseResource[] getGroupAccountBalance(String parentId) {
		Expression e = new Expression(account.FIELD_PARENT_ID, REL_OP.EQ, parentId);
		return getByExpression(e,new String[]{account.FIELD_NAME});

	}

	public BaseResource[] getSearchAccountBalance(String customer_id,String searchText) {
		Expression e = new Expression(account.FIELD_CUSTOMER_ID, REL_OP.EQ, customer_id);
		BaseResource[] resources = getByExpression(e,new String[]{account.FIELD_NAME});
		if (Util.isEmpty(resources))
			return null;
		ArrayList<BaseResource> rootList = new ArrayList<BaseResource>();
		for(BaseResource resource : resources) {
			account _account = (account)resource;
			if (_account.getName().matches("(?i:.*"+searchText+".*)")) {
				rootList.add(_account);
			}
		}
		return rootList.toArray(new account[rootList.size()]);

	}

	public BaseResource[] getRootGroupBalance(String customer_id) {
		Expression e = new Expression(account.FIELD_CUSTOMER_ID, REL_OP.EQ, customer_id);
		BaseResource[] resources = getByExpression(e,new String[]{account.FIELD_NAME});
		if (Util.isEmpty(resources))
			return null;
		ArrayList<BaseResource> rootList = new ArrayList<BaseResource>();
		for(BaseResource resource : resources) {
			account _account = (account)resource;
			if (Util.isEmpty(_account.getParent_name())) {
				rootList.add(resource);
			}
		}
		return rootList.toArray(new account[rootList.size()]);
	}
	public void updateGroupBalance(String parentId) {
		BaseResource[] resources = getGroupAccountBalance(parentId);
		double balance = 0.0;
		if (!Util.isEmpty(resources)) {
			for(BaseResource resource : resources) {
				account _account = (account)resource;
				balance += _account.getBalanceEx();
			}
		}
		account _account = (account)getById(parentId);
		if (_account != null) {
			_account.setBalance(balance);
			try {
				AccountHelper.getInstance().update(_account);
			} catch (ApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (!Util.isEmpty(_account.getParent_id()))
				updateGroupBalance(_account.getParent_id());
		}
	}
	public account getAccountByName(String customer_id,String name) {
		Expression e1 = new Expression(account.FIELD_CUSTOMER_ID, REL_OP.EQ, customer_id);
		Expression e2 = new Expression(account.FIELD_NAME, REL_OP.EQ, name);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		BaseResource[] resourcs = getByExpression(e);
		if (Util.isEmpty(resourcs))
			return null;
		return (account)resourcs[0];

	}

	public account getAccount(String customer_id,String accountId) {
		Expression e1 = new Expression(account.FIELD_CUSTOMER_ID, REL_OP.EQ, customer_id);
		Expression e2 = new Expression(account.FIELD_ACCOUNT_CUSTOMER_ID, REL_OP.EQ, accountId);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		BaseResource[] resourcs = getByExpression(e);
		if (Util.isEmpty(resourcs))
			return null;
		return (account)resourcs[0];

	}
}
