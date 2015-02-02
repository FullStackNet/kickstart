package platform.helper;

import platform.resource.id_card;


public class Id_cardHelper extends BaseHelper {
	
	public Id_cardHelper() {
		super(new id_card());
		// TODO Auto-generated constructor stub
	}
	private static Id_cardHelper instance;
	
	public static Id_cardHelper getInstance() {
		if (instance == null) {
			instance = new Id_cardHelper();
			HelperFactory.getInstance().register(instance);
		}
		return instance;
	}
}
