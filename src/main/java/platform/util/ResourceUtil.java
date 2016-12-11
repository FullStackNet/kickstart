/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;

import platform.resource.BaseResource;


public class ResourceUtil {
	public static String ENCODING = "UTF-8";
	public static int HEX_RADIX = 16;
	
	public static boolean inArray(Object needle, Object [] hayStack) {
		if(needle == null || hayStack == null)
			return false;
		
		for(Object value : hayStack) {
			if(needle.equals(value))
				return true;
		}
		return false;
	}
	
	//Uses MD5 to encrypt strings
	//Returns 32 characters hexa decimal string
	public static String encrypt(String input) throws ApplicationException {
		try {
			byte[] encryptedBytes = MessageDigest.getInstance("MD5").digest(input.getBytes(ENCODING));
			return new BigInteger(1, encryptedBytes).toString(HEX_RADIX);
		} catch(Exception e) {
			throw new ApplicationException(ExceptionSeverity.ERROR, e.toString());
		}
	}
	
	@SuppressWarnings("unchecked")
	public static <c> void typeCast(BaseResource[] r, c[] cls) throws ApplicationException {
		if (Util.isEmpty(r)) {
			return;
		}
		
		if (Util.isEmpty(cls) || r.length != cls.length) {
			throw new ApplicationException(ExceptionSeverity.ERROR, "incompatible arrays");
		}
		for (int i=0; i<r.length; i++) {
			cls[i] = (c)r[i];
		}
	}
	
	//pageNum starts with 1 and pageSize starts with 1
	//pageNum and pageSize must be atleast 1
	//no pagination if pageNum and pageSize is -1
	public static BaseResource[] getPage(BaseResource[] array, int pageNum, int pageSize) {
		if (pageNum < 0 && pageSize < 0)
			return array;
		
		if (Util.isEmpty(array) || pageNum < 1 || pageSize < 1)
			return null;
		
		int arraySize = array.length;

		int from = ((pageNum-1)*pageSize);
		if (from > arraySize)
			return null;
		int to = (array.length < from+pageSize ? array.length:from+pageSize);
		return Arrays.copyOfRange(array, from, to);
	}
	
}