package platform.webservice.ui.html;

import java.util.ArrayList;

import platform.webservice.ui.definition.IdValue;



public class COMBO {
	SELECT select;
	String hint;
	
	public COMBO(String id,String className, ArrayList<IdValue> list,Object value) {
		select = new SELECT(id,id,className);
		OPTION option = new OPTION();
		option.addAttribute("value","");
		if (hint  == null) {
			option.setText("Select the option");
		} else {
			option.setText(hint);
		}
		select.addChild(option);
		value = ""+value;
		for(int i=0; i< list.size(); i++) {
			option = new OPTION();
			if (list.get(i) == null) continue;
			if (list.get(i).getId() == null) continue;
			if (list.get(i).getValue() == null) continue;
				
			option.addAttribute("value", list.get(i).getId().toString());
			option.setText(list.get(i).getValue().toString());
			String _id = ""+list.get(i).getId();
			if (_id.equals(value)) {
				option.addAttribute("selected", "NO_VALUE");
			}
			select.addChild(option);
		}
	}
	
	public BaseHTMLComponent getView() {
		return select;
	}
}
