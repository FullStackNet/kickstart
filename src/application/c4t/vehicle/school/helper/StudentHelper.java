package application.c4t.vehicle.school.helper;

import java.util.ArrayList;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.resource.user;
import platform.util.Util;
import application.c4t.vehicle.school.resource.student;


public class StudentHelper extends BaseHelper {
	
	StudentHelper() {
		super(new student());
		// TODO Auto-generated constructor stub
	}
	private static StudentHelper instance;
	
	public static StudentHelper getInstance() {
		if (instance == null)
			instance = new StudentHelper();
		return instance;
	}
	
	public BaseResource[] getStudentByRouteStopageId(String route_stopage_id) {
		Expression e1 = new Expression(student.FIELD_PICKUP_ROUTE_STOPAGE_ID, REL_OP.EQ,route_stopage_id);
		Expression e2 = new Expression(student.FIELD_DROPPED_ROUTE_STOPAGE_ID, REL_OP.EQ,route_stopage_id);
		Expression e = new Expression(e1, LOG_OP.OR,e2);
		return getByExpression(e);
	}
	
	public BaseResource[] getStudentByClassName(String school_id,String class_name) {
		Expression e1 = new Expression(student.FIELD_SCHOOL_ID, REL_OP.EQ,school_id);
		Expression e2 = new Expression(student.FIELD_CLASS_NAME, REL_OP.EQ,class_name);
		Expression e = new Expression(e1, LOG_OP.AND,e2);
		return getByExpression(e);
	}
	
	public BaseResource[] getStudentBySectionName(String school_id,String class_name, String section_name) {
		Expression e1 = new Expression(student.FIELD_SCHOOL_ID, REL_OP.EQ, school_id);
		Expression e2 = new Expression(student.FIELD_CLASS_NAME, REL_OP.EQ, class_name);
		Expression e3 = new Expression(student.FIELD_SECTION_NAME, REL_OP.EQ, section_name);
		Expression e4 = new Expression(e1, LOG_OP.AND,e2);
		Expression e = new Expression(e4, LOG_OP.AND,e3);
		return getByExpression(e);
	}
	
	public BaseResource[]  getStudentByClassSectionName(String school_id, String class_section_name) {
		Expression e1 = new Expression(student.FIELD_SCHOOL_ID, REL_OP.EQ, school_id);
		Expression e2 = new Expression(student.FIELD_CLASS_SECTION_NAME, REL_OP.EQ, class_section_name);
		Expression e  = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e);
	}
	
	public BaseResource[] getUserByClassName(String school_id,String class_name) {
		ArrayList<BaseResource> list = new ArrayList<BaseResource>();
		BaseResource[] students = getStudentByClassName(school_id,class_name);
		if ((students == null) || Util.isEmpty(students)) {
			return null;
		}
		for(BaseResource resource : students) {
			student _student = (student) resource;
			ArrayList<BaseResource> users = Student_mapHelper.getInstance().getUsersList(_student.getId());
			if ( Util.isEmpty(users)) {
				continue;
			}
			list.addAll(users);
		}
		return list.toArray(new user[list.size()]);
	}
	
	public BaseResource[] getUserBySectionName(String school_id,String class_name,String section_name) {
		ArrayList<BaseResource> list = new ArrayList<BaseResource>();
		BaseResource[] students = getStudentBySectionName(school_id,class_name,section_name);
		if ((students == null) || Util.isEmpty(students)) {
			return null;
		}
		for(BaseResource resource : students) {
			student _student = (student) resource;
			ArrayList<BaseResource> users = Student_mapHelper.getInstance().getUsersList(_student.getId());
			if ( Util.isEmpty(users)) {
				continue;
			}
			list.addAll(users);
		}
		return list.toArray(new user[list.size()]);
	}
	
	public BaseResource[] getUserByStudentId(String student_id) {
		ArrayList<BaseResource> list = new ArrayList<BaseResource>();
		list = Student_mapHelper.getInstance().getUsersList(student_id);
		return list.toArray(new user[list.size()]);
	}
}
