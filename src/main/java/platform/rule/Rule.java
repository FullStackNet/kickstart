package platform.rule;

import java.util.Map;

import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;


public class Rule {
  String id;	
  String name;
  Condition condition;
  Action action;
  String conditionId;
  String actionId;
  
  public Rule(String id ,String name, Condition condition, Action action) {
	  this.condition = condition;
	  this.action = action;
	  this.id = id;
	  this.name = name;
  }

  public Rule(String id , String name, String conditionId, String actionId) {
	  this.conditionId = conditionId;
	  this.actionId = actionId;
	  this.id = id;
	  this.name = name;
  }

  public String getName() {
		return name;
  }

	public void setName(String name) {
		this.name = name;
	}

  public Condition getCondition() {
	return condition;
}

public void setCondition(Condition condition) {
	this.condition = condition;
}

public void setAction(Action action) {
	this.action = action;
}

public String getConditionId() {
	return conditionId;
}

public void setConditionId(String conditionId) {
	this.conditionId = conditionId;
}

public String getActionId() {
	return actionId;
}

public void setActionId(String actionId) {
	this.actionId = actionId;
}

public Action getAction() {
	return action;
  }

  public String getId() {
	  return id;
  }
  
  public boolean isTrue(Map<String, Entity> data) throws ApplicationException {
	  if (condition == null)
		  throw new ApplicationException(ExceptionSeverity.ERROR, "Condition is null in " + name);
	  condition.dump();
	  return condition.isTrue(data);
  }
  
}
