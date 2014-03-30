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

public abstract class BaseMOStatsAgent extends Message {
	private static final long serialVersionUID = 1L;
	private String id = null;
	private Double cpu_usage = null;
	private Long free_memory = null;
	private Long total_memory = null;
	private Long usage_memory = null;
	private Long free_disk = null;
	private Long total_disk = null;
	private Long usage_disk = null;


	public BaseMOStatsAgent() {
		super();
		setCategory((byte)6);
		setCommand((byte)13);
		setPacketType((byte)1);
	}

	public void populate_field() {
 		if (fields != null) return ;
		fields = new Field[8];
		fields[0] =  new Field("id","String",128);
		fields[1] = new Field("cpu_usage","double");
		fields[2] = new Field("free_memory","long");
		fields[3] = new Field("total_memory","long");
		fields[4] = new Field("usage_memory","long");
		fields[5] = new Field("free_disk","long");
		fields[6] = new Field("total_disk","long");
		fields[7] = new Field("usage_disk","long");
	}

	public void dump() {
		System.out.println("id	:	 "+id);
		System.out.println("cpu_usage	:	 "+cpu_usage);
		System.out.println("free_memory	:	 "+free_memory);
		System.out.println("total_memory	:	 "+total_memory);
		System.out.println("usage_memory	:	 "+usage_memory);
		System.out.println("free_disk	:	 "+free_disk);
		System.out.println("total_disk	:	 "+total_disk);
		System.out.println("usage_disk	:	 "+usage_disk);
	}
	public String getDump() {
		String str="";
		str = str +",id:"+id;
		str = str +",cpu_usage:"+cpu_usage;
		str = str +",free_memory:"+free_memory;
		str = str +",total_memory:"+total_memory;
		str = str +",usage_memory:"+usage_memory;
		str = str +",free_disk:"+free_disk;
		str = str +",total_disk:"+total_disk;
		str = str +",usage_disk:"+usage_disk;
		return str;
	}

	public Map<String, Object> convertMessageToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(cpu_usage != null)
			map.put("cpu_usage", cpu_usage);
		if(free_memory != null)
			map.put("free_memory", free_memory);
		if(total_memory != null)
			map.put("total_memory", total_memory);
		if(usage_memory != null)
			map.put("usage_memory", usage_memory);
		if(free_disk != null)
			map.put("free_disk", free_disk);
		if(total_disk != null)
			map.put("total_disk", total_disk);
		if(usage_disk != null)
			map.put("usage_disk", usage_disk);
		return map;
	}

	public void convertMapToMessage(Map<String, Object> map) {
		id = (String) map.get("id");
		cpu_usage = (Double) map.get("cpu_usage");
		free_memory = (Long) map.get("free_memory");
		total_memory = (Long) map.get("total_memory");
		usage_memory = (Long) map.get("usage_memory");
		free_disk = (Long) map.get("free_disk");
		total_disk = (Long) map.get("total_disk");
		usage_disk = (Long) map.get("usage_disk");
	}

 	public int getMessageSize() {return 160;}

 	public String getName() {return "MOStatsAgent";}

public Message process(Session session,Message parentMessage) {return null;}

	public String getId() {
		return id;
	}

	public String getIdEx() {
		return id != null ? id : "";
	}

	public void setId(String id) {
		this.id = id;
	}

	public void unSetId() {
		this.id = null;
	}

	public Double getCpu_usage() {
		return cpu_usage;
	}

	public double getCpu_usageEx() {
		return cpu_usage != null ? cpu_usage : 0;
	}

	public void setCpu_usage(double cpu_usage) {
		this.cpu_usage = cpu_usage;
	}

	public void setCpu_usage(Double cpu_usage) {
		this.cpu_usage = cpu_usage;
	}

	public void unSetCpu_usage() {
		this.cpu_usage = null;
	}

	public Long getFree_memory() {
		return free_memory;
	}

	public long getFree_memoryEx() {
		return free_memory != null ? free_memory : 0L;
	}

	public void setFree_memory(long free_memory) {
		this.free_memory = free_memory;
	}

	public void setFree_memory(Long free_memory) {
		this.free_memory = free_memory;
	}

	public void unSetFree_memory() {
		this.free_memory = null;
	}

	public Long getTotal_memory() {
		return total_memory;
	}

	public long getTotal_memoryEx() {
		return total_memory != null ? total_memory : 0L;
	}

	public void setTotal_memory(long total_memory) {
		this.total_memory = total_memory;
	}

	public void setTotal_memory(Long total_memory) {
		this.total_memory = total_memory;
	}

	public void unSetTotal_memory() {
		this.total_memory = null;
	}

	public Long getUsage_memory() {
		return usage_memory;
	}

	public long getUsage_memoryEx() {
		return usage_memory != null ? usage_memory : 0L;
	}

	public void setUsage_memory(long usage_memory) {
		this.usage_memory = usage_memory;
	}

	public void setUsage_memory(Long usage_memory) {
		this.usage_memory = usage_memory;
	}

	public void unSetUsage_memory() {
		this.usage_memory = null;
	}

	public Long getFree_disk() {
		return free_disk;
	}

	public long getFree_diskEx() {
		return free_disk != null ? free_disk : 0L;
	}

	public void setFree_disk(long free_disk) {
		this.free_disk = free_disk;
	}

	public void setFree_disk(Long free_disk) {
		this.free_disk = free_disk;
	}

	public void unSetFree_disk() {
		this.free_disk = null;
	}

	public Long getTotal_disk() {
		return total_disk;
	}

	public long getTotal_diskEx() {
		return total_disk != null ? total_disk : 0L;
	}

	public void setTotal_disk(long total_disk) {
		this.total_disk = total_disk;
	}

	public void setTotal_disk(Long total_disk) {
		this.total_disk = total_disk;
	}

	public void unSetTotal_disk() {
		this.total_disk = null;
	}

	public Long getUsage_disk() {
		return usage_disk;
	}

	public long getUsage_diskEx() {
		return usage_disk != null ? usage_disk : 0L;
	}

	public void setUsage_disk(long usage_disk) {
		this.usage_disk = usage_disk;
	}

	public void setUsage_disk(Long usage_disk) {
		this.usage_disk = usage_disk;
	}

	public void unSetUsage_disk() {
		this.usage_disk = null;
	}
}