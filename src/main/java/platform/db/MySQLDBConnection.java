package platform.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import platform.log.ApplicationLogger;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.Conf;
import platform.util.ExceptionSeverity;
import platform.util.Field;
import platform.util.Util;


public class MySQLDBConnection extends DbConnection {
	String driver = "com.mysql.jdbc.Driver";
	Connection conn = null;
	public static Conf conf = null;
	String cluster;
	String clusterId;
	Map<String, Object> noSyncMap;

	public String getClusterId() {
		return clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public MySQLDBConnection() {
		super();
		noSyncMap = new HashMap<String, Object>();
		cluster = "main";
		clusterId = "0";
		if (conf == null) {
			conf = new Conf("db");
			conf.loadProperties();
		}
		if ( conf.getValue("server") != null)
			server = conf.getValue("server");

		if ( conf.getValue("username") != null)
			username = conf.getValue("username");

		if ( conf.getValue("database") != null)
			database = conf.getValue("database");

		if ( conf.getValue("donot_sync_resources") != null) {
			String donot_sync_resources = conf.getValue("donot_sync_resources");
			String[] resources = donot_sync_resources.split(",");
			for(int i=0;i<resources.length;i++) {
				noSyncMap.put(resources[i].toLowerCase(), true);
			}
		}
		if ( conf.getValue("password") != null) {
			password = conf.getValue("password");
			if (password.startsWith("^^")) {
				password = decodePassword(password);
			} else {
				password = encodePassword(password);
				conf.setValue("password", password);
				conf.saveProperties();
				password = decodePassword(password);
			}


		}

	}

	public MySQLDBConnection(String clusterId, String cluster, String server,String username,String password,String databse) {
		this.cluster = cluster;
		this.server = server;
		this.username = username;
		this.password = password;
		this.database = databse;
		this.clusterId = clusterId;
		noSyncMap = new HashMap<String, Object>();
		if (conf == null) {
			conf = new Conf("db");
			conf.loadProperties();
		}
		if ( conf.getValue("donot_sync_resources") != null) {
			String donot_sync_resources = conf.getValue("donot_sync_resources");
			String[] resources = donot_sync_resources.split(",");
			for(int i=0;i<resources.length;i++) {
				noSyncMap.put(resources[i].toLowerCase(), true);
			}
		}
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
			String url = "jdbc:mysql://"+server+":"+port+"/";
			try {
				Class.forName(driver).newInstance();
				conn = DriverManager.getConnection(url+database+"?zeroDateTimeBehavior=convertToNull&dontTrackOpenResources=true",username,password);
			} catch(Exception e) {
				ApplicationLogger.error("Unable to connect the Database "+database +" server :" +server, this.getClass());
				e.printStackTrace(); 

			}
		}
	}

	public void disconnect() {
		try  {
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void reconnect() {
		conn = null;
		connect();
	}

	public int executeSQL(String sql) throws Exception {
		checkAndReviveConnection();
		if (conn == null) {
			ApplicationLogger.error("Unable to connect to database", this.getClass());
			return -1;
		}
		int result;
		Statement st;
		st =  conn.createStatement();
		result = st.executeUpdate(sql);
		st.close();
		//System.out.println(sql);
		return result;
	}


	public List<Map<String, Object>> get(String sql) {
		checkAndReviveConnection();
		if (conn == null) {
			ApplicationLogger.error("Unable to connect to database", this.getClass());
			return null;
		}
		java.sql.Statement st = null;
		List<Map<String, Object>> rows = new ArrayList<Map<String, Object>>();
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Map<String, Object> row = new HashMap<String, Object>();
				ResultSetMetaData  map =  rs.getMetaData();
				int columnCount = map.getColumnCount();
				for(int i =0 ; i < columnCount; i++) {
					String columnName =  map.getColumnName(i+1);
					row.put(columnName,rs.getObject(i+1));
				}
				rows.add(row);
			}
			rs.close();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error with SQL::"+sql);
			e.printStackTrace();
		}
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rows; 
	}

