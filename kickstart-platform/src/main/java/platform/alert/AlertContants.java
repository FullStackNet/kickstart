package platform.alert;

import platform.notification.NotificationFactory;
import platform.webservice.ui.definition.IdValue;

public class AlertContants {


    public static IdValue[] getAlertSeverity() {
        IdValue[] values = {new IdValue(NotificationFactory.SEVERIRY_CRITICAL,"Critical"),
                new IdValue(NotificationFactory.SEVERIRY_MAJOR,"Major"),
                new IdValue(NotificationFactory.SEVERIRY_MINOR,"Minor"),
                new IdValue(NotificationFactory.SEVERIRY_WARNING,"Warning"),
                new IdValue(NotificationFactory.SEVERIRY_INFO,"Info")
        };
        return values;
    }
}
