package platform.webservice.ui.html;

import java.util.ArrayList;

import platform.webservice.ui.util.Attribute;

public abstract class BaseHTMLComponent {
	ArrayList<Attribute> attrList;
	ArrayList<BaseHTMLComponent> childList;
	String text;
	
	public BaseHTMLComponent() {
		childList = new ArrayList<BaseHTMLComponent>();
		attrList = new ArrayList<Attribute>();
	}
	
	public void removeAllChild() {
		childList.clear();
	}
	public BaseHTMLComponent(String id,String className) {
		this();
		if (id != null)
			addAttribute(new Attribute("id", id));
		if (className != null)
			addAttribute(new Attribute("class", className));		
	}	
	public BaseHTMLComponent(String id, String name,String className) {
		this(id,className);
		if (name != null)
			addAttribute(new Attribute("name", name));		
	}
	
	public void addAttribute(String name,String value) {
		attrList.add(new Attribute(name, value));
	}
	
	public void addAttribute(Attribute attribute) {
		attrList.add(attribute);
	}
	
	public void addChild(BaseHTMLComponent child) {
		childList.add(child);
	}
	
	abstract public String getTag();
	
	public String getContent(int index) {
		String space = "";
		boolean selfclosing = true;
		if (index >0) {
			for(int i =0; i< index;i++) {
				space = space + "  ";
			}
		}
		StringBuffer buffer = new StringBuffer();
		if (getTag() != null) {
		buffer.append(space+"<"+getTag());
			for(int i=0; i < attrList.size(); i++) {
				if (attrList.get(i).getValue() == "NO_VALUE") {
					buffer.append(" "+attrList.get(i).getName());
				} else
					buffer.append(" "+attrList.get(i).getName()+"=\""+attrList.get(i).getValue()+"\"");
			}
		}
		if ("textarea".equals(getTag())) {
			selfclosing = false;
		}
		if (selfclosing && (getTag() != null) && selfClosing() && (getText() == null) && (childList.size() == 0)) {
			buffer.append(" /> \n");
			return buffer.toString();
		}
		if (!selfclosing && (getTag() != null))
			buffer.append(">\n");
	
		if (getText() != null) {
			if ("textarea".equals(getTag())) {
				buffer.append(getText());
			} else
				buffer.append(space+"\t"+getText()+"\n");
		}
		for(int i=0; i < childList.size(); i++) {
			if (childList.get(i) == null) continue;
			buffer.append(childList.get(i).getContent(index+1));
		}
		if (!selfclosing && getTag() != null) {
			buffer.append(space+"</"+getTag());
			buffer.append("> \n");
		}
		return buffer.toString();
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public boolean selfClosing() {
		return true;
	}
}