	public Map<String, Object> get(ResourceMetaData metaData, String Id) {
		checkAndReviveConnection();
		if (conn == null) {
			ApplicationLogger.error("Unable to connect to database", this.getClass());
			return null;
		}
		String table_name = metaData.getName();
		String sql = "select * from " + table_name;
		sql = sql + " where id = '"+Id+"'";
		Map<String, Object> row = null;
		java.sql.Statement st = null;
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				row = new HashMap<String, Object>();
				Map<String, Field> map = metaData.getFields();
				for (Map.Entry<String, Field> entry : map.entrySet()) {
					String columnName =  (String) entry.getKey();
					if (rs.getObject(columnName) != null) {
						try {
							row.put(columnName,rs.getObject(columnName));
						} catch (SQLException e) {
							System.out.println(" Error :: in column " +columnName);
							throw e;
						}
					}
				}
				break;
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return row;
	}


	public List<Map<String, Object>>  getByExpression(ResourceMetaData metaData, String expression,String orderby) {
		checkAndReviveConnection();
		if (conn == null) {
			ApplicationLogger.error("Unable to connect to database", this.getClass());
			return null;
		}
		String table_name = metaData.getName();
		String sql = "select * from " + table_name;
		if (expression != null) {
			sql = sql + " where " + expression;
		}
		if (orderby != null) {
			sql = sql + " order by "+orderby;
		}

		java.sql.Statement st = null;
		List<Map<String, Object>> rows = new ArrayList<Map<String, Object>>();
		try {
			st = conn.createStatement();
			//System.out.println(sql);
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Map<String, Object> row = new HashMap<String, Object>();
				Map<String, Field> map = metaData.getFields();
				for (Map.Entry<String, Field> entry : map.entrySet()) {
					String columnName =  (String) entry.getKey();
					try {
						row.put(columnName,rs.getObject(columnName));
					} catch (SQLException e) {
						rs.close();
						System.out.println(" Error :: in column " +columnName);
						throw e;
					}
				}
				rows.add(row);
			}
			rs.close();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error with SQL::"+sql);
			e.printStackTrace();
		}
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rows; 
	}

	String getPrimaryKeyCondition(BaseResource r) {
		String id = r.getId();
		if (id == null) return null;
		return " id = '"+id+"'";
	}

	String getPrimaryKeyCondition(String id) {
		if (id == null) return null;
		return " id = '"+id+"'";
	}

	public synchronized int add(BaseResource resource) throws Exception {
		// TODO Auto-generated method stub
		checkAndReviveConnection();
		if (conn == null) {
			ApplicationException e = new ApplicationException(ExceptionSeverity.ERROR, "Unable to connect to database"); 
			throw e;
		}
		ResourceMetaData metaData = resource.getMetaData();
		Map<String, Object> dataMap = resource.convertResourceToMap();
		Map<String, Field> map = metaData.getFields();
		String valueString = "";
		String fieldString = "";

		for (Map.Entry<String, Field> entry : map.entrySet()) {
			String columnName =  (String) entry.getKey();
			Field field =   entry.getValue();
			Object value =  dataMap.get(columnName);
			if (value != null) {
				if (fieldString != "") {
					fieldString = fieldString + ",";
					valueString = valueString + ",";
				}
				fieldString = fieldString+columnName;
				valueString  = valueString  + getValue(field,value);
			} else {
				if (field.getName().equals("creation_time")) {
					fieldString = fieldString + ",creation_time";
					valueString = valueString + ",";
					valueString  = valueString  + "'" + Util.getCurrentTimeString()+"'";
				}
			}

		}

		String sql = "insert into "+metaData.getName()+ " ( " + fieldString + ") values (" +valueString+")";
		//System.out.println(sql);
		try {
			executeSQL(sql);
		} catch (Exception e) {
			ApplicationLogger.error("Add SQL Failed :: "+e.getMessage(), this.getClass());
			ApplicationLogger.info(sql, this.getClass());
			throw e;
		}
		if (noSyncMap.get(resource.getMetaData().getName().toLowerCase()) == null)
			update_replica(sql);
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
		String cond = getPrimaryKeyCondition(resource);
		if (cond == null)  {
			ApplicationException e = new ApplicationException(ExceptionSeverity.ERROR, "Id is null"); 
			throw e;
		}
		ResourceMetaData metaData = resource.getMetaData();
		Map<String, Object> dataMap = resource.convertResourceToMap();
		Map<String, Field> map = metaData.getFields();
		String updateString = "";
		for (Map.Entry<String, Field> entry : map.entrySet()) {
			String columnName =  (String) entry.getKey();
			Field field =   entry.getValue();
			Object value =  dataMap.get(columnName);
			if (value != null) {
				if (updateString != "")
					updateString = updateString + ",";
					updateString = updateString + getString(field, value);
			}
		}
		String sql = "update "+metaData.getName()+ " set " + updateString + " where " +cond;
		//System.out.println(sql);
		try {
			executeSQL(sql);
		} catch (Exception e) {
			ApplicationLogger.error("Update SQL Failed :: "+e.getMessage(), this.getClass());
			ApplicationLogger.info(sql, this.getClass());
			throw e;
		}
		if (noSyncMap.get(resource.getMetaData().getName().toLowerCase()) == null)
			update_replica(sql);
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
		String cond = getPrimaryKeyCondition(resource);
		if (cond == null)  {
			ApplicationException e = new ApplicationException(ExceptionSeverity.ERROR, "Id is null"); 
			throw e;
		}
		ResourceMetaData metaData = resource.getMetaData();
		String updateString = "";
		updateString = updateString + fieldName + "='"+Util.getCurrentTimeString()+"'";
		String sql = "update "+metaData.getName()+ " set " + updateString + " where " +cond;
		try {
			executeSQL(sql);
		} catch (Exception e) {
			ApplicationLogger.error("Update time SQL Failed :: "+e.getMessage(), this.getClass());
			ApplicationLogger.info(sql, this.getClass());
			throw e;
		}
		if (noSyncMap.get(resource.getMetaData().getName().toLowerCase()) == null)
			update_replica(sql);
		return 0;
	}

	@Override
	public List<Map<String, Object>> getAll(ResourceMetaData metaData) {
		checkAndReviveConnection();
		if (conn == null) {
			ApplicationLogger.error("Unable to connect to database", this.getClass());
			return null;
		}
		String table_name = metaData.getName();
		String sql = "select * from " + table_name;
		java.sql.Statement st = null;
		List<Map<String, Object>> rows = new ArrayList<Map<String, Object>>();
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Map<String, Object> row = new HashMap<String, Object>();
				Map<String, Field> map = metaData.getFields();
				for (Map.Entry<String, Field> entry : map.entrySet()) {
					String columnName =  (String) entry.getKey();
					row.put(columnName,rs.getObject(columnName));
				}
				rows.add(row);
			}

			rs.close();
			st.close();
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rows; 
	}

	@Override
	public String verify(ResourceMetaData metaData) throws ApplicationException {
		// TODO Auto-generated method stub
		checkAndReviveConnection();
		String table_name = metaData.getName();
		String sql = "select COLUMN_NAME from  information_schema.COLUMNS where TABLE_NAME='" + table_name+"'";
		java.sql.Statement st = null;
		String errors = null;
		Map<String, Object> columns = new HashMap<String, Object>();
		try {
			if (conn == null) {
				connect();
			}
			int columnCount = 0;
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				columns.put(rs.getString("COLUMN_NAME").toLowerCase(),1);
				columnCount++;
			}
			rs.close();
		
			if (columnCount > 0) {
				Map<String, Field> map = metaData.getFields();
				for (Map.Entry<String, Field> entry : map.entrySet()) {
					Field field = entry.getValue();
					String columnName =  (String) entry.getKey();
					if (columns.get(columnName.toLowerCase()) == null) {
						if (errors == null)
							errors = "";
						errors = errors + "Mismatched Columns ::"+ table_name+"-->"+columnName + ",\n";
						try {
							alterTable(metaData, field, "ADD");
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							throw new ApplicationException(ExceptionSeverity.ERROR,"alter table failed");
						}
					}
				}
			} else {
				createTable(metaData);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			ApplicationLogger.error("Database mismatch existing from system", this.getClass());
			e.printStackTrace();
			createTable(metaData);
		}
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return errors; 
	}

	@Override
	public synchronized int deleteById(ResourceMetaData metaData , String id) throws Exception {
		checkAndReviveConnection();
		// TODO Auto-generated method stub
		String table_name = metaData.getName();
		String sql = "delete from "+ table_name + " " + " where " + getPrimaryKeyCondition(id);
		executeSQL(sql);
		//System.out.println(sql);
		if (noSyncMap.get(metaData.getName().toLowerCase()) == null)
			update_replica(sql);
		return 0;
	}

	public boolean checkConnection() {
		try {
			if (conn == null)
				connect();
			String sql = "SELECT CURDATE()";
			java.sql.Statement st;
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			rs.close();
			st.close();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}
	void checkAndReviveConnection() {
		try {
			if (conn == null) {
				connect();
			}
			String sql = "SELECT CURDATE()";
			java.sql.Statement st;
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			rs.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
			conn = null;
			connect();
		}
	}

	String getString(Field field, Object value) {
		String val = field.getName()+"="+getValue(field, value);
		return val;
	}

	String getDefaultString(Field field) {
		String val = "";
		if (field.getType() == Field.VALUE_TYPE_INT) {
			val =  field.getDefaultValue().toString();
		} else if (field.getType() == Field.VALUE_TYPE_NUMBER) {
			val =  field.getDefaultValue().toString();
		} else if (field.getType() == Field.VALUE_TYPE_TIMESTAMP) {
			val =  field.getDefaultValue().toString();
		} else {
			val= "'"+ field.getDefaultValue().toString()+"'";
		}
		return val;
	}
	String getValue(Field field, Object value) {
		String val = "";
		if (field.getType() == Field.VALUE_TYPE_INT) {
			val = ""+value;
		} else if (field.getType() == Field.VALUE_TYPE_DATE) {
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			java.sql.Date date = (java.sql.Date)value;
			val = "STR_TO_DATE("+"'"+dateFormat.format(date)+"'"+", '%d/%m/%Y')";
		} else {
			val="'"+ value+"'";
		}
		return val;
	}
	@Override
	public void validateUniqueKey(ResourceMetaData metaData, String[] keys,
			Map<String, Object> data) throws Exception {
		// TODO Auto-generated method stub
		checkAndReviveConnection();
		if (conn == null) {
			ApplicationLogger.error("Unable to connect to database", this.getClass());
			throw new ApplicationException(ExceptionSeverity.ERROR, "Unable to connect database");
		}
		String keysStr = "";
		String table_name = metaData.getName();
		String sql = "select * from " + table_name;
		String condition = "";
		for(int i = 0; i < keys.length; i++ ) {
			Field field = metaData.getField(keys[i]);
			if (field == null) continue;
			if (condition != "") {
				condition = condition + " and ";
				keysStr = keysStr + ",";
			}
			condition = condition + getString(field, data.get(keys[i]));
			keysStr = keysStr + keys[i];
		}
		if (condition != null) {
			sql = sql +" where " + condition;
		}
		String primaryKey = (String)data.get("id");
		List<Map<String, Object>> rows = new ArrayList<Map<String, Object>>();
		try {
			java.sql.Statement st;
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Map<String, Object> row = new HashMap<String, Object>();
				Map<String, Field> map = metaData.getFields();
				for (Map.Entry<String, Field> entry : map.entrySet()) {
					String columnName =  (String) entry.getKey();
					row.put(columnName,rs.getObject(columnName));
				}
				rows.add(row);
			}
			rs.close();
			st.close();
			if (rows.size()  == 1) {
				if (primaryKey == null) {
					throw new ApplicationException(ExceptionSeverity.ERROR, "Already configured [" + keysStr+"]");
				}
				Map<String, Object> row = rows.get(0);
				if (!row.get("id").equals(primaryKey)) {
					throw new ApplicationException(ExceptionSeverity.ERROR, "Already defined  [" + keysStr+"]");
				}
			} else if (rows.size() > 1) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Already configured [" + keysStr+"]");
			}
		} catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public Connection getConnection() {
		return conn;
	}

	public byte getType() {
		return DBConsts.DB_TYPE_MYSQL;
	}

	String getFieldString(Field field) {
		String commandStr ="";
		if (field.getType() == Field.VALUE_TYPE_INT) {
			if (field.getLength() != 0) {
				commandStr = commandStr+field.getName()+" int("+field.getLength()+")";
			} else {
				commandStr = commandStr +field.getName()+" int(10)";
			}

		} else if (field.getType() == Field.VALUE_TYPE_STRING) {
			if (field.getLength() != 0) {
				commandStr = commandStr +field.getName()+" varchar("+field.getLength()+")";
			} else {
				commandStr = commandStr +field.getName()+" varchar(128)";
			}
		} else if (field.getType() == Field.VALUE_TYPE_NUMBER) {
			if (field.getLength() != 0) {
				if (field.getPrecision() != 0) {
					commandStr = commandStr +field.getName()+" numeric("+field.getLength()+","+field.getPrecision()+")";
				} else { 
					commandStr = commandStr +field.getName()+" numeric("+field.getLength()+")";
				}
			} else {
				commandStr = commandStr +field.getName()+" numeric(10,2)";
			}
		} else if (field.getType() == Field.VALUE_TYPE_TIMESTAMP) {
			commandStr = commandStr +field.getName()+" timestamp ";
		} else if (field.getType() == Field.VALUE_TYPE_DATE) {
			commandStr = commandStr +field.getName()+" date ";
		} 
		if (field.isRequired()) {
			commandStr = commandStr + " NOT NULL ";
		}

		if (field.getDefaultValue() != null) { 
			commandStr = commandStr + " DEFAULT  " + getDefaultString(field);
		}
		return commandStr;
	}

	@Override
	public void createTable(ResourceMetaData metaData) {
		// TODO Auto-generated method stub
		ApplicationLogger.info("Creating Table " +metaData.getName() , this.getClass());
		Map<String, Field> map = metaData.getFields();
		String commandStr = "";
		for (Map.Entry<String, Field> entry : map.entrySet()) {
			Field field =   entry.getValue();
			commandStr = commandStr + "\t";
			commandStr = commandStr +getFieldString(field);
			commandStr = commandStr + ",\n";
		}
		String sql = "create table "+metaData.getName()+ " ( \n"; 
		sql = sql + commandStr;
		sql = sql + " PRIMARY KEY (id)\n";
		sql = sql + " );\n\n";
		System.out.println(sql);
		try {
			executeSQL(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		}
	}

	@Override
	public void alterTable(ResourceMetaData metaData,Field field, String operation) {
		// TODO Auto-generated method stub
		String sql = "alter table "+metaData.getName(); 
		if (operation.equals("ADD")) {
			sql = sql + " add ";
			sql = sql + getFieldString(field)+";";
		}
		System.out.println(sql);
		try {
			executeSQL(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		}

	}


	@Override
	public List<Map<String, Object>> getByExpression(ResourceMetaData metaData,
			Expression expression,String[] orderby) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void log(BaseResource resource, Date logTime) throws Exception {
		// TODO Auto-generated method stub
		
	}

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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int unset(BaseResource resource)
			throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map<String, Object> get(ResourceMetaData metaData, String Id,
			String[] fieldNames) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> getById(ResourceMetaData metaData,
			String[] ids, String[] orderBy, Expression expression) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByExpression(ResourceMetaData metaData,
			Expression expression) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void createIndex(ResourceMetaData metaData, String[] fieldNames)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createDistributionKey(ResourceMetaData metaData,
			String[] fieldNames) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Map<String, Object>> getAll(ResourceMetaData metaData,
			String[] orderby) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int unset(BaseResource resource, String[] fieldnames)
			throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Map<String, Object>> getPage(ResourceMetaData metaData,
			Expression expression, String[] order, int page, int number) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveFile(String folder, String file, String tempFile)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int incrementValue(BaseResource resource, String fieldName,
			double increment) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Map<String, Object>> getById(ResourceMetaData metaData,
			String[] ids, String[] orderBy, Expression expression, int pageno,
			int pagesize) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getByCountExpression(ResourceMetaData metaData,
			Expression expression) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
