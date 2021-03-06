package platform.webservice;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import platform.util.ApplicationConstants;
import platform.util.ApplicationException;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.component.WebUnAuthorizedAccessView;
import platform.webservice.ui.definition.MapPoint;
import platform.webservice.ui.layout.CenterSingleLayout;


public abstract class BaseMapServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public BaseMapServlet() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
	}
	
	protected void setResponseParameters(HttpServletResponse response)
	{
		if(response == null)
			return;

		response.setContentType("text/html; charset=UTF-8");
		response.setHeader("Cache-Control","no-cache"); //HTTP 1.1
		response.setHeader("Pragma","no-cache"); //HTTP 1.0
		response.setDateHeader ("Expires", 0); //prevents caching at the proxy server
	}
	
	protected boolean isLoginRequired() {
		return false;
	}
	
	protected  abstract MapPoint getPoint();
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		OutputStream out = null;
		// This is to avoid the utf-8 char creating problem.
		 request.setCharacterEncoding("utf-8");
		//Select the appropriate content encoding based on the client's Accept-Encoding header.
		//Choose GZIP if the header  includes "gzip". Choose ZIP if the header includes "compress". 
		//Choose no compression otherwise.
		String encoding = request.getHeader("Accept-Encoding");
		if (encoding != null && encoding.indexOf("gzip") != -1) {
			response.setHeader("Content-Encoding", "gzip");
			out = new GZIPOutputStream(response.getOutputStream());
		}
		else if (encoding != null && encoding.indexOf("compress") != -1) {
			response.setHeader("Content-Encoding", "x-compress");
			out = new ZipOutputStream(response.getOutputStream());
			((ZipOutputStream) out).putNextEntry(new ZipEntry("dummy name"));
		}
		else
			out = response.getOutputStream();
		response.setHeader("Vary", "Accept-Encoding");
		setResponseParameters(response);
		try {
			UIServletContext ctx = new UIServletContext(getSessionIdFromCookie(request));
			ctx.setResponse(response);
			ctx.setDomainName(request.getServerName());
			String userAgent = request.getHeader("User-Agent");
			String httpAccept = request.getHeader("Accept");
			ctx.setServletPath(getServletContext().getRealPath("/"));
			ctx.setUagentInfo(new UAgentInfo(userAgent, httpAccept));
			String buffer = "";
			String mobile = getMobileEnableFromCookie(request);
			@SuppressWarnings("unchecked")
			Enumeration<String> names = request.getParameterNames();
			while (names.hasMoreElements()) {
				String name = names.nextElement();
				String value = request.getParameter(name);
				ctx.addParam(name, value);
			}
			if (platform.util.Util.isEmpty(ctx.getUserId())) {
				if (isLoginRequired()) {
					CenterSingleLayout layout = new CenterSingleLayout(ctx);
					WebUnAuthorizedAccessView view = new WebUnAuthorizedAccessView(ctx);
					layout.getLayout().addChild(view.getView());
					ctx.getPageBuilder().setLayout(layout);
					buffer = ctx.getPageBuilder().getPageContent();
					out.write(buffer.getBytes());
					out.close();
					return;
				}
			}
			if ((mobile != null) && mobile.equals("yes")) {
				ctx.setMobileRequest("yes");
			}
			MapPoint point = getPoint();
			buffer = "<iframe width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\"";
			buffer +="src=\"https://www.google.com/maps/embed/v1/place?key=\""+ApplicationConstants.GOOGLE_MAP_KEY;
			buffer += "&q="+point.getLongitude()+","+point.getLatitude();
			buffer += "</iframe>";
			if (buffer != null)
				out.write(buffer.getBytes());
		} catch(ApplicationException e) {
			e.printStackTrace();
		}
	    out.close();
	}
	
	public String getSessionIdFromCookie(HttpServletRequest request) {
		return getCookie(request, ApplicationConstants.SESSION_ID);
	}
	
	public String getMobileEnableFromCookie(HttpServletRequest request) {
		return getCookie(request, "mobile");
	}
	
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
	
}
	

