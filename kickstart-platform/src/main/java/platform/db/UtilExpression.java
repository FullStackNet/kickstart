package platform.db;

import platform.util.Util;

import java.util.ArrayList;

public class UtilExpression {
    public static  Expression getExpression(ArrayList<Expression> list) {
        if (Util.isEmpty(list))
            return null;
        if (list.size() == 1)
            return list.get(0);
        Expression return_expression = null;
        for (Expression e:list) {
            if (return_expression == null)
                return_expression = e;
            else {
                return_expression = new Expression(return_expression,LOG_OP.AND,e);
            }
        }
        return return_expression;
    }
}
