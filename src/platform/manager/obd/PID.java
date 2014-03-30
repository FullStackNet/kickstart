package platform.manager.obd;

import platform.util.HexUtils;


public class PID {
	byte mode;
	byte command;
	String description;
	
	String formula;
	boolean supported;
	Object value;
	
	public static String key(byte mode,byte command) {
		return HexUtils.hexString(mode)+"-"+HexUtils.hexString(command);
	}

	public PID(int mode,int command, String description) {
		this((byte)mode, (byte)command, description);
	}
	
	public String getKey() {
		return HexUtils.hexString(mode)+"-"+HexUtils.hexString(command);
	}
	
	public PID(byte mode,byte command, String description) {
		this.mode = mode;
		this.command = command;
		this.description = description;
		supported = false;
	}
	
	public byte getMode() {
		return mode;
	}
	public void setMode(byte mode) {
		this.mode = mode;
	}
	public byte getCommand() {
		return command;
	}
	public void setCommand(byte command) {
		this.command = command;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFormula() {
		return formula;
	}
	public void setFormula(String formula) {
		this.formula = formula;
	}
	public boolean isSupported() {
		return supported;
	}
	public void setSupported(boolean supported) {
		this.supported = supported;
	}
	
	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
}
