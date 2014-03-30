package platform.rule;

public class ConditionEntity {
	String type;
	String id;

	public ConditionEntity(String[] tokens) {
		if (tokens.length  == 1) {
			this.id = tokens[0];
		} else {
			this.id = tokens[1];
			this.type = tokens[0];
		}
	}
	public ConditionEntity(String type, String id) {
		this.type = type;
		this.id = id;
	}
	
	public String getId() {
		if (type != null)
			return type+"."+id;
		return id;
	}
	
	public void dump() {
		System.out.println("ConditionEntity::" +getId());
	}
}
