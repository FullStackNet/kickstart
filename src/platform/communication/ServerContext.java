package platform.communication;

import platform.protocol.ProtocolProvider;

public class ServerContext {
	private ProtocolProvider protocolProvider;
	private int port;
	private String name;
	String keystore;
	String keystorePassword;
	boolean ssl;
	private long maxConnection;
	private long maxMessageQueueSizePerClient;
	private long maxClients;
	

	public ServerContext(String name, ProtocolProvider protocolProvider,int port ) {
		this.protocolProvider = protocolProvider;
		this.port = port;
		this.name = name;
		maxConnection = 15000;
		maxMessageQueueSizePerClient = 256;
		maxClients = 500;
	}
	
	public long getMaxMessageQueueSizePerClient() {
		return maxMessageQueueSizePerClient;
	}

	public void setMaxMessageQueueSizePerClient(long maxMessageQueueSizePerClient) {
		this.maxMessageQueueSizePerClient = maxMessageQueueSizePerClient;
	}
	
	public ProtocolProvider getProtocolProvider() {
		return protocolProvider;
	}
	public void setProtocolProvider(ProtocolProvider protocolProvider) {
		this.protocolProvider = protocolProvider;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKeystore() {
		return keystore;
	}

	public void setKeystore(String keystore) {
		this.keystore = keystore;
	}

	public String getKeystorePassword() {
		return keystorePassword;
	}

	public void setKeystorePassword(String keystorePassword) {
		this.keystorePassword = keystorePassword;
	}

	public boolean isSsl() {
		return ssl;
	}

	public void setSsl(boolean ssl) {
		this.ssl = ssl;
	}

	public long getMaxConnection() {
		return maxConnection;
	}

	public void setMaxConnection(long maxConnection) {
		this.maxConnection = maxConnection;
	}

	public long getMaxClients() {
		return maxClients;
	}

	public void setMaxClients(long maxClients) {
		this.maxClients = maxClients;
	}
	
}
