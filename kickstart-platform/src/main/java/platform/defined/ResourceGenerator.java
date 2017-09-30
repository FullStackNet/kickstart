/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.defined;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import platform.db.ResourceMetaData;
import platform.util.Field;



public class ResourceGenerator {
	private String basePath =  null;
	private String packageName =  null;
	
	public ResourceGenerator(String packageName, String basePath) {
		this.basePath = basePath;
		this.packageName = packageName;
	}
	
	String getPackageName() {
		return "package "+packageName+";\n\n";
	}	
	private static String FILE_EXTENSION = ".java";
	private static String COPYRIGHT = "/*\n * Copyright 2010-2020 M16, Inc. All rights reserved.\n * This software and documentation contain valuable trade\n * secrets and proprietary property belonging to M16, Inc.\n * None of this software and documentation may be copied,\n * duplicated or disclosed without the express\n * written permission of M16, Inc.\n */\n\n";
	private static String IMPORT = "import platform.resource.BaseResource;\nimport platform.util.*;\nimport platform.db.*;\nimport java.util.*;\n\n";
	private static String CLASS_COMMENT = "/*\n ********** This is a generated class **********\n * %s\n */\n";
	private static String CLASS_PREFIX = "Base";
	private static String CLASS_OPEN = "public abstract class " + CLASS_PREFIX + "%s extends BaseResource {\n";
	private static String CLASS_OPEN_CACHEABLE = "public abstract class " + CLASS_PREFIX + "%s extends Resource implements com.m16.server.framework.memcache.Cacheable {\n";
	private static String CLASS_CLOSE = "}";
	private static String FIELD_DEFINITION = "\tprivate %s %s = null;%s\n";
	private static String FIELD_CONST_NAME = "\tpublic static String FIELD_%s = \"%s\";\n";
	private static String SERIAL_VERSION_FIELD_DEFINITION = "\tprivate static final long serialVersionUID = 1L;\n";
	private static String META_DATA_DEFINITION = "\tprivate final static ResourceMetaData metaData = new ResourceMetaData(\"%s\");\n";
	private static String STATIC_BLOCK_OPEN = "\tstatic {\n\t\tmetaData.setCheckBeforeAdd(%s);\n\t\tmetaData.setCheckBeforeUpdate(%s);\n";
	private static String SET_TABLE_NAME = "\n\t\tmetaData.setTableName(\"%s\");\n";
	private static String SET_CLUSTER_NAME = "\n\t\tmetaData.setCluster(\"%s\");\n";
	private static String FIELD_STATIC_CONSTRUCTOR_BLOCK = "\t\tField %sField = new Field(\"%s\", \"%s\");\n";
	private static String FIELD_STATIC_SET_PRIMARY_BLOCK = "\t\t%sField.setPrimary(true);\n";
	private static String FIELD_STATIC_SET_TIME_BLOCK = "\t\t%sField.setTime(true);\n";
	private static String FIELD_STATIC_SET_INDEXED_BLOCK = "\t\t%sField.setIndexed(true);\n";
	private static String FIELD_STATIC_SET_VALUE_TYPE_BLOCK = "\t\t%sField.setValueType(\"%s\");\n";
	private static String FIELD_STATIC_SET_ENCRYPT_BLOCK = "\t\t%sField.setEncrypt(true);\n";
	private static String FIELD_STATIC_SET_COUNTER_BLOCK = "\t\t%sField.setCounter(true);\n";
	private static String FIELD_STATIC_SET_REQUIRED_BLOCK = "\t\t%sField.setRequired(true);\n";
	private static String FIELD_STATIC_SET_DEFAULTVALUE_BLOCK = "\t\t%sField.setDefaultValue(%s);\n";
	private static String FIELD_STATIC_SET_LENGTH_BLOCK = "\t\t%sField.setLength(%d);\n";
	private static String FIELD_STATIC_SET_PRECISION_BLOCK = "\t\t%sField.setPrecision(%d);\n";
	
	private static String FIELD_STATIC_ADD_META_DATA_BLOCK = "\t\tmetaData.addField(%sField);\n\n";
	private static String UNIQUE_FIELDS_STATIC_OPEN = "\t\tmetaData.setUniqueFieldNames(new String[][] {\n";
	private static String UNIQUE_FIELDS_STATIC_OUTER_BLOCK = "\t\t\t{%s},\n";
	private static String UNIQUE_FIELDS_STATIC_INNER_BLOCK = "\"%s\", ";
	private static String UNIQUE_FIELDS_STATIC_CLOSE = "\t\t});\n";
	private static String STATIC_BLOCK_CLOSE = "\t}\n";
	private static String DEFAULT_CONSTRUCTOR = "\tpublic " + CLASS_PREFIX + "%s() {}\n";
	private static String CONSTRUCTOR_OPEN = "\tpublic " + CLASS_PREFIX + "%s(%s) {\n";
	private static String COPY_CONSTRUCTOR_OPEN = "\tpublic " + CLASS_PREFIX + "%s("+CLASS_PREFIX+"%s obj) {\n";
	
	private static String CONSTRUCTOR_BLOCK = "\t\tthis.%s = %s;\n";
	private static String COPY_CONSTRUCTOR_BLOCK = "\t\tthis.%s = obj.%s;\n";
	private static String CONSTRUCTOR_CLOSE = "\t}\n";
	private static String CONSTRUCTOR_PRIMARY_MAP = "\tpublic " + CLASS_PREFIX + "%s(Map<String, Object> map) {\n\t\tconvertTypeUnsafePrimaryMapToResource(map);\n\t}\n";
	private static String STATIC_METHODS = "\tpublic ResourceMetaData getMetaData() {\n\t\treturn metaData;\n\t}\n";
	private static String GET_CLUSTER = "\tpublic String getCluster() {\n\t\treturn \"%s\";\n\t}\n";
	private static String GET_CLUSTER_TYPE = "\tpublic String getClusterType() {\n\t\treturn \"%s\";\n\t}\n";
	private static String SET_DEFAULT_VALUES_START = "\tprivate void setDefaultValues() {\n";
	private static String SET_DEFAULT_VALUES_BLOCK = "\t\tif(%s == null)\n\t\t\t%s = %s;\n";
	private static String SET_DEFAULT_VALUES_CLOSE = "\t}\n";
	
