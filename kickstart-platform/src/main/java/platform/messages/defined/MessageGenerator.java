/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.messages.defined;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import platform.util.Field;
import platform.util.MessageMetaData;


public class MessageGenerator {
	private static String BASE_PATH = "./src/main/java/platform/messages/";
	
	private static String FILE_EXTENSION = ".java";
	private static String SERIAL_VERSION = "\tprivate static final long serialVersionUID = 1L;\n";
	
	private static String COPYRIGHT = "/*\n * Copyright 2010-2020 M16, Inc. All rights reserved.\n * This software and documentation contain valuable trade\n * secrets and proprietary property belonging to M16, Inc.\n * None of this software and documentation may be copied,\n * duplicated or disclosed without the express\n * written permission of M16, Inc.\n */\n\n";
	private static String PACKAGE = "package platform.messages;\n\n";
	private static String IMPORT = "import platform.message.*;\nimport platform.util.*;\nimport java.util.*;\nimport platform.communication.*;\n\n";
	private static String CLASS_PREFIX = "Base";
	private static String CLASS_OPEN = "public abstract class " + CLASS_PREFIX + "%s extends Message {\n";
	private static String CLASS_CLOSE = "}";
	private static String FIELD_DEFINITION = "\tprivate %s %s = null;%s\n";
	private static String DEFAULT_CONSTRUCTOR_START = "\tpublic " + CLASS_PREFIX + "%s() {\n";
	private static String DEFAULT_CONSTRUCTOR_END = "\t}\n";
	
	private static String GET_MESSAGE_SIZE = " \tpublic int getMessageSize() {return %s;}\n";
	private static String GET_NAME = " \tpublic String getName() {return \"%s\";}\n";
	
	private static String FIELD_DEFINE_START = "\tpublic void populate_field() {\n \t\tif (fields != null) return ;\n\t\tfields = new Field[%s];\n";
	private static String FIELD_DEFINE_CLOSE = "\t}\n";
	private static String FIELD_DEFINE_FIELD_LENGTH = "\t\tfields[%s] =  new Field(\"%s\",\"%s\",%s);\n";
	private static String FIELD_DEFINE_FIELD = "\t\tfields[%s] = new Field(\"%s\",\"%s\");\n";

	private static String GET_DUMP_START = "\tpublic String getDump() {\n\t\tString str=\"\";\n";
	private static String GET_DUMP_CLOSE = "\t\treturn str;\n\t}\n";
	private static String GET_DUMP_FIELD = "\t\tstr = str +\",%s:\"+%s;\n";
	private static String GET_DUMP_FIELD_BYTE = "\t\tstr = str +\", %s:\"+ (%s == null ? 0 : %s&0xFF);\n";
	private static String GET_DUMP_FIELD_BYTE_ARRAY = "\t\tstr = str +\", %s:\";\n\t\tif(%s == null){ \n \t\t\tstr = str +\"NULL\";\n \t\t} \n \t\telse {\n \t\t\tfor(int i=0; i < %s.length; i++) {\n \t\t\t\t str = str +\" \"+((int)%s[i]&0xFF);\n\t\t\t}\n \t\t\tstr = str +\"\";\n \t\t}\n";
	private static String GET_DUMP_FIELD_BYTE_HEX_ARRAY = "\t\tstr = str +\", %s:\";\n\t\tif(%s == null){ \n \t\t\tstr = str +\"NULL\";\n \t\t} \n \t\telse {\n \t\t\tstr = str +Util.convertByteToHexString(%s);\n \t\t}\n";
	private static String GET_DUMP_FIELD_INT_ARRAY = "\t\tstr = str +\", %s:\";\n\t\tif(%s == null){ \n \t\t\tstr = str +\"NULL\";\n \t\t} \n \t\telse {\n \t\t\tfor(int i=0; i < %s.length; i++) {\n \t\t\t\t str = str +\" \"+%s[i];\n\t\t\t}\n \t\t\tstr = str +\"\";\n \t\t}\n";
	
