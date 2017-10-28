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
	private String data_type = null; //ALL,COMMULATIVE,P1,P2,P3
	private Double kwh = null;
	private Double kvah = null;
	private Double kvarh = null;
	private Double kw = null;
	private Double kva = null;
	private Double pf = null;
	private Double voltage = null;
	private Double current = null;
	private Double md = null;
	private Double tdh = null;
	private Double frequency = null;
	private Double p1_kwh = null;
	private Double p1_kvah = null;
	private Double p1_kw = null;
	private Double p1_kva = null;
	private Double p1_kvarh = null;
	private Double p1_pf = null;
	private Double p1_voltage = null;
	private Double p1_current = null;
	private Double p1_md = null;
	private Double p1_tdh = null;
	private Double p1_frequency = null;
	private Double p2_kwh = null;
	private Double p2_kvah = null;
	private Double p2_kw = null;
	private Double p2_kva = null;
	private Double p2_kvarh = null;
	private Double p2_pf = null;
	private Double p2_voltage = null;
	private Double p2_current = null;
	private Double p2_md = null;
	private Double p2_tdh = null;
	private Double p2_frequency = null;
	private Double p3_kwh = null;
	private Double p3_kvah = null;
	private Double p3_kw = null;
	private Double p3_kva = null;
	private Double p3_kvarh = null;
	private Double p3_pf = null;
	private Double p3_voltage = null;
	private Double p3_current = null;
	private Double p3_md = null;
	private Double p3_tdh = null;
	private Double p3_frequency = null;


	public BaseMeterData() {
		super();
		setCategory((byte)40);
		setCommand((byte)1);
		setPacketType((byte)1);
	}

	public void populate_field() {
 		if (fields != null) return ;
		fields = new Field[48];
		fields[0] =  new Field("device_id","String",16);
		fields[1] = new Field("port","long");
		fields[2] = new Field("source","long");
		fields[3] =  new Field("data_type","String",0);
		fields[4] = new Field("kwh","double");
		fields[5] = new Field("kvah","double");
		fields[6] = new Field("kvarh","double");
		fields[7] = new Field("kw","double");
		fields[8] = new Field("kva","double");
		fields[9] = new Field("pf","double");
		fields[10] = new Field("voltage","double");
		fields[11] = new Field("current","double");
		fields[12] = new Field("md","double");
		fields[13] = new Field("tdh","double");
		fields[14] = new Field("frequency","double");
		fields[15] = new Field("p1_kwh","double");
		fields[16] = new Field("p1_kvah","double");
		fields[17] = new Field("p1_kw","double");
		fields[18] = new Field("p1_kva","double");
		fields[19] = new Field("p1_kvarh","double");
		fields[20] = new Field("p1_pf","double");
		fields[21] = new Field("p1_voltage","double");
		fields[22] = new Field("p1_current","double");
		fields[23] = new Field("p1_md","double");
		fields[24] = new Field("p1_tdh","double");
		fields[25] = new Field("p1_frequency","double");
		fields[26] = new Field("p2_kwh","double");
		fields[27] = new Field("p2_kvah","double");
		fields[28] = new Field("p2_kw","double");
		fields[29] = new Field("p2_kva","double");
		fields[30] = new Field("p2_kvarh","double");
		fields[31] = new Field("p2_pf","double");
		fields[32] = new Field("p2_voltage","double");
		fields[33] = new Field("p2_current","double");
		fields[34] = new Field("p2_md","double");
		fields[35] = new Field("p2_tdh","double");
		fields[36] = new Field("p2_frequency","double");
		fields[37] = new Field("p3_kwh","double");
		fields[38] = new Field("p3_kvah","double");
		fields[39] = new Field("p3_kw","double");
		fields[40] = new Field("p3_kva","double");
		fields[41] = new Field("p3_kvarh","double");
		fields[42] = new Field("p3_pf","double");
		fields[43] = new Field("p3_voltage","double");
		fields[44] = new Field("p3_current","double");
		fields[45] = new Field("p3_md","double");
		fields[46] = new Field("p3_tdh","double");
		fields[47] = new Field("p3_frequency","double");
	}

	public void dump() {
		System.out.println("device_id	:	 "+device_id);
		System.out.println("port	:	 "+port);
		System.out.println("source	:	 "+source);
		System.out.println("data_type	:	 "+data_type);
		System.out.println("kwh	:	 "+kwh);
		System.out.println("kvah	:	 "+kvah);
		System.out.println("kvarh	:	 "+kvarh);
		System.out.println("kw	:	 "+kw);
		System.out.println("kva	:	 "+kva);
		System.out.println("pf	:	 "+pf);
		System.out.println("voltage	:	 "+voltage);
		System.out.println("current	:	 "+current);
		System.out.println("md	:	 "+md);
		System.out.println("tdh	:	 "+tdh);
		System.out.println("frequency	:	 "+frequency);
		System.out.println("p1_kwh	:	 "+p1_kwh);
		System.out.println("p1_kvah	:	 "+p1_kvah);
		System.out.println("p1_kw	:	 "+p1_kw);
		System.out.println("p1_kva	:	 "+p1_kva);
		System.out.println("p1_kvarh	:	 "+p1_kvarh);
		System.out.println("p1_pf	:	 "+p1_pf);
		System.out.println("p1_voltage	:	 "+p1_voltage);
		System.out.println("p1_current	:	 "+p1_current);
		System.out.println("p1_md	:	 "+p1_md);
		System.out.println("p1_tdh	:	 "+p1_tdh);
		System.out.println("p1_frequency	:	 "+p1_frequency);
		System.out.println("p2_kwh	:	 "+p2_kwh);
		System.out.println("p2_kvah	:	 "+p2_kvah);
		System.out.println("p2_kw	:	 "+p2_kw);
		System.out.println("p2_kva	:	 "+p2_kva);
		System.out.println("p2_kvarh	:	 "+p2_kvarh);
		System.out.println("p2_pf	:	 "+p2_pf);
		System.out.println("p2_voltage	:	 "+p2_voltage);
		System.out.println("p2_current	:	 "+p2_current);
		System.out.println("p2_md	:	 "+p2_md);
		System.out.println("p2_tdh	:	 "+p2_tdh);
		System.out.println("p2_frequency	:	 "+p2_frequency);
		System.out.println("p3_kwh	:	 "+p3_kwh);
		System.out.println("p3_kvah	:	 "+p3_kvah);
		System.out.println("p3_kw	:	 "+p3_kw);
		System.out.println("p3_kva	:	 "+p3_kva);
		System.out.println("p3_kvarh	:	 "+p3_kvarh);
		System.out.println("p3_pf	:	 "+p3_pf);
		System.out.println("p3_voltage	:	 "+p3_voltage);
		System.out.println("p3_current	:	 "+p3_current);
		System.out.println("p3_md	:	 "+p3_md);
		System.out.println("p3_tdh	:	 "+p3_tdh);
		System.out.println("p3_frequency	:	 "+p3_frequency);
	}
	public String getDump() {
		String str="";
		str = str +",device_id:"+device_id;
		str = str +",port:"+port;
		str = str +",source:"+source;
		str = str +",data_type:"+data_type;
		str = str +",kwh:"+kwh;
		str = str +",kvah:"+kvah;
		str = str +",kvarh:"+kvarh;
		str = str +",kw:"+kw;
		str = str +",kva:"+kva;
		str = str +",pf:"+pf;
		str = str +",voltage:"+voltage;
		str = str +",current:"+current;
		str = str +",md:"+md;
		str = str +",tdh:"+tdh;
		str = str +",frequency:"+frequency;
		str = str +",p1_kwh:"+p1_kwh;
		str = str +",p1_kvah:"+p1_kvah;
		str = str +",p1_kw:"+p1_kw;
		str = str +",p1_kva:"+p1_kva;
		str = str +",p1_kvarh:"+p1_kvarh;
		str = str +",p1_pf:"+p1_pf;
		str = str +",p1_voltage:"+p1_voltage;
		str = str +",p1_current:"+p1_current;
		str = str +",p1_md:"+p1_md;
		str = str +",p1_tdh:"+p1_tdh;
		str = str +",p1_frequency:"+p1_frequency;
		str = str +",p2_kwh:"+p2_kwh;
		str = str +",p2_kvah:"+p2_kvah;
		str = str +",p2_kw:"+p2_kw;
		str = str +",p2_kva:"+p2_kva;
		str = str +",p2_kvarh:"+p2_kvarh;
		str = str +",p2_pf:"+p2_pf;
		str = str +",p2_voltage:"+p2_voltage;
		str = str +",p2_current:"+p2_current;
		str = str +",p2_md:"+p2_md;
		str = str +",p2_tdh:"+p2_tdh;
		str = str +",p2_frequency:"+p2_frequency;
		str = str +",p3_kwh:"+p3_kwh;
		str = str +",p3_kvah:"+p3_kvah;
		str = str +",p3_kw:"+p3_kw;
		str = str +",p3_kva:"+p3_kva;
		str = str +",p3_kvarh:"+p3_kvarh;
		str = str +",p3_pf:"+p3_pf;
		str = str +",p3_voltage:"+p3_voltage;
		str = str +",p3_current:"+p3_current;
		str = str +",p3_md:"+p3_md;
		str = str +",p3_tdh:"+p3_tdh;
		str = str +",p3_frequency:"+p3_frequency;
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
		if(data_type != null)
			map.put("data_type", data_type);
		if(kwh != null)
			map.put("kwh", kwh);
		if(kvah != null)
			map.put("kvah", kvah);
		if(kvarh != null)
			map.put("kvarh", kvarh);
		if(kw != null)
			map.put("kw", kw);
		if(kva != null)
			map.put("kva", kva);
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
		if(p1_kwh != null)
			map.put("p1_kwh", p1_kwh);
		if(p1_kvah != null)
			map.put("p1_kvah", p1_kvah);
		if(p1_kw != null)
			map.put("p1_kw", p1_kw);
		if(p1_kva != null)
			map.put("p1_kva", p1_kva);
		if(p1_kvarh != null)
			map.put("p1_kvarh", p1_kvarh);
		if(p1_pf != null)
			map.put("p1_pf", p1_pf);
		if(p1_voltage != null)
			map.put("p1_voltage", p1_voltage);
		if(p1_current != null)
			map.put("p1_current", p1_current);
		if(p1_md != null)
			map.put("p1_md", p1_md);
		if(p1_tdh != null)
			map.put("p1_tdh", p1_tdh);
		if(p1_frequency != null)
			map.put("p1_frequency", p1_frequency);
		if(p2_kwh != null)
			map.put("p2_kwh", p2_kwh);
		if(p2_kvah != null)
			map.put("p2_kvah", p2_kvah);
		if(p2_kw != null)
			map.put("p2_kw", p2_kw);
		if(p2_kva != null)
			map.put("p2_kva", p2_kva);
		if(p2_kvarh != null)
			map.put("p2_kvarh", p2_kvarh);
		if(p2_pf != null)
			map.put("p2_pf", p2_pf);
		if(p2_voltage != null)
			map.put("p2_voltage", p2_voltage);
		if(p2_current != null)
			map.put("p2_current", p2_current);
		if(p2_md != null)
			map.put("p2_md", p2_md);
		if(p2_tdh != null)
			map.put("p2_tdh", p2_tdh);
		if(p2_frequency != null)
			map.put("p2_frequency", p2_frequency);
		if(p3_kwh != null)
			map.put("p3_kwh", p3_kwh);
		if(p3_kvah != null)
			map.put("p3_kvah", p3_kvah);
		if(p3_kw != null)
			map.put("p3_kw", p3_kw);
		if(p3_kva != null)
			map.put("p3_kva", p3_kva);
		if(p3_kvarh != null)
			map.put("p3_kvarh", p3_kvarh);
		if(p3_pf != null)
			map.put("p3_pf", p3_pf);
		if(p3_voltage != null)
			map.put("p3_voltage", p3_voltage);
		if(p3_current != null)
			map.put("p3_current", p3_current);
		if(p3_md != null)
			map.put("p3_md", p3_md);
		if(p3_tdh != null)
			map.put("p3_tdh", p3_tdh);
		if(p3_frequency != null)
			map.put("p3_frequency", p3_frequency);
		return map;
	}

	public void convertMapToMessage(Map<String, Object> map) {
		device_id = (String) map.get("device_id");
		port = (Long) map.get("port");
		source = (Long) map.get("source");
		data_type = (String) map.get("data_type");
		kwh = (Double) map.get("kwh");
		kvah = (Double) map.get("kvah");
		kvarh = (Double) map.get("kvarh");
		kw = (Double) map.get("kw");
		kva = (Double) map.get("kva");
		pf = (Double) map.get("pf");
		voltage = (Double) map.get("voltage");
		current = (Double) map.get("current");
		md = (Double) map.get("md");
		tdh = (Double) map.get("tdh");
		frequency = (Double) map.get("frequency");
		p1_kwh = (Double) map.get("p1_kwh");
		p1_kvah = (Double) map.get("p1_kvah");
		p1_kw = (Double) map.get("p1_kw");
		p1_kva = (Double) map.get("p1_kva");
		p1_kvarh = (Double) map.get("p1_kvarh");
		p1_pf = (Double) map.get("p1_pf");
		p1_voltage = (Double) map.get("p1_voltage");
		p1_current = (Double) map.get("p1_current");
		p1_md = (Double) map.get("p1_md");
		p1_tdh = (Double) map.get("p1_tdh");
		p1_frequency = (Double) map.get("p1_frequency");
		p2_kwh = (Double) map.get("p2_kwh");
		p2_kvah = (Double) map.get("p2_kvah");
		p2_kw = (Double) map.get("p2_kw");
		p2_kva = (Double) map.get("p2_kva");
		p2_kvarh = (Double) map.get("p2_kvarh");
		p2_pf = (Double) map.get("p2_pf");
		p2_voltage = (Double) map.get("p2_voltage");
		p2_current = (Double) map.get("p2_current");
		p2_md = (Double) map.get("p2_md");
		p2_tdh = (Double) map.get("p2_tdh");
		p2_frequency = (Double) map.get("p2_frequency");
		p3_kwh = (Double) map.get("p3_kwh");
		p3_kvah = (Double) map.get("p3_kvah");
		p3_kw = (Double) map.get("p3_kw");
		p3_kva = (Double) map.get("p3_kva");
		p3_kvarh = (Double) map.get("p3_kvarh");
		p3_pf = (Double) map.get("p3_pf");
		p3_voltage = (Double) map.get("p3_voltage");
		p3_current = (Double) map.get("p3_current");
		p3_md = (Double) map.get("p3_md");
		p3_tdh = (Double) map.get("p3_tdh");
		p3_frequency = (Double) map.get("p3_frequency");
	}

 	public int getMessageSize() {return 376;}

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

	public String getData_type() {
		return data_type;
	}

	public String getData_typeEx() {
		return data_type != null ? data_type : "";
	}

	public void setData_type(String data_type) {
		this.data_type = data_type;
	}

	public void unSetData_type() {
		this.data_type = null;
	}

	public Double getKwh() {
		return kwh;
	}

	public double getKwhEx() {
		return kwh != null ? kwh : 0;
	}

	public void setKwh(double kwh) {
		this.kwh = kwh;
	}

	public void setKwh(Double kwh) {
		this.kwh = kwh;
	}

	public void unSetKwh() {
		this.kwh = null;
	}

	public Double getKvah() {
		return kvah;
	}

	public double getKvahEx() {
		return kvah != null ? kvah : 0;
	}

	public void setKvah(double kvah) {
		this.kvah = kvah;
	}

	public void setKvah(Double kvah) {
		this.kvah = kvah;
	}

	public void unSetKvah() {
		this.kvah = null;
	}

	public Double getKvarh() {
		return kvarh;
	}

	public double getKvarhEx() {
		return kvarh != null ? kvarh : 0;
	}

	public void setKvarh(double kvarh) {
		this.kvarh = kvarh;
	}

	public void setKvarh(Double kvarh) {
		this.kvarh = kvarh;
	}

	public void unSetKvarh() {
		this.kvarh = null;
	}

	public Double getKw() {
		return kw;
	}

	public double getKwEx() {
		return kw != null ? kw : 0;
	}

	public void setKw(double kw) {
		this.kw = kw;
	}

	public void setKw(Double kw) {
		this.kw = kw;
	}

	public void unSetKw() {
		this.kw = null;
	}

	public Double getKva() {
		return kva;
	}

	public double getKvaEx() {
		return kva != null ? kva : 0;
	}

	public void setKva(double kva) {
		this.kva = kva;
	}

	public void setKva(Double kva) {
		this.kva = kva;
	}

	public void unSetKva() {
		this.kva = null;
	}

	public Double getPf() {
		return pf;
	}

	public double getPfEx() {
		return pf != null ? pf : 0;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public void setPf(Double pf) {
		this.pf = pf;
	}

	public void unSetPf() {
		this.pf = null;
	}

	public Double getVoltage() {
		return voltage;
	}

	public double getVoltageEx() {
		return voltage != null ? voltage : 0;
	}

	public void setVoltage(double voltage) {
		this.voltage = voltage;
	}

	public void setVoltage(Double voltage) {
		this.voltage = voltage;
	}

	public void unSetVoltage() {
		this.voltage = null;
	}

	public Double getCurrent() {
		return current;
	}

	public double getCurrentEx() {
		return current != null ? current : 0;
	}

	public void setCurrent(double current) {
		this.current = current;
	}

	public void setCurrent(Double current) {
		this.current = current;
	}

	public void unSetCurrent() {
		this.current = null;
	}

	public Double getMd() {
		return md;
	}

	public double getMdEx() {
		return md != null ? md : 0;
	}

	public void setMd(double md) {
		this.md = md;
	}

	public void setMd(Double md) {
		this.md = md;
	}

	public void unSetMd() {
		this.md = null;
	}

	public Double getTdh() {
		return tdh;
	}

	public double getTdhEx() {
		return tdh != null ? tdh : 0;
	}

	public void setTdh(double tdh) {
		this.tdh = tdh;
	}

	public void setTdh(Double tdh) {
		this.tdh = tdh;
	}

	public void unSetTdh() {
		this.tdh = null;
	}

	public Double getFrequency() {
		return frequency;
	}

	public double getFrequencyEx() {
		return frequency != null ? frequency : 0;
	}

	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}

	public void setFrequency(Double frequency) {
		this.frequency = frequency;
	}

	public void unSetFrequency() {
		this.frequency = null;
	}

	public Double getP1_kwh() {
		return p1_kwh;
	}

	public double getP1_kwhEx() {
		return p1_kwh != null ? p1_kwh : 0;
	}

	public void setP1_kwh(double p1_kwh) {
		this.p1_kwh = p1_kwh;
	}

	public void setP1_kwh(Double p1_kwh) {
		this.p1_kwh = p1_kwh;
	}

	public void unSetP1_kwh() {
		this.p1_kwh = null;
	}

	public Double getP1_kvah() {
		return p1_kvah;
	}

	public double getP1_kvahEx() {
		return p1_kvah != null ? p1_kvah : 0;
	}

	public void setP1_kvah(double p1_kvah) {
		this.p1_kvah = p1_kvah;
	}

	public void setP1_kvah(Double p1_kvah) {
		this.p1_kvah = p1_kvah;
	}

	public void unSetP1_kvah() {
		this.p1_kvah = null;
	}

	public Double getP1_kw() {
		return p1_kw;
	}

	public double getP1_kwEx() {
		return p1_kw != null ? p1_kw : 0;
	}

	public void setP1_kw(double p1_kw) {
		this.p1_kw = p1_kw;
	}

	public void setP1_kw(Double p1_kw) {
		this.p1_kw = p1_kw;
	}

	public void unSetP1_kw() {
		this.p1_kw = null;
	}

	public Double getP1_kva() {
		return p1_kva;
	}

	public double getP1_kvaEx() {
		return p1_kva != null ? p1_kva : 0;
	}

	public void setP1_kva(double p1_kva) {
		this.p1_kva = p1_kva;
	}

	public void setP1_kva(Double p1_kva) {
		this.p1_kva = p1_kva;
	}

	public void unSetP1_kva() {
		this.p1_kva = null;
	}

	public Double getP1_kvarh() {
		return p1_kvarh;
	}

	public double getP1_kvarhEx() {
		return p1_kvarh != null ? p1_kvarh : 0;
	}

	public void setP1_kvarh(double p1_kvarh) {
		this.p1_kvarh = p1_kvarh;
	}

	public void setP1_kvarh(Double p1_kvarh) {
		this.p1_kvarh = p1_kvarh;
	}

	public void unSetP1_kvarh() {
		this.p1_kvarh = null;
	}

	public Double getP1_pf() {
		return p1_pf;
	}

	public double getP1_pfEx() {
		return p1_pf != null ? p1_pf : 0;
	}

	public void setP1_pf(double p1_pf) {
		this.p1_pf = p1_pf;
	}

	public void setP1_pf(Double p1_pf) {
		this.p1_pf = p1_pf;
	}

	public void unSetP1_pf() {
		this.p1_pf = null;
	}

	public Double getP1_voltage() {
		return p1_voltage;
	}

	public double getP1_voltageEx() {
		return p1_voltage != null ? p1_voltage : 0;
	}

	public void setP1_voltage(double p1_voltage) {
		this.p1_voltage = p1_voltage;
	}

	public void setP1_voltage(Double p1_voltage) {
		this.p1_voltage = p1_voltage;
	}

	public void unSetP1_voltage() {
		this.p1_voltage = null;
	}

	public Double getP1_current() {
		return p1_current;
	}

	public double getP1_currentEx() {
		return p1_current != null ? p1_current : 0;
	}

	public void setP1_current(double p1_current) {
		this.p1_current = p1_current;
	}

	public void setP1_current(Double p1_current) {
		this.p1_current = p1_current;
	}

	public void unSetP1_current() {
		this.p1_current = null;
	}

	public Double getP1_md() {
		return p1_md;
	}

	public double getP1_mdEx() {
		return p1_md != null ? p1_md : 0;
	}

	public void setP1_md(double p1_md) {
		this.p1_md = p1_md;
	}

	public void setP1_md(Double p1_md) {
		this.p1_md = p1_md;
	}

	public void unSetP1_md() {
		this.p1_md = null;
	}

	public Double getP1_tdh() {
		return p1_tdh;
	}

	public double getP1_tdhEx() {
		return p1_tdh != null ? p1_tdh : 0;
	}

	public void setP1_tdh(double p1_tdh) {
		this.p1_tdh = p1_tdh;
	}

	public void setP1_tdh(Double p1_tdh) {
		this.p1_tdh = p1_tdh;
	}

	public void unSetP1_tdh() {
		this.p1_tdh = null;
	}

	public Double getP1_frequency() {
		return p1_frequency;
	}

	public double getP1_frequencyEx() {
		return p1_frequency != null ? p1_frequency : 0;
	}

	public void setP1_frequency(double p1_frequency) {
		this.p1_frequency = p1_frequency;
	}

	public void setP1_frequency(Double p1_frequency) {
		this.p1_frequency = p1_frequency;
	}

	public void unSetP1_frequency() {
		this.p1_frequency = null;
	}

	public Double getP2_kwh() {
		return p2_kwh;
	}

	public double getP2_kwhEx() {
		return p2_kwh != null ? p2_kwh : 0;
	}

	public void setP2_kwh(double p2_kwh) {
		this.p2_kwh = p2_kwh;
	}

	public void setP2_kwh(Double p2_kwh) {
		this.p2_kwh = p2_kwh;
	}

	public void unSetP2_kwh() {
		this.p2_kwh = null;
	}

	public Double getP2_kvah() {
		return p2_kvah;
	}

	public double getP2_kvahEx() {
		return p2_kvah != null ? p2_kvah : 0;
	}

	public void setP2_kvah(double p2_kvah) {
		this.p2_kvah = p2_kvah;
	}

	public void setP2_kvah(Double p2_kvah) {
		this.p2_kvah = p2_kvah;
	}

	public void unSetP2_kvah() {
		this.p2_kvah = null;
	}

	public Double getP2_kw() {
		return p2_kw;
	}

	public double getP2_kwEx() {
		return p2_kw != null ? p2_kw : 0;
	}

	public void setP2_kw(double p2_kw) {
		this.p2_kw = p2_kw;
	}

	public void setP2_kw(Double p2_kw) {
		this.p2_kw = p2_kw;
	}

	public void unSetP2_kw() {
		this.p2_kw = null;
	}

	public Double getP2_kva() {
		return p2_kva;
	}

	public double getP2_kvaEx() {
		return p2_kva != null ? p2_kva : 0;
	}

	public void setP2_kva(double p2_kva) {
		this.p2_kva = p2_kva;
	}

	public void setP2_kva(Double p2_kva) {
		this.p2_kva = p2_kva;
	}

	public void unSetP2_kva() {
		this.p2_kva = null;
	}

	public Double getP2_kvarh() {
		return p2_kvarh;
	}

	public double getP2_kvarhEx() {
		return p2_kvarh != null ? p2_kvarh : 0;
	}

	public void setP2_kvarh(double p2_kvarh) {
		this.p2_kvarh = p2_kvarh;
	}

	public void setP2_kvarh(Double p2_kvarh) {
		this.p2_kvarh = p2_kvarh;
	}

	public void unSetP2_kvarh() {
		this.p2_kvarh = null;
	}

	public Double getP2_pf() {
		return p2_pf;
	}

	public double getP2_pfEx() {
		return p2_pf != null ? p2_pf : 0;
	}

	public void setP2_pf(double p2_pf) {
		this.p2_pf = p2_pf;
	}

	public void setP2_pf(Double p2_pf) {
		this.p2_pf = p2_pf;
	}

	public void unSetP2_pf() {
		this.p2_pf = null;
	}

	public Double getP2_voltage() {
		return p2_voltage;
	}

	public double getP2_voltageEx() {
		return p2_voltage != null ? p2_voltage : 0;
	}

	public void setP2_voltage(double p2_voltage) {
		this.p2_voltage = p2_voltage;
	}

	public void setP2_voltage(Double p2_voltage) {
		this.p2_voltage = p2_voltage;
	}

	public void unSetP2_voltage() {
		this.p2_voltage = null;
	}

	public Double getP2_current() {
		return p2_current;
	}

	public double getP2_currentEx() {
		return p2_current != null ? p2_current : 0;
	}

	public void setP2_current(double p2_current) {
		this.p2_current = p2_current;
	}

	public void setP2_current(Double p2_current) {
		this.p2_current = p2_current;
	}

	public void unSetP2_current() {
		this.p2_current = null;
	}

	public Double getP2_md() {
		return p2_md;
	}

	public double getP2_mdEx() {
		return p2_md != null ? p2_md : 0;
	}

	public void setP2_md(double p2_md) {
		this.p2_md = p2_md;
	}

	public void setP2_md(Double p2_md) {
		this.p2_md = p2_md;
	}

	public void unSetP2_md() {
		this.p2_md = null;
	}

	public Double getP2_tdh() {
		return p2_tdh;
	}

	public double getP2_tdhEx() {
		return p2_tdh != null ? p2_tdh : 0;
	}

	public void setP2_tdh(double p2_tdh) {
		this.p2_tdh = p2_tdh;
	}

	public void setP2_tdh(Double p2_tdh) {
		this.p2_tdh = p2_tdh;
	}

	public void unSetP2_tdh() {
		this.p2_tdh = null;
	}

	public Double getP2_frequency() {
		return p2_frequency;
	}

	public double getP2_frequencyEx() {
		return p2_frequency != null ? p2_frequency : 0;
	}

	public void setP2_frequency(double p2_frequency) {
		this.p2_frequency = p2_frequency;
	}

	public void setP2_frequency(Double p2_frequency) {
		this.p2_frequency = p2_frequency;
	}

	public void unSetP2_frequency() {
		this.p2_frequency = null;
	}

	public Double getP3_kwh() {
		return p3_kwh;
	}

	public double getP3_kwhEx() {
		return p3_kwh != null ? p3_kwh : 0;
	}

	public void setP3_kwh(double p3_kwh) {
		this.p3_kwh = p3_kwh;
	}

	public void setP3_kwh(Double p3_kwh) {
		this.p3_kwh = p3_kwh;
	}

	public void unSetP3_kwh() {
		this.p3_kwh = null;
	}

	public Double getP3_kvah() {
		return p3_kvah;
	}

	public double getP3_kvahEx() {
		return p3_kvah != null ? p3_kvah : 0;
	}

	public void setP3_kvah(double p3_kvah) {
		this.p3_kvah = p3_kvah;
	}

	public void setP3_kvah(Double p3_kvah) {
		this.p3_kvah = p3_kvah;
	}

	public void unSetP3_kvah() {
		this.p3_kvah = null;
	}

	public Double getP3_kw() {
		return p3_kw;
	}

	public double getP3_kwEx() {
		return p3_kw != null ? p3_kw : 0;
	}

	public void setP3_kw(double p3_kw) {
		this.p3_kw = p3_kw;
	}

	public void setP3_kw(Double p3_kw) {
		this.p3_kw = p3_kw;
	}

	public void unSetP3_kw() {
		this.p3_kw = null;
	}

	public Double getP3_kva() {
		return p3_kva;
	}

	public double getP3_kvaEx() {
		return p3_kva != null ? p3_kva : 0;
	}

	public void setP3_kva(double p3_kva) {
		this.p3_kva = p3_kva;
	}

	public void setP3_kva(Double p3_kva) {
		this.p3_kva = p3_kva;
	}

	public void unSetP3_kva() {
		this.p3_kva = null;
	}

	public Double getP3_kvarh() {
		return p3_kvarh;
	}

	public double getP3_kvarhEx() {
		return p3_kvarh != null ? p3_kvarh : 0;
	}

	public void setP3_kvarh(double p3_kvarh) {
		this.p3_kvarh = p3_kvarh;
	}

	public void setP3_kvarh(Double p3_kvarh) {
		this.p3_kvarh = p3_kvarh;
	}

	public void unSetP3_kvarh() {
		this.p3_kvarh = null;
	}

	public Double getP3_pf() {
		return p3_pf;
	}

	public double getP3_pfEx() {
		return p3_pf != null ? p3_pf : 0;
	}

	public void setP3_pf(double p3_pf) {
		this.p3_pf = p3_pf;
	}

	public void setP3_pf(Double p3_pf) {
		this.p3_pf = p3_pf;
	}

	public void unSetP3_pf() {
		this.p3_pf = null;
	}

	public Double getP3_voltage() {
		return p3_voltage;
	}

	public double getP3_voltageEx() {
		return p3_voltage != null ? p3_voltage : 0;
	}

	public void setP3_voltage(double p3_voltage) {
		this.p3_voltage = p3_voltage;
	}

	public void setP3_voltage(Double p3_voltage) {
		this.p3_voltage = p3_voltage;
	}

	public void unSetP3_voltage() {
		this.p3_voltage = null;
	}

	public Double getP3_current() {
		return p3_current;
	}

	public double getP3_currentEx() {
		return p3_current != null ? p3_current : 0;
	}

	public void setP3_current(double p3_current) {
		this.p3_current = p3_current;
	}

	public void setP3_current(Double p3_current) {
		this.p3_current = p3_current;
	}

	public void unSetP3_current() {
		this.p3_current = null;
	}

	public Double getP3_md() {
		return p3_md;
	}

	public double getP3_mdEx() {
		return p3_md != null ? p3_md : 0;
	}

	public void setP3_md(double p3_md) {
		this.p3_md = p3_md;
	}

	public void setP3_md(Double p3_md) {
		this.p3_md = p3_md;
	}

	public void unSetP3_md() {
		this.p3_md = null;
	}

	public Double getP3_tdh() {
		return p3_tdh;
	}

	public double getP3_tdhEx() {
		return p3_tdh != null ? p3_tdh : 0;
	}

	public void setP3_tdh(double p3_tdh) {
		this.p3_tdh = p3_tdh;
	}

	public void setP3_tdh(Double p3_tdh) {
		this.p3_tdh = p3_tdh;
	}

	public void unSetP3_tdh() {
		this.p3_tdh = null;
	}

	public Double getP3_frequency() {
		return p3_frequency;
	}

	public double getP3_frequencyEx() {
		return p3_frequency != null ? p3_frequency : 0;
	}

	public void setP3_frequency(double p3_frequency) {
		this.p3_frequency = p3_frequency;
	}

	public void setP3_frequency(Double p3_frequency) {
		this.p3_frequency = p3_frequency;
	}

	public void unSetP3_frequency() {
		this.p3_frequency = null;
	}
}