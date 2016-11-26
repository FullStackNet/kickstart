package platform.webservice.ui;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import platform.resource.BaseResource;
import platform.util.ApplicationConstants;
import platform.util.ApplicationException;
import platform.util.Util;
import platform.webservice.ui.html.BaseHTMLComponent;



public abstract class BaseMobileUIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public BaseMobileUIServlet() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
	}
	
	protected void setResponseParameters(HttpServletResponse response) {
				
		if(response == null)
			return;

		response.setContentType("application/json; charset=UTF-8");
		response.setHeader("Cache-Control","no-cache"); //HTTP 1.1
		response.setHeader("Pragma","no-cache"); //HTTP 1.0
		response.setDateHeader ("Expires", 0); //prevents caching at the proxy server
	}
	
	
	protected void saveFile(String id,Map<String, Object> map,String extention)  {
		return;
	}
	
	protected String redirect(String id) {
		return null;
	}
	
	/*<ul data-role="listview" data-inset="true" data-divider-theme="a">
	    <li data-role="list-divider">Mail</li>
	    <li><a href="#">Inbox</a></li>
	    <li><a href="#">Outbox</a></li>
	    <li data-role="list-divider">Contacts</li>
	    <li><a href="#">Friends</a></li>
	    <li><a href="#">Work</a></li>
	</ul>
	*/
	public String getCookie(HttpServletRequest request, String cookieName) {
		Cookie[] cookies = request.getCookies();
		if (cookies != null)
		{
			for (int i =0; i< cookies.length; i++)
			{
				Cookie aCookie = cookies[i];
				if (aCookie.getName().equals(cookieName)) {
					return aCookie.getValue();
				}
			}

		}
		return null;
	}
	
	public String getSessionIdFromCookie(HttpServletRequest request) {
		return getCookie(request, ApplicationConstants.SESSION_ID);
	}
	
	protected abstract BaseHTMLComponent processRequest(UIServletContext ctx);
	protected abstract String getName(UIServletContext ctx);
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		setResponseParameters(response);
		response.setContentType("text/html; charset=UTF-8");
		try {
			UIServletContext ctx = new UIServletContext(getSessionIdFromCookie(request));
			Enumeration<String> names = request.getParameterNames();
			while (names.hasMoreElements()) {
				String name = names.nextElement();
				String value = request.getParameter(name);
				ctx.addParam(name, value);
			}
			Map<String, String> map = new HashMap<String, String>();
			map.put("HEADER", getName(ctx));
			BaseHTMLComponent content = processRequest(ctx);
			map.put("CONTENT", content.getContent(0));
			String contentString = Util.readTempleteFileFromLocal("mobile_templete", map);
			response.getWriter().print(contentString);
		} catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
	//Sub classes can override this to minify the image. Subclass should return true if image is minified and
	//outputstream is populated by subclass itself.
	protected boolean minifyImage(Map<String, Object> map, InputStream inputStream, String fieldName, String extension) throws IOException {
		return false;
	}

	
	//Sub classes can override this to check minified image size and create a warning in log etc
	protected void postProcessing(BaseResource resource) {
	}
	
	// Subclasses can override this to set response headers with file name etc
	protected void postGetProcessing(BaseResource resource, HttpServletResponse response) throws ApplicationException {
	}
}
