package platform.helper;

import platform.db.*;
import platform.log.ApplicationLogger;
import platform.resource.BaseResource;
import platform.resource.c4t_object;
import platform.resource.c4t_record;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Field;
import platform.util.Util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	public void updateInObject(BaseResource _resource) throws ApplicationException {
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			Map<String, Object> map = _resource.convertResourceToMap();
			c4t_object  _object = new c4t_object();
			_object.convertMapToResource(map);
			connection.update(_object);
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

	public void incrementValue(String id,String fieldName, double incrementBy) throws ApplicationException {
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			BaseResource clonedResource = (BaseResource) this.resource.clone();
			clonedResource.setId(id);
			BaseResource fetch_counter = getById(id);
			if (fetch_counter == null) {
				add(clonedResource);
			}
			connection.incrementValue(clonedResource, fieldName, incrementBy);
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

	public ArrayList<Map<String, Object>> getListMapByCustomerId(String customerId,String[] orderby) {
		Expression e = new Expression("customer_id", REL_OP.EQ, customerId);
		BaseResource[] resoucres = this.getByExpression(e, orderby);
		return HelperUtils.convertArray2ListMap(resoucres);
	}

	public void incrementCounter(String id,String counterName, int incrementBy) throws ApplicationException {
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			BaseResource clonedResource = (BaseResource) this.resource.clone();
			clonedResource.setId(id);
			BaseResource fetch_counter = getById(id);
			if (fetch_counter == null) {
				add(clonedResource);
			}
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
			BaseResource fetch_counter = getById(id);
			if (fetch_counter == null) {
				add(clonedResource);
			}
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

	public void unset(BaseResource _resource,String[] fieldnames) throws ApplicationException {
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			connection.unset(_resource,fieldnames);
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

	public void addInObject(BaseResource _resource) throws ApplicationException {
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			Map<String, Object> map = _resource.convertResourceToMap();
			c4t_object  _object = new c4t_object();
			_object.setObject_type(_resource.getMetaData().getName());
			_object.convertMapToResource(map);
			connection.add(_object);
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

	public BaseResource getByExpressionFirstRecord(Expression expression) {
		BaseResource[] resources =  getByExpression(expression);
		if (Util.isEmpty(resources))
			return null;
		return resources[0];
	}

	public BaseResource[] getByExpression(Expression expression) {
		return getByExpression(expression,null);
	}
	public BaseResource[] getByExpression(Expression expression, String[] orderby) {
		BaseResource[] resources = null;
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			List<Map<String, Object>> rows = connection.getByExpression(resource.getMetaData(),expression, orderby);
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

	public BaseResource[] getLatest(int number) {
		return getLatest(null, number);
	}
	
	public BaseResource[] getLatest(Expression exp, int number) {
		return getLatest(exp,new String[]{"creation_time desc"},number);
	}
	
	public BaseResource[] getPage(Expression exp, String[] order, int pageno, int number) {
		BaseResource[] resources = null;
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			List<Map<String, Object>> rows = connection.getPage(resource.getMetaData(),exp,order,pageno,number);
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
	
	public BaseResource[] getLatest(Expression exp, String[] order, int number) {
		BaseResource[] resources = null;
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			List<Map<String, Object>> rows = connection.getPage(resource.getMetaData(),exp,order,0,number);
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
			return connection.getByExpression(resource.getMetaData(),expression, null);
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

	public BaseResource[] getAll(String[] orderby) {
		BaseResource[] resources = null;
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			List<Map<String, Object>> rows = connection.getAll(resource.getMetaData(),orderby);
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
	public List<Map<String, Object>> getAllMap(String[] order) {
		DbConnection connection = null;
		List<Map<String, Object>> rows = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			rows = connection.getAll(resource.getMetaData(),order);
		} catch(Exception e) {	
			e.printStackTrace();
		} finally {
			if (connection != null)
				connection.release();
		}
		return rows;
	}

	public List<Map<String, Object>> getAllMap() {
		return getAllMap(null);	
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

	public BaseResource[] getById(BaseResource[] resources,String id_field_name,String[] orderBy) {
		String[] ids = HelperUtils.convertResource2IdArray(resources,id_field_name);
		return  getById(ids, orderBy);
	}


	public BaseResource[] getById(String[] ids) {
		ArrayList<BaseResource> list = getListById(ids);
		return  HelperUtils.convertList2Array(list);
	}
	
	public BaseResource[] getById(String[] ids,String[] orderBy,Expression e,int pageno,int pagesize) {
		ArrayList<BaseResource> list = getListById(ids, orderBy,e,pageno,pagesize);
		return  HelperUtils.convertList2Array(list);
	}
	
	
	public BaseResource[] getById(String[] ids,String[] orderBy) {
		ArrayList<BaseResource> list = getListById(ids, orderBy);
		return  HelperUtils.convertList2Array(list);
	}

	public ArrayList<BaseResource> getListById(String[] ids) {
		return getListById(ids, null, null);
	}


	public ArrayList<BaseResource> getListById(String[] ids,String[] orderby) {
		return getListById(ids, orderby, null);
	}

	public BaseResource[] getArrayById(String[] ids,String[] orderby) {
		return getArrayById(ids, orderby, null);
	}

	

	public BaseResource[] getArrayById(String[] ids,String[] orderby, Expression expression) {
		ArrayList<BaseResource> list = getListById(ids, orderby, expression);
		return HelperUtils.convertList2Array(list);
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
	
	public ArrayList<BaseResource> getListById(String[] ids,String[] orderby, Expression expression,int pageno, int pagesize) {
		BaseResource clonedResource = null;
		DbConnection connection = null;
		ArrayList<BaseResource> list = new ArrayList<BaseResource>();
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			ArrayList<Map<String, Object>> rows = (ArrayList<Map<String, Object>>) connection.getById(resource.getMetaData(),ids, orderby, expression,pageno,pagesize);
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

	
	public ArrayList<Map<String, Object>> getListMapById(Expression expression,String[] orderBy) {
		DbConnection connection = null;
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			list = (ArrayList<Map<String, Object>>) connection.getByExpression(resource.getMetaData(),expression,orderBy);
		} catch(Exception e) {	
			e.printStackTrace();
		} finally {
			if (connection != null)
				connection.release();
		}
		return list;
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
			list = (ArrayList<Map<String, Object>>) connection.getAll(resource.getMetaData(),new String[]{"name"});
		} catch(Exception e) {	
			e.printStackTrace();
		} finally {
			if (connection != null)
				connection.release();
		}
		return list;
	}
	
	public ArrayList<Map<String, Object>> getAllListMap(String[] orderby) {
		DbConnection connection = null;
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			list = (ArrayList<Map<String, Object>>) connection.getAll(resource.getMetaData(),orderby);
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

	public ArrayList<Map<String, Object>> getByJoining(Expression e,ArrayList<JoinField> joinFields, String[] orderBy) throws ApplicationException {
		ArrayList<Map<String, Object>> resourceList = new ArrayList<Map<String, Object>>();
		BaseHelper masterHelper = HelperFactory.getInstance().getHelper(resource.getMetaData().getName());
		if (masterHelper == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, resource.getMetaData().getName() + " not registered with the helper factory ...");
		if (e != null) {
			resourceList = masterHelper.getListMapById(e, orderBy);
		} else {
			resourceList = masterHelper.getAllListMap(orderBy);
		}
		Map<String, Map<String, Object>> map = new HashMap<String, Map<String, Object>>();
		if (joinFields != null) {
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
		}

		Map<String, Map<String,Map<String, Object>>> resourceMap = new HashMap<String, Map<String,Map<String, Object>>>();
		if (joinFields != null) {
			for(JoinField joinField : joinFields) {
				Map<String, Object> list = map.get(joinField.getJoiningId());
				if (Util.isEmpty(list)) 
					continue;
				BaseHelper childHelper = HelperFactory.getInstance().getHelper(joinField.getResource());
				if (childHelper == null)
					throw new ApplicationException(ExceptionSeverity.ERROR, joinField.getResource() + " not registered with the helper factory ...");
				Map<String, Map<String, Object>>  foriegnMap = null;
				foriegnMap = childHelper.getMapMapById(HelperUtils.convertMap2IdArray(list),orderBy);
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
		}
		return resourceList;
	}


	public ArrayList<Map<String, Object>> getByJoiningForCustomer(String customerId,ArrayList<JoinField> joinFields,String[] order) {
		Expression e = new Expression("customer_id",REL_OP.EQ, customerId);
		ArrayList<Map<String, Object>>  list = new ArrayList<Map<String, Object>>();
		try {
			list = getByJoining(e, joinFields,order);
		} catch (ApplicationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return list;
	}
	
	public ArrayList<Map<String, Object>> getByJoining(Expression e,ArrayList<JoinField> joinFields) {
		ArrayList<Map<String, Object>>  list = new ArrayList<Map<String, Object>>();
		try {
			list = getByJoining(e, joinFields,null);
		} catch (ApplicationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return list;
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
			foriegnMap = childHelper.getMapMapById(HelperUtils.convertMap2IdArray(list),orderBy);
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

	public ArrayList<Map<String, Object>> getByJoining(String[] ids,ArrayList<JoinField> joinFields, String[] orderBy,String query) {
		ArrayList<Map<String, Object>> resourceList = new ArrayList<Map<String, Object>>();
		if (ids == null) return resourceList;
		BaseHelper masterHelper = HelperFactory.getInstance().getHelper(resource.getMetaData().getName());
		Expression e1 = new Expression("id", REL_OP.IN, ids);
		Expression e2 = new Expression("name", REL_OP.REGEX, query);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		BaseResource[] masterResources = getByExpression(e);
		resourceList = HelperUtils.convertArray2ListMap(masterResources);
		
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
			foriegnMap = childHelper.getMapMapById(HelperUtils.convertMap2IdArray(list),orderBy);
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

	public Map<String, BaseResource> getMapById(String[] ids) {
		return getMapById(ids, null,null);
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

	public Map<String, BaseResource> getMapById(Expression expression,String[] orderBy) {
		BaseResource clonedResource = null;
		DbConnection connection = null;
		Map<String, BaseResource> map = new HashMap<String, BaseResource>();
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			ArrayList<Map<String, Object>> rows = (ArrayList<Map<String, Object>>) connection.getByExpression(resource.getMetaData(), expression, orderBy);
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

	public BaseResource getByName(String name) {
		BaseResource clonedResource = null;
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			Expression e = new Expression("name",REL_OP.EQ,name);
			List<Map<String, Object>> rows = connection.getByExpression(resource.getMetaData(),e,null);
			if (Util.isEmpty(rows)) {
				return null;
			}
			Map<String, Object> row = rows.get(0);
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

	public BaseResource deleteById(String[] ids) {
		BaseResource clonedResource = null;
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			for(String id : ids) {
				connection.deleteById(resource.getMetaData(),id);
			}
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

	public void deleteAll() {
		BaseResource clonedResource = null;
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			connection.deleteAll(resource.getMetaData());
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if (connection != null)
				connection.release();
		}
		return ;
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

	public BaseResource[] getByCustomerId(String customerId) {
		Expression e = new Expression("customer_id", REL_OP.EQ, customerId);
		return getByExpression(e, new String[]{"name"});
	}

	public BaseResource[] getByCustomerId(Expression e, String customerId) {
		return getByCustomerId(e,customerId,new String[]{"name"});
	}
	public BaseResource[] getByCustomerId(Expression e, String customerId,String[] order) {
		Expression e1 = new Expression("customer_id", REL_OP.EQ, customerId);
		Expression e2 = new Expression(e1, LOG_OP.AND, e);
		return getByExpression(e2, order);
	}

	public BaseResource[] getByCustomerId(String customerId,String[] orderby) {
		Expression e = new Expression("customer_id", REL_OP.EQ, customerId);
		return getByExpression(e, orderby);
	}
	
	
	public ArrayList<Map<String, Object>> getListMapByCustomerId(String customerId,ArrayList<JoinField> joinFields) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Expression e = new Expression("customer_id", REL_OP.EQ, customerId);
		try {
			list =  getByJoining(e,joinFields,new String[]{"name"});
		} catch (ApplicationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return list;
	}
	
	public ArrayList<Map<String, Object>> getListMapByCustomerId(String customerId) {
		Expression e = new Expression("customer_id", REL_OP.EQ, customerId);
		BaseResource[] resoucres =  getByExpression(e,new String[]{"name"});
		return HelperUtils.convertArray2ListMap(resoucres);
	}

	public ArrayList<Map<String, Object>> getListMapByCustomerId(String customerId,ArrayList<JoinField> joinFields, String[] order) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Expression e = new Expression("customer_id", REL_OP.EQ, customerId);
		try {
			list =  getByJoining(e,joinFields,order);
		} catch (ApplicationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return list;
	}
	public ArrayList<Map<String, Object>> getListMap(ArrayList<JoinField> joinFields) {
		return getByJoining(null,joinFields);
	}
	
	public ArrayList<Map<String, Object>> getListMapByApplianceId(String applianceId,ArrayList<JoinField> joinFields) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Expression e = new Expression("appliance_id", REL_OP.EQ, applianceId);
		try {
			list =  getByJoining(e,joinFields,new String[]{"name"});
		} catch (ApplicationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return list;
	}
	
	public BaseResource[] getByCustomerIdForType(String customerId,String type) {
		Expression e1 = new Expression("customer_id", REL_OP.EQ, customerId);
		Expression e2 = new Expression("type", REL_OP.EQ, type);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return  getByExpression(e,new String[]{"name"});
	}
	
	public ArrayList<Map<String, Object>> getListMapByCustomerIdForType(String customerId,String type,ArrayList<JoinField> joinFields) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Expression e1 = new Expression("customer_id", REL_OP.EQ, customerId);
		Expression e2 = new Expression("type", REL_OP.EQ, type);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		try {
			list =  getByJoining(e,joinFields,new String[]{"name"});
		} catch (ApplicationException exp) {
			// TODO Auto-generated catch block
			exp.printStackTrace();
		}
		return list;
	}

	public ArrayList<Map<String, Object>> getListMapByType(String type,ArrayList<JoinField> joinFields) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Expression e = new Expression("type", REL_OP.EQ, type);
		try {
			list =  getByJoining(e,joinFields,new String[]{"name"});
		} catch (ApplicationException exp) {
			// TODO Auto-generated catch block
			exp.printStackTrace();
		}
		return list;
	}
	
	public ArrayList<Map<String, Object>> getListMapByTypeForCustomer(String customerId,String type,ArrayList<JoinField> joinFields) {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Expression e1 = new Expression("type", REL_OP.EQ, type);
		Expression e2 = new Expression("customer_id", REL_OP.EQ, customerId);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		
		try {
			list =  getByJoining(e,joinFields,new String[]{"name"});
		} catch (ApplicationException exp) {
			// TODO Auto-generated catch block
			exp.printStackTrace();
		}
		return list;
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
	
	public BaseResource[] getForSchoolsDateWise(String[] schools,String[] order,String timeFeild,long fromtime,long totime) {
		try {
			Expression e2 = new Expression("school_id", REL_OP.IN, schools);
			Expression e4 = new Expression(timeFeild, REL_OP.GTEQ, fromtime);
			Expression e5 = new Expression(timeFeild, REL_OP.LT, totime);
			
			Expression e6 = new Expression(e4, LOG_OP.AND, e5);
			Expression e = new Expression(e2, LOG_OP.AND, e6);
			return getByExpression(e,order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;		
	}
	
	public BaseResource[] getForLocationsDateWise(String[] locations,String[] order,String timeFeild,long fromtime,long totime) {
		try {
			Expression e2 = new Expression("location_id", REL_OP.IN, locations);
			Expression e4 = new Expression(timeFeild, REL_OP.GTEQ, fromtime);
			Expression e5 = new Expression(timeFeild, REL_OP.LT, totime);
			
			Expression e6 = new Expression(e4, LOG_OP.AND, e5);
			Expression e = new Expression(e2, LOG_OP.AND, e6);
			return getByExpression(e,order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;		
	}
	
	public BaseResource[] getForCommunityDateWise(String[] communities,String record_type,String[] order,String timeFeild,long fromtime,long totime) {
		try {
			Expression e1 = new Expression(c4t_record.FIELD_RECORD_TYPE, REL_OP.IN, record_type);
			Expression e2 = new Expression(c4t_record.FIELD_COMMUNITY_ID, REL_OP.IN, communities);
			Expression e4 = new Expression(timeFeild, REL_OP.GTEQ, fromtime);
			Expression e5 = new Expression(timeFeild, REL_OP.LT, totime);
			
			Expression e6 = new Expression(e4, LOG_OP.AND, e5);
			Expression e7 = new Expression(e2, LOG_OP.AND, e6);
			Expression e = new Expression(e1, LOG_OP.AND, e7);
			return getByExpression(e,order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;		
	}
	
	public BaseResource[] getResourcesForSchools(String[] schoolIds,String[] order)  {
		try {
			Expression e = new Expression("school_id", REL_OP.IN, schoolIds);
			return getByExpression(e,order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;		
	}
	
	public ArrayList<Map<String, Object>> getForSchools(String[] schoolIds,String[] order)  {
		try {
			Expression e = new Expression("school_id", REL_OP.IN, schoolIds);
			BaseResource[] resoucres =  getByExpression(e,order);
			return HelperUtils.convertArray2ListMap(resoucres);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ArrayList<Map<String, Object>>();		
	}
	
	public BaseResource getSingleResourceForCommunity(String communityId)  {
		try {
			Expression e = new Expression("community_id", REL_OP.EQ, communityId);
			BaseResource[] resoucres =  getByExpression(e);
			if (Util.isEmpty(resoucres))
				return null;
			return resoucres[0];
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;		
	}
	
	
	public ArrayList<Map<String, Object>> getForCommunity(String communityId,String[] order)  {
		try {
			Expression e = new Expression("community_id", REL_OP.EQ, communityId);
			BaseResource[] resoucres =  getByExpression(e,order);
			return HelperUtils.convertArray2ListMap(resoucres);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ArrayList<Map<String, Object>>();		
	}
	
	public ArrayList<Map<String, Object>> getForCommunities(String[] communityIds,String[] order)  {
		try {
			Expression e = new Expression("community_id", REL_OP.IN, communityIds);
			BaseResource[] resoucres =  getByExpression(e,order);
			return HelperUtils.convertArray2ListMap(resoucres);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ArrayList<Map<String, Object>>();		
	}
	
	public ArrayList<Map<String, Object>> getForLocations(String[] schoolIds,String[] order)  {
		try {
			Expression e = new Expression("location_id", REL_OP.IN, schoolIds);
			BaseResource[] resoucres =  getByExpression(e,order);
			return HelperUtils.convertArray2ListMap(resoucres);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ArrayList<Map<String, Object>>();		
	}
	
	public boolean isExistInArray(String id,String fieldName, String value) {
		BaseResource _resource = getSelectedFieldsById(id,fieldName);
		if ((_resource == null))
			return false;
		Map<String, Object> map =_resource.convertResourceToMap();
		if (map.get(fieldName) == null)
			return false;
		@SuppressWarnings("unchecked")
		ArrayList<String> list = (ArrayList<String>)map.get(fieldName);
		for(int i =0; i < list.size() ; i++) {
			String _value = list.get(i);
			if (_value == null)
				continue;
			if (_value.equals(value)) {
				return true;
			}
		}
		return false;
	}
	
	public long getCount(Expression expression) {
		long count = 0;
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			count = connection.getByCountExpression(resource.getMetaData(),expression);
			return count;

		} catch(Exception e) {	
			e.printStackTrace();
		} finally {
			if (connection != null)
				connection.release();
		}
		return count;
	}
	
	public long getCountByCustomer(String customerId) {
		long count = 0;
		DbConnection connection = null;
		try {
			connection = DbManager.getInstance().getConnection(this.getResource());
			Expression expression = new Expression(c4t_object.FIELD_CUSTOMER_ID, REL_OP.EQ, customerId);
			count = connection.getByCountExpression(resource.getMetaData(),expression);
			return count;

		} catch(Exception e) {	
			e.printStackTrace();
		} finally {
			if (connection != null)
				connection.release();
		}
		return count;
	}
}
