package com.kickstartapp.utils 
{
	import com.kickstartapp.Root;
	import com.kickstartapp.data.GlobalData;
	import com.kickstartapp.data.Resource;
	import com.kickstartapp.popups.AddResourcePopUp;
	import com.kickstartapp.popups.FieldPopUp;
	import feathers.controls.Button;
	import feathers.controls.GroupedList;
	import feathers.controls.Header;
	import feathers.controls.Label;
	import feathers.controls.LayoutGroup;
	import feathers.controls.Panel;
	import feathers.controls.renderers.LayoutGroupGroupedListHeaderOrFooterRenderer;
	import feathers.core.PopUpManager;
	import feathers.layout.AnchorLayout;
	import feathers.layout.AnchorLayoutData;
	import feathers.skins.IStyleProvider;
	import feathers.themes.MetalWorksDesktopTheme;
	import starling.core.Starling;
	import starling.events.Event;
	
	/**
	 * ...
	 * @author Aditya
	 */
	public class ResourceListHeader extends LayoutGroupGroupedListHeaderOrFooterRenderer
	{
		public static var globalStyleProvider:IStyleProvider;
		
		private var _label:Label;
		private var _clusterLabel:Label;
		private var _resourcePopUp:AddResourcePopUp;
		private var _fieldPopUp:FieldPopUp;
		
		public function ResourceListHeader() 
		{
			super();
		}
		
		override protected function initialize():void 
		{
			super.initialize();
			
			this.layout = new AnchorLayout();
			this.height = 50;
			this.backgroundSkin = (Starling.current.root as Root).myTheme.getBackGroundSkin();
			
			_label = new Label();
			_label.layoutData = new AnchorLayoutData(NaN, NaN, NaN, 10, NaN, 0);
			this.addChild(_label);
			
			var clusterLayoutData:AnchorLayoutData = new AnchorLayoutData();
			clusterLayoutData.leftAnchorDisplayObject = _label;
			clusterLayoutData.verticalCenter = 0;
			clusterLayoutData.left = 50;
			
			_clusterLabel = new Label();
			_clusterLabel.layoutData = clusterLayoutData;
			this.addChild(_clusterLabel);
			
			var deleteButton:Button = new Button();
			deleteButton.label = "Delete";
			deleteButton.layoutData = new AnchorLayoutData(NaN, 10, NaN, NaN, NaN, 0);
			deleteButton.addEventListener(Event.TRIGGERED, onDeleteResource);
			this.addChild(deleteButton);
			
			var editButton:Button = new Button();
			editButton.label = "Edit";
			editButton.layoutData = new AnchorLayoutData(NaN, 10, NaN, NaN, NaN, 0);
			(editButton.layoutData as AnchorLayoutData).rightAnchorDisplayObject = deleteButton;
			editButton.addEventListener(Event.TRIGGERED, onEditResource);
			this.addChild(editButton);
			
			var addFieldButton:Button = new Button();
			addFieldButton.label = "Add field";
			addFieldButton.layoutData = new AnchorLayoutData(NaN, 10, NaN, NaN, NaN, 0);
			(addFieldButton.layoutData as AnchorLayoutData).rightAnchorDisplayObject = editButton;
			addFieldButton.addEventListener(Event.TRIGGERED, onAddField);
			this.addChild(addFieldButton);
		}
		
		private function onAddField(e:Event):void 
		{
			_fieldPopUp = new FieldPopUp();
			_fieldPopUp.addEventListener(Event.COMPLETE, onFieldAdded);
			_fieldPopUp.addEventListener(Event.CLOSE, onFieldClosed);
			PopUpManager.addPopUp(_fieldPopUp);
		}
		
		private function onFieldAdded(e:Event):void 
		{
			(_data as Resource).addField(e.data.fieldname, e.data.fieldtype, e.data.fieldlength);
			this.dispatchEventWith(Event.UPDATE, true);
			closeFieldPopUp();
		}
		
		private function onFieldClosed(e:Event):void 
		{
			closeFieldPopUp();
		}
		
		private function onEditResource(e:Event):void 
		{
			_resourcePopUp = new AddResourcePopUp();
			_resourcePopUp.initializeNow();
			_resourcePopUp.setValuesToEdit((_data as Resource).resourceName, (_data as Resource).clusterName);
			_resourcePopUp.addEventListener(Event.COMPLETE, onResourceUpdated);
			_resourcePopUp.addEventListener(Event.CLOSE, onResourceUpdationCanceled);
			PopUpManager.addPopUp(_resourcePopUp);
		}
		
		private function onResourceUpdated(e:Event):void 
		{
			var len:uint = GlobalData.allResources.length;
			for (var i:int = 0; i < len; i++) 
			{
				if ((_data as Resource).id == GlobalData.allResources[i].id)
				{
					GlobalData.allResources[i].resourceName = e.data.resource;
					GlobalData.allResources[i].clusterName = e.data.cluster;
					this.dispatchEventWith(Event.UPDATE, true);
					closeAddResourcePopUp();
					return;
				}
			}
		}
		
		private function onResourceUpdationCanceled(e:Event):void 
		{
			closeAddResourcePopUp();
		}
		
		private function closeAddResourcePopUp():void 
		{
			if (_resourcePopUp == null)
				return;
			
			_resourcePopUp.removeEventListener(Event.COMPLETE, onResourceUpdated);
			_resourcePopUp.removeEventListener(Event.CLOSE, onResourceUpdationCanceled);
			PopUpManager.removePopUp(_resourcePopUp, true);
			_resourcePopUp = null;
		}
		
		private function closeFieldPopUp():void 
		{
			if (_fieldPopUp == null)
				return;
			
			_fieldPopUp.removeEventListener(Event.COMPLETE, onFieldAdded);
			_fieldPopUp.removeEventListener(Event.CLOSE, onFieldClosed);
			
			PopUpManager.removePopUp(_fieldPopUp, true);
			_fieldPopUp = null;
		}
		
		private function onDeleteResource(e:Event):void 
		{
			var len:uint = GlobalData.allResources.length;
			for (var i:int = 0; i < len; i++) 
			{
				if ((_data as Resource).id == GlobalData.allResources[i].id)
				{
					GlobalData.allResources.splice(i, 1);
					this.dispatchEventWith(Event.UPDATE, true);
					return;
				}
			}
		}
		
		override protected function commitData():void 
		{
			super.commitData();
			
			if (_data != null)
			{
				_label.text = (_data as Resource).resourceName;
				_clusterLabel.text = "Cluster: " + (_data as Resource).clusterName;
			}
		}
	}

}