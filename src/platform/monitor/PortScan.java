package platform.monitor;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

import platform.log.ApplicationLogger;


public class PortScan {
	String server;
	int port;
	int timeout ;
	public PortScan(String server, int port) {
		this.server = server;
		this.port = port;
		this.timeout = 20000;
	}
	
	public PortScan(String server, int port, int timeout) {
		this.server = server;
		this.port = port;
		this.timeout = timeout;
	}

	public boolean isUp() {
		// TODO Auto-generated method stub
		try {
		    InetAddress addr = InetAddress.getByName(server);
		    SocketAddress sockaddr = new InetSocketAddress(addr, port);
		    Socket handle = new Socket();
		    int timeoutMs = timeout;   
		    handle.connect(sockaddr, timeoutMs);
			handle.close();
		} catch (Exception e) {
			 ApplicationLogger.error(e.getMessage(), this.getClass()); 
			return false;
		}
		return true;
	}
	public static void main(String[] args) throws Exception {
		String ip = "my.cloud4things.com";
		int end_ports = 65535;
		if ((args != null) && (args.length > 0)) {
			ip = args[0];
		}
		
		if ((args != null) && (args.length > 0)) {
			end_ports = Integer.parseInt(args[0]);
		}
		
		for(int i =1 ; i < end_ports; i++) {
			System.out.print(".");
			PortScan portscan = new PortScan(ip, i,2000);
			if (portscan.isUp()) {
				System.out.println("\n\n"+ip+"open port " + i+"\n\n");
			}
			
		}
	}
}
