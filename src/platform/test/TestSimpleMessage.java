package platform.test;

import platform.manager.ApplicationMQTTManager;
import platform.manager.SimpleMessageManager;
import platform.message.BaseSimpleMessage;

public class TestSimpleMessage extends BaseSimpleMessage {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String testing;
	
	public String getTesting() {
		return testing;
	}

	public void setTesting(String testing) {
		this.testing = testing;
	}

	public TestSimpleMessage() {
		super("TEST");		
	}
	public TestSimpleMessage(String sender,String target) {
		super("TEST", sender, target);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		SimpleMessageManager.getInstance().register(new TestSimpleMessage());
		TestSimpleMessage message = new TestSimpleMessage("1", "2");
		message.setTesting("Hurre");
		String messageString = SimpleMessageManager.getInstance().convertMessage2string(message);
		System.out.println("Message String : " + messageString);	
		TestSimpleMessage message1 = (TestSimpleMessage) SimpleMessageManager.getInstance().convertString2Message(messageString);
		System.out.println("Additional Data : " + message1.getTesting());	
		//sending message
		ApplicationMQTTManager.getInstance().sendMessage("1", message1);
		
	}
}	
