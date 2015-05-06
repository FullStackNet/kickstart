package platform.helper;

import platform.resource.BaseResource;
import platform.resource.c4t_record_detail;


public class C4t_record_detailHelper extends BaseHelper {
	
	public C4t_record_detailHelper() {
		super(new c4t_record_detail());
		// TODO Auto-generated constructor stub
	}
	private static C4t_record_detailHelper instance;
	
	public static C4t_record_detailHelper getInstance() {
		if (instance == null)
			instance = new C4t_record_detailHelper();
		return instance;
	}	
	
	public BaseResource[] getByParentDetail(String parentId,String record_type,String[] order) {
		String[] ids = C4t_record_mapHelper.getInstance().getByRelationMap(parentId, record_type);
		return C4t_record_detailHelper.getInstance().getById(ids,order);
	}
}
