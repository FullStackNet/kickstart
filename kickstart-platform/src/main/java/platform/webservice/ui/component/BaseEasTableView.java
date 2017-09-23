package platform.webservice.ui.component;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

import platform.util.TimeUtil;
import platform.util.Util;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.definition.Field;
import platform.webservice.ui.definition.TableDefinition;
import platform.webservice.ui.html.*;
import platform.webservice.ui.renderer.BaseRenderer;
import platform.webservice.ui.util.Attribute;
import platform.webservice.ui.util.ImageUtils;
import platform.webservice.ui.util.UIConstants;


public abstract class BaseEasTableView extends BaseView {
	private UIServletContext mContext;
	private TableDefinition mDefinition;
	private TABLE mTable;

	abstract protected void populateDefinition();
	abstract protected ArrayList<Map<String, Object>> getData();
	protected String fromDatestring;
	protected String toDatestring;
	protected String timeZone;
	boolean populated;

	public  String getTodayURL() {
		return null;
	}
	public  String getCurrentWeekURL() {
		return null;
	}
	public  String getCurrentMonthURL() {
		return null;
	}
	public  Map<String, Object> getfromAndToDateHiddenFields() {
		return null;
	}
	public  String getfromAndToDateURL() {
		return null;
	}

	protected void prePopulateDefinition() {
		
	}
	
	public BaseEasTableView(UIServletContext ctx,TableDefinition definition) {
		super();
		mContext = ctx;
		ctx.getPageBuilder().addJS(new JS("action_handle.js", "/ui/js/"));
		fromDatestring = (String) getContext().getParamValue("from_date");
		toDatestring =  getContext().getParamValue("to_date");
		prePopulateDefinition();
		mDefinition = definition;
		populated = false;
	}
	
	public BaseEasTableView(UIServletContext ctx) {
		super();
		mContext = ctx;
		ctx.getPageBuilder().addJS(new JS("action_handle.js", "/ui/js/"));
		fromDatestring = (String) getContext().getParamValue("from_date");
		toDatestring =  getContext().getParamValue("to_date");
		prePopulateDefinition();
		populateDefinition();
		populated = true;
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
		row.addAttribute("style","font-size:13px; background-color: transparent;text-align:center;padding:0;");
		TD td = new TD();
		td.addAttribute("colspan",""+15);
		td.addAttribute("align", "center");
		td.addAttribute("style","text-align:center;padding:0;");
		String title = mDefinition.getTitle();
		if (getContext().getContextName() != null) {
			if (getDefinition().isDisplayCommunityName()) {
				title = title;
			}
		}
		td.addChild(new H4(title));
		row.addChild(td);
		thead.addChild(row);
		mTable.addChild(thead);
	}

