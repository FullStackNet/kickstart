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

public abstract class BaseGatewayReady extends Message {
	private static final long serialVersionUID = 1L;
	private Byte state = null;


	public BaseGatewayReady() {
		super();
		setCategory((byte)1);
		setCommand((byte)6);
		setPacketType((byte)1);
	}

	public void populate_field() {
 		if (fields != null) return ;
		fields = new Field[1];
		fields[0] = new Field("state","byte");
	}

	public void dump() {
		System.out.println("state	:	 "+ (state == null ? 0 : state&0xFF));
	}
	public String getDump() {
		String str="";
		str = str +", state:"+ (state == null ? 0 : state&0xFF);
		return str;
	}

	public Map<String, Object> convertMessageToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(state != null)
			map.put("state", state);
		return map;
	}

	public void convertMapToMessage(Map<String, Object> map) {
		state = (Byte) map.get("state");
	}

 	public int getMessageSize() {return 1;}

 	public String getName() {return "GatewayReady";}

public Message process(Session session,Message parentMessage) {return null;}

	public Byte getState() {
		return state;
	}

	public byte getStateEx() {
		return state != null ? state : (byte) 0;
	}

	public void setState(byte state) {
		this.state = state;
	}

	public void setState(Byte state) {
		this.state = state;
	}

	public void unSetState() {
		this.state = null;
	}
}