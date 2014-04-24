package application.c4t.vehicle.school.helper;

import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.resource.user;
import platform.util.ApplicationException;
import application.c4t.vehicle.school.resource.school_customer_map;


public class School_customer_mapHelper extends BaseHelper {
	
	School_customer_mapHelper() {
		super(new school_customer_map());
		// TODO Auto-generated constructor stub
	}
	private static School_customer_mapHelper instance;
	
	public static School_customer_mapHelper getInstance() {
		if (instance == null)
			instance = new School_customer_mapHelper();
		return instance;
	}
	
	public void addSchool(String userId,String schoolId) throws ApplicationException {
		if (schoolId == null) return;
		if (userId == null) return;
		school_customer_map _map = new school_customer_map();
		_map.setId(userId);
		_map.addSchools(schoolId);
		AddOrUpdate(_map);
	}
	
	public BaseResource[] getSchool(String customerId) {
		school_customer_map _map = (school_customer_map)getById(customerId);
		if ((_map == null) || (_map.getSchools() == null))
			return null;
		return SchoolHelper.getInstance().getById(_map.getSchools().toArray(new String[_map.getSchools().size()]),
				new String[]{user.FIELD_NAME});
	}
	
}
