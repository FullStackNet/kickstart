package platform.webservice.ui.component;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

import platform.util.TimeUtil;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.definition.Field;
import platform.webservice.ui.definition.TableDefinition;
import platform.webservice.ui.html.A;
import platform.webservice.ui.html.BUTTON;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.html.FORM;
import platform.webservice.ui.html.H2;
import platform.webservice.ui.html.HIDDEN;
import platform.webservice.ui.html.LI;
import platform.webservice.ui.html.TABLE;
import platform.webservice.ui.html.TBODY;
import platform.webservice.ui.html.TD;
import platform.webservice.ui.html.TEXTEDIT;
import platform.webservice.ui.html.TH;
import platform.webservice.ui.html.THEAD;
import platform.webservice.ui.html.TR;
import platform.webservice.ui.html.UL;
import platform.webservice.ui.util.UIConstants;


public abstract class BaseReportTableView extends BaseView {
	private UIServletContext mContext;
	private TableDefinition mDefinition;
	private TABLE mTable;
	
	Map<String, Object> dailyMap;
	Map<String, Object> monthlyMap;
	
	abstract protected void populateDefinition();
	abstract protected ArrayList<Map<String, Object>> getData();
	
	
	public BaseReportTableView(UIServletContext ctx) {
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
	
	protected void renderRow(TBODY body , Map<String, Object> data) {
		TR row = new TR();
		for (int i = 0; i < mDefinition.getFields().size(); i++) {
			Field field = mDefinition.getFields().get(i);
			TD td = new TD();
			if (data.get(field.getName()) != null) {
				String value = data.get(field.getName()).toString();
				if (field.getType() == UIConstants.DATA_TYPE_TIMESTAMP) {
					value = TimeUtil.getStringFromTime(mDefinition.getTimeZone(),Long.parseLong(value));
				}
				if (field.getType() == UIConstants.DATA_TYPE_DURATION) {
					value = TimeUtil.getDurationString(Long.parseLong(value));
				}
				td.setText(value);
			} else {
				td.setText("-");
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
	
	public abstract String getTodayURL();
	public abstract String getCurrentWeekURL();
	public abstract String getCurrentMonthURL();
	public abstract Map<String, Object> getfromAndToDateHiddenFields();
	public abstract String getfromAndToDateURL();
	
	void buildUI(ArrayList<Map<String, Object>> list) {
		H2 h2 = new H2(mDefinition.getTitle());
		
		mTable = new TABLE(mDefinition.getId(), null);
		mTable.addAttribute("width","100%");
		getView().addChild(mTable);
		
		TR tr = new TR();
		mTable.addChild(tr);
		TD td = new TD();
		tr.addChild(td);
		td.addAttribute("align", "center");
		td.addChild(h2);
		
		tr = new TR();
		mTable.addChild(tr);
		td = new TD();
		tr.addChild(td);
		td.setText(" ");
		
		tr = new TR();
		mTable.addChild(tr);
		td = new TD();
		td.addAttribute("align", "center");
		tr.addChild(td);
		FORM form = new FORM(mDefinition.getId()+"_form", null);
		form.setAction(getfromAndToDateURL());
		form.setMethod("GET");
		td.addChild(form);
		
		form.addAttribute("align","left");
		TEXTEDIT fromDate = new TEXTEDIT();
		fromDate.addAttribute("name","from_date");
		fromDate.addAttribute("placeholder","From date in YYYYMMDD format");
		fromDate.addAttribute("id","from_date");
		if (mContext.getParamValue("from_date") != null)
			fromDate.setValue(mContext.getParamValue("from_date"));
		form.addChild(fromDate);
		
		TEXTEDIT toDate = new TEXTEDIT();
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
		button.addAttribute("value","Fetch");
		form.addChild(button);
		
		tr = new TR();
		mTable.addChild(tr);
		td = new TD();
		td.addAttribute("align","right");
		tr.addChild(td);
		
		Div div = new Div();
		div.addAttribute("style","float:right;");
		td.addChild(div);
		
		
		UL ul = new UL();
		ul.addAttribute("class","report_date_menu");
		div.addChild(ul);
		
		LI li = new LI();
		li.addAttribute("class","report_date_menu_item");
		ul.addChild(li);
		A a = new A();
		a.setText("Today");
		a.setHref(getTodayURL());
		li.addChild(a);
		
		li = new LI();
		li.addAttribute("class","report_date_menu_item");
		ul.addChild(li);
		
		a = new A();
		a.setText("Current Week");
		a.setHref(getCurrentWeekURL());
		li.addChild(a);
		
		li = new LI();
		li.addAttribute("class","report_date_menu_item");
		ul.addChild(li);
		a = new A();
		a.setText("Current Month");
		a.setHref(getCurrentMonthURL());
		li.addChild(a);
		
		mTable = new TABLE(mDefinition.getId(), mDefinition.getClassName());
		TBODY tbody = new TBODY();
		renderHeading();
		
		mTable.addChild(tbody);
		if (list != null) {
			for(int i =0 ; i < list.size(); i++) {
				renderRow(tbody, list.get(i));
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
	public UIServletContext getmContext() {
		return mContext;
	}
	public void setmContext(UIServletContext mContext) {
		this.mContext = mContext;
	}
	
}
