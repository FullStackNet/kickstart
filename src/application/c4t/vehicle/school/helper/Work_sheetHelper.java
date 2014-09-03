package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.work_sheet;


public class Work_sheetHelper extends BaseHelper {
	
	public Work_sheetHelper() {
		super(new work_sheet());
		// TODO Auto-generated constructor stub
	}
	private static Work_sheetHelper instance;
	
	public static Work_sheetHelper getInstance() {
		if (instance == null)
			instance = new Work_sheetHelper();
		return instance;
	}
	
	public BaseResource[] getByTopicId(String topicId) {
		Expression e = new Expression(work_sheet.FIELD_TOPIC_ID, REL_OP.EQ, topicId);
		return getByExpression(e, new String[]{work_sheet.FIELD_SHEET_NO});
	}
}
