package platform.webservice.ui.definition;

public class Button {
	String label;
	String id;
	boolean confirmationRequired;
	String imageName;
	String className;
	String onClick;
	boolean submit;
	
	public Button(String id, String label) {
		this.id = id;
		this.label = label;
		this.confirmationRequired = false;
		submit = true;
	}
	
	public Button(String id, String label,String imageName) {
		this.id = id;
		this.label = label;
		this.confirmationRequired = false;
		this.imageName = imageName;
		submit = true;
	}
	
	public Button(String id, String label, boolean confirmationRequired) {
		this.id = id;
		this.label = label;
		this.confirmationRequired = confirmationRequired;
		submit = true;
	}
	
	public Button(String id, String label, String imageName, boolean confirmationRequired) {
		this.id = id;
		this.label = label;
		this.confirmationRequired = confirmationRequired;
		this.imageName = imageName;
		submit = true;
	}

	public String getImageName() {
		return imageName;
	}

	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public boolean isConfirmationRequired() {
		return confirmationRequired;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getOnClick() {
		return onClick;
	}

	public void setOnClick(String onClick) {
		this.onClick = onClick;
	}

	public boolean isSubmit() {
		return submit;
	}

	public void setSubmit(boolean submit) {
		this.submit = submit;
	}
}
