package platform.resource;

import platform.db.DBConsts;
import platform.defined.resource.Basecluster;
import platform.util.Util;

public class cluster extends Basecluster {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public cluster() {
		this.setId(Util.getUniqueId());
	}
	
	public cluster(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public cluster(String id, String name) {
		setId(id);
		setName(name);
		setCluster_name(name);
		setDbType(DBConsts.DB_TYPE_MONGODB);
		setDb_name(name);
		setServer("localhost");
		setConfigName("local");
		setPort(27017);
	}
	public cluster(String configName, String id, String name,String ip, int port) {
		setId(id);
		setName(name);
		setCluster_name(name);
		setDbType(DBConsts.DB_TYPE_MONGODB);
		setDb_name(name);
		setServer(ip);
		setPort(port);
		setConfigName(configName);
	}
}
