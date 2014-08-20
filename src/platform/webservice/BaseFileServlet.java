package platform.webservice;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.util.Streams;

import platform.exception.ExceptionEnum;
import platform.resource.BaseResource;
import platform.resource.FailureResult;
import platform.resource.SuccessResult;
import platform.resource.result;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Field;
import platform.util.Json;
import platform.util.ResourceUtil;
import platform.util.Util;

import com.google.common.io.Files;


public class BaseFileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public BaseFileServlet() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
	}
	
	protected void setResponseParameters(HttpServletResponse response)
	{
		if(response == null)
			return;

		response.setContentType("application/json; charset=UTF-8");
		response.setHeader("Cache-Control","no-cache"); //HTTP 1.1
		response.setHeader("Pragma","no-cache"); //HTTP 1.0
		response.setDateHeader ("Expires", 0); //prevents caching at the proxy server
	}
	
	protected void saveFile(String id,Map<String, Object> map,String extention) {
		return;
	}
	
	protected String redirect(String id) {
		return null;
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		result result = null;
		setResponseParameters(response);
		response.setContentType("text/html; charset=UTF-8");
		String contentType = null;
		String extension = null;
		InputStream inputStream = null;
		String id = null;
		try {
			if(!ServletFileUpload.isMultipartContent(request))
				throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_REQUEST);
			Map<String, Object> map = new HashMap<String, Object>();
			FileItemIterator fileItemIterator = new ServletFileUpload().getItemIterator(request);
			while(fileItemIterator.hasNext()) {
			    FileItemStream fileItemStream = fileItemIterator.next();
			    String fieldName = fileItemStream.getFieldName();
			    inputStream = fileItemStream.openStream();
			    if(fileItemStream.isFormField()) {
			    	String fieldValue = Streams.asString(inputStream);
			    	if (fieldName.equals("id")) {
			    		id = fieldValue;
			    	}
			    } else if(inputStream != null) {
			    	contentType = fileItemStream.getContentType();
			    	extension = null;
			    	if (!Util.isEmpty(fileItemStream.getName()))
			    		extension = Files.getFileExtension(fileItemStream.getName());
			    	if(!ResourceUtil.inArray(contentType, Field.IMAGE_CONTENT_TYPES) || 
			    			!this.minifyImage(map, inputStream, fieldName, extension)) {
			    		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
						Streams.copy(inputStream, byteArrayOutputStream, true);
						map.put("original", byteArrayOutputStream);
			    	}
			    }
			    inputStream.close();
			}
			if ((id != null)) {
				saveFile(id, map,extension);
			}
			String redirectURL = redirect(id);
			if (redirectURL != null) {
				response.sendRedirect(redirectURL);
			}
			result = new SuccessResult();
		} catch(Exception e) {
			e.printStackTrace();
			result = new FailureResult(e);
		}
		response.getWriter().print(Json.resourcetoString(result));
	}
	
	//Sub classes can override this to minify the image. Subclass should return true if image is minified and
	//outputstream is populated by subclass itself.
	protected boolean minifyImage(Map<String, Object> map, InputStream inputStream, String fieldName, String extension) throws IOException {
		return false;
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
