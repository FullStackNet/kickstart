package platform.resource;

import platform.defined.resource.Basegateway;
import platform.util.Util;

public class gateway extends Basegateway {
	
	/**
	 * 
	 */
	public static String GATEWAY_TYPE_C4T = "C4T";
	public static String GATEWAY_TYPE_MEDICAL_DISTRIBUTER = "MEDICAL-DISTRIBUTER";
	public static String GATEWAY_TYPE_RESTAURENT = "RESTAURENT";

	
	public static String[] getGatewayType() {
		return new String[]{GATEWAY_TYPE_C4T,GATEWAY_TYPE_MEDICAL_DISTRIBUTER,GATEWAY_TYPE_RESTAURENT};
	}
	private static final long serialVersionUID = 1L;
	
	public gateway() {
		this.setId(Util.getUniqueId());
	}
	
	public gateway(String id) {
		this.setId(id);
	}	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
