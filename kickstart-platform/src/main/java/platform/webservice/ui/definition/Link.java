package platform.webservice.ui.definition;

import java.util.ArrayList;
import java.util.Map;

import platform.webservice.ui.html.A;
import platform.webservice.ui.html.BaseHTMLComponent;

public class Link {
	String baseUrl;
	
	ArrayList<String> params;
	ArrayList<String> dataParams;
	Map<String, Object> data;
	
	public Link(String baseUrl) {
		this.baseUrl = baseUrl;
		params = new ArrayList<String>();
		dataParams = new ArrayList<String>();
	}
	public Link(String _baseUrl,String[] _params) {
		this(_baseUrl);
		for(int i=0; i < _params.length; i++) {
			this.params.add(_params[i]);
			this.dataParams.add(_params[i]);
		}
	}
	
	public Link(String _baseUrl,String[] _params, String[] _dataParams) {
		this(_baseUrl,_params);
		for(int i=0; i < _dataParams.length; i++) {
			this.dataParams.add(_dataParams[i]);
		}
	}
	
	public void addParam(String param) {
		params.add(param);
		this.dataParams.add(param);
	}

	public void addParam(String param,String dataParam) {
		params.add(param);
		dataParams.add(dataParam);
	}
	
	public BaseHTMLComponent getLink(Map<String, Object> data) {
		A a = new A();
		String href = baseUrl;
		boolean first= true;
		for(int i=0; i < dataParams.size();i++) {
			if (data.get(dataParams.get(i)) != null) {
				String value = data.get(dataParams.get(i)).toString();
				if (first) {
					href += "?"; 
					first = false;
				} else {
					href += "&"; 
				}
				href += params.get(i)+"="+value;
			}
		}
		a.setHref(href);
		return a;
	}
}