	private static String CONVERT_RESOURCE_TO_MAP_START = "\tpublic Map<String, Object> convertResourceToMap() {\n\t\tHashMap<String, Object> map = new HashMap<String, Object>();\n";
	private static String CONVERT_RESOURCE_TO_MAP_BLOCK = "\t\tif(%s != null)\n\t\t\tmap.put(\"%s\", %s);\n";
	private static String CONVERT_RESOURCE_TO_MAP_CLOSE = "\t\treturn map;\n\t}\n";

	private static String VALIDATE_AND_CONVERT_RESOURCE_TO_MAP_START = "\tpublic Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {\n%s\t\tHashMap<String, Object> map = new HashMap<String, Object>();\n";
	private static String VALIDATE_AND_CONVERT_RESOURCE_TO_MAP_BLOCK0 = "\t\tif(add)\n\t\t\tsetDefaultValues();\n\n";
	private static String VALIDATE_AND_CONVERT_RESOURCE_TO_MAP_BLOCK1 = "\t\tif(%s != null)\n\t\t\tmap.put(\"%s\", %s);\n";
	private static String VALIDATE_AND_CONVERT_RESOURCE_TO_MAP_BLOCK2 = "\t\tif(validate%s(add))\n\t\t\tmap.put(\"%s\", %s);\n";
	private static String VALIDATE_AND_CONVERT_RESOURCE_TO_MAP_BLOCK3 = "\t\tif(add && %s == null)\n\t\t\t%s = new Date().getTime();\n";
	private static String VALIDATE_AND_CONVERT_RESOURCE_TO_MAP_CLOSE = "\t\treturn map;\n\t}\n";

	private static String CONVERT_RESOURCE_TO_PRIMARY_MAP_START = "\tpublic Map<String, Object> convertResourceToPrimaryMap() {\n\t\tHashMap<String, Object> map = new HashMap<String, Object>();\n";
	private static String CONVERT_RESOURCE_TO_PRIMARY_MAP_BLOCK = "\t\tif(%s != null)\n\t\t\tmap.put(\"%s\", %s);\n";
	private static String CONVERT_RESOURCE_TO_PRIMARY_MAP_CLOSE = "\t\treturn map;\n\t}\n";
	
	private static String CONVERT_MAP_TO_RESOURCE_START = "\tpublic void convertMapToResource(Map<String, Object> map) {\n";
	private static String CONVERT_MAP_TO_RESOURCE_BLOCK = "\t\t%s = (%s) map.get(\"%s\");\n";
	private static String CONVERT_ARRAY_TO_RESOURCE_BLOCK = "\t\t%s = (%s) map.get(\"%s\");\n";
	
	private static String CONVERT_MAP_TO_RESOURCE_CLOSE = "\t}\n";
	
	private static String SUPPRESS_WARNINGS_UNCHECKED = "\t@SuppressWarnings(\"unchecked\")\n";
	private static String CONVERT_TYPE_UNSAFE_MAP_TO_RESOURCE_START = "\tpublic void convertTypeUnsafeMapToResource(Map<String, Object> map) {\n";
	private static String CONVERT_TYPE_UNSAFE_MAP_TO_RESOURCE_STRING_BLOCK = "\t\tObject %sObj = map.get(\"%s\");\n\t\tif(%sObj != null)\n\t\t\t%s = %sObj.toString();\n\n";
	private static String CONVERT_TYPE_UNSAFE_MAP_TO_RESOURCE_CHAR_BLOCK = "\t\tObject %sObj = map.get(\"%s\");\n\t\tif(%sObj != null && %sObj.toString().length() > 0)\n\t\t\t%s = %sObj.toString().charAt(0);\n\n";
	private static String CONVERT_TYPE_UNSAFE_MAP_TO_RESOURCE_OTHERS_BLOCK = "\t\tObject %sObj = map.get(\"%s\");\n\t\tif(%sObj != null)\n\t\t\t%s = new %s(%sObj.toString());\n\n";
	private static String CONVERT_TYPE_UNSAFE_MAP_TO_RESOURCE_TIMESTAMP_BLOCK = "\t\tObject %sObj = map.get(\"%s\");\n\t\tif(%sObj != null)\n\t\t\t%s = new Long(%sObj.toString());\n\n";
	private static String CONVERT_TYPE_UNSAFE_MAP_TO_RESOURCE_DATE_BLOCK = "\t\tObject %sObj = map.get(\"%s\");\n\t\tif(%sObj != null)\n\t\t\t%s = new java.util.Date(new Long(%sObj.toString()));\n\n";	
	private static String CONVERT_TYPE_UNSAFE_MAP_TO_RESOURCE_NUMBER_BLOCK = "\t\tObject %sObj = map.get(\"%s\");\n\t\tif(%sObj != null)\n\t\t\t%s = new Double(%sObj.toString());\n\n";
	private static String CONVERT_TYPE_UNSAFE_MAP_TO_RESOURCE_CLOSE = "\t}\n";
	
	private static String CONVERT_PRIMARY_MAP_TO_RESOURCE_START = "\tpublic void convertPrimaryMapToResource(Map<String, Object> map) {\n";
	private static String CONVERT_PRIMARY_MAP_TO_RESOURCE_BLOCK = "\t\t%s = (%s) map.get(\"%s\");\n";
	private static String CONVERT_PRIMARY_MAP_TO_RESOURCE_CLOSE = "\t}\n";
	
