package platform.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import platform.config.Reader;
import platform.defined.DBNameEnum;
import platform.helper.ActivityHelper;
import platform.helper.AlertHelper;
import platform.helper.ApplianceHelper;
import platform.helper.Appliance_makeHelper;
import platform.helper.Appliance_mapHelper;
import platform.helper.Appliance_modelHelper;
import platform.helper.Appliance_partHelper;
import platform.helper.Appliance_running_logHelper;
import platform.helper.Appliance_time_seriesHelper;
import platform.helper.Appliance_typeHelper;
import platform.helper.BaseHelper;
import platform.helper.ClusterHelper;
import platform.helper.ControllerHelper;
import platform.helper.CustomerHelper;
import platform.helper.Customer_mapHelper;
import platform.helper.DeviceHelper;
import platform.helper.FeedHelper;
import platform.helper.GatewayHelper;
import platform.helper.Hardware_vendorHelper;
import platform.helper.LocationHelper;
import platform.helper.Managed_objectHelper;
import platform.helper.NotificationHelper;
import platform.helper.ProfileHelper;
import platform.helper.RuleHelper;
import platform.helper.Rule_actionHelper;
import platform.helper.Rule_conditionHelper;
import platform.helper.SensorHelper;
import platform.helper.SessionHelper;
import platform.helper.UserHelper;
import platform.helper.User_mapHelper;
import platform.log.ApplicationLogger;
import platform.resource.BaseResource;
import platform.resource.cluster;
import platform.util.ApplicationConstants;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;

public class DbManager {
	public static final int MAX_MYSQL_CONNECTIONS = 10;
	public static final int MAX_HSQLDB_CONNECTIONS = 50;
	public static final int MAX_MONGO_DB_CONNECTIONS = 20;
	
	static DbManager instance;
	ConcurrentHashMap<String, ArrayList<DbConnection>>  connectionMap;
	DbConnection[] hsqldbConnections;
	Map<String, Byte> dbTypeMap;
	boolean mainConnectionDone;
	Map<String, BaseHelper> helperMap;
	String configName;
	
	synchronized public static DbManager getInstance() {
		if (instance == null)
			instance = new DbManager();

		return instance;
	}

	DbManager() {
		dbTypeMap = new HashMap<String, Byte>();
		connectionMap = new ConcurrentHashMap<String, ArrayList<DbConnection>>();
		helperMap = new HashMap<String, BaseHelper>();
		Reader reader = new Reader("db");
		configName = reader.getString(ApplicationConstants.PROPERTY_CONFIG_NAME,ApplicationConstants.DEFAULT_DB_CONFIG_NAME);
	}

	public void register(BaseHelper helper) {
		helperMap.put(helper.getResource().getMetaData().getName(),helper);
	}
	
 	public BaseHelper getHelper(String resource) {
		return helperMap.get(resource);
	}
 	
 	
 	

 	
	public void addDBType(String resouceName,byte dbType) {
		dbTypeMap.put(resouceName, dbType);
	}

	public byte getDBType(BaseResource resource) {
		if (dbTypeMap.get(resource.getCluster()) != null) {
			return dbTypeMap.get(resource.getMetaData().getCluster()).byteValue();
		}
		return resource.getMetaData().getDbType();
	}

	public synchronized DbConnection getConnection(BaseResource resource) throws ApplicationException {
		byte dbType = getDBType(resource);
		Map<String, Object> map = resource.convertResourceToMap();
		Object keyValue = null;
		if (resource.getClusterKey() != null) {
			keyValue = map.get(resource.getClusterKey());
		}
		return getConnection(dbType,resource.getCluster(),resource.getMetaData().getClusterType(),resource.getMetaData().getName(),keyValue);
	}
	
	public synchronized DbConnection getConnection(byte dbType,String clusterName,String collection) throws ApplicationException {
		String clusterType = "REPLICATED";
		return getConnection(dbType,clusterName,clusterType,collection,null);
	}
	
