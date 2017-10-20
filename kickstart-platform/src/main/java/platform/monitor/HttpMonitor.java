package platform.monitor;

import platform.communication.HttpClient;
import platform.log.ApplicationLogger;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;


public class HttpMonitor {
	String url;
	public HttpMonitor(String url) {
		this.url = url;
	}
	
	public boolean isUp() {
		// TODO Auto-generated method stub
		try {
			HttpClient.get(url);
			return true;
		} catch (Exception e) {
			 ApplicationLogger.error(e.getMessage() + " for " +url, this.getClass());
		}
		return false;
	}
}
