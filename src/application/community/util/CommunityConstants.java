package application.community.util;

import platform.webservice.ui.definition.IdValue;

public class CommunityConstants {
	public static IdValue[] getCommunityType() {
		IdValue[] idvalues = {
				new IdValue("APARTMENT", "Apartment"),	
				new IdValue("BUISINESS", "Buisiness"),
				new IdValue("COLLEGE", "College"),
				new IdValue("FAMILY", "Family"),
				new IdValue("PARENT", "Parent"),
				new IdValue("SCHOOL", "School"),
				new IdValue("SPIRITUAL", "Spiritual"),
				new IdValue("WORK", "Work"),
			};
		
		return idvalues;
	}

	public static IdValue[] getBusinessCommunity() {
		IdValue[] businessRolesValues = {
				new IdValue("DISTRIBUTER", "Distributer"),	
				new IdValue("SUB_DISTRIBUTER", "Sub Distributer"),
				new IdValue("DEALER", "Dealer"),	
				new IdValue("CUSTOMER", "Customer")
		};
		return businessRolesValues;
	}

}
