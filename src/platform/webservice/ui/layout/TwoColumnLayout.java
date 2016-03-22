package platform.webservice.ui.layout;

import platform.helper.C4t_objectHelper;
import platform.resource.c4t_object;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.A;
import platform.webservice.ui.html.BR;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.CSS;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.html.IMG;
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
		c4t_object _community = C4t_objectHelper.getInstance().getById(ctx.getContextId());
		if (_community == null) {
			mLayoutHeader.addAttribute(new Attribute("id", "header"));
			mLayoutContainer.addChild(mLayoutHeader);		
		} else {
			mLayoutHeader = new Div();
			mLayoutHeader.addStyle("height", "40px");
			mLayoutHeader.addStyle("background-color", "#FFA500");
			mLayoutContainer.addChild(mLayoutHeader);		
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
