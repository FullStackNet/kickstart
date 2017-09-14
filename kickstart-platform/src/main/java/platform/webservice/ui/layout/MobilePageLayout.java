package platform.webservice.ui.layout;

import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.util.Attribute;

public class MobilePageLayout extends BaseLayout {
	Div mLayoutContainer;
	Div mLayoutHeader;
	Div mLayoutFooter;
	Div mLayoutContent;
	
	public MobilePageLayout() {
		mLayoutContainer =  new Div();
		mLayoutContainer.addAttribute(new Attribute("data-role", "page"));
		
		mLayoutHeader = new Div();
		mLayoutHeader.addAttribute(new Attribute("data-role", "header"));
		mLayoutContainer.addChild(mLayoutHeader);
		
		mLayoutContent = new Div();
		mLayoutContent.addAttribute(new Attribute("data-role", "ui-content"));
		mLayoutContainer.addChild(mLayoutContent);
		
		mLayoutFooter = new Div();
		mLayoutFooter.addAttribute(new Attribute("data-role", "footer"));
		mLayoutContainer.addChild(mLayoutFooter);
	}
	
	public BaseHTMLComponent getLayout() {
		return mLayoutContainer;
	}
	
	public Div getHeader() {
		return mLayoutHeader;
	}
	
	public Div getFooter() {
		return mLayoutFooter;
	}
	
	public Div getContent() {
		return mLayoutContent;
	}
}
