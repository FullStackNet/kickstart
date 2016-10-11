package platform.webservice.ui.layout;

import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.A;
import platform.webservice.ui.html.BR;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.html.IMG;
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
		mLayoutContainer.addAttribute(new Attribute("id", "container"));
		
		mLayoutHeader = new Div();
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
		Div div  = new Div();
		div.addAttribute("style", "float:left;height:100%;");
		A a = new A();
		a.addAttribute("style","top:400px");
		IMG img = new IMG();
		img.addAttribute("id", "open-menu-image-id");
		img.setSRC("/ui/images/close-menu.png");
		img.addAttribute("width","20px");
		img.addAttribute("height","20px");
		a.addChild(img);
		a.setHref("#");
		a.addAttribute("onClick","closeMenu()");
		div.addChild(a);
		content_container_2.addChild(div);
		content_container_2.addChild(mLayoutContent);
		mLayoutContent.addChild(new BR());
		mLayoutContent.addChild(new BR());
		mLayoutContent.addChild(new BR());
		
		//mLayoutFooter = new Div();
		//mLayoutFooter.addAttribute(new Attribute("id", "footer"));
		//content_container_2.addChild(mLayoutFooter);

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
