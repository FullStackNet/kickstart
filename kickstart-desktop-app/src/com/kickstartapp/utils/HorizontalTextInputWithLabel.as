package com.kickstartapp.utils 
{
	import com.kickstartapp.data.AppConstants;
	import feathers.controls.Label;
	import feathers.controls.LayoutGroup;
	import feathers.controls.TextInput;
	import feathers.layout.HorizontalLayout;
	import feathers.layout.VerticalAlign;
	
	/**
	 * ...
	 * @author Aditya
	 */
	public class HorizontalTextInputWithLabel extends LayoutGroup 
	{
		private var _allowedValues:String;
		private var _label:Label;
		private var _inputText:TextInput;
		private var _labelText:String;
		private var _promptText:String;
		
		public function HorizontalTextInputWithLabel(labelText:String, promptText:String) 
		{
			super();
			
			_labelText = labelText;
			_promptText = promptText;
			_allowedValues = null;
		}
			
		override protected function initialize():void 
		{
			super.initialize();
			
			this.height = 40;
			
			var horizontalLayout:HorizontalLayout = new HorizontalLayout();
			horizontalLayout.distributeWidths = true;
			horizontalLayout.gap = 10;
			horizontalLayout.verticalAlign = VerticalAlign.MIDDLE;
			horizontalLayout.paddingTop = 10;
			this.layout = horizontalLayout;
			
			_label = new Label();
			_label.text = _labelText;
			_label.minWidth = AppConstants.MIN_WIDTH;
			this.addChild(_label);
			
			_inputText = new TextInput();
			_inputText.prompt = _promptText;
			_inputText.promptProperties.alpha = 0.2;
			_inputText.minWidth = AppConstants.MIN_WIDTH;
			_inputText.restrict = _allowedValues;
			this.addChild(_inputText);
		}
		
		public function setValue(value:String):void 
		{
			_inputText.text = value;
		}
		
		public function getValue():String
		{
			return _inputText.text;
		}
		
		public function set allowedValues(value:String):void 
		{
			_allowedValues = value;
		}
	}

}