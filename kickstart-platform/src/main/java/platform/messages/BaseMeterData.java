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

public abstract class BaseMeterData extends Message {
	private static final long serialVersionUID = 1L;
	private String device_id = null;
	private Long port = null;
	private Long source = null;
	private Long kwh = null;
	private Long kvah = null;
	private Long kvarh = null;
	private Long pf = null;
	private Long voltage = null;
	private Long current = null;
	private Long md = null;
	private Long tdh = null;
	private Long frequency = null;


	public BaseMeterData() {
		super();
		setCategory((byte)40);
		setCommand((byte)1);
		setPacketType((byte)1);
	}

	public void populate_field() {
 		if (fields != null) return ;
		fields = new Field[12];
		fields[0] =  new Field("device_id","String",16);
		fields[1] = new Field("port","long");
		fields[2] = new Field("source","long");
		fields[3] = new Field("kwh","long");
		fields[4] = new Field("kvah","long");
		fields[5] = new Field("kvarh","long");
		fields[6] = new Field("pf","long");
		fields[7] = new Field("voltage","long");
		fields[8] = new Field("current","long");
		fields[9] = new Field("md","long");
		fields[10] = new Field("tdh","long");
		fields[11] = new Field("frequency","long");
	}

	public void dump() {
		System.out.println("device_id	:	 "+device_id);
		System.out.println("port	:	 "+port);
		System.out.println("source	:	 "+source);
		System.out.println("kwh	:	 "+kwh);
		System.out.println("kvah	:	 "+kvah);
		System.out.println("kvarh	:	 "+kvarh);
		System.out.println("pf	:	 "+pf);
		System.out.println("voltage	:	 "+voltage);
		System.out.println("current	:	 "+current);
		System.out.println("md	:	 "+md);
		System.out.println("tdh	:	 "+tdh);
		System.out.println("frequency	:	 "+frequency);
	}
	public String getDump() {
		String str="";
		str = str +",device_id:"+device_id;
		str = str +",port:"+port;
		str = str +",source:"+source;
		str = str +",kwh:"+kwh;
		str = str +",kvah:"+kvah;
		str = str +",kvarh:"+kvarh;
		str = str +",pf:"+pf;
		str = str +",voltage:"+voltage;
		str = str +",current:"+current;
		str = str +",md:"+md;
		str = str +",tdh:"+tdh;
		str = str +",frequency:"+frequency;
		return str;
	}

	public Map<String, Object> convertMessageToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(device_id != null)
			map.put("device_id", device_id);
		if(port != null)
			map.put("port", port);
		if(source != null)
			map.put("source", source);
		if(kwh != null)
			map.put("kwh", kwh);
		if(kvah != null)
			map.put("kvah", kvah);
		if(kvarh != null)
			map.put("kvarh", kvarh);
		if(pf != null)
			map.put("pf", pf);
		if(voltage != null)
			map.put("voltage", voltage);
		if(current != null)
			map.put("current", current);
		if(md != null)
			map.put("md", md);
		if(tdh != null)
			map.put("tdh", tdh);
		if(frequency != null)
			map.put("frequency", frequency);
		return map;
	}

	public void convertMapToMessage(Map<String, Object> map) {
		device_id = (String) map.get("device_id");
		port = (Long) map.get("port");
		source = (Long) map.get("source");
		kwh = (Long) map.get("kwh");
		kvah = (Long) map.get("kvah");
		kvarh = (Long) map.get("kvarh");
		pf = (Long) map.get("pf");
		voltage = (Long) map.get("voltage");
		current = (Long) map.get("current");
		md = (Long) map.get("md");
		tdh = (Long) map.get("tdh");
		frequency = (Long) map.get("frequency");
	}

 	public int getMessageSize() {return 60;}

 	public String getName() {return "MeterData";}

