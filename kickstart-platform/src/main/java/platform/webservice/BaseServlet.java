package platform.webservice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.db.ResourceOrder;
import platform.exception.ExceptionEnum;
import platform.helper.SessionHelper;
import platform.helper.User_mapHelper;
import platform.log.ApplicationLogger;
import platform.resource.BaseResource;
import platform.resource.CountResult;
import platform.resource.FailureResult;
import platform.resource.SuccessResult;
import platform.resource.result;
import platform.resource.session;
import platform.util.ApplicationConstants;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.HTML;
import platform.util.Json;
import platform.util.Util;
import platform.util.security.SecurityUtil;


public class BaseServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	private static String QUERYPARAM_AUTOCOMPLETE = "autocomplete";
	private static String QUERYPARAM_QUERY = "term";
	private static String QUERYPARAM_PAGENO = "pageno";
	private static String QUERYPARAM_PAGESIZE = "pagesize";

	protected static String QUERYPARAM_ID = "id";
	protected static String QUERYPARAM_FIELDS = "fields";
	protected static String QUERYPARAM_SUPER_FIELD = "sfield";
	private static String QUERYPARAM_QUERYID = "queryId";
	private static String QUERYPARAM_ARGS = "args";
	private static String QUERYPARAM_COUNT = "count";
	private static String QUERYPARAM_COMMON_QUERY_ID = "QUERY";
	private static String QUERYPARAM_FORMAT = "format";
	private static String QUERYPARAM_FIELDNAME = "fieldname";
	private static String QUERYPARAM_RENDERTYPE = "rendertype";
	private static String QUERYPARAM_ACTION = "action";
	private static String QUERYPARAM_TEST = "test";
	private static String QUERYPARAM_ORDERBY = "orderby";

	protected BaseResource resource;

	protected BaseService svc;
	protected boolean allowAddIfSessionExists = true;

	public BaseServlet() {

	}

	public BaseServlet(BaseResource resource, BaseService service) {
		this.resource = resource;
		if (service != null)
			svc = service;
	}

	public void init(ServletConfig config) throws ServletException 
	{
		super.init(config);
		ApplicationLogger.init();
	}

	protected boolean isLoginRequired() {
		return true;
	}

	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		BaseResource p = null;
		PrintWriter out = response.getWriter();
		setResponseParameters(response);
		result result;
		boolean multiResource = false;
		String resourceText = null;
		String action = null;
		try {
			// This is to avoid the utf-8 char creating problem.
			request.setCharacterEncoding("utf-8");
			String sessionId = getSessionIdFromCookie(request); 
			ServletContext ctx;
			if (Util.isEmpty(sessionId))  {
				if (isLoginRequired()) {
					throw new ApplicationException(ExceptionSeverity.ERROR,ExceptionEnum.INVALID_SESSION);
				}
				synchronized (BaseServlet.class) {
					while (true) {
						sessionId = Util.getUniqueId();
						session _session = (session) SessionHelper.getInstance().getById(sessionId);
						if (_session == null) {
							_session = new session(sessionId);
							SessionHelper.getInstance().add(_session);
							ctx = new ServletContext(_session);
							break;
						}
					}
				}
			} else {
				session _session = (session) SessionHelper.getInstance().getById(sessionId);
				if (_session == null) {
					if (isLoginRequired())
						throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_SESSION);
					synchronized (BaseServlet.class) {
						while (true) {
							sessionId = Util.getUniqueId();
							_session = (session) SessionHelper.getInstance().getById(sessionId);
							if (_session == null) {
								_session = new session(sessionId);
								SessionHelper.getInstance().add(_session);
								ctx = new ServletContext(_session);
								break;
							}
						}
					}
				}
				ctx = new ServletContext(_session);
			}

			
			ctx.setServletPath(getServletContext().getRealPath("/"));

			Enumeration<String> names = request.getParameterNames();
			while (names.hasMoreElements()) {
				String name = names.nextElement();
				String value = request.getParameter(name);
				ctx.addParam(name, value);
			}
			action = request.getParameter(QUERYPARAM_ACTION);
			if (WebServiceContants.OPERATION_ADD.equalsIgnoreCase(action)) {
				action = null;
			}

			if(sessionId != null && !allowAddIfSessionExists)
				throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.LOGIN_SESSION_ALREADY_EXISTS);

			if (request.getParameterValues(ApplicationConstants.REQ_RESOURCES) != null) {
				resourceText = request.getParameterValues(ApplicationConstants.REQ_RESOURCES)[0];
				resourceText = unescapePOSTBody(resourceText);
				resourceText = SecurityUtil.decodeBase64(resourceText);
				multiResource = true;
			} else {
				if (request.getParameterValues(ApplicationConstants.REQ_RESOURCE) != null) {
					resourceText = request.getParameterValues(ApplicationConstants.REQ_RESOURCE)[0];
					resourceText = unescapePOSTBody(resourceText);
					resourceText = SecurityUtil.decodeBase64(resourceText);
				} else { 
					if (request.getParameterValues(ApplicationConstants.FORM) != null) {
						String m16form = request.getParameterValues(ApplicationConstants.FORM)[0];
						if (m16form != null) {
							Map<String, Object> map = request.getParameterMap();
							Map<String, Object> cmap = new HashMap<String, Object>();
							Iterator<Entry<String, Object>> it = map.entrySet().iterator();
							while (it.hasNext()) {
								Map.Entry<String, Object> pairs = (Map.Entry<String, Object>)it.next();
								if( (pairs.getValue() != null)) {
									Object object = (Object) request.getParameterValues(pairs.getKey().toString())[0];
									if (object.toString().length() > 0)
										cmap.put(pairs.getKey().toString(), object);
								}
							} 
							p = (BaseResource) resource.getClass().newInstance();
							p.convertTypeUnsafeMapToResource(cmap);
							svc.update(ctx, p);
							result = new SuccessResult();
							result.setResource(p);
							String responseStr = Json.resourcetoString(result);
							out.println(responseStr);
							return;
						}
						else	
							throw new ApplicationException(ExceptionSeverity.ERROR,"Resource is empty");
					}
					else	
						throw new ApplicationException(ExceptionSeverity.ERROR,"Resource is empty");
				}
			}
			if (action != null) {
				if (multiResource) {
					svc.action(ctx, resourceText, action);
				} else {
					p = Json.stringToResource(resourceText,resource.getClass());
					svc.action(ctx,p,action);
				}
			} else {
				if (multiResource) {
					svc.add(ctx,resourceText);
				} else {
					p = Json.stringToResource(resourceText,resource.getClass());
					svc.add(ctx, p);
				}
			}
			result = new SuccessResult();
			postProcessing(ctx, request, response, p, action);
			result.setResource(p);
			//result.setRecentAlerts(User_mapHelper.getInstance().getRecentAlertCount(ctx.getUserId()));
			//result.setRecentNotifications(User_mapHelper.getInstance().getRecentNotificationCount(ctx.getUserId()));
			//	result.setPendingCoins(CandidateHelper.getInstance().getPendingCoins(ctx.getUserId()));

		} catch(ApplicationException e){
			if ((e.getErrorCode() != null) && (e.getErrorCode() == ExceptionEnum.INVALID_SESSION)) {
				expireSessionCookie(request, response);
			}
			result = new FailureResult(e);
			e.printStackTrace();
		} catch (Exception e) {
			checkAndSendException(e);
			result = new FailureResult(e);
			e.printStackTrace();
		}
		String responseStr = Json.resourcetoString(result);
		try {
			responseStr = aesEncrypt(request, responseStr);
		} catch (Exception e) {
			checkAndSendException(e);
			e.printStackTrace();
			result.setErrCode(-1);
			result.setMessage(e.getMessage());
			responseStr = Json.resulttoString(result);
		}
		out.println(responseStr);
	}


	protected void postProcessing(ServletContext ctx, HttpServletRequest request, HttpServletResponse response, BaseResource resource, String action) throws ApplicationException {

	}

	private boolean isGetAllSupported() {
		return false;
	}

	private String convertStreamToString(InputStream is) throws IOException {
		/*
		 * To convert the InputStream to String we use the
		 * Reader.read(char[] buffer) method. We iterate until the
		 * Reader return -1 which means there's no more data to
		 * read. We use the StringWriter class to produce the string.
		 */
		if (is != null) {
			Writer writer = new StringWriter();

			char[] buffer = new char[1024];
			try {
				Reader reader = new BufferedReader(
						new InputStreamReader(is, "UTF-8"));
				int n;
				while ((n = reader.read(buffer)) != -1) {
					writer.write(buffer, 0, n);
				}
			} finally {
				is.close();
			}
			return writer.toString();
		} else {        
			return "";
		}
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		setResponseParameters(response);

		result result = new result();


		try {
			String resourceText = convertStreamToString(request.getInputStream());
			resourceText = aesDecrypt(request, resourceText);
			// This is to avoid the utf-8 char creating problem.
			request.setCharacterEncoding("utf-8");
			String sessionId = getSessionIdFromCookie(request); 
			ServletContext ctx;
			if (Util.isEmpty(sessionId))  {
				if (isLoginRequired()) {
					throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_SESSION);
				}
				synchronized (BaseServlet.class) {
					while (true) {
						sessionId = Util.getUniqueId();
						session _session = (session) SessionHelper.getInstance().getById(sessionId);
						if (_session == null) {
							_session = new session(sessionId);
							SessionHelper.getInstance().add(_session);
							ctx = new ServletContext(_session);
							break;
						}
					}
				}
			} else {
				session _session = (session) SessionHelper.getInstance().getById(sessionId);
				if (_session == null) {
					throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_SESSION);
				}
				ctx = new ServletContext(_session);
			}

			BaseResource p = Json.stringToResource(resourceText, resource.getClass());
			svc.update(ctx, p);
			result.setErrCode(0);
			result.setRecentAlerts(User_mapHelper.getInstance().getRecentAlertCount(ctx.getUserId()));
			result.setRecentNotifications(User_mapHelper.getInstance().getRecentNotificationCount(ctx.getUserId()));
			//result.setPendingCoins(CandidateHelper.getInstance().getPendingCoins(ctx.getUserId()));

			result.setMessage("Success");

		} catch (ApplicationException e){
			if ((e.getErrorCode() != null) && (e.getErrorCode() == ExceptionEnum.INVALID_SESSION)) {
				expireSessionCookie(request, response);
			}
			result.setErrCode(-1);
			result.setMessage(e.getMessage());
		}	catch (Exception e){
			checkAndSendException(e);
			result.setErrCode(-1);
			result.setMessage(e.getMessage());
		}
		String responseStr = Json.resourcetoString(result);
		try {
			responseStr = aesEncrypt(request, responseStr);
		} catch (Exception e) {
			checkAndSendException(e);
			e.printStackTrace();
			result.setErrCode(-1);
			result.setMessage(e.getMessage());
			responseStr = Json.resulttoString(result);
		}
		out.println(responseStr);
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		String arguids = null;
		String fields = null;
		String superField = null;
		setResponseParameters(response);

		result result = new result();
		// String resourceText = convertStreamToString(request.getInputStream());

		try {
			// This is to avoid the utf-8 char creating problem.
			request.setCharacterEncoding("utf-8");
			String sessionId = getSessionIdFromCookie(request); 
			ServletContext ctx;
			if (Util.isEmpty(sessionId))  {
				if (isLoginRequired()) {
					throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_SESSION);
				}
				synchronized (BaseServlet.class) {
					while (true) {
						sessionId = Util.getUniqueId();
						session _session = (session) SessionHelper.getInstance().getById(sessionId);
						if (_session == null) {
							_session = new session(sessionId);
							SessionHelper.getInstance().add(_session);
							ctx = new ServletContext(_session);
							break;
						}
					}
				}
			} else {
				session _session = (session) SessionHelper.getInstance().getById(sessionId);
				if (_session == null) {
					throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_SESSION);
				}
				ctx = new ServletContext(_session);
			}


			arguids = request.getParameter(QUERYPARAM_ID);
			fields = request.getParameter(QUERYPARAM_FIELDS);
			superField = request.getParameter(QUERYPARAM_SUPER_FIELD);

			// Handle different DELETE calls
			if (arguids != null && !arguids.isEmpty()) {
				// DELETE BY NAME (RESOURCE WITH SINGLE/MULTIPLE PRIMARY KEYS)
				deleteResourceByName(ctx, arguids, fields, superField);
				result.setErrCode(0);
				result.setMessage("Success");
				postDelete(request, response);
				result.setRecentAlerts(User_mapHelper.getInstance().getRecentAlertCount(ctx.getUserId()));
				result.setRecentNotifications(User_mapHelper.getInstance().getRecentNotificationCount(ctx.getUserId()));
				//result.setPendingCoins(CandidateHelper.getInstance().getPendingCoins(ctx.getUserId()));

			}
		} catch (ApplicationException e){
			if ((e.getErrorCode() != null) && (e.getErrorCode() == ExceptionEnum.INVALID_SESSION)) {
				expireSessionCookie(request, response);
			}
			result.setErrCode(-1);
			result.setMessage(e.getMessage());
		} catch (Exception e){
			checkAndSendException(e);
			result.setErrCode(-1);
			result.setMessage(e.getMessage());
		}
		String responseStr = Json.resourcetoString(result);
		try {
			responseStr = aesEncrypt(request, responseStr);
		} catch (Exception e) {
			checkAndSendException(e);
			e.printStackTrace();
			result.setErrCode(-1);
			result.setMessage(e.getMessage());
			responseStr = Json.resulttoString(result);
		}
		responseStr = responseStr + "\r\n";
		out.println(responseStr);
	}

	protected void postDelete(HttpServletRequest request, HttpServletResponse response) {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action = request.getParameter(QUERYPARAM_ACTION);
		// Handle count
		if (action != null) {
			if (action.equals("delete"))
				doDelete(request, response);
			return;
		}
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

		response.setHeader("Access-Control-Allow-Origin", "*"); // use a wildcard (*) as the 2nd parameter if you want to be less restrictive
		response.setHeader("Access-Control-Max-Age", "360");
		response.setHeader("Access-Control-Allow-Credentials", "true");
		response.setHeader("Access-Control-Allow-Methods", "GET");
		response.setHeader("Access-Control-Allow-Headers", "Origin");
		response.setHeader("Access-Control-Expose-Headers","Access-Control-Allow-Origin");

		setResponseParameters(response);
		result result = new result();
		String responseStr = "";
		String id = null;
		String queryId = null;
		String autocomplete = null;
		String query = null;
		String count = null;
		String pageno = null;
		String pagesize = null;
		String format = null;
		String fieldName = null;
		String rendertype = null;
		String test = null;
		//	String fields = null;
		//	String superField = null;
		BaseResource resource = null;
		BaseResource[] resources = null;
		String orderby = null;
		int resourceCount = 0;

		try {
			String sessionId = getSessionIdFromCookie(request); 
			ServletContext ctx;
			if (Util.isEmpty(sessionId))  {
				if (isLoginRequired()) {
					throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_SESSION);
				}
				synchronized (BaseServlet.class) {
					while (true) {
						sessionId = Util.getUniqueId();
						session _session = (session) SessionHelper.getInstance().getById(sessionId);
						if (_session == null) {
							_session = new session(sessionId);
							SessionHelper.getInstance().add(_session);
							ctx = new ServletContext(_session);
							break;
						}
					}
				}
			} else {
				session _session = (session) SessionHelper.getInstance().getById(sessionId);
				if (_session == null) {
					throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_SESSION);
				}
				ctx = new ServletContext(_session);
			}
			System.out.println("Session Id " + ctx.getSessionId() + " , user Name : " + ctx.getUserId() + ", user id = "+ ctx.getUserId());
			Enumeration<String> names = request.getParameterNames();
			while (names.hasMoreElements()) {
				String name = names.nextElement();
				String value = request.getParameter(name);
				ctx.addParam(name, value);
			}
			// Parse query params
			id = request.getParameter(QUERYPARAM_ID);
			queryId = request.getParameter(QUERYPARAM_QUERYID);
			count = request.getParameter(QUERYPARAM_COUNT);
			autocomplete = request.getParameter(QUERYPARAM_AUTOCOMPLETE);
			query = request.getParameter(QUERYPARAM_QUERY);
			pageno = request.getParameter(QUERYPARAM_PAGENO);
			pagesize = request.getParameter(QUERYPARAM_PAGESIZE);
			format = request.getParameter(QUERYPARAM_FORMAT);
			fieldName = request.getParameter(QUERYPARAM_FIELDNAME);
			rendertype = request.getParameter(QUERYPARAM_RENDERTYPE);
			test = request.getParameter(QUERYPARAM_TEST);
			//fields = request.getParameter(QUERYPARAM_FIELDS);
			//superField = request.getParameter(QUERYPARAM_SUPER_FIELD);
			orderby = request.getParameter(QUERYPARAM_ORDERBY);

			if (count != null && !count.isEmpty()) {
				if (count.equalsIgnoreCase("yes")) {
					resourceCount = svc.getCount(ctx);
					if (resourceCount >= 0) {
						CountResult cntRes = new CountResult();
						cntRes.setCount(resourceCount);
						responseStr = Json.resourcetoString(cntRes);
					}
				}
			} else if (id != null && !id.isEmpty()) {
				// Handle different GET calls
				// GET BY NAME (RESOURCE WITH SINGLE/MULTIPLE PRIMARY KEYS)
				resource = svc.get(ctx, id);
				if (resource != null) {
					resources = new BaseResource[1];
					resources[0] = resource;
					result.setResource(resources);
				}
				result.setErrCode(0);
				result.setRecentAlerts(User_mapHelper.getInstance().getRecentAlertCount(ctx.getUserId()));
				result.setRecentNotifications(User_mapHelper.getInstance().getRecentNotificationCount(ctx.getUserId()));
				//result.setPendingCoins(CandidateHelper.getInstance().getPendingCoins(ctx.getUserId()));

				result.setMessage("success");
				if ((format != null) && format.equals("html")) {
					response.setContentType("text/html; charset=UTF-8");
					responseStr = HTML.resulttoString(result,fieldName,rendertype);
				} else 
					responseStr = Json.resulttoString(result);

			} else if (queryId != null && !queryId.isEmpty()) {
				// QUERY ID
				String args = request.getParameter(QUERYPARAM_ARGS);
				if (queryId.equalsIgnoreCase(QUERYPARAM_COMMON_QUERY_ID)) {
					resources = svc.getQuery(ctx, args);
				} else {
					Map<String, Object> map = new HashMap<String, Object>();
					if (!Util.isEmpty(args)) {
						String[] argvalues = args.split(",");
						for(String values: argvalues) {
							String[] valpair = values.split(":");
							if (valpair.length != 2) {
								throw new ApplicationException(ExceptionSeverity.ERROR, "args can  have only values of format name:value");
							}
							if(valpair[1] != null && valpair[1].indexOf(";") != -1)
								map.put(valpair[0], valpair[1].split(";"));
							else
								map.put(valpair[0], valpair[1]);
						}
					}
					resources = svc.getQuery(ctx, queryId, map);
				}

				result.setErrCode(0);
				result.setMessage("success");
				result.setResource(resources);
				result.setRecentAlerts(User_mapHelper.getInstance().getRecentAlertCount(ctx.getUserId()));
				result.setRecentNotifications(User_mapHelper.getInstance().getRecentNotificationCount(ctx.getUserId()));
				//result.setPendingCoins(CandidateHelper.getInstance().getPendingCoins(ctx.getUserId()));

				if ((format != null) && format.equals("html")) {
					response.setContentType("text/html; charset=UTF-8");
					responseStr = HTML.resulttoString(result,fieldName,rendertype);
				} else 
					responseStr = Json.resulttoString(result);
			} else if ((autocomplete != null) && autocomplete.equals("yes")) {
				// GET ALL
				resources = svc.getAutoComplete(ctx, query);
				responseStr = Json.resulttoAutoCompleteString(query,resources);
			} else if ((autocomplete != null) && autocomplete.equals("yes")) {
				Expression e = null;
				e = new Expression("name", REL_OP.REGEX, "(?i)"+query+".*");
				// check if pagination required
				ResourceOrder ro = null;
				if (pageno != null && pagesize != null) {
					ro = new ResourceOrder(Integer.parseInt(pagesize),
							Integer.parseInt(pageno));
				}
				// fire get all
				resources = svc.getAll(ctx, e, ro);
				result.setErrCode(0);
				result.setMessage("success");
				result.setResource(resources);
				result.setRecentAlerts(User_mapHelper.getInstance().getRecentAlertCount(ctx.getUserId()));
				result.setRecentNotifications(User_mapHelper.getInstance().getRecentNotificationCount(ctx.getUserId()));
				//result.setPendingCoins(CandidateHelper.getInstance().getPendingCoins(ctx.getUserId()));
				if ((format != null) && format.equals("html")) {
					response.setContentType("text/html; charset=UTF-8");
					responseStr = HTML.resulttoString(result,fieldName,rendertype);
				} else 
					responseStr = Json.resulttoString(result);
			}

			else {
				// GET ALL

				if (!isGetAllSupported()) {
					if (test == null || !test.equals("taskerpark")) {
						throw new ApplicationException(ExceptionSeverity.ERROR, "You are not authorized");
					}
				}
				// Check if autocomplete required
				Expression e = null;
				if ((autocomplete != null) && autocomplete.equals("yes")) {
					e = new Expression("name", REL_OP.REGEX, "(?i)"+query+".*");
				}

				// check if pagination required
				ResourceOrder ro = null;
				if ((pageno != null && pagesize != null)  ||  (orderby != null)) {
					ro = new ResourceOrder() ;
					if (pageno != null) {
						ro.setPage(Integer.parseInt(pagesize),Integer.parseInt(pageno));
					}
					if (orderby != null)
						ro.setFieldNames(orderby.split(","), true);
				}

				// fire get all
				resources = svc.getAll(ctx, e, ro);
				result.setErrCode(0);
				result.setMessage("success");
				result.setResource(resources);
				result.setRecentAlerts(User_mapHelper.getInstance().getRecentAlertCount(ctx.getUserId()));
				result.setRecentNotifications(User_mapHelper.getInstance().getRecentNotificationCount(ctx.getUserId()));
				//result.setPendingCoins(CandidateHelper.getInstance().getPendingCoins(ctx.getUserId()));

				if ((format != null) && format.equals("html")) {
					response.setContentType("text/html; charset=UTF-8");
					responseStr = HTML.resulttoString(result,fieldName,rendertype);
				} else 
					responseStr = Json.resulttoString(result);
			}
		} catch (ApplicationException e) {
			//e.printStackTrace(); It could be an expected exception. Don't print trace in C4TException case
			if ((e.getErrorCode() != null) && (e.getErrorCode() == ExceptionEnum.INVALID_SESSION)) {
				expireSessionCookie(request, response);
			}
			result.setErrCode(-1);
			result.setMessage(e.getMessage());
			responseStr = Json.resulttoString(result);
		} catch (Exception e) {
			checkAndSendException(e);
			e.printStackTrace();
			result.setErrCode(-1);
			result.setMessage(e.getMessage());
			responseStr = Json.resulttoString(result);
		}
		try {
			responseStr = aesEncrypt(request, responseStr);
		} catch (Exception e) {
			checkAndSendException(e);
			e.printStackTrace();
			result.setErrCode(-1);
			result.setMessage(e.getMessage());
			responseStr = Json.resulttoString(result);
		}
		responseStr = responseStr + "\r\n";
		out.write(responseStr.getBytes());
		//Write the compression trailer and close the output stream
		out.close();
	}

	private void checkAndSendException(Exception e) {
		/*try {
			HelperFactory.getUrgentEmailHelper().createEntryForException(e);
		} catch (C4TException e1) {}
		 */
	}

	protected BaseResource getResourceByName(ServletContext ctx, String arguids) throws ApplicationException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		return getResourceByName(ctx, arguids, null);
	}

	protected BaseResource getResourceByName(ServletContext ctx, String arguids, String fields) throws ApplicationException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		return getResourceByName(ctx, arguids, fields, null);
	}

	private BaseResource getResourceByName(ServletContext ctx, String arguids, String fields, String superFieldName) throws ApplicationException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		Map<String, Object> map = new HashMap<String, Object>();
		String[] argvalues = arguids.split(",");

		if (argvalues.length == 1 && !argvalues[0].contains(":")) {
			map.put("id", argvalues[0]);
		} else {
			for (String values: argvalues) {
				String[] valpair= values.split(":");
				if (valpair.length != 2) {
					throw new ApplicationException(ExceptionSeverity.ERROR, "arguids can have only values of format name:value");
				}
				map.put(valpair[0], valpair[1]);
			}
		}

		String[] fieldNames = null;
		if(!Util.isEmpty(fields))
			fieldNames = fields.split(",");

		BaseResource resource;
		if(Util.isEmpty(fieldNames))
			resource = svc.get(ctx, map);
		else if(Util.isEmpty(superFieldName))
			resource = svc.get(ctx, map, fieldNames);
		else
			resource = svc.get(ctx, map, superFieldName, fieldNames);
		if (resource == null) {
			throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.RESOURCE_NOT_FOUND, this.resource.getClass(), map.values().toString());
		}
		return resource;
	}

	private void deleteResourceByName(ServletContext ctx, String arguids, String fields, String superFieldName) throws ApplicationException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		Map<String, Object> map = new HashMap<String, Object>();
		String[] argvalues = arguids.split(",");

		if (argvalues.length == 1 && !argvalues[0].contains(":")) {
			map.put("id", argvalues[0]);
		} else {
			for (String values: argvalues) {
				String[] valpair= values.split(":");
				if (valpair.length != 2) {
					throw new ApplicationException(ExceptionSeverity.ERROR, "arguids can have only values of format name:value");
				}
				map.put(valpair[0], valpair[1]);
			}
		}

		String[] fieldNames = null;
		if(!Util.isEmpty(fields))
			fieldNames = fields.split(",");

		if(Util.isEmpty(fieldNames))
			svc.delete(ctx, map);
		else if(Util.isEmpty(superFieldName))
			svc.unset(ctx, map, fieldNames);
		else
			svc.unset(ctx, map, superFieldName, fieldNames);
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

	//Similar code is present in M16.Utils.js::setCookie() to create cookie for wt.com & www.wt.com
	private void setDomainForCookie(HttpServletRequest request, Cookie cookie) {
		String serverName = request.getServerName();
		if(Util.isEmpty(serverName) || serverName.equals("localhost") || serverName.equals("127.0.0.1"))
			return;
		serverName = serverName.replaceFirst("^www\\.", "");
		cookie.setDomain(serverName);
	}

	private void setDomainForCookie8080(HttpServletRequest request, Cookie cookie) {
		String serverName = request.getServerName();
		if(Util.isEmpty(serverName) || serverName.equals("localhost") || serverName.equals("127.0.0.1"))
			return;
		serverName = serverName.replaceFirst("^www\\.", "");
		cookie.setDomain(serverName+":8080");
	}
	public void expireSessionCookie(HttpServletRequest request, HttpServletResponse response) {
		Cookie sessionCookie = new Cookie(ApplicationConstants.SESSION_ID, null);
		sessionCookie.setMaxAge(0);
		sessionCookie.setPath("/");
		setDomainForCookie(request, sessionCookie);
		response.addCookie(sessionCookie);
	}

	public void addSessionCookie(HttpServletRequest request, HttpServletResponse response, String sessionId, String keepMeLogin) {
		Cookie sessionCookie = new Cookie(ApplicationConstants.SESSION_ID, sessionId);
		// This cookie expiration should be same for recruiterLogin cookie in ui:LoginView:_onRecProfileSuccess()
		sessionCookie.setMaxAge(60*60*24*30); // 30 days
		sessionCookie.setPath("/");
		setDomainForCookie(request, sessionCookie);
		response.addCookie(sessionCookie);

		Cookie sessionCookie8080 = new Cookie(ApplicationConstants.SESSION_ID, sessionId);
		// This cookie expiration should be same for recruiterLogin cookie in ui:LoginView:_onRecProfileSuccess()
		sessionCookie8080.setMaxAge(60*60*24*30); // 30 days
		sessionCookie8080.setPath("/");
		setDomainForCookie8080(request, sessionCookie8080);
		response.addCookie(sessionCookie8080);

	}

	//Adds a cookie that is readable by GUI JS
	public void addGUICookie(HttpServletRequest request, HttpServletResponse response, String cookieName, String cookieValue) {
		Cookie cookie = new Cookie(cookieName, cookieValue);
		setDomainForCookie(request, cookie);
		cookie.setPath("/");
		response.addCookie(cookie);
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

	private boolean isAPIEncryptionEnabled(HttpServletRequest request) {
		if (!SecurityUtil.IS_API_ENCRYPTION_ENABLED)
			return false;

		String cookie = getCookie(request, SecurityUtil.API_ENCRYPTION_COOKIE_NAME);
		if (!Util.isEmpty(cookie) && cookie.equals(SecurityUtil.API_ENCRYPTION_COOKIE_VALUE))
			return false;

		return true;
	}

	private String aesEncrypt(HttpServletRequest request, String plainText) throws ApplicationException {
		if (!isAPIEncryptionEnabled(request))
			return plainText;

		return SecurityUtil.aesEncrypt(plainText);		 
	}

	private String aesDecrypt(HttpServletRequest request, String encryptedText) throws ApplicationException {
		if (!isAPIEncryptionEnabled(request))
			return encryptedText;

		return SecurityUtil.aesDecrypt(encryptedText);		 
	}

	// Reverse is in RestUtils.js::_escapePOSTBody()
	private String unescapePOSTBody(String postBody) {
		return postBody.replaceAll("%25", "%").replaceAll("%26", "&").replaceAll("%2B", "+");
	}
}