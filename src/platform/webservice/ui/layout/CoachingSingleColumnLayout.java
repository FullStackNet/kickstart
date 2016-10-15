package platform.webservice.ui.layout;

import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.Div;

public class CoachingSingleColumnLayout extends BaseLayout {
	Div mLayoutContainer;
	Div mLayoutHeader;
	Div mLayoutFooter;
	Div mLayoutContent;
	Div mLayoutMainContent;
	Div mLayoutMenuContent;
	
	public CoachingSingleColumnLayout(UIServletContext ctx) {
		mLayoutContainer =  new Div();
		mLayoutHeader = new Div() ;
		mLayoutContainer.addChild(mLayoutHeader);		
		mLayoutMainContent = new Div(null,"main_container");		
		mLayoutContainer.addChild(mLayoutMainContent);	
		mLayoutMenuContent = new Div(null,"container-fluid bg-white text-center no-padding");
		mLayoutMainContent.addChild(mLayoutMenuContent);	
		Div div = new Div(null,"container no-padding  margin-top-10");
		mLayoutMainContent.addChild(div);
		mLayoutContent = new Div(null,"container padding-t-b-20");
		div.addChild(mLayoutContent);
	}
	
	public BaseHTMLComponent getLayout() {
		return mLayoutContainer;
	}
	
	public Div getMenu() {
		return mLayoutMenuContent;
	}
	
	
	public Div getHeader() {
		return mLayoutHeader;
	}
	
	public Div getFooter() {
		return mLayoutFooter;
	}
	
	public Div getMainContent() {
		return mLayoutMainContent;
	}
	
	public Div getContent() {
		return mLayoutContent;
	}

}
