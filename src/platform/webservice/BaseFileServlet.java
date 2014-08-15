package platform.webservice;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.util.Streams;

import platform.exception.ExceptionEnum;
import platform.log.ApplicationLogger;
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


public class BaseFileServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
	private byte[] defaultImageFileContents = null;
	private Long defaultImageTimeStamp = null;
	
	public BaseFileServlet(BaseResource resource, BaseService service) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		super(resource, service);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		result result = null;
		setResponseParameters(response);
		response.setContentType("text/html; charset=UTF-8");
		String contentType = null;
		String extension = null;
		try {
			if(!ServletFileUpload.isMultipartContent(request))
				throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_REQUEST);
			
			Map<String, Object> map = new HashMap<String, Object>();
			FileItemIterator fileItemIterator = new ServletFileUpload().getItemIterator(request);
			while(fileItemIterator.hasNext()) {
			    FileItemStream fileItemStream = fileItemIterator.next();
			    String fieldName = fileItemStream.getFieldName();
			    InputStream inputStream = fileItemStream.openStream();
			    if(fileItemStream.isFormField()) {
			    	String fieldValue = Streams.asString(inputStream);
			    	map.put(fieldName, fieldValue);
			    } else if(inputStream != null) {
			    	contentType = fileItemStream.getContentType();
			    	extension = null;
			    	if (!Util.isEmpty(fileItemStream.getName()))
			    		extension = Files.getFileExtension(fileItemStream.getName());
			    	if(!ResourceUtil.inArray(contentType, Field.IMAGE_CONTENT_TYPES) || 
			    			!this.minifyImage(map, inputStream, fieldName, extension)) {
			    		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			    		Streams.copy(inputStream, byteArrayOutputStream, true);
			    		storeFileInMap(map, byteArrayOutputStream, fieldName, contentType, extension);
			    	}
			    }
			    if (inputStream != null)
			    	inputStream.close();
			}
			ServletContext ctx = new ServletContext(getSessionIdFromCookie(request));
	        
			BaseResource resource = (BaseResource) this.resource.clone();
			resource.convertTypeUnsafeMapToResource(map);
			try {
				svc.add(ctx, resource);
			} catch(ApplicationException e) {
				if (ExceptionEnum.INVALID_FILE_TYPE.toString().equals(e.getMessage())) {
					String message = "Resource: " + resource.getClass().getSimpleName() + " Content type: " + contentType +
							" Extension: " + extension + " Profile: " + ctx.getUserName() + " (" + ctx.getUserId() + ")";
					//HelperFactory.getUrgentEmailHelper().createEntryForInvalidFileType(message);
				}
				throw e;
			}
			postProcessing(resource);
			result = new SuccessResult();
		} catch(Exception e) {
			result = new FailureResult(e);
		}
		response.getWriter().print(Json.resourcetoString(result));
	}
	
	//Sub classes can override this to minify the image. Subclass should return true if image is minified and
	//outputstream is populated by subclass itself.
	protected boolean minifyImage(Map<String, Object> map, InputStream inputStream, String fieldName, String extension) throws IOException {
		return false;
	}

	//Subclasses can call this method to store the minified images/files into map
	protected void storeFileInMap(Map<String, Object> map, ByteArrayOutputStream byteArrayOutputStream,
			String fieldName, String contentType, String extension) {
		map.put(fieldName, byteArrayOutputStream.toByteArray());
		map.put(fieldName + Field.FILE_TYPE_FIELD_SUFFIX, contentType);
		if (!Util.isEmpty(extension))
			map.put(fieldName + Field.FILE_EXTENSION_FIELD_SUFFIX, extension);
		map.put(fieldName + Field.TIME_STAMP_FIELD_SUFFIX, new Date().getTime());
	}
	
	//Sub classes can override this to check minified image size and create a warning in log etc
	protected void postProcessing(BaseResource resource) {
	}
	
	protected void getFile(ServletContext ctx, HttpServletRequest request, HttpServletResponse response, String arguids, String fields) throws ServletException, IOException {
		try {
			
			//First fetch only the timestamp of file. If client file's timestamp is not same as that in DB, go & fetch full file.
			//Else send "304 Not Modified" header.
			String fileTimeFieldName = fields + Field.TIME_STAMP_FIELD_SUFFIX;
			BaseResource resource = getResourceByName(ctx, arguids, fileTimeFieldName);
			if (resource == null ) return;
			Map<String, Object> map = resource.convertResourceToMap();
			Long lastModified = (Long) map.get(fileTimeFieldName);
			if(lastModified != null && !this.toSendFile(request, response, lastModified, lastModified.toString()))
				return;
			
			resource = getResourceByName(ctx, arguids);
			map = resource.convertResourceToMap();
			String fileTypeFieldName = fields + Field.FILE_TYPE_FIELD_SUFFIX;
			byte[] buffer = (byte []) map.get(fields);
			Object contentTypeObj = map.get(fileTypeFieldName);
			if(buffer == null) {
 				if(ResourceUtil.inArray(contentTypeObj, Field.IMAGE_CONTENT_TYPES)) {
 					lastModified = getDefaultImageTimeStamp();
					buffer = getDefaultImageFileContents();
					contentTypeObj = getDefaultImageContentType();
					if(lastModified != null && !this.toSendFile(request, response, lastModified, lastModified.toString()))
						return;
				} 
				else 
					throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.RESOURCE_NOT_FOUND, this.resource, fields);
			}
			
			postGetProcessing(resource, response);
			if(lastModified != null)
				setRevalidateHeaders(response, lastModified, lastModified.toString());
			if(contentTypeObj != null)
				response.setContentType(contentTypeObj.toString());
			if(buffer != null) {
				response.getOutputStream().write(buffer);
				ApplicationLogger.info("Sending " + buffer.length + " bytes for " + arguids, getClass());
			} else
				ApplicationLogger.info("File not found for " + arguids, getClass());
		} catch(Exception e) {
			response.getWriter().println(Json.resourcetoString(new FailureResult(e)));
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ServletContext ctx = new ServletContext(getSessionIdFromCookie(request));
			
			String arguids = request.getParameter(QUERYPARAM_ID);
			if(arguids == null || arguids.isEmpty())
				throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_REQUEST); 
			
			String fields = request.getParameter(QUERYPARAM_FIELDS);
			if(fields == null || fields.isEmpty() || fields.indexOf(',') != -1)
				throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_REQUEST);

			getFile(ctx, request, response, arguids, fields);
		} catch(Exception e) {
			response.getWriter().println(Json.resourcetoString(new FailureResult(e)));
		}
	}
	
	// Subclasses can override this to set response headers with file name etc
	protected void postGetProcessing(BaseResource resource, HttpServletResponse response) throws ApplicationException {
	}

	//Validate request headers for caching. Returns false if client has the latest version of the file in which case file doesn't need to be sent to client. 
	//Returns true only if the file has to be served again to client.
	private boolean toSendFile(HttpServletRequest request, HttpServletResponse response, long lastModified, String eTag) throws IOException {
        //If If-None-Match header contains "*" or eTag, then return 304.
        String ifNoneMatch = request.getHeader("If-None-Match");
        if(ifNoneMatch != null && this.matches(ifNoneMatch, eTag)) {
        	setNotModifiedHeaders(response, eTag);
            return false;
        }

        //If If-Modified-Since header is greater than LastModified, then return 304.
        //This header is ignored if If-None-Match header is specified.
        long ifModifiedSince = request.getDateHeader("If-Modified-Since");
        if(ifNoneMatch == null && ifModifiedSince != -1 && ifModifiedSince + 1000 > lastModified) {
        	setNotModifiedHeaders(response, eTag);
        	return false;
        }
        return true;
	}
	
	private void setRevalidateHeaders(HttpServletResponse response, long lastModified, String eTag) throws IOException {
		response.setHeader("Expires", "0");
		response.setHeader("Cache-Control", "max-age=0, must-revalidate");
		response.setHeader("ETag", eTag);
		response.setDateHeader("Last-Modified", lastModified);
	}
	
	private void setNotModifiedHeaders(HttpServletResponse response, String eTag) throws IOException {
		response.setHeader("ETag", eTag);
        response.sendError(HttpServletResponse.SC_NOT_MODIFIED);
	}
	
    private boolean matches(String header, String value) {
        String[] matchValues = header.split("\\s*,\\s*");
        Arrays.sort(matchValues);
        return Arrays.binarySearch(matchValues, value) > -1 || Arrays.binarySearch(matchValues, "*") > -1;
    }
	
	private byte[] getDefaultImageFileContents() throws ApplicationException {
		if(defaultImageFileContents != null)
			return defaultImageFileContents;
		
		InputStream inputStream = null;
		try {
			try {
				inputStream = this.getClass().getClassLoader().getResourceAsStream(getDefaultImagePath());
				if(inputStream == null)
					return null;
				
				ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
				Streams.copy(inputStream, byteArrayOutputStream, true);
				defaultImageFileContents = byteArrayOutputStream.toByteArray();
				return defaultImageFileContents;
			} finally {
				if(inputStream != null)
					inputStream.close();
			}
		} catch(Exception e) {
			throw new ApplicationException(ExceptionSeverity.ERROR, e.toString());
		} 
	}
	
	private Long getDefaultImageTimeStamp() {
		if(defaultImageTimeStamp != null)
			return defaultImageTimeStamp;
		
		URL url = this.getClass().getClassLoader().getResource(getDefaultImagePath());
		if(url != null)
			defaultImageTimeStamp = new File(url.getFile()).lastModified();
		return defaultImageTimeStamp;
	}
	
	protected String getDefaultImagePath() {
		return Field.DEFAULT_PROFILE_IMAGE_PATH; 
	}
	
	protected String getDefaultImageContentType() {
		return Field.DEFAULT_PROFILE_IMAGE_CONTENT_TYPE;
	}
}
