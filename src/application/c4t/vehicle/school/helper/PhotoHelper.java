package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.photo;


public class PhotoHelper extends BaseHelper {
	PhotoHelper() {
		super(new photo());
		// TODO Auto-generated constructor stub
	}
	private static PhotoHelper instance;
	
	public static PhotoHelper getInstance() {
		if (instance == null)
			instance = new PhotoHelper();
		return instance;
	}
	
	public BaseResource[] getPhotos(String parentId) {
		Expression e = new Expression(photo.FIELD_COLLECTION_ID, REL_OP.EQ, parentId);
		return getByExpression(e);
	}
	
	public BaseResource[] getPhotos(String[] parentIds) {
		Expression e = new Expression(photo.FIELD_COLLECTION_ID, REL_OP.IN, parentIds);
		return getByExpression(e);
	}
	
}
