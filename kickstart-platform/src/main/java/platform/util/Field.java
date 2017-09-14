/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.util;

public class Field {
	private String name;
	// boolean, byte, short, char, int, long, float, double, String, Map,
	// byte[], short[], int[], long[], float[], double[], String[]
	private int length;
	private int precision;
	
	

	private String type;
	private String valueType; // boolean, byte, short, char, int, long, float,
								// double, String (applicable only for "Map"
								// type)
	private String description = "";
	private boolean isPrimary;
	private boolean isIndexed;
	private boolean isRequired;
	private Object minValue;
	private Object maxValue;
	private Object value;
	private Object defaultValue;
	
	private boolean isTransient;
	private boolean isValidationRequired;
	private boolean isTime;
	private boolean isTimeGenerationRequired;
	private boolean isImage;
	private boolean isDoc;
	private boolean encrypt;
	private boolean isCounter;
	
	public static final String FILE_TYPE_FIELD_SUFFIX = "ContentType";
	public static final String TIME_STAMP_FIELD_SUFFIX = "TimeStamp";
	public static final String FILE_EXTENSION_FIELD_SUFFIX = "Extension";
	public static final String[] IMAGE_CONTENT_TYPES = new String[] {"image/jpeg", "image/gif", "image/png","image/x-png","image/pjpeg"};
	public static final String[] DOC_EXTENSIONS = new String[] {"txt", "html", "htm", "doc", "docx", "rtf", "pdf", "odt"};
	public static final String[] IMAGE_EXTENSIONS = new String[] {"jpeg", "jpg", "gif", "png", "pjpeg"};
	public static final String DEFAULT_PROFILE_IMAGE_CONTENT_TYPE = "image/gif";
	public static final String DEFAULT_PROFILE_IMAGE_PATH = "conf/images/noone.gif";
	public static final String DEFAULT_ENTERPRISE_ACCOUNT_LOGO_CONTENT_TYPE = "image/jpeg";
	public static final String DEFAULT_ENTERPRISE_ACCOUNT_LOGO_PATH = "conf/images/Company-logo-placeholder.jpg";
	
	public static final String[] DOC_CONTENT_TYPES = new String[] {
			"text/plain", "text/html", "application/msword", "application/rtf",
			"application/pdf",
			"application/vnd.openxmlformats-officedocument.wordprocessingml.document" };
	public static final String DEFAULT_IMAGE_CONTENT_TYPE = "image/gif";
	public static final String DEFAULT_IMAGE_PATH = "conf/images/noone.gif";
	// Images will be converted to this default size (width) before storing in
	// DB
	// If image is 1000x1000, will be converted to 200x200. If image is
	// 1600x1200, will be converted to 200x150.
	// If image is 300x400, will be converted to 150x200 i.e. square image will
	// be reduced to a square of 200x200
	// but rectangular image's maximum dimension(width/height) will be reduced
	// to 200.
	public static final short MINIFIED_IMAGE_SIZE = 200;
	public static final String MINIFIED_IMAGE_FILE_TYPE = "png";
	public static final String MINIFIED_IMAGE_CONTENT_TYPE = "image/png";
	public static final long IMAGE_SIZE_WARN_LIMIT = 153600; // 150KB
	public static final String VALUE_TYPE_STRING = "String";
	public static final String VALUE_TYPE_INT = "int";
	public static final String VALUE_TYPE_DATE = "date";
	public static final String VALUE_TYPE_NUMBER = "Number";
	public static final String VALUE_TYPE_TIMESTAMP = "timestamp";
	private String self_key;
	private String reference_table;
	private String reference_key;
	private String reference_name;
			
	public String getSelf_key() {
		return self_key;
	}

	public void setSelf_key(String self_key) {
		this.self_key = self_key;
	}

	public String getReference_table() {
		return reference_table;
	}

	public void setReference_table(String reference_table) {
		this.reference_table = reference_table;
	}

	public String getReference_key() {
		return reference_key;
	}

	public void setReference_key(String reference_key) {
		this.reference_key = reference_key;
	}

	public String getReference_name() {
		return reference_name;
	}

	public void setReference_name(String reference_name) {
		this.reference_name = reference_name;
	}

	public Field(String name) {
		this(name, "String");
	}

	public Field(String name, String type) {
		this.name = name;
		setType(type);
	}

	public Field(String name, String type, int len) {
		this.name = name;
		this.length = len;
		setType(type);
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
		if (type.equals("time")) {
			this.type = "long";
			this.isTime = true;
		} else if (type.equals("image")) {
			this.type = "byte[]";
			this.isImage = true;
			setValidationRequired(true);
		} else if (type.equals("doc")) {
			this.type = "byte[]";
			this.isDoc = true;
			setValidationRequired(true);
		} else
			this.type = type;
	}

	public boolean isPrimitive() {
		return (type.equals("boolean") || type.equals("byte")
				|| type.equals("short") || type.equals("char")
				|| type.equals("int") || type.equals("long")
				|| type.equals("float") || type.equals("double"));
	}

	public boolean isArray() {
		return (type.equals("byte[]") || type.equals("short[]")
				|| type.equals("int[]") || type.equals("long[]")
				|| type.equals("float[]") || type.equals("double[]") || type
					.equals("String[]"));
	}

	public String getKeyType() {
		return "String";
	}

	public String getValueType() {
		return valueType == null ? "String" : valueType;
	}

	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public boolean isPrimary() {
		return isPrimary && !type.equals("Map");
	}

	public void setPrimary(boolean isPrimary) {
		this.isPrimary = isPrimary;
	}

	public boolean isIndexed() {
		return isIndexed && !type.equals("Map");
	}

	public void setIndexed(boolean isIndexed) {
		this.isIndexed = isIndexed;
	}

	public boolean isRequired() {
		return isRequired;
	}

	public void setRequired(boolean isRequired) {
		this.isRequired = isRequired;
		if (isRequired)
			setValidationRequired(true);
	}

	public void setTime(boolean isTime) {
		this.isTime = isTime;
	}

	public Object getMinValue() {
		return minValue;
	}

	public void setMinValue(Object minValue) {
		this.minValue = minValue;
		if (minValue != null)
			setValidationRequired(true);
	}

	public Object getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(Object maxValue) {
		this.maxValue = maxValue;
		if (maxValue != null)
			setValidationRequired(true);
	}

	public boolean isTransient() {
		return isTransient;
	}

	public void setTransient(boolean isTransient) {
		this.isTransient = isTransient;
	}

	public boolean isValidationRequired() {
		return isValidationRequired;
	}

	public void setValidationRequired(boolean isValidationRequired) {
		this.isValidationRequired = isValidationRequired;
	}

	public boolean isTime() {
		return isTime;
	}

	public boolean isTimeGenerationRequired() {
		return isTimeGenerationRequired;
	}

	public void setTimeGenerationRequired(boolean isTimeGenerationRequired) {
		this.isTimeGenerationRequired = isTimeGenerationRequired;
	}

	public boolean isFile() {
		return isImage() || isDoc();
	}

	public boolean isImage() {
		return isImage;
	}

	public boolean isDoc() {
		return isDoc;
	}

	public void setEncrypt(boolean encrypt) {
		this.encrypt = encrypt;
	}

	public boolean encrypt() {
		return encrypt && type.equals("String");
	}

	public boolean isCounter() {
		return isCounter;
	}

	public void setCounter(boolean isCounter) {
		this.isCounter = isCounter;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public int getPrecision() {
		return precision;
	}

	public void setPrecision(int presicion) {
		this.precision = presicion;
	}

	public Object getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(Object defaultValue) {
		this.defaultValue = defaultValue;
	}


}