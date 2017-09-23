/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.util;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

public class InputValidator {
	private static Map<String, String> escapeMap;
	private static Pattern escapePattern;
	private static Map<String, String> unescapeMap;
	private static Pattern unescapePattern;
	
	static {
		//Keep this in sync with Utils.js::unescape() function which contains the reverse map
		escapeMap = new HashMap<String, String>();
		escapePattern = Pattern.compile("(" + StringUtils.join(escapeMap.keySet(), "|") + ")");
		
		unescapeMap = new HashMap<String, String>();
		unescapePattern = Pattern.compile("(" + StringUtils.join(unescapeMap.keySet(), "|") + ")");
		
	}

	public static String escape(String input) {
		if(Util.isEmpty(input))
			return input;
		
		StringBuffer buffer = new StringBuffer();
		Matcher matcher = escapePattern.matcher(input);
		while(matcher.find()) {
			String group = matcher.group(1);
			if(group.equals("(") || group.equals(")"))
				group = "\\" + group;
			matcher.appendReplacement(buffer, escapeMap.get(group));
		}
		matcher.appendTail(buffer);
		
		return buffer.toString();
	}
	
	public static String unescape(String input) {
		if(Util.isEmpty(input))
			return input;
		
		StringBuffer buffer = new StringBuffer();
		Matcher matcher = unescapePattern.matcher(input);
		while(matcher.find()) {
			String group = matcher.group(1);
			if(group.equals("(") || group.equals(")"))
				group = "\\" + group;
			matcher.appendReplacement(buffer, unescapeMap.get(group));
		}
		matcher.appendTail(buffer);
		
		return buffer.toString();
	}
}