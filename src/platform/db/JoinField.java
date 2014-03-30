package platform.db;

import java.util.HashMap;
import java.util.Map;

public class JoinField {
	String resource;
	String joiningId;
	Map<String, String> fieldMap;
	
	public JoinField(String resource,String joiningId,String fieldName) {
		this.resource = resource;
		this.joiningId = joiningId;
		fieldMap = new HashMap<String, String>();
		fieldMap.put(fieldName, "name");
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
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public String getJoiningId() {
		return joiningId;
	}

	public void setJoiningId(String joiningId) {
		this.joiningId = joiningId;
	}
}
