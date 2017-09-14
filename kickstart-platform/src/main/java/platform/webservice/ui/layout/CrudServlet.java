package platform.webservice.ui.layout;

import java.util.ArrayList;
import java.util.Map;

import platform.helper.BaseHelper;
import platform.webservice.WebServiceContants;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.definition.Button;
import platform.webservice.ui.definition.FormDefinition;
import platform.webservice.ui.definition.TableDefinition;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.view.form.CrudForm;
import platform.webservice.ui.view.table.CrudTable;

public abstract class CrudServlet extends TwoColumnDBApplicationServlet {
	private static final long serialVersionUID = 1L;
	protected abstract FormDefinition getFormDefinition(UIServletContext context);
	protected abstract TableDefinition getTableDefinition(UIServletContext context);
	protected abstract BaseHelper getHelper();
	protected abstract String getAPIUrl();
	protected abstract String getUIUrl();
	protected abstract BaseHTMLComponent getLeftMenu(UIServletContext context);
	protected abstract ArrayList<Map<String, Object>> getTableData(UIServletContext context);
	@Override
	public BaseHTMLComponent getWebLeftMenu(UIServletContext context) {
		// TODO Auto-generated method stub
		return getLeftMenu(context);
	}

	@Override
	public BaseHTMLComponent getAddView(UIServletContext context) {
		// TODO Auto-generated method stub
		CrudForm view = new CrudForm(context,getHelper(),getFormDefinition(context));
		view.getDefinition().setSubmitURL(getAPIUrl());
		view.getDefinition().setSuccessURL(getUIUrl());
		view.getDefinition().addButton(new Button("save", "Save"));
		view.buildUI(WebServiceContants.OPERATION_ADD, null);
		return view.getView();
	}

	@Override
	public BaseHTMLComponent getModifyView(UIServletContext context) {
		// TODO Auto-generated method stub
		String id = context.getParamValue("id");
		CrudForm view = new CrudForm(context,getHelper(),getFormDefinition(context));
		view.getDefinition().setSubmitURL(getAPIUrl());
		view.getDefinition().setSuccessURL(getUIUrl());
		view.getDefinition().addButton(new Button("save", "Save"));
		view.buildUI(WebServiceContants.OPERATION_MODIFY, id);
		return view.getView();
	}

	@Override
	public BaseHTMLComponent getListView(UIServletContext context) {
		// TODO Auto-generated method stub
		ArrayList<Map<String, Object>> data= getTableData(context);
		CrudTable view = new CrudTable(context,getTableDefinition(context),data);
		view.getDefinition().setAddButton(true);
		view.getDefinition().setAddButtonURL(getUIUrl());
		view.getDefinition().setModifyButton(true);
		view.getDefinition().setModifyURL(getUIUrl());
		view.buildUI();
		return view.getView();
	}

	@Override
	public BaseHTMLComponent getDeleteView(UIServletContext context) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseHTMLComponent getView(UIServletContext context) {
		// TODO Auto-generated method stub
		return null;
	}

}
