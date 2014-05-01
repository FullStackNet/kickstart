package platform.resource;

import platform.defined.resource.Baseconversation_summary;
import platform.util.Util;

public class conversation_summary extends Baseconversation_summary {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public conversation_summary() {
		this.setId(Util.getUniqueId());
	}
	
	public conversation_summary(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
