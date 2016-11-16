package platform.webservice.ui.view;

import application.c4t.vehicle.school.helper.SchoolHelper;
import application.c4t.vehicle.school.resource.school;
import platform.resource.BaseResource;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.component.BaseView;
import platform.webservice.ui.html.A;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.html.LI;
import platform.webservice.ui.html.UL;

public class CorporateTestMenuView extends BaseView {
	UIServletContext mContext;
	public CorporateTestMenuView(UIServletContext context) {
		mContext = context;
	}
	/*<div class="container no-padding">
    <ul class="no-margin clearfix main_menu_ul  ">
       <li class=""><a href="/"><i class="fa text-theme-color fa-feed"></i>
          Test Series 
          </a>
       </li>
       <li><a class="main_menu_discussion_link" href="/discussions/"><i class="fa text-theme-color fa-comments"></i> 
          Prelims Test
          </a>
       </li>
       <!-- <li class=""><a href=""> Teachers </a>  -->
       <li class="hidden-xs"><a href="/mains-test-series/"><i class="fa text-theme-color fa-pencil-square-o"></i> 
          Mains Tests
          </a>
       </li>
       <li class="hidden-xs"><a href="/videos/all/"><i class="fa text-theme-color fa-youtube-play"></i> 
          Videos 
          </a>
       </li>
       <li class="hidden-xs"><a href="/current-affairs-archive/"><i class="fa text-theme-color fa-newspaper-o"></i> 
          Current Affairs 
          </a>
       </li>
       <li class="hidden-xs"><a href="/study-materials/"><i class="fa text-theme-color fa-download"></i> 
          Study Materials 
          </a>
       </li>
       <!-- <li class="hidden-xs"><a href="javascript:void(0);" onclick="alert('Coming Soon !');"><i class="fa text-theme-color fa-pencil"></i> 
          Previous Year Papers
          </a></li><li class="hidden-xs"><a href="javascript:void(0);" onclick="alert('Coming Soon !');"><i class="fa text-theme-color fa-pencil"></i> 
          Previous Year Cut-offs
          </a></li> -->
       <li class="hidden-xs"><a href="/books/"><i class="fa text-theme-color fa-book"></i> 
          Resources 
          </a>
       </li>
      
    </ul>
 </div>
	*/
	public void buildUI() {
		
		getView().addAttribute("class","main_menu");
		Div div = new Div(null,"container no-padding");
		getView().addChild(div);
		UL ul = new UL(null,"no-margin clearfix main_menu_ul");
		div.addChild(ul);
		
		LI li;
		A a;
		
		li = new LI(null,"");
		ul.addChild(li);
		 a = new A();
		a.setText("<i class=\"fa fa-users\"></i> Position");
		a.setHref("/ui/corporate_test_position");
		li.addChild(a);
		
		li = new LI(null,"");
		ul.addChild(li);
		 a = new A();
		a.setText("<i class=\"fa fa-laptop\"></i> Test");
		a.setHref("/ui/corporate_test");
		li.addChild(a);
		
		li = new LI(null,"");
		ul.addChild(li);
		 a = new A();
		a.setText("<i class=\"fa fa-laptop\"></i> Test Result");
		a.setHref("/ui/corporate_test_my_area");
		li.addChild(a);
		
		BaseResource[] resources = SchoolHelper.getInstance().getByCustomerId(mContext.getCustomerId(),new String[]{school.FIELD_NAME});
		
		li = new LI(null,"");
		ul.addChild(li);
		a = new A();
		a.setText("<i class=\"fa fa-institution\"></i> Setting");
		a.setHref("/ui/corporate_test_branch?op=modify&id="+resources[0].getId()+"&no_list=yes");
		li.addChild(a);
	}
}
