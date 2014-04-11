package application.c4t.vehicle.helper;

import java.util.HashMap;
import java.util.Map;

import platform.helper.BaseHelper;
import platform.helper.UserHelper;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import application.c4t.vehicle.resource.stopage_map;

public class Stopage_mapHelper extends BaseHelper {
	public Stopage_mapHelper() {
		super(new stopage_map());
		// TODO Auto-generated constructor stub
	}
	
	private static Stopage_mapHelper instance;
	
	public static Stopage_mapHelper getInstance() {
		if (instance == null)
			instance = new Stopage_mapHelper();
		return instance;
	}
	
	public void addUser(String stopageId,String userId) throws ApplicationException {
		stopage_map _map = new stopage_map();
		_map.setId(stopageId);
		_map.addNotify_users(userId);
		AddOrUpdate(_map);
	}
	
	public void deleteUser(String stopageId,String userId) throws ApplicationException {
		stopage_map _map = new stopage_map();
		_map.setId(stopageId);
		_map.addNotify_users(userId);
		unset(_map);
	}
	
	public Map<String,BaseResource> getNotifyUsersMap(String stopageId) {
		Map<String,BaseResource> map = new HashMap<String,BaseResource>();
		stopage_map _map = (stopage_map)getById(stopageId);
		if ((_map == null) || (_map.getNotify_users() == null))
			return map;
		return UserHelper.getInstance().getMapById(_map.getNotify_users().toArray(new String[_map.getNotify_users().size()]));
	}
}
