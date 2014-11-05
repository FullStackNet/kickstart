package application.c4t.vehicle.school.helper;



import platform.helper.BaseHelper;
import application.c4t.vehicle.school.resource.report_card_generation_request;


public class Report_card_generation_requestHelper extends BaseHelper {
	
	Report_card_generation_requestHelper() {
		super(new report_card_generation_request());
		// TODO Auto-generated constructor stub
	}
	private static Report_card_generation_requestHelper instance;
	
	public static Report_card_generation_requestHelper getInstance() {
		if (instance == null)
			instance = new Report_card_generation_requestHelper();
		return instance;
	}	
	
}
