package platform.communication.messagebus;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.ExceptionListener;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.Message;

import platform.communication.ClientMessageQueue;
import platform.communication.SessionManager;
import platform.event.EventManager;
import platform.event.interfaces.Event;
import platform.event.interfaces.GenericEventListener;
import platform.events.ShutDownProcessEvent;
import platform.log.ApplicationLogger;
import platform.manager.GlobalDataManager;
import platform.message.MessageManager;
import platform.thread.ApplicationThreadPool;

public class Connector {
	String connectURL;
	String userName;
	String password;
	Session session;
	String name;
	Connection connection;
	Map<String, MessageProducer> peerMap;

	ATMQDecoder decoder;
	ATMQEncoder encoder;
	Thread  messageProcessingThread;
	MessageManager messageManager;
	GenericEventListener processShutDownListner;
	ApplicationThreadPool pool;
	int numberOfmessageProcessingThread;
	int capacityOfmessageProcessingQueue;

	public Connector(String connectURL, String name, String userName, String password, MessageManager messageManager) {
		this.connectURL = connectURL;
		this.userName = userName;
		this.password = password;
		this.name = name;
		peerMap = new ConcurrentHashMap<String, MessageProducer>();
		decoder = new ATMQDecoder();
		encoder = new ATMQEncoder();
		messageProcessingThread = null;
		this.messageManager = messageManager;
		numberOfmessageProcessingThread = 10;
		capacityOfmessageProcessingQueue = 15;

	}

	class MessageProcessingTask implements Runnable {
		platform.communication.Session session;
		platform.message.Message message;

		public MessageProcessingTask(platform.communication.Session session , platform.message.Message message) {
			this.session = session;
			this.message = message;
		}

		void process_message() {
			ApplicationLogger.info("Recieved the Message " + message.getName()+"("+message.getPacketType()+")"  + " from " + message.getSender(), this.getClass());
			if (message.getPacketType() == platform.message.Message.PACKET_TYPE_REQUEST) {
				platform.message.Message  response = message.request_process(session, null);
				if (response != null) {
					response.setSender(name);
					response.setTarget(message.getSender());
					response.setSequenceNumber(message.getSequenceNumber());
					sendMessage(response);
				}
			} else if (message.getPacketType() == platform.message.Message.PACKET_TYPE_RESPONSE) {
				message.request_process(session, null);
			}
		}

		public void run() {
			process_message();
		}
	}


