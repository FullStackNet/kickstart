package platform.webservice.servlet;

import platform.resource.schedule;
import platform.webservice.BaseServlet;
import platform.webservice.service.ScheduleService;

public class ScheduleServlet extends BaseServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ScheduleServlet() {
		super(new schedule(), new ScheduleService());
	}

}