	public synchronized DbConnection getConnection(byte  dbType,String clusterName,String getClusterType,String resourceName, Object keyValue) throws ApplicationException {
		if (clusterName == null) {
			clusterName = DBNameEnum.DB_CONFIG.toString();
		}
		ArrayList<DbConnection> connectionList= null;
		if (dbType == DBConsts.DB_TYPE_MYSQL) {
			int i = 0;
			connectionList = connectionMap.get(clusterName);
			if (connectionList == null) {
				if (clusterName.equals("main") || !mainConnectionDone) {
					connectionList = new ArrayList<DbConnection>();
					while (i < MAX_MYSQL_CONNECTIONS) { 
						MySQLDBConnection connection = new MySQLDBConnection();
						connectionList.add(connection);
						i++;
					}
					connectionMap.put("main",connectionList);
					mainConnectionDone = true;
					BaseResource[] resources = ClusterHelper.getInstance().getCluster(configName,"main",null,null); 
					
					for(BaseResource resource : resources) {
						cluster cluster = (cluster)resource;
						MySQLDBConnection connection = new MySQLDBConnection(cluster.getId(),cluster.getCluster_name(),cluster.getServer(), cluster.getUser_name(),cluster.getPassword(),cluster.getDb_name());
						connectionList.add(connection);
					}
					connectionMap.put("main",connectionList);
					if ((!mainConnectionDone) && ((resources == null)  || resources.length == 0)) {
						ClusterHelper.getInstance().insertCluster("main");
					}
					mainConnectionDone = true;
				} 

				connectionList = connectionMap.get(clusterName);
				if (connectionList == null)
					connectionList = new ArrayList<DbConnection>();
				
				BaseResource[] resources = ClusterHelper.getInstance().getCluster(configName,clusterName,resourceName,keyValue); 
				for(BaseResource resource : resources) {
					cluster cluster = (cluster)resource;
					i = 0;
					while (i < MAX_MYSQL_CONNECTIONS) { 
						MySQLDBConnection connection = new MySQLDBConnection(cluster.getId(),cluster.getCluster_name(),cluster.getServer(), cluster.getUser_name(),cluster.getPassword(),cluster.getDb_name());
						connectionList.add(connection);
						i++;
					}
				}
				if ((!mainConnectionDone) && ((resources == null)  || resources.length == 0)) {
					ClusterHelper.getInstance().insertCluster(clusterName);
				}
				connectionMap.put(clusterName,connectionList);
			} 
			if (connectionList != null) {
				i = 0;
				while (i < connectionList.size()) {
					MySQLDBConnection connection = (MySQLDBConnection) connectionList.get(i);
					if (connection.isFree()) {
						connection.aquire();
						return connection;
					}
					i++;
				}
			}


		} else if (dbType == DBConsts.DB_TYPE_MONGODB) {
			int i = 0;
			connectionList = connectionMap.get(clusterName);
			if (connectionList == null) {
				if (clusterName.equals(DBNameEnum.DB_CONFIG.toString()) || !mainConnectionDone) {
					connectionList = new ArrayList<DbConnection>();
					while (i < MAX_MONGO_DB_CONNECTIONS) { 
						MongoDBConnection connection = new MongoDBConnection();
						connectionList.add(connection);
						i++;
					}
					connectionMap.put(DBNameEnum.DB_CONFIG.toString(),connectionList);
					mainConnectionDone = true;
					BaseResource[] resources = ClusterHelper.getInstance().getCluster(configName,DBNameEnum.DB_CONFIG.toString(),null,null); 
					if (resources == null)
						throw new ApplicationException(-1," Cluster not found -> "+clusterName+"::"+resourceName+"::"+keyValue);
					for(BaseResource resource : resources) {
						cluster cluster = (cluster)resource;
						i = 0;
						while (i < MAX_MONGO_DB_CONNECTIONS) { 
							MongoDBConnection connection = new MongoDBConnection(cluster.getId(),cluster.getCluster_name(),cluster.getServer(),cluster.getPort(),cluster.getUser_name(),cluster.getPassword(),cluster.getDb_name());
							connectionList.add(connection);
							i++;
						}
					}
					connectionMap.put(DBNameEnum.DB_CONFIG.toString(),connectionList);
					if ((!mainConnectionDone) && ((resources == null)  || resources.length == 0)) {
						ClusterHelper.getInstance().insertCluster(DBNameEnum.DB_CONFIG.toString());
					}
					mainConnectionDone = true;
				} 

				connectionList = connectionMap.get(clusterName);
				if (connectionList == null)
					connectionList = new ArrayList<DbConnection>();
				
				BaseResource[] resources = ClusterHelper.getInstance().getCluster(configName,clusterName,resourceName,keyValue); 
				if (resources == null)
					throw new ApplicationException(-1," Cluster not found -> "+clusterName+"::"+resourceName+"::"+keyValue);
				for(BaseResource resource : resources) {
					cluster cluster = (cluster)resource;
					i = 0;
					while (i < MAX_MONGO_DB_CONNECTIONS) { 
						MongoDBConnection connection = new MongoDBConnection(cluster.getId(),cluster.getCluster_name(),cluster.getServer(),cluster.getPort(),cluster.getUser_name(),cluster.getPassword(),cluster.getDb_name());
						connectionList.add(connection);
						i++;
					}
				}
				if ((!mainConnectionDone) && ((resources == null)  || resources.length == 0)) {
					ClusterHelper.getInstance().insertCluster(clusterName);
				}
				connectionMap.put(clusterName,connectionList);
			} 
			if (connectionList != null) {
				i = 0;
				int try_count = 0;
				while (i < connectionList.size()) {
					MongoDBConnection connection = (MongoDBConnection) connectionList.get(i);
					if (connection.isFree()) {
						connection.setAcquire_time(System.currentTimeMillis());
						connection.aquire();
						return connection;
					}
					i++;
					if (i== connectionList.size() && try_count < 5) {
						ApplicationLogger.error("No connection available ....for " + " size="+connectionList.size() + ", Config Name="+configName+",dbType::"+dbType+ ",ClusterName::"+clusterName+ ",getClusterType"+getClusterType+",resourceName::"+resourceName+",keyValue::"+keyValue,this.getClass());
						try {
							Thread.sleep(500L);
							try_count++;
						} catch(Exception e) {

						}
					} else {
						ApplicationLogger.error("Exiting as no connection available ....for " + " size="+connectionList.size() + ", Config Name="+configName+",dbType::"+dbType+ ",ClusterName::"+clusterName+ ",getClusterType"+getClusterType+",resourceName::"+resourceName+",keyValue::"+keyValue,this.getClass());
					}
				}
				
			}


		} else if (dbType == DBConsts.DB_TYPE_HSQLDB) {  
			int i = 0;
			if (hsqldbConnections == null) {
				hsqldbConnections = new HSQLDBConnection[MAX_HSQLDB_CONNECTIONS];
				while (i < MAX_HSQLDB_CONNECTIONS) { 
					hsqldbConnections[i] = new HSQLDBConnection();
					i++;
				}
			}
			i = 0;
			while (i < MAX_HSQLDB_CONNECTIONS) {
				if (hsqldbConnections[i].isFree()) {
					hsqldbConnections[i].aquire();
					return hsqldbConnections[i];
				}
				i++;
			}
		}

		if ((connectionList != null)  && (connectionList.size() != 0)){
			throw new ApplicationException(ExceptionSeverity.ERROR, "No DB Connection free for size="+connectionList.size() + ", Config Name="+configName+",dbType::"+dbType+ ",ClusterName::"+clusterName+ ",getClusterType"+getClusterType+",resourceName::"+resourceName+",keyValue::"+keyValue);
		} 
		throw new ApplicationException(ExceptionSeverity.ERROR, "No DB Connection for " + ", Config Name="+configName+"server="+"dbType::"+dbType+ ",ClusterName::"+clusterName+ ",getClusterType"+getClusterType+",resourceName::"+resourceName+",keyValue::"+keyValue);
	}
	
