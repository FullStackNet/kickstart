package platform.webservice.ui.view.table;

import java.util.ArrayList;
import java.util.Map;

import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.component.BaseTableView;
import platform.webservice.ui.definition.TableDefinition;

public class CrudTable extends BaseTableView {
	TableDefinition tableDefinition;
	ArrayList<Map<String, Object>> data;
	public CrudTable(UIServletContext ctx,TableDefinition tableDefinition,ArrayList<Map<String, Object>> data) {
		super(ctx,tableDefinition);
		this.data = data;
	}

	
	@Override
	protected ArrayList<Map<String, Object>> getData() {
		// TODO Auto-generated method stub
		return data;
	}


	@Override
	protected void populateDefinition() {
		// TODO Auto-generated method stub
		
	}
}