	private static String ISAPPLIANCE = "\tpublic boolean isApplianceMessage() {\n\t\t return true;\n\t}\n\n";
	private static String GET_PACKETFLAG = "\tpublic String getPacketFlag() {\n\t\t return \"%s\";\n\t}\n\n";
	private static String DUMP_START = "\tpublic void dump() {\n";
	private static String DUMP_CLOSE = "\t}\n";
	private static String DUMP_FIELD = "\t\tSystem.out.println(\"%s\t:\t \"+%s);\n";
	private static String DUMP_FIELD_BYTE = "\t\tSystem.out.println(\"%s\t:\t \"+ (%s == null ? 0 : %s&0xFF));\n";
	private static String DUMP_FIELD_BYTE_ARRAY = "\t\tSystem.out.print(\"%s\t:\");\n\t\t\tif(%s == null){ \n \t\t\t\tSystem.out.println(\"NULL\");\n \t\t\t} \n \t\t\telse {\n \t\t\t\tfor(int i=0; i < %s.length; i++) {\n \t\t\t\t\t System.out.print(\" \"+((int)%s[i]&0xFF));\n\t\t\t\t}\n \t\t\t\t\t\tSystem.out.println(\"\");\n \t\t\t\t}\n";
	private static String DUMP_FIELD_INT_ARRAY = "\t\tSystem.out.print(\"%s\t:\");\n\t\t\tif(%s == null){ \n \t\t\t\tSystem.out.println(\"NULL\");\n \t\t\t} \n \t\t\telse {\n \t\t\t\tfor(int i=0; i < %s.length; i++) {\n \t\t\t\t\t System.out.print(\" \"+%s[i]);\n\t\t\t\t}\n \t\t\t\t\t\tSystem.out.println(\"\");\n \t\t\t\t}\n";
	
	private static String PROCESS_MESSAGE = "public Message process(Session session,Message parentMessage) {return null;}"; 
	
	private static String SUPPRESS_WARNINGS_UNCHECKED = "\t@SuppressWarnings(\"unchecked\")\n";

	private static String GETTER_METHOD = "\tpublic %s get%s() {\n\t\treturn %s;\n\t}\n";
	private static String GETTER_DEFAULT_VALUE_METHOD = "\tpublic %s get%s() {\n\t\treturn %s != null ? %s : %s;\n\t}\n";
	private static String GETTER_NON_NULL_METHOD = "\tpublic %s get%s() {\n\t\treturn %s != null ? %s : %s;\n\t}\n";
	private static String GETTER_TIME_METHOD = "\tpublic String get%sStr() {\n\t\treturn %s != null ? new Date(%s).toString() : null;\n\t}\n";
	private static String GETTER_MAP_METHOD = "\tpublic %s get%s(String key) {\n\t\treturn %s == null ? null : %s.get(key);\n\t}\n";
	private static String SETTER_METHOD = "\tpublic void set%s(%s %s) {\n\t\tthis.%s = %s;\n\t}\n";
	private static String WRAPPER_SETTER_METHOD = "\tpublic void set%s(%s %s) {\n\t\tthis.%s = %s;\n\t}\n";
	private static String SETTER_MAP_METHOD = "\tpublic void set%s(String key, %s value) {\n\t\tif(%s == null)\n\t\t\t%s = new %s();\n\t\t%s.put(key, value);\n\t}\n";
	private static String WRAPPER_SETTER_MAP_METHOD = "\tpublic void set%s(String key, %s value) {\n\t\tif(%s == null)\n\t\t\t%s = new %s();\n\t\t%s.put(key, value);\n\t}\n";
	private static String UNSETTER_METHOD = "\tpublic void unSet%s() {\n\t\tthis.%s = %s;\n\t}\n";
	private static String CONVERT_MESSAGE_TO_MAP_START = "\tpublic Map<String, Object> convertMessageToMap() {\n\t\tHashMap<String, Object> map = new HashMap<String, Object>();\n";
	private static String CONVERT_MESSAGE_TO_MAP_BLOCK = "\t\tif(%s != null)\n\t\t\tmap.put(\"%s\", %s);\n";
	private static String CONVERT_MESSAGE_TO_MAP_CLOSE = "\t\treturn map;\n\t}\n";
	
	private static String CONVERT_MAP_TO_MESSAGE_START = "\tpublic void convertMapToMessage(Map<String, Object> map) {\n";
	private static String CONVERT_MAP_TO_MESSAGE_BLOCK = "\t\t%s = (%s) map.get(\"%s\");\n";
	private static String CONVERT_MAP_TO_MESSAGE_CLOSE = "\t}\n";
	
	
	private static StringBuffer generated;
	private static Map<Field, String> defaultValuesMap;

