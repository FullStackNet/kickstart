package platform.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import platform.db.DbConnection;
import platform.db.DbManager;
import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.log.ApplicationLogger;
import platform.resource.BaseResource;
import platform.resource.c4t_object;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Field;
import platform.util.Util;

public class BaseObjectHelper {
	BaseResource resource;

	public BaseResource getResource() {
		return resource;
	}

	public void setResource(BaseResource resource) {
		this.resource = resource;
	}

	public BaseObjectHelper(BaseResource resource) {
		this.resource = resource;
	}

	public void update(BaseResource _resource) throws ApplicationException {
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
			Map<String, Object> map = _resource.convertResourceToMap();
			c4t_object  _object = new c4t_object();
			_object.setType(_resource.getMetaData().getName());
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

	public BaseResource[] getByCustomerId(String customerId) {
		Expression e = new Expression("customer_id", REL_OP.EQ, customerId);
		return getByExpression(e, new String[]{"name"});
	}

	public BaseResource[] getByCustomerId(String customerId,String[] orderby) {
		Expression e = new Expression("customer_id", REL_OP.EQ, customerId);
		return getByExpression(e, orderby);
	}
	
	
	public BaseResource[] getByCustomerIdForType(String customerId,String type) {
		Expression e1 = new Expression("customer_id", REL_OP.EQ, customerId);
		Expression e2 = new Expression("type", REL_OP.EQ, type);
		Expression e = new Expression(e1, LOG_OP.AND, e2);
		return  getByExpression(e,new String[]{"name"});
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
	
}
