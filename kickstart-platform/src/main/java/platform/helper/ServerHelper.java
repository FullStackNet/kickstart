package platform.helper;

import platform.resource.activity;
import platform.resource.server;


public class ServerHelper extends BaseHelper {

	public ServerHelper() {
		super(new server());
		// TODO Auto-generated constructor stub
	}
	private static ServerHelper instance;
	
	public static ServerHelper getInstance() {
		if (instance == null)
			instance = new ServerHelper();
		return instance;
	}
}
