package platform.helper;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.log_id_card;
import platform.util.ApplicationException;


public class Log_id_cardHelper extends BaseHelper {
	
	public Log_id_cardHelper() {
		super(new log_id_card());
		// TODO Auto-generated constructor stub
	}
	private static Log_id_cardHelper instance;
	
	public static Log_id_cardHelper getInstance() {
		if (instance == null)
			instance = new Log_id_cardHelper();
		return instance;
	}
	
	public void update(log_id_card _log) {
		try {
			super.update(_log);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateReason(log_id_card _log, String reason) {
		_log.setError_reason(reason);
		Log_id_cardHelper.getInstance().update(_log);
	}
	
	public BaseResource[] getForSchoolsDateWiseAndReason(String[] schools,String[] order,String reason,long fromtime,long totime) {
		try {
			Expression e2 = new Expression("school_id", REL_OP.IN, schools);
			Expression e4 = new Expression(log_id_card.FIELD_CREATION_TIME, REL_OP.GTEQ, fromtime);
			Expression e5 = new Expression(log_id_card.FIELD_CREATION_TIME, REL_OP.LT, totime);
			
			Expression e6 = new Expression(e4, LOG_OP.AND, e5);
			Expression e8 = new Expression(e2, LOG_OP.AND, e6);
			Expression e9 = new Expression(log_id_card.FIELD_ERROR_REASON, REL_OP.EQ, reason);
			Expression e = new Expression(e8, LOG_OP.AND, e9);
			return getByExpression(e,order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;		
	}
}
