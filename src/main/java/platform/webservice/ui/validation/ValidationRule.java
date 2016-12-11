package platform.webservice.ui.validation;

public abstract class ValidationRule {
	public static int UNIQUE_KEY = 0;
	int type;
	public ValidationRule(int type) {
		this.type = type;
	}
	public int getType() {
		return type;
	}
}
