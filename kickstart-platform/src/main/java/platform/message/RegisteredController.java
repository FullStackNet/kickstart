package platform.message;

import platform.communication.Session;
import platform.messages.BaseRegisteredController;

public class RegisteredController extends BaseRegisteredController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Message request_process(Session session, Message parentMessage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void process_aftersent(Session session) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void process_response(Session session) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void process_timeout(Session session) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void process_error(Session session, Message reply) {
		// TODO Auto-generated method stub
		
	}

}
