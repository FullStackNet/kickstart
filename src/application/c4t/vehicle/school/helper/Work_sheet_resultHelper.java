package application.c4t.vehicle.school.helper;

import java.util.Map;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.helper.HelperUtils;
import platform.resource.BaseResource;
import platform.util.Util;
import application.c4t.vehicle.school.resource.student;
import application.c4t.vehicle.school.resource.work_sheet;
import application.c4t.vehicle.school.resource.work_sheet_result;


public class Work_sheet_resultHelper extends BaseHelper {
	
	public Work_sheet_resultHelper() {
		super(new work_sheet_result());
		// TODO Auto-generated constructor stub
	}
	private static Work_sheet_resultHelper instance;
	
	public static Work_sheet_resultHelper getInstance() {
		if (instance == null)
			instance = new Work_sheet_resultHelper();
		return instance;
	}
	
	public void populateWorkSheet(student _student,work_sheet_result resultSheet,work_sheet worksheet) {
		resultSheet.setSubject_id(worksheet.getSubject_id());
		resultSheet.setChapter_id(worksheet.getChapter_id());
		resultSheet.setChapter_name(worksheet.getChapter_name());
		resultSheet.setChapter_no(worksheet.getChapter_no());

		resultSheet.setSheet_id(worksheet.getId());
		resultSheet.setSheet_no(worksheet.getSheet_no());
		resultSheet.setName(worksheet.getName());
		resultSheet.setTopic_id(worksheet.getTopic_id());
		resultSheet.setTopic_name(worksheet.getTopic_name());
		resultSheet.setTopic_no(worksheet.getTopic_no());
		resultSheet.setTotal_marks(worksheet.getTotal_marks());
		
		resultSheet.setClass_name(_student.getClass_name());
		resultSheet.setClass_section_name(_student.getClass_section_name());
		resultSheet.setStudent_id(_student.getId());
		
						
		
	}
	
	public void populateResultSheet(work_sheet_result resultSheet,work_sheet_result studentSheet) {
		resultSheet.setMarks(studentSheet.getMarks());
		resultSheet.setGrading(studentSheet.getGrading());
		resultSheet.setAttempts(studentSheet.getAttempts());
	}
	
	public BaseResource[] getWorksheetsForClass(student _student,String customerId,String className,Map<Object, BaseResource> map) {
		BaseResource[] resources = Work_sheetHelper.getInstance().getByClass(customerId, className);
		if (Util.isEmpty(resources)) return null;
		work_sheet_result[] resultSheets = new work_sheet_result[resources.length];
		for(int i=0; i < resources.length;i++) {
			work_sheet worksheet = (work_sheet)resources[i];
			String id = work_sheet_result.id(_student.getId(), worksheet.getId());
			resultSheets[i] = new work_sheet_result(id);
			work_sheet_result studentSheet = (work_sheet_result)map.get(worksheet.getId());
			populateWorkSheet(_student, resultSheets[i], worksheet);
			if (studentSheet != null) {
				populateResultSheet(resultSheets[i],studentSheet);
			}
		}
		return resultSheets;
		
	}
	public BaseResource[] getByStudentId(String customerId,String studentId) {
		student _student = (student)StudentHelper.getInstance().getById(studentId);
		Expression e = new Expression(work_sheet_result.FIELD_STUDENT_ID, REL_OP.EQ, studentId);
		BaseResource[] resources = getByExpression(e);
		Map<Object, BaseResource> map = HelperUtils.convertArray2Map(resources,work_sheet_result.FIELD_SHEET_ID);
		BaseResource[] worksheets = getWorksheetsForClass(_student,customerId,_student.getClass_name(),map);
		return worksheets;
	}
}
