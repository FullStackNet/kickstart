package platform.webservice.ui.html;

import platform.util.ApplicationException;
import platform.webservice.ui.component.BaseView;



public class TAB extends BaseView {
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	String id;
	String title;
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	BaseHTMLComponent content;
	public TAB(String id,String title,BaseHTMLComponent content) {
		this.id = id;
		this.content = content;
		this.title = title;
	}
	
	@Override
	public void buildUI() throws ApplicationException {
		getView().addAttribute("id",id);
		getView().addChild(content);
	}	
}
