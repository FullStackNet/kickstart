package platform.communication;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.jms.MessageProducer;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import platform.event.interfaces.GenericEventListener;
import platform.log.ApplicationLogger;
import platform.manager.GlobalDataManager;
import platform.manager.SimpleMessageManager;
import platform.message.BaseSimpleMessage;
import platform.thread.ApplicationThreadPool;
import platform.util.ApplicationException;

public class MQTTConnector  implements MqttCallback {
	String connectURL;
	String userName;
	String password;
	String name;
	MqttClient client;
	Map<String, MessageProducer> peerMap;

	Thread  messageProcessingThread;
	GenericEventListener processShutDownListner;
	ApplicationThreadPool pool;
	int numberOfmessageProcessingThread;
	int capacityOfmessageProcessingQueue;
	MQTTMessageHandler handler;
	
	public MQTTMessageHandler getHandler() {
		return handler;
	}

	public void setHandler(MQTTMessageHandler handler) {
		this.handler = handler;
	}

	public MQTTConnector(String connectURL, String name, String userName, String password,MQTTMessageHandler handler) {
		this(connectURL, name, userName, password);
		this.handler = handler;
	}
	
	public MQTTConnector(String connectURL, String name, String userName, String password) {
		this.connectURL = connectURL;
		this.userName = userName;
		this.password = password;
		this.name = name;
		peerMap = new ConcurrentHashMap<String, MessageProducer>();
		messageProcessingThread = null;
		numberOfmessageProcessingThread = 10;
		capacityOfmessageProcessingQueue = 15;
	}

	class MessageProcessingTask implements Runnable {
		platform.communication.Session session;
		BaseSimpleMessage message;

		public MessageProcessingTask(platform.communication.Session session , BaseSimpleMessage message) {
			this.session = session;
			this.message = message;
		}

		void process_message(BaseSimpleMessage message) throws ApplicationException {
			ApplicationLogger.info("Recieved the Message " + message.getId()+"("+")"  + " from " + message.getSender(), this.getClass());
			if (handler != null)
				handler.process(message);
		}

		public void run() {
			try {
				process_message(message);
			} catch(ApplicationException e) {
				e.printStackTrace();
			}
			
		}
	}


	public void start() {
		pool = new ApplicationThreadPool("MQTT-CONNECTOR",numberOfmessageProcessingThread, capacityOfmessageProcessingQueue);
		pool.start();


		// Create a Connection
		try {
			MemoryPersistence persistence = new MemoryPersistence();
			client = new MqttClient(connectURL, name,persistence);
			client.setCallback(this);
			client.connect();
			client.subscribe(name,0);
		} catch (MqttException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			GlobalDataManager.getInstance().setConnected(false);
		}
	}
	public void sendMessage(String target, String sender, BaseSimpleMessage message) {
		message.setTarget(target);
		message.setSender(sender);
		sendMessage(message);
	}
	private void sendMessage(BaseSimpleMessage message) {
		if (message == null)
			return;
		String targetId = message.getTarget();
		try {
			System.out.println("Got send message request for " + targetId + " Message " + message.getId());
			MqttMessage msg = new MqttMessage();
			String messageString = SimpleMessageManager.getInstance().convertMessage2string(message);
			msg.setPayload(messageString.getBytes());
			client.publish(targetId, msg);
		} catch (MqttException e) {
			e.printStackTrace();
			ApplicationLogger.error("MqttException, " + e,this.getClass());
		} catch (Exception e) {
			e.printStackTrace();
			ApplicationLogger.error("Exception, " + e,this.getClass());
		}
	}

	public void disconnect() {
		try {
			client.disconnect();
		} catch (MqttException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getName() {
		return name;
	}

	public int getNumberOfmessageProcessingThread() {
		return numberOfmessageProcessingThread;
	}

	public void setNumberOfmessageProcessingThread(
			int numberOfmessageProcessingThread) {
		this.numberOfmessageProcessingThread = numberOfmessageProcessingThread;
	}

	public int getCapacityOfmessageProcessingQueue() {
		return capacityOfmessageProcessingQueue;
	}

	public void setCapacityOfmessageProcessingQueue(
			int capacityOfmessageProcessingQueue) {
		this.capacityOfmessageProcessingQueue = capacityOfmessageProcessingQueue;
	}


	public void connectionLost(Throwable throwable) {

	}

	public void messageArrived(String topic, MqttMessage mqttMessage) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("MQTT Message received ...");
		byte[] payload = mqttMessage.getPayload();
		String messageString = new String(payload);
		BaseSimpleMessage message = SimpleMessageManager.getInstance().convertString2Message(messageString);
		if (message == null)
			return;
		platform.communication.Session session = SessionManager.getInstance().getSession(message.getSender());
		if (session == null) {
			session = new platform.communication.Session();
		}
		if (message != null)
			pool.addTask(new MessageProcessingTask(session, message));		
	}

	public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {

	}
}
