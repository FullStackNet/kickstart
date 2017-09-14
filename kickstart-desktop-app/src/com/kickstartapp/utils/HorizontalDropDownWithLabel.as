package com.kickstartapp.utils
{
	import com.kickstartapp.data.AppConstants;
	import feathers.controls.Label;
	import feathers.controls.LayoutGroup;
	import feathers.controls.PickerList;
	import feathers.controls.TextInput;
	import feathers.controls.renderers.DefaultListItemRenderer;
	import feathers.controls.renderers.IListItemRenderer;
	import feathers.data.ArrayCollection;
	import feathers.layout.HorizontalLayout;
	import feathers.layout.VerticalAlign;
	
	/**
	 * ...
	 * @author Aditya
	 */
	public class HorizontalDropDownWithLabel extends LayoutGroup
	{
		private var _label:Label;
		private var _pickerList:PickerList;
		private var _labelText:String;
		private var _listData:ArrayCollection;
		private var _dropDownPrompt:String;
		
		public function HorizontalDropDownWithLabel(labelText:String, dropDownPrompt:String, listData:ArrayCollection)
		{
			super();
			
			_labelText = labelText;
			_dropDownPrompt = dropDownPrompt;
			_listData = listData;
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
			
			_pickerList = new PickerList();
			_pickerList.dataProvider = _listData;
			_pickerList.prompt = _dropDownPrompt;
			_pickerList.selectedIndex = -1;
			_pickerList.labelField = "name";
			_pickerList.minWidth = AppConstants.MIN_WIDTH;
			_pickerList.itemRendererFactory = function():IListItemRenderer
			{
				var itemRenderer:DefaultListItemRenderer = new DefaultListItemRenderer();
				itemRenderer.labelField = "name";
				return itemRenderer;
			}
			this.addChild(_pickerList);
		}
		
		public function setSelectedObject(index:uint):void 
		{
			_pickerList.selectedIndex = index;
		}
		
		public function getSelectedObject():Object
		{
			return _pickerList.selectedItem;
		}
	}

}