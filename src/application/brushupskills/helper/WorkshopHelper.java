package application.brushupskills.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import application.brushupskills.resource.workshop;

public class WorkshopHelper extends BaseHelper {

	private static WorkshopHelper instance;

	public static WorkshopHelper getInstance() {
		if (instance == null)
			instance = new WorkshopHelper();
		return instance;
	}
	
	public WorkshopHelper() {
		super(new workshop());
		// TODO Auto-generated constructor stub
	}
	
	public void addCandidate(String id, String candidateId) {
		workshop _workshop = new workshop(id);
		_workshop.addRegistered_candidates(candidateId);
		try {
			WorkshopHelper.getInstance().update(_workshop);
		} catch (ApplicationException e) {
			e.printStackTrace();
		}
	}
	public BaseResource[] getNextWorkshop(long time) {
		Expression e = new Expression(workshop.FIELD_WORKSHOP_DATE, REL_OP.GT, time);
		return getByExpression(e,new String[]{});	
	}
}
