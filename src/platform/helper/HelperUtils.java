package platform.helper;

import java.util.ArrayList;
import java.util.Map;

import platform.resource.BaseResource;
import platform.util.Util;

public class HelperUtils {
	
	public static BaseResource[] convertList2Array(ArrayList<BaseResource> list) {
		if (Util.isEmpty(list))
			return null;
		BaseResource[] resources = new BaseResource[list.size()];
		for(int i=0;i < list.size(); i++) {
			resources[i] = list.get(i);
		}
		return resources;
	}

	public static ArrayList<BaseResource> convertArray2List(BaseResource[] resources) {
		ArrayList<BaseResource> list = new ArrayList<BaseResource>();
		if (Util.isEmpty(resources))
			return null;
		for(int i=0;i < resources.length; i++) {
			list.add( resources[i]);
		}
		return list;
	}

	public static String[] convertMap2IdArray(Map<String, Object> map) {
		String[] ids = new String[map.size()];
		int count = 0;
		for (Map.Entry<String, Object> entry : map.entrySet()) {
			ids[count] = entry.getKey();
			count++;
		}
		return ids;
	}
	
	public static String[] convertResource2IdArray(BaseResource[] resources) {
		String[] ids = new String[resources.length];
		int count = 0;
		for (BaseResource resource : resources) {
			ids[count] = resource.getId();
			count++;
		}
		return ids;
	}
}
