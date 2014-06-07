package platform.webservice.service;

import java.util.Map;

import platform.exception.ExceptionEnum;
import platform.helper.FeedbackHelper;
import platform.helper.UserHelper;
import platform.resource.BaseResource;
import platform.resource.feedback;
import platform.resource.location;
import platform.resource.user;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;
import platform.webservice.WebServiceContants;

public class FeedbackService extends BaseService{
	public FeedbackService() {
		super(FeedbackHelper.getInstance(),new feedback());
	}

	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		user _user = (user)UserHelper.getInstance().getById(ctx.getUserId());
		if (_user == null) {
			throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_USER);
		}
		feedback _resource = (feedback) resource;
		_resource.setUser_id(ctx.getUserId());
		_resource.setMobile_no(_user.getMobile_no());
		_resource.setEmail_id(_user.getEmail_id());
		_resource.setUser_name(_user.getName());
		getHelper().add(_resource);
	}
	
	public void action(ServletContext ctx, BaseResource resource,String action) throws ApplicationException {
		if (action.equalsIgnoreCase(WebServiceContants.OPERATION_MODIFY)) {
			location _resource = (location) resource;
			_resource.setName(_resource.getAddress()+","+
					_resource.getStreat()+","+_resource.getArea()+","+
					_resource.getCity()+","+_resource.getState()+
					","+_resource.getCountry()+","+_resource.getPinCode());
			update(ctx, _resource);
		}
	}
	public void update(ServletContext ctx, BaseResource resource) throws ApplicationException {
		getHelper().update(resource);
	}
	
	public BaseResource[] getQuery(ServletContext ctx, String queryId, Map<String, Object> map) throws ApplicationException {
		throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.INVALID_QUERY);
	}
}
