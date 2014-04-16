package platform.webservice.ui.layout;

import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.CSS;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.html.UL;
import platform.webservice.ui.util.Attribute;

public class TwoColumnLayout extends BaseLayout {
	Div mLayoutContainer;
	Div mLayoutHeader;
	Div mLayoutLeft;
	UL mLayoutMenu;
	Div mLayoutFooter;
	Div mLayoutContent;
	
	public TwoColumnLayout(UIServletContext ctx) {
		ctx.getPageBuilder().addCSS(new CSS("2c_layout.css","/ui/css"));
		mLayoutContainer =  new Div();
		mLayoutContainer.addAttribute(new Attribute("id", "container"));
		
		mLayoutHeader = new Div();
		mLayoutHeader.addAttribute(new Attribute("id", "header"));
		mLayoutContainer.addChild(mLayoutHeader);		
		
		Div content_container  = new Div();
		content_container.addAttribute(new Attribute("id", "content-container"));
		mLayoutContainer.addChild(content_container);
		
		Div content_container_2  = new Div();
		content_container_2.addAttribute(new Attribute("id", "content-container-2"));
		content_container.addChild(content_container_2);
		
		mLayoutLeft = new Div();
		mLayoutLeft.addAttribute(new Attribute("id", "left-column"));
		content_container_2.addChild(mLayoutLeft);
		
		
		mLayoutContent = new Div();
		mLayoutContent.addAttribute(new Attribute("id", "content"));
		content_container_2.addChild(mLayoutContent);
		
		mLayoutFooter = new Div();
		mLayoutFooter.addAttribute(new Attribute("id", "footer"));
		content_container_2.addChild(mLayoutFooter);

	}
	
	public BaseHTMLComponent getLayout() {
		return mLayoutContainer;
	}
	
	public UL getMenu() {
		return mLayoutMenu;
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
