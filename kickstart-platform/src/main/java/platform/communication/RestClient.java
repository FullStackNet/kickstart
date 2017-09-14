package platform.communication;

import platform.defined.resource.Baseresult;
import platform.resource.BaseResource;
import platform.resource.result;
import platform.util.Json;

public class RestClient {
	String session_id;
	String server_url;
	String namespace;

	private static RestClient instance; 

	public static RestClient getInstance() {
		if (instance == null) {
			instance = new RestClient();
		}
		return instance;
	}

	public String getSession_id() {
		return session_id;
	}

	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}

	public String getServer_url() {
		return server_url;
	}

	public void setServer_url(String server_url) {
		this.server_url = server_url;
	}

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public RestClient() {
		server_url = "http://api.connect2community.in/";
		this.namespace = "c4t"; 
	}

	public RestClient(String server_url) {
		this();
		this.server_url = server_url;
	}

	public RestClient(String server_url,String namespace) {
		this(server_url);
		this.namespace = namespace;
	}


	public Baseresult get(String resourceName,String queryId, String args,Class<?> resultType) {
		return get(resourceName, queryId, args,resultType,namespace);
	}
	public Baseresult getById(String resourceName, String id, Class<?> resultType) {
		return getById(resourceName, id, resultType,namespace);
	}	

	public Baseresult getById(String resourceName, String id, Class<?> resultType,String _namespace) {
		Baseresult _result;
		try {
			String resultString = HttpClient.sendGetByIdRequest(server_url, _namespace, session_id,
					resourceName, id);
			_result =  Json.stringToBaseResult(resultString, resultType);
			return _result;
		} catch(Exception e) {
			e.printStackTrace();
			_result = new result();
			_result.setErrCode(-1);
			_result.setMessage(e.getMessage());
			return _result;
		}
	}

	public Baseresult get(String resourceName,String queryId, String args, Class<?> resultType,String _namespace) {
		Baseresult _result;
		try {
			String resultString = HttpClient.sendGetRequest(server_url, _namespace, session_id,
					resourceName, queryId,args);
			_result =  Json.stringToBaseResult(resultString, resultType);
			return _result;
		} catch(Exception e) {
			e.printStackTrace();
			_result = new result();
			_result.setErrCode(-1);
			_result.setMessage(e.getMessage());
			return _result;
		}
	}

	public Object getResourceArray(String resourceName, String queryId, String args, Class<?> resultType, String _namespace) throws Exception {
		Object _result;
		String resultString = HttpClient.sendGetRequest(server_url, _namespace, session_id,
				resourceName, queryId, args);
		_result = Json.stringToObject(resultString, resultType);
		return _result;
	}
	
	public Baseresult post(String resourceName,BaseResource resource,Class<?> resultClass,String action) {
		return post(resourceName,resource,action,resultClass,namespace) ;
	}
	public Baseresult post(String resourceName,BaseResource resource,String action,Class<?> resultClass,String _namespace) {
		String resourceString = Json.resourcetoString(resource);
		Baseresult _result;
		try {
			//	System.out.println("request : "+resourceString + ",action : " + action);
			String resultString = HttpClient.sendPostRequest(server_url, _namespace, session_id,
					resourceName, resourceString, action);
			//		System.out.println("Response : "+resultString);
			_result =  Json.stringToBaseResult(resultString, resultClass);
			return _result;
		} catch(Exception e) {
			e.printStackTrace();
			_result = new result();
			_result.setErrCode(-1);
			_result.setMessage(e.getMessage());
			return _result;
		}
	}
	
	
}
