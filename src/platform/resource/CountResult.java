/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.resource;

public class CountResult extends result {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int count;
	public CountResult() {
		setErrCode(0);
		setMessage("Success");
		count = 0;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int _count) {
		this.count = _count;
	}
}