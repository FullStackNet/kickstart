package platform.webservice.ui.definition;

import java.util.ArrayList;

import platform.db.JoinField;

public class TableDefinition {
	ArrayList<Field> fields;
	String primaryKey;
	boolean autoRefresh;
	long autoRefreshInterval;
	String id;
	String className;
	String title;
	boolean addButton;
	String addButtonURL;
	String modifyURL;
	String timeZone;
	boolean modifyButton;
	String detailURL;
	boolean detailButton;	
	boolean deleteButton;
	String deleteURL;
	
	boolean dailyTotal;
	boolean monthlyTotal;
	long width;
	boolean displayTitles;
	boolean displayCommunityName;
	
	private ArrayList<JoinField> joinFields;
	boolean dateWiseFilter; 
	
	public boolean isDisplayCommunityName() {
		return displayCommunityName;
	}
	public void setDisplayCommunityName(boolean displayCommunityName) {
		this.displayCommunityName = displayCommunityName;
	}
	public long getAutoRefreshInterval() {
		return autoRefreshInterval;
	}
	public void setAutoRefreshInterval(long autoRefreshInterval) {
		this.autoRefreshInterval = autoRefreshInterval;
	}
	ArrayList<Button> customButtons;
	boolean readOnly;
	int viewDataType;
	
	public TableDefinition() {
		fields = new ArrayList<Field>();
		// TODO Auto-generated constructor stub
		customButtons = new ArrayList<Button>();
		autoRefreshInterval = 5;
		joinFields = new ArrayList<JoinField>();
		timeZone = "IST";
		modifyButton = true;
		deleteButton = false;
		displayTitles = true;
		displayCommunityName = true;
	}

	public void addJoinField(JoinField field) {
		joinFields.add(field);
	}
	
	public boolean isAutoRefresh() {
		return autoRefresh;
	}

	public void setAutoRefresh(boolean autoRefresh) {
		this.autoRefresh = autoRefresh;
	}

	public void addButton(Button button) {
		customButtons.add(button);
	}
	
	public void addField(Field field) {
		fields.add(field);
	}

	public ArrayList<Field> getFields() {
		return fields;
	}

	public String getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(String primaryKey) {
		this.primaryKey = primaryKey;
	}

	public boolean isReadOnly() {
		return readOnly;
	}

	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}

	public int getViewDataType() {
		return viewDataType;
	}

	public void setViewDataType(int viewDataType) {
		this.viewDataType = viewDataType;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isAddButton() {
		return addButton;
	}
	public void setAddButton(boolean addButton) {
		this.addButton = addButton;
	}
	public String getAddButtonURL() {
		return addButtonURL;
	}
	public void setAddButtonURL(String addButtonURL) {
		this.addButtonURL = addButtonURL;
	}
	
	public ArrayList<JoinField> getJoinFields() {
		return joinFields;
	}

	public void setJoinFields(ArrayList<JoinField> joinFields) {
		this.joinFields = joinFields;
	}
	
	public String getModifyURL() {
		return modifyURL;
	}
	public void setModifyURL(String modifyURL) {
		this.modifyURL = modifyURL;
	}
	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	
	public boolean isDailyTotal() {
		return dailyTotal;
	}
	public void setDailyTotal(boolean dailyTotal) {
		this.dailyTotal = dailyTotal;
	}
	public boolean isMonthlyTotal() {
		return monthlyTotal;
	}
	public void setMonthlyTotal(boolean monthlyTotal) {
		this.monthlyTotal = monthlyTotal;
	}
	public long getWidth() {
		return width;
	}
	public void setWidth(long width) {
		this.width = width;
	}
	public boolean isModifyButton() {
		return modifyButton;
	}
	public void setModifyButton(boolean modifyButton) {
		this.modifyButton = modifyButton;
	}
	public boolean isDeleteButton() {
		return deleteButton;
	}
	public void setDeleteButton(boolean deleteButton) {
		this.deleteButton = deleteButton;
	}
	public String getDeleteURL() {
		return deleteURL;
	}
	public void setDeleteURL(String deleteURL) {
		this.deleteURL = deleteURL;
	}
	public String getDetailURL() {
		return detailURL;
	}
	public void setDetailURL(String detailURL) {
		this.detailURL = detailURL;
	}
	public boolean isDetailButton() {
		return detailButton;
	}
	public void setDetailButton(boolean detailButton) {
		this.detailButton = detailButton;
	}
	public boolean isDisplayTitles() {
		return displayTitles;
	}
	public void setDisplayTitles(boolean displayTitles) {
		this.displayTitles = displayTitles;
	}
	public boolean isDateWiseFilter() {
		return dateWiseFilter;
	}
	public void setDateWiseFilter(boolean dateWiseFilter) {
		this.dateWiseFilter = dateWiseFilter;
	}
}
