package platform.resource;

import platform.defined.resource.Baseresult;

public class result extends Baseresult {
	
	public BaseResource[] resource;
	
	public result() {
		super();
		this.setErrCode(-1);
		this.setMessage("Error");
		this.resource = null;
	}
	
	public result(String id, String message) {
		this.setErrCode(-1);
		this.setMessage("Error");
	}
	
	public BaseResource[] getResource() {
		return resource;
	}

	public void setResource(BaseResource[] resource) {
		this.resource = resource;
	}
	public void setResource(BaseResource resource) {
		this.resource  = new BaseResource[1];
		this.resource[0] = resource;
	}

	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
