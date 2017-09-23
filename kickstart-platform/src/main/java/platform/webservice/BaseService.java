package platform.webservice;

import java.util.Map;

import platform.db.Expression;
import platform.db.ResourceOrder;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;


public abstract class BaseService {
	protected String BaseResourceClass;
	protected BaseHelper helper;
	
	public BaseService(BaseResource BaseResource) {
		this.BaseResourceClass = BaseResource.getClass().toString();
	}
	
	public BaseHelper getHelper() {
		return helper;
	}
	
	public BaseService(BaseHelper helper, BaseResource BaseResource) {
		if (helper != null)
			this.helper = helper;
		this.BaseResourceClass = BaseResource.getClass().toString();
	}
	
	public void add(ServletContext ctx, BaseResource BaseResource) throws ApplicationException {
		if (helper != null)
			helper.add(BaseResource);
	}
	
	
	public void add(ServletContext ctx, String jsonString) throws ApplicationException {
		throw new ApplicationException(ExceptionSeverity.ERROR, "Not Supported");
	}
	
	public void add(ServletContext ctx, BaseResource[] resources) throws ApplicationException {
		throw new ApplicationException(ExceptionSeverity.ERROR, "Not Supported");
	}

	public void update(ServletContext ctx, BaseResource BaseResource) throws ApplicationException {
		throw new ApplicationException(ExceptionSeverity.ERROR, "Not Supported");
	}

	public BaseResource[] getAll(ServletContext ctx) throws ApplicationException {
		if (helper != null)
			return helper.getAll();
		return null;
	}

	public BaseResource[] getAll(ServletContext ctx, Expression e) throws ApplicationException {
		/*if (helper != null)
			return helper.getAll(e);
		*/
		throw new ApplicationException(ExceptionSeverity.ERROR, "Not Supported");
	}

	public BaseResource[] getAll(ServletContext ctx, ResourceOrder o) throws ApplicationException {
		throw new ApplicationException(ExceptionSeverity.ERROR, "Not Supported");
	}

	public BaseResource[] getAll(ServletContext ctx, Expression e, ResourceOrder o) throws ApplicationException {
		throw new ApplicationException(ExceptionSeverity.ERROR, "Not Supported");
	}
	
	
	
	public int getCount(ServletContext ctx) throws ApplicationException {
		throw new ApplicationException(ExceptionSeverity.ERROR, "Not Supported");
	}
	
	public BaseResource get(ServletContext ctx, String uid) {
		if (helper != null)
			return helper.getById(uid);
		return null;
	}
	

	public BaseResource get(ServletContext ctx, Map<String, Object> map) throws ApplicationException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		return null;
	}
	
	public BaseResource get(ServletContext ctx, Map<String, Object> map, String[] fieldNames) throws ApplicationException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		return null;
	}
	
	public BaseResource get(ServletContext ctx, Map<String, Object> map, String fieldName, String[] subFieldNames) throws ApplicationException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		return null;
	}
	
	public void unset(ServletContext ctx, Map<String, Object> map, String[] fieldNames) throws ApplicationException, InstantiationException, IllegalAccessException, ClassNotFoundException {
			/*BaseResource r = (BaseResource) Class.forName(resourceClass).newInstance();
			r.convertTypeUnsafePrimaryMapToResource(map);
			helper.unset(r, false, fieldNames);
			*/
	}
	
	public void unset(ServletContext ctx, Map<String, Object> map, String fieldName, String[] fieldNames) throws ApplicationException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		/*if (model != null) {
			Resource r = (Resource) Class.forName(resourceClass).newInstance();
			r.convertTypeUnsafePrimaryMapToResource(map);
			model.unset(r, false, fieldName, fieldNames);
		}*/
	}
	
	public void delete(ServletContext ctx, Map<String, Object> map) throws ApplicationException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		/*if (model != null) {
			Resource r = (Resource) Class.forName(resourceClass).newInstance();
			r.convertTypeUnsafePrimaryMapToResource(map);
			model.delete(r, false);
		}*/
	}

	public void action(ServletContext ctx, BaseResource resource,String action) throws ApplicationException {
		throw new ApplicationException(ExceptionSeverity.ERROR, "resource :: Not Supported");
	}

	public void action(ServletContext ctx, String resourceText, String action) throws ApplicationException {
		throw new ApplicationException(ExceptionSeverity.ERROR, "String :: Not Supported");
	}
	
	public BaseResource[] getQuery(ServletContext ctx, String expression) throws ApplicationException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		return null;
	}
	
	public BaseResource[] getQuery(ServletContext ctx, String queryId, Map<String, Object> map) throws ApplicationException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		throw new ApplicationException(ExceptionSeverity.ERROR, "getQuery at Base Service not implemented");
	}
	
	public BaseResource[] getAutoComplete(ServletContext ctx,String query) throws ApplicationException {
		/*Expression e = new Expression("name", REL_OP.REGEX, "(?i)"+query+".*");
		return getAll(ctx, e);*/
		return null;
	}
}