	private static String CONVERT_TYPE_UNSAFE_PRIMARY_MAP_TO_RESOURCE_START = "\tpublic void convertTypeUnsafePrimaryMapToResource(Map<String, Object> map) {\n";
	private static String CONVERT_TYPE_UNSAFE_PRIMARY_MAP_TO_RESOURCE_STRING_BLOCK = "\t\tObject %sObj = map.get(\"%s\");\n\t\tif(%sObj != null)\n\t\t\t%s = %sObj.toString();\n\n";
	private static String CONVERT_TYPE_UNSAFE_PRIMARY_MAP_TO_RESOURCE_CHAR_BLOCK = "\t\tObject %sObj = map.get(\"%s\");\n\t\tif(%sObj != null && %sObj.toString().length() > 0)\n\t\t\t%s = %sObj.toString().charAt(0);\n\n";
	private static String CONVERT_TYPE_UNSAFE_PRIMARY_MAP_TO_RESOURCE_OTHERS_BLOCK = "\t\tObject %sObj = map.get(\"%s\");\n\t\tif(%sObj != null)\n\t\t\t%s = new %s(%sObj.toString());\n\n";
	private static String CONVERT_TYPE_UNSAFE_PRIMARY_MAP_TO_RESOURCE_CLOSE = "\t}\n";

	private static String GETTER_METHOD = "\tpublic %s get%s() {\n\t\treturn %s;\n\t}\n";
	private static String GETTER_DEFAULT_VALUE_METHOD = "\tpublic %s get%s() {\n\t\treturn %s != null ? %s : %s;\n\t}\n";
	private static String GETTER_NON_NULL_METHOD = "\tpublic %s get%s() {\n\t\treturn %s != null ? %s : %s;\n\t}\n";
	private static String GETTER_TIME_METHOD = "\tpublic String get%sStr() {\n\t\treturn %s != null ? new Date(%s).toString() : null;\n\t}\n";
	private static String GETTER_MAP_METHOD = "\tpublic %s get%s(String key) {\n\t\treturn %s == null ? null : %s.get(key);\n\t}\n";
	
	private static String SETTER_METHOD = "\tpublic void set%s(%s %s) {\n\t\tthis.%s = %s;\n\t}\n";
	private static String WRAPPER_SETTER_METHOD = "\tpublic void set%s(%s %s) {\n\t\tthis.%s = %s;\n\t}\n";
	private static String SETTER_MAP_METHOD = "\tpublic void set%s(String key, %s value) {\n\t\tif(%s == null)\n\t\t\t%s = new %s();\n\t\t%s.put(key, value);\n\t}\n";
	private static String SETTER_ARRAY_METHOD = "\tpublic void add%s(%s value) {\n\t\tif(%s == null)\n\t\t\t%s = new ArrayList<%s>();\n\t\t%s.add(value);\n\t}\n";

	private static String WRAPPER_SETTER_MAP_METHOD = "\tpublic void set%s(String key, %s value) {\n\t\tif(%s == null)\n\t\t\t%s = new %s();\n\t\t%s.put(key, value);\n\t}\n";
	private static String UNSETTER_METHOD = "\tpublic void unSet%s() {\n\t\tthis.%s = %s;\n\t}\n";
	
	private static String VALIDATE_METHOD_START = "\tpublic boolean validate%s(boolean add) throws ApplicationException {\n";
	private static String VALIDATE_METHOD_REQUIRED_BLOCK = "\t\tif(add && %s == null)\n\t\t\tthrow new ApplicationException(ExceptionSeverity.ERROR, \"Requierd validation Failed[%s]\");\n";
	private static String VALIDATE_METHOD_MIN_BLOCK = "\t\tif(%s != null && %s.compareTo(%s) < 0)\n\t\t\tthrow new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.MINIMUM_VALIDATION_FAILED, \"%s\", \"%s\");\n";
	private static String VALIDATE_METHOD_MIN_FILE_BLOCK = "\t\tif(%s != null && %s.length < %s)\n\t\t\tthrow new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.MINIMUM_VALIDATION_FAILED, \"%s\", \"%s\");\n";
	private static String VALIDATE_METHOD_MAX_BLOCK = "\t\tif(%s != null && %s.compareTo(%s) > 0)\n\t\t\tthrow new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.MAXIMUM_VALIDATION_FAILED, \"%s\", \"%s\");\n";
	private static String VALIDATE_METHOD_MAX_FILE_BLOCK = "\t\tif(%s != null && %s.length > %s)\n\t\t\tthrow new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.MAXIMUM_VALIDATION_FAILED, \"%s\", \"%s\");\n";
	private static String VALIDATE_METHOD_FILE_TYPE_BLOCK = "\t\tif(%s != null && !ResourceUtil.inArray(%s, %s))\n\t\t\tthrow new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_FILE_TYPE);\n";
	private static String VALIDATE_METHOD_CLOSE = "\t\treturn %s != null;\n\t}\n";
	private static StringBuffer generated;
	private static boolean isDefaultValueAvailable;
	private static Map<Field, String> defaultValuesMap;
	
	
	private void populateDefaultValues(Map<String, Field> resourceFields) {
		for(Entry<String, Field> entry : resourceFields.entrySet()) {
			Field resourceField = entry.getValue();
			String defaultValue = getDefaultValue(resourceField);
			if(defaultValue == null)
				continue;

			isDefaultValueAvailable = true;
			defaultValuesMap.put(resourceField, defaultValue);
		}
	}
	
