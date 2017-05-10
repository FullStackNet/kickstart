package platform.webservice.ui.layout;

import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.Div;

public class ApartmentThreeColumnLayout extends BaseLayout {
	Div mLayoutContainer;
	Div mLayoutHeader;
	Div mLayoutLeft;
	Div mLayoutRight;
	Div mLayoutFooter;
	Div mLayoutContent;
	Div mLayoutMainContent;
	Div mLayoutMenuContent;
	
	public ApartmentThreeColumnLayout(UIServletContext ctx) {
		mLayoutContainer =  new Div();
		mLayoutHeader = new Div() ;
		mLayoutContainer.addChild(mLayoutHeader);		
		mLayoutMainContent = new Div(null,"main_container");		
		mLayoutContainer.addChild(mLayoutMainContent);	
		mLayoutMenuContent = new Div(null,"container-fluid bg-white text-center no-padding");
		mLayoutMainContent.addChild(mLayoutMenuContent);	
		Div div = new Div(null,"container no-padding  margin-top-10");
		mLayoutMainContent.addChild(div);
		mLayoutLeft = new Div(null,"col-md-3 col-md-left");	
		mLayoutContent = new Div(null,"col-md-6 col-sm-12 col-md-center");
		mLayoutRight = new Div(null,"col-md-3 col-sm-4 col-md-right");
		
		div.addChild(mLayoutLeft);
		div.addChild(mLayoutContent);
		div.addChild(mLayoutRight);
		
		
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
	
	public Div getLeftColumn() {
		return mLayoutLeft;
	}
	
	public Div getRightColumn() {
		return mLayoutRight;
	}

	public Div getContent() {
		return mLayoutContent;
	}

}
