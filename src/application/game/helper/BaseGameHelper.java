package application.game.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.db.Expression;
import platform.db.JoinField;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.helper.HelperFactory;
import platform.helper.LocationHelper;
import platform.helper.User_mapHelper;
import platform.resource.BaseResource;
import platform.resource.sms_daily_analysis;
import platform.util.ApplicationException;

public class BaseGameHelper extends BaseHelper {

	public BaseGameHelper(BaseResource resource) {
		super(resource);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Map<String, Object>> getForCenter(String userId,String[] order) {
		String[] locationIds = User_mapHelper.getInstance().getLocationIds(userId);
		try {
			return  getForSchools(locationIds,new String[]{sms_daily_analysis.FIELD_DATE});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ArrayList<Map<String, Object>>();
	}



	public ArrayList<Map<String, Object>> getListMapByUserId(String userId,ArrayList<JoinField> joinFields, String[] order) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		String[] locationIds = User_mapHelper.getInstance().getLocationIds(userId);
		Expression e = new Expression("location_id", REL_OP.IN, locationIds);
		try {
			list =  getByJoining(e,joinFields,order);
		} catch (ApplicationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return list;
	}

	public BaseResource[] getByUserId(String userId, String[] order) {
		String[] locationIds = User_mapHelper.getInstance().getLocationIds(userId);
		Expression e = new Expression("location_id", REL_OP.IN, locationIds);
		return getByExpression(e,order);
	}
	
	public ArrayList<Map<String, Object>> getByListMapUserIdWithLocationName(String userId, String[] order) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		HelperFactory.getInstance().register(LocationHelper.getInstance());
		HelperFactory.getInstance().register(this);
		ArrayList<JoinField> joinList = new ArrayList<>();
		JoinField jfield = new JoinField("location", "location_id", "location_name");
		joinList.add(jfield);
		String[] locationIds = User_mapHelper.getInstance().getLocationIds(userId);
		Expression e = new Expression("location_id", REL_OP.IN, locationIds);
		try {
			list =  getByJoining(e,joinList,order);
			return list;
		} catch (ApplicationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return list;
		
	}
}
