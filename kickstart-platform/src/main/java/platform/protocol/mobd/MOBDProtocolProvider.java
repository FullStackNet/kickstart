package platform.protocol.mobd;

import platform.message.MessageManager;
import platform.protocol.ProtocolProvider;

public class MOBDProtocolProvider  extends ProtocolProvider{
	public static int MAX_MESSAGE_LENGTH = 256;
	
	public MOBDProtocolProvider(char readStartChar,char writeStartChar, MessageManager messageManager) {
		super(new MOBDReader(readStartChar), new MOBDWriter(writeStartChar), messageManager);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ProtocolProvider getClone() {
		// TODO Auto-generated method stub
		return this;
	}
	
}
