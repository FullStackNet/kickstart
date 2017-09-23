package platform.protocol.obd;

import platform.message.MessageManager;
import platform.protocol.ProtocolProvider;


public class OBDProtocolProvider  extends ProtocolProvider{
	public static int MAX_MESSAGE_LENGTH = 256;
	
	public OBDProtocolProvider(char readStartChar,char writeStartChar, MessageManager messageManager) {
		super(new OBDReader(readStartChar), new OBDWriter(writeStartChar), messageManager);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ProtocolProvider getClone() {
		// TODO Auto-generated method stub
		return this;
	}
	
}
