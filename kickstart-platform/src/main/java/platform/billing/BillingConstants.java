package platform.billing;

import platform.webservice.ui.definition.IdValue;

public class BillingConstants {
    public static String BILLING_TYPE_PREPAID = "PREPAID";
    public static String BILLING_TYPE_POASTPAID = "POSTPAID";
    public static String[] getBillingType() {
        return new String[]{BILLING_TYPE_PREPAID,BILLING_TYPE_POASTPAID};
    }
}
