package application.c4t.vehicle.helper;

import java.util.ArrayList;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.util.Util;
import application.c4t.vehicle.resource.route_stopage;
import application.c4t.vehicle.resource.stopage;


public class StopageHelper extends BaseHelper {
	
	public StopageHelper() {
		super(new stopage());
		// TODO Auto-generated constructor stub
	}
	private static StopageHelper instance;
	
	public static StopageHelper getInstance() {
		if (instance == null)
			instance = new StopageHelper();
		return instance;
	}
	
	public BaseResource[] getStopages(String routeId) {
		BaseResource[] route_stopages;
		Expression expression = new Expression(route_stopage.FIELD_ROUTE_ID, REL_OP.EQ, routeId);
		route_stopages = Route_stopageHelper.getInstance().getByExpression(expression,new String[]{route_stopage.FIELD_STOPAGE_ORDER});
		if (Util.isEmpty(route_stopages))
			return null;
		ArrayList<stopage> list = new ArrayList<stopage>();
		for(int i=0; i < route_stopages.length; i++) {
			route_stopage _route_stopage = (route_stopage)route_stopages[i];
			stopage _stopage = (stopage)StopageHelper.getInstance().getById(_route_stopage.getStopage_id());
			if (_stopage != null)
				list.add(_stopage);
		}
		return list.toArray(new stopage[list.size()]);
	}
}
