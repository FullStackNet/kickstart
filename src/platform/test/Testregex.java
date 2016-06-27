package platform.test;

import com.hazelcast.core.Cluster;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.ClusterHelper;
import platform.resource.BaseResource;
import platform.resource.cluster;

public class Testregex {
	public static void main(String[] args) throws Exception {
		String searchString = "aj";
		String text1 = "Ajay";
		String text2 = "sajay";
		if (text1.matches("(?i:.*"+searchString+".*)")) {
			System.out.println("Matched");
		}
		Expression e = new platform.db.Expression(cluster.FIELD_NAME, REL_OP.STARTWITH, "db_a");
		BaseResource[] resources = ClusterHelper.getInstance().getPage(e, new String[]{"name"}, 0, 10);
		for(int i=0 ; i < resources.length; i++) {
			cluster _cluster = (cluster)resources[i];
			System.out.println("name "+ _cluster.getName());
		}
	}
}	
