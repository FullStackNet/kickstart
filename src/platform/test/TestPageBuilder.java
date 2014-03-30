package platform.test;

import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.CSS;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.html.JS;
import platform.webservice.ui.layout.CenterSingleLayout;
import platform.webservice.ui.util.PageBuilder;

public class TestPageBuilder {
	public static void main(String[] args) throws Exception {
		UIServletContext ctx = new UIServletContext("1");
		PageBuilder builder = new PageBuilder(null);
		builder.addCSS(new CSS("eas.css", "/css"));
		builder.addJS(new JS("Login.js", "/js"));
		CenterSingleLayout layout = new CenterSingleLayout(ctx);
		Div testDiv = new Div("test","test");
		layout.getLayout().addChild(testDiv);
		builder.setLayout(layout);
		System.out.println(builder.getPageContent());
	}
}
