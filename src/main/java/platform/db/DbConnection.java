package platform.db;


import java.sql.Connection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.Field;
public abstract class DbConnection {
 public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
 String server;
 int port;
 String database;
 String username;
 String password;
 boolean free;
 boolean isConnected;
	
	public DbConnection() {
		 server = "localhost";
		 database = "sdp";
		 username = "root";
		 password = "";
		 port = 3306;
		 free = true;
	 }
	 
	 public abstract String verify(ResourceMetaData metaData) throws ApplicationException;
	 abstract public void disconnect();
	 abstract  public void connect() throws ApplicationException ;
	 abstract public void reconnect() throws ApplicationException;
	 abstract public int update(BaseResource resource) throws Exception;
	 abstract public int updateCurrentTime(BaseResource resource, String fieldName) throws Exception;
	 abstract public int deleteById(ResourceMetaData metaData, String id) throws Exception;
	 abstract public int deleteByExpression(ResourceMetaData metaData, Expression expression) throws Exception;
	 abstract public List<Map<String, Object>> getById(ResourceMetaData metaData, String[] ids, String[] orderBy, Expression expression) throws Exception;
	 abstract public List<Map<String, Object>> getById(ResourceMetaData metaData, String[] ids, String[] orderBy, Expression expression,int pageno, int pagesize) throws Exception;
	 abstract public int add(BaseResource resource) throws Exception;
	 abstract  public Map<String, Object> get(ResourceMetaData metaData, String Id);
	 abstract  public Map<String, Object> get(ResourceMetaData metaData, String Id,String[] fieldNames);
	 abstract public List<Map<String, Object>> getByExpression(ResourceMetaData metaData, Expression expression, String[] orderby);
	 abstract public List<Map<String, Object>> getPage(ResourceMetaData metaData, Expression expression, String[] order, int page, int number); 
	 public abstract void validateUniqueKey(ResourceMetaData metadata,String[] keys,Map<String,Object> data) throws Exception;
	 abstract public List<Map<String, Object>>  getAll(ResourceMetaData metaData) ;
	 abstract public List<Map<String, Object>>  getAll(ResourceMetaData metaData,String[] orderby) ;
	 abstract public void log(BaseResource resource, Date logTime) throws Exception;
	 abstract public void updateStartTime(BaseResource resource,Date date) throws Exception;
	 abstract public void updateStopTime(BaseResource resource,Date date) throws Exception;
	 abstract public int incrementCounter(BaseResource resource, String counter,int increment) throws Exception;
	 abstract public int incrementValue(BaseResource resource, String fieldName,double increment) throws Exception;
	 abstract public int unset(BaseResource resource) throws Exception;
	 abstract public int unset(BaseResource resource,String[] fieldnames) throws Exception;
	 abstract public long getByCountExpression(ResourceMetaData metaData, Expression expression);
		
	 public Connection getConnection() {
		 return null;
	 }
	 public  void aquire() {
			free = false;
	 }
	 public void release() {
			free = true;
	 }
	 public boolean isFree() {
			return free;
	 }
	 abstract public byte getType();
	 abstract public void  saveFile(String folder,String file,String tempFile) throws Exception;
	 abstract public void  createTable(ResourceMetaData metaData) throws Exception;
	 abstract public void  createIndex(ResourceMetaData metaData, String[] fieldNames) throws Exception;
	 abstract public void  createDistributionKey(ResourceMetaData metaData, String[] fieldNames) throws Exception;
	 abstract public void  alterTable(ResourceMetaData metaData,Field field,String operation) throws Exception;
}
