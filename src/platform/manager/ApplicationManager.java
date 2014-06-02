package platform.manager;

import platform.communication.ClientMessageQueue;
import platform.communication.messagebus.Connector;
import platform.config.Reader;
import platform.message.Message;
import platform.message.MessageManager;
import platform.util.ApplicationConstants;

public class ApplicationManager {
	private static ApplicationManager instance;
	Connector connector;
	ApplicationManager() {
		Reader reader = new Reader(ApplicationConstants.CONFIGURATION_FILE);
		String connectURL = reader.getString(ApplicationConstants.PROPERTY_CONNECT_URL,"tcp://localhost:61616");
		MessageManager manager = new MessageManager();
		connector = new Connector(connectURL, ApplicationConstants.APPLICATION_NAME_APPLICATION_SERVER, "", "", manager);
		connector.start();
		connector.addPeer(ApplicationConstants.APPLICATION_NAME_MANAGER);
		connector.addPeer(ApplicationConstants.APPLICATION_NAME_ALERT_MANAGER);
	}
	
	public void sendMessage(String target,Message message) {
		ClientMessageQueue.getInstance().addMessage(ApplicationConstants.APPLICATION_NAME_APPLICATION_SERVER,target,message);
	}
	
	public void disconnect() {
		connector.disconnect();
	}
	
	public static ApplicationManager getInstance() {
		if (instance == null)
			instance = new ApplicationManager();
		return instance;
	}
}
