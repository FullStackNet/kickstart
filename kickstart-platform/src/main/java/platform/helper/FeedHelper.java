package platform.helper;

import platform.resource.feed;


public class FeedHelper extends BaseHelper {
	
	public FeedHelper() {
		super(new feed());
		// TODO Auto-generated constructor stub
	}
	private static FeedHelper instance;
	
	public static FeedHelper getInstance() {
		if (instance == null)
			instance = new FeedHelper();
		return instance;
	}
}
