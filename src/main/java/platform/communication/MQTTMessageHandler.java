package platform.communication;

import platform.message.BaseSimpleMessage;

public interface MQTTMessageHandler {
	public void process(BaseSimpleMessage message) throws platform.util.ApplicationException;
}
