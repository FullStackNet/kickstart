package com.kickstartapp.popups 
{
	import com.kickstartapp.utils.HorizontalDropDownWithLabel;
	import com.kickstartapp.utils.HorizontalTextInputWithLabel;
	import feathers.controls.Button;
	import feathers.controls.Header;
	import feathers.controls.Panel;
	import feathers.controls.TextCallout;
	import feathers.core.PopUpManager;
	import feathers.data.ArrayCollection;
	import feathers.layout.HorizontalAlign;
	import feathers.layout.VerticalAlign;
	import feathers.layout.VerticalLayout;
	import starling.display.DisplayObject;
	import starling.events.Event;
	
	/**
	 * ...
	 * @author Aditya
	 */
	public class FieldPopUp extends Panel 
	{
		private var _addButtonLabel:String;
		private var _fieldNameInput:HorizontalTextInputWithLabel;
		private var _fieldType:HorizontalDropDownWithLabel;
		private var _fieldLength:HorizontalTextInputWithLabel;
		
		public function FieldPopUp() 
		{
			super();
			
		}
		
		override protected function initialize():void 
		{
			super.initialize();
			
			var verticalLayout:VerticalLayout = new VerticalLayout();
			verticalLayout.gap = 5;
			verticalLayout.padding = 10;
			verticalLayout.horizontalAlign = HorizontalAlign.JUSTIFY;
			verticalLayout.verticalAlign = VerticalAlign.TOP;
			this.layout = verticalLayout;
			
			_addButtonLabel = "Add";
			
			this.title = "Add Field";
			this.footerFactory = function():Header
			{
				var foot:Header = new Header();
				
				var addButton:Button = new Button();
				addButton.label = _addButtonLabel;
				addButton.addEventListener(Event.TRIGGERED, onAddButton);
				
				var cancelButton:Button = new Button();
				cancelButton.label = "Cancel";
				cancelButton.addEventListener(Event.TRIGGERED, onCancelButton);
				
				foot.rightItems = new <DisplayObject>[addButton, cancelButton];
				return foot;
			}
			
			_fieldNameInput = new HorizontalTextInputWithLabel("Field Name: ", "For ex : name");
			this.addChild(_fieldNameInput);
			_fieldNameInput.initializeNow();
			
			_fieldType = new HorizontalDropDownWithLabel("Field type: ", "", new ArrayCollection([ { id:1, name:"String" }, { id:2, name:"Long" }, { id:3, name:"timestamp" } ]));
			this.addChild(_fieldType);
			_fieldType.initializeNow();
			
			_fieldLength = new HorizontalTextInputWithLabel("Field length: ", "128");
			_fieldLength.allowedValues = "0-9";
			this.addChild(_fieldLength);
			_fieldLength.initializeNow();
		}
		
		private function onAddButton(e:Event):void 
		{
			var fieldName:String = _fieldNameInput.getValue();
			var fieldType:String;
			var fieldLength:uint;
			
			if (fieldName.length == 0)
			{
				TextCallout.show("Cannot be empty!", _fieldNameInput);
				return;
			}
			
			if (_fieldType.getSelectedObject() == null)
			{
				TextCallout.show("Select a type!", _fieldType);
				return;
			}
			
			fieldType = _fieldType.getSelectedObject().name;
			
			if (_fieldLength.getValue().length == 0)
			{
				TextCallout.show("Cannot be empty!", _fieldLength);
				return;
			}
			
			fieldLength = uint(_fieldLength.getValue());
			
			this.dispatchEventWith(Event.COMPLETE, false, { fieldname: fieldName, fieldtype: fieldType, fieldlength: fieldLength} );
		}
		
		private function onCancelButton(e:Event):void 
		{
			this.dispatchEventWith(Event.CLOSE);
		}
	}

}