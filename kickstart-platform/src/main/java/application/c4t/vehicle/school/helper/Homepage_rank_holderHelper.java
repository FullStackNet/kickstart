package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.homepage_rank_holder;


public class Homepage_rank_holderHelper extends BaseHelper {
	
	Homepage_rank_holderHelper() {
		super(new homepage_rank_holder());
		// TODO Auto-generated constructor stub
	}
	private static Homepage_rank_holderHelper instance;
	
	public static Homepage_rank_holderHelper getInstance() {
		if (instance == null)
			instance = new Homepage_rank_holderHelper();
		return instance;
	}
	
}
