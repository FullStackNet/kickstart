package platform.webservice.ui.layout;

import platform.helper.C4t_objectHelper;
import platform.resource.c4t_object;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.CSS;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.html.UL;
import platform.webservice.ui.util.Attribute;

public class ThreeColumnLayout extends BaseLayout {
	Div mLayoutContainer;
	Div mLayoutHeader;
	Div mLayoutLeft;
	Div mLayoutRight;
	UL mLayoutMenu;
	Div mLayoutFooter;
	Div mLayoutContent;
	
	public ThreeColumnLayout(UIServletContext ctx) {
		ctx.getPageBuilder().addCSS(new CSS("3c_layout.css","/ui/css"));
		mLayoutContainer =  new Div();
		mLayoutContainer.addAttribute(new Attribute("id", "container"));
		mLayoutHeader = new Div();
		
		c4t_object _community = C4t_objectHelper.getInstance().getById(ctx.getContextId());
		if (_community == null) {
			mLayoutHeader.addAttribute(new Attribute("id", "header"));
			mLayoutContainer.addChild(mLayoutHeader);
			Div div = new Div();
			div.addAttribute(new Attribute("id", "navigation"));
			mLayoutContainer.addChild(div);
			mLayoutMenu = new UL();
			div.addChild(mLayoutMenu);
		}
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
		
		mLayoutRight = new Div();
		mLayoutRight.addAttribute(new Attribute("id", "right-column"));
		content_container_2.addChild(mLayoutRight);
		
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
	
	public Div getRightColumn() {
		return mLayoutRight;
	}
}
