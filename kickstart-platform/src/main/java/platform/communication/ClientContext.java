package platform.communication;

import platform.protocol.ProtocolProvider;

public class ClientContext {
	private String clientId;
	private String username;
	private String Password;
	private int port;
	private String server;
	private byte application;
	private int ssl;
	private String keystore;
	private ProtocolProvider protocolProvider;
	public String myName;
	public String peerName;
	public String communication_type; //TCP/USB
	public Long disconnectDetectInterval;
	
	public Long getDisconnectDetectInterval() {
		return disconnectDetectInterval;
	}
	public void setDisconnectDetectInterval(Long disconnectDetectInterval) {
		this.disconnectDetectInterval = disconnectDetectInterval;
	}
	public String getKeystore() {
		return keystore;
	}
	public void setKeystore(String keystore) {
		this.keystore = keystore;
	}
	String keystorePassword;
	
	public String getKeystorePassword() {
		return keystorePassword;
	}
	public void setKeystorePassword(String keystorePassword) {
		this.keystorePassword = keystorePassword;
	}
	public int getSsl() {
		return ssl;
	}
	public void setSsl(int ssl) {
		this.ssl = ssl;
	}
	public ClientContext(ProtocolProvider provider, String server, int port) {
		this.port = port;
		this.server = server;
		this.protocolProvider = provider;
		this.ssl = 0;
		this.keystorePassword = "radius@123";
		this.communication_type = "TCP";
	}
	public String getCommunication_type() {
		return communication_type;
	}
	public void setCommunication_type(String communication_type) {
		this.communication_type = communication_type;
	}
	public String getHanId() {
		return clientId;
	}
	public void setHanId(String id) {
		this.clientId = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getServer() {
		return server;
	}
	public void setServer(String server) {
		this.server = server;
	}
	public byte getApplication() {
		return application;
	}
	public void setApplication(byte application) {
		this.application = application;
	}
	
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	public String getPeerName() {
		return peerName;
	}
	public void setPeerName(String peerName) {
		this.peerName = peerName;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public ProtocolProvider getProtocolProvider() {
		return protocolProvider;
	}
	public void setProtocolProvider(ProtocolProvider protocolProvider) {
		this.protocolProvider = protocolProvider;
	}
}
