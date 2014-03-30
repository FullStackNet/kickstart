package platform.db;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import platform.defined.DBNameEnum;
import platform.util.Field;

public class ResourceMetaData {
	private String name;
	private String cluster;
	private String clusterType;
	private String tableName;
	private byte dbType;
	private ArrayList<String[]> indexes;
	
	

	private String comment = "";
	private boolean checkBeforeAdd; // If true, duplicate add will be blocked
	private boolean checkBeforeUpdate; // If true, update won't create
										// non-existing resource
	private boolean cacheable; // If true, base model class, will always make
								// sure that this resource is cached.
	private Map<String, Field> fields;
	private String[][] uniqueFieldNames;

	public ResourceMetaData(String name) {
		this.name = name;
		this.fields = new LinkedHashMap<String, Field>();
		indexes = new ArrayList<String[]>();
		this.clusterType = "REPLICATED";
		this.cluster = DBNameEnum.DB_CONFIG.toString();
		this.dbType = DBConsts.DB_TYPE_MONGODB;
	}

	public void addIndex(String[] index) {
		indexes.add(index);
	}
	
	public ArrayList<String[]> getIndexList() {
		return indexes;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public boolean checkBeforeAdd() {
		return checkBeforeAdd;
	}

	public void setCheckBeforeAdd(boolean checkBeforeAdd) {
		this.checkBeforeAdd = checkBeforeAdd;
	}

	public boolean checkBeforeUpdate() {
		return checkBeforeUpdate;
	}

	public void setCheckBeforeUpdate(boolean checkBeforeUpdate) {
		this.checkBeforeUpdate = checkBeforeUpdate;
	}

	public Map<String, Field> getFields() {
		return fields;
	}

	public Field[] getFieldsArray() {
		Field[] fieldsArray = new Field[fields.size()];
		int i = 0;
		for(Map.Entry<String, Field> entry : fields.entrySet()) {
			fieldsArray[i] = entry.getValue();
			i++;
		}
		return fieldsArray;
	}

	
	public void addField(Field field) {
		this.fields.put(field.getName(), field);
	}

	public Field getField(String _name) {
		return this.fields.get(_name);
	}
	public String[][] getUniqueFieldNames() {
		return uniqueFieldNames;
	}

	public void setUniqueFieldNames(String[][] uniqueFieldNames) {
		this.uniqueFieldNames = uniqueFieldNames;
	}

	public boolean isCacheable() {
		return cacheable;
	}

	public String getTableName() {
		if (tableName != null)
			return tableName;
		return name;
	}
	
	public void setCacheable(boolean cacheable) {
		this.cacheable = cacheable;
	}
	public byte getDbType() {
		return dbType;
	}

	public void setDbType(byte dbType) {
		this.dbType = dbType;
	}
	
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getCluster() {
		return cluster;
	}

	public void setCluster(String cluster) {
		this.cluster = cluster;
	}

	public String getClusterType() {
		return clusterType;
	}

	public void setClusterType(String clusterType) {
		this.clusterType = clusterType;
	}
}