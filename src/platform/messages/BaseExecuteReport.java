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

public abstract class BaseExecuteReport extends Message {
	private static final long serialVersionUID = 1L;
	private String report_id = null;
	private String report_type = null;
	private String params = null;
	private String output = null;


	public BaseExecuteReport() {
		super();
		setCategory((byte)6);
		setCommand((byte)20);
		setPacketType((byte)1);
	}

	public void populate_field() {
 		if (fields != null) return ;
		fields = new Field[4];
		fields[0] =  new Field("report_id","String",128);
		fields[1] =  new Field("report_type","String",128);
		fields[2] =  new Field("params","String",4096);
		fields[3] =  new Field("output","String",128);
	}

	public void dump() {
		System.out.println("report_id	:	 "+report_id);
		System.out.println("report_type	:	 "+report_type);
		System.out.println("params	:	 "+params);
		System.out.println("output	:	 "+output);
	}
	public String getDump() {
		String str="";
		str = str +",report_id:"+report_id;
		str = str +",report_type:"+report_type;
		str = str +",params:"+params;
		str = str +",output:"+output;
		return str;
	}

	public Map<String, Object> convertMessageToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(report_id != null)
			map.put("report_id", report_id);
		if(report_type != null)
			map.put("report_type", report_type);
		if(params != null)
			map.put("params", params);
		if(output != null)
			map.put("output", output);
		return map;
	}

	public void convertMapToMessage(Map<String, Object> map) {
		report_id = (String) map.get("report_id");
		report_type = (String) map.get("report_type");
		params = (String) map.get("params");
		output = (String) map.get("output");
	}

 	public int getMessageSize() {return 4480;}

 	public String getName() {return "ExecuteReport";}

public Message process(Session session,Message parentMessage) {return null;}

	public String getReport_id() {
		return report_id;
	}

	public String getReport_idEx() {
		return report_id != null ? report_id : "";
	}

	public void setReport_id(String report_id) {
		this.report_id = report_id;
	}

	public void unSetReport_id() {
		this.report_id = null;
	}

	public String getReport_type() {
		return report_type;
	}

	public String getReport_typeEx() {
		return report_type != null ? report_type : "";
	}

	public void setReport_type(String report_type) {
		this.report_type = report_type;
	}

	public void unSetReport_type() {
		this.report_type = null;
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

	public String getOutput() {
		return output;
	}

	public String getOutputEx() {
		return output != null ? output : "";
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public void unSetOutput() {
		this.output = null;
	}
}