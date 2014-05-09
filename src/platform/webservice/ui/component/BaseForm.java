package platform.webservice.ui.component;

import java.util.Map;

import platform.util.TimeUtil;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.definition.Block;
import platform.webservice.ui.definition.Field;
import platform.webservice.ui.definition.FormDefinition;
import platform.webservice.ui.html.BUTTON;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.COMBO;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.html.FORM;
import platform.webservice.ui.html.HIDDEN;
import platform.webservice.ui.html.JS;
import platform.webservice.ui.html.PASSWORD;
import platform.webservice.ui.html.SPAN;
import platform.webservice.ui.html.TABLE;
import platform.webservice.ui.html.TD;
import platform.webservice.ui.html.TEXT;
import platform.webservice.ui.html.TEXTEDIT;
import platform.webservice.ui.html.TR;
import platform.webservice.ui.renderer.BaseRenderer;
import platform.webservice.ui.util.Attribute;
import platform.webservice.ui.util.UIConstants;


public abstract class BaseForm extends BaseView {
	UIServletContext mContext;
	FormDefinition mDefinition;
	FORM mForm;
	Map<String, Object> dataMap;
	public abstract Map<String, Object> getData(String id);
	public abstract void populateDefinition();
	String operation;
	
	public BaseForm(UIServletContext ctx) {
		super();
		mContext = ctx;
		getView().addChild(mForm);
	}

	public FormDefinition getDefinition() {
		if (mDefinition == null)
			mDefinition= new FormDefinition();
		return mDefinition;
	}
	public UIServletContext getContext() {
		return mContext;
	}


	public void buildUI() {
		buildUI(null);
	}

	public void buildUI(String operation, String id) {
		if (id != null) {
			dataMap = getData(id);
		}
		buildUI(operation, dataMap);
	}

	public void buildUI( Map<String, Object> data) {
		this.dataMap = data;
		buildUI(null, data);
	}

	public Object getValue(Field field, Object value) {
		if (value == null) return value;
		if (field.getType().equals(UIConstants.DATA_TYPE_INT)) {
			return ((Double)Double.parseDouble(""+value)).intValue();
		} 
		return value;
	}

