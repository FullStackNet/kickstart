package platform.protocol.dc;

import platform.message.MessageManager;
import platform.protocol.ProtocolProvider;

public class DCProtocolProvider  extends ProtocolProvider{
	public static int MAX_MESSAGE_LENGTH = 256;
	
	public DCProtocolProvider(char readStartChar,char writeStartChar, MessageManager messageManager) {
		super(new DCReader(readStartChar), new DCWriter(writeStartChar), messageManager);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ProtocolProvider getClone() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
