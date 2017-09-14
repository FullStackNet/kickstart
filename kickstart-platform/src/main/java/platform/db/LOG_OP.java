package platform.db;

import platform.exception.ExceptionEnum;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;

public enum LOG_OP {
	AND {
		public String toString() {
			return "&&";
		}
	},
	OR {
		public String toString() {
			return "||";
		}
	};
	
	public static LOG_OP parse(String input) throws ApplicationException {
		if(input != null) {
			if(input.equals("&&"))
				return AND;
			if(input.equals("||"))
				return OR;
		}
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_LOGICAL_OPERATOR, input);
	}
}