	void buildUI(String operation, Map<String, Object> data) {
		this.dataMap = data;
		// TODO Auto-generated method stub
		this.operation = operation;
		populateDefinition();
		mForm = new FORM(mDefinition.getId(), mDefinition.getClassName());
		mForm.setMethod("POST");
		mForm.setAction("#");
		String refreshKey = "";
		if (mDefinition.isAutoRefresh() && dataMap != null) {
			refreshKey = data.get("id").toString();
			String unitStr= mDefinition.getUnitJavascriptArray();
			mContext.getPageBuilder().addJS(new JS("auto_refresh_handler.js", "/ui/js"));
			TEXT text = new TEXT("<script>"
					+ "$(function() { "
					+ "AutoRefreshHandler.call('"+mDefinition.getAutoRefreshURL()+"',5000,"+unitStr+");"
					+ "});"
					+ "</script>");
			getView().addChild(text);

		}

		if (mDefinition.getOnSubmit() != null) {
			mForm.addAttribute(new Attribute("onSubmit", mDefinition.getOnSubmit()));
		} else if (mDefinition.getSubmitURL() != null) {
			String fieldstr = "";
			mContext.getPageBuilder().addJS(new JS("form_handler.js", "/ui/js"));
			String onSubmit = "return FormHandler.call(";
			if (mDefinition.getSuccessURL() == null) {
				onSubmit += "null";
			} else {
				onSubmit += "'"+mDefinition.getSubmitURL()+"'";
			}
			fieldstr = mDefinition.getFieldNameString();
			onSubmit += ",'"+fieldstr+"'";
			if (mDefinition.getSuccessURL() == null) {
				onSubmit += ",null";
			} else {
				onSubmit += ",'"+mDefinition.getSuccessURL()+"'";
			}
			onSubmit += ",'"+operation+"'";
			onSubmit += ")";
			mForm.addAttribute(new Attribute("onSubmit", onSubmit));
		}
		String str = "<script>\n" +
				"function validation() {\n"+
				"var reason=\"\";\n";

		for (int i = 0; i < mDefinition.getBlocks().size(); i++) {
			Block block = mDefinition.getBlocks().get(i);
			for(int j=0; j < block.getFields().size(); j++) {
				Field field = block.getFields().get(j);
				if (field.isRequired()) {
					str = str + "reason += validateEmpty(\""+field.getName()+"\",\""+field.getLabel()+"\");\n";
				}
				if (field.isEmail()) {
					str = str + "reason += validateEmail(\""+field.getName()+"\",\""+field.getLabel()+"\");\n";
				}

				if (field.getType().equals(UIConstants.DATA_TYPE_INT)) {
					str = str + "reason += validateInteger(\""+field.getName()+"\",\""+field.getLabel()+"\");\n";
				}


				if (field.getType().equals(UIConstants.DATA_TYPE_DOUBLE)) {
					str = str + "reason += validateNumber(\""+field.getName()+"\",\""+field.getLabel()+"\");\n";
				}
			}
		}

		str = str +"if (reason != \"\") {\n";
		str = str +"alert(reason); \n";
		str = str +    "return false;\n";
		str = str + "}\n";
		str = str + "return true;\n";
		str = str +"}\n";
		str = str + "</script>";
		TEXT text = new TEXT(str);
		getView().addChild(text);
		for (int i = 0; i < mDefinition.getBlocks().size(); i++) {
			Block block = mDefinition.getBlocks().get(i);
			String className = "form_block";
			if (block.getClassName() != null) {
				className = block.getClassName();
			}
			Div blockdiv = new Div(block.getId(),className);
			blockdiv.addAttribute("style", ""+"width:"+mDefinition.getWidth()+"px");
			mForm.addChild(blockdiv);
			if (block.getTitle() != null) {
				Div blockTitlediv = new Div(null,"form_title"); 
				blockTitlediv.addAttribute("style", ""+"width:"+mDefinition.getWidth()+"px");
				blockTitlediv.addAttribute(new Attribute("align","center"));
				blockTitlediv.setText(block.getTitle());
				blockdiv.addChild(blockTitlediv);
			}
			VerticleSpacer spacer = new VerticleSpacer(20);
			blockdiv.addChild(spacer.getView());
			TABLE table = new TABLE(block.getId(), "form_table");
			table.addAttribute(new Attribute("cellspacing", "2"));
			table.addAttribute(new Attribute("cellpadding", "2"));

			for(int j=0; j < block.getFields().size(); j++) {
				Field field = block.getFields().get(j);
				Object value = null;
				if (dataMap != null) {
					value = dataMap.get(field.getName());
				} 
				if (value  == null) {
					if (field.getDefaultValue() != null)
						value = field.getDefaultValue();
				}
				if (field.getCompomentType() == UIConstants.COMPONENT_TYPE_HIDDEN) {
					if (field.getDefaultValue() != null) {
						value = field.getDefaultValue();
					}
					if (field.getValue() != null) {
						value = field.getValue();
					}
					if (dataMap != null) {
						if (dataMap.get(field.getName()) != null) {
							if (dataMap.get(field.getName()) != null) {
								value = dataMap.get(field.getName());
							}
						} 
					}
					value = getValue(field, value); 
					if (value != null) {
						HIDDEN hidden = new HIDDEN(field.getName(),value);
						mForm.addChild(hidden);
					}
					continue;
				}
				TR row = new TR();
				TD column = new TD();
				column.addAttribute("width","150px");
				column.setText(field.getLabel());
				row.addChild(column);
				column = new TD();
				if (field.getCompomentType() == UIConstants.COMPONENT_TYPE_TEXTINPUT) {
					TEXTEDIT textEdit = new TEXTEDIT(field.getName(),null);
					if (value != null) {
						textEdit.setValue(value.toString());
					}
					column.addChild(textEdit);
				} else if (field.getCompomentType() == UIConstants.COMPONENT_TYPE_PASSWORD) {
					column.addChild(new PASSWORD(field.getName(),null));
				} else if (field.getCompomentType() == UIConstants.COMPONENT_TYPE_COMBO) {
					COMBO combo = new COMBO(field.getName(), null,field.getDatasource().getData(),value);
					column.addChild(combo.getView());
				}  else if (field.getCompomentType() == UIConstants.COMPONENT_TYPE_LABEL) {
					if ((data != null) && 
							(dataMap.get(field.getName()) != null)) {
						if (field.getRenderer() != null) {
							BaseRenderer render = field.getRenderer();
							column.addChild(render.render(field, value.toString(),refreshKey));
						} else {
							String untText =  dataMap.get(field.getName()).toString();
							if (field.getType().equals(UIConstants.DATA_TYPE_DOUBLE)) {
								untText = String.format("%.3f", dataMap.get(field.getName()));
							} else if (field.getType() == UIConstants.DATA_TYPE_TIMESTAMP) {
								untText = TimeUtil.getStringFromTime(mDefinition.getTimeZone(),Long.parseLong(untText));
							}
							if (field.getUnit() != null) {
								untText =  untText + " " +field.getUnit();
							}
							SPAN span = new SPAN();
							span.addAttribute("id",field.getName()+"_"+refreshKey);
							span.addAttribute("name",field.getName()+"_"+refreshKey);
							span.setText(untText);
							if (field.getLink() != null) {
								BaseHTMLComponent link = field.getLink().getLink(dataMap);
								link.addChild(span);
								column.addChild(link);
							} else {
								column.addChild(span);
							}
						}
					}
					else {
						column.setText("-");
					}	
				}
				row.addChild(column);
				table.addChild(row);
			}
			blockdiv.addChild(table);
			spacer = new VerticleSpacer(20);
			blockdiv.addChild(spacer.getView());
		}
		if (mDefinition.getButtonList().size() > 0) {
			Div formFooterDiv = new Div(null,"form_footer"); 
			formFooterDiv.addAttribute("style", ""+"width:"+mDefinition.getWidth()+"px");
			formFooterDiv.addAttribute(new Attribute("align","right"));
			for(int i=0;i < mDefinition.getButtonList().size(); i++) {
				String className = "form_button";
				if (mDefinition.getButtonList().get(i).getClassName() != null)
					className = mDefinition.getButtonList().get(i).getClassName();

				BUTTON button = new BUTTON(mDefinition.getButtonList().get(i).getId(), className,mDefinition.getButtonList().get(i).isSubmit());

				if (mDefinition.getButtonList().get(i).getOnClick() != null) {
					button.addAttribute("onclick",mDefinition.getButtonList().get(i).getOnClick());
				}
				button.setValue(mDefinition.getButtonList().get(i).getLabel());
				formFooterDiv.addChild(button);
			}
			mForm.addChild(formFooterDiv);
		}
		getView().addChild(mForm);
	}
	public Map<String, Object> getDataMap() {
		return dataMap;
	}
	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
}
