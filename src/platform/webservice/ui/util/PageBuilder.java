package platform.webservice.ui.util;

import java.util.ArrayList;

import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.html.BODY;
import platform.webservice.ui.html.CSS;
import platform.webservice.ui.html.HEAD;
import platform.webservice.ui.html.HTML;
import platform.webservice.ui.html.JS;
import platform.webservice.ui.html.LINK;
import platform.webservice.ui.html.META;
import platform.webservice.ui.html.SCRIPT;
import platform.webservice.ui.html.TEXT;
import platform.webservice.ui.layout.BaseLayout;

public class PageBuilder {
	ArrayList<JS> jsFileList;
	ArrayList<CSS> cssFileList;
	BaseLayout layout;
	HTML mHtml; 
	BODY mBody ;
	HEAD mHead;
	UIServletContext mContext;
	boolean mEditor;
	
	public PageBuilder(UIServletContext context) {
		mContext = context;
		jsFileList = new ArrayList<JS>();
		cssFileList = new ArrayList<CSS>();
		mHtml = new HTML();
		mHtml.addAttribute(new Attribute("xmlns","http://www.w3.org/1999/xhtml"));
		mBody = new BODY();
		mHead = new HEAD();
		mHtml.addChild(mHead);
		mHtml.addChild(mBody);
	}

	public void addJS(JS js) {
		for(int i=0; i< jsFileList.size();i++) {
			if (jsFileList.get(i).getName() == null)
				continue;
			if (js.getName() == null)
				continue;
			if (jsFileList.get(i).getName().equals(js.getName()) &&
					jsFileList.get(i).getName().equals(js.getName())) {
				return;
			}

		}
		jsFileList.add(js);
	}

	public void addCSS(CSS css) {
		for(int i=0; i< cssFileList.size();i++) {
			if (cssFileList.get(i).getName().equals(css.getName()) &&
					cssFileList.get(i).getName().equals(css.getName())) {
				return;
			}
		}
		cssFileList.add(css);
	}

	public void setLayout(BaseLayout layout) {
		this.layout = layout;
	}

	public String getPageContent() {
		mBody.removeAllChild();
		mHead.removeAllChild();
		if (mContext.isMobileRequest()) {
			cssFileList.add(new CSS("mobile_base.css", "/ui/css"));
			cssFileList.add(new CSS("jquery.mobile-1.4.0.min.css", "http://code.jquery.com/mobile/1.4.0/"));
			jsFileList.add(new JS("jquery-1.10.2.min.js", "/ui/js"));
			jsFileList.add(new JS("jquery.mobile-1.4.0.min.js", "http://code.jquery.com/mobile/1.4.0"));
			jsFileList.add(new JS("function.js", "/ui/js"));
			jsFileList.add(new JS("DataHandler.js", "/ui/js"));
			jsFileList.add(new JS("json.js", "/ui/js"));
		} else {
			cssFileList.add(new CSS("base.css", "/ui/css"));
			cssFileList.add(new CSS("jquery-ui.css", "http://code.jquery.com/ui/1.11.0/themes/smoothness"));
			jsFileList.add(new JS("jquery-1.10.2.js", "http://code.jquery.com"));
			jsFileList.add(new JS("jquery-ui.js", "http://code.jquery.com/ui/1.11.0"));
			jsFileList.add(new JS("function.js", "/ui/js"));
			jsFileList.add(new JS("DataHandler.js", "/ui/js"));
			jsFileList.add(new JS("json.js", "/ui/js"));
			jsFileList.add(new JS("base64.js", "/ui/js"));
			if (isEditor()) {
				jsFileList.add(new JS("nicEdit-latest.js", "http://js.nicedit.com"));
			}
		}
		if (mContext.isMobileRequest()) {
			META meta = new META();
			meta.addAttribute(new Attribute("name","viewport"));
			meta.addAttribute(new Attribute("content","width=device-width, initial-scale=1.0"));
			mHead.addChild(meta);
		}
		for(int i=0; i<jsFileList.size();i++) {
			if (jsFileList.get(i).getName() == null) {
				mHead.addChild(new SCRIPT("text/javascript", jsFileList.get(i).getPath()));
			} else {
				mHead.addChild(new SCRIPT("text/javascript", jsFileList.get(i).getPath()+"/"+jsFileList.get(i).getName()));
			}
		}
		
		
		for(int i=0; i< cssFileList.size();i++) {
			LINK link = new LINK(cssFileList.get(i).getHref(), "stylesheet", "text/css");
			mHead.addChild(link);
		}
		if (isEditor()) {
			mHead.addChild(new TEXT("<script type=\"text/javascript\">bkLib.onDomLoaded(nicEditors.allTextAreas);</script>"));
		}
		mBody.addChild(layout.getLayout());
		StringBuffer buffer = new StringBuffer();
		buffer.append("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
		buffer.append(mHtml.getContent(0));

		return buffer.toString();
	}

	public boolean isEditor() {
		return mEditor;
	}

	public void setEditor(boolean mEditor) {
		this.mEditor = mEditor;
	}
}
