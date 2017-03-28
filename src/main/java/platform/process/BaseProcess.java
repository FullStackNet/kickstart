package platform.process;

import platform.communication.ClientMessageQueue;
import platform.communication.messagebus.Connector;
import platform.config.Reader;
import platform.event.EventManager;
import platform.event.interfaces.Event;
import platform.event.interfaces.GenericEventListener;
import platform.events.ShutDownProcessEvent;
import platform.log.ApplicationLogger;
import platform.manager.GlobalDataManager;
import platform.message.MORegister;
import platform.message.MOShutdown;
import platform.message.MessageManager;
import platform.thread.DeleteOrphanedConnectionThread;
import platform.thread.MonitorHeartbeatThread;
import platform.util.ApplicationConstants;
import platform.util.process.ProcessUtil;
import platform.version.VersionManager;

public abstract class BaseProcess {
	static BaseProcess instance;
	Connector connector;
	Connector connectorWithId;
	String messageBusURL;
	String userName;
	String password;
	String ipAddress;
	String name;
	String location;
	boolean monitor;
	
	
	MonitorHeartbeatThread monitorHeartbeatThread;
	
	
	public boolean isMonitor() {
		return monitor;
	}

	public void setMonitor(boolean monitor) {
		this.monitor = monitor;
	}

	public BaseProcess() {
		// TODO Auto-generated constructor stub
		this.messageBusURL = "tcp://localhost:61616";
		monitor = true;
	}
	
	protected abstract void registerMessage(MessageManager messageManager);
	protected abstract void registerMessageWithIdConnector(MessageManager messageManager);
	protected abstract void loadConfiguration();
	protected abstract String getProcessType();
	protected abstract void registerPeers();
	protected abstract void registerEventListner();
	protected abstract void register();
	protected abstract void startThreads();
	protected abstract void addRegisterParameters(MORegister registerObject);

	
	void _loadConfiguration() {
		Reader reader = new Reader(ApplicationConstants.CONFIGURATION_FILE);
		messageBusURL = reader.getString(ApplicationConstants.PROPERTY_CONNECT_URL,"tcp://localhost:61616");
		GlobalDataManager.getInstance().setId(reader.getString(ApplicationConstants.PROPERTY_ID,null));
		ipAddress = reader.getString(ApplicationConstants.PROPERTY_SELF_IP_ADDRESS,null);
		location = reader.getString(ApplicationConstants.PROPERTY_LOCATION,null);
		name = reader.getString(ApplicationConstants.PROPERTY_NAME,null);
		GlobalDataManager.getInstance().setProcessStatEnable(reader.getString(ApplicationConstants.PROPERTY_PROCESS_STAT_ENABLED,"YES"));
		if (GlobalDataManager.getInstance().getId() == null) {
			System.out.println("Id is missing in configuration file") ;
			System.exit(-1);
		}
		loadConfiguration();
	}
	
	
	public void startWithId() {
	
		if (connectorWithId != null)
			connectorWithId.disconnect();
	
		MessageManager messageManager = new MessageManager();
		registerMessageWithIdConnector(messageManager);
		connectorWithId = new Connector(messageBusURL, GlobalDataManager.getInstance().getId(), userName, password, messageManager);
		connectorWithId.addPeer(ApplicationConstants.APPLICATION_NAME_MONITOR);
		connectorWithId.addPeer(ApplicationConstants.APPLICATION_NAME_AGENT);
		connectorWithId.addPeer(ApplicationConstants.APPLICATION_NAME_APPLICATION_SERVER);
		connectorWithId.start();
		
		MORegister registerObject = new MORegister();
		registerObject.setId(GlobalDataManager.getInstance().getId());
		if (ipAddress != null)
			registerObject.setIp_address(ipAddress);
		
		if (location != null) {
			registerObject.setLocation(location);
		}
		registerObject.setVersion(VersionManager.VERSION);
		registerObject.setProcess_id(""+ProcessUtil.getPid());
		registerObject.setType(getProcessType());
		registerObject.setMonitor_type(ApplicationConstants.MANAGED_OBJECT_MONITOR_TYPE_HEARTBEAT);
		if (name != null) {
			registerObject.setObject_name(name);
		} else {
			registerObject.setObject_name(GlobalDataManager.getInstance().getId());
		}
		registerObject.setMessage_bus_url(messageBusURL);
		addRegisterParameters(registerObject);
		ClientMessageQueue.getInstance().addMessage(GlobalDataManager.getInstance().getId(), 
				ApplicationConstants.APPLICATION_NAME_MONITOR, registerObject);
		if (monitor) {
			monitorHeartbeatThread = new MonitorHeartbeatThread();
			monitorHeartbeatThread.start();
		}
	}
	
	public void start() {
		if (connector != null)
			connector.disconnect();
	
		MessageManager messageManager = new MessageManager();
		registerMessage(messageManager);
		connector = new Connector(messageBusURL,getProcessType(), userName, password, messageManager);
		connector.addPeer(ApplicationConstants.APPLICATION_NAME_MONITOR);
		connector.addPeer(ApplicationConstants.APPLICATION_NAME_APPLICATION_SERVER);
		registerPeers();
		connector.start();
		startWithId();
		DeleteOrphanedConnectionThread thread = new DeleteOrphanedConnectionThread();
		thread.start();
		
	}
	
	public void _registerEventListner() {
		EventManager.getInstance().registerEventListener(new GenericEventListener() {
			@Override
			public void eventTriggered(Object sender, Event event) {
				// TODO Auto-generated method stub
				MOShutdown message = new 	MOShutdown();
				message.setId(GlobalDataManager.getInstance().getId());
				message.setSender(GlobalDataManager.getInstance().getId());
				message.setTarget(ApplicationConstants.APPLICATION_NAME_MONITOR);
				connector.sendMessage(message);
			}
		}, ShutDownProcessEvent.class);
		registerEventListner();
	}

	public void init() {
		ApplicationLogger.init();
		ProcessUtil.addShutDownHook();
		_loadConfiguration();
		_registerEventListner();
		register();
		startThreads();
	}

	public Connector getConnector() {
		return connector;
	}

	public void setConnector(Connector connector) {
		this.connector = connector;
	}

	public Connector getConnectorWithId() {
		return connectorWithId;
	}

	public void setConnectorWithId(Connector connectorWithId) {
		this.connectorWithId = connectorWithId;
	}	
}
