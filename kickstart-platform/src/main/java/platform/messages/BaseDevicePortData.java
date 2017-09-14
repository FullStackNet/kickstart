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

public abstract class BaseDevicePortData extends Message {
	private static final long serialVersionUID = 1L;
	private String deviceId = null;
	private Byte port1000 = null;
	private Byte port1001 = null;
	private Byte port1002 = null;
	private Byte port1003 = null;
	private Byte port1004 = null;
	private Byte port1005 = null;
	private Byte port1006 = null;
	private Byte port1007 = null;
	private Byte port2000 = null;
	private Byte port2001 = null;
	private Byte port2002 = null;
	private Byte port2003 = null;
	private Byte port2004 = null;
	private Byte port2005 = null;
	private Byte port2006 = null;
	private Byte port2007 = null;
	private Short port3000 = null;
	private Short port3001 = null;
	private Short port3002 = null;
	private Short port3003 = null;
	private Short port3004 = null;
	private Short port3005 = null;
	private Short port3006 = null;
	private Short port3007 = null;


	public BaseDevicePortData() {
		super();
		setCategory((byte)20);
		setCommand((byte)6);
		setPacketType((byte)1);
	}

	public void populate_field() {
 		if (fields != null) return ;
		fields = new Field[25];
		fields[0] =  new Field("deviceId","String",128);
		fields[1] = new Field("port1000","byte");
		fields[2] = new Field("port1001","byte");
		fields[3] = new Field("port1002","byte");
		fields[4] = new Field("port1003","byte");
		fields[5] = new Field("port1004","byte");
		fields[6] = new Field("port1005","byte");
		fields[7] = new Field("port1006","byte");
		fields[8] = new Field("port1007","byte");
		fields[9] = new Field("port2000","byte");
		fields[10] = new Field("port2001","byte");
		fields[11] = new Field("port2002","byte");
		fields[12] = new Field("port2003","byte");
		fields[13] = new Field("port2004","byte");
		fields[14] = new Field("port2005","byte");
		fields[15] = new Field("port2006","byte");
		fields[16] = new Field("port2007","byte");
		fields[17] = new Field("port3000","short");
		fields[18] = new Field("port3001","short");
		fields[19] = new Field("port3002","short");
		fields[20] = new Field("port3003","short");
		fields[21] = new Field("port3004","short");
		fields[22] = new Field("port3005","short");
		fields[23] = new Field("port3006","short");
		fields[24] = new Field("port3007","short");
	}

	public void dump() {
		System.out.println("deviceId	:	 "+deviceId);
		System.out.println("port1000	:	 "+ (port1000 == null ? 0 : port1000&0xFF));
		System.out.println("port1001	:	 "+ (port1001 == null ? 0 : port1001&0xFF));
		System.out.println("port1002	:	 "+ (port1002 == null ? 0 : port1002&0xFF));
		System.out.println("port1003	:	 "+ (port1003 == null ? 0 : port1003&0xFF));
		System.out.println("port1004	:	 "+ (port1004 == null ? 0 : port1004&0xFF));
		System.out.println("port1005	:	 "+ (port1005 == null ? 0 : port1005&0xFF));
		System.out.println("port1006	:	 "+ (port1006 == null ? 0 : port1006&0xFF));
		System.out.println("port1007	:	 "+ (port1007 == null ? 0 : port1007&0xFF));
		System.out.println("port2000	:	 "+ (port2000 == null ? 0 : port2000&0xFF));
		System.out.println("port2001	:	 "+ (port2001 == null ? 0 : port2001&0xFF));
		System.out.println("port2002	:	 "+ (port2002 == null ? 0 : port2002&0xFF));
		System.out.println("port2003	:	 "+ (port2003 == null ? 0 : port2003&0xFF));
		System.out.println("port2004	:	 "+ (port2004 == null ? 0 : port2004&0xFF));
		System.out.println("port2005	:	 "+ (port2005 == null ? 0 : port2005&0xFF));
		System.out.println("port2006	:	 "+ (port2006 == null ? 0 : port2006&0xFF));
		System.out.println("port2007	:	 "+ (port2007 == null ? 0 : port2007&0xFF));
		System.out.println("port3000	:	 "+port3000);
		System.out.println("port3001	:	 "+port3001);
		System.out.println("port3002	:	 "+port3002);
		System.out.println("port3003	:	 "+port3003);
		System.out.println("port3004	:	 "+port3004);
		System.out.println("port3005	:	 "+port3005);
		System.out.println("port3006	:	 "+port3006);
		System.out.println("port3007	:	 "+port3007);
	}
	public String getDump() {
		String str="";
		str = str +",deviceId:"+deviceId;
		str = str +", port1000:"+ (port1000 == null ? 0 : port1000&0xFF);
		str = str +", port1001:"+ (port1001 == null ? 0 : port1001&0xFF);
		str = str +", port1002:"+ (port1002 == null ? 0 : port1002&0xFF);
		str = str +", port1003:"+ (port1003 == null ? 0 : port1003&0xFF);
		str = str +", port1004:"+ (port1004 == null ? 0 : port1004&0xFF);
		str = str +", port1005:"+ (port1005 == null ? 0 : port1005&0xFF);
		str = str +", port1006:"+ (port1006 == null ? 0 : port1006&0xFF);
		str = str +", port1007:"+ (port1007 == null ? 0 : port1007&0xFF);
		str = str +", port2000:"+ (port2000 == null ? 0 : port2000&0xFF);
		str = str +", port2001:"+ (port2001 == null ? 0 : port2001&0xFF);
		str = str +", port2002:"+ (port2002 == null ? 0 : port2002&0xFF);
		str = str +", port2003:"+ (port2003 == null ? 0 : port2003&0xFF);
		str = str +", port2004:"+ (port2004 == null ? 0 : port2004&0xFF);
		str = str +", port2005:"+ (port2005 == null ? 0 : port2005&0xFF);
		str = str +", port2006:"+ (port2006 == null ? 0 : port2006&0xFF);
		str = str +", port2007:"+ (port2007 == null ? 0 : port2007&0xFF);
		str = str +",port3000:"+port3000;
		str = str +",port3001:"+port3001;
		str = str +",port3002:"+port3002;
		str = str +",port3003:"+port3003;
		str = str +",port3004:"+port3004;
		str = str +",port3005:"+port3005;
		str = str +",port3006:"+port3006;
		str = str +",port3007:"+port3007;
		return str;
	}

