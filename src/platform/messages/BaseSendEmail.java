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

public abstract class BaseSendEmail extends Message {
	private static final long serialVersionUID = 1L;
	private String to = null;
	private String subject = null;
	private String from = null;
	private String type = null;
	private String params = null;


	public BaseSendEmail() {
		super();
		setCategory((byte)6);
		setCommand((byte)15);
		setPacketType((byte)1);
	}

	public void populate_field() {
 		if (fields != null) return ;
		fields = new Field[5];
		fields[0] =  new Field("to","String",128);
		fields[1] =  new Field("subject","String",128);
		fields[2] =  new Field("from","String",128);
		fields[3] =  new Field("type","String",128);
		fields[4] =  new Field("params","String",4096);
	}

	public void dump() {
		System.out.println("to	:	 "+to);
		System.out.println("subject	:	 "+subject);
		System.out.println("from	:	 "+from);
		System.out.println("type	:	 "+type);
		System.out.println("params	:	 "+params);
	}
	public String getDump() {
		String str="";
		str = str +",to:"+to;
		str = str +",subject:"+subject;
		str = str +",from:"+from;
		str = str +",type:"+type;
		str = str +",params:"+params;
		return str;
	}

	public Map<String, Object> convertMessageToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(to != null)
			map.put("to", to);
		if(subject != null)
			map.put("subject", subject);
		if(from != null)
			map.put("from", from);
		if(type != null)
			map.put("type", type);
		if(params != null)
			map.put("params", params);
		return map;
	}

	public void convertMapToMessage(Map<String, Object> map) {
		to = (String) map.get("to");
		subject = (String) map.get("subject");
		from = (String) map.get("from");
		type = (String) map.get("type");
		params = (String) map.get("params");
	}

 	public int getMessageSize() {return 4608;}

 	public String getName() {return "SendEmail";}

public Message process(Session session,Message parentMessage) {return null;}

	public String getTo() {
		return to;
	}

	public String getToEx() {
		return to != null ? to : "";
	}

	public void setTo(String to) {
		this.to = to;
	}

	public void unSetTo() {
		this.to = null;
	}

	public String getSubject() {
		return subject;
	}

	public String getSubjectEx() {
		return subject != null ? subject : "";
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void unSetSubject() {
		this.subject = null;
	}

	public String getFrom() {
		return from;
	}

	public String getFromEx() {
		return from != null ? from : "";
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public void unSetFrom() {
		this.from = null;
	}

	public String getType() {
		return type;
	}

	public String getTypeEx() {
		return type != null ? type : "";
	}

	public void setType(String type) {
		this.type = type;
	}

	public void unSetType() {
		this.type = null;
	}

	public String getParams() {
		return params;
	}

	public String getParamsEx() {
		return params != null ? params : "";
	}

	public void setParams(String params) {
		this.params = params;
	}

	public void unSetParams() {
		this.params = null;
	}
}