	private void generateClass(ResourceMetaData resourceMetaData) {
		String resourceName = resourceMetaData.getName();
		Map<String, Field> resourceFields = resourceMetaData.getFields();
		System.out.println("Started Generation of Resource "+resourceName);
		generate(COPYRIGHT);
		generate(getPackageName());
		generate(String.format(IMPORT,resourceName));
		generate(String.format(CLASS_COMMENT, resourceMetaData.getComment()));
		if(resourceMetaData.isCacheable()) {
			generate(String.format(CLASS_OPEN_CACHEABLE, resourceName));
		} else {
			generate(String.format(CLASS_OPEN, resourceName));
		}
		Field field = new Field("extra_data");
		field.setType("Map");
		field.setValueType("Object");
		resourceFields.put("extra_data", field);
		boolean isMapFieldAvailable = false;
		for(Entry<String, Field> entry : resourceFields.entrySet()) {
			Field resourceField = entry.getValue();
			String description = resourceField.getDescription();
			if(resourceField.getType().equals("Map"))
				isMapFieldAvailable = true;
			if(description == null || description.length() == 0)
				description = "";
			else
				description = " //" + description;

			generate(String.format(FIELD_DEFINITION, getWrapperType(resourceField), resourceField.getName(), description));
		}
		generate("\n");
		for(Entry<String, Field> entry : resourceFields.entrySet()) {
			Field resourceField = entry.getValue();
			String description = resourceField.getDescription();
			if(resourceField.getType().equals("Map"))
				isMapFieldAvailable = true;
			if(description == null || description.length() == 0)
				description = "";
			else
				description = " //" + description;

			generate(String.format(FIELD_CONST_NAME,  resourceField.getName().toUpperCase(), resourceField.getName()));
		}
		generate("\n");
		generate(SERIAL_VERSION_FIELD_DEFINITION);
		generate(String.format(META_DATA_DEFINITION, resourceName));
		generate("\n");
		generate(String.format(STATIC_BLOCK_OPEN,  resourceMetaData.checkBeforeAdd(), resourceMetaData.checkBeforeUpdate()));
		for(Entry<String, Field> entry : resourceFields.entrySet()) {
			Field resourceField = entry.getValue();
			if(resourceField.isTransient())
				continue;
			generate(String.format(FIELD_STATIC_CONSTRUCTOR_BLOCK, resourceField.getName(), resourceField.getName(), resourceField.getType()));
			
			if(resourceField.isTime())
				generate(String.format(FIELD_STATIC_SET_TIME_BLOCK, resourceField.getName()));
			if(resourceField.isPrimary())
				generate(String.format(FIELD_STATIC_SET_PRIMARY_BLOCK, resourceField.getName()));
			if(resourceField.isIndexed())
				generate(String.format(FIELD_STATIC_SET_INDEXED_BLOCK, resourceField.getName()));
			if(resourceField.encrypt())
				generate(String.format(FIELD_STATIC_SET_ENCRYPT_BLOCK, resourceField.getName()));
			if(resourceField.isCounter())
				generate(String.format(FIELD_STATIC_SET_COUNTER_BLOCK, resourceField.getName()));
			if(resourceField.isRequired())
				generate(String.format(FIELD_STATIC_SET_REQUIRED_BLOCK, resourceField.getName()));
			if(resourceField.getValue() != null) {
				generate(String.format(FIELD_STATIC_SET_DEFAULTVALUE_BLOCK, resourceField.getName(),getDefaultValue(resourceField)));
			}
			
			if(resourceField.getLength() > 0)
				generate(String.format(FIELD_STATIC_SET_LENGTH_BLOCK, resourceField.getName(),resourceField.getLength()));
		
			if(resourceField.getPrecision() > 0)
				generate(String.format(FIELD_STATIC_SET_PRECISION_BLOCK, resourceField.getName(),resourceField.getPrecision()));
		
			if(resourceField.getType().equals("Map"))
				generate(String.format(FIELD_STATIC_SET_VALUE_TYPE_BLOCK, resourceField.getName(), resourceField.getValueType()));
			generate(String.format(FIELD_STATIC_ADD_META_DATA_BLOCK, resourceField.getName()));
		}
		if(resourceMetaData.getUniqueFieldNames() != null) {
			generate(UNIQUE_FIELDS_STATIC_OPEN);
			for(String[] uniqueFieldNames : resourceMetaData.getUniqueFieldNames()) {
				StringBuilder uniqueFieldsBuilder = new StringBuilder();
				for(String uniqueFieldName : uniqueFieldNames) {
					if(resourceFields.get(uniqueFieldName) == null) {
						System.out.println("\nFAILED TO GENERATE RESOURCES: ");
						System.out.println("*****Unique field \"" + uniqueFieldName + "\" does not exist in \"" + resourceName + "\" resource*****");
						System.exit(-1);
					}
					uniqueFieldsBuilder.append(String.format(UNIQUE_FIELDS_STATIC_INNER_BLOCK, uniqueFieldName));
				}
				generate(String.format(UNIQUE_FIELDS_STATIC_OUTER_BLOCK, uniqueFieldsBuilder.toString().replaceAll(", $", "")));
			}
			generate(UNIQUE_FIELDS_STATIC_CLOSE);
		}
		if (resourceMetaData.getTableName() != null)
			generate(String.format(SET_TABLE_NAME,  resourceMetaData.getTableName()));
		if (resourceMetaData.getTableName() != null)
			generate(String.format(SET_CLUSTER_NAME,  resourceMetaData.getCluster()));
		generate(STATIC_BLOCK_CLOSE);
		generate("\n");
		generate(String.format(DEFAULT_CONSTRUCTOR, resourceName));
		generate("\n");
		StringBuffer constructorArgs = new StringBuffer();
		for(Entry<String, Field> entry : resourceFields.entrySet()) {
			Field resourceField = entry.getValue();
			if(!resourceField.isPrimary())
				continue;
			if(constructorArgs.length() > 0)
				constructorArgs.append(", ");
			constructorArgs.append(resourceField.getType() + " " + resourceField.getName());
		}
		boolean isPrimaryKey = false;
		for(Entry<String, Field> entry : resourceFields.entrySet()) {
			Field resourceField = entry.getValue();
			if(resourceField.isPrimary()) {
				isPrimaryKey = true;
				break;
			}
		}
		if (isPrimaryKey) {
			generate(String.format(CONSTRUCTOR_OPEN, resourceName, constructorArgs));
			for(Entry<String, Field> entry : resourceFields.entrySet()) {
				Field resourceField = entry.getValue();
				if(!resourceField.isPrimary())
					continue;
				generate(String.format(CONSTRUCTOR_BLOCK, resourceField.getName(), resourceField.getName()));
			}
			generate(String.format(CONSTRUCTOR_CLOSE));
			generate("\n");
			generate(String.format(CONSTRUCTOR_PRIMARY_MAP, resourceName));
			generate("\n");
		}
		generate(String.format(COPY_CONSTRUCTOR_OPEN, resourceName, resourceName));
		for(Entry<String, Field> entry : resourceFields.entrySet()) {
			Field resourceField = entry.getValue();
			if(resourceField.isPrimary())
				continue;
			generate(String.format(COPY_CONSTRUCTOR_BLOCK, resourceField.getName(), resourceField.getName()));
		}
		generate(String.format(CONSTRUCTOR_CLOSE));
		generate("\n");
		generate(STATIC_METHODS);
		generate("\n");
		
		if(isDefaultValueAvailable) {
			generate(SET_DEFAULT_VALUES_START);
			for(Entry<String, Field> entry : resourceFields.entrySet()) {
				Field resourceField = entry.getValue();
				if (resourceField.getType().equals("timestamp"))
					continue;
				if(!defaultValuesMap.containsKey(resourceField))
					continue;
				generate(String.format(SET_DEFAULT_VALUES_BLOCK, resourceField.getName(), resourceField.getName(), defaultValuesMap.get(resourceField)));
			}
			generate(SET_DEFAULT_VALUES_CLOSE);
			generate("\n");
		}
		
		generate(CONVERT_RESOURCE_TO_MAP_START);
		for(Entry<String, Field> entry : resourceFields.entrySet()) {
			Field resourceField = entry.getValue();
			generate(String.format(CONVERT_RESOURCE_TO_MAP_BLOCK, resourceField.getName(), resourceField.getName(), resourceField.getName()));
		}
		generate(CONVERT_RESOURCE_TO_MAP_CLOSE);
		generate("\n");
		
		generate(String.format(VALIDATE_AND_CONVERT_RESOURCE_TO_MAP_START, isDefaultValueAvailable ? VALIDATE_AND_CONVERT_RESOURCE_TO_MAP_BLOCK0 : ""));
		for(Entry<String, Field> entry : resourceFields.entrySet()) {
			Field resourceField = entry.getValue();
			String convertedValue = resourceField.getName();
			if(resourceField.encrypt())
				convertedValue = "ResourceUtil.encrypt(" + convertedValue + ")";
			if(resourceField.isTimeGenerationRequired())
				generate(String.format(VALIDATE_AND_CONVERT_RESOURCE_TO_MAP_BLOCK3, resourceField.getName(), convertedValue));
			if(!resourceField.isValidationRequired())
				generate(String.format(VALIDATE_AND_CONVERT_RESOURCE_TO_MAP_BLOCK1, resourceField.getName(), resourceField.getName(), convertedValue));
			else
				generate(String.format(VALIDATE_AND_CONVERT_RESOURCE_TO_MAP_BLOCK2, capitalizeFirstChar(resourceField.getName()), resourceField.getName(), convertedValue));
		}
		generate(VALIDATE_AND_CONVERT_RESOURCE_TO_MAP_CLOSE);
		generate("\n");
		
		generate(CONVERT_RESOURCE_TO_PRIMARY_MAP_START);
		for(Entry<String, Field> entry : resourceFields.entrySet()) {
			Field resourceField = entry.getValue();
			if(!resourceField.isPrimary())
				continue;
			generate(String.format(CONVERT_RESOURCE_TO_PRIMARY_MAP_BLOCK, resourceField.getName(), resourceField.getName(), resourceField.getName()));
		}
		generate(CONVERT_RESOURCE_TO_PRIMARY_MAP_CLOSE);
		generate("\n");

		if(isMapFieldAvailable)
			generate(SUPPRESS_WARNINGS_UNCHECKED);
		generate(CONVERT_MAP_TO_RESOURCE_START);
		for(Entry<String, Field> entry : resourceFields.entrySet()) {
			Field resourceField = entry.getValue();
			if(resourceField.isTransient())
				continue;
			generate(String.format(CONVERT_MAP_TO_RESOURCE_BLOCK, resourceField.getName(), getWrapperType(resourceField), resourceField.getName()));
		}
		generate(CONVERT_MAP_TO_RESOURCE_CLOSE);
		generate("\n");
		
		if(isMapFieldAvailable)
			generate(SUPPRESS_WARNINGS_UNCHECKED);
		generate(CONVERT_TYPE_UNSAFE_MAP_TO_RESOURCE_START);
		for(Entry<String, Field> entry : resourceFields.entrySet()) {
			Field resourceField = entry.getValue();
			if(resourceField.isTransient())
				continue;
			
			if(resourceField.getType().equals("timestamp"))
				generate(String.format(CONVERT_TYPE_UNSAFE_MAP_TO_RESOURCE_TIMESTAMP_BLOCK, resourceField.getName(), resourceField.getName(), resourceField.getName(),
						resourceField.getName(), resourceField.getName()));
	
			else if(resourceField.getType().equals("date"))
				generate(String.format(CONVERT_TYPE_UNSAFE_MAP_TO_RESOURCE_DATE_BLOCK, resourceField.getName(), resourceField.getName(), resourceField.getName(),
						resourceField.getName(), resourceField.getName()));
		
			else if(resourceField.getType().equals("String"))
				generate(String.format(CONVERT_TYPE_UNSAFE_MAP_TO_RESOURCE_STRING_BLOCK, resourceField.getName(), resourceField.getName(), resourceField.getName(),
						resourceField.getName(), resourceField.getName()));
			else if(resourceField.getType().equals("char"))
				generate(String.format(CONVERT_TYPE_UNSAFE_MAP_TO_RESOURCE_CHAR_BLOCK, resourceField.getName(), resourceField.getName(), resourceField.getName(),
						resourceField.getName(), resourceField.getName(), resourceField.getName()));
			else if(resourceField.isArray() || resourceField.getType().equals("Map"))
				generate(String.format(CONVERT_MAP_TO_RESOURCE_BLOCK, resourceField.getName(), getWrapperType(resourceField), resourceField.getName()));
			else if(resourceField.isArray() || resourceField.getType().equals("Array"))
				generate(String.format(CONVERT_ARRAY_TO_RESOURCE_BLOCK, resourceField.getName(), getWrapperType(resourceField), resourceField.getName()));
			else if(resourceField.isArray() || resourceField.getType().equals("Number"))
				generate(String.format(CONVERT_TYPE_UNSAFE_MAP_TO_RESOURCE_NUMBER_BLOCK, resourceField.getName(), resourceField.getName(), resourceField.getName(),
						resourceField.getName(), resourceField.getName()));
			else
				generate(String.format(CONVERT_TYPE_UNSAFE_MAP_TO_RESOURCE_OTHERS_BLOCK, resourceField.getName(), resourceField.getName(), resourceField.getName(),
						resourceField.getName(), getWrapperType(resourceField), resourceField.getName()));
		}
		generate(CONVERT_TYPE_UNSAFE_MAP_TO_RESOURCE_CLOSE);
		generate("\n");
		
		generate(CONVERT_PRIMARY_MAP_TO_RESOURCE_START);
		for(Entry<String, Field> entry : resourceFields.entrySet()) {
			Field resourceField = entry.getValue();
			if(!resourceField.isPrimary())
				continue;
			generate(String.format(CONVERT_PRIMARY_MAP_TO_RESOURCE_BLOCK, resourceField.getName(), getWrapperType(resourceField), resourceField.getName()));
		}
		generate(CONVERT_PRIMARY_MAP_TO_RESOURCE_CLOSE);
		generate("\n");
		
		generate(CONVERT_TYPE_UNSAFE_PRIMARY_MAP_TO_RESOURCE_START);
		for(Entry<String, Field> entry : resourceFields.entrySet()) {
			Field resourceField = entry.getValue();
			if(!resourceField.isPrimary())
				continue;
			if(resourceField.getType().equals("String"))
				generate(String.format(CONVERT_TYPE_UNSAFE_PRIMARY_MAP_TO_RESOURCE_STRING_BLOCK, resourceField.getName(), resourceField.getName(), resourceField.getName(),
						resourceField.getName(), resourceField.getName()));
			else if(resourceField.getType().equals("char"))
				generate(String.format(CONVERT_TYPE_UNSAFE_PRIMARY_MAP_TO_RESOURCE_CHAR_BLOCK, resourceField.getName(), resourceField.getName(), resourceField.getName(),
						resourceField.getName(), resourceField.getName(), resourceField.getName()));
			else
				generate(String.format(CONVERT_TYPE_UNSAFE_PRIMARY_MAP_TO_RESOURCE_OTHERS_BLOCK, resourceField.getName(), resourceField.getName(), resourceField.getName(),
						resourceField.getName(), getWrapperType(resourceField), resourceField.getName()));
		}
		generate(CONVERT_TYPE_UNSAFE_PRIMARY_MAP_TO_RESOURCE_CLOSE);
		
		for(Entry<String, Field> entry : resourceFields.entrySet()) {
			Field resourceField = entry.getValue();
			String name = capitalizeFirstChar(resourceField.getName());
			String wrapperType = getWrapperType(resourceField);
			generate("\n");
			if(!defaultValuesMap.containsKey(resourceField) || (resourceField.getType().equals("timestamp"))) {
				generate(String.format(GETTER_METHOD, wrapperType, name, resourceField.getName()));
				if(!resourceField.isPrimary() && resourceField.isPrimitive()) {
					generate("\n");
					generate(String.format(GETTER_NON_NULL_METHOD, resourceField.getType(), name + "Ex", resourceField.getName(), resourceField.getName(), getValue(resourceField, null, true)));
				}
				if(resourceField.getType().equals("String")) {
					generate("\n");
					generate(String.format(GETTER_NON_NULL_METHOD, resourceField.getType(), name + "Ex", resourceField.getName(), resourceField.getName(), "\"\""));
				}
			} else {
				generate(String.format(GETTER_DEFAULT_VALUE_METHOD, wrapperType, name, resourceField.getName(), resourceField.getName(), defaultValuesMap.get(resourceField)));
			}
			generate("\n");
			if(resourceField.isTime()) {
				generate(String.format(GETTER_TIME_METHOD, name, resourceField.getName(), resourceField.getName()));
				generate("\n");
			} else if(resourceField.getType().equals("Map"))
				generate(String.format(GETTER_MAP_METHOD, getWrapperType(resourceField, resourceField.getValueType()), name, resourceField.getName(), resourceField.getName()));
			else if(resourceField.getType().equals("Array")) {
				
			}
				
			if(!resourceField.isTimeGenerationRequired()) {
				if(resourceField.getType().equals("Map")) {
					String implementationWrapperType = getWrapperType(resourceField, resourceField.getType(), true);
					String valueWrapperType = getWrapperType(resourceField, resourceField.getValueType());
					generate("\n");
					generate(String.format(SETTER_METHOD, name, wrapperType, resourceField.getName(), resourceField.getName(), resourceField.getName()));
					generate("\n");
					generate(String.format(SETTER_MAP_METHOD, name, resourceField.getValueType(), resourceField.getName(), resourceField.getName(), implementationWrapperType, resourceField.getName()));
					if(!resourceField.getValueType().equals(valueWrapperType)) {
						generate("\n");
						generate(String.format(WRAPPER_SETTER_MAP_METHOD, name, valueWrapperType, resourceField.getName(), resourceField.getName(), implementationWrapperType, resourceField.getName()));
					}
				} else if(resourceField.getType().equals("Array")) {
					String implementationWrapperType = getWrapperType(resourceField, resourceField.getType(), true);
					String valueWrapperType = getWrapperType(resourceField, resourceField.getValueType());
					generate("\n");
					generate(String.format(SETTER_METHOD, name, wrapperType, resourceField.getName(), resourceField.getName(), resourceField.getName()));
					generate("\n");
					generate(String.format(SETTER_ARRAY_METHOD, name, resourceField.getValueType(), resourceField.getName(),
							resourceField.getName(), resourceField.getValueType(),resourceField.getName()));
					if(!resourceField.getValueType().equals(valueWrapperType)) {
						generate("\n");
						generate(String.format(WRAPPER_SETTER_MAP_METHOD, name, valueWrapperType, resourceField.getName(), resourceField.getName(), implementationWrapperType, resourceField.getName()));
					}
				} else if(resourceField.getType().equals("timestamp")) {
					generate(String.format(SETTER_METHOD, name,wrapperType, resourceField.getName(), resourceField.getName(), resourceField.getName()));
					
				} else if(resourceField.getType().equals("date")) {
					generate(String.format(SETTER_METHOD, name,wrapperType, resourceField.getName(), resourceField.getName(), resourceField.getName()));
					
				}
				else {
					generate(String.format(SETTER_METHOD, name, resourceField.getType(), resourceField.getName(), resourceField.getName(), resourceField.getName()));
					if(!resourceField.getType().equals(wrapperType)) {
						generate("\n");
						generate(String.format(WRAPPER_SETTER_METHOD, name, wrapperType, resourceField.getName(), resourceField.getName(), resourceField.getName()));
					}
				}
				generate("\n");
				if (!resourceField.getType().equals("timestamp"))
					generate(String.format(UNSETTER_METHOD, name, resourceField.getName(), defaultValuesMap.get(resourceField)));
			}
			if(!resourceField.isTransient() && resourceField.isValidationRequired()) {
				generate("\n");
				generate(String.format(VALIDATE_METHOD_START, name));
				if(resourceField.isRequired())
					generate(String.format(VALIDATE_METHOD_REQUIRED_BLOCK, resourceField.getName(), resourceField.getName()));
				if(resourceField.getMinValue() != null) {
					if(resourceField.isFile())
						generate(String.format(VALIDATE_METHOD_MIN_FILE_BLOCK, resourceField.getName(), resourceField.getName(), getValue(resourceField, true), resourceField.getName(), resourceField.getMinValue()));
					else
						generate(String.format(VALIDATE_METHOD_MIN_BLOCK, resourceField.getName(), resourceField.getName(), getValue(resourceField, true), resourceField.getName(), resourceField.getMinValue()));
				}
				if(resourceField.getMaxValue() != null) {
					if(resourceField.isFile())
						generate(String.format(VALIDATE_METHOD_MAX_FILE_BLOCK, resourceField.getName(), resourceField.getName(), getValue(resourceField, false), resourceField.getName(), resourceField.getMaxValue()));
					else
						generate(String.format(VALIDATE_METHOD_MAX_BLOCK, resourceField.getName(), resourceField.getName(), getValue(resourceField, false), resourceField.getName(), resourceField.getMaxValue()));
				}
				if(resourceField.getName().endsWith(Field.FILE_TYPE_FIELD_SUFFIX)) {
					Field fileField = resourceFields.get(resourceField.getName().replaceAll(Field.FILE_TYPE_FIELD_SUFFIX, ""));
					if(fileField != null && fileField.isFile())
						generate(String.format(VALIDATE_METHOD_FILE_TYPE_BLOCK, resourceField.getName(), resourceField.getName(), fileField.isImage() ? "Field.IMAGE_CONTENT_TYPES" : "Field.DOC_CONTENT_TYPES"));
				}
				generate(String.format(VALIDATE_METHOD_CLOSE, resourceField.getName()));
			}
			
		}
		generate(String.format(GET_CLUSTER, resourceMetaData.getCluster()));
		generate(String.format(GET_CLUSTER_TYPE, resourceMetaData.getClusterType()));
		generate(CLASS_CLOSE);
		System.out.println("Finished Generation of Resource "+resourceName);
	}

