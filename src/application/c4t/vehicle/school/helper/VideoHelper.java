package application.c4t.vehicle.school.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import application.c4t.vehicle.school.resource.video;


public class VideoHelper extends BaseHelper {
	VideoHelper() {
		super(new video());
		// TODO Auto-generated constructor stub
	}
	private static VideoHelper instance;
	
	public static VideoHelper getInstance() {
		if (instance == null)
			instance = new VideoHelper();
		return instance;
	}
	
	public BaseResource[] getVideos(String parentId) {
		Expression e = new Expression(video.FIELD_COLLECTION_ID, REL_OP.EQ, parentId);
		return getByExpression(e);
	}
	
	public BaseResource[] getVideos(String[] parentIds) {
		Expression e = new Expression(video.FIELD_COLLECTION_ID, REL_OP.IN, parentIds);
		return getByExpression(e);
	}
	
}
