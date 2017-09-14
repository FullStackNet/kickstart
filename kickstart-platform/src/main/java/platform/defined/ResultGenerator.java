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

import platform.db.ResourceMetaData;


public class ResultGenerator {
	private static String BASE_PATH = "./src/result/";
	
	private static String FILE_EXTENSION = ".java";

	private static String COPYRIGHT = "/*\n * Copyright 2010-2020 M16, Inc. All rights reserved.\n * This software and documentation contain valuable trade\n * secrets and proprietary property belonging to M16, Inc.\n * None of this software and documentation may be copied,\n * duplicated or disclosed without the express\n * written permission of M16, Inc.\n */\n\n";
	private static String PACKAGE = "package result;\n\n";
	private static String IMPORT = "\nimport m2m.platform.resource.BaseResult;\nimport application.resource.%s;\n\n";
	private static String CLASS_COMMENT = "/*\n ********** This is a generated class **********\n * %s\n */\n";
	private static String CLASS_PREFIX = "Result";
	private static String CLASS_OPEN = "public class %s" + CLASS_PREFIX + " extends BaseResult {\n";
	private static String CLASS_CLOSE = "}";
	private static String DECLARE_RC ="\tpublic int rc;\n";
	private static String DECLARE_MESSAGE ="\tpublic String message;\n";
	private static String DECLARE_RESOURCE ="\tpublic %s[] resource;\n";		
	private static String GET_RC ="\tpublic int getRc() { return rc;}\n";
	private static String SET_RC ="\tpublic void getRc(int rc1) { this.rc = rc1;}\n";
	private static String GET_MESSAGE ="\tpublic String getMessage() { return message;}\n";
	private static String SET_MESSAGE ="\tpublic void setMessage(String message) { this.message = message;}\n";
	private static String GET_RESOURCE ="\tpublic %s[] getResource() { return resource;}\n";
	private static StringBuffer generated;


	public static void main(String []args) throws Exception {
		for(ResourceMap resourceMap: ResourcesToGenerate.resourceMaps) {
			generated = new StringBuffer();
			JsonParser parser = new JsonParser("", resourceMap.getName());
			parser.parse();
			ResourceMetaData resourceMetaData = parser.getResourceMetaData();
			if (resourceMetaData.getFields().size() > 200) {
				throw new Exception("Number of column ["+resourceMetaData.getFields().size()+"] is more than limit "+200+ " for Column Family "+resourceMap.getName());
			}
			generateClass(resourceMetaData);

			BufferedWriter writer = new BufferedWriter(new FileWriter(BASE_PATH + resourceMap.getName()+CLASS_PREFIX+ FILE_EXTENSION, false));
			String toWrite = generated.toString();
			writer.write(toWrite);
			writer.flush();
			writer.close();
		}
		System.out.println(ResourcesToGenerate.resourceMaps.length + " resources are generated successfully under " + BASE_PATH);
	}
	
	
	
	private static void generateClass(ResourceMetaData resourceMetaData) {
		String resourceName = resourceMetaData.getName();
		System.out.println("Started Generation of Result "+resourceName);
		generate(COPYRIGHT);
		generate(PACKAGE);
		generate(String.format(IMPORT,resourceName));
		generate(String.format(CLASS_OPEN, resourceName));
		generate(String.format(CLASS_COMMENT, resourceMetaData.getComment()));
		generate(DECLARE_RC);
		generate(DECLARE_MESSAGE);
		generate(String.format(DECLARE_RESOURCE,resourceName));
		generate(GET_RC);
		generate(SET_RC);
		generate(GET_MESSAGE);
		generate(SET_MESSAGE);
		generate(String.format(GET_RESOURCE,resourceName));
		generate(CLASS_CLOSE);
		System.out.println("Finished Generation of Result "+resourceName);
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