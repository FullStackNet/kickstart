package application.c4t.vehicle.school.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.db.Expression;
import platform.db.JoinField;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.resource.user;
import platform.util.ApplicationException;
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
	
	public void deleteRouteStopage(String routeStopageId) {
		Expression e = new Expression(student.FIELD_PICKUP_ROUTE_STOPAGE_ID, REL_OP.EQ, routeStopageId);
		BaseResource[] resources = getByExpression(e);
		if (!Util.isEmpty(resources)) {
			for(int i=0 ; i <resources.length; i++) {
				student _student = (student)resources[i];
				student __student = new student();
				__student.setId(_student.getId());
				try {
					unset(__student,new String[]{student.FIELD_PICKUP_ROUTE_STOPAGE_ID});
					unset(__student,new String[]{student.FIELD_PICKUP_ROUTE_ID});
					unset(__student,new String[]{student.FIELD_PICKUP_STOPAGE_ID});
				} catch (ApplicationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		e = new Expression(student.FIELD_DROPPED_ROUTE_STOPAGE_ID, REL_OP.EQ, routeStopageId);
		resources = getByExpression(e);
		if (!Util.isEmpty(resources)) {
			for(int i=0 ; i <resources.length; i++) {
				student _student = (student)resources[i];
				student __student = new student();
				__student.setId(_student.getId());
				try {
					unset(__student,new String[]{student.FIELD_DROPPED_ROUTE_STOPAGE_ID});
					unset(__student,new String[]{student.FIELD_DROPPED_ROUTE_ID});
					unset(__student,new String[]{student.FIELD_DROPPED_STOPAGE_ID});
				} catch (ApplicationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}
	
	public ArrayList<Map<String,Object>> getClassStudentListMap(String[] school_ids, String class_name, ArrayList<JoinField> joinFields)  {
		Expression e1 = new Expression(student.FIELD_SCHOOL_ID, REL_OP.IN, school_ids);
		Expression e2 = new Expression(student.FIELD_CLASS_NAME, REL_OP.EQ, class_name);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		ArrayList<Map<String, Object>> list;
		try {
			list = getByJoining(e, joinFields, new String[]{student.FIELD_NAME});
			return list;
		} catch (ApplicationException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		
		return null;
	}
	
	public ArrayList<Map<String,Object>> getSectionStudentListMap(String[] school_ids, String class_section_name, ArrayList<JoinField> joinFields)  {
		Expression e1 = new Expression(student.FIELD_SCHOOL_ID, REL_OP.IN, school_ids);
		Expression e2 = new Expression(student.FIELD_CLASS_SECTION_NAME, REL_OP.EQ, class_section_name);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		ArrayList<Map<String, Object>> list;
		try {
			list = getByJoining(e, joinFields, new String[]{student.FIELD_NAME});
			return list;
		} catch (ApplicationException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		
		return null;
	}
	
	public ArrayList<Map<String,Object>> getSchoolStudentListMap(String school_ids, ArrayList<JoinField> joinFields)  {
		Expression e = new Expression(student.FIELD_SCHOOL_ID, REL_OP.EQ, school_ids);
		ArrayList<Map<String, Object>> list;
		try {
			list = getByJoining(e, joinFields, new String[]{student.FIELD_NAME});
			return list;
		} catch (ApplicationException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		return null;
	}
	
	public ArrayList<Map<String,Object>> getSchoolStudentListMap(String[] school_ids, ArrayList<JoinField> joinFields)  {
		Expression e = new Expression(student.FIELD_SCHOOL_ID, REL_OP.IN, school_ids);
		ArrayList<Map<String, Object>> list;
		try {
			list = getByJoining(e, joinFields, new String[]{student.FIELD_NAME});
			return list;
		} catch (ApplicationException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		return null;
	}
	
	public BaseResource[] getClassStudent(String[] school_ids, String class_name) {
		Expression e1 = new Expression(student.FIELD_SCHOOL_ID, REL_OP.IN, school_ids);
		Expression e2 = new Expression(student.FIELD_CLASS_NAME, REL_OP.EQ, class_name);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e);
	}
	
	
	public BaseResource[] getClassStudent(String school_id, String class_name) {
		Expression e1 = new Expression(student.FIELD_SCHOOL_ID, REL_OP.EQ, school_id);
		Expression e2 = new Expression(student.FIELD_CLASS_NAME, REL_OP.EQ, class_name);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e);
	}
	
	public BaseResource[] getSectionStudent(String[] school_ids, String class_section_name) {
		Expression e1 = new Expression(student.FIELD_SCHOOL_ID, REL_OP.IN, school_ids);
		Expression e2 = new Expression(student.FIELD_CLASS_SECTION_NAME, REL_OP.EQ, class_section_name);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e);
	}
	
	
	public BaseResource[] getSectionStudent(String school_id, String class_section_name) {
		Expression e1 = new Expression(student.FIELD_SCHOOL_ID, REL_OP.EQ, school_id);
		Expression e2 = new Expression(student.FIELD_CLASS_SECTION_NAME, REL_OP.EQ, class_section_name);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e);
	}
	
	public BaseResource[] getStudentByRouteId(String route_id) {
		Expression e1 = new Expression(student.FIELD_PICKUP_ROUTE_ID, REL_OP.EQ,route_id);
		Expression e2 = new Expression(student.FIELD_DROPPED_ROUTE_ID, REL_OP.EQ,route_id);
		Expression e = new Expression(e1, LOG_OP.OR,e2);
		return getByExpression(e);
	}
	
	public BaseResource[] getStudentByRouteStopageId(String route_stopage_id) {
		Expression e1 = new Expression(student.FIELD_PICKUP_ROUTE_STOPAGE_ID, REL_OP.EQ,route_stopage_id);
		Expression e2 = new Expression(student.FIELD_DROPPED_ROUTE_STOPAGE_ID, REL_OP.EQ,route_stopage_id);
		Expression e = new Expression(e1, LOG_OP.OR,e2);
		return getByExpression(e);
	}
	
	public BaseResource[] getStudentByCardNo(String card_no) {
		Expression e = new Expression(student.FIELD_CARD_NO, REL_OP.EQ, card_no);
		return getByExpression(e);
	}
	
	public BaseResource[] getStudentBySchool(String school_id) {
		Expression e = new Expression(student.FIELD_SCHOOL_ID, REL_OP.EQ,school_id);
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
