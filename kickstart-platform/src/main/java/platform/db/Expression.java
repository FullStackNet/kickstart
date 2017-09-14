/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.db;

import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import platform.exception.ExceptionEnum;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Field;

public class Expression {
	private boolean isSimple;

	private String variable;
	private REL_OP relationalOperator;
	private Object value;
	private Pattern regexPattern;
	
	private Expression leftExpression;
	private LOG_OP logicalOperator;
	private Expression rightExpression;

	public Expression(String variable, REL_OP relationOperator, Object value) {
		this.isSimple = true;
		this.variable = variable;
		this.relationalOperator = relationOperator;
		this.value = value;
		if(relationOperator == REL_OP.REGEX || relationOperator == REL_OP.NREGEX)
			regexPattern = Pattern.compile(value.toString());
		
		if(relationOperator == REL_OP.IN || relationOperator == REL_OP.NIN)
		{
			/*value = value.toString().replaceAll("[\\[\\]]", "");
			StringTokenizer tokenizer = new StringTokenizer(value.toString(), ", \t\n\r\f");
			List<String> valueList = new ArrayList<String>();
			while(tokenizer.hasMoreTokens())
				valueList.add(tokenizer.nextToken());*/
			this.value = value;
		}
	}
	
	public Expression(Expression leftExpression, LOG_OP logicalOperator, Expression rightExpression) {
		this.isSimple = false;
		this.leftExpression = leftExpression;
		this.logicalOperator = logicalOperator;
		this.rightExpression = rightExpression;
	}

	public boolean isSimple() {
		return isSimple;
	}
	
	public String getVariable() {
		return variable;
	}
	
	public REL_OP getRelationalOperator() {
		return relationalOperator;
	}
	
	public Object getValue() {
		return value;
	}
	
	public Expression getLeftExpression() {
		return leftExpression;
	}

	public LOG_OP getLogicalOperator() {
		return logicalOperator;
	}

	public Expression getRightExpression() {
		return rightExpression;
	}
	
	private enum STATES {START, LEFT_EXPRESSION, LOG_OP, RIGHT_EXPRESSION, VARIABLE, REL_OP, VALUE, END};
	
	/* Recursively constructs Expression object from String using state machine.
	 * Starts from outermost expression and then recursively constructs its children.
	 * Hence there will be multiple passes of the same children expression (in case of complex).
	 * WHEREVER POSSIBLE, USE CONSTRUCTORS TO CONSTRUCT EXPRESSION INSTEAD OF PARSE(STRING)
	 * 
	 * Each complex expression should be surrounded by parenthesis.
	 * Ex: (field1 == value1 && field2 != value2), (((field1 == value1 && field2 != value2) && field3 != value3) || field4 >= 100)  
	 * 
	 * Each simple expression shouldn't have parenthesis.
	 * Ex: field1 == value1, field2 != value2
	 * 
	 * Zero or more spaces allowed between any tokens.
	 * Ex: (field1==value1&&field2     ==    value2)
	 * 
	 * Note: parse(e.toString()) is guaranteed to construct 'e' back.
	 */
	public static Expression parse(String input) throws ApplicationException {
		if(input == null || input.length() == 0)
			throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_EXPRESSION, input);

		StringBuilder leftBuilder = new StringBuilder();	//If complex, will hold leftExpression else variable
		StringBuilder operatorBuilder = new StringBuilder();//If complex, will hold LOG_OP else REL_OP
		StringBuilder rightBuilder = new StringBuilder();	//If complex, will hold rightExpression or value
		
		STATES state = STATES.START;
		boolean complex = false;
		int openBraceCount = 0;
		
