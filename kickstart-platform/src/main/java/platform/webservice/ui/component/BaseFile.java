package platform.webservice.ui.component;

public class BaseFile {
	String mName;
	String mPath;
	
	public BaseFile(String name,String path) {
		this.mName = name;
		this.mPath = path;
	}

	
	public String getName() {
		return mName;
	}

	public void setName(String mName) {
		this.mName = mName;
	}

	public String getPath() {
		return mPath;
	}

	public void setPath(String mPath) {
		this.mPath = mPath;
	}
}
