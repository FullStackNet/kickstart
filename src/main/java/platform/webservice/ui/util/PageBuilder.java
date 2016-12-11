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
		ArrayList<CSS> fixCssFileList = new ArrayList<CSS>();
		if (mContext.isMobileRequest()) {
			fixCssFileList.add(new CSS("bootstrap.min.css", "/ui/css"));
			fixCssFileList.add(new CSS("bootstrap-theme.min.css", "/ui/css"));
			fixCssFileList.add(new CSS("base.css", "/ui/css"));
			fixCssFileList.add(new CSS("jquery-ui.css", "http://code.jquery.com/ui/1.11.0/themes/smoothness"));
			jsFileList.add(new JS("jquery-1.11.3.min.js", "http://code.jquery.com"));
			jsFileList.add(new JS("jquery-ui.min.js", "http://code.jquery.com/ui/1.11.4"));
			jsFileList.add(new JS("function.js", "/ui/js"));
			jsFileList.add(new JS("DataHandler.js", "/ui/js"));
			jsFileList.add(new JS("json.js", "/ui/js"));
			jsFileList.add(new JS("base64.js", "/ui/js"));
			jsFileList.add(new JS("bootstrap.min.js", "/ui/js"));
		} else {
			fixCssFileList.add(new CSS("bootstrap.min.css", "/ui/css"));
			fixCssFileList.add(new CSS("bootstrap-theme.min.css", "/ui/css"));
			fixCssFileList.add(new CSS("base.css", "/ui/css"));
			fixCssFileList.add(new CSS("jquery-ui.css", "http://code.jquery.com/ui/1.11.0/themes/smoothness"));
			fixCssFileList.add(new CSS("font-awesome.min.css", "/ui/css"));
			fixCssFileList.add(new CSS("ionicons.min.css?v=2.0.1", "/ui/css"));	      
			jsFileList.add(new JS("jquery-1.11.3.min.js", "http://code.jquery.com"));
			jsFileList.add(new JS("jquery-ui.min.js", "http://code.jquery.com/ui/1.11.4"));
			jsFileList.add(new JS("function.js", "/ui/js"));
			jsFileList.add(new JS("jExpand.js", "/ui/js"));
			jsFileList.add(new JS("DataHandler.js", "/ui/js"));
			jsFileList.add(new JS("json.js", "/ui/js"));
			jsFileList.add(new JS("base64.js", "/ui/js"));
			jsFileList.add(new JS("bootstrap.min.js", "/ui/js"));
			
			if (isEditor()) {
				jsFileList.add(new JS("nicEdit-latest.js", "http://js.nicedit.com"));
			}
		}
		jsFileList.add(new JS("jquery.blockUI.js", "/ui/js"));
		if (mContext.isMobileRequest()) {
			META meta = new META();
			meta.addAttribute(new Attribute("name","viewport"));
			meta.addAttribute(new Attribute("content","width=device-width, initial-scale=1.0"));
			mHead.addChild(meta);
			mHead.addChild(new TEXT("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">"));
		}
		for(int i=0; i< fixCssFileList.size();i++) {
			LINK link = new LINK(fixCssFileList.get(i).getHref(), "stylesheet", "text/css");
			mHead.addChild(link);
		}
		for(int i=0; i< cssFileList.size();i++) {
			LINK link = new LINK(cssFileList.get(i).getHref(), "stylesheet", "text/css");
			mHead.addChild(link);
		}
	
		for(int i=0; i<jsFileList.size();i++) {
			if (jsFileList.get(i).isHeader()) {
				if (jsFileList.get(i).getName() == null) {
					mHead.addChild(new SCRIPT("text/javascript", jsFileList.get(i).getPath()));
				} else {
					mHead.addChild(new SCRIPT("text/javascript", jsFileList.get(i).getPath()+"/"+jsFileList.get(i).getName()));
				}
			}
		}
		
		
		if (isEditor()) {
			mHead.addChild(new TEXT("<script type=\"text/javascript\">bkLib.onDomLoaded(nicEditors.allTextAreas);</script>"));
		}
		mBody.addChild(layout.getLayout());
		/*String purechat = "<script type='text/javascript'>	"
				+ "(function () { var done = false;	var script = document.createElement('script');	"
				+ "script.async = true;	script.type = 'text/javascript'; "
				+ "script.src = 'https://app.purechat.com/VisitorWidget/WidgetScript'; "
				+ "document.getElementsByTagName('HEAD').item(0).appendChild(script); "
				+ "script.onreadystatechange = script.onload = function (e) {	"
				+ "if (!done && (!this.readyState || this.readyState == 'loaded' || this.readyState == 'complete')) "
				+ "{	var w = new PCWidget({ c: '7774f0c8-7876-43ba-b5f4-0c1ea97e0008', f: true });	done = true;	}	};	})();	"
				+ "</script>";
		if (!mContext.getDomainName().contains("localhost"))
			mBody.addChild(new TEXT(purechat)); */
		for(int i=0; i<jsFileList.size();i++) {
			if (!jsFileList.get(i).isHeader()) {
				if (jsFileList.get(i).getName() == null) {
					mBody.addChild(new SCRIPT("text/javascript", jsFileList.get(i).getPath()));
				} else {
					mBody.addChild(new SCRIPT("text/javascript", jsFileList.get(i).getPath()+"/"+jsFileList.get(i).getName()));
				}
			}
		}
		StringBuffer buffer = new StringBuffer();
		buffer.append("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
		buffer.append(mHtml.getContent(0));
		
		
		return buffer.toString();
	}
	
	public String getCoachingPageContent() {
		mBody.removeAllChild();
		mHead.removeAllChild();
		ArrayList<CSS> fixCssFileList = new ArrayList<CSS>();
		if (mContext.isMobileRequest()) {
			fixCssFileList.add(new CSS("bootstrap.min.css", "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/"));
			fixCssFileList.add(new CSS("bootstrap-theme.min.css", "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"));
			fixCssFileList.add(new CSS("jquery-ui.css", "http://code.jquery.com/ui/1.11.0/themes/smoothness"));
			jsFileList.add(new JS("jquery-1.11.3.min.js", "http://code.jquery.com"));
			jsFileList.add(new JS("jquery-ui.min.js", "http://code.jquery.com/ui/1.11.4"));
			jsFileList.add(new JS("function.js", "/ui/js"));
			jsFileList.add(new JS("DataHandler.js", "/ui/js"));
			jsFileList.add(new JS("json.js", "/ui/js"));
			jsFileList.add(new JS("base64.js", "/ui/js"));
			jsFileList.add(new JS("bootstrap.min.js", "/ui/js"));
		} else {
		//	fixCssFileList.add(new CSS("bootstrap.min.css", "/ui/css"));
			fixCssFileList.add(new CSS("bootstrap.min.css", "/ui/css/"));
			fixCssFileList.add(new CSS("bootstrap-theme.min.css", "/ui/css/"));
			fixCssFileList.add(new CSS("jquery-ui.css", "http://code.jquery.com/ui/1.11.0/themes/smoothness"));
			fixCssFileList.add(new CSS("font-awesome.min.css", "/ui/css"));
			fixCssFileList.add(new CSS("cloud.css", "/ui/css"));
			fixCssFileList.add(new CSS("ionicons.min.css?v=2.0.1", "/ui/css"));	      
			jsFileList.add(new JS("jquery-1.11.3.min.js", "http://code.jquery.com"));
			jsFileList.add(new JS("jquery-ui.min.js", "http://code.jquery.com/ui/1.11.4"));
			jsFileList.add(new JS("function.js", "/ui/js"));
			jsFileList.add(new JS("jExpand.js", "/ui/js"));
			jsFileList.add(new JS("DataHandler.js", "/ui/js"));
			jsFileList.add(new JS("json.js", "/ui/js"));
			jsFileList.add(new JS("base64.js", "/ui/js"));
			jsFileList.add(new JS("bootstrap.min.js", "/ui/js"));		
			if (isEditor()) {
				jsFileList.add(new JS("nicEdit-latest.js", "http://js.nicedit.com"));
			}
		}
		jsFileList.add(new JS("jquery.blockUI.js", "/ui/js"));
		if (mContext.isMobileRequest()) {
			META meta = new META();
			meta.addAttribute(new Attribute("name","viewport"));
			meta.addAttribute(new Attribute("content","width=device-width, initial-scale=1.0"));
			mHead.addChild(meta);
			mHead.addChild(new TEXT("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">"));
		}
		for(int i=0; i< fixCssFileList.size();i++) {
			LINK link = new LINK(fixCssFileList.get(i).getHref(), "stylesheet", "text/css");
			mHead.addChild(link);
		}
		for(int i=0; i< cssFileList.size();i++) {
			LINK link = new LINK(cssFileList.get(i).getHref(), "stylesheet", "text/css");
			mHead.addChild(link);
		}
	
		for(int i=0; i<jsFileList.size();i++) {
			if (jsFileList.get(i).isHeader()) {
				if (jsFileList.get(i).getName() == null) {
					mHead.addChild(new SCRIPT("text/javascript", jsFileList.get(i).getPath()));
				} else {
					mHead.addChild(new SCRIPT("text/javascript", jsFileList.get(i).getPath()+"/"+jsFileList.get(i).getName()));
				}
			}
		}
		
		
		if (isEditor()) {
			mHead.addChild(new TEXT("<script type=\"text/javascript\">bkLib.onDomLoaded(nicEditors.allTextAreas);</script>"));
		}
		mBody.addChild(layout.getLayout());
		/*String purechat = "<script type='text/javascript'>	"
				+ "(function () { var done = false;	var script = document.createElement('script');	"
				+ "script.async = true;	script.type = 'text/javascript'; "
				+ "script.src = 'https://app.purechat.com/VisitorWidget/WidgetScript'; "
				+ "document.getElementsByTagName('HEAD').item(0).appendChild(script); "
				+ "script.onreadystatechange = script.onload = function (e) {	"
				+ "if (!done && (!this.readyState || this.readyState == 'loaded' || this.readyState == 'complete')) "
				+ "{	var w = new PCWidget({ c: '7774f0c8-7876-43ba-b5f4-0c1ea97e0008', f: true });	done = true;	}	};	})();	"
				+ "</script>";
		if (!mContext.getDomainName().contains("localhost"))
			mBody.addChild(new TEXT(purechat)); */
		for(int i=0; i<jsFileList.size();i++) {
			if (!jsFileList.get(i).isHeader()) {
				if (jsFileList.get(i).getName() == null) {
					mBody.addChild(new SCRIPT("text/javascript", jsFileList.get(i).getPath()));
				} else {
					mBody.addChild(new SCRIPT("text/javascript", jsFileList.get(i).getPath()+"/"+jsFileList.get(i).getName()));
				}
			}
		}
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
