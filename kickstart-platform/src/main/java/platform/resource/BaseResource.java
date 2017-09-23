/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.resource;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang.ArrayUtils;

import platform.db.ResourceMetaData;
import platform.util.ApplicationException;
import platform.util.Field;
import platform.util.Util;

@SuppressWarnings("serial")
public abstract class BaseResource  implements Cloneable, Serializable {

	//MetaData about the resource (name, fields, constraints etc)
	public abstract ResourceMetaData getMetaData();

	public  String getName() {
		return null;
	}
	
	public  String getId() {
		return null;
	}
	
	public  void setId(String Id) {
		
	}
	
	//Converts self into a type-safe Map (Ex: A Long field will be stored as Long instead of String or others. Hence direct type-casting can be done instead of converting)
	//Only non-null values will be stored in the map
	public abstract Map<String, Object> convertResourceToMap();
	
	//Same as above method but does validation like required, min, max etc
	public abstract Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException;
	
	//Converts own primary keys & values (alone) into a type-safe Map
	//Only non-null values will be stored in the map
	public abstract Map<String, Object> convertResourceToPrimaryMap();
	
	//Populates self from a type-safe Map (faster but each Object's type should be same as field type. Objects from map are directly type-casted to corresponding fields)
	public abstract void convertMapToResource(Map<String, Object> map);
	
	//Populates self from a type-unsafe Map (slower as each Object is null-checked, converted into String and then to wrapper object)
	public abstract void convertTypeUnsafeMapToResource(Map<String, Object> map);
	
	//Populates own primary keys & values (alone) from a type-safe Map
	public abstract void convertPrimaryMapToResource(Map<String, Object> map);
	
	public abstract String getCluster();
	public abstract String getClusterType();
	public  String getClusterKey() {
		return null;
	}
	
	public BaseResource() {
		
	}
	
	public abstract Class<?> getResultClass();
	
	public String getController() {
		return Util.getFirstLetterUpperCase(getMetaData().getName())+"Controller";
	}
	
	//Populates own primary keys & values (alone) from a type-unsafe Map
	public abstract void convertTypeUnsafePrimaryMapToResource(Map<String, Object> map);
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public void dump(int index) {
		StringBuilder tabs = new StringBuilder(index);
		for(int i = 0; i < index ; i++)
			tabs.append("\t");
		
		Map<String, Object> row = convertResourceToMap();
		Map<String, Field> fields = getMetaData().getFields();
		for(Entry<String, Field> entry : fields.entrySet()) {
			String fieldName = entry.getValue().getName();
    		System.out.println(tabs + fieldName + ": " + row.get(fieldName)); 
		}
	}
	public void dumpNonEmpty(int index) {
		StringBuilder tabs = new StringBuilder(index);
		for(int i = 0; i < index ; i++)
			tabs.append("\t");

		Map<String, Object> row = convertResourceToMap();
		Map<String, Field> fields = getMetaData().getFields();
		for(Entry<String, Field> entry : fields.entrySet()) {
			String fieldName = entry.getValue().getName();
			Object _object = row.get(fieldName);
			if (_object != null) {
				System.out.println(tabs + fieldName + ": " + row.get(fieldName));
			}
		}
	}

	public String getDump(String sep) {
		StringBuffer buf = new StringBuffer();
		
		buf.append(getMetaData().getName());
		Map<String, Object> row = convertResourceToMap();
		Map<String, Field> fields = getMetaData().getFields();
		for(Entry<String, Field> entry : fields.entrySet()) {
			String fieldName = entry.getValue().getName();
			if (row.get(fieldName) != null) {
				buf.append(sep + fieldName + ": " + row.get(fieldName));
			}
		}
		return buf.toString();
	}

	public String dumpCounter(String sep) {
		StringBuffer buf = new StringBuffer();
		
		buf.append(getMetaData().getName());
		Map<String, Object> row = convertResourceToMap();
		Map<String, Field> fields = getMetaData().getFields();
		for(Entry<String, Field> entry : fields.entrySet()) {
			String fieldName = entry.getValue().getName();

			if (entry.getValue().isCounter() || entry.getValue().isPrimary())
				buf.append(sep + fieldName + ": " + row.get(fieldName));
		}
		
		return buf.toString();
	}