	public String getDefaultValue(Field field) {
		return getValue(field, null);
	}

	public  String getValue(Field field, Boolean min) {
		return getValue(field, min, false);
	}
	
	public  String getValue(Field field, Boolean min, boolean nonNull) {
		String type = field.getType();
		Object value;
		if(min == null) {
			value = field.getValue();
			if(nonNull && value == null && !field.isPrimary() && field.isPrimitive()) {
				if(type.equals("boolean"))
					value = "false";
				else if(type.equals("byte") || type.equals("short") || type.equals("int") || type.equals("long") || type.equals("float") || type.equals("double") || type.equals("number"))
					value = "0";
				else if(type.equals("char"))
					value = "\\u0000";
			}
		} else if(min == true)
			value = field.getMinValue();
		else
			value = field.getMaxValue();

		if(value == null)
			return null;
		if(type.equals("byte"))
			return "(byte) " + value;
		if(type.equals("short"))
			return "(short) " + value;
		if(type.equals("char"))
			return "'" + value + "'";
		if(type.equals("long") || field.isFile())
			return value + "L";
		if(type.equals("float"))
			return value + "F";
		if(type.equals("String"))
			return "\"" + value + "\"";
		if(type.equals("timestamp"))
			return "\"" + value + "\"";
		if(type.equals("date"))
			return "\"" + value + "\"";
		if(type.equals("byte[]")) {
			StringBuilder valueStr = new StringBuilder("new byte[] {");
			int length = Array.getLength(value);
			for(int i = 0; i < length; i++) {
				if(i != 0)
					valueStr.append(", ");
				valueStr.append("(byte) " + Array.getByte(value, i)); 
			}
			return valueStr.append("}").toString();
		} else if(type.equals("short[]")) {
			StringBuilder valueStr = new StringBuilder("new short[] {");
			int length = Array.getLength(value);
			for(int i = 0; i < length; i++) {
				if(i != 0)
					valueStr.append(", ");
				valueStr.append("(short) " + Array.getShort(value, i)); 
			}
			return valueStr.append("}").toString();
		} else if(type.equals("int[]")) {
			StringBuilder valueStr = new StringBuilder("new int[] {");
			int length = Array.getLength(value);
			for(int i = 0; i < length; i++) {
				if(i != 0)
					valueStr.append(", ");
				valueStr.append(Array.getInt(value, i)); 
			}
			return valueStr.append("}").toString();
		} else if(type.equals("long[]")) {
			StringBuilder valueStr = new StringBuilder("new long[] {");
			int length = Array.getLength(value);
			for(int i = 0; i < length; i++) {
				if(i != 0)
					valueStr.append(", ");
				valueStr.append(Array.getLong(value, i) + "L"); 
			}
			return valueStr.append("}").toString();
		} else if(type.equals("float[]")) {
			StringBuilder valueStr = new StringBuilder("new float[] {");
			int length = Array.getLength(value);
			for(int i = 0; i < length; i++) {
				if(i != 0)
					valueStr.append(", ");
				valueStr.append(Array.getFloat(value, i) + "F"); 
			}
			return valueStr.append("}").toString();
		} else if(type.equals("double[]")) {
			StringBuilder valueStr = new StringBuilder("new double[] {");
			int length = Array.getLength(value);
			for(int i = 0; i < length; i++) {
				if(i != 0)
					valueStr.append(", ");
				valueStr.append(Array.getDouble(value, i)); 
			}
			return valueStr.append("}").toString();
		} else if(type.equals("String[]")) {
			StringBuilder valueStr = new StringBuilder("new String[] {");
			int length = Array.getLength(value);
			for(int i = 0; i < length; i++) {
				if(i != 0)
					valueStr.append(", ");
				valueStr.append("\"" + Array.get(value, i) + "\""); 
			}
			valueStr.append("}");
			return valueStr.toString();
		}
		return value.toString();
	}
	
