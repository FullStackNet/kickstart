package platform.webservice.ui.component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.definition.Field;
import platform.webservice.ui.definition.GraphLineDefinition;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.html.JS;
import platform.webservice.ui.html.TEXT;
import platform.webservice.ui.util.UIConstants;


public class BaseLineGraphView extends BaseView {
	UIServletContext mContext;
	GraphLineDefinition mDefinition;
	
	public BaseLineGraphView(UIServletContext ctx) {
		super();
		mContext = ctx;
		mContext.getPageBuilder().addJS(new JS("dygraph-combined.js", "/ui/js"));
	}
	
	public UIServletContext getContext() {
		return mContext;
	}
	
	public void setDefinition(GraphLineDefinition definition) {
		mDefinition = definition;
	}
	
	public void buildUI(ArrayList<Map<String, Object>> list) {
		// TODO Auto-generated method stub
		Div div = new Div();
		div.addAttribute("id",mDefinition.getId());
		div.addAttribute("style","font-size : 10px;width :100%;");
		//div.addAttribute("style","height :100px;width :100px");
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("<script>"
				+ " var data = [] ;\n"
				+ mDefinition.getId()+" = new Dygraph(\n"
				+ "document.getElementById(\""+mDefinition.getId()+"\"),\n");
		
		buffer.append("\"");
		boolean first = true;
		for(int i=0; i < mDefinition.getFields().size(); i++) {
			if (!first)
				buffer.append(",");
			first = false;
			Field field = mDefinition.getFields().get(i);
			buffer.append(field.getName());
		}
		if (list.size() == 0) {
			first = true;
			buffer.append("\\n\"+\n");
			buffer.append("\"");
			for(int j=0; j < mDefinition.getFields().size(); j++) {
				if (!first)
					buffer.append(",");
				first = false;
				buffer.append(0);
			}
		}
		for(int i=0; i < list.size(); i++) {
			buffer.append("\\n\"+\n");
			Map<String, Object> map = list.get(i);
			first = true;
			buffer.append("\"");
			for(int j=0; j < mDefinition.getFields().size(); j++) {
				if (!first)
					buffer.append(",");
				first = false;
				Field field = mDefinition.getFields().get(j);
				Object value = map.get(field.getName());
				if (field.getType().equalsIgnoreCase(UIConstants.DATA_TYPE_TIMESTAMP)) {
					Date date = new Date(Long.parseLong(value.toString()));
					DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					buffer.append(dateFormat.format(date));
				} else {
					buffer.append(value);
				}
			}
		}
	    buffer.append("\",{" +
	    		"legend: 'always'," +
	    		"stepPlot : true ," +
	    		"connectSeparatedPoints : true,"+
	    		"labelsDivWidth : 400," +
	    		" animatedZooms: true,"+
	    		" axisLabelFontSize : 10 ,"+
	    	     "title: '"+mDefinition.getTitle() +"'" +
	    		 "});\n");
	    buffer.append("</script>");
	    TEXT text = new TEXT(buffer.toString());
		div.addChild(text);
		getView().addChild(div);
	}
}
