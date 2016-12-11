package platform.exception;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;


public class ExceptionGenerator {
	private static String EXCEPTION_FILE = "./src/platform/exception/ExceptionEnum.java";
	private static String EXCEPTION_ENUM_OPEN = "public enum ExceptionEnum {\n";
	private static String EXCEPTION_PACKAGE = "package platform.exception;\n\n";
	private static String EXCEPTION_ENUM_CLOSE = "}";
	private static String EXCEPTION_MESSAGE_FILE="./src/platform/exception/ErrorMessage.json";
	
	private static String COPYRIGHT = "/*\n * Copyright 2010-2020 M16, Inc. All rights reserved.\n * This software and documentation contain valuable trade\n * secrets and proprietary property belonging to M16, Inc.\n * None of this software and documentation may be copied,\n * duplicated or disclosed without the express\n * written permission of M16, Inc.\n */\n\n";
	
	private static StringBuffer generated;

	private static String ReadExceptionFile() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(EXCEPTION_MESSAGE_FILE));
		StringBuffer jsonInput = new StringBuffer();
		while(true) {
			String line = reader.readLine();
			if(line == null)
				break;
			jsonInput.append(line);
		}
		reader.close();
		return jsonInput.toString();

	}
	public static void main(String []args) throws Exception {
			generated = new StringBuffer();
			String jsonText = ReadExceptionFile();
			Gson gson = new Gson();
			ExceptionMessageObject object = gson.fromJson(jsonText, ExceptionMessageObject.class);
			generateEnum(object);
			BufferedWriter writer = new BufferedWriter(new FileWriter(EXCEPTION_FILE, false));
			String toWrite = generated.toString();
			writer.write(toWrite);
			writer.flush();
			writer.close();
	}
	
	public static void generateEnum(ExceptionMessageObject object) {
		System.out.println("Started generation of ExceptionEnum.java ....");
		generate(COPYRIGHT);
		generate(EXCEPTION_PACKAGE);
		generate(String.format(EXCEPTION_ENUM_OPEN));
		for(ExceptionMessage message: object.getMessages()) {
				generate("\t/*"+message.getDescription()+"\n");
				if(message.getUsage() != null)
					generate("\t *Usage : "+message.getUsage()+"\n");
				generate("\t */\n");
				generate("\t"+message.getCode()+"\n"); 
				generate("\t"+"{"+"\n");
				generate("\t\t public String toString() {\n");
				generate("\t\t\t"+" return \""+message.getMessage()+"\";"+"\n");
				generate("\t\t}\n");
				generate("\t},\n");
		}
		generate(EXCEPTION_ENUM_CLOSE);
		System.out.println("Finished generation of ExceptionEnum.java");

	}

	public static void generate(String str) {
		generated.append(str);
	}
}
