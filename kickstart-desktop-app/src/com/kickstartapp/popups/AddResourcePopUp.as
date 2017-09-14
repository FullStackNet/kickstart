package com.kickstartapp.popups
{
	import com.kickstartapp.utils.HorizontalDropDownWithLabel;
	import com.kickstartapp.utils.HorizontalTextInputWithLabel;
	import feathers.controls.Button;
	import feathers.controls.Header;
	import feathers.controls.Label;
	import feathers.controls.LayoutGroup;
	import feathers.controls.Panel;
	import feathers.controls.TextCallout;
	import feathers.controls.TextInput;
	import feathers.core.PopUpManager;
	import feathers.data.ArrayCollection;
	import feathers.layout.HorizontalAlign;
	import feathers.layout.HorizontalLayout;
	import feathers.layout.VerticalAlign;
	import feathers.layout.VerticalLayout;
	import starling.display.DisplayObject;
	import starling.events.Event;
	
	/**
	 * ...
	 * @author Aditya
	 */
	public class AddResourcePopUp extends Panel
	{
		private var _resourceNameInput:HorizontalTextInputWithLabel;
		private var _clusterInput:HorizontalDropDownWithLabel;
		private var _clusterArrayCollection:ArrayCollection;
		private var _addButtonLabel:String;
		
		public function AddResourcePopUp()
		{
			super();
		
		}
		
		override protected function initialize():void
		{
			super.initialize();
			
			var verticalLayout:VerticalLayout = new VerticalLayout();
			verticalLayout.gap = 5;
			verticalLayout.padding = 15;
			verticalLayout.horizontalAlign = HorizontalAlign.JUSTIFY;
			verticalLayout.verticalAlign = VerticalAlign.TOP;
			this.layout = verticalLayout;
			
			_addButtonLabel = "Add";
			
			this.title = "Add Resource";
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
			
			_resourceNameInput = new HorizontalTextInputWithLabel("Resource Name: ", "For ex : user");
			this.addChild(_resourceNameInput);
			_resourceNameInput.initializeNow();
			
			_clusterArrayCollection = new ArrayCollection();
			_clusterArrayCollection.addItem({id:1, name:"CLUSTER_1"});
			_clusterArrayCollection.addItem({id:2, name:"CLUSTER_2"});
			_clusterArrayCollection.addItem({id:3, name:"CLUSTER_3"});
			
			_clusterInput = new HorizontalDropDownWithLabel("Cluster: ", "Select a cluster", _clusterArrayCollection);
			this.addChild(_clusterInput);
			_clusterInput.initializeNow();
		}
		
		public function setValuesToEdit(resourceName:String, clusterName:String):void 
		{
			this.title = "Update resource";
			_addButtonLabel = "Update";
			
			_resourceNameInput.setValue(resourceName);
			
			for (var i:int = 0; i < _clusterArrayCollection.length; i++) 
			{
				if (clusterName == _clusterArrayCollection.getItemAt(i).name)
				{
					_clusterInput.setSelectedObject(i);
					break;
				}
			}
		}
		
		private function onAddButton(e:Event):void 
		{
			var resourceName:String = _resourceNameInput.getValue();
			var clusterName:String;
			
			if (resourceName.length == 0)
			{
				TextCallout.show("Cannot be empty!", _resourceNameInput);
				return;
			}
			
			if (_clusterInput.getSelectedObject() == null)
			{
				TextCallout.show("Select a cluster!", _clusterInput);
				return;
			}
			
			clusterName = _clusterInput.getSelectedObject().name;
			
			this.dispatchEventWith(Event.COMPLETE, false, { resource: resourceName, cluster: clusterName } );
		}
		
		private function onCancelButton(e:Event):void 
		{
			this.dispatchEventWith(Event.CLOSE);
		}
	}

}