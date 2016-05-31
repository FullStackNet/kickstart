package platform.webservice.ui.definition;

import platform.db.JoinField;
import platform.webservice.ui.renderer.BaseRenderer;
import platform.webservice.ui.util.UIConstants;




public class Field {
	String label;
	String hint;	
	String name;
	String type;
	String className;
   	Object defaultValue;
	Object value;
	String compomentType;
	DataSource datasource;
	boolean required;
	Integer minLength;
	Integer maxLength;
	Long minValue;
	Long maxValue;
	String allowedCharacter;
	String allowCharacterErrorMessage;
	BaseRenderer renderer;
	String unit;
	JoinField joinField;
	boolean dailyTotal;
	boolean monthlyTotal;
	boolean email;
	String timeZone;
	Link link;
	int width;
	int height;
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	boolean hideOnSingleEntry;
	boolean fullWidth;
	private boolean isUpperCase;
	boolean addOnly;
	boolean modifyOnly;
	boolean readOnly;
	boolean showCount;
	String[] names;
	String[] types;
	String[] labels;
	
	
	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	public String getCompomentType() {
		return compomentType;
	}

	public void setCompomentType(String compomentType) {
		this.compomentType = compomentType;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Object getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(Object defaultValue) {
		this.defaultValue = defaultValue;
		if (this.value == null) {
			if (compomentType.equals(UIConstants.COMPONENT_TYPE_COMBO)) {
				this.value = datasource.getSelectedObject(defaultValue);
			} else {
				this.value = this.defaultValue;
			}
		}
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Field(String[] labels, String[] names,String[] types) {
		super();
			this.labels = labels;
			this.names = names;
			this.types = types;
			this.compomentType = UIConstants.COMPONENT_TYPE_TEXTINPUT;
			required = false;
			timeZone = "IST";
			showCount = false;
	}
	
	
	public Field(String label, String name,String type) {
		super();
			this.label = label;
			this.name = name;
			this.type = type;
			this.compomentType = UIConstants.COMPONENT_TYPE_TEXTINPUT;
			required = false;
			timeZone = "IST";
			showCount = false;
	}
	
	
	public Field(String label, String name,String type,String componentType) {
			this(label,name,type);
			this.compomentType = componentType;
	}
	
	public Field(String label, String name,String type,String componentType, DataSource datasource) {
		this(label,name,type,componentType);
		this.datasource = datasource;
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public Integer getMinLength() {
		return minLength;
	}

	public void setMinLength(Integer minLength) {
		this.minLength = minLength;
	}

	public Integer getMaxLength() {
		return maxLength;
	}

	public void setMaxLength(Integer maxLength) {
		this.maxLength = maxLength;
	}

	public Long getMinValue() {
		return minValue;
	}

	public void setMinValue(Long minValue) {
		this.minValue = minValue;
	}

	public Long getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(Long maxValue) {
		this.maxValue = maxValue;
	}
	
	public IdValue getSelectedObject(Object key) {
		return datasource.getSelectedObject(key);
	}

	public String getAllowedCharacter() {
		return allowedCharacter;
	}

	public String getAllowCharacterErrorMessage() {
		return allowCharacterErrorMessage;
	}
	
	public void setAllowedCharacter(String allowedCharacter, String allowCharacterErrorMessage) {
		this.allowedCharacter = allowedCharacter;
		this.allowCharacterErrorMessage = allowCharacterErrorMessage;
	}

	public BaseRenderer getRenderer() {
		return renderer;
	}

	public void setRenderer(BaseRenderer renderer) {
		this.renderer = renderer;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public JoinField getJoinField() {
		return joinField;
	}

	public void setJoinField(JoinField joinField) {
		this.joinField = joinField;
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

	public boolean isEmail() {
		return email;
	}

	public void setEmail(boolean email) {
		this.email = email;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public Link getLink() {
		return link;
	}

	public void setLink(Link link) {
		this.link = link;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public boolean isHideOnSingleEntry() {
		return hideOnSingleEntry;
	}

	public void setHideOnSingleEntry(boolean hideOnSingleEntry) {
		this.hideOnSingleEntry = hideOnSingleEntry;
	}

	public boolean isUpperCase() {
		return isUpperCase;
	}

	public void setUpperCase(boolean isUpperCase) {
		this.isUpperCase = isUpperCase;
	}

	public boolean isFullWidth() {
		return fullWidth;
	}

	public void setFullWidth(boolean fullWidth) {
		this.fullWidth = fullWidth;
	}

	public boolean isAddOnly() {
		return addOnly;
	}

	public void setAddOnly(boolean addOnly) {
		this.addOnly = addOnly;
	}

	public boolean isModifyOnly() {
		return modifyOnly;
	}

	public void setModifyOnly(boolean modifyOnly) {
		this.modifyOnly = modifyOnly;
	}

	public boolean isReadOnly() {
		return readOnly;
	}

	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}

	public boolean isShowCount() {
		return showCount;
	}

	public void setShowCount(boolean showCount) {
		this.showCount = showCount;
	}

	public String getHint() {
		return hint;
	}

	public void setHint(String hint) {
		this.hint = hint;
	}

	public String[] getNames() {
		return names;
	}

	public void setNames(String[] names) {
		this.names = names;
	}

	public String[] getTypes() {
		return types;
	}

	public void setTypes(String[] types) {
		this.types = types;
	}

	public String[] getLabels() {
		return labels;
	}

	public void setLabels(String[] labels) {
		this.labels = labels;
	}
}
