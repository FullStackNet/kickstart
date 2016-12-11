package platform.util;

import java.util.Map;

import platform.defined.resource.Baseresult;
import platform.resource.BaseResource;
import platform.resource.result;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;



public class Json {
	public static String resourcetoString(BaseResource resource) {
		Gson gson = new Gson();
		return gson.toJson(resource);
	}
	
	public static String objecttoString(Object resource) {
		Gson gson = new Gson();
		return gson.toJson(resource);
	}

	public static String resourcetoString(BaseResource[] resources) {
		Gson gson = new Gson();
		return gson.toJson(resources);
	}
	
	/*
	 * {
		 query:'Li',
		 suggestions:['Liberia','Libyan Arab Jamahiriya','Liechtenstein','Lithuania'],
		 data:['LR','LY','LI','LT']
		}
	 */
	/*public static String resulttoAutoCompleteString(String queryValue,Resource[] resources) {
		String str = "";
		str = "{query:'"+queryValue+"', suggestions:[";
		boolean first = true;
		for(Resource resource : resources) {
			if (!first) {
				str = str+",";
			}
			first = false;
			str = str + "'"+resource.getName()+"'";
		}
	
		str = str +"],";
		str = str+" data:[";
		
		first = true;
		for(Resource resource : resources) {
			if (!first) {
				str = str+",";
			}
			first = false;
			str = str + "'"+resource.getId()+"'";
		}
		str = str +"]";
		
		str = str +"}";	
		return str;
	}*/
	
	public static String resulttoAutoCompleteString(String queryValue,BaseResource[] resources) {
		String str = "";
		//str = "{\"source\":[";
		str = "[";
		boolean first = true;
		for(BaseResource resource : resources) {
			if (!first) {
				str = str+",";
			}
			first = false;
			str = str+resourcetoString(resource);
			//str = str+"\""+resource.getName()+"\"";
		}
		str = str +"]";
		
		//str = str +"}";	
		return str;
	}
	
	public static String resulttoString(result result) {
		Gson gson = new Gson();
		return gson.toJson(result);
	}
	
	public static String maptoString(Map<String, String> map) {
		Gson gson = new Gson();
		return gson.toJson(map);
	}
	
	public static BaseResource stringToResource(String jsonText, String className) throws ApplicationException {
		try {
			Gson gson = new Gson();
			return (BaseResource)gson.fromJson(InputValidator.escape(jsonText), Class.forName(className));
		} catch(Exception e) {
			System.out.println(jsonText);
			e.printStackTrace();
			throw new ApplicationException(ExceptionSeverity.ERROR, e.getMessage());
		}
	}
	
	public static <T> T stringToObject(String jsonText, Class<T> className) throws ApplicationException {
		try {
			Gson gson = new Gson();
			return gson.fromJson(jsonText, className);
		} catch(Exception e) {
			throw new ApplicationException(ExceptionSeverity.ERROR, e.getMessage());
		}
	}

	public static Map<String, String> jsonToMap (String json) {
	    Gson gson = new Gson();
	    Map<String, String> map = gson.fromJson(json, new TypeToken<Map<String, String>>() {}.getType());
	    return map;
	}
	
	public static BaseResource stringToResource(String jsonText, Class<?> c) throws ApplicationException {
		
		try {
			Gson gson = new Gson();
			return (BaseResource)gson.fromJson(jsonText, c);
		} catch(Exception e) {
			e.printStackTrace();
			throw new ApplicationException(ExceptionSeverity.ERROR, e.getMessage());
		}
	}
	
	public static result stringToResult(String jsonText, Class<?> c) throws ApplicationException {
		try {
			Gson gson = new Gson();
			return (result)gson.fromJson(jsonText, c);
		} catch(Exception e) {
			e.printStackTrace();
			throw new ApplicationException(ExceptionSeverity.ERROR, e.getMessage());
		}
	}
	
	public static Baseresult stringToBaseResult(String jsonText, Class<?> c) throws ApplicationException {
		try {
			Gson gson = new Gson();
			return (Baseresult)gson.fromJson(jsonText, c);
		} catch(Exception e) {
			e.printStackTrace();
			throw new ApplicationException(ExceptionSeverity.ERROR, e.getMessage());
		}
	}
}