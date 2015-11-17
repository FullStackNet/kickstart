package platform.manager;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.SerializationUtils;

import platform.message.BaseSimpleMessage;
import platform.util.ApplicationException;
import platform.util.Json;

public class SimpleMessageManager {
	Map<String, BaseSimpleMessage> map;
	private static SimpleMessageManager instance;
	
	SimpleMessageManager() {
		map = new HashMap<String, BaseSimpleMessage>();
	}
	public static SimpleMessageManager getInstance() {
		if (instance == null) {
			instance = new SimpleMessageManager();
		}
		return instance;
	}
	
	public void register(BaseSimpleMessage message) {
		map.put(message.getId(), message);
	}
	
	public BaseSimpleMessage convertString2Message(String messageString) throws ApplicationException {
		BaseSimpleMessage message = Json.stringToObject(messageString, BaseSimpleMessage.class);
		BaseSimpleMessage actualMessage = (BaseSimpleMessage) SerializationUtils.clone(map.get(message.getId()));
		actualMessage = Json.stringToObject(messageString, actualMessage.getClass());
		return actualMessage;
	}

	public String convertMessage2string(BaseSimpleMessage message) throws ApplicationException {
		return Json.objecttoString(message);
	}
}
