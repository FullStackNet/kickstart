package platform.helper;

import platform.resource.customer;
import platform.util.ApplicationException;

public class Test {
	void test() {
		customer _customer = new customer("1");
		_customer.setName("abc");
		try {
			CustomerHelper.getInstance().add(_customer);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
