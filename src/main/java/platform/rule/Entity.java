package platform.rule;

import java.util.HashMap;
import java.util.Map;

public class Entity {
	String id;
	String name;
	String type;
	Map<String,EntityAttribute> attributeList;
	
	
	public Entity(String entityString) {
		String[] tokens = entityString.split("\\.");
		if (tokens.length  == 1) {
			this.id = tokens[0];
			this.name = tokens[0];
		} else {
			this.id = tokens[1];
			this.name = tokens[1];
			this.type = tokens[0];
		}
		attributeList = new HashMap<String, EntityAttribute>();
	}
	
	public Entity(String entityString,String[] attributes) {
		String[] tokens = entityString.split("\\.");
		if (tokens.length  == 1) {
			this.id = tokens[0];
			this.name = tokens[0];
		} else {
			this.id = tokens[1];
			this.name = tokens[1];
			this.type = tokens[0];
		}
		attributeList = new HashMap<String, EntityAttribute>();
		for(int i=0 ; i < attributes.length ; i++) {
			updateAttribute(attributes[i]);
		}
	}
	
	public Entity(String id, String name, String type) {
		this.id = id;
		this.name = name;
		this.type = type;
		attributeList = new HashMap<String, EntityAttribute>();
	}
	
	public void updateAttribute(EntityAttribute attribute) {
		attributeList.put(attribute.getName(), attribute);
	}
	
	public void updateAttribute(String attributeString) {
		String[] tokens = attributeString.split("\\.");
		EntityAttribute attribute = new EntityAttribute(tokens[0],tokens[1],tokens[2]);
		attributeList.put(attribute.getName(), attribute);
	}
	
	
	public EntityAttribute getAttribute(String _name) {
		return attributeList.get(_name);
	}
	
	public String getId() {
		if (type != null)
			return type+"."+id;
		return id;
	}
	
	public void dump() {
		System.out.println("Entity::"+id+"::"+name+"::"+type);
		for (Map.Entry<String, EntityAttribute> entry : attributeList.entrySet()) {
			EntityAttribute attribute = entry.getValue();
			attribute.dump();
		}
	}
	
	public static  String id(String type, String id) {
		if (type != null)
			return type+"."+id;
		return id;
	}
}
