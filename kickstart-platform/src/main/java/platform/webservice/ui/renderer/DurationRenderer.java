package platform.webservice.ui.renderer;

import java.util.Map;

import platform.util.TimeUtil;
import platform.util.Util;
import platform.webservice.ui.definition.Field;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.SPAN;

public class DurationRenderer extends BaseRenderer {
	public static String INPUT_UNIT_MSEC = "MSEC" ;
	public static String INPUT_UNIT_SEC = "SEC" ;
	public static String INPUT_UNIT_MINUTE = "MIN" ;

	String unit;
	public DurationRenderer() {
		unit = INPUT_UNIT_MSEC;
	}
	public DurationRenderer(String unit) {
		this.unit = unit;
	}

	@Override
	public BaseHTMLComponent render(Field field, String value,String refreshKey) {
		// TODO Auto-generated method stub
		if (Util.isEmpty(value)) {
			SPAN span = new SPAN(field.getName()+"_"+refreshKey,field.getClassName());
			span.addAttribute("data-renderer","DURATION");
			span.setText("-");
			return span;
		}
		if (unit.equals(INPUT_UNIT_SEC)) 
			value = TimeUtil.getDurationString(Long.parseLong(value)*1000L);
		else if(unit.equals(INPUT_UNIT_MINUTE))
			value = TimeUtil.getDurationString(Long.parseLong(value)*1000L*60L);
		else 
			value = TimeUtil.getDurationString(Long.parseLong(value));

		SPAN span = new SPAN(field.getName()+"_"+refreshKey,field.getClassName());
		span.addAttribute("data-renderer","DURATION");
		span.setText(value);
		return span;
	}

	@Override
	public BaseHTMLComponent render(Field field, Map<String, Object> data) {
		// TODO Auto-generated method stub
		String value = "";
		if (data.get(field.getName()) != null) {
			value = data.get(field.getName()).toString();

		}
		if (Util.isEmpty(value)) {
			SPAN span = new SPAN(field.getName(),field.getClassName());
			span.addAttribute("data-renderer","DURATION");
			span.setText("-");
			return span;
		}
		if (unit.equals(INPUT_UNIT_SEC)) 
			value = TimeUtil.getDurationString(Long.parseLong(value)*1000L);
		else if(unit.equals(INPUT_UNIT_MINUTE))
			value = TimeUtil.getDurationString(Long.parseLong(value)*1000L*60L);
		else 
			value = TimeUtil.getDurationString(Long.parseLong(value));

		SPAN span = new SPAN(field.getName(),field.getClassName());
		span.addAttribute("data-renderer","DURATION");
		span.setText(value);
		return span;
	}

}
