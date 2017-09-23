package platform.protocol;

import platform.communication.Session;
import platform.message.Message;
import platform.message.MessageManager;
import platform.util.ApplicationException;

public abstract class Reader {
	public abstract Message read(Session session, Object handle, MessageManager messageManager) throws ApplicationException;	
	public abstract Message readWrite(Session session, Object handle,Object writeHandle, MessageManager messageManager) throws ApplicationException;	
	public boolean isOk2Exit() {
		return true;
	}
}
