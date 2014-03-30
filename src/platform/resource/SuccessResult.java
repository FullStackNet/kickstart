/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to C4T, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of C4T, Inc.
 */

package platform.resource;

public class SuccessResult extends result {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SuccessResult() {
		setErrCode(0);
		setMessage("Success");
	}
}