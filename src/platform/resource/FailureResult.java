/*
 * Copyright 2010-2020 C4T, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to C4T, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of C4T, Inc.
 */

package platform.resource;

import platform.util.ApplicationException;



public class FailureResult extends result {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public FailureResult(ApplicationException e) {
		//setErrCode(e.getErrCode());
		setErrCode(-1);
		setMessage(e.getMessage());
	}
	public FailureResult(Exception e) {
		//setErrCode(e.getErrCode());
		setErrCode(-1);
		setMessage(e.getMessage());
	}
}