	public void createIndexes() {
		for(Map.Entry<String, BaseHelper> entry : helperMap.entrySet()) {
			BaseHelper helper = entry.getValue();
			try {
				System.out.println("Creating Index for ... " + helper.getResource().getMetaData().getName());
				helper.createIndexes();
			} catch (ApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void createDistributionKey() {
		for(Map.Entry<String, BaseHelper> entry : helperMap.entrySet()) {
			BaseHelper helper = entry.getValue();
			try {
				helper.createDistributionKey();
			} catch (ApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void registerHelpers() {
		DbManager.getInstance().register(ActivityHelper.getInstance());
		DbManager.getInstance().register(AlertHelper.getInstance());
		DbManager.getInstance().register(Appliance_makeHelper.getInstance());
		DbManager.getInstance().register(Appliance_mapHelper.getInstance());
		DbManager.getInstance().register(Appliance_modelHelper.getInstance());
		DbManager.getInstance().register(Appliance_partHelper.getInstance());
		DbManager.getInstance().register(Appliance_running_logHelper.getInstance());
		DbManager.getInstance().register(Appliance_time_seriesHelper.getInstance());
		DbManager.getInstance().register(Appliance_typeHelper.getInstance());
		DbManager.getInstance().register(ApplianceHelper.getInstance());
		DbManager.getInstance().register(ClusterHelper.getInstance());
		DbManager.getInstance().register(ControllerHelper.getInstance());
		DbManager.getInstance().register(CustomerHelper.getInstance());
		DbManager.getInstance().register(Customer_mapHelper.getInstance());
		DbManager.getInstance().register(DeviceHelper.getInstance());
		DbManager.getInstance().register(FeedHelper.getInstance());
		DbManager.getInstance().register(GatewayHelper.getInstance());
		DbManager.getInstance().register(Hardware_vendorHelper.getInstance());
		DbManager.getInstance().register(LocationHelper.getInstance());
		DbManager.getInstance().register(Managed_objectHelper.getInstance());
		DbManager.getInstance().register(NotificationHelper.getInstance());
		DbManager.getInstance().register(ProfileHelper.getInstance());
		DbManager.getInstance().register(Rule_actionHelper.getInstance());
		DbManager.getInstance().register(Rule_conditionHelper.getInstance());
		DbManager.getInstance().register(RuleHelper.getInstance());
		DbManager.getInstance().register(SensorHelper.getInstance());
		DbManager.getInstance().register(SessionHelper.getInstance());
		DbManager.getInstance().register(User_mapHelper.getInstance());
		DbManager.getInstance().register(UserHelper.getInstance());		
	}
}
