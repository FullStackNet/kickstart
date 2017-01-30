package platform.webservice.ui.view;

import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.component.BaseView;
import platform.webservice.ui.html.A;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.html.LI;
import platform.webservice.ui.html.UL;

public class MandiMenuView extends BaseView {
    UIServletContext mContext;

    public MandiMenuView(UIServletContext context) {
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

        getView().addAttribute("class", "main_menu");
        Div div = new Div(null, "container no-padding");
        getView().addChild(div);
        UL ul = new UL(null, "no-margin clearfix main_menu_ul");
        div.addChild(ul);

        LI li;
        A a;

        li = new LI(null, "");
        ul.addChild(li);
        a = new A();
        a.setText("Upload Account Master");
        a.setHref("/ui/import_account_master");
        li.addChild(a);

        li = new LI(null, "");
        ul.addChild(li);
        a = new A();
        a.setText("Upload Vouchers");
        a.setHref("/ui/import_vouchers");
        li.addChild(a);

    }
}
