package platform.webservice.ui.component;

import java.util.ArrayList;
import java.util.Map;

import platform.util.TimeUtil;
import platform.util.Util;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.definition.Field;
import platform.webservice.ui.definition.TableDefinition;
import platform.webservice.ui.html.A;
import platform.webservice.ui.html.H3;
import platform.webservice.ui.html.IMG;
import platform.webservice.ui.html.JS;
import platform.webservice.ui.html.P;
import platform.webservice.ui.html.SPAN;
import platform.webservice.ui.html.TABLE;
import platform.webservice.ui.html.TBODY;
import platform.webservice.ui.html.TD;
import platform.webservice.ui.html.TH;
import platform.webservice.ui.html.THEAD;
import platform.webservice.ui.html.TR;
import platform.webservice.ui.renderer.BaseRenderer;
import platform.webservice.ui.util.Attribute;
import platform.webservice.ui.util.ImageUtils;
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
		ctx.getPageBuilder().addJS(new JS("action_handle.js", "/ui/js/"));
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
		TH th = new TH();
		row.addChild(th);
		for (int i = 0; i < mDefinition.getFields().size(); i++) {
			Field field = mDefinition.getFields().get(i);
			th = new TH();
			if (field.getWidth() > 0) {
				th.addAttribute("width",""+field.getWidth());
			}
			if (field.getLabel() != null) {
				th.setText(field.getLabel());
			} else if (field.getLabels() != null) {
				String labels = "";
				for(String label : field.getLabels()) {
					if (Util.isEmpty(label))
						continue;
					if (!Util.isEmpty(labels)) {
						labels = labels + "<br>";
					}
					labels = labels + label;
				}
				th.setText(labels);
			}

			row.addChild(th);
		}
		th = new TH();
		row.addChild(th);
		thead.addChild(row);
		mTable.addChild(thead);
	}

	protected void renderTitle() {
		THEAD thead = new THEAD();
		TR row = new TR();
		row.addAttribute("style","background-color: transparent;text-align:center;padding:0;");
		TD td = new TD();
		td.addAttribute("colspan",""+15);
		td.addAttribute("align", "center");
		td.addAttribute("style","text-align:center;padding:0;");
		td.addChild(new H3(mDefinition.getTitle()));
		row.addChild(td);
		thead.addChild(row);
		mTable.addChild(thead);
	}
	public String getSearchURL() {
		return null;
	}
	protected void renderSerach() {
		if (getSearchURL() == null)
			return;
		THEAD thead = new THEAD();
		TR row = new TR();
		row.addAttribute("style","background-color: transparent;text-align:center;padding:0;");
		TD td = new TD();
		td.addAttribute("colspan", ""+(mDefinition.getFields().size()+1));
		td.addAttribute("align", "center");
		td.addAttribute("style","text-align:center;padding:0;");
		SearchView view = new SearchView(getContext());
		view.setSubmitUrl(getSearchURL());
		td.addChild(view.getView());
		row.addChild(td);
		thead.addChild(row);
		mTable.addChild(thead);
	}

	protected String getModifyURL(String id) {
		if (getDefinition().getModifyURL() == null)
			return null;
		if (getDefinition().getModifyURL().contains("?")) {
			return getDefinition().getModifyURL()+"&id="+id+"&op=modify";
		}
		return getDefinition().getModifyURL()+"?id="+id+"&op=modify";
	}

	protected String getDeleteURL(String id) {
		return getDefinition().getDeleteURL();
	}

	protected String getURL(Map<String,Object> row) {
		return null;
	}

	protected String getDeleteURL(Map<String,Object> row) {
		return null;
	}

	protected void renderRow(TBODY body , Map<String, Object> data, int rowNumber) {
		TR row = new TR();
		TD td = new TD();
		row.addChild(td);
		td.setText(""+rowNumber+".");
		for (int i = 0; i < mDefinition.getFields().size(); i++) {
			Field field = mDefinition.getFields().get(i);
			td = new TD();
			if (field.getWidth() > 0) {
				td.addAttribute("width",""+field.getWidth());
			}
			if (field.getRenderer() != null) {
				BaseRenderer renderer = field.getRenderer();
				td.addChild(renderer.render(field, data));
			} else {

				if ((field.getName() != null) && data.get(field.getName()) != null) {
					String value = data.get(field.getName()).toString();
					if (field.getType() == UIConstants.DATA_TYPE_TIMESTAMP) {
						value = TimeUtil.getStringFromTime(mDefinition.getTimeZone(),Long.parseLong(value));
					} else if (field.getType() == UIConstants.DATA_TYPE_TIME) {
						value = TimeUtil.getStringFromOnlyTime(mDefinition.getTimeZone(),Long.parseLong(value));
					} else if (field.getType() == UIConstants.DATA_TYPE_DURATION) {
						value = TimeUtil.getDurationString(Long.parseLong(value));
					} else if (field.getType() == UIConstants.DATA_TYPE_DATE) {
						value = TimeUtil.getMMDDYYYYStringFromTime(mDefinition.getTimeZone(),Long.parseLong(value));
					} 
					if (field.getUnit() != null)
						value = value + " "+field.getUnit();
					td.setText(value);
				} else if (field.getNames() != null) {
					String values = "";
					int k = 0;
					for(String name : field.getNames()) {
						if (data.get(name) == null)
							continue;
						String value = data.get(name).toString();
						if (field.getTypes()[k] == UIConstants.DATA_TYPE_TIMESTAMP) {
							value = TimeUtil.getStringFromTime(mDefinition.getTimeZone(),Long.parseLong(value));
						} else if (field.getTypes()[k]  == UIConstants.DATA_TYPE_TIME) {
							value = TimeUtil.getStringFromOnlyTime(mDefinition.getTimeZone(),Long.parseLong(value));
						} else if (field.getTypes()[k]  == UIConstants.DATA_TYPE_DURATION) {
							value = TimeUtil.getDurationString(Long.parseLong(value));
						} else if (field.getTypes()[k]  == UIConstants.DATA_TYPE_DATE) {
							value = TimeUtil.getMMDDYYYYStringFromTime(mDefinition.getTimeZone(),Long.parseLong(value));
						} 
						if (!Util.isEmpty(values)) {
							values = values+ "<br>";
						}
						values = values + value;
						k++;
					}
					td.setText(values);
				}	else {

					td.setText("-");
				}
			}
			row.addChild(td);
		}
		TD actiontd = new TD();
		String url = getURL(data);
		if (url == null) {
			url = getModifyURL(data.get("id").toString());
		}
		boolean requiredSeperator = false;
		if (mDefinition.isModifyButton() && (url != null)) {
			A _editlink = new A();
			_editlink.setHref(url);
			_editlink.setText("Edit");
			actiontd.addChild(_editlink);
			requiredSeperator = true;
		}
		String deleteUrl = getDeleteURL(data);
		if (deleteUrl == null) {
			deleteUrl = getDeleteURL((String)data.get("id"));
		}
		if (mDefinition.isDeleteButton() && (deleteUrl != null)) {
			if (requiredSeperator) {
				SPAN span = new SPAN();
				span.setText("&nbsp;&nbsp;");
				actiontd.addChild(span);
			}
			String id = (String)data.get("id");
			A _link = new A();
			_link.setHref("#");
			_link.addAttribute("onClick","ActionHandler.callDelete('"+deleteUrl+"','"+id+"')");
			_link.setText("Delete");
			actiontd.addChild(_link);
		}
		row.addChild(actiontd);

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
		if (mDefinition.getWidth() != 0) {
			mTable.addAttribute(new Attribute("style", "width: "+mDefinition.getWidth()+"px"));
		}
		mTable.addAttribute(new Attribute("cellpadding", "0"));
		mTable.addAttribute(new Attribute("cellspacing", "0"));
		if (mDefinition.getTitle() != null) {
			renderTitle();
		}
		renderSerach();
		THEAD thead = new THEAD();
		TR row = new TR();
		row.addAttribute("style","background-color: transparent;text-align:center;padding:0;");
		TD td = new TD();
		td.addAttribute("colspan", "2");
		td.addAttribute("align", "center");
		td.addAttribute("style","padding:0;");
		row.addChild(td);
		if (mDefinition.isAddButton()) {
			P p = new P();
			A a = new A();
			IMG img = new IMG();
			img.setSRC(ImageUtils.ADD_NEW_ITEM);
			a.addChild(img);
			String url = mDefinition.getAddButtonURL();
			if (url.indexOf("?") > 0) {
				a.setHref(url+"&op=add");
			} else {
				a.setHref(url+"?op=add");
			}
			p.addChild(a);
			td.addChild(p);
		}
		row.addAttribute("style","background-color: transparent;text-align:center;padding:0;");
		td = new TD();
		td.addAttribute("colspan", "10");
		td.addAttribute("style","padding:10px;text-align : right");
		if (list != null) {
			td.setText(" Total Records : " + list.size());
		}
		row.addChild(td);

		thead.addChild(row);
		mTable.addChild(thead);
		if (mDefinition.isDisplayTitles()) {
			renderHeading();
		}

		TBODY tbody = new TBODY();
		mTable.addChild(tbody);
		if (list != null) {
			for(int i =0 ; i < list.size(); i++) {
				renderRow(tbody, list.get(i),i+1);
				renderDataRow(tbody, list.get(i));
			}
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
