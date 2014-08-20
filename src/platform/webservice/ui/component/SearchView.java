package platform.webservice.ui.component;

import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.BUTTON;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.FORM;
import platform.webservice.ui.html.TEXTEDIT;


public class SearchView {
	String submitUrl;
	UIServletContext context;
	public SearchView(UIServletContext ctx) {
		context = ctx;
	}
	public String getSubmitUrl() {
		return submitUrl;
	}
	public void setSubmitUrl(String submitUrl) {
		this.submitUrl = submitUrl;
	}

	public BaseHTMLComponent getView() {
		FORM form = new FORM();
		form.setAction(submitUrl);
		form.setMethod("GET");
		TEXTEDIT edit = new TEXTEDIT("q",null);
		edit.addAttribute("style","display: initial;");
		form.addChild(edit);
		BUTTON button = new BUTTON("search",null,true);
		button.setValue("Search");
		button.addAttribute("style", "display:initial;width:100px;");
		form.addChild(button);
		return form;
	}
}
