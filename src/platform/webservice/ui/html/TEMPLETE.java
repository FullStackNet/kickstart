package platform.webservice.ui.html;

import java.util.Map;

import platform.util.Util;

public class TEMPLETE {
	
	String fileName;
	Map<String, String> params;
	public TEMPLETE(String fileName,Map<String, String> map) {
		super();
		this.fileName = fileName;
		this.params = params;
	}

	public BaseHTMLComponent getContent() {
		String text = Util.readTempleteFileFromLocal(fileName, params);
		return new TEXT(text);
	}
}
