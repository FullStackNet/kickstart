package platform.helper;

import platform.resource.packet;


public class PacketHelper extends BaseHelper {
	
	public PacketHelper() {
		super(new packet());
		// TODO Auto-generated constructor stub
	}
	private static PacketHelper instance;
	
	public static PacketHelper getInstance() {
		if (instance == null)
			instance = new PacketHelper();
		return instance;
	}
}
