package platform.protocol.dc;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;

import platform.communication.Session;
import platform.exception.ExceptionEnum;
import platform.log.ApplicationLogger;
import platform.message.Message;
import platform.message.MessageManager;
import platform.protocol.Reader;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.HexUtils;

public class DCReader extends Reader {
	char startchar;
	public DCReader(char startChar) {
		super();
		this.startchar = startChar;
	}
	
	@Override
	public Message read(Session session, Object _handle, MessageManager messageManager) throws ApplicationException {
		// TODO Auto-generated method stub
		DataInputStream handle = (DataInputStream)_handle;
		int dataLength = 0;
		int misses = 0;
		final int MISSES_ALLOWED = 5; 
		while (true) {
			try {
				//System.out.println("Waiting someone to talk to me ...");
				int ch_int = handle.read();
				if (ch_int == -1) {
					misses++;
					if ((misses < MISSES_ALLOWED) &&  (dataLength > 0))  {
						try {
							Thread.sleep(200);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						continue; 
					}
					ApplicationLogger.info("Connection closed from peer .....",this.getClass());
					throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.PEER_DISCONNECTED, ExceptionEnum.PEER_DISCONNECTED.toString());
				}
				System.out.println(""+ch_int +"["+HexUtils.hexString((byte)ch_int)+"] ");
			} catch (SocketException e) {
				// TODO Auto-generated catch block
				misses++;
				if ((misses < MISSES_ALLOWED) &&  (dataLength > 0)) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					continue;
				}
				e.printStackTrace();
				ApplicationLogger.info("Connection closed from peer .....",this.getClass());
				throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.PEER_DISCONNECTED, ExceptionEnum.PEER_DISCONNECTED.toString());
			} catch (SocketTimeoutException e) {
				misses++;
				if ((misses < MISSES_ALLOWED) &&  (dataLength > 0))  {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					continue; 
				} 
				return null;
			} catch (EOFException e) {
				misses++;
				if ((misses < MISSES_ALLOWED) &&  (dataLength > 0)) continue; 
				return null;
			} catch (IOException e) {
				misses++;
				if ((misses < MISSES_ALLOWED) &&  (dataLength > 0)) continue; 
				e.printStackTrace();
				throw new ApplicationException(ExceptionSeverity.ERROR, ExceptionEnum.PEER_DISCONNECTED, ExceptionEnum.PEER_DISCONNECTED.toString());
			}
		}
	}

	@Override
	public Message readWrite(Session session, Object handle,
			Object writeHandle, MessageManager messageManager)
			throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}
}
