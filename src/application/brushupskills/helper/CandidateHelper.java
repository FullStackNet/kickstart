package application.brushupskills.helper;

import platform.helper.BaseHelper;
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

}
