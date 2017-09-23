/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */
package platform.util.security;

import org.apache.commons.codec.binary.Base64;

import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Profiler;
import platform.util.Util;

/*
 * Contains security functions to do AES encryption/decryption
 */
public class SecurityUtil {
	private static boolean aesInited;
	private static final int AES_BLOCK_SIZE = 16;
	private static final String API_AES_KEY = "Twinkle Twinkle Little Star WTSS"; //Keep it same as SecurityUtils.js::_API_AES_KEY
	
	public static final boolean IS_API_ENCRYPTION_ENABLED = false; //Keep it same as SecurityUtils.js::_IS_API_ENCRYPTION_ENABLED
	public static final String API_ENCRYPTION_COOKIE_NAME = "_good_good"; //Keep it same as SecurityUtils.js::_API_ENCRYPTION_COOKIE_NAME
	public static final String API_ENCRYPTION_COOKIE_VALUE = "_bad_bad"; //Keep it same as SecurityUtils.js::_API_ENCRYPTION_COOKIE_VALUE
	
	// If bytes is [1, 2, 3, 4, 5] and secondDimension is 3
	// returns [[1, 2, 3], [4, 5, 32]]
    public static byte[][] bytesTo2DBytes(byte[] bytes, int secondDimension) {
    	if (bytes == null || bytes.length == 0 || secondDimension <= 0)
    		return new byte[0][0];
    	
    	int bytesIndex;
    	byte[][] twoDBytes = new byte[(int) Math.ceil((double) bytes.length / secondDimension)][secondDimension];
    	for (int i = 0; i < twoDBytes.length; i++) {
    		for (int j = 0; j < secondDimension; j++) {
    			bytesIndex = i * secondDimension + j;
    			twoDBytes[i][j] = bytesIndex < bytes.length ? bytes[bytesIndex] : 32;
    		}
    	}
    	return twoDBytes;
    }
    
    // If twoDBytes is [[1, 2, 3], [4, 5]] and secondDimension is 3
 	// returns [1, 2, 3, 4, 5, 32]
    public static byte[] twoDBytesToBytes(byte[][] twoDBytes, int secondDimension) {
    	if (Util.isEmpty(twoDBytes) || secondDimension <= 0)
    		return new byte[0];
    	
    	int actualSecondDimension;
    	byte[] bytes = new byte[twoDBytes.length * secondDimension];
        for (int i = 0; i < twoDBytes.length; i++) {
        	actualSecondDimension = twoDBytes[i].length;
        	for (int j = 0; j < secondDimension; j++) {
        		bytes[i * secondDimension + j] = j < actualSecondDimension ? twoDBytes[i][j] : 32;
        	}
        }
        return bytes;
    }
    
    // If str is "test string" and secondDimension is 3
    // returns [[t, e, s], [t, , s], [t, r, i], [n, g, 0]] in unicode values
    public static byte[][] strTo2DBytes(String str, int secondDimension) throws ApplicationException {
    	return bytesTo2DBytes(Util.strToBytes(str), secondDimension);
    }
    
    // If twoDBytes is [[t, e, s], [t, , s], [t, r, i], [n, g, 0]] in unicode values
    // returns "test string"
    public static String twoDBytesToStr(byte[][] twoDBytes, int secondDimension) throws ApplicationException {
        return Util.bytesToStr(twoDBytesToBytes(twoDBytes, secondDimension));
    }
    
    public static String aesEncrypt(String plainText) throws ApplicationException {
    	return aesEncrypt(plainText, API_AES_KEY);
    }
    
    // Encrypts a plainText using AES encryption.
    // key should be of size 16, 24, 32 bytes only
    // key should be remembered to decrypt.
    public static String aesEncrypt(String plainText, String key) throws ApplicationException {
    	Profiler.getInstance().start("AES_ENCRYPTION");
    	try {
    		if (Util.isEmpty(plainText))
    			return "";
    		if (Util.isEmpty(key))
    			throw new ApplicationException(ExceptionSeverity.ERROR, "Key can't be empty to encrypt");
    		
    		if (!aesInited) {
    			AES.Init();
    			aesInited = true;
    		}
    		byte[] keyBytes = Util.strToBytes(key);
    		keyBytes = AES.ExpandKey(keyBytes);
    		byte[][] plainTextBytes = strTo2DBytes(plainText, AES_BLOCK_SIZE);

    		for (int i = 0; i < plainTextBytes.length; i+=8)
    			AES.Encrypt(plainTextBytes[i], keyBytes);

    		return encodeBase64FromBytes(twoDBytesToBytes(plainTextBytes, AES_BLOCK_SIZE));
    	} finally {
    		Profiler.getInstance().end("AES_ENCRYPTION");
    	}
    }
    
    public static String aesDecrypt(String plainText) throws ApplicationException {
    	return aesDecrypt(plainText, API_AES_KEY);
    }
    
    public static String aesDecrypt(String encryptedText, String key) throws ApplicationException {
    	Profiler.getInstance().start("AES_DECRYPTION");
    	try {
    		if (Util.isEmpty(encryptedText))
    			return "";
    		if (Util.isEmpty(key))
    			throw new ApplicationException(ExceptionSeverity.ERROR, "Key can't be empty to decrypt");
    		
    		if (!aesInited) {
    			AES.Init();
    			aesInited = true;
    		}
    		byte[] keyBytes = Util.strToBytes(key);
    		keyBytes = AES.ExpandKey(keyBytes);
    		byte[] bytes = decodeBase64ToBytes(encryptedText);
    		byte[][] encryptedTextBytes = bytesTo2DBytes(bytes, AES_BLOCK_SIZE);

    		for (int i = 0, endIndex = encryptedTextBytes.length; i < endIndex; i+=8)
    			AES.Decrypt(encryptedTextBytes[i], keyBytes);

    		return twoDBytesToStr(encryptedTextBytes, AES_BLOCK_SIZE).trim();
    	} finally {
    		Profiler.getInstance().end("AES_DECRYPTION");
    	}
    }
	 public static String encodeBase64FromBytes(byte[] bytes) throws ApplicationException {
			if (bytes == null || bytes.length == 0)
	    		return "";
			
			return Util.bytesToStr(Base64.encodeBase64(bytes));
		}
		
		public static byte[] decodeBase64ToBytes(String input) throws ApplicationException {
			return Base64.decodeBase64(Util.strToBytes(input));
		}
		
		public static String encodeBase64(String input) throws ApplicationException {
			return encodeBase64FromBytes(Util.strToBytes(input));
		}
		
		public static String decodeBase64(String input) throws ApplicationException {
			return Util.bytesToStr(decodeBase64ToBytes(input));
		}
		
		public static String base48Encode(Long no) {
	        Double num = Double.valueOf(no);
	        String charSet = "23456789abcdefghijkmnpqrstuvwxyzABCDEFGHIJKLMNPQRSTUVWXYZ";
	        Integer length = charSet.length();
	        String encodeString = new String();
	        while(num > length) {
	            encodeString = charSet.charAt(num.intValue() % length)+encodeString;
	             num = Math.ceil(new Double(num / length) - 1) ;
	        }
	        encodeString = charSet.charAt(num.intValue())+encodeString;
	 
	        return encodeString;
	    }
}