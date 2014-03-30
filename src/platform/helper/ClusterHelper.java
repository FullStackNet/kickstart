package platform.helper;

import platform.db.Expression;
import platform.db.LOG_OP;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.cluster;


public class ClusterHelper extends BaseHelper {
	
	public ClusterHelper() {
		super(new cluster());
		// TODO Auto-generated constructor stub
	}
	private static ClusterHelper instance;
	
	public static ClusterHelper getInstance() {
		if (instance == null)
			instance = new ClusterHelper();
		return instance;
	}
	
	public BaseResource[] getCluster(String configName,String name,String resourceName, Object keyValue) {
			Expression e1 = new Expression(cluster.FIELD_CLUSTER_NAME, REL_OP.EQ, name);
			Expression e2 = new Expression(cluster.FIELD_CONFIGNAME, REL_OP.EQ, configName);
			Expression e = new Expression(e1, LOG_OP.AND, e2);
			return getByExpression(e);
	}
	
	public void insertCluster(String clusterName) {
		
	}
}
