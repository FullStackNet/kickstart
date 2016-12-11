package platform.helper;

import platform.resource.mandi_auction;


public class Mandi_auctionHelper extends BaseHelper {

	public Mandi_auctionHelper() {
		super(new mandi_auction());
		// TODO Auto-generated constructor stub
	}
	
	private static Mandi_auctionHelper instance;

	public static Mandi_auctionHelper getInstance() {
		if (instance == null)
			instance = new Mandi_auctionHelper();
		return instance;
	}
	
}
