package platform.billing;

import platform.webservice.ui.definition.IdValue;

public class BillingConstants {
    public static String BILLING_TYPE_PREPAID = "PREPAID";
    public static String BILLING_TYPE_POASTPAID = "POSTPAID";
    public static String[] getBillingType() {
        return new String[]{BILLING_TYPE_PREPAID,BILLING_TYPE_POASTPAID};
    }

    public static String BILLING_RATE_TYPE_FLAT = "FLAT";
    public static String BILLING_RATE_TYPE_SLAB_WISE = "SLAB-WISE";

    public static String[] getRateBillingType() {
        return new String[]{BILLING_RATE_TYPE_FLAT,BILLING_RATE_TYPE_SLAB_WISE};
    }

    public static String BILLING_PARAMETER_KWH = "KWH";
    public static String BILLING_PARAMETER_KVAH = "KVAH";

    public static String[] getBillingParameter() {
        return new String[]{BILLING_PARAMETER_KWH,BILLING_PARAMETER_KVAH};
    }

    public static String BILLING_SOURCE_GRID = "GRID";
    public static String BILLING_SOURCE_DG = "DG";

    public static String[] getBillingSource() {
        return new String[]{BILLING_SOURCE_GRID,BILLING_SOURCE_DG};
    }
}
