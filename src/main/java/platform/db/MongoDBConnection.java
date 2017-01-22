package platform.db;

import com.mongodb.*;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSInputFile;
import platform.config.Reader;
import platform.defined.DBNameEnum;
import platform.event.EventManager;
import platform.event.interfaces.Event;
import platform.event.interfaces.GenericEventListener;
import platform.events.ShutDownProcessEvent;
import platform.log.ApplicationLogger;
import platform.resource.BaseResource;
import platform.util.*;

import java.io.File;
import java.util.*;
import java.util.regex.Pattern;


public class MongoDBConnection extends DbConnection {
	DB conn = null;
	MongoClient client;
	public static Reader reader = null;
	String cluster;
	String clusterId;
	boolean local;
	Map<String, Object> noSyncMap;

	public String getClusterId() {
		return clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public MongoDBConnection() {
		super();
		noSyncMap = new HashMap<String, Object>();
		cluster = DBNameEnum.DB_CONFIG.toString();
		clusterId = "1";
		if (reader == null) {
			reader = new Reader("db");
		}
		server = reader.getString(ApplicationConstants.PROPERTY_SERVER,ApplicationConstants.DEFAULT_DB_SERVER);
		username = reader.getString(ApplicationConstants.PROPERTY_USERNAME,ApplicationConstants.DEFAULT_DB_USERNAME);
		database = reader.getString(ApplicationConstants.PROPERTY_DATABASE,DBNameEnum.DB_CONFIG.toString());
		port = reader.getInt(ApplicationConstants.PROPERTY_PORT,23017);
		password = reader.getString("password",null);
		System.out.println(server+"::"+username+"::"+port+"::"+database+"::"+password);
		if ( password != null) {
			if (password.startsWith("^^")) {
				password = decodePassword(password);
			} else {
				password = encodePassword(password);
				reader.setString("password", password);
				reader.save();
				password = decodePassword(password);
			}
		}
		GenericEventListener processShutDownListner = new GenericEventListener() {
			public void eventTriggered(Object sender, Event event) {
				// TODO Auto-generated method stub
				ApplicationLogger.info("Shuting down thread Mongo DB connection Thread....", this.getClass());
				disconnect();
			}
		}; 
		EventManager.getInstance().registerEventListener(processShutDownListner, ShutDownProcessEvent.class);
	}

	public MongoDBConnection(String clusterId, String cluster, String server,int port,String username,String password,String databse) {
		this.cluster = cluster;
		this.server = server;
		this.username = username;
		this.password = password;
		this.database = databse;
		this.clusterId = clusterId;
		this.port = (short)port;
		GenericEventListener processShutDownListner = new GenericEventListener() {
			public void eventTriggered(Object sender, Event event) {
				// TODO Auto-generated method stub
				ApplicationLogger.info("Shuting down thread Mongo DB connection Thread....", this.getClass());
				disconnect();
			}
		}; 
		EventManager.getInstance().registerEventListener(processShutDownListner, ShutDownProcessEvent.class);

	}

	public String getCluster() {
		return cluster;
	}

	public void setCluster(String cluster) {
		this.cluster = cluster;
	}
	public String decodePassword(String password1) {
		return password1.substring(2);
	}

	public String encodePassword(String password1) {
		return "^^"+password1;
	}
	public void connect(){
		if (conn == null) {
			try {

				client = new MongoClient(new ServerAddress(server, port));
				conn = client.getDB(database);
				if (conn == null) {
					ApplicationLogger.error("Unable to connect the Database "+database +" server :" +server, this.getClass());
				} else {
					ApplicationLogger.info("successfully connected the Database "+database +" server :" +server, this.getClass());
				}
				client.setWriteConcern(WriteConcern.JOURNALED);
				/*boolean auth = conn.authenticate(username, password.toCharArray());
				if (!auth) {
					C4TLogger.error("Authentication Failed "+database +" server :" +server, this.getClass());
				}*/
			} catch(Exception e) {
				ApplicationLogger.error("Unable to connect the Database "+database +" server :" +server, this.getClass());
				e.printStackTrace(); 
			}
		}
	}

	public void disconnect() {
		try  {
			if (client != null)
				client.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void reconnect() {
		conn = null;
		connect();
	}

	public List<Map<String, Object>> get(String sql) {
		return null; 
	}
	public Map<String, Object> get(ResourceMetaData metaData, String id) {
		return get(metaData,id,null);
	}
	public Map<String, Object> get(ResourceMetaData metaData, String id,String[] fieldNames) {
		checkAndReviveConnection();
		if (conn == null) {
			ApplicationException e = new ApplicationException(ExceptionSeverity.ERROR, "Unable to connect to database"); 
			e.printStackTrace();
			return null;
		}
		DBCollection table = conn.getCollection(metaData.getTableName());
		BasicDBObject doc = new BasicDBObject();
		doc.append("_id", id);

		BasicDBObject selectedFields = null;
		if ((fieldNames != null) && fieldNames.length > 0){
			selectedFields = new BasicDBObject();
			selectedFields.append("id", 1);
			for(String fieldName : fieldNames) {
				selectedFields.append(fieldName, 1);
			}
		}
		BasicDBObject dataMap;
		if (selectedFields != null) {
			dataMap = (BasicDBObject)table.findOne(doc,selectedFields);
		} else {
			dataMap = (BasicDBObject)table.findOne(doc);
		}
		if (dataMap == null)
			return null;
		Map<String, Field> map = metaData.getFields();
		Map<String, Object> row = new HashMap<String, Object>();
		for (Map.Entry<String, Field> entry : map.entrySet()) {
			String columnName =  (String) entry.getKey();
			Object value =  dataMap.get(columnName);
			//System.out.println(columnName+"->"+value);
			Field field = entry.getValue();
			if (field.getType().equalsIgnoreCase("Array") ) {
				ArrayList<Object> list = new ArrayList<Object>();
				BasicDBList dblist = (BasicDBList) dataMap.get(columnName);
				if (dblist != null) {
					for(int i=0;i<dblist.size();i++)
					{
						list.add(dblist.get(i));
					}
				}
				row.put(columnName, list);
			}


			if (value != null) {
				if (value instanceof Double) {

					if (field.getType().equalsIgnoreCase("int")) {
						row.put(columnName, ((Double)value).intValue());
					} else if (field.getType().equalsIgnoreCase("long")) {
						row.put(columnName, ((Double)value).longValue());
					} else if (field.getType().equalsIgnoreCase("short")) {
						row.put(columnName, ((Double)value).shortValue());
					} else if (field.getType().equalsIgnoreCase("byte")) {
						row.put(columnName, ((Double)value).byteValue());
					} else if (field.getType().equalsIgnoreCase("string")) {
						row.put(columnName, value.toString());
					} else {
						row.put(columnName, value);
					}
				} else if (value instanceof Long) {
					if (field.getType().equalsIgnoreCase("int")) {
						row.put(columnName, ((Long) value).intValue());
					} else if (field.getType().equalsIgnoreCase("long")) {
						row.put(columnName, ((Long) value).longValue());
					} else if (field.getType().equalsIgnoreCase("short")) {
						row.put(columnName, ((Long) value).shortValue());
					} else if (field.getType().equalsIgnoreCase("byte")) {
						row.put(columnName, ((Long) value).byteValue());
					} else if (field.getType().equalsIgnoreCase("string")) {
						row.put(columnName, value.toString());
					} else {
						row.put(columnName, value);
					}
				} else if (value instanceof Integer) {
					if (field.getType().equalsIgnoreCase("int")) {
						row.put(columnName, ((Integer) value).intValue());
					} else if (field.getType().equalsIgnoreCase("long")) {
						row.put(columnName, ((Integer) value).longValue());
					} else if (field.getType().equalsIgnoreCase("short")) {
						row.put(columnName, ((Integer) value).shortValue());
					} else if (field.getType().equalsIgnoreCase("byte")) {
						row.put(columnName, ((Integer) value).byteValue());
					} else if (field.getType().equalsIgnoreCase("string")) {
						row.put(columnName, value.toString());
					} else {
						row.put(columnName, value);
					}
				} else {
					row.put(columnName, value);
				}
			}
		}
		return row;
	}

	public BasicDBObject getCondition(ResourceMetaData metaData,Expression expression) {
		if (expression == null)
			return null;
		BasicDBObject object = new BasicDBObject();
		if (!expression.isSimple()) {
			BasicDBObject leftObject = getCondition(metaData,expression.getLeftExpression());
			BasicDBObject rightObject = getCondition(metaData,expression.getRightExpression());
			if (expression.getLogicalOperator() == LOG_OP.AND) {
				ArrayList<BasicDBObject> list = new ArrayList<BasicDBObject>();
				list.add(leftObject);
				list.add(rightObject);
				object = new BasicDBObject("$and",list);
				return object;
			} else if (expression.getLogicalOperator() == LOG_OP.OR) {
				ArrayList<BasicDBObject> list = new ArrayList<BasicDBObject>();
				list.add(leftObject);
				list.add(rightObject);
				object = new BasicDBObject("$or",list);
				return object;
			}

		} 
		String variable = expression.getVariable();
		Object expressionValueObj = expression.getValue();
		switch(expression.getRelationalOperator()) {
		case EQ:
			object.put(variable, expressionValueObj);
			break;
		case NEQ:
			object.put(variable, new BasicDBObject("$ne", expressionValueObj));
			break;
		case GT:
			object.put(variable, new BasicDBObject("$gt", expressionValueObj));
			break;
		case LT:
			object.put(variable, new BasicDBObject("$lt", expressionValueObj));
			break;
		case LTEQ:
			object.put(variable, new BasicDBObject("$lte", expressionValueObj));
			break;	
		case GTEQ:
			object.put(variable, new BasicDBObject("$gte", expressionValueObj));
			break;	
		case IN:
			object.put(variable, new BasicDBObject("$in", expressionValueObj));
			break;
		case NIN:
			object.put(variable, new BasicDBObject("$nin", expressionValueObj));
			break;	
		case EACH_ELEMENT_IN:
			object.put(variable, new BasicDBObject("$elemMatch", new BasicDBObject("$in", expressionValueObj)));
			break;	
			
		
		case REGEX:
			object.put(variable, java.util.regex.Pattern.compile("^.*"+expressionValueObj+".*$",Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE));
			break;	
		case STARTWITH:
			object.put(variable,  java.util.regex.Pattern.compile(expressionValueObj+".*$",Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE));
			break;	
	
		default:
			break;
		}
		System.out.println(object.toString());
		return object;
	}

	public List<Map<String, Object>>  getByExpression(ResourceMetaData metaData, Expression expression) {
		return getByExpression(metaData, expression, null, 0, 0);
	}

	public List<Map<String, Object>>  getByExpression(ResourceMetaData metaData, Expression expression,String[] orderby) {
		return getByExpression(metaData, expression, orderby, 0, 0);
	}

	BasicDBObject getSortField(String[] orderBy) {
		BasicDBObject doc = new BasicDBObject();
		for(int i=0; i < orderBy.length; i++) {
			String[] orders = orderBy[i].split(" ");
			if (orders.length > 1) {
				if ("DESC".equalsIgnoreCase(orders[1])) {
					doc.append(orders[0], -1);
				} else {
					doc.append(orders[0], -1);
				}
			} else {
				doc.append(orders[0], 1);
			}
		}
		return doc;
	}
	public List<Map<String, Object>>  getByExpression(ResourceMetaData metaData, Expression expression,String[] orderby, int pageno, int pagesize) {
		checkAndReviveConnection();
		if (conn == null) {
			ApplicationException e = new ApplicationException(ExceptionSeverity.ERROR, "Unable to connect to database"); 
			e.printStackTrace();
			return null;
		}
		List<Map<String, Object>> rows = new ArrayList<Map<String, Object>>();
		DBCollection table = conn.getCollection(metaData.getTableName());
		BasicDBObject condition = getCondition(metaData,expression);
		System.out.println(condition);
		DBCursor cursor = null ;
		if (pagesize > 0) {
			if (Util.isEmpty(orderby)) {
				cursor = table.find(condition).skip(pageno*pagesize).limit(pagesize);
			} else {
				BasicDBObject sortFields = getSortField(orderby);
				cursor = table.find(condition).sort(sortFields).skip(pageno*pagesize).limit(pagesize);
			}
		} else {
			if (Util.isEmpty(orderby)) {
				cursor = table.find(condition);
			} else {
				BasicDBObject sortFields = getSortField(orderby);
				cursor = table.find(condition).sort(sortFields);
			}
		}

		while (cursor.hasNext()) {
			BasicDBObject dataMap = (BasicDBObject)cursor.next();
			if (dataMap == null)
				continue;
			Map<String, Field> map = metaData.getFields();
			Map<String, Object> row = new HashMap<String, Object>();
			for (Map.Entry<String, Field> entry : map.entrySet()) {
				String columnName =  (String) entry.getKey();
				Field field = entry.getValue();
				Object value =  dataMap.get(columnName);
				try {
					if (value != null) {
						if (field.getType().equalsIgnoreCase("Array")) {
							ArrayList<Object> list = new ArrayList<Object>();
							BasicDBList dblist = (BasicDBList) dataMap.get(columnName);
							for(int i=0;i<dblist.size();i++)
							{
								list.add(dblist.get(i));
							}
							row.put(columnName, list);
						} else {
							if (value instanceof Double) {
								
								if (field.getType().equalsIgnoreCase("int")) {
									row.put(columnName, ((Double)value).intValue());
								} else if (field.getType().equalsIgnoreCase("long")) {
									row.put(columnName, ((Double)value).longValue());
								} else if (field.getType().equalsIgnoreCase("short")) {
									row.put(columnName, ((Double)value).shortValue());
								} else if (field.getType().equalsIgnoreCase("byte")) {
									row.put(columnName, ((Double)value).byteValue());
								}  else if (field.getType().equalsIgnoreCase("string")) {
									row.put(columnName, value.toString());
								} else {
									row.put(columnName, value);
								}
							} else if (value instanceof Long) {
								if (field.getType().equalsIgnoreCase("int")) {
									row.put(columnName, ((Long)value).intValue());
								} else if (field.getType().equalsIgnoreCase("long")) {
									row.put(columnName, ((Long)value).longValue());
								} else if (field.getType().equalsIgnoreCase("short")) {
									row.put(columnName, ((Long)value).shortValue());
								} else if (field.getType().equalsIgnoreCase("byte")) {
									row.put(columnName, ((Long)value).byteValue());
								}  else if (field.getType().equalsIgnoreCase("string")) {
									row.put(columnName, value.toString());
								} else {
									row.put(columnName, value);
								}
							} else if (value instanceof Integer) {
								if (field.getType().equalsIgnoreCase("int")) {
									row.put(columnName, ((Integer)value).intValue());
								} else if (field.getType().equalsIgnoreCase("long")) {
									row.put(columnName, ((Integer)value).longValue());
								} else if (field.getType().equalsIgnoreCase("short")) {
									row.put(columnName, ((Integer)value).shortValue());
								} else if (field.getType().equalsIgnoreCase("byte")) {
									row.put(columnName, ((Integer)value).byteValue());
								}  else if (field.getType().equalsIgnoreCase("string")) {
									row.put(columnName, value.toString());
								} else {
									row.put(columnName, value);
								}
							} else {
								row.put(columnName, value);
							}
						}
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			rows.add(row);
		}
		return rows; 
	}

	public List<Map<String, Object>>  getByExpression(ResourceMetaData metaData, String expression,String orderby) {
		return null;
	}

	public int add(BaseResource resource) throws Exception {
		// TODO Auto-generated method stub
		checkAndReviveConnection();
		if (conn == null) {
			ApplicationException e = new ApplicationException(ExceptionSeverity.ERROR, "Unable to connect to database"); 
			throw e;
		}
		ResourceMetaData metaData = resource.getMetaData();
		Map<String, Object> dataMap = resource.convertResourceToMap();
		Map<String, Field> map = metaData.getFields();
		DBCollection table = null;
		table = conn.getCollection(metaData.getTableName());
		BasicDBObject doc = new BasicDBObject();
		if (resource.getId() != null) {
			doc.append("_id", resource.getId());
		}
		boolean arrayExist = false;
		boolean mapExist = false;

		for (Map.Entry<String, Field> entry : map.entrySet()) {
			String columnName =  (String) entry.getKey();
			Field field =   entry.getValue();
			if (field.isTransient())
				continue;
			if (field.isTransient()) continue;
			Object value =  dataMap.get(columnName);
			if (value != null) {
				if (field.getType().equals("Array")) {
					arrayExist = true;
					continue;
				} else if (field.getType().equals("Map")) {
					mapExist = true;
					continue;
				} else {
					if (field.getType().equals("Number")) {
						doc.append(columnName, ((Number)value).doubleValue());
					} else {
						doc.append(columnName, value);
					}
				}
			} else {
				if ((field.getName().equals("creation_time"))) {
					doc.append(columnName, System.currentTimeMillis());
				}
			}
		}

		try {
			table.insert(doc);
		} catch (Exception e) {
			ApplicationLogger.error("Add SQL Failed :: "+e.getMessage(), this.getClass());
			throw e;
		}
		if (arrayExist) {
			for (Map.Entry<String, Field> entry : map.entrySet()) {
				String columnName =  (String) entry.getKey();
				Field field =   entry.getValue();
				if (field.getType().equals("Array")) {
					@SuppressWarnings("unchecked")
					List list =  (List)dataMap.get(columnName);
					if (list == null) continue;
					BasicDBObject searchDoc = new BasicDBObject();
					searchDoc.put("_id", resource.getId());
					for(int i=0; i < list.size(); i++) {
						doc = new BasicDBObject();
						doc.put(columnName, list.get(i));
						BasicDBObject updateObject = new BasicDBObject();
						updateObject.append("$addToSet", doc);
						table.update(searchDoc, updateObject);
					}
				}
			}
		}
		if (mapExist) {
			for (Map.Entry<String, Field> entry : map.entrySet()) {
				String columnName =  (String) entry.getKey();
				Field field =   entry.getValue();
				if (field.getType().equals("Map")) {
					@SuppressWarnings("unchecked")
					Map<String,Object> mapValue =  (Map<String,Object>)dataMap.get(columnName);
					if (mapValue == null) continue;
					BasicDBObject searchDoc = new BasicDBObject();
					searchDoc.put("_id", resource.getId());
					for (Map.Entry<String, Object> entryValue : mapValue.entrySet()) {
						doc = new BasicDBObject();
						doc.put(columnName+"."+entryValue.getKey(), entryValue.getValue());
						BasicDBObject updateObject = new BasicDBObject();
						updateObject.append("$set", doc);
						table.update(searchDoc, updateObject);
					}
				}
			}
		}
		//System.out.println("SuccessFully Added Record ...");
		return 0;
	}

	synchronized public void update_replica(String sql) {
		/*try {
			String filePath = GlobalDataManager.getIntance().getReplicaServerDirectory()+"/"+Util.getReplicaFileName();
			File file = new File(filePath);
			file.getParentFile().mkdirs();
			FileWriter writer = new FileWriter(file,true);
			BufferedWriter bufferWriter = new BufferedWriter(writer);
			bufferWriter.write(System.currentTimeMillis()+"::"+sql+"\n");
			bufferWriter.close();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

	public synchronized int update(BaseResource resource) throws Exception {
		// TODO Auto-generated method stub
		checkAndReviveConnection();
		if (conn == null) {
			ApplicationException e = new ApplicationException(ExceptionSeverity.ERROR, "Unable to connect to database"); 
			throw e;
		}
		ResourceMetaData metaData = resource.getMetaData();
		DBCollection table = conn.getCollection(metaData.getTableName());
		Map<String, Object> dataMap = resource.convertResourceToMap();
		Map<String, Field> map = metaData.getFields();
		BasicDBObject doc = new BasicDBObject();
		boolean arrayExist = false;
		boolean mapExist = false;
		boolean fieldExist = false;

		for (Map.Entry<String, Field> entry : map.entrySet()) {
			String columnName =  (String) entry.getKey();
			Field field =   entry.getValue();
			if (field.isTransient()) continue;
			Object value =  dataMap.get(columnName);
			if (field.getType().equals("Array")) {
				arrayExist = true;
				continue;
			} else if (field.getType().equals("Map")) {
				mapExist = true;
				continue;
			} else if (value != null) {
				if (field.getType().equals("Number")) {
					doc.append(columnName, ((Number)value).doubleValue());
				} else {
					doc.append(columnName, value);
				}
				fieldExist = true;
			} 
		}
		if (fieldExist) {
			try {
				BasicDBObject searchDoc = new BasicDBObject();
				searchDoc.put("_id", resource.getId());
				table.update(searchDoc, new BasicDBObject("$set", doc));
			} catch (Exception e) {
				ApplicationLogger.error("Update SQL Failed :: " + e.getMessage(), this.getClass());
				throw e;
			}
		}
		if (arrayExist) {
			for (Map.Entry<String, Field> entry : map.entrySet()) {
				String columnName =  (String) entry.getKey();
				Field field =   entry.getValue();
				if (field.getType().equals("Array")) {
					@SuppressWarnings("unchecked")
					List list =  (List)dataMap.get(columnName);
					if (list == null) continue;
					BasicDBObject searchDoc = new BasicDBObject();
					searchDoc.put("_id", resource.getId());
					for(int i=0; i < list.size(); i++) {
						doc = new BasicDBObject();
						doc.put(columnName, list.get(i));
						BasicDBObject updateObject = new BasicDBObject();
						updateObject.append("$addToSet", doc);
						table.update(searchDoc, updateObject);
					}
				}
			}
		}
		if (mapExist) {
			for (Map.Entry<String, Field> entry : map.entrySet()) {
				String columnName =  (String) entry.getKey();
				Field field =   entry.getValue();
				if (field.getType().equals("Map")) {
					@SuppressWarnings("unchecked")
					Map<String,Object> mapValue =  (Map<String,Object>)dataMap.get(columnName);
					if (mapValue == null) continue;
					BasicDBObject searchDoc = new BasicDBObject();
					searchDoc.put("_id", resource.getId());
					for (Map.Entry<String, Object> entryValue : mapValue.entrySet()) {
						doc = new BasicDBObject();
						doc.put(columnName+"."+entryValue.getKey(), entryValue.getValue());
						BasicDBObject updateObject = new BasicDBObject();
						updateObject.append("$set", doc);
						table.update(searchDoc, updateObject);
					}
				}
			}
		}
		return 0;
	}

	public int unset(BaseResource resource) throws Exception {
		// TODO Auto-generated method stub
		checkAndReviveConnection();
		if (conn == null) {
			ApplicationException e = new ApplicationException(ExceptionSeverity.ERROR, "Unable to connect to database"); 
			throw e;
		}
		ResourceMetaData metaData = resource.getMetaData();
		DBCollection table = conn.getCollection(metaData.getTableName());
		Map<String, Object> dataMap = resource.convertResourceToMap();
		Map<String, Field> map = metaData.getFields();
		BasicDBObject doc = new BasicDBObject();
		boolean arrayExist = false;
		for (Map.Entry<String, Field> entry : map.entrySet()) {
			String columnName =  (String) entry.getKey();
			Field field =   entry.getValue();
			if (field.isTransient()) continue;
			Object value =  dataMap.get(columnName);
			if (field.getType().equals("Array")) {
				arrayExist = true;
				continue;
			} else if (field.getType().equals("Map")) {
				continue;
			} else if (value != null) {
				continue;
			} 
		}
		if (arrayExist) {
			for (Map.Entry<String, Field> entry : map.entrySet()) {
				String columnName =  (String) entry.getKey();
				Field field =   entry.getValue();
				if (field.getType().equals("Array")) {
					@SuppressWarnings("unchecked")
					ArrayList<Object> list =  (ArrayList<Object>)dataMap.get(columnName);
					if (list == null) continue;
					BasicDBObject searchDoc = new BasicDBObject();
					searchDoc.put("_id", resource.getId());
					for(int i=0; i < list.size(); i++) {
						doc = new BasicDBObject();
						doc.put(columnName, list.get(i));
						BasicDBObject updateObject = new BasicDBObject();
						updateObject.append("$pull", doc);
						System.out.println("unset :" + updateObject);
						table.update(searchDoc, updateObject);
					}
				}
			}
		}

		return 0;
	}

	public int unset(BaseResource resource,String[] fieldnames) throws Exception {
		// TODO Auto-generated method stub
		checkAndReviveConnection();
		if (conn == null) {
			ApplicationException e = new ApplicationException(ExceptionSeverity.ERROR, "Unable to connect to database"); 
			throw e;
		}
		ResourceMetaData metaData = resource.getMetaData();
		DBCollection table = conn.getCollection(metaData.getTableName());
		BasicDBObject doc = new BasicDBObject();
		BasicDBObject searchDoc = new BasicDBObject();
		searchDoc.put("_id", resource.getId());
		for (String fieldname : fieldnames) {
			doc = new BasicDBObject();
			doc.put(fieldname,"");
			BasicDBObject updateObject = new BasicDBObject();
			updateObject.append("$unset", doc);
			table.update(searchDoc, updateObject);
		}
		return 0;
	}
	@Override
	public synchronized int updateCurrentTime(BaseResource resource, String fieldName)
			throws Exception {
		// TODO Auto-generated method stub
		checkAndReviveConnection();
		if (conn == null) {
			ApplicationException e = new ApplicationException(ExceptionSeverity.ERROR, "Unable to connect to database"); 
			throw e;
		}
		ResourceMetaData metaData = resource.getMetaData();
		DBCollection table = conn.getCollection(metaData.getTableName());
		BasicDBObject doc = new BasicDBObject();
		doc.append(fieldName, Util.getCurrentTimeString());
		try {
			BasicDBObject searchDoc = new BasicDBObject();
			searchDoc.put("_id", resource.getId());
			table.update(searchDoc, doc);
		} catch (Exception e) {
			ApplicationLogger.error("Update SQL Failed :: "+e.getMessage(), this.getClass());
			throw e;
		}
		return 0;
	}

	@Override
	public List<Map<String, Object>> getAll(ResourceMetaData metaData) {
		return getAll(metaData,null);
	}

	@Override
	public String verify(ResourceMetaData metaData) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public synchronized int deleteById(ResourceMetaData metaData , String id) throws Exception {
		checkAndReviveConnection();
		if (conn == null) {
			ApplicationException e = new ApplicationException(ExceptionSeverity.ERROR, "Unable to connect to database"); 
			throw e;
		}
		DBCollection table = conn.getCollection(metaData.getTableName());
		try {
			BasicDBObject searchDoc = new BasicDBObject();
			searchDoc.put("_id", id);
			table.remove(searchDoc);
		} catch (Exception e) {
			ApplicationLogger.error("Update SQL Failed :: "+e.getMessage(), this.getClass());
			throw e;
		}
		return 0;
	}

	public boolean checkConnection() {
		try {
			if (conn == null)
				connect();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}
	void checkAndReviveConnection() {
		try {
			if (conn == null) {
				connect();
			}
			/*String sql = "SELECT CURDATE()";
			java.sql.Statement st;
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			rs.close();
			st.close();*/
		} catch (Exception e) {
			e.printStackTrace();
			conn = null;
			connect();
		}
	}


	public byte getType() {
		return DBConsts.DB_TYPE_MONGODB;
	}

	@Override
	public void validateUniqueKey(ResourceMetaData metadata, String[] keys,
			Map<String, Object> data) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void createTable(ResourceMetaData metaData) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void alterTable(ResourceMetaData metaData, Field field,
			String operation) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Map<String, Object>> getById(ResourceMetaData metaData,
			String[] ids,String[] orderBy, Expression expression) throws Exception {
		if (ids == null) {
			return null;
		}
		BasicDBList list = new  BasicDBList();
		
		for(int i = 0 ; i < ids.length ; i++ )
			list.add(ids[i]);
		Expression e1 = new Expression("_id", REL_OP.IN, list);
		Expression e;
		if (expression != null) {
			e = new Expression(e1, LOG_OP.AND, expression);
		} else {
			e = e1;
		}
		return getByExpression(metaData, e, orderBy); 
	}

	@Override
	public void log(BaseResource resource, Date logTime) throws Exception {
		// TODO Auto-generated method stub
		checkAndReviveConnection();
		if (conn == null) {
			ApplicationException e = new ApplicationException(ExceptionSeverity.ERROR, "Unable to connect to database"); 
			throw e;
		}
		ResourceMetaData metaData = resource.getMetaData();
		Map<String, Object> dataMap = resource.convertResourceToMap();
		Map<String, Field> map = metaData.getFields();
		DBCollection table = null;
		table = conn.getCollection(metaData.getName()+"_log");
		BasicDBObject searchDoc = new BasicDBObject();
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT")); // locale-specific
		cal.setTime(logTime);
		int hh = cal.get(Calendar.HOUR_OF_DAY);
		int mm = cal.get(Calendar.MINUTE);
		int ss = cal.get(Calendar.SECOND);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		long time = cal.getTimeInMillis();
		searchDoc.append("creation_time", new Date(time));
		searchDoc.append("id", resource.getId());
		BasicDBObject _doc = new BasicDBObject();
		BasicDBObject doc = new BasicDBObject();
		for (Map.Entry<String, Field> entry : map.entrySet()) {
			String columnName =  (String) entry.getKey();
			Field field =   entry.getValue();
			if ("id".equalsIgnoreCase(field.getName()))
				continue;
			Object value =  dataMap.get(columnName);
			if (value != null) {
				doc.append(columnName, value);
			} 
		}
		try {
			_doc = new BasicDBObject("$set",new BasicDBObject("logs."+String.format("%05d", (hh*60*60)+(mm*60)+ss),doc));
			table.update(searchDoc, _doc, true, false);
		} catch (Exception e) {
			ApplicationLogger.error("Add SQL Failed :: "+e.getMessage(), this.getClass());
			throw e;
		}
		//System.out.println("SuccessFully logged Record ...");
		return ;
	}

	/*@Override
	public void addTimeSeries(BaseResource resource, String counter, Date logTime,
			Object value) throws Exception {
		// TODO Auto-generated method stub
		checkAndReviveConnection();
		if (conn == null) {
			ApplicationException e = new ApplicationException(ExceptionSeverity.ERROR, "Unable to connect to database"); 
			throw e;
		}
		ResourceMetaData metaData = resource.getMetaData();
		DBCollection table = null;
		table = conn.getCollection(metaData.getName()+"_time_series");
		BasicDBObject searchDoc = new BasicDBObject();
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC")); // locale-specific
		cal.setTime(logTime);
		System.out.println(logTime);
		int hh = cal.get(Calendar.HOUR_OF_DAY);
		int mm = cal.get(Calendar.MINUTE);
		int ss = cal.get(Calendar.SECOND);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		long time = cal.getTimeInMillis();
		searchDoc.append("creation_time", new Date(time));
		System.out.println("Time searies Date "+ new Date(time));
		searchDoc.append("object_id", resource.getId());
		searchDoc.append("counter", counter);
		BasicDBObject _doc = new BasicDBObject();
		try {
			_doc = new BasicDBObject("$set",new BasicDBObject("values."+String.format("%05d", (hh*60*60)+(mm*60)+ss),value));
			table.update(searchDoc, _doc, true, false);
		} catch (Exception e) {
			ApplicationLogger.error("Add SQL Failed :: "+e.getMessage(), this.getClass());
			throw e;
		}
		System.out.println("SuccessFully added time series Record ...");
		return ;
	}
	 */
	@Override
	public void updateStartTime(BaseResource resource, Date date)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateStopTime(BaseResource resource, Date date)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public int incrementCounter(BaseResource resource, String counter,
			int increment) throws Exception {
		checkAndReviveConnection();
		if (conn == null) {
			ApplicationException e = new ApplicationException(ExceptionSeverity.ERROR, "Unable to connect to database"); 
			throw e;
		}
		ResourceMetaData metaData = resource.getMetaData();
		DBCollection table = conn.getCollection(metaData.getTableName());
		BasicDBObject doc = new BasicDBObject();
		doc.append(counter, increment);
		try {
			BasicDBObject searchDoc = new BasicDBObject();
			searchDoc.put("_id", resource.getId());
			table.update(searchDoc, new BasicDBObject("$inc", doc));
		} catch (Exception e) {
			ApplicationLogger.error("Update SQL Failed :: "+e.getMessage(), this.getClass());
			throw e;
		}
		return 0;
	}

	@Override
	public int deleteByExpression(ResourceMetaData metaData,
			Expression expression) throws Exception {
		// TODO Auto-generated method stub
		checkAndReviveConnection();
		if (conn == null) {
			ApplicationException e = new ApplicationException(ExceptionSeverity.ERROR, "Unable to connect to database"); 
			throw e;
		}
		DBCollection table = conn.getCollection(metaData.getTableName());
		try {
			BasicDBObject searchDoc = getCondition(metaData, expression);
			table.remove(searchDoc);
		} catch (Exception e) {
			ApplicationLogger.error("Delete SQL Failed :: "+e.getMessage(), this.getClass());
			throw e;
		}
		return 0;
	}

	public void createDistributionKey(ResourceMetaData metaData, String[] fieldNames)
			throws Exception {
		// TODO Auto-generated method stub
		checkAndReviveConnection();
		if (conn == null) {
			ApplicationException e = new ApplicationException(ExceptionSeverity.ERROR, "Unable to connect to database"); 
			throw e;
		}
		CommandResult result = conn.getMongo().getDB("admin").command(new BasicDBObject("enableSharding", metaData.getCluster()));
		System.out.println("EnableSharding Result " + result.getErrorMessage());
		//shardCollection("test_db.test_collection", { "_id": "hashed" } )
		BasicDBObject indexDoc = new BasicDBObject();
		for (String fieldName : fieldNames) {
			if (fieldName.equals("id")) {
				fieldName = "_id";
			}
			indexDoc.append(fieldName, "hashed");
		}
		BasicDBObject commandDoc = new BasicDBObject();
		commandDoc.append("shardCollection", metaData.getCluster()+"."+metaData.getTableName());
		commandDoc.append("key",indexDoc);

		result =  conn.getMongo().getDB("admin").command(commandDoc);
		System.out.println("ShardCollection Result "+result.getErrorMessage());
		return;
	}

	@Override
	public void createIndex(ResourceMetaData metaData, String[] fieldNames)
			throws Exception {
		// TODO Auto-generated method stub
		checkAndReviveConnection();
		if (conn == null) {
			ApplicationException e = new ApplicationException(ExceptionSeverity.ERROR, "Unable to connect to database"); 
			throw e;
		}
		DBCollection table = conn.getCollection(metaData.getTableName());
		BasicDBObject indexDoc = new BasicDBObject();
		String indexString = "";
		boolean onlyId = false;
		for (String fieldName : fieldNames) {
			if (!indexString.equals(""))
				indexString = indexString + ",";
			if (fieldName.equals("id")) {
				fieldName = "_id";
				if (fieldNames.length == 1) {
					onlyId = true; 
				}
			}
			indexString = indexString + fieldName;
			indexDoc.append(fieldName, "hashed");
		}
		try {
			ApplicationLogger.info("Creating index  for :: "+metaData.getTableName().toString() + " fields :: "+indexString, this.getClass());
			table.createIndex(indexDoc);
			if (onlyId) {
				indexDoc = new BasicDBObject();
				indexDoc.append("id", "hashed");
				ApplicationLogger.info("Creating index  for :: "+metaData.getTableName().toString() + " fields :: id", this.getClass());
				table.createIndex(indexDoc);
			}
		} catch (Exception e) {
			ApplicationLogger.error("Creating index  :: "+e.getMessage(), this.getClass());
			throw e;
		}
		return;
	}

	@Override
	public List<Map<String, Object>> getAll(ResourceMetaData metaData,
			String[] orderby) {
		// TODO Auto-generated method stub
		checkAndReviveConnection();
		if (conn == null) {
			ApplicationException e = new ApplicationException(ExceptionSeverity.ERROR, "Unable to connect to database"); 
			e.printStackTrace();
			return null;
		}
		List<Map<String, Object>> rows = new ArrayList<Map<String, Object>>();
		DBCollection table = conn.getCollection(metaData.getTableName());
		DBCursor cursor;
		if (orderby != null) {
			BasicDBObject sortFields = getSortField(orderby);
			cursor = table.find().sort(sortFields);
		} else {
			cursor = table.find();
		}
		while (cursor.hasNext()) {
			BasicDBObject dataMap = (BasicDBObject)cursor.next();
			Map<String, Field> map = metaData.getFields();
			Map<String, Object> row = new HashMap<String, Object>();
			for (Map.Entry<String, Field> entry : map.entrySet()) {
				String columnName =  (String) entry.getKey();
				Object value =  dataMap.get(columnName);
				if (value != null) {
					row.put(columnName, value);
				}
			}
			rows.add(row);
		}
		return rows; 

	}

	@Override
	public List<Map<String, Object>> getPage(ResourceMetaData metaData,
			Expression expression, String[] order, int page, int number) {
		// TODO Auto-generated method stub
		
		return getByExpression(metaData, expression,order, page, number);
	}

	@Override
	public void saveFile(String folder, String fileName,String tempFile)
			throws Exception {
		// TODO Auto-generated method stub
		checkAndReviveConnection();
		if (conn == null) {
			ApplicationException e = new ApplicationException(ExceptionSeverity.ERROR, "Unable to connect to database"); 
			e.printStackTrace();
			throw e;
		}
		File file = new File(tempFile);
		GridFS gridfs = new GridFS(conn, folder);
		GridFSInputFile gfsFile = gridfs.createFile(file);
		gfsFile.setFilename(tempFile);
		gfsFile.save();
	}

	@Override
	public int incrementValue(BaseResource resource, String fieldName,
			double increment) throws Exception {
		checkAndReviveConnection();
		if (conn == null) {
			ApplicationException e = new ApplicationException(ExceptionSeverity.ERROR, "Unable to connect to database"); 
			throw e;
		}
		ResourceMetaData metaData = resource.getMetaData();
		DBCollection table = conn.getCollection(metaData.getTableName());
		BasicDBObject doc = new BasicDBObject();
		doc.append(fieldName, increment);
		try {
			BasicDBObject searchDoc = new BasicDBObject();
			searchDoc.put("_id", resource.getId());
			table.update(searchDoc, new BasicDBObject("$inc", doc));
		} catch (Exception e) {
			ApplicationLogger.error("Update SQL Failed :: "+e.getMessage(), this.getClass());
			throw e;
		}
		return 0;

	}

	@Override
	public List<Map<String, Object>> getById(ResourceMetaData metaData,
			String[] ids, String[] orderBy, Expression expression, int pageno,
			int pagesize) throws Exception {
		// TODO Auto-generated method stub
		BasicDBList list = new  BasicDBList();
		for(int i = 0 ; i < ids.length ; i++ )
			list.add(ids[i]);
		Expression e1 = new Expression("_id", REL_OP.IN, list);
		Expression e;
		if (expression != null) {
			e = new Expression(e1, LOG_OP.AND, expression);
		} else {
			e = e1;
		}
		if (pagesize == 0) {
			return getByExpression(metaData, e, orderBy);
		}
		return getByExpression(metaData,e,orderBy,pageno,pagesize);
	}

	@Override
	public long getByCountExpression(ResourceMetaData metaData,
			Expression expression) {
		// TODO Auto-generated method stub
		checkAndReviveConnection();
		if (conn == null) {
			ApplicationException e = new ApplicationException(ExceptionSeverity.ERROR, "Unable to connect to database"); 
			e.printStackTrace();
			return 0;
		}
		DBCollection table = conn.getCollection(metaData.getTableName());
		BasicDBObject condition = getCondition(metaData,expression);
		//System.out.println(condition);
		return table.count(condition);
	}
}