	public static void main(String []args) throws Exception {
		for(MessageMap messageMap: MessagesToGenerate.messageMaps) {
			generated = new StringBuffer();
			defaultValuesMap = new HashMap<Field, String>();
			
			JsonMessageParser parser = new JsonMessageParser(messageMap.getName());
			try {
				parser.parse();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(" Error in "+messageMap.getName());
				throw e;
			}
			MessageMetaData resourceMetaData = parser.getMessageMetaData();
			if (resourceMetaData.getFields().size() > 200) {
				throw new Exception("Number of column ["+resourceMetaData.getFields().size()+"] is more than limit "+200+ " for Column Family "+messageMap.getName());
			}
			populateDefaultValues(resourceMetaData.getFields());
			generateClass(resourceMetaData);

			BufferedWriter writer = new BufferedWriter(new FileWriter(BASE_PATH + CLASS_PREFIX + messageMap.getName() + FILE_EXTENSION, false));
			String toWrite = generated.toString();
			writer.write(toWrite);
			writer.flush();
			writer.close();
		}
		System.out.println(MessagesToGenerate.messageMaps.length + " resources are generated successfully under " + BASE_PATH);
	}
	
	private static void populateDefaultValues(Map<String, Field> resourceFields) {
		for(Entry<String, Field> entry : resourceFields.entrySet()) {
			Field resourceField = entry.getValue();
			String defaultValue = getDefaultValue(resourceField);
			if(defaultValue == null)
				continue;
			defaultValuesMap.put(resourceField, defaultValue);
		}
	}
	
	private static void generateClass(MessageMetaData messageMetaData) {
		String resourceName = messageMetaData.getName();
		Map<String, Field> resourceFields = messageMetaData.getFields();
		System.out.println("Started Generation of Resource "+resourceName);
		generate(COPYRIGHT);
		generate(PACKAGE);
		generate(IMPORT);
		generate(String.format(CLASS_OPEN, messageMetaData.getName()));
		generate(SERIAL_VERSION);
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
		}
		generate("\n");
		if (messageMetaData.isAppliance()) {
			generate(ISAPPLIANCE);
		}
		if (messageMetaData.getPacket_flag() != null) {
			generate(String.format(GET_PACKETFLAG, messageMetaData.getPacket_flag()));
		}
		generate(String.format(DEFAULT_CONSTRUCTOR_START, resourceName));
		generate("\t\tsuper();\n");
		generate("\t\tsetCategory((byte)"+messageMetaData.getCategory()+");\n");
		generate("\t\tsetCommand((byte)"+messageMetaData.getCommand()+");\n");
		generate("\t\tsetPacketType((byte)"+messageMetaData.getPacket_type()+");\n");
		ArrayList<String> messageIdlist = messageMetaData.getMessageIdList();
		for(String idField : messageIdlist) {
			generate("\t\taddMessageIdField(\""+idField+"\");\n");
		}
		generate(String.format(DEFAULT_CONSTRUCTOR_END));
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
		
