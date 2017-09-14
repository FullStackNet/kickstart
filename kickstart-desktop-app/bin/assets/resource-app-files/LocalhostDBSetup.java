package util;

import platform.defined.DBNameEnum;
import platform.helper.ClusterHelper;
import platform.helper.SessionHelper;
import platform.helper.UserHelper;
import platform.log.ApplicationLogger;
import platform.resource.BaseResource;
import platform.resource.cluster;
import platform.resource.session;
import platform.resource.user;

public class LocalhostDBSetup {
	
	public static cluster[] _clusters = {
		new cluster("local","local_1", DBNameEnum.DB_CONFIG.toString(),"localhost",23017),
		new cluster("local","local_2", DBNameEnum.DB_ALERT.toString(),"localhost",23017),
		new cluster("local","local_3", DBNameEnum.DB_DEVICE.toString(),"localhost",23017),
		new cluster("local","local_4", DBNameEnum.DB_PROFILE.toString(),"localhost",23017),
		new cluster("local","local_5", DBNameEnum.DB_SESSION.toString(),"localhost",23017),
		new cluster("local","local_6", DBNameEnum.DB_NOTIFICATION.toString(),"localhost",23017),
		new cluster("local","local_7", DBNameEnum.DB_LOG.toString(),"localhost",23017),
		new cluster("local","local_8", DBNameEnum.DB_ANALYSIS.toString(),"localhost",23017),
		new cluster("local","local_9", DBNameEnum.DB_PACKET.toString(),"localhost",23017),
		new cluster("local","local_10", DBNameEnum.DB_CHAT.toString(),"localhost",23017),
		new cluster("local","local_11", DBNameEnum.DB_SCHOOL.toString(),"localhost",23017),
		new cluster("local","local_12", DBNameEnum.DB_QUESTION.toString(),"localhost",23017),
		new cluster("local","local_13", DBNameEnum.DB_ACCOUNT.toString(),"localhost",23017),
		new cluster("local","local_14", DBNameEnum.DB_PHOTO.toString(),"localhost",23017),
		new cluster("local","local_15", DBNameEnum.DB_OBJECT.toString(),"localhost",23017),
		new cluster("local","local_16", DBNameEnum.DB_RECORD.toString(),"localhost",23017),
	};

	public static void main(String[] args) throws Exception {
		ApplicationLogger.init();
		for(int i=0; i < _clusters.length; i++) {
			ClusterHelper.getInstance().AddOrUpdate(_clusters[i]);
		}
		
		BaseResource[] resources = ClusterHelper.getInstance().getAll();
		System.out.println(" Total Clusters : " +resources.length);
		
		user _user = new user("admin@cloud4things.com");
		_user.setName("admin@cloud4things.com");
		_user.setType(user.USER_TYPE_C4T_ADMIN);
		_user.setPassword("c4t2013");
		_user.setEmail_id("admin@cloud4things.com");
		_user.setMobile_no("admin@cloud4things.com");
		UserHelper.getInstance().AddOrUpdate(_user);	
		session _session = new session("1");
		_session.setUser_id("admin@cloud4things.com");
		_session.setUser_name("ajay");
		SessionHelper.getInstance().AddOrUpdate(_session);
		

		System.exit(0);
	}
}
