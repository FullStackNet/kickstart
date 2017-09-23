package platform.appliances;

import java.util.Date;

public class ApplianceParameter {
	String m_Name;
	Object m_Value;
	Date m_LastUpdated;
	int m_UpdateType;
	int m_valueType;
	
	public ApplianceParameter(String name,int m_valueType) {
		this.m_Name =  name;
		this.m_valueType = m_valueType;
	}
	
}
