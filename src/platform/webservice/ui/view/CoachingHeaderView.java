package platform.webservice.ui.view;

import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.component.BaseView;
import platform.webservice.ui.html.A;
import platform.webservice.ui.html.CUSTOM;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.html.LI;
import platform.webservice.ui.html.UL;

public class CoachingHeaderView extends BaseView {
	UIServletContext mContext;
	public CoachingHeaderView(UIServletContext context) {
		mContext = context;
	}
	

	public void buildUI() {
		/* <div class="">
         <nav class="navbar navbar-inverse navbar-fixed-top app-navbar">
            <div class="container no-padding-xs">
               <div class="navbar-header">
                  <a class="navbar-brand" href="/">
                  Demo Main Institute
                  </a><!--  <form class="top_search_container navbar-left"><input type="text" class="form-control app-navbar-search" placeholder="Search..."></form> -->
               </div>
               <div id="navbar" class="">
                  <ul class="nav navbar-nav navbar-right top_notif_menu text-right">
                     <li class=""><a href="/" >Home</a></li>
                     <li><a href="/demomaininstitute/" title="Demo Main Institute" >Profile</a></li>
                     <li class="dropdown_custom hidden">
                        <a href="#" ><i class="fa fa-envelope"></i><span class="label label-danger" id="socket_message">2</span></a>
                        <ul class="dropdown_menu">
                           <li class="header"> You have <span class="new_messages_count">2</span> new messages </li>
                           <li class="position-relative">
                              <div class="form-loader hidden">
                                 <p><i class="fa fa-pulse fa-spinner "></i></p>
                              </div>
                              <div class="list-group inside-box  "><a class="list-group-item"><i class="fa fa-user"></i><span class="text-primary"> Michael sent :</span> Hi Ashish ! How are you?</a><a class="list-group-item"><i class="fa fa-user"></i><span class="text-primary"> Zuckerberg sent :</span> Great Work Guys ! </a></div>
                           </li>
                           <li class="footer border-top"><a href="/messages/">View all</a></li>
                        </ul>
                     </li>
                     <li class="dropdown_custom ">
                        <a href="/top-schedule-list/" class="top_notifs_btn" ><i class="fa fa-calendar"></i><span class="label label-danger  hidden " >0</span></a>
                        <ul class="dropdown_menu top_notification_dropdown schedule_dropdown">
                           <li class="header padding-l-10"><i class="fa fa-calendar margin-r-10"></i> You have <span class="new_schedulte_count">0</span> new schedule updates </li>
                           <li class="position-relative ">
                              <div class="form-loader hidden">
                                 <p><i class="fa fa-pulse fa-spinner "></i></p>
                              </div>
                              <div class="list-group inside-box  thin_scrollbar max_height_250 menu_ajax_content "></div>
                           </li>
                           <li class="footer border-top text-bold"><a href="/schedules/"> See all Schedule Updates</a></li>
                        </ul>
                     </li>
                     <li class="dropdown_custom ">
                        <a href="/top-achievements-list/" class="top_notifs_btn" ><i class="fa fa-trophy"></i><span class="label label-danger  hidden " id="socket_notif">0</span></a>
                        <ul class="dropdown_menu top_notification_dropdown achievement_dropdown">
                           <li class="header padding-l-10"><i class="fa fa-trophy"></i> You have <span class="new_notifications_count">0</span> new Achievements </li>
                           <li class="position-relative ">
                              <div class="form-loader hidden">
                                 <p><i class="fa fa-pulse fa-spinner "></i></p>
                              </div>
                              <div class="list-group inside-box  thin_scrollbar max_height_250 menu_ajax_content "></div>
                           </li>
                           <li class="footer border-top text-bold"><a href="/achievements/"> See all Achievements</a></li>
                        </ul>
                     </li>
                     <li class="dropdown_custom ">
                        <a href="/top-notification-list/" class="top_notifs_btn" ><i class="fa fa-bell"></i><span class="label label-danger  hidden " id="socket_notif">0</span></a>
                        <ul class="dropdown_menu top_notification_dropdown ">
                           <li class="header padding-l-10"><i class="fa fa-bell"></i> You have <span class="new_notifications_count">0</span> new notifications </li>
                           <li class="position-relative ">
                              <div class="form-loader hidden">
                                 <p><i class="fa fa-pulse fa-spinner "></i></p>
                              </div>
                              <div class="list-group inside-box  thin_scrollbar max_height_250 menu_ajax_content "></div>
                           </li>
                           <li class="footer border-top text-bold"><a href="/notifications/"> See all Notifications</a></li>
                        </ul>
                     </li>
                     <li class="dropdown_custom ">
                        <a href="#" class="img_wrapper"><img src="images/institute.svg" /><span class="caret"></span></a>
                        <ul class="dropdown_menu user_info_dropdown">
                           <div class="has_top_triangle bg-white ">
                              <div class="list-group inside-box quick-links">
                                 <a class="list-group-item" href="/demomaininstitute/"><i class="fa fa-user"></i> Profile 
                                 </a><!--  <a href="" class="list-group-item "><i class="fa fa-envelope"></i> Messages
                                    </a><a href=""  class="list-group-item"><i class="fa fa-star"></i> My Bookmarks
                                    </a><a href=""  class="list-group-item "><i class="fa fa-pencil"></i> My Discussions
                                    </a><a href=""  class="list-group-item"><i class="fa fa-comment"></i> My Comments
                                    </a><a href=""  class="list-group-item"><i class="fa fa-comments"></i> Discussions viewed 
                                    </a><a href=""  class="list-group-item"><i class="fa fa-eye-slash"></i> Discussions hidden 
                                    </a> --><a href="/accounts/change-password/"  class="list-group-item border-top"><i class="fa fa-retweet"></i> Change Password 
                                 </a><a href="/accounts/logout/"  class="list-group-item border-top"><i class="fa fa-external-link"></i> Logout 
                                 </a>
                              </div>
                           </div>
                        </ul>
                     </li>
                     <!-- 
                        <li><a href="#">Profile</a></li><li><a href="#"><i class="fa fa-user-plus"></i></a></li><li><a href="#"><i class="fa fa-envelope"></i></a></li><li><a href="#"><i class="fa fa-bell"></i></a></li> 
                        -->
                  </ul>
               </div>
            </div>
         </nav>
      </div>*/
		CUSTOM nav = new  CUSTOM("nav",null,"navbar navbar-inverse navbar-fixed-top app-navbar");
		getView().addChild(nav);
		Div container = new Div(null,"container no-padding-xs");
		nav.addChild(container);
		Div navbar_header = new Div(null,"navbar-header");
		container.addChild(navbar_header);	
		A a = new A();
		a.setText(mContext.getCustomerName());
		a.addAttribute("class","navbar-brand");
		navbar_header.addChild(a);
		Div navbarDiv = new Div("navbar",null);
		container.addChild(navbarDiv);
		UL ul = new UL(null,"nav navbar-nav navbar-right top_notif_menu text-right");
		navbarDiv.addChild(ul);
		LI li = new LI();
		ul.addChild(li);
		
		a = new A();	
		a.setText("Home");
		li.addChild(a);
		
		li = new LI();
		ul.addChild(li);
		a = new A();	
		a.setText("Profile");
		li.addChild(a);		
		
		li = new LI(null, "dropdown_custom");
		ul.addChild(li);
		a = new A();	
		a.setText("<i class=\"fa fa-trophy\"></i><span class=\"label label-danger  hidden\" id=\"socket_notif\">0</span>");
		li.addChild(a);		

		li = new LI(null, "dropdown_custom");
		ul.addChild(li);
		a = new A();	
		a.setText("Ajay<span class=\"caret\"></span>");
		a.setText("<i class=\"fa fa-envelope\"></i><span class=\"label label-danger  hidden\" id=\"socket_notif\">0</span>");
		li.addChild(a);		
		
		li = new LI(null, "dropdown_custom");
		ul.addChild(li);
		a = new A();	
		
		a.setText("<i class=\"fa fa-calendar\"></i><span class=\"label label-danger  hidden\" id=\"socket_notif\">0</span>");
		li.addChild(a);		
		
		li = new LI(null, "dropdown_custom");
		ul.addChild(li);
		a = new A();	
		a.setText("<i class=\"fa fa-user\"></i><span class=\"caret\"</span>");
		li.addChild(a);		
		
		UL dropMenu = new UL(null, "dropdown_menu user_info_dropdown");
		li.addChild(dropMenu);
		Div div = new Div(null,"has_top_triangle bg-white ");
		Div listGroup = new Div(null,"list-group inside-box quick-links");
		dropMenu.addChild(div);
		div.addChild(listGroup);
		a = new A(null,"list-group-item");
		a.setText("Change Password");
		listGroup.addChild(a);
		
	}
}