	public void displayDateUI() {
		TABLE table = new TABLE();	
		table.addAttribute("width","100%");
		TR tr = new TR();
		table.addChild(tr);
		TD td = new TD();
		td.addAttribute("align", "center");
		td.addAttribute("style", "padding : 3px 3px 3px 3px;");
		tr.addChild(td);
		FORM form = new FORM(mDefinition.getId()+"_form", null);
		form.setAction(getfromAndToDateURL());
		form.setMethod("GET");
		td.addChild(form);

		form.addAttribute("align","left");
		TEXTEDIT fromDate = new TEXTEDIT();
		fromDate.addAttribute("style", "width: 140px;height : 20px");
		fromDate.addAttribute("name","from_date");
		fromDate.addAttribute("placeholder","From date in YYYYMMDD format");
		fromDate.addAttribute("id","from_date");
		if (mContext.getParamValue("from_date") != null)
			fromDate.setValue(mContext.getParamValue("from_date"));
		form.addChild(fromDate);

		TEXTEDIT toDate = new TEXTEDIT();
		toDate.addAttribute("style", "width: 140px;height : 20px");
		toDate.addAttribute("name","to_date");
		toDate.addAttribute("placeholder","To date in YYYYMMDD format");
		toDate.addAttribute("id","to_date");
		if (mContext.getParamValue("to_date") != null)
			toDate.setValue(mContext.getParamValue("to_date"));
		form.addChild(toDate);

		Map<String, Object> map = getfromAndToDateHiddenFields();
		if (map != null) {
			for(Entry<String, Object> entry : map.entrySet()) {
				HIDDEN hidden = new HIDDEN(entry.getKey(), entry.getValue());
				hidden.addAttribute("name", entry.getKey());
				form.addChild(hidden);
			}
		}
		BUTTON button = new BUTTON();
		button.addAttribute("type","submit");
		button.addAttribute("style", "width: 120px;height : 25px");
		button.addAttribute("value","Fetch");
		form.addChild(button);

		td = new TD();
		td.addAttribute("align","right");
		td.addAttribute("style", "padding : 3px 3px 3px 3px;");
		tr.addChild(td);

		Div div = new Div();
		div.addAttribute("style","float:right;");
		td.addChild(div);


		A a = new A();
		a.setText("Today");
		a.setHref(getTodayURL());
		div.addChild(a);

		div.addChild(new TEXT(" | "));
		a = new A();
		a.setText("Current Week");
		a.setHref(getCurrentWeekURL());
		div.addChild(a);

		div.addChild(new TEXT(" | "));
		a = new A();
		a.setText("Current Month");
		a.setHref(getCurrentMonthURL());
		div.addChild(a);

		tr = new TR();
		td = new TD();
		td.addAttribute("colspan", "20");
		td.addAttribute("style", "padding : 3px 3px 3px 3px;");
		td.addChild(table);
		tr.addChild(td);

		mTable.addChild(tr);
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
					} else if (field.getType() == UIConstants.DATA_TYPE_INT) {
						value = ""+Math.round(Double.parseDouble(value));
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
			if (mDefinition.isModifyButton()) 
				url = getModifyURL(data.get("id").toString());
		}
		boolean requiredSeperator = false;
		if (mDefinition.isModifyButton() && (url != null)) {
			A _editlink = new A(null,"");
			_editlink.setHref(url);
			_editlink.addStyle("color", "#0092a9");
			/*_editlink.addStyle("background-color", "#99ffd6");
			_editlink.addStyle("border-color", "silver");
			_editlink.addStyle("border-style", "solid");
			_editlink.addStyle("border-width", "1px");
			_editlink.addStyle("padding-left", "10px");
			_editlink.addStyle("padding-right", "10px");
			_editlink.addStyle("padding-top", "4px");
			_editlink.addStyle("padding-bottom", "4px");
			*/	
			_editlink.setText("<i class=\"font-14 fa fa-pencil\"></i>");
			_editlink.addAttribute("title","Edit");
			actiontd.addChild(_editlink);
			requiredSeperator = true;
		}
		String deleteUrl = getDeleteURL(data);
		if (deleteUrl == null) {
			deleteUrl = getDeleteURL((String)data.get("id"));
		}
		if (mDefinition.isDeleteButton() && (deleteUrl != null)) {
			SPAN span = new SPAN();
			span.setText("&nbsp;&nbsp;");			
			actiontd.addChild(span);
			String id = (String)data.get("id");
			 A _link = new A(null,"");
			_link.setHref("#");
			_link.addAttribute("onClick","ActionHandler.callDelete('"+deleteUrl+"','"+id+"')");
			_link.addAttribute("title","Delete");
			_link.addStyle("color", "red");
			/*_link.addStyle("background-color", "#ff9980");
			_link.addStyle("border-color", "silver");
			_link.addStyle("border-style", "solid");
			_link.addStyle("border-width", "1px");
			_link.addStyle("padding-left", "10px");
			_link.addStyle("padding-right", "10px");
			_link.addStyle("padding-top", "4px");
			_link.addStyle("padding-bottom", "4px");*/
			_link.setText("<i style=\"color:red;\" class=\"font-14 fa fa-minus-circle\"></i>");
			actiontd.addChild(_link);
		}
		row.addChild(actiontd);

		body.addChild(row);
	}

	protected void renderDataRow(TBODY body , Map<String, Object> data) {

	}

	public void buildUI() {
		if (!populated)
			populateDefinition();
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
		if (mDefinition.isDateWiseFilter()) {
			displayDateUI();
		}
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
		td.addAttribute("colspan", "20");
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
