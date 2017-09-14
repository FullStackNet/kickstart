package platform.monitor;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

import platform.log.ApplicationLogger;


public class TCPMonitor {
	String server;
	int port;
	public TCPMonitor(String server, int port) {
		this.server = server;
		this.port = port;
	}
	
	public boolean isUp() {
		// TODO Auto-generated method stub
		try {
		    InetAddress addr = InetAddress.getByName(server);
		    SocketAddress sockaddr = new InetSocketAddress(addr, port);
		    Socket handle = new Socket();
		    int timeoutMs = 5000;   // 2 seconds
		    handle.connect(sockaddr, timeoutMs);
			handle.close();
		} catch (Exception e) {
			 ApplicationLogger.error(e.getMessage() + " for " +server+"::"+port, this.getClass()); 
			return false;
		}
		return true;
	}
}
