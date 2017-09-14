package platform.webservice.ui.renderer;

import java.util.Map;

import platform.resource.invite;
import platform.util.TimeUtil;
import platform.webservice.ui.definition.Field;
import platform.webservice.ui.html.A;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.SPAN;
import platform.webservice.ui.html.TEXT;

public class ResendInviteRenderer extends BaseRenderer {

	@Override
	public BaseHTMLComponent render(Field field, String value,String refreshKey) {
		// TODO Auto-generated method stub
		value =  TimeUtil.getStringFromTime(field.getTimeZone(),Long.parseLong(value));
		SPAN span = new SPAN(field.getName()+"_"+refreshKey,field.getClassName());
		span.addAttribute("data-renderer","TIME");
		span.setText(value);
		return span;
	}

	@Override
	public BaseHTMLComponent render(Field field, Map<String, Object> data) {
		// TODO Auto-generated method stub
		String status = (String)data.get(invite.FIELD_INVITE_STATUS);
		if (invite.INVITE_STATUS_JOINED.equals(status)) {
			return new TEXT("Joined");
		} 
		A a = new A(field.getName(),field.getClassName());
		a.addAttribute("onclick","ActionHandler.call('/c4t/invite','"+data.get("id")+"','RESEND_INVITE')");
		a.setHref("javascript:void(0)");
		if (invite.INVITE_STATUS_NEW.equals(status)) {
			a.setText("Invite");
		} else {
			a.setText("Resend Invite");
		}
		return a;
	}
}
