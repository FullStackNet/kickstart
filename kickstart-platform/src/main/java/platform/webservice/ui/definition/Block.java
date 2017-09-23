package platform.webservice.ui.definition;

import java.util.ArrayList;
import java.util.List;

public class Block {
	public static int DISPLAY_HORIZONTAL = 1;
	public static int DISPLAY_VERTICAL = 2;
	
	String title;
	String id;
	String className;
	int display;
	int columns;
	
	
	public boolean isHorizontalDisplay() {
		if (display == DISPLAY_HORIZONTAL) {
			return true;
		}
		return false;
	}
	
	public int getDisplay() {
		return display;
	}

	public void setDisplay(int display) {
		this.display = display;
	}

	public String getTitle() {
		return title;
	}

	List<Field>  fields;
	
	public List<Field> getFields() {
		return fields;
	}
	public Block(String id,String title) {
		this(title);
		this.id = id;
	}
	public Block(String title) {
		this.title = title;
		fields = new ArrayList<Field>();
		display = DISPLAY_VERTICAL;
		columns = 3;
	}
	
	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
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
	
	public int getFieldCount() {
		return fields.size();
	}
}
