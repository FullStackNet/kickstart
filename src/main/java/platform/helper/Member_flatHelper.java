package platform.helper;

import platform.alert.AlertFactory;
import platform.event.EventManager;
import platform.events.AlertAddedEvent;
import platform.resource.*;
import platform.util.ApplicationException;

import java.util.Date;
import java.util.Map;


public class Member_flatHelper extends BaseHelper {
	public Member_flatHelper(BaseResource resource) {
		super(resource);
		// TODO Auto-generated constructor stub
	}

	private static Member_flatHelper instance;

	public static Member_flatHelper getInstance() {
		if (instance == null)
			instance = new Member_flatHelper();
		return instance;
	}

	Member_flatHelper() {
		super(new member_flat());
		// TODO Auto-generated constructor stub
	}

}
