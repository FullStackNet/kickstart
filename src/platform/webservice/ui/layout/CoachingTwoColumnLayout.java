package platform.webservice.ui.layout;

import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.util.Attribute;

public class CoachingTwoColumnLayout extends BaseLayout {
	Div mLayoutContainer;
	Div mLayoutHeader;
	Div mLayoutLeft;
	Div mLayoutRight;
	Div mLayoutFooter;
	Div mLayoutContent;
	
	public CoachingTwoColumnLayout(UIServletContext ctx) {
		mLayoutContainer =  new Div();
		mLayoutHeader = new Div() ;
		mLayoutContainer.addChild(mLayoutHeader);		
		mLayoutLeft = new Div();
		mLayoutLeft.addAttribute(new Attribute("id", "left-column"));
		mLayoutContent = new Div(null,"main_container");
		mLayoutContainer.addChild(mLayoutContent);
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
	
	public Div getLeftColumn() {
		return mLayoutLeft;
	}
}
