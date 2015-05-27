package application.traceme.helper;

import platform.helper.BaseHelper;
import application.traceme.resource.traceme_url;


public class Traceme_urlHelper extends BaseHelper {
	Traceme_urlHelper() {
		super(new traceme_url());
		// TODO Auto-generated constructor stub
	}
	private static Traceme_urlHelper instance;
	
	public static Traceme_urlHelper getInstance() {
		if (instance == null)
			instance = new Traceme_urlHelper();
		return instance;
	}
}
