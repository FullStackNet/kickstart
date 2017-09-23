package platform.webservice.ui.component;

import platform.webservice.ui.UIServletContext;


public class ThermometerView extends BaseThermometerView {
	
	public ThermometerView(UIServletContext ctx) {
		super(ctx);
		// TODO Auto-generated constructor stub
	}
	
	public void buildUI(String id,String title, Number value,  String unit) {
		getDefinition().setId(id);
		super.buildUI(value);
	}
}
