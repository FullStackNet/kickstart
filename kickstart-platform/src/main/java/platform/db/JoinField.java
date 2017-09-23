package platform.db;

import java.util.HashMap;
import java.util.Map;

import platform.helper.HelperFactory;

public class JoinField {
	String resourceName;
	String joiningId;
	Map<String, String> fieldMap;
	
	public JoinField(String resource,String joiningId,String fieldName) {
		this.resourceName = resource;
		this.joiningId = joiningId;
		fieldMap = new HashMap<String, String>();
		fieldMap.put(fieldName, "name");
	}
	
	public JoinField(platform.helper.BaseHelper helper,String joiningId,String fieldName) {
		this.joiningId = joiningId;
		fieldMap = new HashMap<String, String>();
		fieldMap.put(fieldName, "name");
		HelperFactory.getInstance().register(helper);
		this.resourceName = helper.getResource().getMetaData().getName();
	}
	
	public JoinField(platform.helper.BaseHelper masterHelper,platform.helper.BaseHelper helper,String joiningId,String fieldName) {
		this.joiningId = joiningId;
		fieldMap = new HashMap<String, String>();
		fieldMap.put(fieldName, "name");
		HelperFactory.getInstance().register(helper);
		HelperFactory.getInstance().register(masterHelper);
		this.resourceName = helper.getResource().getMetaData().getName();
	}
	
	public JoinField(String resource,String joiningId,String fieldName,String nameField) {
		this.resourceName = resource;
		this.joiningId = joiningId;
		fieldMap = new HashMap<String, String>();
		fieldMap.put(fieldName, nameField);
	}
	
	public void addField(String fieldName,String mapFieldName) {
		fieldMap.put(fieldName, mapFieldName);
	}
	
	public String getField(String name) {
		return fieldMap.get(name);
	}
	
	public Map<String, String> getFieldMap() {
		return fieldMap;
	}

	public String getResource() {
		return resourceName;
	}

	public void setResource(String resource) {
		this.resourceName = resource;
	}

	public String getJoiningId() {
		return joiningId;
	}

	public void setJoiningId(String joiningId) {
		this.joiningId = joiningId;
	}
}
