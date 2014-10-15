package platform.webservice.ui.definition;

import java.util.ArrayList;
import java.util.List;

public class TwoColumnsBlock {
	String title;
	String id;
	String className;
	
	public String getTitle() {
		return title;
	}

	List<Field>  fields;
	
	public List<Field> getFields() {
		return fields;
	}

	public TwoColumnsBlock(String title) {
		this.title = title;
		fields = new ArrayList<Field>();
	}
	
	public void addField(Field field) {
		fields.add(field);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
