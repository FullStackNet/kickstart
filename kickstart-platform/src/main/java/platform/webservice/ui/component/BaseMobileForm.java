package platform.webservice.ui.component;

import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.definition.Block;
import platform.webservice.ui.definition.Field;
import platform.webservice.ui.definition.FormDefinition;
import platform.webservice.ui.html.A;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.html.FORM;
import platform.webservice.ui.html.LABEL;
import platform.webservice.ui.html.PASSWORD;
import platform.webservice.ui.html.TEXTEDIT;
import platform.webservice.ui.util.Attribute;
import platform.webservice.ui.util.UIConstants;


public class BaseMobileForm extends BaseView {
	UIServletContext mContext;
	FormDefinition mDefinition;
	FORM mForm;
	
	public BaseMobileForm(UIServletContext ctx) {
		super();
		mContext = ctx;
		getView().addChild(mForm);
	}
	
	public void setDefinition(FormDefinition definition) {
		mDefinition = definition;
	}
	
	@Override
	public void buildUI() {
		// TODO Auto-generated method stub
		mForm = new FORM(mDefinition.getId(), null);
		mForm.setMethod("POST");
		mForm.setAction("#");
		if (mDefinition.getOnSubmit() != null) {
			mForm.addAttribute(new Attribute("onSubmit", mDefinition.getOnSubmit()));
		}
		for (int i = 0; i < mDefinition.getBlocks().size(); i++) {
			Block block = mDefinition.getBlocks().get(i);
			for(int j=0; j < block.getFields().size(); j++) {
				Div div = new Div();
				div.addAttribute(new Attribute("class", "ui-field-contain"));
				Field field = block.getFields().get(j);
				if (field.getCompomentType() == UIConstants.COMPONENT_TYPE_TEXTINPUT) {
					LABEL label = new LABEL();
					label.addAttribute(new Attribute("for", field.getName()));
					label.setText(field.getLabel());
					div.addChild(label);
					TEXTEDIT textEdit = new TEXTEDIT(field.getName(), field.getName(), null);
					div.addChild(textEdit);
				} else if (field.getCompomentType() == UIConstants.COMPONENT_TYPE_PASSWORD) {
					LABEL label = new LABEL();
					label.addAttribute(new Attribute("for", field.getName()));
					label.setText(field.getLabel());
					div.addChild(label);
					PASSWORD passwordEdit = new PASSWORD(field.getName(), field.getName(), null);
					div.addChild(passwordEdit);
				}
				mForm.addChild(div);
			}
		}
		Div buttonDiv = new Div();
		buttonDiv.addAttribute(new Attribute("align", "right"));
		for(int i=0;i < mDefinition.getButtonList().size(); i++) {
			A button = new A(mDefinition.getButtonList().get(i).getId(), null);
			button.addAttribute(new Attribute("data-role", "button"));
			button.addAttribute(new Attribute("href", "#"));
			button.addAttribute(new Attribute("data-inline", "true"));
			
			button.setText(mDefinition.getButtonList().get(i).getLabel());
			buttonDiv.addChild(button);
		}
		mForm.addChild(buttonDiv);
		getView().addChild(mForm);
	}
}