	public Map<String, Object> convertMessageToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(deviceId != null)
			map.put("deviceId", deviceId);
		if(port1000 != null)
			map.put("port1000", port1000);
		if(port1001 != null)
			map.put("port1001", port1001);
		if(port1002 != null)
			map.put("port1002", port1002);
		if(port1003 != null)
			map.put("port1003", port1003);
		if(port1004 != null)
			map.put("port1004", port1004);
		if(port1005 != null)
			map.put("port1005", port1005);
		if(port1006 != null)
			map.put("port1006", port1006);
		if(port1007 != null)
			map.put("port1007", port1007);
		if(port2000 != null)
			map.put("port2000", port2000);
		if(port2001 != null)
			map.put("port2001", port2001);
		if(port2002 != null)
			map.put("port2002", port2002);
		if(port2003 != null)
			map.put("port2003", port2003);
		if(port2004 != null)
			map.put("port2004", port2004);
		if(port2005 != null)
			map.put("port2005", port2005);
		if(port2006 != null)
			map.put("port2006", port2006);
		if(port2007 != null)
			map.put("port2007", port2007);
		if(port3000 != null)
			map.put("port3000", port3000);
		if(port3001 != null)
			map.put("port3001", port3001);
		if(port3002 != null)
			map.put("port3002", port3002);
		if(port3003 != null)
			map.put("port3003", port3003);
		if(port3004 != null)
			map.put("port3004", port3004);
		if(port3005 != null)
			map.put("port3005", port3005);
		if(port3006 != null)
			map.put("port3006", port3006);
		if(port3007 != null)
			map.put("port3007", port3007);
		return map;
	}

	public void convertMapToMessage(Map<String, Object> map) {
		deviceId = (String) map.get("deviceId");
		port1000 = (Byte) map.get("port1000");
		port1001 = (Byte) map.get("port1001");
		port1002 = (Byte) map.get("port1002");
		port1003 = (Byte) map.get("port1003");
		port1004 = (Byte) map.get("port1004");
		port1005 = (Byte) map.get("port1005");
		port1006 = (Byte) map.get("port1006");
		port1007 = (Byte) map.get("port1007");
		port2000 = (Byte) map.get("port2000");
		port2001 = (Byte) map.get("port2001");
		port2002 = (Byte) map.get("port2002");
		port2003 = (Byte) map.get("port2003");
		port2004 = (Byte) map.get("port2004");
		port2005 = (Byte) map.get("port2005");
		port2006 = (Byte) map.get("port2006");
		port2007 = (Byte) map.get("port2007");
		port3000 = (Short) map.get("port3000");
		port3001 = (Short) map.get("port3001");
		port3002 = (Short) map.get("port3002");
		port3003 = (Short) map.get("port3003");
		port3004 = (Short) map.get("port3004");
		port3005 = (Short) map.get("port3005");
		port3006 = (Short) map.get("port3006");
		port3007 = (Short) map.get("port3007");
	}

 	public int getMessageSize() {return 160;}

 	public String getName() {return "DevicePortData";}

