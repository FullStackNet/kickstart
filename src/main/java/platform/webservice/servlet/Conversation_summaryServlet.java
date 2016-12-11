package platform.webservice.servlet;

import platform.resource.conversation_summary;
import platform.webservice.BaseServlet;
import platform.webservice.service.Conversation_summaryService;

public class Conversation_summaryServlet extends BaseServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Conversation_summaryServlet() {
		super(new conversation_summary(), new Conversation_summaryService());
	}
}
