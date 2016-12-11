package platform.manager;

import platform.communication.MQTTConnector;
import platform.communication.MQTTMessageHandler;
import platform.config.Reader;
import platform.message.BaseSimpleMessage;
import platform.util.ApplicationConstants;
import platform.util.ApplicationException;

public class ApplicationMQTTManager {
	private static ApplicationMQTTManager instance;
	MQTTConnector connector;
	MQTTMessageHandler handler = new MQTTMessageHandler() {
		
		@Override
		public void process(BaseSimpleMessage message) throws ApplicationException {
			// TODO Auto-generated method stub
			
		}
	};
	
	ApplicationMQTTManager() {
		Reader reader = new Reader(ApplicationConstants.CONFIGURATION_FILE);
		String connectURL = reader.getString(ApplicationConstants.PROPERTY_CONNECT_URL,"mqtt://localhost:1883");
		connector = new MQTTConnector(connectURL, ApplicationConstants.APPLICATION_NAME_APPLICATION_SERVER, "", "",handler);
		connector.start();
	}
	
	public void sendMessage(String target,BaseSimpleMessage message) {
		connector.sendMessage(target, message.getSender(), message);
	}
	
	public void disconnect() {
		connector.disconnect();
	}
	
	public static ApplicationMQTTManager getInstance() {
		if (instance == null)
			instance = new ApplicationMQTTManager();
		return instance;
	}
}
