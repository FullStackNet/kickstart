package platform.webservice.ui.view.form;

import java.util.Map;

import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.component.BaseForm;
import platform.webservice.ui.definition.FormDefinition;

public class CrudForm extends BaseForm {
	platform.helper.BaseHelper helper;
	public CrudForm(UIServletContext ctx,BaseHelper helper,FormDefinition formDefinition) {
		super(ctx);
		this.helper = helper;
		setDefinition(formDefinition);
	}
	@Override
	public Map<String, Object> getData(String id) {
		// TODO Auto-generated method stub
		BaseResource object = helper.getById(id);
		return object.convertResourceToMap();
	}
	
	
	@Override
	public void populateDefinition() {
		
	}


}
