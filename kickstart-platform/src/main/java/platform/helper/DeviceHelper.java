package platform.helper;

import platform.resource.device;
import platform.util.ApplicationException;


public class DeviceHelper extends BaseHelper {

	public DeviceHelper() {
		super(new device());
		// TODO Auto-generated constructor stub
	}
	private static DeviceHelper instance;

	public static DeviceHelper getInstance() {
		if (instance == null)
			instance = new DeviceHelper();
		return instance;
	}

	public void updateState(String deviceId, String state) throws ApplicationException {
		device _device = new device();
		_device.setId(deviceId);
		_device.setState(state);
		update(_device);
	}

}
