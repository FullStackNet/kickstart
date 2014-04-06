package platform.webservice.ui.component;

import java.util.ArrayList;
import java.util.Map;

import platform.resource.appliance;
import platform.util.TimeUtil;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.definition.Field;
import platform.webservice.ui.definition.TableDefinition;
import platform.webservice.ui.html.A;
import platform.webservice.ui.html.TABLE;
import platform.webservice.ui.html.TBODY;
import platform.webservice.ui.html.TD;
import platform.webservice.ui.html.TH;
import platform.webservice.ui.html.THEAD;
import platform.webservice.ui.html.TR;
import platform.webservice.ui.renderer.BaseRenderer;
import platform.webservice.ui.util.Attribute;
import platform.webservice.ui.util.UIConstants;


public abstract class BaseTableView extends BaseView {
	private UIServletContext mContext;
	private TableDefinition mDefinition;
	private TABLE mTable;

	abstract protected void populateDefinition();
	abstract protected ArrayList<Map<String, Object>> getData();


	public BaseTableView(UIServletContext ctx) {
		super();
		mContext = ctx;
		populateDefinition();
	}


	public void setDefinition(TableDefinition definition) {
		mDefinition = definition;
	}

	public TableDefinition getDefinition() {
		if (mDefinition == null) {
			mDefinition = new TableDefinition();
		}
		return mDefinition;

	}

	protected void renderHeading() {
		THEAD thead = new THEAD();
		TR row = new TR();
		for (int i = 0; i < mDefinition.getFields().size(); i++) {
			Field field = mDefinition.getFields().get(i);
			TH th = new TH();
			th.setText(field.getLabel());
			row.addChild(th);
		}
		thead.addChild(row);
		mTable.addChild(thead);
	}

	protected String getModifyURL(String id) {
		if (getDefinition().getModifyURL().contains("?")) {
			return getDefinition().getModifyURL()+"&id="+id+"&op=modify";
		}
		return getDefinition().getModifyURL()+"?id="+id+"&op=modify";
	}

	protected void renderRow(TBODY body , Map<String, Object> data) {
		TR row = new TR();
		for (int i = 0; i < mDefinition.getFields().size(); i++) {
			Field field = mDefinition.getFields().get(i);
			TD td = new TD();
			if (field.getRenderer() != null) {
				BaseRenderer renderer = field.getRenderer();
				td.addChild(renderer.render(field, data));
			} else {

				if (data.get(field.getName()) != null) {
					String value = data.get(field.getName()).toString();
					if (field.getType() == UIConstants.DATA_TYPE_TIMESTAMP) {
						value = TimeUtil.getStringFromTime(mDefinition.getTimeZone(),Long.parseLong(value));
					}
					if (field.getType() == UIConstants.DATA_TYPE_DURATION) {
						value = TimeUtil.getDurationString(Long.parseLong(value));
					} 

					if (field.getName().equals(appliance.FIELD_NAME)) {
						A a = new A();
						a.setText(value);
						a.addAttribute(new Attribute("href", getModifyURL(data.get(appliance.FIELD_ID).toString())));
						td.addChild(a);
					} else if (field.getName().equals(appliance.FIELD_ID)) {
						A a = new A();
						a.setText(value);
						a.addAttribute(new Attribute("href", getModifyURL(data.get(appliance.FIELD_ID).toString())));
						td.addChild(a);
					} else {
						td.setText(value);
					}
				} else {
					td.setText("-");
				}
			}
			row.addChild(td);
		}
		body.addChild(row);
	}

	protected void renderDataRow(TBODY body , Map<String, Object> data) {

	}

	public void buildUI() {
		ArrayList<Map<String, Object>> list = getData();
		buildUI(list);
	}

	void buildUI(ArrayList<Map<String, Object>> list) {
		mTable = new TABLE(mDefinition.getId(), mDefinition.getClassName());
		renderHeading();
		TBODY tbody = new TBODY();
		mTable.addChild(tbody);
		if (list != null) {
			for(int i =0 ; i < list.size(); i++) {
				renderRow(tbody, list.get(i));
				renderDataRow(tbody, list.get(i));
			}
		}
		if (mDefinition.isAddButton()) {
			A a = new A();
			a.addAttribute("class","button");
			a.setText("+ Add New");
			String url = mDefinition.getAddButtonURL();
			if (url.indexOf("?") > 0) {
				a.setHref(url+"&op=add");
			} else {
				a.setHref(url+"?op=add");
			}
			getView().addChild(a);
		}
		getView().addChild(mTable);
	}

	public UIServletContext getContext() {
		return mContext;
	}

	public void setContext(UIServletContext context) {
		this.mContext = context;
	}

	public TABLE getTable() {
		return mTable;
	}

	public void setTable(TABLE table) {
		this.mTable = table;
	}


}
