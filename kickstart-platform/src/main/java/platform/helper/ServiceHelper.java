package platform.helper;

import platform.resource.service;


public class ServiceHelper extends BaseHelper {
	
	public ServiceHelper() {
		super(new service());
		// TODO Auto-generated constructor stub
	}
	private static ServiceHelper instance;
	
	public static ServiceHelper getInstance() {
		if (instance == null)
			instance = new ServiceHelper();
		return instance;
	}
}