	public String toHTMLHeader() {
		StringBuilder header = new StringBuilder();
		Map<String, Field> fields = getMetaData().getFields();
		for(Entry<String, Field> entry : fields.entrySet()) {
			String fieldName = entry.getValue().getName();
    		header.append("<th>"+fieldName+"</th>"); 
		}
		return header.toString();
	}
	
	public String toHTMLHeader(Map<String, Object> fieldMap) {
		StringBuilder header = new StringBuilder();
		Map<String, Field> fields = getMetaData().getFields();
		for(Entry<String, Field> entry : fields.entrySet()) {
			String fieldName = entry.getValue().getName();
			if (fieldMap != null) {
				Object exists = fieldMap.get(fieldName);
				if (exists != null)
					header.append("<th>"+fieldName+"</th>");
			} else {
				header.append("<th>"+fieldName+"</th>");
			}
		}
		return header.toString();
	}
	

	
	
	public String toHTML(Map<String, Object> fieldMap,String rendertype) {
		StringBuilder html = new StringBuilder();
		Map<String, Object> row = convertResourceToMap();
		Map<String, Field> fields = getMetaData().getFields();
		if ((rendertype != null) && rendertype.equals("form")) {
			html = html.append("<form method=\"post\" action=\"/api/"+this.getMetaData().getName().toLowerCase()+"\">");
			html = html.append("<input type=\"hidden\" name=\"m16form\" value=\"yes\"/>");
		}
		for(Entry<String, Field> entry : fields.entrySet()) {
			String fieldName = entry.getValue().getName();
			if ((rendertype != null) && rendertype.equals("form")) {
    			html = html.append("<tr>");
    			html = html.append("<td>"+fieldName+"</td>");
    		}
			if (fieldMap != null) {
				Object exists = fieldMap.get(fieldName);
				if (exists != null) {
					String value;
					if (row.get(fieldName) == null)
						value = "";
					else {
						if(entry.getValue().isArray())
							value = ArrayUtils.toString(row.get(fieldName));
						else
							value = row.get(fieldName).toString();
					}
					if ((rendertype != null) && rendertype.equals("form") && !entry.getValue().isArray()) {
						
		    			html = html.append("<td><input name=\""+fieldName+"\" value=\""+value+"\" /></td>");
		    		} else {
		    			if (entry.getValue().isTime()) {
		    				if ((value != null) && (!value.equals(""))) {
						    	long timestamp = Long.parseLong(value);
			    				Date date = new Date(timestamp);
			    				html = html.append("<td>"+ date+"  ["+value+"]"+"</td>"); 
			    			} else {
			    				html = html.append("<td>&nbsp;</td>");
			    			}
		    			}	
		    			else 
		    				html = html.append("<td>"+value+"</td>"); 
		    		}
				}
			} else {
				String value = "";
				if (row.get(fieldName) != null) {
					if(entry.getValue().isArray())
						value = ArrayUtils.toString(row.get(fieldName));
					else
						value = row.get(fieldName).toString();
				}
				if ((rendertype != null) && rendertype.equals("form") && !entry.getValue().isArray()) {
	    			html = html.append("<td><input name=\""+fieldName+"\" value=\""+value+"\" /></td>");
	    		} else {
		    			if (entry.getValue().isTime()) {
		    				if ((value != null) && (!value.equals(""))) {
			    				long timestamp = Long.parseLong(value);
			    				Date date = new Date(timestamp);
			    				html = html.append("<td>"+ date +"  ["+value+"]"+"</td>");
			    			} else {
			    				html = html.append("<td>&nbsp;</td>");
				    				
			    			}
		    			} else {
		    				html = html.append("<td>"+value+"</td>");
		    			}
	    		}
	 		}
			if ((rendertype != null) && rendertype.equals("form")) {
    			html = html.append("</tr>");
    		}
			
		}
		if ((rendertype != null) && rendertype.equals("form")) {
			html = html.append("<tr><td><input type=\"submit\" value=\"Save\"></td></tr>");
			html = html.append("</form>");
		}
		return html.toString();
	}
}