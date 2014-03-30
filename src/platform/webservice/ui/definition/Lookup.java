package platform.webservice.ui.definition;

import platform.helper.BaseHelper;


public class Lookup {
	BaseHelper helper;
	String key;
	String name;

	public Lookup(BaseHelper helper) {
		this("id","name",helper);
	}
	public Lookup(String key,String name, BaseHelper helper) {
		this.helper = helper;
		this.key = key;
		this.name = name;
	}

	public BaseHelper getHelper() {
		return helper;
	}

	public void setHelper(BaseHelper helper) {
		this.helper = helper;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
