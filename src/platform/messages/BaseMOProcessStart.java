/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.messages;

import platform.message.*;
import platform.util.*;
import java.util.*;
import platform.communication.*;

public abstract class BaseMOProcessStart extends Message {
	private static final long serialVersionUID = 1L;
	private String process_name = null;


	public BaseMOProcessStart() {
		super();
		setCategory((byte)6);
		setCommand((byte)6);
		setPacketType((byte)1);
	}

	public void populate_field() {
 		if (fields != null) return ;
		fields = new Field[1];
		fields[0] =  new Field("process_name","String",128);
	}

	public void dump() {
		System.out.println("process_name	:	 "+process_name);
	}
	public String getDump() {
		String str="";
		str = str +",process_name:"+process_name;
		return str;
	}

	public Map<String, Object> convertMessageToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(process_name != null)
			map.put("process_name", process_name);
		return map;
	}

	public void convertMapToMessage(Map<String, Object> map) {
		process_name = (String) map.get("process_name");
	}

 	public int getMessageSize() {return 128;}

 	public String getName() {return "MOProcessStart";}

public Message process(Session session,Message parentMessage) {return null;}

	public String getProcess_name() {
		return process_name;
	}

	public String getProcess_nameEx() {
		return process_name != null ? process_name : "";
	}

	public void setProcess_name(String process_name) {
		this.process_name = process_name;
	}

	public void unSetProcess_name() {
		this.process_name = null;
	}
}