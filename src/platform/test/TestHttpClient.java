package platform.test;

import platform.communication.RestClient;
import platform.resource.c4t_object;
import platform.resource.c4t_objectResult;
import platform.resource.c4t_record;
import platform.resource.c4t_recordResult;
import platform.resource.login;
import platform.resource.loginResult;

public class TestHttpClient {
	public static void main(String[] args) throws Exception {
		RestClient rest = new RestClient("http://api.connect2community.in");
		login _login = new login();
		_login.setEmail_id("admin@pharma");
		_login.setPassword("x");
		loginResult _result = (loginResult)rest.post("login",_login, loginResult.class,null);
		System.out.println(_result.getMessage());
		if (_result.getErrCode() == 0) {
			login _response = _result.getResource()[0];
			rest.setSession_id(_response.getSession_id());
			c4t_objectResult _communityResult = (c4t_objectResult)rest.get("community", "QUERY_GET_BY_USER_ID", "dommy:dommy",c4t_objectResult.class);
			if (_result.getErrCode() == 0) {
				c4t_object[] _responses = _communityResult.getResource();
				for(int i=0; i < _responses.length; i++) {
					System.out.println(_responses[i].getName());
				}
			}
			c4t_recordResult _orderResult = (c4t_recordResult)rest.getById("community_order","5594cd71-40e2-11e5-9aca-005056c00008",c4t_recordResult.class);
			if (_orderResult.getErrCode() == 0) {
				c4t_record _order = _orderResult.getResource()[0];
				System.out.println(_order.getUser_name()+","+_order.getTotal_products());
			}
		}
	}
}	