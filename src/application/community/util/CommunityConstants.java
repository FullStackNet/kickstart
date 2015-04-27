package application.community.util;

import platform.webservice.ui.definition.IdValue;

public class CommunityConstants {
	public static IdValue[] getCommunityType() {
		IdValue[] idvalues = {
					new IdValue("APARTMENT", "Apartment"),	
					new IdValue("BUISINESS", "Buisiness"),
					new IdValue("FAMILY", "Family"),	
					new IdValue("SPIRITUAL", "Spiritual")
		};
		return idvalues;

	}
}
