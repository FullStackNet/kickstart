package platform.webservice.ui.html;

import platform.webservice.ui.component.BaseFile;

public class JS extends BaseFile {
	private boolean header;
	public JS(String name, String path) {
		super(name, path);
		header = true;
		// TODO Auto-generated constructor stub
	}
	
	public JS(String name, String path,boolean header) {
		super(name, path);
		this.header = header;
		// TODO Auto-generated constructor stub
	}

	public boolean isHeader() {
		return header;
	}

	public void setHeader(boolean header) {
		this.header = header;
	}

	public String toString() {
		StringBuffer buf = new StringBuffer();
		return buf.toString();
	}
}