		int numberOfFields = resourceFields.entrySet().size();
		generate(String.format(FIELD_DEFINE_START,numberOfFields));
		int sizeString = 0;
		int count = 0;
		for(Entry<String, Field> entry : resourceFields.entrySet()) {
			Field resourceField = entry.getValue();
			
			if (resourceField.getType().equals("String")) {
				generate(String.format(FIELD_DEFINE_FIELD_LENGTH, count,resourceField.getName(),resourceField.getType(), resourceField.getLength()));
				sizeString = sizeString + resourceField.getLength();
			} else if (resourceField.getType().equals("short")) {
				generate(String.format(FIELD_DEFINE_FIELD,count, resourceField.getName(),resourceField.getType()));
				sizeString = sizeString + 2;
			} else if (resourceField.getType().equals("byte")) {
				generate(String.format(FIELD_DEFINE_FIELD, count,resourceField.getName(),resourceField.getType()));
				sizeString = sizeString + 1;
			} else if (resourceField.getType().equals("int")) {
				generate(String.format(FIELD_DEFINE_FIELD, count,resourceField.getName(),resourceField.getType()));
				sizeString = sizeString + 4;
			}  else if (resourceField.getType().equals("long")) {
				generate(String.format(FIELD_DEFINE_FIELD, count,resourceField.getName(),resourceField.getType()));
				sizeString = sizeString + 4;
			} else if (resourceField.getType().equals("byte[]")) {
				generate(String.format(FIELD_DEFINE_FIELD_LENGTH,count, resourceField.getName(),resourceField.getType(), resourceField.getLength()));
				sizeString = sizeString + resourceField.getLength();
			} else if (resourceField.getType().equals("int[]")) {
				generate(String.format(FIELD_DEFINE_FIELD_LENGTH,count, resourceField.getName(),resourceField.getType(), resourceField.getLength()));
				sizeString = sizeString + 4*resourceField.getLength();
			}else if (resourceField.getType().equals("short[]")) {
				generate(String.format(FIELD_DEFINE_FIELD_LENGTH,count, resourceField.getName(),resourceField.getType(), resourceField.getLength()));
				sizeString = sizeString + 2*resourceField.getLength();
			} else if (resourceField.getType().equals("float[]")) {
				generate(String.format(FIELD_DEFINE_FIELD_LENGTH,count, resourceField.getName(),resourceField.getType(), resourceField.getLength()));
				sizeString = sizeString + 4*resourceField.getLength();
			}  else if (resourceField.getType().equals("float")) {
				generate(String.format(FIELD_DEFINE_FIELD, count,resourceField.getName(),resourceField.getType()));
				sizeString = sizeString + 4;
			} else if (resourceField.getType().equals("double[]")) {
				generate(String.format(FIELD_DEFINE_FIELD_LENGTH,count, resourceField.getName(),resourceField.getType(), resourceField.getLength()));
				sizeString = sizeString + 8*resourceField.getLength();
			}  else if (resourceField.getType().equals("double")) {
				generate(String.format(FIELD_DEFINE_FIELD, count,resourceField.getName(),resourceField.getType()));
				sizeString = sizeString + 8;
			} else {
				generate(resourceField.getName());
			}
			count++;
		}
		generate(FIELD_DEFINE_CLOSE);
		generate("\n");
		generate(String.format(DUMP_START));
		for(Entry<String, Field> entry : resourceFields.entrySet()) {
			Field resourceField = entry.getValue();
			if(resourceField.getType().equals("byte")) {
				generate(String.format(DUMP_FIELD_BYTE,resourceField.getName(),resourceField.getName(), resourceField.getName()));
			} else if(resourceField.getType().equals("byte[]")) {
				generate(String.format(DUMP_FIELD_BYTE_ARRAY,resourceField.getName(),resourceField.getName(), resourceField.getName(),resourceField.getName()));
			} else if(resourceField.getType().equals("int[]")) {
				generate(String.format(DUMP_FIELD_INT_ARRAY,resourceField.getName(),resourceField.getName(), resourceField.getName(),resourceField.getName()));
			} else {
				generate(String.format(DUMP_FIELD,resourceField.getName(),resourceField.getName()));
			}
		}
		generate(DUMP_CLOSE);
		generate(String.format(GET_DUMP_START));
		for(Entry<String, Field> entry : resourceFields.entrySet()) {
			Field resourceField = entry.getValue();
			if(resourceField.getType().equals("byte")) {
				generate(String.format(GET_DUMP_FIELD_BYTE,resourceField.getName(),resourceField.getName(), resourceField.getName()));
			} else if(resourceField.getType().equals("byte[]")) {
				generate(String.format(GET_DUMP_FIELD_BYTE_HEX_ARRAY,resourceField.getName(),resourceField.getName(), resourceField.getName(),resourceField.getName()));
				generate(String.format(GET_DUMP_FIELD_BYTE_ARRAY,resourceField.getName(),resourceField.getName(), resourceField.getName(),resourceField.getName()));
			} else if(resourceField.getType().equals("int[]")) {
				generate(String.format(GET_DUMP_FIELD_INT_ARRAY,resourceField.getName(),resourceField.getName(), resourceField.getName(),resourceField.getName()));
			} else {
				generate(String.format(GET_DUMP_FIELD,resourceField.getName(),resourceField.getName()));
			}
		}
		generate(GET_DUMP_CLOSE);
		generate("\n");
	
		generate(CONVERT_MESSAGE_TO_MAP_START);
		for(Entry<String, Field> entry : resourceFields.entrySet()) {
			Field resourceField = entry.getValue();
			if(resourceField.isTransient())
				continue;
			generate(String.format(CONVERT_MESSAGE_TO_MAP_BLOCK, resourceField.getName(), resourceField.getName(), resourceField.getName()));
		}
		generate(CONVERT_MESSAGE_TO_MAP_CLOSE);
		generate("\n");

