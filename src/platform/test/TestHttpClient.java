package platform.test;

import platform.communication.RestClient;
import platform.resource.c4t_object;
import platform.resource.c4t_objectResult;
import platform.resource.login;
import platform.resource.loginResult;

public class TestHttpClient {
	public static void main(String[] args) throws Exception {
		RestClient rest = new RestClient("http://api.connect2community.in");
		login _login = new login();
		_login.setEmail_id("admin@pharma");
		_login.setPassword("x");
		loginResult _result = (loginResult)rest.post(_login, null);
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
		}
	}
}	
