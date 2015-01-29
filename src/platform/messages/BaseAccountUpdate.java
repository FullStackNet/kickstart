/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.messages;

import java.util.HashMap;
import java.util.Map;

import platform.communication.Session;
import platform.message.Message;
import platform.util.Field;

public abstract class BaseAccountUpdate extends Message {
	private static final long serialVersionUID = 1L;
	private String customer_id = null;
	private String account_id = null;
	private String account_name = null;
	private String company_name = null;
	private String parent_name = null;
	private Double balance = null;


	public BaseAccountUpdate() {
		super();
		setCategory((byte)7);
		setCommand((byte)1);
		setPacketType((byte)1);
	}

	public void populate_field() {
 		if (fields != null) return ;
		fields = new Field[6];
		fields[0] =  new Field("customer_id","String",128);
		fields[1] =  new Field("account_id","String",128);
		fields[2] =  new Field("account_name","String",128);
		fields[3] =  new Field("company_name","String",128);
		fields[4] =  new Field("parent_name","String",128);
		fields[5] = new Field("balance","double");
	}

	public void dump() {
		System.out.println("customer_id	:	 "+customer_id);
		System.out.println("account_id	:	 "+account_id);
		System.out.println("account_name	:	 "+account_name);
		System.out.println("company_name	:	 "+company_name);
		System.out.println("parent_name	:	 "+parent_name);
		System.out.println("balance	:	 "+balance);
	}
	public String getDump() {
		String str="";
		str = str +",customer_id:"+customer_id;
		str = str +",account_id:"+account_id;
		str = str +",account_name:"+account_name;
		str = str +",company_name:"+company_name;
		str = str +",parent_name:"+parent_name;
		str = str +",balance:"+balance;
		return str;
	}

	public Map<String, Object> convertMessageToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(customer_id != null)
			map.put("customer_id", customer_id);
		if(account_id != null)
			map.put("account_id", account_id);
		if(account_name != null)
			map.put("account_name", account_name);
		if(company_name != null)
			map.put("company_name", company_name);
		if(parent_name != null)
			map.put("parent_name", parent_name);
		if(balance != null)
			map.put("balance", balance);
		return map;
	}

	public void convertMapToMessage(Map<String, Object> map) {
		customer_id = (String) map.get("customer_id");
		account_id = (String) map.get("account_id");
		account_name = (String) map.get("account_name");
		company_name = (String) map.get("company_name");
		parent_name = (String) map.get("parent_name");
		balance = (Double) map.get("balance");
	}

 	public int getMessageSize() {return 648;}

 	public String getName() {return "AccountUpdate";}

public Message process(Session session,Message parentMessage) {return null;}

	public String getCustomer_id() {
		return customer_id;
	}

	public String getCustomer_idEx() {
		return customer_id != null ? customer_id : "";
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public void unSetCustomer_id() {
		this.customer_id = null;
	}

	public String getAccount_id() {
		return account_id;
	}

	public String getAccount_idEx() {
		return account_id != null ? account_id : "";
	}

	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}

	public void unSetAccount_id() {
		this.account_id = null;
	}

	public String getAccount_name() {
		return account_name;
	}

	public String getAccount_nameEx() {
		return account_name != null ? account_name : "";
	}

	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}

	public void unSetAccount_name() {
		this.account_name = null;
	}

	public String getCompany_name() {
		return company_name;
	}

	public String getCompany_nameEx() {
		return company_name != null ? company_name : "";
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public void unSetCompany_name() {
		this.company_name = null;
	}

	public String getParent_name() {
		return parent_name;
	}

	public String getParent_nameEx() {
		return parent_name != null ? parent_name : "";
	}

	public void setParent_name(String parent_name) {
		this.parent_name = parent_name;
	}

	public void unSetParent_name() {
		this.parent_name = null;
	}

	public Double getBalance() {
		return balance;
	}

	public double getBalanceEx() {
		return balance != null ? balance : 0;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public void unSetBalance() {
		this.balance = null;
	}
}