public Message process(Session session,Message parentMessage) {return null;}

	public String getDevice_id() {
		return device_id;
	}

	public String getDevice_idEx() {
		return device_id != null ? device_id : "";
	}

	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}

	public void unSetDevice_id() {
		this.device_id = null;
	}

	public Long getPort() {
		return port;
	}

	public long getPortEx() {
		return port != null ? port : 0L;
	}

	public void setPort(long port) {
		this.port = port;
	}

	public void setPort(Long port) {
		this.port = port;
	}

	public void unSetPort() {
		this.port = null;
	}

	public Long getSource() {
		return source;
	}

	public long getSourceEx() {
		return source != null ? source : 0L;
	}

	public void setSource(long source) {
		this.source = source;
	}

	public void setSource(Long source) {
		this.source = source;
	}

	public void unSetSource() {
		this.source = null;
	}

	public Long getKwh() {
		return kwh;
	}

	public long getKwhEx() {
		return kwh != null ? kwh : 0L;
	}

	public void setKwh(long kwh) {
		this.kwh = kwh;
	}

	public void setKwh(Long kwh) {
		this.kwh = kwh;
	}

	public void unSetKwh() {
		this.kwh = null;
	}

	public Long getKvah() {
		return kvah;
	}

	public long getKvahEx() {
		return kvah != null ? kvah : 0L;
	}

	public void setKvah(long kvah) {
		this.kvah = kvah;
	}

	public void setKvah(Long kvah) {
		this.kvah = kvah;
	}

	public void unSetKvah() {
		this.kvah = null;
	}

	public Long getKvarh() {
		return kvarh;
	}

	public long getKvarhEx() {
		return kvarh != null ? kvarh : 0L;
	}

	public void setKvarh(long kvarh) {
		this.kvarh = kvarh;
	}

	public void setKvarh(Long kvarh) {
		this.kvarh = kvarh;
	}

	public void unSetKvarh() {
		this.kvarh = null;
	}

	public Long getPf() {
		return pf;
	}

	public long getPfEx() {
		return pf != null ? pf : 0L;
	}

	public void setPf(long pf) {
		this.pf = pf;
	}

	public void setPf(Long pf) {
		this.pf = pf;
	}

	public void unSetPf() {
		this.pf = null;
	}

	public Long getVoltage() {
		return voltage;
	}

	public long getVoltageEx() {
		return voltage != null ? voltage : 0L;
	}

	public void setVoltage(long voltage) {
		this.voltage = voltage;
	}

	public void setVoltage(Long voltage) {
		this.voltage = voltage;
	}

	public void unSetVoltage() {
		this.voltage = null;
	}

	public Long getCurrent() {
		return current;
	}

	public long getCurrentEx() {
		return current != null ? current : 0L;
	}

	public void setCurrent(long current) {
		this.current = current;
	}

	public void setCurrent(Long current) {
		this.current = current;
	}

	public void unSetCurrent() {
		this.current = null;
	}

	public Long getMd() {
		return md;
	}

	public long getMdEx() {
		return md != null ? md : 0L;
	}

	public void setMd(long md) {
		this.md = md;
	}

	public void setMd(Long md) {
		this.md = md;
	}

	public void unSetMd() {
		this.md = null;
	}

	public Long getTdh() {
		return tdh;
	}

	public long getTdhEx() {
		return tdh != null ? tdh : 0L;
	}

	public void setTdh(long tdh) {
		this.tdh = tdh;
	}

	public void setTdh(Long tdh) {
		this.tdh = tdh;
	}

	public void unSetTdh() {
		this.tdh = null;
	}

	public Long getFrequency() {
		return frequency;
	}

	public long getFrequencyEx() {
		return frequency != null ? frequency : 0L;
	}

	public void setFrequency(long frequency) {
		this.frequency = frequency;
	}

	public void setFrequency(Long frequency) {
		this.frequency = frequency;
	}

	public void unSetFrequency() {
		this.frequency = null;
	}
}