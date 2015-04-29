package platform.helper;

import java.util.Date;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.id_card;
import platform.util.ApplicationException;
import platform.util.Util;


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
	
	public void verifyAndAdd(String cardId,String readerno,String locationId,String location_name) {
		id_card card = (id_card)Id_cardHelper.getInstance().getById(cardId);
		if (card == null) {
			card = new id_card(cardId);
			card.setCard_no(cardId);
			card.setCard_status(id_card.STATUS_NEW);
		}
		card.setUsed_location_id(locationId);
		card.setUsed_location_name(location_name);
		card.setLast_reader_no(readerno);
		card.setLast_update_time(new Date().getTime());
		try {
			Id_cardHelper.getInstance().AddOrUpdate(card);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void freeTheCard(String cardId) {
		if (Util.isEmpty(cardId)) return;
		id_card card = new id_card(cardId);
		card.setCard_status(id_card.STATUS_NEW);
		card.setUsed_by_id("");
		card.setUsed_by_name("");
		card.setCustomer_id("");
		card.setUsed_by_type("");
		try {
			Id_cardHelper.getInstance().AddOrUpdate(card);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
			
	public void updateUsedByStudent(String cardId,String customerId,
			String school_id,
			String school_name,
			String studentId,
			String studentNAme) {
		id_card card = new id_card(cardId);
		card.setCard_status(id_card.STATUS_USED);
		card.setUsed_by_id(studentId);
		card.setUsed_by_name(studentNAme);
		card.setUsed_location_id(school_id);
		card.setUsed_location_name(school_name);
		card.setCustomer_id(customerId);
		card.setUsed_by_type("STDEUNT");
		card.setCard_status(id_card.STATUS_USED);
		try {
			Id_cardHelper.getInstance().AddOrUpdate(card);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void loadMoney(String cardId,double amount) {
		try {
			Id_cardHelper.getInstance().incrementValue(cardId, id_card.FIELD_AMOUNT, amount);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void unloadMoney(String cardId,double amount) {
		try {
			Id_cardHelper.getInstance().incrementValue(cardId, id_card.FIELD_AMOUNT, (-1)*amount);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateUsedByStaff(String cardId,String customerId,
			String school_id,
			String school_name,
			String staffId,
			String staffName) {
		id_card card = new id_card(cardId);
		card.setCard_status(id_card.STATUS_USED);
		card.setUsed_by_id(staffId);
		card.setUsed_by_name(staffName);
		card.setUsed_location_id(school_id);
		card.setUsed_location_name(school_name);
		card.setCustomer_id(customerId);
		card.setUsed_by_type("STAFF");
		card.setCard_status(id_card.STATUS_USED);
		try {
			Id_cardHelper.getInstance().AddOrUpdate(card);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public BaseResource[] getForSchoolNew(String[] school_ids,String[] order)  {
		Expression e1 = new Expression(id_card.FIELD_USED_LOCATION_ID, REL_OP.IN, school_ids);
		Expression e2= new Expression(id_card.FIELD_CARD_STATUS, REL_OP.EQ, id_card.STATUS_NEW);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e,order);
	}
	
	public BaseResource[] getForSchoolUsed(String[] school_ids,String[] order)  {
		Expression e1 = new Expression(id_card.FIELD_USED_LOCATION_ID, REL_OP.IN, school_ids);
		Expression e2= new Expression(id_card.FIELD_CARD_STATUS, REL_OP.EQ, id_card.STATUS_USED);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e,order);
	}
	
	public BaseResource[] getForSchool(String[] school_ids,String[] order)  {
		Expression e = new Expression(id_card.FIELD_USED_LOCATION_ID, REL_OP.IN, school_ids);
		return getByExpression(e,order);
	}
}
