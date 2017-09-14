package platform.protocol;

import platform.communication.Session;
import platform.message.Message;
import platform.util.ApplicationException;

public abstract class Writer {
	public abstract void write(Session session, Object handle, Message message) throws ApplicationException;
}
