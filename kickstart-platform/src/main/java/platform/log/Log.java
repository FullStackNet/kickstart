package platform.log;

public class Log {
	String severity;
	String module;
	String message;
	long time;
	
	public Log(String module, String severity, String message) {
		this.severity = severity;
		this.module = module;
		this.message = message;
	}
	
	public String getString() {
		return module+"::"+severity+"::"+message;
	}
	
}
