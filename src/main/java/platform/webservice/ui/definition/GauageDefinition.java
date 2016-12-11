package platform.webservice.ui.definition;

public class GauageDefinition {
	String mId;
	String mClassName;
	String mName;
	int height;
	int width;
	boolean autoRefresh;
	long autoRefreshInterval;
	String autoRefreshURL;
	String title;
	Integer max;
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public GauageDefinition() {
		
	}

	public GauageDefinition(String id, String name,String className) {
		this();
		// TODO Auto-generated constructor stub
		mId = id;
		mName = name;
		mClassName = className;
	}
	

	public String getId() {
		return mId;
	}

	public void setId(String mId) {
		this.mId = mId;
	}

	public String getClassName() {
		return mClassName;
	}

	public void setClassName(String mClassName) {
		this.mClassName = mClassName;
	}

	public String getName() {
		return mName;
	}

	public void setName(String mName) {
		this.mName = mName;
	}

	public boolean isAutoRefresh() {
		return autoRefresh;
	}

	public void setAutoRefresh(boolean autoRefresh) {
		this.autoRefresh = autoRefresh;
	}

	public long isAutoRefreshInterval() {
		return autoRefreshInterval;
	}

	public void setAutoRefreshInterval(long autoRefreshInterval) {
		this.autoRefreshInterval = autoRefreshInterval;
	}

	public String getAutoRefreshURL() {
		return autoRefreshURL;
	}

	public void setAutoRefreshURL(String autoRefreshURL) {
		this.autoRefreshURL = autoRefreshURL;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
}
