package platform.webservice.ui.definition;

import java.util.ArrayList;

import platform.webservice.ui.util.UIConstants;
import platform.webservice.ui.validation.ValidationRule;

public class FormDefinition {
	ArrayList<Block> blocks;
	ArrayList<Field> fields;
	ArrayList<ValidationRule> rules;
	String mId;
	String mClassName;
	String mName;
	int height;
	int width;
	String onSubmit;
	ArrayList<Button> buttonList;
	boolean autoRefresh;
	long autoRefreshInterval;
	String autoRefreshURL;
	String successURL;
	String submitURL;
	String units;
	String timeZone;
	String formSubmitURL;
	boolean uploadFileForm;
	String title;
	String submitURLAdd;
	String summary;
	boolean ajaxSubmit;
	
	
	public FormDefinition() {
		blocks = new ArrayList<Block>();
		rules = new ArrayList<ValidationRule>();
		buttonList = new ArrayList<Button>();
		width = 600;
		timeZone = "IST";
		uploadFileForm = false;
		ajaxSubmit = true;
		
	}
	public FormDefinition(String id, String name,String className) {
		this();
		// TODO Auto-generated constructor stub
		mId = id;
		mName = name;
		mClassName = className;
		uploadFileForm = false;

	}


	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	
	public boolean isAjaxSubmit() {
		return ajaxSubmit;
	}
	public void setAjaxSubmit(boolean ajaxSubmit) {
		this.ajaxSubmit = ajaxSubmit;
	}
	
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

	public void addButton(Button button) {
		buttonList.add(button);
	}
	public void addBlock(Block block) {
		blocks.add(block);
	}

	public ArrayList<Block> getBlocks() {
		return blocks;
	}

	public ArrayList<Field> getFields() {
		if (fields != null)  return fields;
		fields = new ArrayList<Field>(); 
		for(int j=0; j < blocks.size() ; j++) { 
			Block block = blocks.get(j);
			Field field = new Field(block.getTitle(),"" , "",UIConstants.COMPONENT_TYPE_HEADING);
			fields.add(field);
			for(int i=0; i < block.getFields().size() ; i++) { 
				fields.add(block.getFields().get(i));
			}
		}
		return fields;
	}
	public void addValidationRule(ValidationRule rule) {
		rules.add(rule);
	}

	public ArrayList<ValidationRule> getValidationRules() {
		return rules;
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

	public ArrayList<Button> getButtonList() {
		return buttonList;
	}

	public String getOnSubmit() {
		return onSubmit;
	}

	public void setOnSubmit(String onSubmit) {
		this.onSubmit = onSubmit;
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

	public String getSuccessURL() {
		return successURL;
	}

	public void setSuccessURL(String successURL) {
		this.successURL = successURL;
	}

	public String getSubmitURL() {
		return submitURL;
	}

	public void setSubmitURL(String submitURL) {
		this.submitURL = submitURL;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public String getUnitJavascriptArray() {
		String unitStr="{";
		boolean first = true;
		for (int i = 0; i < getBlocks().size(); i++) {
			Block block = getBlocks().get(i);
			for(int j=0; j < block.getFields().size(); j++) {
				Field field = block.getFields().get(j);
				if (field.getUnit() != null) {
					if (!first)
						unitStr = unitStr + ",";
					first = false;
					unitStr = unitStr + field.getName()+" : '"+field.getUnit()+"'";
				}
			}
		}
		unitStr = unitStr + "}";
		return unitStr;
	}
	public String getFieldNameString() {
		String fieldstr="";
		boolean first = true;
		for (int i = 0; i < getBlocks().size(); i++) {
			Block block = getBlocks().get(i);
			for(int j=0; j < block.getFields().size(); j++) {
				Field field = block.getFields().get(j);
				if (!first)
					fieldstr = fieldstr + ",";
				first = false;
				fieldstr = fieldstr + field.getName();
			}
		}
		return fieldstr;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getFormSubmitURL() {
		return formSubmitURL;
	}

	public void setFormSubmitURL(String formSubmitURL) {
		this.formSubmitURL = formSubmitURL;
	}

	public boolean isUploadFileForm() {
		return uploadFileForm;
	}

	public void setUploadFileForm(boolean uploadFileForm) {
		this.uploadFileForm = uploadFileForm;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubmitURLAdd() {
		return submitURLAdd;
	}
	public void setSubmitURLAdd(String submitURLAdd) {
		this.submitURLAdd = submitURLAdd;
	}
}
