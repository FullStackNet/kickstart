package platform.webservice.ui.view;

import platform.helper.C4t_objectHelper;
import platform.resource.c4t_object;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.component.BaseView;
import platform.webservice.ui.html.A;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.html.IMG;
import platform.webservice.ui.html.MenuItem;
import platform.webservice.ui.html.SPAN;
import platform.webservice.ui.html.UL;
import platform.webservice.ui.util.ImageUtils;

public class HeaderView extends BaseView {
	UIServletContext mContext;
	Div headerDiv;
	
	public HeaderView(UIServletContext context) {
		mContext = context;
		headerDiv = new Div();
	}
	
	public HeaderView(UIServletContext context, Div header) {
		mContext = context;
		headerDiv = header;
	}
	
	public void buildUI() {
		c4t_object _community = C4t_objectHelper.getInstance().getById(mContext.getContextId());
		if (_community == null) {
			if (mContext.getDomainName().contains("connect2parent.com")) {
				Div logoImageDiv = new Div(null, "logo");
				IMG logoImg = new IMG();
				if (mContext.getDomainName().contains("nirmanias")) {
					logoImg.addAttribute("width","230px");
					logoImg.addAttribute("height","130px");
					logoImg.setSRC("http://www.nirmanias.com/images/logo.png");
				} else {
					logoImg.setSRC(ImageUtils.C2P_HEADER_LOGO);
				}
		        logoImageDiv.addChild(logoImg);
		        headerDiv.addChild(logoImageDiv);
			} else if (mContext.getDomainName().equals("connect2community.in") || mContext.getDomainName().equals("www.connect2community.in")) {
				Div logoImageDiv = new Div(null, "logo");
				IMG logoImg = new IMG();
		        logoImg.setSRC(ImageUtils.C2C_HEADER_LOGO);
		        logoImageDiv.addChild(logoImg);
		        headerDiv.addChild(logoImageDiv);
			} else {
				Div logoImageDiv = new Div(null, "logo");
		        IMG logoImg = new IMG();
		        logoImg.setSRC(ImageUtils.HEADER_LOGO);
		        logoImageDiv.addChild(logoImg);
		        headerDiv.addChild(logoImageDiv);
			}
			Div headerMenuDiv = new Div(null, "menu");
		    
		    UL menuContainer = new UL();
	        MenuItem item = new MenuItem(" ", "/ui/myarea", ImageUtils.TAB_MONITOR);
	        menuContainer.addChild(item.getItem());
	        item = new MenuItem(" ", "/ui/activity", ImageUtils.TAB_ACTIVITY);
	        menuContainer.addChild(item.getItem());
	        item = new MenuItem(" ", "/ui/report", ImageUtils.TAB_REPORTS);
	        menuContainer.addChild(item.getItem());
	        item = new MenuItem(" ", "/ui/configuration", ImageUtils.TAB_CONFIG);
	        menuContainer.addChild(item.getItem());
	        item = new MenuItem(" ", "/ui/logout", ImageUtils.TAB_LOGOUT);
	        menuContainer.addChild(item.getItem());
	        headerMenuDiv.addChild(menuContainer);
	        headerDiv.addChild(headerMenuDiv);
		} else if (_community.getType().equals("MANDI_AGENT")){
			headerDiv.addAttribute("align", "right");
			Div titleDiv = new Div();
			SPAN s = new SPAN();
			s.addStyle("font-size", "18px");
			s.addStyle("font-weight", "bold");
			s.setText(_community.getName()+" - "+_community.getShort_name() );
			titleDiv.addChild(s);
			titleDiv.addStyle("float", "left");
			headerDiv.addChild(titleDiv);
			headerDiv.addStyle("padding-top", "10px");
			headerDiv.addStyle("padding-right", "10px");
			headerDiv.addStyle("padding-left", "20px");
			A a = new A();
			
			a = new A();
			
			a = new A();
			a.addAttribute("class","green_header_button");
			a.setText("Home");
			a.addStyle("margin-right", "10px");
			a.setHref("/ui/configure_community");
			headerDiv.addChild(a);
			
			a = new A();
			a.addAttribute("class","green_header_button");
			a.addStyle("margin-right", "10px");
			a.setText("Material Entry");
			a.setHref("/ui/entry?farmers=3&items=5&op=add");
			headerDiv.addChild(a);
			
			a = new A();
			a.addAttribute("class","green_header_button");
			a.addStyle("margin-right", "10px");
			a.setText("Bill Entry");
			a.setHref("/ui/auction?op=add");
			headerDiv.addChild(a);
		
			a = new A();
			a.addAttribute("class","green_header_button");
			a.addStyle("margin-right", "10px");
			a.setText("Payment Receipt");
			a.setHref("/ui/community_receipt?op=add");
			headerDiv.addChild(a);
		
			a = new A();
			a.addAttribute("class","green_header_button");
			a.addStyle("margin-right", "10px");
			a.setText("Farmer Payment");
			a.setHref("/ui/patti?op=add");
			headerDiv.addChild(a);
			
			a = new A();
			a.addAttribute("class","green_header_button");
			a.setText("Logout");
			a.setHref("/ui/logout");
			headerDiv.addChild(a);
		} else {
			
			headerDiv.addAttribute("align", "right");
			headerDiv.addStyle("padding-top", "10px");
			headerDiv.addStyle("padding-right", "10px");
			headerDiv.addStyle("padding-left", "20px");
			Div titleDiv = new Div();
			SPAN s = new SPAN();
			s.addStyle("font-size", "18px");
			s.addStyle("font-weight", "bold");
			s.setText(_community.getName()+" - "+_community.getShort_name() );
			titleDiv.addChild(s);
			titleDiv.addStyle("float", "left");
			headerDiv.addChild(titleDiv);
			A a = new A();
			a.addAttribute("class","green_header_button");
			a.setText("Home");
			a.addStyle("margin-right", "10px");
			a.setHref("/ui/configure_community");
			headerDiv.addChild(a);
		
			a = new A();
			a.addAttribute("class","green_header_button");
			a.setText("Logout");
			a.addStyle("margin-right", "10px");
			a.setHref("/ui/logout");
			headerDiv.addChild(a);
		}
        //Div iconDiv = new Div(null, "icon");
        //Div profileDiv = new Div(null, "profile");
        //A a = new A();
        //IMG profileImg = new IMG();
       // profileImg.setSRC(ImageUtils.PROFILE_LOGO);
        //a.addChild(profileImg);
        //profileDiv.addChild(a);
        //iconDiv.addChild(profileDiv);
        //headerDiv.addChild(iconDiv);
	}
}
