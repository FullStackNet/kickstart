package platform.webservice.service;

import platform.helper.CustomerHelper;
import platform.helper.UserHelper;
import platform.resource.BaseResource;
import platform.resource.customer;
import platform.resource.register;
import platform.resource.user;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.Util;
import platform.webservice.BaseService;
import platform.webservice.ServletContext;

public class RegisterService extends BaseService{
	public RegisterService() {
		super(new register());
	}
	
	public void add(ServletContext ctx, BaseResource resource) throws ApplicationException {
		register _register = (register) resource;
		if (UserHelper.getInstance().isExistsByEmailId(_register.getEmail_id()))
			throw new ApplicationException(ExceptionSeverity.ERROR, "Email Id already registered ...");
		customer _customer = new customer();
		_customer.setName(_register.getFirst_name()+" "+_register.getLast_name());
		_customer.setEmailId(_register.getEmail_id());
		_customer.setMobile_no(_register.getMobile_no());
		_customer.setCity(_register.getCity());
		_customer.setState(_register.getState());
		_customer.setCountry(_register.getCountry());
		//_customer.setAddress1(_register.getA);
		//_customer.setAddress2(_register.getA);
		//_customer.setAddress3(_register.getA);
		 CustomerHelper.getInstance().add(_customer);
		 user _user = new user();
		_user.setEmail_id(_register.getEmail_id());
		_user.setName(_register.getName());
		_user.setPassword(Util.doubleMD5(_register.getPassword()));
		_user.setCustomer_id(_customer.getId());
		UserHelper.getInstance().add(_user);
	}	
}
