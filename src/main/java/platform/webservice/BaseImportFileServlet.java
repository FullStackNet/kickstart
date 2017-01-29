package platform.webservice;

import com.google.common.io.Files;
import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.util.Streams;
import platform.exception.ExceptionEnum;
import platform.helper.SessionHelper;
import platform.resource.*;
import platform.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;


public abstract class BaseImportFileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public BaseImportFileServlet() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
	}
	abstract protected void importFile(ServletContext ctx, Map<String, Object> map,String extention) throws Exception;
	abstract protected boolean validateExtension(String extension);
	abstract protected String  getValidExtension();
	
	protected void setResponseParameters(HttpServletResponse response)
	{
		if(response == null)
			return;

		response.setContentType("application/json; charset=UTF-8");
		response.setHeader("Cache-Control","no-cache"); //HTTP 1.1
		response.setHeader("Pragma","no-cache"); //HTTP 1.0
		response.setDateHeader ("Expires", 0); //prevents caching at the proxy server
	}


	public String getSessionIdFromCookie(HttpServletRequest request) {
		return getCookie(request, ApplicationConstants.SESSION_ID);
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

	protected String redirect() {
		return null;
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		result result = null;
		setResponseParameters(response);
		response.setContentType("text/html; charset=UTF-8");
		String extension = null;
		InputStream inputStream = null;
		session _session = null;
		ServletContext ctx;
		try {
			if(!ServletFileUpload.isMultipartContent(request))
				throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_REQUEST);
			
			String sessionId = getSessionIdFromCookie(request); 
			if (Util.isEmpty(sessionId))  {
					throw new ApplicationException(ExceptionSeverity.ERROR,ExceptionEnum.INVALID_SESSION);
			} else {
				_session = (session) SessionHelper.getInstance().getById(sessionId);
				if (_session == null) {
						throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_SESSION);
				}
			}
			ctx = new ServletContext(_session);	
			Map<String, Object> map = new HashMap<String, Object>();
			FileItemIterator fileItemIterator = new ServletFileUpload().getItemIterator(request);
			while(fileItemIterator.hasNext()) {
			    FileItemStream fileItemStream = fileItemIterator.next();
			    String fieldName = fileItemStream.getFieldName();
			    inputStream = fileItemStream.openStream();
			    if(fileItemStream.isFormField()) {
			    	String fieldValue = Streams.asString(inputStream);
			    	map.put(fieldName, fieldValue);
			    } else if(inputStream != null) {
	//		    	contentType = fileItemStream.getContentType();
			    	extension = null;
			    	if (!Util.isEmpty(fileItemStream.getName()))
			    		extension = Files.getFileExtension(fileItemStream.getName());
			    		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
						Streams.copy(inputStream, byteArrayOutputStream, true);
						map.put("content", byteArrayOutputStream);
			    }
			    inputStream.close();
			}
			if (!validateExtension(extension)) {
				throw new ApplicationException(ExceptionSeverity.ERROR, "Invalid Extension . Valid Extension " + getValidExtension());
			}
			importFile(ctx, map,extension);
			result = new SuccessResult();
		} catch(Exception e) {
			e.printStackTrace();
			result = new FailureResult(e);
		}
		String redirectURL = redirect();
		if (redirectURL != null) {
			response.sendRedirect(redirectURL);
			return;
		}
		response.getWriter().print(Json.resourcetoString(result));
	}
	
	
	//Sub classes can override this to check minified image size and create a warning in log etc
	protected void postProcessing(BaseResource resource) {
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	// Subclasses can override this to set response headers with file name etc
	protected void postGetProcessing(BaseResource resource, HttpServletResponse response) throws ApplicationException {
	}
}
