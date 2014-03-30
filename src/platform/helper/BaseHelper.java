package platform.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import platform.db.DbConnection;
import platform.db.DbManager;
import platform.db.Expression;
import platform.db.JoinField;
import platform.log.ApplicationLogger;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Field;
import platform.util.Util;

public class BaseHelper {
	BaseResource resource;

	public BaseResource getResource() {
		return resource;
	}

	public void setResource(BaseResource resource) {
		this.resource = resource;
	}

	public BaseHelper(BaseResource resource) {
		this.resource = resource;
	}

	public void update(BaseResource _resource) throws ApplicationException {
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			connection.update(_resource);
		} catch(Exception e) {	
			e.printStackTrace();
			if (connection != null)
				connection.release();
			throw new ApplicationException(ExceptionSeverity.ERROR,e.getMessage());
		} finally {
			if (connection != null)
				connection.release();	
		}
	}

	
	public void incrementCounter(String id,String counterName, int incrementBy) throws ApplicationException {
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			BaseResource clonedResource = (BaseResource) this.resource.clone();
			clonedResource.setId(id);
			connection.incrementCounter(clonedResource, counterName, incrementBy);
		} catch(Exception e) {	
			e.printStackTrace();
			if (connection != null)
				connection.release();
			throw new ApplicationException(ExceptionSeverity.ERROR,e.getMessage());
		} finally {
			if (connection != null)
				connection.release();	
		}
	}
	
	public void decrementCounter(String id,String counterName, int decrementBy) throws ApplicationException {
		DbConnection connection = null;
		try {
			BaseResource clonedResource = (BaseResource) this.resource.clone();
			clonedResource.setId(id);
			connection = DbManager.getInstance().getConnection(this.getResource());
			connection.incrementCounter(clonedResource, counterName, (-1)*decrementBy);
		} catch(Exception e) {	
			e.printStackTrace();
			if (connection != null)
				connection.release();
			throw new ApplicationException(ExceptionSeverity.ERROR,e.getMessage());
		} finally {
			if (connection != null)
				connection.release();	
		}
	}
	public void unset(BaseResource _resource) throws ApplicationException {
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			connection.unset(_resource);
		} catch(Exception e) {	
			e.printStackTrace();
			if (connection != null)
				connection.release();
			throw new ApplicationException(ExceptionSeverity.ERROR,e.getMessage());
		} finally {
			if (connection != null)
				connection.release();	
		}
	}

	public void updateCurrentTime(BaseResource _resource, String fieldName) throws ApplicationException {
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			connection.updateCurrentTime(_resource,fieldName);
		} catch(Exception e) {	
			e.printStackTrace();
			if (connection != null)
				connection.release();
			throw new ApplicationException(ExceptionSeverity.ERROR,e.getMessage());
		} finally {
			if (connection != null)
				connection.release();
		}
	}
	public void add(BaseResource _resource) throws ApplicationException {
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			connection.add(_resource);
		} catch(ApplicationException e) {	
			e.printStackTrace();
			if (connection != null)
				connection.release();
			throw e;
		} catch(Exception e) {	
			e.printStackTrace();
			if (connection != null)
				connection.release();
			throw new ApplicationException(ExceptionSeverity.ERROR, "Error in Adding" + e.getMessage());
		} finally {
			if (connection != null)
				connection.release();	
		}
	}

	public void createTable() throws ApplicationException {
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			connection.createTable(this.getResource().getMetaData());
		} catch(Exception e) {	
			e.printStackTrace();
			if (connection != null)
				connection.release();
			throw new ApplicationException(ExceptionSeverity.ERROR, "Error in Creating Table" + e.getMessage());
		} finally {
			if (connection != null)
				connection.release();	
		}
	}

	public void createDistributionKey(String[] fieldNames) throws ApplicationException {
		DbConnection connection = null;
		try {
			BaseResource clonedResource = (BaseResource) this.resource.clone();
			connection = DbManager.getInstance().getConnection(clonedResource);
			connection.createDistributionKey(clonedResource.getMetaData(),fieldNames);
		} catch(Exception e) {	
			e.printStackTrace();
			if (connection != null)
				connection.release();
			throw new ApplicationException(ExceptionSeverity.ERROR, "Error in Creating Table" + e.getMessage());
		} finally {
			if (connection != null)
				connection.release();	
		}
	}
	public void createDistributionKey() throws ApplicationException {
		createDistributionKey(new String[]{"id"});
	}
	public void createIndex(String[] fieldNames) throws ApplicationException {
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			connection.createIndex(this.getResource().getMetaData(),fieldNames);
		} catch(Exception e) {	
			e.printStackTrace();
			if (connection != null)
				connection.release();
			throw new ApplicationException(ExceptionSeverity.ERROR, "Error in Creating Table" + e.getMessage());
		} finally {
			if (connection != null)
				connection.release();	
		}
	}
	
	public void createIndexes() throws ApplicationException {
		try {
			BaseResource clonedResource = (BaseResource) this.resource.clone();
			Field[] fields = clonedResource.getMetaData().getFieldsArray();
			try {
				createIndex(new String[]{"id"});
			} catch (ApplicationException e) {
				e.printStackTrace();
			}
			
			for(Field field : fields) {
				if (field.isIndexed()) {
					try {
					createIndex(new String[]{field.getName()});
					} catch(ApplicationException e) {
						e.printStackTrace();
					}
				}
			}
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public BaseResource[] getByExpression(Expression expression) {
		BaseResource[] resources = null;
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			List<Map<String, Object>> rows = connection.getByExpression(resource.getMetaData(),expression);
			resources = new BaseResource[rows.size()];
			int i = 0;
			for(Map<String, Object> row : rows) {
				BaseResource clonedResource = (BaseResource) this.resource.clone();
				clonedResource.convertMapToResource(row);
				resources[i++] = clonedResource;
			}

		} catch(Exception e) {	
			e.printStackTrace();
		} finally {
			if (connection != null)
				connection.release();
		}
		return resources;
	}

	public List<Map<String, Object>> getMapByExpression(Expression expression) {
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			return connection.getByExpression(resource.getMetaData(),expression);
		} catch(Exception e) {	
			e.printStackTrace();
		} finally {
			if (connection != null)
				connection.release();
		}
		return null;
	}

	public BaseResource[] getAll() {
		BaseResource[] resources = null;
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			List<Map<String, Object>> rows = connection.getAll(resource.getMetaData());
			resources = new BaseResource[rows.size()];
			int i = 0;
			for(Map<String, Object> row : rows) {
				BaseResource clonedResource = (BaseResource) this.resource.clone();
				clonedResource.convertMapToResource(row);
				resources[i++] = clonedResource;
			}

		} catch(Exception e) {	
			e.printStackTrace();
		} finally {
			if (connection != null)
				connection.release();
		}
		return resources;
	}

	public List<Map<String, Object>> getAllMap() {
		DbConnection connection = null;
		List<Map<String, Object>> rows = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			rows = connection.getAll(resource.getMetaData());
		} catch(Exception e) {	
			e.printStackTrace();
		} finally {
			if (connection != null)
				connection.release();
		}
		return rows;
	}

	public void AddOrUpdate(BaseResource rsc) throws ApplicationException {
		String id = rsc.getId();
		BaseResource getResoucre = getById(id);
		if (getResoucre == null) {
			add(rsc);
		} else {
			update(rsc);
		}
	}

	public BaseResource[] getById(String[] ids,String[] orderBy) {
		ArrayList<BaseResource> list = getListById(ids, orderBy);
		return  convertList2Array(list);
	}
	
	public ArrayList<BaseResource> getListById(String[] ids,String[] orderby) {
		return getListById(ids, orderby, null);
	}
	
	public BaseResource[] getArrayById(String[] ids,String[] orderby) {
		return getArrayById(ids, orderby, null);
	}

		
	public BaseResource[] getArrayById(String[] ids,String[] orderby, Expression expression) {
		ArrayList<BaseResource> list = getListById(ids, orderby, expression);
		return convertList2Array(list);
	}
	
	public ArrayList<BaseResource> getListById(String[] ids,String[] orderby, Expression expression) {
		BaseResource clonedResource = null;
		DbConnection connection = null;
		ArrayList<BaseResource> list = new ArrayList<BaseResource>();
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			ArrayList<Map<String, Object>> rows = (ArrayList<Map<String, Object>>) connection.getById(resource.getMetaData(),ids, orderby, expression);
			if (!Util.isEmpty(rows)) {
				for(int i=0;i < rows.size(); i++) {
					clonedResource = (BaseResource) this.resource.clone();
					clonedResource.convertMapToResource(rows.get(i));
					list.add(clonedResource);
				}
			}
		} catch(Exception e) {	
			e.printStackTrace();
		} finally {
			if (connection != null)
				connection.release();
		}
		return list;
	}
	public ArrayList<Map<String, Object>> getListMapById(String[] ids,String[] orderBy) {
		return getListMapById(ids, orderBy, null);
	}
	
	public ArrayList<Map<String, Object>> getListMapById(String[] ids,String[] orderBy, Expression expression) {
		DbConnection connection = null;
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			list = (ArrayList<Map<String, Object>>) connection.getById(resource.getMetaData(),ids,orderBy, expression);
		} catch(Exception e) {	
			e.printStackTrace();
		} finally {
			if (connection != null)
				connection.release();
		}
		return list;
	}

	public ArrayList<Map<String, Object>> getAllListMap() {
		DbConnection connection = null;
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			list = (ArrayList<Map<String, Object>>) connection.getAll(resource.getMetaData());
		} catch(Exception e) {	
			e.printStackTrace();
		} finally {
			if (connection != null)
				connection.release();
		}
		return list;
	}
	public Map<String,Map<String, Object>>  getMapMapById(String[] ids, String[] orderBy) {
		return getMapMapById(ids, orderBy, null);
	}
	public Map<String,Map<String, Object>>  getMapMapById(String[] ids, String[] orderBy, Expression expression) {
		DbConnection connection = null;
		Map<String,Map<String, Object>> rows = new HashMap<String,Map<String, Object>>();
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			ArrayList<Map<String, Object>> list = (ArrayList<Map<String, Object>>) connection.getById(resource.getMetaData(),ids, orderBy, expression);
			for(int i=0; i < list.size(); i++) {
				Map<String, Object> row = list.get(i);
				rows.put(row.get("id").toString(), row);
			}
		} catch(Exception e) {	
			e.printStackTrace();
		} finally {
			if (connection != null)
				connection.release();
		}
		return rows;
	}

	public ArrayList<Map<String, Object>> getByJoining(String id,ArrayList<JoinField> joinFields, String[] orderBy) {
		return getByJoining(new String[]{id}, joinFields,orderBy);
	}

	public ArrayList<Map<String, Object>> getByJoining(String[] ids,ArrayList<JoinField> joinFields, String[] orderBy) {
		ArrayList<Map<String, Object>> resourceList = new ArrayList<Map<String, Object>>();
		if (ids == null) return resourceList;
		BaseHelper masterHelper = HelperFactory.getInstance().getHelper(resource.getMetaData().getName());
		resourceList = masterHelper.getListMapById(ids, orderBy);
		Map<String, Map<String, Object>> map = new HashMap<String, Map<String, Object>>();
		for(Map<String, Object> resource : resourceList) {
			for(JoinField joinField : joinFields) {
				Map<String, Object> idList = null;
				idList = map.get(joinField.getJoiningId());
				if (idList == null) {
					idList = new HashMap<String, Object>();
				}
				if (resource.get(joinField.getJoiningId()) != null) {
					String value = resource.get(joinField.getJoiningId()).toString();
					idList.put(value,1);
				}
				map.put(joinField.getJoiningId(), idList);
			}
		}

		Map<String, Map<String,Map<String, Object>>> resourceMap = new HashMap<String, Map<String,Map<String, Object>>>();

		for(JoinField joinField : joinFields) {
			Map<String, Object> list = map.get(joinField.getJoiningId());
			if (Util.isEmpty(list)) 
				continue;
			BaseHelper childHelper = HelperFactory.getInstance().getHelper(joinField.getResource());
			Map<String, Map<String, Object>>  foriegnMap = null;
			foriegnMap = childHelper.getMapMapById(convertMap2IdArray(list),orderBy);
			resourceMap.put(joinField.getJoiningId(), foriegnMap);
		}

		for(Map<String, Object> resource : resourceList) {
			for(JoinField joinField : joinFields) {
				Map<String, Map<String, Object>>  mapForiegnKey = resourceMap.get(joinField.getJoiningId());
				if (mapForiegnKey == null) continue;
				String joinId = (String)resource.get(joinField.getJoiningId());
				Map<String, Object> childMap = mapForiegnKey.get(joinId);
				if (childMap == null) 
					continue;
				Map<String,String> fieldMap = joinField.getFieldMap();
				for (Map.Entry<String, String> entry : fieldMap.entrySet()) {
					resource.put(entry.getKey(), childMap.get(entry.getValue()));
				}
			}
		}
		return resourceList;
	}
	public Map<String, BaseResource> getMapById(String[] ids,String[] orderBy) {
		return getMapById(ids, orderBy,null);
	}
	
	public Map<String, BaseResource> getMapById(String[] ids,String[] orderBy, Expression expression) {
		BaseResource clonedResource = null;
		DbConnection connection = null;
		Map<String, BaseResource> map = new HashMap<String, BaseResource>();
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			ArrayList<Map<String, Object>> rows = (ArrayList<Map<String, Object>>) connection.getById(resource.getMetaData(),ids, orderBy, expression);
			if (!Util.isEmpty(rows)) {
				for(int i=0;i < rows.size(); i++) {
					clonedResource = (BaseResource) this.resource.clone();
					clonedResource.convertMapToResource(rows.get(i));
					map.put(clonedResource.getId(), clonedResource);
				}
			}
		} catch(Exception e) {	
			e.printStackTrace();
		} finally {
			if (connection != null)
				connection.release();
		}
		return  map;
	}

	public Map<String, BaseResource> getMapById(ArrayList<String> idList,String[] orderBy) {
		String[] ids = idList.toArray(new String[idList.size()]);
		return  getMapById(ids,orderBy);
	}

	public BaseResource[] getById(ArrayList<String> idList, String[] orderBy) {
		String[] ids = idList.toArray(new String[idList.size()]);
		return  getById(ids,orderBy);
	}

	BaseResource[] convertList2Array(ArrayList<BaseResource> list) {
		if (Util.isEmpty(list))
			return null;
		BaseResource[] resources = new BaseResource[list.size()];
		for(int i=0;i < list.size(); i++) {
			resources[i] = list.get(i);
		}
		return resources;
	}

	String[] convertMap2IdArray(Map<String, Object> map) {
		String[] ids = new String[map.size()];
		int count = 0;
		for (Map.Entry<String, Object> entry : map.entrySet()) {
			ids[count] = entry.getKey();
			count++;
		}
		return ids;
	}


	public BaseResource getById(String id) {
		BaseResource clonedResource = null;
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			Map<String, Object> row = connection.get(resource.getMetaData(),id);
			if ((row != null) && (row.size() > 0)) {
				clonedResource = (BaseResource) this.resource.clone();
				clonedResource.convertMapToResource(row);
			}
		} catch(Exception e) {	
			e.printStackTrace();
		} finally {
			if (connection != null)
				connection.release();
		}
		return clonedResource ;
	}

	public BaseResource getSelectedFieldsById(String id,String fieldName) {
		BaseResource clonedResource = null;
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			Map<String, Object> row = connection.get(resource.getMetaData(),id,new String[]{fieldName});
			if ((row != null) && (row.size() > 0)) {
				clonedResource = (BaseResource) this.resource.clone();
				clonedResource.convertMapToResource(row);
			}
		} catch(Exception e) {	
			e.printStackTrace();
		} finally {
			if (connection != null)
				connection.release();
		}
		return clonedResource ;
	}

	public BaseResource getSelectedFieldsById(String id,String[] fieldName) {
		BaseResource clonedResource = null;
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			Map<String, Object> row = connection.get(resource.getMetaData(),id,fieldName);
			if ((row != null) && (row.size() > 0)) {
				clonedResource = (BaseResource) this.resource.clone();
				clonedResource.convertMapToResource(row);
			}
		} catch(Exception e) {	
			e.printStackTrace();
		} finally {
			if (connection != null)
				connection.release();
		}
		return clonedResource ;
	}
	public Map<String, Object> getMapById(String id) {
		Map<String, Object> row = new HashMap<String, Object>();
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			row = connection.get(resource.getMetaData(),id);

		} catch(Exception e) {	
			e.printStackTrace();
		} finally {
			if (connection != null)
				connection.release();
		}
		return row ;
	}

	public BaseResource deleteById(String id) {
		BaseResource clonedResource = null;
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			connection.deleteById(resource.getMetaData(),id);
		} catch(Exception e) {	
			e.printStackTrace();
		} finally {
			if (connection != null)
				connection.release();
		}
		return clonedResource ;
	}
	
	public BaseResource deleteByExpression(Expression expression) {
		BaseResource clonedResource = null;
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			connection.deleteByExpression(resource.getMetaData(),expression);
		} catch(Exception e) {	
			e.printStackTrace();
		} finally {
			if (connection != null)
				connection.release();
		}
		return clonedResource ;
	}
	
	
	public String verify() throws Exception {
		DbConnection connection = null;
		String errors=null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			errors = connection.verify(resource.getMetaData());
		} catch(Exception e) {	
			if (connection != null)
				connection.release();
			e.printStackTrace();
			throw e;
		} finally {
			if (connection != null)
				connection.release();	
		}
		return errors;
	}


	public void validateUniqueKey(String[] keys, Map<String,Object> data)  throws ApplicationException{
		for(int i = 0; i < keys.length ;i++) {
			if (data.get(keys[i]) == null)
				return; // return if key is value is not specified.
		}
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			connection.validateUniqueKey(resource.getMetaData(),keys,data);
		} catch(Exception e) {	
			e.printStackTrace();
			if (connection != null)
				connection.release();
			throw new ApplicationException(ExceptionSeverity.ERROR,e.getMessage());
		} finally {
			if (connection != null)
				connection.release();	
		}
		return;
	}

	public void dumpCurrentState() {
		BaseResource[] resources = getAll();
		for(int i=0; i <resources.length; i++ ) {
			try {
				update(resources[i]);
			} catch (ApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void reset(BaseResource _fetchedResource,String id,String fieldName) {
		BaseResource _resource = null;
		try {
			_resource = (BaseResource) this.resource.clone();
		} catch (Exception e) {
			return;
		}
		Map<String, Object> _newMap = new HashMap<String, Object>();
		Map<String, Object> map = _fetchedResource.convertResourceToMap();
		if (map.get(fieldName) == null)
			return;
		if (map.get(fieldName) instanceof Double) {
			if (Util.hasValue((Double)map.get(fieldName))) {
				_newMap.put(fieldName,new Double(0.0));
			}
		} else if (map.get(fieldName) instanceof Number) {
			if (Util.hasValue((Number)map.get(fieldName))) {
				_newMap.put(fieldName,0);
			}
		} else if (map.get(fieldName) instanceof Integer) {
			if (Util.hasValue((Number)map.get(fieldName))) {
				_newMap.put(fieldName,new Integer(0));
			}
		} else if (map.get(fieldName) instanceof Long) {
			if (Util.hasValue((Number)map.get(fieldName))) {
				_newMap.put(fieldName,new Long(0));
			}
		} else if (map.get(fieldName) instanceof Short) {
			if (Util.hasValue((Number)map.get(fieldName))) {
				_newMap.put(fieldName,new Short((short)0));
			}
		} else if (map.get(fieldName) instanceof Byte) {
			if (Util.hasValue((Number)map.get(fieldName))) {
				_newMap.put(fieldName,new Byte((byte)0));
			}
		} else {
			ApplicationLogger.error("Unable to reset the field " +fieldName + " in resource " + _fetchedResource.getMetaData().getName(), this.getClass());
		}
		_resource.convertMapToResource(_newMap);
		_resource.setId(id);
		try {
			ApplicationLogger.info("Resetting the field " + fieldName + " for " +_fetchedResource.getMetaData().getName() + "::" +id , this.getClass());
			update(_resource);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
