
package platform.db;

import platform.exception.ExceptionEnum;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;

public enum REL_OP {
	EQ {
		public String toString() {
			return "==";
		}
	},
	NEQ {
		public String toString() {
			return "!=";
		}
	},
	GT {
		public String toString() {
			return ">";
		}
	},
	GTEQ {
		public String toString() {
			return ">=";
		}
	},
	LT {
		public String toString() {
			return "<";
		}
	},
	LTEQ {
		public String toString() {
			return "<=";
		}
	},
	REGEX { //Value should be a regex String
		public String toString() {
			return "=~";
		}
	},
	NREGEX { //Negated REGEX - doesn't match the given regex String
		public String toString() {
			return "!~";
		}
	},
	IN { //Value should be a comma separated String
		public String toString() {
			return "=@";
		}
	},
	EACH_ELEMENT_IN { //Value should be a comma separated String
		public String toString() {
			return "eachElementIn";
		}
	},
	
	NIN { //Negated IN - value doesn't exist in the given values (as a comma separated String)
		public String toString() {
			return "!@";
		}
	},
	CONTAINS { //Used for array data types (Ex: String[]) to construct expressions like (["a", "b", "c"] contains "a") - Expression.parse("stringArray <> a")
		public String toString() {
			return "<>";
		}
	},
	STARTWITH { //Value should be a regex String
			public String toString() {
				return "@@";
			}
	};
	
	public static REL_OP parse(String input) throws ApplicationException {
		if(input != null) {
			if(input.equals("=="))
				return EQ;
			if(input.equals("!="))
				return NEQ;
			if(input.equals(">"))
				return GT;
			if(input.equals(">="))
				return GTEQ;
			if(input.equals("<"))
				return LT;
			if(input.equals("<="))
				return LTEQ;
			if(input.equals("=~"))
				return REGEX;
			if(input.equals("!~"))
				return NREGEX;
			if(input.equals("=@"))
				return IN;
			if(input.equals("!@"))
				return NIN;
			if(input.equals("<>"))
				return CONTAINS;
			if(input.equals("@@"))
				return STARTWITH;
		}
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_RELATIONAL_OPERATOR, input);
	}
}