package application.c4t.vehicle.school.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.db.Expression;
import platform.db.JoinField;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.helper.HelperFactory;
import platform.util.ApplicationException;
import application.c4t.vehicle.school.resource.photo_collection;


public class Photo_collectionHelper extends BaseHelper {
	
	Photo_collectionHelper() {
		super(new photo_collection());
		// TODO Auto-generated constructor stub
	}
	private static Photo_collectionHelper instance;
	
	public static Photo_collectionHelper getInstance() {
		if (instance == null)
			instance = new Photo_collectionHelper();
		return instance;
	}
	
	public void addSchool(String photo_collectionId,String schoolId) {
		photo_collection _photo_collection = new photo_collection();
		_photo_collection.setId(photo_collectionId);
		_photo_collection.addSchools(schoolId);
		try {
			Photo_collectionHelper.getInstance().update(_photo_collection);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addSchool(String photo_collectionId,String[] schoolIds) {
		photo_collection _photo_collection = new photo_collection();
		_photo_collection.setId(photo_collectionId);
		for(int i=0 ; i < schoolIds.length; i++) {
			_photo_collection.addSchools(schoolIds[i]);
		}
		try {
			Photo_collectionHelper.getInstance().update(_photo_collection);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void removeSchool(String photo_collectionId,String schoolId) {
		photo_collection _photo_collection = new photo_collection();
		_photo_collection.setId(photo_collectionId);
		_photo_collection.addSchools(schoolId);
		try {
			Photo_collectionHelper.getInstance().unset(_photo_collection);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Map<String, Object>> getForSchools(String[] schools,String[] order,long fromtime,long totime) throws ApplicationException  {
		try {
			HelperFactory.getInstance().register(SchoolHelper.getInstance());
			HelperFactory.getInstance().register(Photo_collectionHelper.getInstance());
			ArrayList<JoinField> list = new ArrayList<JoinField>();
			JoinField field = new JoinField("school", "school_id", "school_name");
			list.add(field);
			
			Expression e2 = new Expression(photo_collection.FIELD_SCHOOL_ID, REL_OP.IN, schools);
			Expression e1 = new Expression(photo_collection.FIELD_SCHOOLS, REL_OP.EACH_ELEMENT_IN, schools);
			Expression e3 = new Expression(e1,LOG_OP.OR, e2);

			Expression e4 = new Expression(photo_collection.FIELD_ACTIVITY_DATE, REL_OP.GTEQ, fromtime);
			Expression e5 = new Expression(photo_collection.FIELD_ACTIVITY_DATE, REL_OP.LT, totime);
			
			Expression e6 = new Expression(e4, LOG_OP.AND, e5);
			Expression e = new Expression(e3, LOG_OP.AND, e6);
			return getByJoining(e,list,order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ArrayList<Map<String, Object>>();		
	}
}