public Message process(Session session,Message parentMessage) {return null;}

	public String getDeviceId() {
		return deviceId;
	}

	public String getDeviceIdEx() {
		return deviceId != null ? deviceId : "";
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public void unSetDeviceId() {
		this.deviceId = null;
	}

	public Byte getPort1000() {
		return port1000;
	}

	public byte getPort1000Ex() {
		return port1000 != null ? port1000 : (byte) 0;
	}

	public void setPort1000(byte port1000) {
		this.port1000 = port1000;
	}

	public void setPort1000(Byte port1000) {
		this.port1000 = port1000;
	}

	public void unSetPort1000() {
		this.port1000 = null;
	}

	public Byte getPort1001() {
		return port1001;
	}

	public byte getPort1001Ex() {
		return port1001 != null ? port1001 : (byte) 0;
	}

	public void setPort1001(byte port1001) {
		this.port1001 = port1001;
	}

	public void setPort1001(Byte port1001) {
		this.port1001 = port1001;
	}

	public void unSetPort1001() {
		this.port1001 = null;
	}

	public Byte getPort1002() {
		return port1002;
	}

	public byte getPort1002Ex() {
		return port1002 != null ? port1002 : (byte) 0;
	}

	public void setPort1002(byte port1002) {
		this.port1002 = port1002;
	}

	public void setPort1002(Byte port1002) {
		this.port1002 = port1002;
	}

	public void unSetPort1002() {
		this.port1002 = null;
	}

	public Byte getPort1003() {
		return port1003;
	}

	public byte getPort1003Ex() {
		return port1003 != null ? port1003 : (byte) 0;
	}

	public void setPort1003(byte port1003) {
		this.port1003 = port1003;
	}

	public void setPort1003(Byte port1003) {
		this.port1003 = port1003;
	}

	public void unSetPort1003() {
		this.port1003 = null;
	}

	public Byte getPort1004() {
		return port1004;
	}

	public byte getPort1004Ex() {
		return port1004 != null ? port1004 : (byte) 0;
	}

	public void setPort1004(byte port1004) {
		this.port1004 = port1004;
	}

	public void setPort1004(Byte port1004) {
		this.port1004 = port1004;
	}

	public void unSetPort1004() {
		this.port1004 = null;
	}

	public Byte getPort1005() {
		return port1005;
	}

	public byte getPort1005Ex() {
		return port1005 != null ? port1005 : (byte) 0;
	}

	public void setPort1005(byte port1005) {
		this.port1005 = port1005;
	}

	public void setPort1005(Byte port1005) {
		this.port1005 = port1005;
	}

	public void unSetPort1005() {
		this.port1005 = null;
	}

	public Byte getPort1006() {
		return port1006;
	}

	public byte getPort1006Ex() {
		return port1006 != null ? port1006 : (byte) 0;
	}

	public void setPort1006(byte port1006) {
		this.port1006 = port1006;
	}

	public void setPort1006(Byte port1006) {
		this.port1006 = port1006;
	}

	public void unSetPort1006() {
		this.port1006 = null;
	}

	public Byte getPort1007() {
		return port1007;
	}

	public byte getPort1007Ex() {
		return port1007 != null ? port1007 : (byte) 0;
	}

	public void setPort1007(byte port1007) {
		this.port1007 = port1007;
	}

	public void setPort1007(Byte port1007) {
		this.port1007 = port1007;
	}

	public void unSetPort1007() {
		this.port1007 = null;
	}

	public Byte getPort2000() {
		return port2000;
	}

	public byte getPort2000Ex() {
		return port2000 != null ? port2000 : (byte) 0;
	}

	public void setPort2000(byte port2000) {
		this.port2000 = port2000;
	}

	public void setPort2000(Byte port2000) {
		this.port2000 = port2000;
	}

	public void unSetPort2000() {
		this.port2000 = null;
	}

	public Byte getPort2001() {
		return port2001;
	}

	public byte getPort2001Ex() {
		return port2001 != null ? port2001 : (byte) 0;
	}

	public void setPort2001(byte port2001) {
		this.port2001 = port2001;
	}

	public void setPort2001(Byte port2001) {
		this.port2001 = port2001;
	}

	public void unSetPort2001() {
		this.port2001 = null;
	}

	public Byte getPort2002() {
		return port2002;
	}

	public byte getPort2002Ex() {
		return port2002 != null ? port2002 : (byte) 0;
	}

	public void setPort2002(byte port2002) {
		this.port2002 = port2002;
	}

	public void setPort2002(Byte port2002) {
		this.port2002 = port2002;
	}

	public void unSetPort2002() {
		this.port2002 = null;
	}

	public Byte getPort2003() {
		return port2003;
	}

	public byte getPort2003Ex() {
		return port2003 != null ? port2003 : (byte) 0;
	}

	public void setPort2003(byte port2003) {
		this.port2003 = port2003;
	}

	public void setPort2003(Byte port2003) {
		this.port2003 = port2003;
	}

	public void unSetPort2003() {
		this.port2003 = null;
	}

	public Byte getPort2004() {
		return port2004;
	}

	public byte getPort2004Ex() {
		return port2004 != null ? port2004 : (byte) 0;
	}

	public void setPort2004(byte port2004) {
		this.port2004 = port2004;
	}

	public void setPort2004(Byte port2004) {
		this.port2004 = port2004;
	}

	public void unSetPort2004() {
		this.port2004 = null;
	}

	public Byte getPort2005() {
		return port2005;
	}

	public byte getPort2005Ex() {
		return port2005 != null ? port2005 : (byte) 0;
	}

	public void setPort2005(byte port2005) {
		this.port2005 = port2005;
	}

	public void setPort2005(Byte port2005) {
		this.port2005 = port2005;
	}

	public void unSetPort2005() {
		this.port2005 = null;
	}

	public Byte getPort2006() {
		return port2006;
	}

	public byte getPort2006Ex() {
		return port2006 != null ? port2006 : (byte) 0;
	}

	public void setPort2006(byte port2006) {
		this.port2006 = port2006;
	}

	public void setPort2006(Byte port2006) {
		this.port2006 = port2006;
	}

	public void unSetPort2006() {
		this.port2006 = null;
	}

	public Byte getPort2007() {
		return port2007;
	}

	public byte getPort2007Ex() {
		return port2007 != null ? port2007 : (byte) 0;
	}

	public void setPort2007(byte port2007) {
		this.port2007 = port2007;
	}

	public void setPort2007(Byte port2007) {
		this.port2007 = port2007;
	}

	public void unSetPort2007() {
		this.port2007 = null;
	}

	public Short getPort3000() {
		return port3000;
	}

	public short getPort3000Ex() {
		return port3000 != null ? port3000 : (short) 0;
	}

	public void setPort3000(short port3000) {
		this.port3000 = port3000;
	}

	public void setPort3000(Short port3000) {
		this.port3000 = port3000;
	}

	public void unSetPort3000() {
		this.port3000 = null;
	}

	public Short getPort3001() {
		return port3001;
	}

	public short getPort3001Ex() {
		return port3001 != null ? port3001 : (short) 0;
	}

	public void setPort3001(short port3001) {
		this.port3001 = port3001;
	}

	public void setPort3001(Short port3001) {
		this.port3001 = port3001;
	}

	public void unSetPort3001() {
		this.port3001 = null;
	}

	public Short getPort3002() {
		return port3002;
	}

	public short getPort3002Ex() {
		return port3002 != null ? port3002 : (short) 0;
	}

	public void setPort3002(short port3002) {
		this.port3002 = port3002;
	}

	public void setPort3002(Short port3002) {
		this.port3002 = port3002;
	}

	public void unSetPort3002() {
		this.port3002 = null;
	}

	public Short getPort3003() {
		return port3003;
	}

	public short getPort3003Ex() {
		return port3003 != null ? port3003 : (short) 0;
	}

	public void setPort3003(short port3003) {
		this.port3003 = port3003;
	}

	public void setPort3003(Short port3003) {
		this.port3003 = port3003;
	}

	public void unSetPort3003() {
		this.port3003 = null;
	}

	public Short getPort3004() {
		return port3004;
	}

	public short getPort3004Ex() {
		return port3004 != null ? port3004 : (short) 0;
	}

	public void setPort3004(short port3004) {
		this.port3004 = port3004;
	}

	public void setPort3004(Short port3004) {
		this.port3004 = port3004;
	}

	public void unSetPort3004() {
		this.port3004 = null;
	}

	public Short getPort3005() {
		return port3005;
	}

	public short getPort3005Ex() {
		return port3005 != null ? port3005 : (short) 0;
	}

	public void setPort3005(short port3005) {
		this.port3005 = port3005;
	}

	public void setPort3005(Short port3005) {
		this.port3005 = port3005;
	}

	public void unSetPort3005() {
		this.port3005 = null;
	}

	public Short getPort3006() {
		return port3006;
	}

	public short getPort3006Ex() {
		return port3006 != null ? port3006 : (short) 0;
	}

	public void setPort3006(short port3006) {
		this.port3006 = port3006;
	}

	public void setPort3006(Short port3006) {
		this.port3006 = port3006;
	}

	public void unSetPort3006() {
		this.port3006 = null;
	}

	public Short getPort3007() {
		return port3007;
	}

	public short getPort3007Ex() {
		return port3007 != null ? port3007 : (short) 0;
	}

	public void setPort3007(short port3007) {
		this.port3007 = port3007;
	}

	public void setPort3007(Short port3007) {
		this.port3007 = port3007;
	}

	public void unSetPort3007() {
		this.port3007 = null;
	}
}