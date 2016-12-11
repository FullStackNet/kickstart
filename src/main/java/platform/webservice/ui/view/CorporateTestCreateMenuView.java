package platform.webservice.ui.view;

import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.component.BaseView;
import platform.webservice.ui.html.A;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.html.LI;
import platform.webservice.ui.html.UL;

public class CorporateTestCreateMenuView extends BaseView {
	UIServletContext mContext;
	public CorporateTestCreateMenuView(UIServletContext context) {
		mContext = context;
	}
	/*<div class="box box-solid activity_box">
                  <div class="box-body clearfix text-center no-padding">
                     <ul class="footer_btns">
                        <li>
                           <a href="/create-online-test/577c1912a2c61c5ad30903b0/">
                              <div><i class="fa fa-laptop"></i></div>
                              <div>Create Test </div>
                           </a>
                        </li>
                        <li>
                           <a href="/create-test-series/577c1912a2c61c5ad30903b0/">
                              <div><i class="fa fa-cubes"></i></div>
                              <div>Create Test Series</div>
                           </a>
                        </li>
                        <li class="generic_modal_trigger" data-toggle="modal" data-target="#generic_modal_lg" data-modal-heading="Share Material" data-href="/share-material/577c1912a2c61c5ad30903b0/">
                           <div><i class="fa fa-cloud-upload"></i></div>
                           <div>Share Material</div>
                        </li>
                        <li class="generic_modal_trigger" data-toggle="modal" data-target="#generic_modal_lg" data-modal-heading="Create Mains Daily Question" data-href="/add-mains-daily-question/577c1912a2c61c5ad30903b0/">
                           <div><i class="fa fa-pencil"></i></div>
                           <div>Create Mains Question</div>
                        </li>
                        <li data-toggle="modal" data-target="#create_batch_modal">
                           <div><i class="fa fa-users"></i></div>
                           <div> Create New Batch </div>
                        </li>
                        <li class="generic_modal_trigger" data-toggle="modal" data-target="#generic_modal_md" data-modal-heading="Add New Branch" data-href="/add-new-institute-branch/577c1912a2c61c5ad30903b0/">
                           <div><i class="fa fa-institution"></i></div>
                           <div>Create Branch </div>
                        </li>
                        <li class="generic_modal_trigger" data-toggle="modal" data-target="#generic_modal_lg" data-modal-heading="Create Announcement" data-href="/get-announcement-modal/577c1912a2c61c5ad30903b0/">
                           <div><i class="fa fa-bullhorn"></i></div>
                           <div>Create Announcement </div>
                        </li>
                        <li class="generic_modal_trigger" data-toggle="modal" data-target="#generic_modal_lg" data-modal-heading="Create Current Affairs" data-href="/create-current-affairs/577c1912a2c61c5ad30903b0/">
                           <div><i class="fa fa-newspaper-o"></i></div>
                           <div>Create Current Affairs </div>
                        </li>
                        <li>
                           <a href="/create-schedule/577c1912a2c61c5ad30903b0/">
                              <div><i class="fa fa-calendar"></i></div>
                              <div>Create Schedule</div>
                           </a>
                        </li>
                        <li class="generic_modal_trigger" data-toggle="modal" data-target="#generic_modal_md" data-modal-heading="Add Institute Staff" data-href="/add-new-institute-staff/577c1912a2c61c5ad30903b0/">
                           <div><i class="fa fa-user"></i></div>
                           <div>Add Staff </div>
                        </li>
                        <li>
                           <a href="/create-mains-test-series/577c1912a2c61c5ad30903b0/">
                              <div><i class="fa fa-cubes"></i></div>
                              <div>Create Mains Test Series</div>
                           </a>
                        </li>
                        <li class="generic_modal_trigger" data-toggle="modal" data-target="#generic_modal_lg" data-modal-heading="Share Video" data-href="/share-video/577c1912a2c61c5ad30903b0/">
                           <div><i class="fa fa-youtube-play"></i></div>
                           <div>Share Video</div>
                        </li>
                     </ul>
                  </div>
               </div>
	*/
	public void buildUI() {
		
		getView().addAttribute("class","box box-solid activity_box");
		Div div = new Div(null,"box-body clearfix text-center no-padding");
		getView().addChild(div);
		UL ul = new UL(null,"footer_btns");
		div.addChild(ul);
		
		LI li = new LI(null,"");
		ul.addChild(li);
		A a = new A();
		a.setHref("/ui/corporate_test?op=add");
		a.setText("<div><i class=\"fa fa-laptop\"></i></div><div>Create Test </div>");
		li.addChild(a);
		
		
		/*li = new LI(null,"");
		ul.addChild(li);
		a = new A();
		a.setText("<div><i class=\"fa fa-institution\"></i></div><div> Create New Branch</div>");
		a.setHref("/ui/corporate_test_branch?op=add");
		li.addChild(a);
		*/
		li = new LI(null,"");
		ul.addChild(li);
		a = new A();
		a.setText("<div><i class=\"fa fa-users\"></i></div><div> Create New Position</div>");
		a.setHref("/ui/corporate_test_position?op=add");
		li.addChild(a);
		
	}
}