	public String getWrapperType(Field field) {
		return getWrapperType(field, field.getType());
	}
	
	public String getWrapperType(Field field, String type) {
		return getWrapperType(field, type, false);
	}
	
	public String getWrapperType(Field field, String type, boolean implementationType) {
		if(type.equals("timestamp"))
			return "Long";
		if(type.equals("date"))
			return "java.util.Date";
		if(type.equals("boolean"))
			return "Boolean";
		if(type.equals("byte"))
			return "Byte";
		if(type.equals("short"))
			return "Short";
		if(type.equals("char"))
			return "Character";
		if(type.equals("int"))
			return "Integer";
		if(type.equals("long"))
			return "Long";
		if(type.equals("float"))
			return "Float";
		if(type.equals("double"))
			return "Double";
		if(type.equals("Map"))
			return (implementationType ? "HashMap" : "Map") + "<" + field.getKeyType() + ", " + getWrapperType(field, field.getValueType()) + ">";
		if(type.equals("Array"))
			return (implementationType ? "List" : "List") + "<" + getWrapperType(field, field.getValueType()) +">";
	
		return type;
	}
	
	public String capitalizeFirstChar(String input) {
		if (input == null || input.length() == 0)
			return null;
		return (input.charAt(0) + "").toUpperCase().charAt(0)
				+ input.substring(1);
	}
	public void generateCode(String definedPath, ResourceMap[] resourceMaps) throws Exception {
		for(ResourceMap resourceMap: resourceMaps) {
			System.out.println("Resource Generating " + resourceMap.getName());
			generated = new StringBuffer();
			isDefaultValueAvailable = false;
			defaultValuesMap = new HashMap<Field, String>();
			
			JsonParser parser = new JsonParser(definedPath, resourceMap.getName());
			parser.parse();
			ResourceMetaData resourceMetaData = parser.getResourceMetaData();
			if (resourceMetaData.getFields().size() > 1000) {
				throw new Exception("Number of column ["+resourceMetaData.getFields().size()+"] is more than limit "+200+ " for Column Family "+resourceMap.getName());
			}
			populateDefaultValues(resourceMetaData.getFields());
			generateClass(resourceMetaData);
	
			BufferedWriter writer = new BufferedWriter(new FileWriter(basePath + CLASS_PREFIX + resourceMap.getName() + FILE_EXTENSION, false));
			String toWrite = generated.toString();
			writer.write(toWrite);
			writer.flush();
			writer.close();
		}
		System.out.println(ResourcesToGenerate.resourceMaps.length + " resources are generated successfully under " + basePath);
	}
	
	public void generate(String str) {
		generated.append(str);
	}
}