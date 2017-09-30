package platform.webservice.ui.component;

import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.definition.TableDefinition;
import platform.webservice.ui.html.*;
import platform.webservice.ui.util.Attribute;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;


public abstract class BaseEasTileView extends BaseView {
	private UIServletContext mContext;
	private TableDefinition mDefinition;
	private Div mContainer;
	abstract protected void populateDefinition();

	abstract protected ArrayList<Map<String, Object>> getData();
	protected String fromDatestring;
	protected String toDatestring;
	protected String timeZone;


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
	public BaseEasTileView(UIServletContext ctx) {
		super();
		mContext = ctx;
		ctx.getPageBuilder().addJS(new JS("action_handle.js", "/ui/js/"));
		fromDatestring = (String) getContext().getParamValue("from_date");
		toDatestring =  getContext().getParamValue("to_date");
		prePopulateDefinition();
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
				title = title +" ["+getContext().getContextName()+"]";
			}
		}
		td.addChild(new H4(title));
		row.addChild(td);
		thead.addChild(row);
		mContainer.addChild(thead);
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

		mContainer.addChild(tr);
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
		mContainer.addChild(thead);
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

	abstract protected void renderRow(Div container, Map<String, Object> data, int rowNumber);

	public void buildUI() {
		ArrayList<Map<String, Object>> list = getData();
		buildUI(list);
	}

	void buildUI(ArrayList<Map<String, Object>> list) {
		Div titleDiv = new Div();
		titleDiv.addChild(new H3(getDefinition().getTitle()));
		
		mContainer = new Div();
		mContainer.addChild(titleDiv);
		
		mContainer.addChild(new BR());
		
		if (mDefinition.getWidth() != 0) {
			mContainer.addAttribute(new Attribute("style", "width: "+mDefinition.getWidth()+"px"));
		} else {
			mContainer.addAttribute(new Attribute("style", "width: 100%;"));		
		}
		renderSerach();
		if (mDefinition.isDateWiseFilter()) {
			displayDateUI();
		}
		Div bodyDiv = new Div();
		mContainer.addChild(bodyDiv);
		if (list != null) {
			for(int i =0 ; i < list.size(); i++) {
				Div tile = new Div();
				tile.addAttribute("class","tile");
				bodyDiv.addChild(tile);
				renderRow(tile, list.get(i),i+1);
			}
		}
		getView().addChild(mContainer);
	}

	public UIServletContext getContext() {
		return mContext;
	}

	public void setContext(UIServletContext context) {
		this.mContext = context;
	}

	public Div getContainer() {
		return mContainer;
	}

}
