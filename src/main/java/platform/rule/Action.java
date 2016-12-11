package platform.rule;

public class Action {
	String id;
	Object action;
	Entity entity;
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Action(String id,String name, String entityString, Object action) {
		this.entity = new Entity(entityString);
		this.action = action;
		this.id = id;
		this.name = name;
	}
	
	public Action(String id, String name, Entity entity, String action) {
		this.entity = entity;
		this.action = action;
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return entity.getId()+"::" + action;
	}
	
	public String getId() {
		return id;
	}
	
	public Entity getEntity() {
		return entity;
	}
	
	public Object getAction() {
		return action;
	}
}
