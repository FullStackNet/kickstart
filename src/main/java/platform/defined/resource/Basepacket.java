/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.defined.resource;

import platform.db.ResourceMetaData;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Field;

import java.util.HashMap;
import java.util.Map;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Basepacket extends BaseResource {
	private String id = null;
	private String controller_id = null;
	private String packet_type = null; //SEND/RECIVED
	private String message_type = null;
	private Long message_time = null;
	private String data = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_CONTROLLER_ID = "controller_id";
	public static String FIELD_PACKET_TYPE = "packet_type";
	public static String FIELD_MESSAGE_TYPE = "message_type";
	public static String FIELD_MESSAGE_TIME = "message_time";
	public static String FIELD_DATA = "data";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("packet");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field controller_idField = new Field("controller_id", "String");
		controller_idField.setLength(128);
		metaData.addField(controller_idField);

		Field packet_typeField = new Field("packet_type", "String");
		packet_typeField.setLength(16);
		metaData.addField(packet_typeField);

		Field message_typeField = new Field("message_type", "String");
		message_typeField.setLength(32);
		metaData.addField(message_typeField);

		Field message_timeField = new Field("message_time", "long");
		metaData.addField(message_timeField);

		Field dataField = new Field("data", "String");
		dataField.setLength(4000);
		metaData.addField(dataField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("packet");

		metaData.setCluster("DB_PACKET");
	}

	public Basepacket() {}

	public Basepacket(Basepacket obj) {
		this.id = obj.id;
		this.controller_id = obj.controller_id;
		this.packet_type = obj.packet_type;
		this.message_type = obj.message_type;
		this.message_time = obj.message_time;
		this.data = obj.data;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(controller_id != null)
			map.put("controller_id", controller_id);
		if(packet_type != null)
			map.put("packet_type", packet_type);
		if(message_type != null)
			map.put("message_type", message_type);
		if(message_time != null)
			map.put("message_time", message_time);
		if(data != null)
			map.put("data", data);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(controller_id != null)
			map.put("controller_id", controller_id);
		if(packet_type != null)
			map.put("packet_type", packet_type);
		if(message_type != null)
			map.put("message_type", message_type);
		if(message_time != null)
			map.put("message_time", message_time);
		if(data != null)
			map.put("data", data);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> convertResourceToPrimaryMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		return map;
	}

	@SuppressWarnings("unchecked")
	public void convertMapToResource(Map<String, Object> map) {
		id = (String) map.get("id");
		controller_id = (String) map.get("controller_id");
		packet_type = (String) map.get("packet_type");
		message_type = (String) map.get("message_type");
		message_time = (Long) map.get("message_time");
		data = (String) map.get("data");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object controller_idObj = map.get("controller_id");
		if(controller_idObj != null)
			controller_id = controller_idObj.toString();

		Object packet_typeObj = map.get("packet_type");
		if(packet_typeObj != null)
			packet_type = packet_typeObj.toString();

		Object message_typeObj = map.get("message_type");
		if(message_typeObj != null)
			message_type = message_typeObj.toString();

		Object message_timeObj = map.get("message_time");
		if(message_timeObj != null)
			message_time = new Long(message_timeObj.toString());

		Object dataObj = map.get("data");
		if(dataObj != null)
			data = dataObj.toString();

		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	public void convertPrimaryMapToResource(Map<String, Object> map) {
	}

	public void convertTypeUnsafePrimaryMapToResource(Map<String, Object> map) {
	}

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

	public boolean validateId(boolean add) throws ApplicationException {
		if(add && id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[id]");
		return id != null;
	}

	public String getController_id() {
		return controller_id;
	}

	public String getController_idEx() {
		return controller_id != null ? controller_id : "";
	}

	public void setController_id(String controller_id) {
		this.controller_id = controller_id;
	}

	public void unSetController_id() {
		this.controller_id = null;
	}

	public String getPacket_type() {
		return packet_type;
	}

	public String getPacket_typeEx() {
		return packet_type != null ? packet_type : "";
	}

	public void setPacket_type(String packet_type) {
		this.packet_type = packet_type;
	}

	public void unSetPacket_type() {
		this.packet_type = null;
	}

	public String getMessage_type() {
		return message_type;
	}

	public String getMessage_typeEx() {
		return message_type != null ? message_type : "";
	}

	public void setMessage_type(String message_type) {
		this.message_type = message_type;
	}

	public void unSetMessage_type() {
		this.message_type = null;
	}

	public Long getMessage_time() {
		return message_time;
	}

	public long getMessage_timeEx() {
		return message_time != null ? message_time : 0L;
	}

	public void setMessage_time(long message_time) {
		this.message_time = message_time;
	}

	public void setMessage_time(Long message_time) {
		this.message_time = message_time;
	}

	public void unSetMessage_time() {
		this.message_time = null;
	}

	public String getData() {
		return data;
	}

	public String getDataEx() {
		return data != null ? data : "";
	}

	public void setData(String data) {
		this.data = data;
	}

	public void unSetData() {
		this.data = null;
	}

	public Map<String, Object> getExtra_data() {
		return extra_data;
	}

	public Object getExtra_data(String key) {
		return extra_data == null ? null : extra_data.get(key);
	}

	public void setExtra_data(Map<String, Object> extra_data) {
		this.extra_data = extra_data;
	}

	public void setExtra_data(String key, Object value) {
		if(extra_data == null)
			extra_data = new HashMap<String, Object>();
		extra_data.put(key, value);
	}

	public void unSetExtra_data() {
		this.extra_data = null;
	}
	public String getCluster() {
		return "DB_PACKET";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}