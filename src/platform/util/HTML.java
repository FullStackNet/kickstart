package platform.util;
import java.util.HashMap;
import java.util.Map;

import platform.resource.BaseResource;
import platform.resource.result;

import com.google.gson.Gson;


public class HTML {
	public static String resourcetoString(BaseResource resource) {
		Gson gson = new Gson();
		return gson.toJson(resource);
	}
	
	private static String _resulttoString(result result,String fieldName,String rendertype) {
		Map<String, Object> map = null ;
		String[] argvalues = null;
		if (fieldName != null) {
			map = new HashMap<String, Object>();;
			argvalues = fieldName.split(",");
			for(String argval : argvalues) {
				map.put(argval,1);	
			}
		}
		BaseResource[] resources = result.getResource();
		if ((resources == null) || (resources.length == 0)) return "";
		StringBuilder html = new StringBuilder();
		html.append("<table border=\"1\">");
		if (rendertype == null) {
			html.append("<tr>");
			String header = resources[0].toHTMLHeader(map);
			html.append(header);
			html.append("</tr>");
		}
		
		for(BaseResource resource : resources) {
			html.append("<tr>");
			html.append(resource.toHTML(map,rendertype));
			html.append("</tr>");
		}	
		html.append("</table>");
		return html.toString();
	}
	
	public static String resulttoString(result result,String fieldName,String rendertype) {
			return _resulttoString(result,fieldName,rendertype);
	}
}