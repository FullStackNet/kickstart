package platform.helper;

import java.util.ArrayList;
import java.util.HashMap;
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

	public static ArrayList<Map<String,Object>> convertArray2ListMap(BaseResource[] resources) {
		ArrayList<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		if (Util.isEmpty(resources))
			return list;
		for(int i=0;i < resources.length; i++) {
			if (resources[i] == null)
				continue;
			list.add( resources[i].convertResourceToMap());
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
	
	public static Map<Object, BaseResource>  convertArray2Map(BaseResource[] resources,String key) {
		Map<Object, BaseResource> map = new HashMap<Object, BaseResource>();
		if (resources == null) return map;
		if (resources.length == 0) return map;
		for(BaseResource resource : resources) {
			Map<String, Object>   resourceMap = resource.convertResourceToMap();
			Object keyValue = resourceMap.get(key);
			if (keyValue == null) continue;
			map.put(keyValue, resource);
		}
		return map;
	}
	
	
	public static BaseResource[] convertResource2Array(BaseResource resource) {
		BaseResource[] resources = new BaseResource[1];
		resources[0] = resource;
		return resources;
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
	public static String[] convertResource2IdArray(BaseResource[] resources,String field_name) {
		ArrayList<String> list = new ArrayList<>();
		for (BaseResource resource : resources) {
			Map<String, Object> map = resource.convertResourceToMap();
			if (map.get(field_name) != null) {
				list.add(map.get(field_name).toString());
			}
		}
		if (list.size() == 0)
			return null;
		return list.toArray(new String[list.size()]);
	}
}
