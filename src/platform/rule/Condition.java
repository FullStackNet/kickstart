package platform.rule;

import java.util.Map;

public class Condition {
	public static String  TYPE_COMPOSITE = "C";
	public static String  TYPE_INDIVIDUAL = "I";
	
	public static String GT = ">";
	public static String GTE = ">=";
	public static String LS = "<";
	public static String LSE = "<=";
	public static String EQ = "=";
	public static String AND = "AND";
	public static String OR = "OR";
	public static String NEQ = "!=";
	
	String id;
	String name;
	String type;
	ConditionEntity entity;
	EntityAttribute attribute;
	String operator;
	Object value;
	Condition leftCondition;
	Condition rightCondition;
	
	String leftConditionId;
	String rightConditionId;
	
	
	public void dump() {
		System.out.println("\t\tCondition  Dump");
		System.out.println("\t\t\tId :" + id);
		System.out.println("\t\t\tId :" + name);

		System.out.println("\t\t\ttype : " + type); 
		System.out.println("\t\t\toperator: " + operator);
		System.out.println("\t\t\tvalue : " + value);
		System.out.println("\t\t\tleftCondition Id " + leftConditionId);
		System.out.println("\t\t\trightCondition " + rightConditionId);
		if (leftCondition != null)
			leftCondition.dump();
		if (rightCondition != null)
			rightCondition.dump();
		if (entity != null)
			entity.dump();
		if (attribute !=null)
			attribute.dump();
	}
	
	public String getId() {
		return id;
	}
	
	public Condition(String id, String name,String entityStr, String entityAttribute, String entityAttributeType, String opr, Object value) {
		String[] tokens = entityStr.split("\\.");
		entity = new ConditionEntity(tokens);
		this.attribute = new EntityAttribute(entityAttribute, entityAttributeType);
		this.operator = opr;
		this.value = value;
		this.id = id;
		this.type = TYPE_INDIVIDUAL;
		this.name = name;
	}
	
	public Condition(String id, String name, ConditionEntity entity,EntityAttribute attribute, String opr, Object value) {
		this.entity = entity;
		this.attribute = attribute;
		this.operator = opr;
		this.value = value;
		this.id = id;
		this.type = TYPE_INDIVIDUAL;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Condition(String id, String name, Condition leftCondition , String opr, Condition rightCondition) {
		this.leftCondition = leftCondition;
		this.operator = opr;
		this.rightCondition = rightCondition;
		this.id = id;
		this.type = TYPE_COMPOSITE;
		this.name = name;
	}
	
	public Condition(String id, String name, String leftCondition , String opr, String rightCondition) {
		this.leftConditionId = leftCondition;
		this.operator = opr;
		this.rightConditionId = rightCondition;
		this.id = id;
		this.type = TYPE_COMPOSITE;
		this.name = name;
	}
	
	public boolean isComposite() {
		if (TYPE_COMPOSITE.equals(type)) {
			return true;
		}
		return false;
	}
	public Condition getLeftCondition() {
		return leftCondition;
	}

	public void setLeftCondition(Condition leftCondition) {
		this.leftCondition = leftCondition;
	}

	public Condition getRightCondition() {
		return rightCondition;
	}

	public void setRightCondition(Condition rightCondition) {
		this.rightCondition = rightCondition;
	}

	public String getLeftConditionId() {
		return leftConditionId;
	}

	public void setLeftConditionId(String leftConditionId) {
		this.leftConditionId = leftConditionId;
	}

	public String getRightConditionId() {
		return rightConditionId;
	}

	public void setRightConditionId(String rightConditionId) {
		this.rightConditionId = rightConditionId;
	}

	public boolean isTrue(Map<String, Entity> data) {
		if (operator.equals(AND)) {
			if (leftCondition.isTrue(data) && rightCondition.isTrue(data)) {
				return true;
			} 
			return false;
		}
		if (operator.equals(OR)) {
			if (leftCondition.isTrue(data) || rightCondition.isTrue(data)) {
				return true;
			} 
			return false;
		}
		Entity evalEntity = data.get(entity.getId());
		if (evalEntity == null) {
			System.out.println("Entity doesn't Exist " +entity.getId());
			return false;
		}
		evalEntity.dump();
		EntityAttribute evalAttribute = evalEntity.getAttribute(attribute.getName());
		if (evalAttribute == null) return false;
		if (operator.equals(EQ)) {
			return evalAttribute.isEqual(value); 
		} else if (operator.equals(NEQ)) {
			return !evalAttribute.isEqual(value); 
		} else if (operator.equals(GT)) {
			return evalAttribute.isGreater(value); 
		} else if (operator.equals(LS)) {
			return evalAttribute.isLesser(value); 
		} else if (operator.equals(LSE)) {
			return evalAttribute.isLesserEqual(value); 
		} else if (operator.equals(GTE)) {
			return evalAttribute.isGreaterEqual(value); 
		}
		return false;
	}
}
