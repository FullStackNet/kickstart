package platform.protocol.v3;

import platform.message.MessageManager;
import platform.protocol.ProtocolProvider;


public class V3ProtocolProvider  extends ProtocolProvider{
	public static int MAX_MESSAGE_LENGTH = 4096;
	public static int HEADER_SIZE = 14;
	public static char START_CHAR = '#';
	public static char END_CHAR = '@';
	
	public V3ProtocolProvider(String sender,String receiver,MessageManager messageManager) {
		super(new V3Reader(sender,receiver), new V3Writer(receiver,sender), messageManager);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ProtocolProvider getClone() {
		// TODO Auto-generated method stub
		return this;
	}
	
}
