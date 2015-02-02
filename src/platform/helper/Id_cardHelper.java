package platform.helper;

import java.util.Date;

import platform.resource.id_card;
import platform.util.ApplicationException;


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
	
	public void verifyAndAdd(String cardId,String readerno) {
		id_card card = (id_card)Id_cardHelper.getInstance().getById(cardId);
		if (card == null) {
			card = new id_card(cardId);
			card.setLast_reader_no(readerno);
			card.setLast_update_time(new Date().getTime());
			card.setCard_status(id_card.STATUS_NEW);
		}
		try {
			Id_cardHelper.getInstance().AddOrUpdate(card);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateCard(String cardId,String type) {
		
	}
}