		generate(CONVERT_MAP_TO_MESSAGE_START);
		for(Entry<String, Field> entry : resourceFields.entrySet()) {
			Field resourceField = entry.getValue();
			if(resourceField.isTransient())
				continue;
			generate(String.format(CONVERT_MAP_TO_MESSAGE_BLOCK, resourceField.getName(), getWrapperType(resourceField), resourceField.getName()));
		}
		generate(CONVERT_MAP_TO_MESSAGE_CLOSE);
		generate("\n");

		generate(String.format(GET_MESSAGE_SIZE,sizeString));
		generate("\n");
		generate(String.format(GET_NAME,messageMetaData.getName()));
		generate("\n");
		generate(String.format(PROCESS_MESSAGE));
		generate("\n");
		if(isMapFieldAvailable)
			generate(SUPPRESS_WARNINGS_UNCHECKED);
		
		if(isMapFieldAvailable)
			generate(SUPPRESS_WARNINGS_UNCHECKED);
		
		
		for(Entry<String, Field> entry : resourceFields.entrySet()) {
			Field resourceField = entry.getValue();
			String name = capitalizeFirstChar(resourceField.getName());
			String wrapperType = getWrapperType(resourceField);
			generate("\n");
			if(!defaultValuesMap.containsKey(resourceField)) {
				generate(String.format(GETTER_METHOD, wrapperType, name, resourceField.getName()));
				if(!resourceField.isPrimary() && resourceField.isPrimitive()) {
					generate("\n");
					generate(String.format(GETTER_NON_NULL_METHOD, resourceField.getType(), name + "Ex", resourceField.getName(), resourceField.getName(), getValue(resourceField, null, true)));
				}
				if(resourceField.getType().equals("String")) {
					generate("\n");
					generate(String.format(GETTER_NON_NULL_METHOD, resourceField.getType(), name + "Ex", resourceField.getName(), resourceField.getName(), "\"\""));
				}
			} else
				generate(String.format(GETTER_DEFAULT_VALUE_METHOD, wrapperType, name, resourceField.getName(), resourceField.getName(), defaultValuesMap.get(resourceField)));
			generate("\n");
			if(resourceField.isTime()) {
				generate(String.format(GETTER_TIME_METHOD, name, resourceField.getName(), resourceField.getName()));
				generate("\n");
			} else if(resourceField.getType().equals("Map"))
				generate(String.format(GETTER_MAP_METHOD, getWrapperType(resourceField, resourceField.getValueType()), name, resourceField.getName(), resourceField.getName()));
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
				} else {
					generate(String.format(SETTER_METHOD, name, resourceField.getType(), resourceField.getName(), resourceField.getName(), resourceField.getName()));
					if(!resourceField.getType().equals(wrapperType)) {
						generate("\n");
						generate(String.format(WRAPPER_SETTER_METHOD, name, wrapperType, resourceField.getName(), resourceField.getName(), resourceField.getName()));
					}
				}
				generate("\n");
				generate(String.format(UNSETTER_METHOD, name, resourceField.getName(), defaultValuesMap.get(resourceField)));
			}
			if(!resourceField.isTransient() && resourceField.isValidationRequired()) {
				generate("\n");
			}
		}
		generate(CLASS_CLOSE);
		System.out.println("Finished Generation of Resource "+resourceName);
	}

	public static String getDefaultValue(Field field) {
		return getValue(field, null);
	}

	public static String getValue(Field field, Boolean min) {
		return getValue(field, min, false);
	}
	
	public static String getValue(Field field, Boolean min, boolean nonNull) {
		String type = field.getType();
		Object value;
		if(min == null) {
			value = field.getValue();
			if(nonNull && value == null && !field.isPrimary() && field.isPrimitive()) {
				if(type.equals("boolean"))
					value = "false";
				else if(type.equals("byte") || type.equals("short") || type.equals("int") || type.equals("long") || type.equals("float") || type.equals("double"))
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
		if(type.equals("double"))
			return ""+value;
		if(type.equals("String"))
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
	
	public static String getWrapperType(Field field) {
		return getWrapperType(field, field.getType());
	}
	
	public static String getWrapperType(Field field, String type) {
		return getWrapperType(field, type, false);
	}
	
	public static String getWrapperType(Field field, String type, boolean implementationType) {
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
		return type;
	}
	
	public static String capitalizeFirstChar(String input) {
		if (input == null || input.length() == 0)
			return null;
		return (input.charAt(0) + "").toUpperCase().charAt(0)
				+ input.substring(1);
	}
	
	public static void generate(String str) {
		generated.append(str);
	}
}