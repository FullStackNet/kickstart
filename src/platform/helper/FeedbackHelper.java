package platform.helper;

import platform.resource.feedback;


public class FeedbackHelper extends BaseHelper {

	public FeedbackHelper() {
		super(new feedback());
		// TODO Auto-generated constructor stub
	}
	
	private static FeedbackHelper instance;

	public static FeedbackHelper getInstance() {
		if (instance == null)
			instance = new FeedbackHelper();
		return instance;
	}
}
