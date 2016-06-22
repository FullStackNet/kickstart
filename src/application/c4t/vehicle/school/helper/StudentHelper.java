package application.c4t.vehicle.school.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.db.Expression;
import platform.db.JoinField;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.ApplianceHelper;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.resource.appliance;
import platform.resource.c4t_object;
import platform.resource.user;
import platform.util.ApplicationException;
import platform.util.Util;
import application.c4t.vehicle.helper.RouteHelper;
import application.c4t.vehicle.resource.route;
import application.c4t.vehicle.school.resource.school;
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

	public void updateCardId(String studentId,String cardId) {
		student _student = new student(studentId);
		_student.setCard_no(cardId);
		try {
			update(_student);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateTotalFee(String studentId,Double fees) {
		student _student = new student(studentId);
		_student.setTotal_fees(fees);
		try {
			update(_student);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateTotalFeePaid(String studentId) {
		student _student = (student)StudentHelper.getInstance().getById(studentId);
		if (_student == null)
			return;
		school _school = (school)SchoolHelper.getInstance().getById(_student.getSchool_id());
		if (_school == null)
			return;
		long start_date = _school.getFee_starting_date();
		double total_fee_paid = Fee_receiptHelper.getInstance().getTotalFee4Year(start_date,studentId);
		student __student = new student(studentId);
		__student.setTotal_fees_paid(total_fee_paid);
		try {
			update(__student);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateTotalDiscountd(String studentId) {
		student _student = (student)StudentHelper.getInstance().getById(studentId);
		if (_student == null)
			return;
		school _school = (school)SchoolHelper.getInstance().getById(_student.getSchool_id());
		if (_school == null)
			return;
		long start_date = _school.getFee_starting_date();
		double total_discount = Fee_discountHelper.getInstance().getTotalDiscount4Year(start_date,studentId);
		student __student = new student(studentId);
		__student.setDiscount(total_discount);
		try {
			update(__student);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateTotalAdditionalCharges(String studentId) {
		student _student = (student)StudentHelper.getInstance().getById(studentId);
		if (_student == null)
			return;
		school _school = (school)SchoolHelper.getInstance().getById(_student.getSchool_id());
		if (_school == null)
			return;
		long start_date = _school.getFee_starting_date();
		double total_charges = Fee_additioanl_chargeHelper.getInstance().getTotalcharges4Year(start_date,studentId);
		student __student = new student(studentId);
		__student.setTotal_additional_charges(total_charges);
		try {
			update(__student);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		} catch (ApplicationException exp) {
			// TODO Auto-generated catch block
			exp.printStackTrace();
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

	public BaseResource[] getSchoolStudent(String[] school_ids,String[] order)  {
		Expression e = new Expression(student.FIELD_SCHOOL_ID, REL_OP.IN, school_ids);
		return getByExpression(e,order);
	}

	
	public BaseResource[] getSchoolCurrentStudent(String[] school_ids,int page_no,int record_count)  {
		Expression e1 = new Expression(student.FIELD_SCHOOL_ID, REL_OP.IN, school_ids);
		Expression e2 = new Expression(student.FIELD_LEFT, REL_OP.NEQ, "Y");
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return getPage(e,new String[]{c4t_object.FIELD_NAME},page_no,record_count);
	}
	
	public BaseResource[] getSchoolStudent(String[] school_ids)  {
		Expression e = new Expression(student.FIELD_SCHOOL_ID, REL_OP.IN, school_ids);
		return getByExpression(e);
	}

	public BaseResource[] getByBatchAndCourse(String courseId, String batchId) {
		Expression e1 = new Expression(student.FIELD_BATCH_ID, REL_OP.EQ, batchId);
		Expression e2 = new Expression(student.FIELD_COURSE_ID, REL_OP.EQ, courseId);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return getByExpression(e);
	}
	
	public student getByAdmissionNoBySchool(String school_id, String admission_no) {
		Expression e1 = new Expression(student.FIELD_SCHOOL_ID, REL_OP.EQ, school_id);
		Expression e2 = new Expression(student.FIELD_ADMISSION_NO, REL_OP.EQ, admission_no);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		BaseResource[] resources = getByExpression(e);
		if (Util.isEmpty(resources)) {
			return null;
		}
		return (student) resources[0];
	}

	public student getByAdmissionNo(String customerId, String admission_no) {
		Expression e1 = new Expression(student.FIELD_CUSTOMER_ID, REL_OP.EQ, customerId);
		Expression e2 = new Expression(student.FIELD_ADMISSION_NO, REL_OP.EQ, admission_no);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		BaseResource[] resources = getByExpression(e);
		if (Util.isEmpty(resources)) {
			return null;
		}
		return (student) resources[0];
	}

	public student getByAdmissionNo(String admission_no) {
		Expression e = new Expression(student.FIELD_ADMISSION_NO, REL_OP.EQ, admission_no);
		BaseResource[] resources = getByExpression(e);
		if (Util.isEmpty(resources)) {
			return null;
		}
		return (student) resources[0];
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

	public BaseResource[] getStudentBySchools(String[] school_ids, String[] order) {
		Expression e = new Expression(student.FIELD_SCHOOL_ID, REL_OP.IN,school_ids);
		//Expression e2 = new Expression(student.FIELD_LEFT, REL_OP.NEQ,"Y");
		//Expression e = new Expression(e1, LOG_OP.AND,e2);
		return getByExpression(e,order);
	}

	public BaseResource[] getStudentBySchools(String[] school_ids) {
		Expression e = new Expression(student.FIELD_SCHOOL_ID, REL_OP.IN,school_ids);
		//Expression e2 = new Expression(student.FIELD_LEFT, REL_OP.NEQ,"Y");
		//Expression e = new Expression(e1, LOG_OP.AND,e2);
		return getByExpression(e);
	}

	public BaseResource[] getStudentByUsingTransport(String[] school_ids) {
		Expression e1 = new Expression(student.FIELD_SCHOOL_ID, REL_OP.IN,school_ids);
		Expression e2 = new Expression(student.FIELD_TRANSPORT, REL_OP.EQ,"Y");
		Expression e = new Expression(e1, LOG_OP.AND,e2);
		return getByExpression(e);
	}

	public BaseResource[] getStudentByClassName(String school_ids[],String class_name) {
		Expression e1 = new Expression(student.FIELD_SCHOOL_ID, REL_OP.IN,school_ids);
		Expression e2 = new Expression(student.FIELD_CLASS_NAME, REL_OP.EQ,class_name);
		Expression e = new Expression(e1, LOG_OP.AND,e2);
		return getByExpression(e);
	}


	public BaseResource[] getStudentByClassName(String school_id,String class_name) {
		Expression e1 = new Expression(student.FIELD_SCHOOL_ID, REL_OP.EQ,school_id);
		Expression e2 = new Expression(student.FIELD_CLASS_NAME, REL_OP.EQ,class_name);
		Expression e = new Expression(e1, LOG_OP.AND,e2);
		return getByExpression(e);
	}

	public BaseResource[] getStudentBySectionName(String[] school_ids,String class_name, String section_name) {
		String class_section_name = Util.getClassSectionName(class_name, section_name);
		return getStudentByClassSectionName(school_ids,class_section_name);
	}

	public BaseResource[] getStudentBySectionName(String school_id,String class_name, String section_name) {
		String class_section_name = Util.getClassSectionName(class_name, section_name);
		return getStudentByClassSectionName(school_id,class_section_name);
	}

	public BaseResource[]  getStudentByClassSectionName(String[] school_ids, String class_section_name) {
		Expression e1 = new Expression(student.FIELD_SCHOOL_ID, REL_OP.IN, school_ids);
		Expression e2 = new Expression(student.FIELD_CLASS_SECTION_NAME, REL_OP.EQ, class_section_name);
		Expression e  = new Expression(e1, LOG_OP.AND, e2);
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
	
	public BaseResource getStudentLocation(String studentId,String routeType) {
		student _student = (student)StudentHelper.getInstance().getById(studentId);
		appliance _bus = null;
		if (_student == null) 
			return null;
		if (route.ROUTE_TYPE_PICKUP.equals(routeType)) {
			route _route = (route)RouteHelper.getInstance().getById(_student.getPickup_route_id());
			if (_route == null) {
				return null;
			}
			_bus = (appliance)ApplianceHelper.getInstance().getById(_route.getAppliance_id());
		} else if (route.ROUTE_TYPE_DROP.equals(routeType)) {
			route _route = (route)RouteHelper.getInstance().getById(_student.getDropped_route_id());
			if (_route == null) {
				return null;
			}
			_bus = (appliance)ApplianceHelper.getInstance().getById(_route.getAppliance_id());
		}		
		return _bus;
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
