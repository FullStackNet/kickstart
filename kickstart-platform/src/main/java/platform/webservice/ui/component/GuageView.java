package platform.webservice.ui.component;

import platform.webservice.ui.UIServletContext;


public class GuageView extends BaseGauageView {
	
	public GuageView(UIServletContext ctx) {
		super(ctx);
		// TODO Auto-generated constructor stub
	}
	
	public void buildUI(String id,String title, int value) {
		getDefinition().setId(id);
		getDefinition().setTitle(title);
		super.buildUI(value);
	}
	
	public void buildUI(String id,String title, int value,int max) {
		getDefinition().setId(id);
		getDefinition().setTitle(title);
		getDefinition().setMax(max);
		super.buildUI(value);
	}
}
