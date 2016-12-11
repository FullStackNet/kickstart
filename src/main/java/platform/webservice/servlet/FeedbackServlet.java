package platform.webservice.servlet;

import platform.resource.feedback;
import platform.webservice.BaseServlet;
import platform.webservice.service.FeedbackService;

public class FeedbackServlet extends BaseServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public FeedbackServlet() {
		super(new feedback(), new FeedbackService());
	}

}
