/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.defined;

public class ResourceMap {
	String name;
	String className;

	public ResourceMap(String name, String className) {
		this.name = name;
		this.className = className;
	}
	
	public String getName() {
		return name;
	}
	
	public String getClassName() {
		return className;
	}
}