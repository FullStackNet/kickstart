package platform.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.place;


public class PlaceHelper extends BaseHelper {

	public PlaceHelper() {
		super(new place());
		// TODO Auto-generated constructor stub
	}
	
	private static PlaceHelper instance;

	public static PlaceHelper getInstance() {
		if (instance == null)
			instance = new PlaceHelper();
		return instance;
	}
	
	public BaseResource[] getByParentId(String parentId) {
		Expression e = new Expression(place.FIELD_PARENT_PLACE_ID, REL_OP.EQ, parentId);
		return getByExpression(e , new String[]{place.FIELD_NAME});
	}
}
