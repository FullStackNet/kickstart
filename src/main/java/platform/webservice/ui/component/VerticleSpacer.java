package platform.webservice.ui.component;

import platform.webservice.ui.util.Attribute;


public class VerticleSpacer extends BaseView {
	int height;
	public VerticleSpacer(int height) {
		super();
		this.height = height;
		buildUI();
	}

	@Override
	public void buildUI() {
		// TODO Auto-generated method stub
		getView().addAttribute(new Attribute("style","margin-top:"+height+"px"));
	}	
}
