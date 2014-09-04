package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
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
	
	public BaseResource[] getByClass(String customerId,String className) {
		Expression e1 = new Expression(work_sheet.FIELD_CUSTOMER_ID, REL_OP.EQ, customerId);
		Expression e2 = new Expression(work_sheet.FIELD_CLASS_NAME, REL_OP.EQ, className);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e, new String[]{work_sheet.FIELD_SUBJECT_ID,work_sheet.FIELD_CHAPTER_NO,work_sheet.FIELD_TOPIC_NO,work_sheet.FIELD_SHEET_NO});
	}
	
	public void updateAnswerFileName(String id,String filename) {
		work_sheet sheet = new work_sheet();
		sheet.setId(id);
		sheet.setAnswer_filename(filename);
		try {
			update(sheet);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateQuestionFileName(String id,String filename) {
		work_sheet sheet = new work_sheet();
		sheet.setId(id);
		sheet.setQuestion_filename(filename);
		try {
			update(sheet);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
