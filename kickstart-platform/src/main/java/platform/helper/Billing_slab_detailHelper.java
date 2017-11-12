package platform.helper;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.resource.BaseResource;
import platform.resource.billing_slab_detail;
import platform.resource.billing_slab_master;


public class Billing_slab_detailHelper extends BaseHelper {

	public Billing_slab_detailHelper() {
		super(new billing_slab_detail());
		// TODO Auto-generated constructor stub
	}
	private static Billing_slab_detailHelper instance;
	
	public static Billing_slab_detailHelper getInstance() {
		if (instance == null)
			instance = new Billing_slab_detailHelper();
		return instance;
	}

	public BaseResource[] getBySlabId(String slabId) {
		Expression e = new Expression(billing_slab_detail.FIELD_SLAB_ID, REL_OP.EQ,slabId);
		return getByExpression(e,new String[]{billing_slab_detail.FIELD_START_VALUE});
	}
}
