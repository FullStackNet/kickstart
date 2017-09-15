package com.kickstartapp.screens.screenprojectsetup
{
	import com.kickstartapp.data.GlobalData;
	import com.kickstartapp.data.Resource;
	import com.kickstartapp.popups.AddResourcePopUp;
	import com.kickstartapp.utils.FileWritingHandler;
	import com.kickstartapp.utils.ResourceListHeader;
	import feathers.controls.Alert;
	import feathers.controls.Button;
	import feathers.controls.GroupedList;
	import feathers.controls.Header;
	import feathers.controls.Label;
	import feathers.controls.LayoutGroup;
	import feathers.controls.PanelScreen;
	import feathers.controls.ScrollBarDisplayMode;
	import feathers.controls.ScrollPolicy;
	import feathers.controls.TextCallout;
	import feathers.controls.TextInput;
	import feathers.controls.renderers.DefaultGroupedListItemRenderer;
	import feathers.controls.renderers.IGroupedListItemRenderer;
	import feathers.core.PopUpManager;
	import feathers.data.ArrayCollection;
	import feathers.data.VectorHierarchicalCollection;
	import feathers.layout.HorizontalAlign;
	import feathers.layout.HorizontalLayout;
	import feathers.layout.VerticalAlign;
	import feathers.layout.VerticalLayout;
	import starling.events.Event;
	
	/**
	 * ...
	 * @author Aditya
	 */
	public class ProjectSetupScreen extends PanelScreen
	{
		private const TITLE_TEXT:String = "KICKSTART";
		private const PACKAGE_TEXT:String = "com.helloworld";
		
		private var _packageInput:TextInput;
		private var _infoLabel:Label;
		private var _resourceGroupList:GroupedList;
		private var _resourceList:VectorHierarchicalCollection;
		private var _addResourcePopUp:AddResourcePopUp;
		private var _projectNameInput:TextInput;
		private var _versionInput:TextInput;
		private var _fileHandler:FileWritingHandler;
		
		public function ProjectSetupScreen()
		{
			super();
			log(this, "Constructor");
		}
		
		override protected function initialize():void
		{
			super.initialize();
			log(this, "Initialise");
			
			var verticalLayout:VerticalLayout = new VerticalLayout();
			verticalLayout.gap = 10;
			verticalLayout.verticalAlign = VerticalAlign.TOP;
			verticalLayout.horizontalAlign = HorizontalAlign.CENTER;
			this.layout = verticalLayout;
			
			this.scrollBarDisplayMode = ScrollBarDisplayMode.NONE;
			this.verticalScrollPolicy = ScrollPolicy.OFF;
			this.horizontalScrollPolicy = ScrollPolicy.OFF;
			
			this.title = TITLE_TEXT;
			this.headerFactory = function():Header
			{
				var header:Header = new Header();
				header.minHeight = 60;
				return header;
			}
			
			//create a kickstart.project file in the selected folder
			//add info to that file about the project
			
			var projectInfoGroup:LayoutGroup = new LayoutGroup();
			projectInfoGroup.height = 40;
			this.addChild(projectInfoGroup);
			
			const PROMPT_ALPHA:Number = 0.2;
			
			var projectInfoGroupLayout:HorizontalLayout = new HorizontalLayout();
			projectInfoGroupLayout.distributeWidths = true;
			projectInfoGroupLayout.gap = 10;
			projectInfoGroupLayout.verticalAlign = VerticalAlign.MIDDLE;
			projectInfoGroupLayout.paddingTop = 10;
			projectInfoGroup.layout = projectInfoGroupLayout;
			
			var projectNameLabel:Label = new Label();
			projectNameLabel.text = "Project Name:";
			projectInfoGroup.addChild(projectNameLabel);
			
			_projectNameInput = new TextInput();
			_projectNameInput.prompt = "HelloWorld";
			_projectNameInput.promptProperties.alpha = PROMPT_ALPHA;
			_projectNameInput.addEventListener(starling.events.Event.CHANGE, onProjectNameChanged);
			projectInfoGroup.addChild(_projectNameInput);
			
			var packageNameLabel:Label = new Label();
			packageNameLabel.text = "Package:";
			projectInfoGroup.addChild(packageNameLabel);
			
			_packageInput = new TextInput();
			_packageInput.prompt = PACKAGE_TEXT;
			_packageInput.promptProperties.alpha = PROMPT_ALPHA;
			projectInfoGroup.addChild(_packageInput);
			
			var versionLabel:Label = new Label();
			versionLabel.text = "Version:";
			projectInfoGroup.addChild(versionLabel);
			
			_versionInput = new TextInput();
			_versionInput.prompt = "1.0.0";
			_versionInput.promptProperties.alpha = PROMPT_ALPHA;
			projectInfoGroup.addChild(_versionInput);
			
			var addResourceBtn:Button = new Button();
			addResourceBtn.label = "Add Resource";
			addResourceBtn.addEventListener(starling.events.Event.TRIGGERED, onAddResource);
			projectInfoGroup.addChild(addResourceBtn);
			
			var buttonsGroup:LayoutGroup = new LayoutGroup();
			buttonsGroup.height = 40;
			this.addChild(buttonsGroup);
			
			var buttonsGroupLayout:HorizontalLayout = new HorizontalLayout();
			buttonsGroupLayout.distributeWidths = true;
			buttonsGroupLayout.gap = 10;
			buttonsGroupLayout.verticalAlign = VerticalAlign.MIDDLE;
			buttonsGroup.layout = buttonsGroupLayout;
			
			var createResourcesBtn:Button = new Button();
			createResourcesBtn.label = "Create Resources";
			createResourcesBtn.addEventListener(starling.events.Event.TRIGGERED, onCreateResource);
			buttonsGroup.addChild(createResourcesBtn);
			
			var writeJavaClassesBtn:Button = new Button();
			writeJavaClassesBtn.label = "Write Java Classes";
			writeJavaClassesBtn.addEventListener(starling.events.Event.TRIGGERED, onWriteJavaClasses);
			buttonsGroup.addChild(writeJavaClassesBtn);
			
			_resourceList = new VectorHierarchicalCollection(GlobalData.allResources);
			_resourceList.childrenField = "fields";
			_resourceGroupList = new GroupedList();
			_resourceGroupList.isSelectable = false;
			_resourceGroupList.dataProvider = _resourceList;
			_resourceGroupList.addEventListener(starling.events.Event.UPDATE, onResourceUpdated);
			_resourceGroupList.headerRendererType = ResourceListHeader;
			_resourceGroupList.itemRendererFactory = function():IGroupedListItemRenderer
			{
				var itemRenderer:DefaultGroupedListItemRenderer = new DefaultGroupedListItemRenderer();
				itemRenderer.labelField = "display";
				itemRenderer.height = 40;
				itemRenderer.paddingLeft = 15;
				itemRenderer.isQuickHitAreaEnabled = true;
				itemRenderer.addEventListener(starling.events.Event.TRIGGERED, onFieldTapped);
				return itemRenderer;
			};
			this.addChild(_resourceGroupList);
			
			_infoLabel = new Label();
			_infoLabel.text = "Press 'Add Resource' button to add new resources.";
			_infoLabel.alpha = PROMPT_ALPHA;
			this.stage.addChild(_infoLabel);
			
			_fileHandler = new FileWritingHandler();
		}
		
		private function onCreateResource(e:starling.events.Event):void
		{
			if (_projectNameInput.text.length == 0)
			{
				TextCallout.show("Cannot be empty!", _projectNameInput);
				return;
			}
			
			if (_packageInput.text.length == 0)
			{
				TextCallout.show("Cannot be empty!", _packageInput);
				return;
			}
			
			if (_versionInput.text.length == 0)
			{
				TextCallout.show("Cannot be empty!", _versionInput);
				return;
			}
			
			_fileHandler.createResources(_projectNameInput.text, _packageInput.text, _versionInput.text);
		}
		
		private function onWriteJavaClasses(e:Event):void
		{
			var message:String = "Make sure you have compiled the resource app project (GenerateResource.java) before generating the java classes.";
			var title:String = "Alert";
			var buttons:ArrayCollection = new ArrayCollection([{label: "Ok", triggered: onWriteClasses}]);
			var alert:Alert = Alert.show(message, title, buttons);
		}
		
		private function onWriteClasses(e:Event):void
		{
			_fileHandler.writeJavaClasses();
		}
		
		private function onFieldTapped(e:starling.events.Event):void
		{
			log(this, "Field tapped!");
		}
		
		private function onAddResource(e:starling.events.Event):void
		{
			_addResourcePopUp = new AddResourcePopUp();
			_addResourcePopUp.addEventListener(starling.events.Event.COMPLETE, onResourceAdded);
			_addResourcePopUp.addEventListener(starling.events.Event.CLOSE, onResourceAdditionCanceled);
			
			PopUpManager.addPopUp(_addResourcePopUp, true, true);
		}
		
		private function onResourceUpdated(e:starling.events.Event):void
		{
			_resourceList.updateAll();
			toggleInfoMessage();
			closeAddResourcePopUp();
		}
		
		private function onResourceAdditionCanceled(e:starling.events.Event):void
		{
			closeAddResourcePopUp();
		}
		
		private function onResourceAdded(e:starling.events.Event):void
		{
			var resource:Resource = new Resource(e.data.resource, e.data.cluster);
			GlobalData.allResources.push(resource);
			_resourceList.updateAll();
			toggleInfoMessage();
			closeAddResourcePopUp();
		}
		
		private function closeAddResourcePopUp():void
		{
			if (_addResourcePopUp == null)
				return;
			
			_addResourcePopUp.removeEventListener(starling.events.Event.COMPLETE, onResourceAdded);
			_addResourcePopUp.removeEventListener(starling.events.Event.CLOSE, onResourceAdditionCanceled);
			PopUpManager.removePopUp(_addResourcePopUp, true);
			_addResourcePopUp = null;
		}
		
		private function onProjectNameChanged(e:starling.events.Event):void
		{
			var projectName:String = (e.target as TextInput).text;
			this.title = projectName.length > 0 ? TITLE_TEXT + ": " + projectName : TITLE_TEXT;
			_packageInput.text = projectName.length > 0 ? "com." + projectName.toLowerCase() : PACKAGE_TEXT;
		}
		
		private function toggleInfoMessage():void
		{
			_infoLabel.visible = !(GlobalData.allResources.length > 0);
		}
		
		override protected function draw():void
		{
			super.draw();
			
			_infoLabel.alignPivot();
			_infoLabel.x = this.width / 2;
			_infoLabel.y = this.height / 2;
			
			_resourceGroupList.width = this.width - 100;
			_resourceGroupList.height = this.height - _resourceGroupList.y - 100;
		}
	}

}