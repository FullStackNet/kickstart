package application.brushupskills.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.brushupskills.resource.online_session;

public class Online_sessionHelper extends BaseHelper {

	private static Online_sessionHelper instance;

	public static Online_sessionHelper getInstance() {
		if (instance == null)
			instance = new Online_sessionHelper();
		return instance;
	}
	
	public Online_sessionHelper() {
		super(new online_session());
		// TODO Auto-generated constructor stub
	}
	
	public BaseResource[] getNextOnlineSession(long time) {
		Expression e = new Expression(online_session.FIELD_ONLINE_SESSION_DATE, REL_OP.GT, time);
		return getByExpression(e,new String[]{});	
	}
}