		String toRead = input.replaceAll("\\s", "");
		int length = toRead.length();
		int index = 0;
		while(index < length) {
			char c = toRead.charAt(index);
			if(c == '(')
				openBraceCount++;
			else if(c == ')')
				openBraceCount--;

			switch(state) {
			case START:
				if(c == '(') {
					complex = true;
					state = STATES.LEFT_EXPRESSION;
				} else {
					leftBuilder.append(c);
					complex = false;
					state = STATES.VARIABLE;
				}
				break;
			case LEFT_EXPRESSION:
				if(openBraceCount == 1 && (c == '|' || c == '&')) {
					operatorBuilder.append(c);
					state = STATES.LOG_OP;
				} else
					leftBuilder.append(c);
				break;
			case LOG_OP:
				operatorBuilder.append(c);
				state = STATES.RIGHT_EXPRESSION;
				break;
			case RIGHT_EXPRESSION:
				if(openBraceCount == 0)
					state = STATES.END;
				else
					rightBuilder.append(c);
				break;
			case VARIABLE:
				if(c != '=' && c != '!' && c != '>' && c != '<')
					leftBuilder.append(c);
				else {
					operatorBuilder.append(c);
					state = STATES.REL_OP;
				}
				break;
			case REL_OP:
				operatorBuilder.append(c);
				state = STATES.VALUE;
				break;
			case VALUE:
				rightBuilder.append(c);
				if(index == length - 1)
					state = STATES.END;
				break;
			case END:
				throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_EXPRESSION, input);
			}
			index++;
		}
		if(state != STATES.END)
			throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_EXPRESSION, input);
		if(!complex)
			return new Expression(leftBuilder.toString(), REL_OP.parse(operatorBuilder.toString()), rightBuilder.toString());
		return new Expression(parse(leftBuilder.toString()), LOG_OP.parse(operatorBuilder.toString()), parse(rightBuilder.toString()));
	}
	
	public String toString() {
		return toString(this);
	}
	
	private String toString(Expression expression) {
		if(!expression.isSimple())
			return "(" + expression.getLeftExpression() + " " + expression.getLogicalOperator() + " " + expression.getRightExpression() + ")";
		
		return expression.getVariable() + " " + expression.getRelationalOperator() + " " + expression.getValue();
	}
	
	public boolean evaluate(Map<String, Object> valueMap, Map<String, Field> typeMap) {
		return evaluate(this, valueMap, typeMap);
	}
	
	private boolean evaluate(Expression expression, Map<String, Object> valueMap, Map<String, Field> typeMap) {
		if(!expression.isSimple()) {
			boolean left = evaluate(expression.getLeftExpression(), valueMap, typeMap);
			boolean right = evaluate(expression.getRightExpression(), valueMap, typeMap);
			return (expression.getLogicalOperator() == LOG_OP.AND) ? (left && right) : (left || right);
		}
		String variable = expression.getVariable();
		Field field = typeMap.get(variable);
		if(field == null || field.getType() == null)
			return false;
		
		Object expressionValueObj = expression.getValue();
		Object actualValueObj = valueMap.get(variable);
		if(actualValueObj == null || expressionValueObj == null) {
			switch(expression.getRelationalOperator()) {
			case EQ:
				return actualValueObj == expressionValueObj;
			case NEQ:
				return actualValueObj != expressionValueObj;
			default:
				return false;
			}
		}
		
		if(expression.getRelationalOperator() == REL_OP.IN || expression.getRelationalOperator() == REL_OP.NIN)
		{
			@SuppressWarnings("unchecked")
			List<String> expressionValueList = (List<String>) expressionValueObj;
			boolean match = expressionValueList.contains(actualValueObj.toString());
			return expression.getRelationalOperator() == REL_OP.IN ? match : !match;
		}
		
		String type = field.getType();
		if(type.equals("String")) {
			String expressionValue = expressionValueObj.toString();
			String actualValue = (String) actualValueObj;
			switch(expression.getRelationalOperator()) {
			case EQ:
				return actualValue.compareToIgnoreCase(expressionValue) == 0;
			case NEQ:
				return actualValue.compareToIgnoreCase(expressionValue) != 0;
			case GT:
				return actualValue.compareToIgnoreCase(expressionValue) > 0;
			case GTEQ:
				return actualValue.compareToIgnoreCase(expressionValue) >= 0;
			case LT:
				return actualValue.compareToIgnoreCase(expressionValue) < 0;
			case LTEQ:
				return actualValue.compareToIgnoreCase(expressionValue) <= 0;
			case REGEX:
				return expression.regexPattern.matcher(actualValue).matches();
			case NREGEX:
				return !expression.regexPattern.matcher(actualValue).matches();
			default:
				break;
			}
		} else if(type.equals("int")) {
			Integer expressionValue = (expressionValueObj instanceof Integer) ? (Integer) expressionValueObj : Integer.parseInt(expressionValueObj.toString());
			Integer actualValue = (Integer) actualValueObj;
			switch(expression.getRelationalOperator()) {
			case EQ:
				return actualValue.compareTo(expressionValue) == 0;
			case NEQ:
				return actualValue.compareTo(expressionValue) != 0;
			case GT:
				return actualValue.compareTo(expressionValue) > 0;
			case GTEQ:
				return actualValue.compareTo(expressionValue) >= 0;
			case LT:
				return actualValue.compareTo(expressionValue) < 0;
			case LTEQ:
				return actualValue.compareTo(expressionValue) <= 0;
			default:
				break;
			}
		} else if(type.equals("long")) {
			Long expressionValue = (expressionValueObj instanceof Long) ? (Long) expressionValueObj : Long.parseLong(expressionValueObj.toString());
			Long actualValue = (Long) actualValueObj;
			switch(expression.getRelationalOperator()) {
			case EQ:
				return actualValue.compareTo(expressionValue) == 0;
			case NEQ:
				return actualValue.compareTo(expressionValue) != 0;
			case GT:
				return actualValue.compareTo(expressionValue) > 0;
			case GTEQ:
				return actualValue.compareTo(expressionValue) >= 0;
			case LT:
				return actualValue.compareTo(expressionValue) < 0;
			case LTEQ:
				return actualValue.compareTo(expressionValue) <= 0;
			default:
				break;
			}
		} else if(type.equals("boolean")) {
			Boolean expressionValue = (expressionValueObj instanceof Boolean) ? (Boolean) expressionValueObj : Boolean.parseBoolean(expressionValueObj.toString());
			Boolean actualValue = (Boolean) actualValueObj;
			switch(expression.getRelationalOperator()) {
			case EQ:
				return actualValue.compareTo(expressionValue) == 0;
			case NEQ:
				return actualValue.compareTo(expressionValue) != 0;
			default:
				break;
			}
		} else if(type.equals("byte")) {
			Byte expressionValue = (expressionValueObj instanceof Byte) ? (Byte) expressionValueObj : Byte.parseByte(expressionValueObj.toString());
			Byte actualValue = (Byte) actualValueObj;
			switch(expression.getRelationalOperator()) {
			case EQ:
				return actualValue.compareTo(expressionValue) == 0;
			case NEQ:
				return actualValue.compareTo(expressionValue) != 0;
			case GT:
				return actualValue.compareTo(expressionValue) > 0;
			case GTEQ:
				return actualValue.compareTo(expressionValue) >= 0;
			case LT:
				return actualValue.compareTo(expressionValue) < 0;
			case LTEQ:
				return actualValue.compareTo(expressionValue) <= 0;
			default:
				break;
			}
		} else if(type.equals("short")) {
			Short expressionValue = (expressionValueObj instanceof Short) ? (Short) expressionValueObj : Short.parseShort(expressionValueObj.toString());
			Short actualValue = (Short) actualValueObj;
			switch(expression.getRelationalOperator()) {
			case EQ:
				return actualValue.compareTo(expressionValue) == 0;
			case NEQ:
				return actualValue.compareTo(expressionValue) != 0;
			case GT:
				return actualValue.compareTo(expressionValue) > 0;
			case GTEQ:
				return actualValue.compareTo(expressionValue) >= 0;
			case LT:
				return actualValue.compareTo(expressionValue) < 0;
			case LTEQ:
				return actualValue.compareTo(expressionValue) <= 0;
			default:
				break;
			}
		} else if(type.equals("char")) {
			Character expressionValue = (expressionValueObj instanceof Character) ? (Character) expressionValueObj : expressionValueObj.toString().charAt(0);
			Character actualValue = (Character) actualValueObj;
			switch(expression.getRelationalOperator()) {
			case EQ:
				return actualValue.compareTo(expressionValue) == 0;
			case NEQ:
				return actualValue.compareTo(expressionValue) != 0;
			case GT:
				return actualValue.compareTo(expressionValue) > 0;
			case GTEQ:
				return actualValue.compareTo(expressionValue) >= 0;
			case LT:
				return actualValue.compareTo(expressionValue) < 0;
			case LTEQ:
				return actualValue.compareTo(expressionValue) <= 0;
			default:
				break;
			}
		} else if(type.equals("float")) {
			Float expressionValue = (expressionValueObj instanceof Float) ? (Float) expressionValueObj : Float.parseFloat(expressionValueObj.toString());
			Float actualValue = (Float) actualValueObj;
			switch(expression.getRelationalOperator()) {
			case EQ:
				return actualValue.compareTo(expressionValue) == 0;
			case NEQ:
				return actualValue.compareTo(expressionValue) != 0;
			case GT:
				return actualValue.compareTo(expressionValue) > 0;
			case GTEQ:
				return actualValue.compareTo(expressionValue) >= 0;
			case LT:
				return actualValue.compareTo(expressionValue) < 0;
			case LTEQ:
				return actualValue.compareTo(expressionValue) <= 0;
			default:
				break;
			}
		} else if(type.equals("double")) {
			Double expressionValue = (expressionValueObj instanceof Double) ? (Double) expressionValueObj : Double.parseDouble(expressionValueObj.toString());
			Double actualValue = (Double) actualValueObj;
			switch(expression.getRelationalOperator()) {
			case EQ:
				return actualValue.compareTo(expressionValue) == 0;
			case NEQ:
				return actualValue.compareTo(expressionValue) != 0;
			case GT:
				return actualValue.compareTo(expressionValue) > 0;
			case GTEQ:
				return actualValue.compareTo(expressionValue) >= 0;
			case LT:
				return actualValue.compareTo(expressionValue) < 0;
			case LTEQ:
				return actualValue.compareTo(expressionValue) <= 0;
			default:
				break;
			}
		} else if(type.equals("String[]")) {
			
		}
		return false;
	}
}