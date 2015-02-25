package platform.webservice.ui.definition;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.util.Util;

public class DataSource {
	public static String EXPRESSION = "EXPRESSION";
	public static String SQL = "SQL";
	public static String HELPER = "HELPER";
	public static String IDVALUE = "IDVALUE";
	public static String STRINGARRAY = "STRINGSRRAY";
	public static String LISTMAP = "LISTMAP";
	String type;
	String sql;
	platform.db.Expression expression;
	BaseHelper helper;
	IdValue[] values;
	String keyField;
	String valueField;
	String[] valueFields;
	String[] stringArrray;
	ArrayList<Map<String, Object>> listMap;
	ArrayList<Map<String, Object>> additionBeforeOption;
	ArrayList<Map<String, Object>> additionAfterOption;

	public DataSource(String keyField, String valueField , BaseHelper helper) {
		super();
		this.type = HELPER;
		this.helper = helper;
		this.keyField = keyField;
		this.valueField = valueField;
	}

	public DataSource(String keyField, String[] valueFields , BaseHelper helper) {
		super();
		this.type = HELPER;
		this.helper = helper;
		this.keyField = keyField;
		this.valueFields = valueFields;
	}
	
	public DataSource(String keyField, String[] valueFields , BaseResource[] resources) {
		super();
		this.type = LISTMAP;
		listMap = new ArrayList<Map<String, Object>>();
		if (!Util.isEmpty(resources)) {
			for(int i=0; i < resources.length; i++) {
				listMap.add(resources[i].convertResourceToMap());
			}
		}
		this.keyField = keyField;
		this.valueFields = valueFields;
	}
	
	public DataSource(String keyField, String valueField , BaseResource[] resources) {
		super();
		this.type = LISTMAP;
		listMap = new ArrayList<Map<String, Object>>();
		if (!Util.isEmpty(resources)) {
			for(int i=0; i < resources.length; i++) {
				listMap.add(resources[i].convertResourceToMap());
			}
		}
		this.keyField = keyField;
		this.valueField = valueField;
	}
	
	public int getAdditionalBeforeEntryCount() {
		if (additionBeforeOption != null) {
			return additionBeforeOption.size();
		} 
		return 0;
	}
	
	public int getAdditionalAfterEntryCount() {
		if (additionAfterOption != null) {
			return additionAfterOption.size();
		} 
		return 0;
	}

	public DataSource(String keyField, String valueField , ArrayList<Map<String, Object>> listMap) {
		super();
		this.type = LISTMAP;
		this.listMap = listMap;
		this.keyField = keyField;
		this.valueField = valueField;
	}

	public DataSource(String keyField, String[] valueFields , ArrayList<Map<String, Object>> listMap) {
		super();
		this.type = LISTMAP;
		this.listMap = listMap;
		this.keyField = keyField;
		this.valueFields = valueFields;
	}
	
	public DataSource(String keyField, String valueField , BaseHelper helper , String sql) {
		super();
		this.type = SQL;
		this.helper = helper;
		this.keyField = keyField;
		this.valueField = valueField;
		this.sql = sql;
	}

	public DataSource(String keyField, String[] valueFields , BaseHelper helper , platform.db.Expression expression) {
		super();
		this.type = EXPRESSION;
		this.helper = helper;
		this.keyField = keyField;
		this.valueFields = valueFields;
		this.expression = expression;
	}
	
	public DataSource(String keyField, String valueField , BaseHelper helper , platform.db.Expression expression) {
		super();
		this.type = EXPRESSION;
		this.helper = helper;
		this.keyField = keyField;
		this.valueField = valueField;
		this.expression = expression;
	}

	public DataSource(String[] values) {
		super();
		this.type = STRINGARRAY;
		this.stringArrray = values;
	}

	public DataSource(IdValue[] values) {
		super();
		this.type = IDVALUE;
		this.values = values;
	}

	public void addAdditionalBeforeOption(Map<String,Object> option) {
		if (additionBeforeOption == null) {
			additionBeforeOption = new ArrayList<Map<String,Object>>();
		}
		additionBeforeOption.add(option);
	}

	public ArrayList<IdValue> getData() {
		ArrayList<IdValue> data = new ArrayList<IdValue>();
		if (type.equals(IDVALUE)) {
			for(int i=0 ;i < values.length ; i++) {
				data.add(values[i]);
			}
		} else if (type.equals(STRINGARRAY)) {
			for(int i=0 ;i < stringArrray.length ; i++) {
				data.add(new IdValue(stringArrray[i], stringArrray[i]));
			}
		} else if(type.equals(EXPRESSION)) {
			List<Map<String, Object>> list = helper.getMapByExpression(expression);
			for(int i=0 ;i < list.size() ; i++) {
				String keyValue = (String) list.get(i).get(keyField);
				Object object = list.get(i).get(valueField);
				IdValue value = new IdValue(keyValue, object);
				data.add(value);
			}
		} else if(type.equals(HELPER)) {
			List<Map<String, Object>> list = null;
			if (valueField != null) {
				list = helper.getAllMap(new String[]{valueField});
			} else {
				list = helper.getAllMap(valueFields);
			}
			if (list == null) 
				list = new ArrayList<Map<String, Object>>();
			if (additionBeforeOption != null) {
				for(int i=0 ;i < additionBeforeOption.size() ; i++) {
					String keyValue = (String) additionBeforeOption.get(i).get(keyField);
					Object object = additionBeforeOption.get(i).get(valueField);
					
					IdValue value = new IdValue(keyValue, object);
					data.add(value);
				}
			}
			for(int i=0 ;i < list.size() ; i++) {
				String keyValue = (String) list.get(i).get(keyField);
				Object object= "";
				if (valueField != null) {
					object = list.get(i).get(valueField);
				} else if (valueFields != null) {
					String str = "";
					for(int j=0;j < valueFields.length ; j++) {
						if (list.get(i).get(valueFields[j]) != null) {
							if (!Util.isEmpty(str)) {
								str = str + ",";
							}
							str = str +list.get(i).get(valueFields[j]);
						}
					}
					object = str;
				}
				IdValue value = new IdValue(keyValue, object);
				data.add(value);
			}
		} else if(type.equals(LISTMAP)) {
			if (listMap != null) {
				if (additionBeforeOption != null) {
					for(int i=0 ;i < additionBeforeOption.size() ; i++) {
						String keyValue = (String) additionBeforeOption.get(i).get(keyField);
						Object object = additionBeforeOption.get(i).get(valueField);
						IdValue value = new IdValue(keyValue, object);
						data.add(value);
					}
				}
				for(int i=0 ;i < listMap.size() ; i++) {
					Map<String, Object> map = listMap.get(i);
					String keyValue = (String) map.get(keyField);
					Object object= "";
					if (valueField != null) {
						object = map.get(valueField);
					} else if (valueFields != null) {
						String str = "";
						for(int j=0;j < valueFields.length ; j++) {
							if (!Util.isEmpty(str)) {
								str = str + ",";
							}
							if (map.get(valueFields[j]) != null) {
								str = str +map.get(valueFields[j]);
							}
						}
						object = str;
					}
					IdValue value = new IdValue(keyValue, object);
					data.add(value);
				}
			}
		} 
		return data;
	}

	public IdValue getSelectedObject(Object id) {
		ArrayList<IdValue> data  = getData();
		for(int i = 0 ; i < data.size() ; i++) {
			if (data.get(i).getId().equals(id)) {
				return data.get(i);
			}
		}
		return null;
	}
}
