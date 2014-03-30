package platform.webservice.ui.definition;

import java.util.ArrayList;
import java.util.Map;

public class Definition {
	ArrayList<Field> fields;
	String primaryKey;
	boolean autoRefresh;
	long autoRefreshInterval;
	
	public long getAutoRefreshInterval() {
		return autoRefreshInterval;
	}

	public void setAutoRefreshInterval(long autoRefreshInterval) {
		this.autoRefreshInterval = autoRefreshInterval;
	}

	boolean singleRecord;
	ArrayList<Button> customButtons;
	boolean showAddButton;
	boolean showModifyButton;
	

	boolean showDeleteButton;
	boolean readOnly;
	int viewDataType;
	ArrayList<Map<String, Object>> liveData;
	String reportFile;
	byte dbType;
	
	public byte getDbType() {
		return dbType;
	}

	public String getReportFile() {
		return reportFile;
	}

	public void setReportFile(String reportFile) {
		this.reportFile = reportFile;
	}

	public void hideAddButton(){
		showAddButton = false;
	}
	
	public void hideModifyButton() {
		showModifyButton = false;
	}
	
	public  void hideDeleteButton() {
		showDeleteButton = false;
	}


	public Definition() {
		fields = new ArrayList<Field>();
		// TODO Auto-generated constructor stub
		singleRecord = false;
		customButtons = new ArrayList<Button>();
		showAddButton = true;
		showModifyButton = true;
		showDeleteButton = true;
		autoRefreshInterval = 5;
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

	public boolean isSingleRecord() {
		return singleRecord;
	}

	public void setSingleRecord(boolean singleRecord) {
		this.singleRecord = singleRecord;
	}

	public boolean isShowAddButton() {
		return showAddButton;
	}

	public boolean isShowModifyButton() {
		return showModifyButton;
	}

	public boolean isShowDeleteButton() {
		return showDeleteButton;
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
	
	public void setShowModifyButton(boolean showModifyButton) {
		this.showModifyButton = showModifyButton;
	}
	public void setShowAddButton(boolean showAddButton) {
		this.showAddButton = showAddButton;
	}
	
	public void setShowDeleteButton(boolean showDeleteButton) {
		this.showDeleteButton = showDeleteButton;
	}
}
