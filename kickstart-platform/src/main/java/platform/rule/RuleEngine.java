package platform.rule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import platform.event.EventManager;
import platform.events.ActionEvent;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;

public class RuleEngine {
	Map<String, Entity> data;
	ArrayList<Rule> ruleList;
	Map<String,Condition> conditionList;
	Map<String,Action> actionList;
	
	static RuleEngine instance;
	
	public  static RuleEngine getInstance() {
		if (instance == null)
			instance = new RuleEngine(); 
		return instance;
	}
	
	
	public RuleEngine() {
		data = new HashMap<String, Entity>();
		ruleList = new ArrayList<Rule>();
		conditionList = new HashMap<String, Condition>();
		actionList = new HashMap<String, Action>();
	}
	
	public void addEntity(Entity entity) {
		System.out.println("Adding Entity :" + entity.getId());
		data.put(entity.getId(), entity);
	}
	
	public Entity getEntity(Entity entity) {
		return data.get(entity.getId());
	}
	
	public Entity getEntity(String key) {
		return data.get(key);
	}
	
	public Entity getEntity(String type, String id) {
		return data.get(Entity.id(type, id));
	}
	
	public void updateAttribute(Entity entity, EntityAttribute attribute) {
		if (entity == null) return;
		if (attribute == null) return;
		
		entity.updateAttribute(attribute);
	}
	
	public void updateAttribute(String entityType,
								String id, String attributeName, 
								String attributeType, Object value) {
		EntityAttribute attribute = new EntityAttribute(attributeName, attributeType, value);
		Entity entity = getEntity(entityType,id);
		updateAttribute(entity, attribute);
	}
	
	
	public void resolveCondition(Condition condition) throws ApplicationException {
		if (condition.getLeftCondition() == null) {
			Condition leftCondition = conditionList.get(condition.getLeftConditionId());
			if (leftCondition != null) {
				if (leftCondition.isComposite()) {
					resolveCondition(leftCondition);
					condition.setLeftCondition(leftCondition);
				} else {
					condition.setLeftCondition(leftCondition);
				}
			} else {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Condition left " + condition.getLeftConditionId());
			}
		}
		
		if (condition.getRightCondition() == null) {
			Condition rightCondition = conditionList.get(condition.getRightConditionId());
			if (rightCondition != null) {
				if (rightCondition.isComposite()) {
					resolveCondition(rightCondition);
					condition.setRightCondition(rightCondition);
				} else {
					condition.setRightCondition(rightCondition);
				}
			} else {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Condition right " + condition.getRightConditionId());
			}
		}
	}

	public void resetCondition(Condition condition) throws ApplicationException {
		if (condition.getLeftCondition() != null) {
			Condition leftCondition = conditionList.get(condition.getLeftConditionId());
			if (leftCondition != null) {
				if (leftCondition.isComposite()) {
					condition.setLeftCondition(null);
					resetCondition(leftCondition);
				} 
			} else {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Condition" + condition.getLeftConditionId());
			}
		}
		
		if (condition.getRightCondition() == null) {
			Condition rightCondition = conditionList.get(condition.getRightConditionId());
			if (rightCondition != null) {
				if (rightCondition.isComposite()) {
					condition.setRightCondition(null);
					resetCondition(rightCondition);
				} 
			} else {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Condition right condition " + condition.getRightConditionId());
			}
		}
	}

	public void compileRule(Rule rule) throws ApplicationException {
		Condition condition = conditionList.get(rule.getConditionId());
		
		if (condition == null) 
			throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Condition" +rule.getConditionId());
		if (condition.isComposite()) {
			resolveCondition(condition);
			rule.setCondition(condition);
		} else {
			rule.setCondition(condition);
		}
		Action action = actionList.get(rule.getActionId());
		if (action == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Condition" +rule.getConditionId());
		
		rule.setAction(action);
	}
	
	public void resetRule(Rule rule) throws ApplicationException {
		Condition condition = conditionList.get(rule.getConditionId());
		if (condition != null) {
			rule.setCondition(null);
			if (condition.isComposite()) {
				resetCondition(condition);
			} 
		} else {
			throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Condition"+rule.getConditionId());
		}
		rule.setAction(null);
	}
	
	public void addRule(Rule rule) throws ApplicationException {
		System.out.println("Adding Rule " + rule.getId() + "::"+rule.getName());
		compileRule(rule);
		for(int i = 0; i < ruleList.size() ; i++) {
			if (rule.getId().equals(ruleList.get(i).getId())) {
				ruleList.set(i, rule);
				System.out.println("Modified Rule " + rule.getId()+"::"+rule.getName());
				return;
			}
		}
		ruleList.add(rule);
		System.out.println("Added Rule " + rule.getId()+"::"+rule.getName());
	}
	
	
	public void compileRules() throws ApplicationException {
		for(int i = 0; i < ruleList.size() ; i++) {
				resetRule(ruleList.get(i));
				compileRule(ruleList.get(i));
		}
	}
	
	
	public void addCondition(Condition condition) {
		System.out.println("Adding Condition " + condition.getId() + "::"+condition.getName());
		condition.dump();
		conditionList.put(condition.getId(), condition);
	}

	public void addAction(Action action) {
		System.out.println("Adding ACtion " + action.getId()+ "::"+action.getName());
		actionList.put(action.getId(), action);
	}
	
	public void reinitialize() {
		ruleList.clear();
		conditionList.clear();
		actionList.clear();
	}
	
	
	public void evaluteRules() {
		System.out.println("\n\nevaluteRules Rules :");
		System.out.println("Total Rules :" + ruleList.size());
		System.out.println("Total Entities :" + data.size());
		System.out.println("Total Condtion :" + conditionList.size());
		System.out.println("Total actions :" + actionList.size());
		System.out.println("\n\n");
		for(int i = 0; i < ruleList.size() ; i++) {
			Rule rule = ruleList.get(i);
			System.out.println("Evaluting Rules :" + rule.getId()+"::"+rule.getName());
			try {
				if (rule.isTrue(data)) {
					Action action = rule.getAction();
					EventManager.triggerEvent(this, new ActionEvent(action));
					System.out.println("\n\n Hurre Condition found true need to take action "+action.toString() + "::"+rule.getName()+" \n\n");
				} else {
					System.out.println("\n\nNo action for Rule " + rule.getId()+"::"+rule.getName());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Evalution Done : " + rule.getId()+"::"+rule.getName());
			
		}
		System.out.println("Evalution Completed ");
	}
}
