package platform.communication;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Executors;

import platform.log.ApplicationLogger;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;

import com.sun.net.httpserver.HttpHandler;

public class HttpServer {
	int port;
	com.sun.net.httpserver.HttpServer server;
	Map<String, HttpHandler> contextMap;
	public HttpServer(int port) {
		this.port = port;
		contextMap = new HashMap<String, HttpHandler>();
	}
	
	public void addContext(String context, HttpHandler handler)  {
		contextMap.put(context, handler);
	}
	public void start() throws ApplicationException {
		try {
			server = com.sun.net.httpserver.HttpServer.create(new InetSocketAddress(port), 0);
			Iterator<Entry<String, HttpHandler>> itr = contextMap.entrySet().iterator();
			while (itr.hasNext()) {
				Map.Entry<String, HttpHandler> pair = itr.next();
				server.createContext(pair.getKey(), pair.getValue());
			}
			server.setExecutor(Executors.newCachedThreadPool());
			server.start();
			ApplicationLogger.info("Started HTTP Server at "+port+"....", this.getClass());
		} catch (IOException e) {
			e.printStackTrace();
			throw new ApplicationException(ExceptionSeverity.ERROR, e.getMessage());
		}
	}
	
	public void stop() {
		if(server != null)
			server.stop(2); //stop with a delay of 2 seconds
	}
}
