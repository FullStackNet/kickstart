package platform.webservice.ui.component;

import java.util.ArrayList;
import java.util.Map;

import platform.util.TimeUtil;
import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.definition.Block;
import platform.webservice.ui.definition.Field;
import platform.webservice.ui.definition.FormDefinition;
import platform.webservice.ui.definition.IdValue;
import platform.webservice.ui.html.BUTTON;
import platform.webservice.ui.html.BaseHTMLComponent;
import platform.webservice.ui.html.COMBO;
import platform.webservice.ui.html.Div;
import platform.webservice.ui.html.FILEINPUT;
import platform.webservice.ui.html.FORM;
import platform.webservice.ui.html.H2;
import platform.webservice.ui.html.HIDDEN;
import platform.webservice.ui.html.IMG;
import platform.webservice.ui.html.INPUT;
import platform.webservice.ui.html.JS;
import platform.webservice.ui.html.PASSWORD;
import platform.webservice.ui.html.SPAN;
import platform.webservice.ui.html.TABLE;
import platform.webservice.ui.html.TD;
import platform.webservice.ui.html.TEXT;
import platform.webservice.ui.html.TEXTAREA;
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
		ctx.getPageBuilder().addJS(new JS("action_handle.js", "/ui/js/"));
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
	protected String getImageSource(Field field, Map<String, Object> data) {
		return "#";
	}
	void buildUI(String op, Map<String, Object> data) {
		this.dataMap = data;
		// TODO Auto-generated method stub
		if (op != null)
			this.operation = op;
		populateDefinition();
		mForm = new FORM(mDefinition.getId(), mDefinition.getClassName());
		mForm.setMethod("POST");
		if (mDefinition.getFormSubmitURL() != null) {
			mForm.setAction(mDefinition.getFormSubmitURL());
		} else {
			mForm.setAction("#");
		}
		if (mDefinition.isUploadFileForm()) {
			mForm.addAttribute("enctype", "multipart/form-data");
		}
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
			if (mDefinition.getSubmitURL() == null) {
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
				if (field.isAddOnly()) {
					if (!"add".equalsIgnoreCase(getContext().getParamValue("op"))) {
						continue;
					}
				}
				if (field.isModifyOnly()) {
					if (!"modify".equalsIgnoreCase(getContext().getParamValue("op"))) {
						continue;
					}
				}
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
			table.addAttribute(new Attribute("cellspacing", "4"));
			table.addAttribute(new Attribute("cellpadding", "4"));
			TR row1 = new TR();
			TR row2 = new TR();
			int coulmn_count = 0;
			for(int j=0; j < block.getFields().size(); j++) {
				Field field = block.getFields().get(j);
				if (field.isAddOnly()) {
					if (!"add".equalsIgnoreCase(getContext().getParamValue("op"))) {
						continue;
					}
				}
				if (field.isModifyOnly()) {
					if (!"modify".equalsIgnoreCase(getContext().getParamValue("op"))) {
						continue;
					}
				}
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
				column.addAttribute("style","padding-left:10px;padding-top:10px;padding-bottom:10px;");
				if (field.isFullWidth() && UIConstants.COMPONENT_TYPE_TEXTAREA.equals(field.getCompomentType())) {
					column.addAttribute("colspan","2");
				} else if (field.getCompomentType() == UIConstants.COMPONENT_TYPE_PHOTOUPLOAD) { 
					IMG img = new IMG();
					img.setSRC(getImageSource(field,dataMap));
					column.addChild(img);
					row.addChild(column);
					column = new TD();
					column.addAttribute("style","padding-left:10px;padding-top:10px;padding-bottom:10px;");

				}else if (field.getCompomentType() == UIConstants.COMPONENT_TYPE_PHOTO) { 
					IMG img = new IMG();
					img.setSRC(getImageSource(field,dataMap));
					column.addChild(img);
					row.addChild(column);
					column = new TD();
					column.addAttribute("style","padding-left:10px;padding-top:10px;padding-bottom:10px;");
				}else {
					column.addAttribute("width","150px");
					column.setText(field.getLabel());
					if (block.isHorizontalDisplay()) {
						row1.addChild(column);
					} else {
						row.addChild(column);
					}

					column = new TD();
					column.addAttribute("style","padding-left:10px;padding-top:10px;padding-bottom:10px;");

				}
				if (field.getCompomentType() == UIConstants.COMPONENT_TYPE_TEXTINPUT) {
					TEXTEDIT textEdit = new TEXTEDIT(field.getName(),null);
					if (field.isUpperCase()) {
						textEdit.addStyle("text-transform", "uppercase");
					}
					if (value != null) {
						if (UIConstants.DATA_TYPE_INT.equals(field.getType())) {
							value = ""+Math.round(Double.parseDouble(value.toString()));
						}
						textEdit.setValue(value.toString());
					}
					if (field.isReadOnly()) {
						textEdit.addAttribute("readonly", "true");
						textEdit.addStyle("background-color", "silver");
					}
					if ((field.getMaxLength() != null) && field.getMaxLength() > 0) {
						textEdit.addAttribute("maxlength", ""+field.getMaxLength());
					}
					if (field.getHint() != null) {
						textEdit.addAttribute("placeholder", ""+field.getHint());
					}
					if (block.isHorizontalDisplay()) {
						if (field.getWidth() > 0) {
							textEdit.addStyle("width", field.getWidth()+"px");
						} else {
							textEdit.addStyle("width", "auto");
						}
					}
					column.addChild(textEdit);
					if (field.isShowCount()) {
						textEdit.addAttribute("onkeyup","showCount('input_"+field.getName()+"_div',this,"+field.getMaxLength()+");");
						Div div = new Div();
						div.addAttribute("id", "input_"+field.getName()+"_div");
						div.addAttribute("style", "margin-top:10px");
						column.addChild(div);

					}
				}else if (field.getCompomentType() == UIConstants.COMPONENT_TYPE_FILEUPLOAD) {
					FILEINPUT fileInput = new FILEINPUT(field.getName(),null);
					fileInput.addAttribute("name", field.getName());
					column.addChild(fileInput);
				}else if (field.getCompomentType() == UIConstants.COMPONENT_TYPE_PHOTOUPLOAD) {
					FILEINPUT fileInput = new FILEINPUT(field.getName(),null);
					fileInput.addAttribute("name", field.getName());
					column.addChild(fileInput);
				}	else if (field.getCompomentType() == UIConstants.COMPONENT_TYPE_DATEPICKER) {

					TEXTEDIT textEdit = new TEXTEDIT(field.getName(),null);
					if (block.isHorizontalDisplay()) {
						if (field.getWidth() > 0) {
							textEdit.addStyle("width", field.getWidth()+"px");
						} else {
							textEdit.addStyle("width", "auto");
						}
					}
					column.addChild(textEdit);
					String dateJS  = "<script>\n" +
							"$(function() {\n" +
							"$(\"#"+field.getName()+"\").datepicker();\n" +
							"$(\"#"+field.getName()+"\").datepicker(\"option\", \"dateFormat\", \"dd-mm-yy\");\n";
					if (value != null) {
						dateJS = dateJS +	"var queryDate = '"+value.toString()+"';\n"+
								"var parsedDate = $.datepicker.parseDate('dd-mm-yy', queryDate);\n"+
								"$('#"+field.getName()+"').datepicker('setDate', parsedDate);\n";
					}
					dateJS = dateJS + "});\n"+
							"</script>\n";
					column.addChild(new TEXT(dateJS));
				} else if (field.getCompomentType() == UIConstants.COMPONENT_TYPE_TEXTAREA) {
					if (field.isFullWidth()) {
						column.addChild(new TEXT(field.getLabel()+":"));
					}
					TEXTAREA textArea = new TEXTAREA(field.getName(),null,field.isFullWidth());
					if (value != null) {
						textArea.setText(value.toString());
					}
					column.addChild(textArea);
				} else if (field.getCompomentType() == UIConstants.COMPONENT_TYPE_PASSWORD) {
					PASSWORD password = new PASSWORD(field.getName(),null);
					if (value != null) {
						password.addAttribute("value",value.toString());
					}
					column.addChild(password);
				} else if (field.getCompomentType() == UIConstants.COMPONENT_TYPE_COMBO) {
					ArrayList<IdValue> list = field.getDatasource().getData();
					int size = field.getDatasource().getData().size();
					int beforeSize = field.getDatasource().getAdditionalBeforeEntryCount();
					int afterSize = field.getDatasource().getAdditionalAfterEntryCount();
					int actualSize = size - beforeSize -afterSize;
					if ((list != null) && (list.size() > beforeSize)  && field.isHideOnSingleEntry() && (actualSize == 1)) {
						IdValue idvalue = (IdValue)list.get(beforeSize);
						HIDDEN hidden = new HIDDEN(field.getName(),idvalue.getId());
						mForm.addChild(hidden);
						continue;
					} else {
						COMBO combo = new COMBO(field.getName(), null,field.getDatasource().getData(),value);
						
						if (block.isHorizontalDisplay()) {
							if (field.getWidth() > 0) {
								combo.getView().addStyle("width", field.getWidth()+"px");
							} else {
								combo.getView().addStyle("width", "auto");
							}
						}
						column.addChild(combo.getView());

					}

				} else if (field.getCompomentType() == UIConstants.COMPONENT_TYPE_AUTOCOMPLETE) {
					ArrayList<IdValue> list = field.getDatasource().getData();
					String js  = "<script>\n" ;
					js = js +" var "+ field.getName()+"_autocomplete_data = [";
					if (list.size() > 0) {
						for (int ii =0; ii < list.size(); ii++) {
							js = js +" {label :\""+list.get(ii).getValue()+"\",value : "+"\""+list.get(ii).getId()+"\"}";
							if (i < (list.size()-1)) {
								js = js+",";
							}
							js = js+"\n";
						}
					}
					js = js +" ];\n";
					
					js = js +"$(function() {\n" +
								"$(\"#"+field.getName()+"_label\").autocomplete({source : "+field.getName()+"_autocomplete_data,"+
								 "focus: function( event, ui ) {\n" +
								 	"$(\"#"+field.getName()+"\").val( ui.item.label );\n" +
								 		"return false;\n"+
			               			"},\n"+
			               			"select: function( event, ui ) {\n"+
								              "$(\"#"+field.getName()+"_label\").val(ui.item.label );\n"+
								               "$(\"#"+field.getName()+"\" ).val( ui.item.value );\n"+
								               "return false;\n"+
								            "}\n"+
							"});\n" ;
					js = js + "});\n"+
							"</script>\n";
					column.addChild(new TEXT(js));
					HIDDEN hidden = new HIDDEN(field.getName(),value);
					column.addChild(hidden);
					INPUT combo = new INPUT(field.getName()+"_label", null);
					if (block.isHorizontalDisplay()) {
						if (field.getWidth() > 0) {
							combo.addStyle("width", field.getWidth()+"px");
						} else {
							combo.addStyle("width", "auto");
						}
					}
					column.addChild(combo);

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
				if (block.isHorizontalDisplay()) {
					row2.addChild(column);
					coulmn_count ++;
					if (coulmn_count == block.getColumns()) {
						table.addChild(row1);
						table.addChild(row2);

						row1 = new TR();
						row2 = new TR();
						coulmn_count = 0;
					}
				} else {
					row.addChild(column);
					table.addChild(row);
				}
			}
			table.addChild(row1);
			table.addChild(row2);
			blockdiv.addChild(table);
			spacer = new VerticleSpacer(20);
			blockdiv.addChild(spacer.getView());
		}
		if (mDefinition.getTitle() != null) {
			Div formHeaderDiv = new Div(null,"form_header"); 
			formHeaderDiv.addAttribute("style", ""+"width:"+mDefinition.getWidth()+"px");
			formHeaderDiv.addAttribute("align","center");
			formHeaderDiv.addChild(new H2(mDefinition.getTitle()));
			getView().addChild(formHeaderDiv);
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
