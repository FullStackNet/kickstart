package platform.email;

public class SMTPServerProps {
	String smtpServer;
	String smtpSSLPort;
	String smtpUserName;
	String smtpPassword;
	
	public String getSmtpPassword() {
		return smtpPassword;
	}
	public void setSmtpPassword(String smtpPassword) {
		this.smtpPassword = smtpPassword;
	}
	public String getSmtpServer() {
		return smtpServer;
	}
	public void setSmtpServer(String smtpServer) {
		this.smtpServer = smtpServer;
	}
	public String getSmtpSSLPort() {
		return smtpSSLPort;
	}
	public void setSmtpSSLPort(String smtpSSLPort) {
		this.smtpSSLPort = smtpSSLPort;
	}
	public String getSmtpUserName() {
		return smtpUserName;
	}
	public void setSmtpUserName(String smtpUserName) {
		this.smtpUserName = smtpUserName;
	}
}