	public void start() {
		pool = new ApplicationThreadPool("CONNECTOR",numberOfmessageProcessingThread, capacityOfmessageProcessingQueue);
		pool.start();

		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(connectURL);
		((ActiveMQConnectionFactory)connectionFactory).setUseAsyncSend(true);
		// Create a Connection
		try {
			connection = connectionFactory.createConnection();
			connection.setExceptionListener(new ExceptionListener() {

				@Override
				public void onException(JMSException exception) {
					// TODO Auto-generated method stub
					exception.printStackTrace();
					ApplicationLogger.error(exception.getMessage(), this.getClass());
				}
			});
			connection.start();
			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			Queue queue = session.createQueue("MessageQueue."+name);
			Queue permanentQueue = session.createQueue("MessageQueue.permanent."+name);
			MessageConsumer consumer = session.createConsumer(queue);
			MessageConsumer permanentConsumer = session.createConsumer(permanentQueue);
			ApplicationLogger.info("Creating Queue " + "MessageQueue."+name, this.getClass());
			permanentConsumer.setMessageListener(new MessageListener() {
				@Override
				public void onMessage(javax.jms.Message message) {
					// TODO Auto-generated method stub
					platform.communication.Session cr4Session = null ;
					platform.message.Message msg = decoder.decode(message,messageManager);
					if (msg == null) {
						// send error to sender
						return;
					}
					ApplicationLogger.info(msg.getSender()+" Recieved Permanent Message "+msg.getName()+" from " + msg.getSender()+ "\n\t"+msg.getDump(), this.getClass());
					cr4Session = SessionManager.getInstance().getSession(msg.getSender());
					//process_message(cr4Session, msg);
					pool.addTask(new MessageProcessingTask(cr4Session, msg));
				}
			});
			consumer.setMessageListener(new MessageListener() {
				@Override
				public void onMessage(javax.jms.Message message) {
					// TODO Auto-generated method stub
					platform.communication.Session cr4Session = null ;
					platform.message.Message msg = decoder.decode(message,messageManager);
					if (msg == null) {
						// send error to sender
						return;
					}
					ApplicationLogger.info(msg.getSender()+" Recieved Message "+msg.getName()+" from " + msg.getSender()+ "\n\t"+msg.getDump(), this.getClass());
					cr4Session = SessionManager.getInstance().getSession(msg.getSender());
					//process_message(cr4Session, msg);
					pool.addTask(new MessageProcessingTask(cr4Session, msg));
				}
			});
			processShutDownListner = new GenericEventListener() {
				@Override
				public void eventTriggered(Object sender, Event event) {
					// TODO Auto-generated method stub
					try {
						Thread.sleep(2000L);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					ApplicationLogger.info(ClientMessageQueue.getInstance().getSize()+" pending messages but shuting down thread connector :: ...."+ getName(), this.getClass());
					disconnect();
				}
			}; 
			EventManager.getInstance().registerEventListener(processShutDownListner, ShutDownProcessEvent.class);

			if (messageProcessingThread == null) {
				messageProcessingThread = new Thread(new Runnable() {
					@Override
					public void run() {
						// TODO Auto-generated method stub
						while (true) {
							try {
								if (ClientMessageQueue.getInstance().getSize() == 0) {
									ClientMessageQueue.getInstance().waitMe();
								}
								platform.message.Message message = ClientMessageQueue.getInstance().getMessage();
								sendMessage( message);
							} catch (Exception e) {
								e.printStackTrace();
							}							
						}
					}
				});
				messageProcessingThread.start();
			}
			GlobalDataManager.getInstance().setConnected(true);
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			GlobalDataManager.getInstance().setConnected(false);
		}
	}

	public Message getMessage() {
		Message message = null;
		try {
			message = (Message) session.createMessage();
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return message;
	}

	public void sendMessage(platform.message.Message message) {
		if (message == null)
			return;
		String targetId = message.getTarget();
		if (message.isPersistent()) {
			MessageProducer producer = peerMap.get("permanent_"+targetId);
			if (producer == null) {
				addPeer(targetId);
				producer = peerMap.get("permanent_"+targetId);
			}
			try {
				ApplicationLogger.info(message.getSender()+" Sending Permament Message "+message.getName()+" to " + targetId + "\n"+message.getDump(), this.getClass());
				Message msg = getMessage();
				encoder.encode(msg, message);
				producer.send(msg);
			} catch (JMSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			MessageProducer producer = peerMap.get(targetId);
			if (producer == null) {
				addPeer(targetId);
				producer = peerMap.get(targetId);
			}
			try {
				ApplicationLogger.info(message.getSender()+" Sending Message "+message.getName()+" to " + targetId + "\n"+message.getDump(), this.getClass());
				Message msg = getMessage();
				encoder.encode(msg, message);
				producer.send(msg);
			} catch (JMSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void addPeer(String peerId) {
		MessageProducer peer = peerMap.get(peerId);
		if (peer != null)
			return;
		try {
			Destination destination = session.createQueue("MessageQueue."+peerId);
			peer = session.createProducer(destination);
			peer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
			peerMap.put(peerId, peer);
		} catch(Exception e) {
			e.printStackTrace();
		}
		try {
			Destination parmanentDestination = session.createQueue("MessageQueue.permanent."+peerId);
			MessageProducer paramanentPeer = session.createProducer(parmanentDestination);
			paramanentPeer.setDeliveryMode(DeliveryMode.PERSISTENT);
			peerMap.put("permanent_"+peerId, paramanentPeer);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void disconnect() {
		try {
			session.close();
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (JMSException e) {
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
}
