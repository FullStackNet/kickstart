/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.c4t.vehicle.defined.resource;

import platform.db.ResourceMetaData;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Field;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 ********** This is a generated class **********
 * 
 */
public abstract class Basecustomer_vehicle_map extends BaseResource {
	private String id = null;
	private List<Object> fleetManagers = null;
	private List<Object> fleetOwners = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_FLEETMANAGERS = "fleetManagers";
	public static String FIELD_FLEETOWNERS = "fleetOwners";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	private final static ResourceMetaData metaData = new ResourceMetaData("customer_vehicle_map");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);
		Field idField = new Field("id", "String");
		idField.setRequired(true);
		idField.setLength(128);
		metaData.addField(idField);

		Field fleetManagersField = new Field("fleetManagers", "Array");
		metaData.addField(fleetManagersField);

		Field fleetOwnersField = new Field("fleetOwners", "Array");
		metaData.addField(fleetOwnersField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("customer_vehicle_map");

		metaData.setCluster("DB_DEVICE");
	}

	public Basecustomer_vehicle_map() {}

	public Basecustomer_vehicle_map(Basecustomer_vehicle_map obj) {
		this.id = obj.id;
		this.fleetManagers = obj.fleetManagers;
		this.fleetOwners = obj.fleetOwners;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	public Map<String, Object> convertResourceToMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(id != null)
			map.put("id", id);
		if(fleetManagers != null)
			map.put("fleetManagers", fleetManagers);
		if(fleetOwners != null)
			map.put("fleetOwners", fleetOwners);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(boolean add) throws ApplicationException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(validateId(add))
			map.put("id", id);
		if(fleetManagers != null)
			map.put("fleetManagers", fleetManagers);
		if(fleetOwners != null)
			map.put("fleetOwners", fleetOwners);
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
		fleetManagers = (List<Object>) map.get("fleetManagers");
		fleetOwners = (List<Object>) map.get("fleetOwners");
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		fleetManagers = (List<Object>) map.get("fleetManagers");
		fleetOwners = (List<Object>) map.get("fleetOwners");
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

	public List<Object> getFleetManagers() {
		return fleetManagers;
	}


	public void setFleetManagers(List<Object> fleetManagers) {
		this.fleetManagers = fleetManagers;
	}

	public void addFleetManagers(Object value) {
		if(fleetManagers == null)
			fleetManagers = new ArrayList<Object>();
		fleetManagers.add(value);
	}

	public void unSetFleetManagers() {
		this.fleetManagers = null;
	}

	public List<Object> getFleetOwners() {
		return fleetOwners;
	}


	public void setFleetOwners(List<Object> fleetOwners) {
		this.fleetOwners = fleetOwners;
	}

	public void addFleetOwners(Object value) {
		if(fleetOwners == null)
			fleetOwners = new ArrayList<Object>();
		fleetOwners.add(value);
	}

	public void unSetFleetOwners() {
		this.fleetOwners = null;
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
		return "DB_DEVICE";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
}