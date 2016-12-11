/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to C4T, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of C4T, Inc.
 */

package platform.util;

import platform.exception.ExceptionEnum;

@SuppressWarnings("serial")
public class ApplicationException extends Exception {
	private	int severity;
	private String formatedMessage;
	private ExceptionEnum errorCode;
	
	public ApplicationException(int severity, String message) {
		super(message);
		this.severity = severity;
		this.errorCode = null;
	}

	public ApplicationException(int severity, ExceptionEnum code, Object... args) {
		super(code.toString());
		this.severity = severity;
		formatedMessage = String.format(code.toString(),args);
		errorCode = code;
	}
	
	public ApplicationException(int severity, ExceptionEnum code) {
		super(code.toString());
		this.severity = severity;
		formatedMessage = String.format(code.toString());
		errorCode = code;
	}
	
	public String getMessage() {
		if (formatedMessage == null)
			return super.getMessage();
		else {
			return formatedMessage;
		}
	}
	
	public boolean isInfo() {
		return severity == ExceptionSeverity.INFO;
	}
	
	public boolean isWarning() {
		return severity == ExceptionSeverity.WARNING;
	}
	
	public boolean isError() {
		return severity == ExceptionSeverity.ERROR;
	}
	
	public boolean isFatal() {
		return severity == ExceptionSeverity.FATAL;
	}
	public ExceptionEnum getErrorCode() {
		return this.errorCode;
	}
}