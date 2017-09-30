package platform.alert;

import platform.webservice.ui.definition.IdValue;

public class AlertContants {
    public static String SEVERITY_CRITICAL = "CRITICAL";
    public static String SEVERITY_MAJOR = "MAJOR";
    public static String SEVERITY_WARNING = "WARNING";
    public static String SEVERITY_INFO = "INFO";


    public static IdValue[] getAlertSeverity() {
        IdValue[] values = {new IdValue(SEVERITY_CRITICAL,"Critical"),
                new IdValue(SEVERITY_MAJOR,"Major"),
                new IdValue(SEVERITY_WARNING,"Warning"),
                new IdValue(SEVERITY_INFO,"Info")

        };
        return values;
    }

}
