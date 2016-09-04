package platform.webservice.ui.layout;

import java.util.ArrayList;
import java.util.Map;

import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.util.Util;
import platform.webservice.WebServiceContants;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.definition.Button;
import platform.webservice.ui.definition.FormDefinition;
import platform.webservice.ui.definition.TableDefinition;
import platform.webservice.ui.html.BR;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.view.form.CrudForm;
import platform.webservice.ui.view.table.CrudTable;

public abstract class CrudMasterSlaveServlet extends TwoColumnDBApplicationServlet {
	private static final long serialVersionUID = 1L;
	protected ArrayList<TableDefinition> slaves;
	protected abstract FormDefinition getFormDefinition(UIServletContext context);
	protected abstract TableDefinition getTableDefinition(UIServletContext context);
	protected abstract BaseHelper getHelper();
	protected abstract String getAPIUrl();
	protected abstract String getUIUrl();
	protected abstract BaseHTMLComponent getLeftMenu(UIServletContext context);
	protected abstract ArrayList<Map<String, Object>> getTableData(UIServletContext context);
	protected abstract ArrayList<Map<String, Object>> getSlaveData(UIServletContext context,String slaveType);
	protected abstract void addSlaves(UIServletContext context);	
	protected abstract boolean isSlaveAddButton(UIServletContext context,String slaveType);	
	protected abstract boolean isSlaveModifyButton(UIServletContext context,String slaveType);	
	protected abstract String getSlaveAddUrl(UIServletContext context,String slaveType);	
	protected abstract String getSlaveModifyUrl(UIServletContext context,String slaveType);
	protected abstract FormDefinition getSlaveFormDefinition(UIServletContext context,String slaveType);
	protected abstract BaseResource getSlaveFormData(UIServletContext context,String slaveType);


	public ArrayList<TableDefinition> getSlaves() {
		return slaves;
	}
	
	
	@Override
	public BaseHTMLComponent getWebLeftMenu(UIServletContext context) {
		// TODO Auto-generated method stub
		return getLeftMenu(context);
	}

	@Override
	public BaseHTMLComponent getAddView(UIServletContext context) {
		// TODO Auto-generated method stub
		String slave = context.getParamValue("slave");
		if (!Util.isEmpty(slave)) {
			FormDefinition formDefinition = getSlaveFormDefinition(context,slave);
			CrudForm view = new CrudForm(context,getHelper(),formDefinition);
			view.getDefinition().addButton(new Button("save", "Save"));
			view.buildUI(WebServiceContants.OPERATION_ADD, null);
			return view.getView();
		} else {
			CrudForm view = new CrudForm(context,getHelper(),getFormDefinition(context));
			view.getDefinition().setSubmitURL(getAPIUrl());
			view.getDefinition().setSuccessURL(getUIUrl());
			view.getDefinition().addButton(new Button("save", "Save"));
			view.buildUI(WebServiceContants.OPERATION_ADD, null);
			return view.getView();
		}
	}

	@Override
	public BaseHTMLComponent getModifyView(UIServletContext context) {
		// TODO Auto-generated method stub
		slaves = new ArrayList<TableDefinition>();
		addSlaves(context);
		Div div = new Div();
		div.addAttribute("style","width : 602px; margin-bottom:60px;");
		String id = context.getParamValue("id");
		CrudForm view = new CrudForm(context,getHelper(),getFormDefinition(context));
		view.getDefinition().setSubmitURL(getAPIUrl());
		view.getDefinition().setSuccessURL(getUIUrl());
		view.getDefinition().addButton(new Button("save", "Save"));
		view.buildUI(WebServiceContants.OPERATION_MODIFY, id);
		div.addChild(view.getView());
		div.addChild(new BR());
		if (!Util.isEmpty(slaves)) {
			for(TableDefinition slave : slaves) {
				// TODO Auto-generated method stub
				ArrayList<Map<String, Object>> data= getSlaveData(context,slave.getId());
				CrudTable lisView = new CrudTable(context,slave,data);
				lisView.getDefinition().setAddButton(isSlaveAddButton(context, slave.getId()));
				lisView.getDefinition().setAddButtonURL(getSlaveAddUrl(context,  slave.getId()));
				lisView.getDefinition().setModifyButton(isSlaveModifyButton(context, slave.getId()));
				lisView.getDefinition().setModifyURL(getSlaveModifyUrl(context,slave.getId()));
				lisView.buildUI();
				div.addChild(lisView.getView());
			}
		} 
		return div;
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
