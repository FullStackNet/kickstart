package application.brushupskills.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.util.Util;
import application.brushupskills.resource.candidate;

public class CandidateHelper extends BaseHelper {

	private static CandidateHelper instance;

	public static CandidateHelper getInstance() {
		if (instance == null)
			instance = new CandidateHelper();
		return instance;
	}
	
	public CandidateHelper() {
		super(new candidate());
		// TODO Auto-generated constructor stub
	}

	public candidate getByMobileNo(String mobileNo) {
		Expression e = new Expression(candidate.FIELD_MOBILE_NO, REL_OP.EQ, mobileNo);
		BaseResource[] resources = getByExpression(e);
		if (Util.isEmpty(resources)) 
			return null;
		return (candidate) resources[0];
	}
	public long getPendingCoins(String candidateId) {
		candidate  resource = (candidate)getById(candidateId);
		if (resource != null) 
			return resource.getTotal_coins();
		return 0;
	}
}
