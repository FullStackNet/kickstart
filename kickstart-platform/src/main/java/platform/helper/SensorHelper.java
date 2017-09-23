package platform.helper;

import java.util.ArrayList;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.sensor;
import platform.util.Util;


public class SensorHelper extends BaseHelper {
	
	public SensorHelper() {
		super(new sensor());
		// TODO Auto-generated constructor stub
	}
	private static SensorHelper instance;
	
	public static SensorHelper getInstance() {
		if (instance == null)
			instance = new SensorHelper();
		return instance;
	}
	
	public ArrayList<sensor> getSensorByGatewayId(String gatewayId) {
		ArrayList<sensor> resultList = new ArrayList<sensor>();
		Expression e = new Expression(sensor.FIELD_GATEWAY_ID, REL_OP.EQ, gatewayId);
		BaseResource[] resources = getByExpression(e);
		if (!Util.isEmpty(resources)) {
			for(int i=0; i < resources.length ; i++) {
				resultList.add((sensor)resources[i]);
			}
		}
		return resultList;
	}
}
