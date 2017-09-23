package platform.webservice.ui.html;

import platform.webservice.ui.component.BaseFile;

public class CSS extends BaseFile {
	public CSS(String name, String path) {
		super(name, path);
		// TODO Auto-generated constructor stub
	}

	public String getHref() {
		return getPath()+"/"+getName();
	}
		
		
}
