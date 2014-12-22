package application.brushupskills.helper;

import platform.helper.BaseHelper;
import application.brushupskills.resource.transaction;

public class TransactionHelper extends BaseHelper {

	private static TransactionHelper instance;

	public static TransactionHelper getInstance() {
		if (instance == null)
			instance = new TransactionHelper();
		return instance;
	}
	
	public TransactionHelper() {
		super(new transaction());
		// TODO Auto-generated constructor stub
	}
}
