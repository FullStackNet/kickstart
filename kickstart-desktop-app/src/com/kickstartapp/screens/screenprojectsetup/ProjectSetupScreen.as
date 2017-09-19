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
	import flash.utils.getQualifiedClassName;
	import starling.display.DisplayObject;
	import starling.events.Event;
	import flash.events.Event;
	
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
			
			const PROMPT_ALPHA:Number = 0.2;
			
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
				header.paddingRight = 10;
				
				var addResourceBtn:Button = new Button();
				addResourceBtn.label = "Add Resource";
				addResourceBtn.addEventListener(starling.events.Event.TRIGGERED, onAddResource);
				
				header.rightItems = new <DisplayObject>[addResourceBtn];
				return header;
			}
			
			this.footerFactory = function():Header
			{
				var createResourcesBtn:Button = new Button();
				createResourcesBtn.label = "Create Project";
				createResourcesBtn.addEventListener(starling.events.Event.TRIGGERED, onCreateProject);
				
				var footer:Header = new Header();
				footer.minHeight = 40;
				footer.centerItems = new <DisplayObject>[createResourcesBtn];
				return footer;
			}
			
			var projectInfoGroup:LayoutGroup = new LayoutGroup();
			projectInfoGroup.height = 40;
			this.addChild(projectInfoGroup);
			
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
			_fileHandler.addEventListener(flash.events.Event.COMPLETE, onFolderAnalysisComplete);
			_fileHandler.analyseSelectedDirectory();
		}
		
		private function onFolderAnalysisComplete(e:flash.events.Event):void 
		{
			_projectNameInput.text = _fileHandler.projectName;
			_packageInput.text = _fileHandler.packageName;
			_versionInput.text = _fileHandler.versionNumber;
			
			var resourceNames:Vector.<String> = _fileHandler.assetManager.getObjectNames();
			for (var i:int = 0; i < resourceNames.length; i++) 
			{
				var resObject:Object = _fileHandler.assetManager.getObject(resourceNames[i]);
				var resource:Resource = new Resource(resourceNames[i], String(resObject[resourceNames[i]].cluster));
				//log(this, "R:", resource.resourceName, resource.clusterName);
				for (var field:Object in resObject[resourceNames[i]].fields) 
				{
					/*log(this, "\tField:", field);
					for (var prop:String in resObject[resourceNames[i]].fields[field]) 
					{
						log(this, "\t\tProName:", prop);
					}*/
					
					resource.addField(String(field), String(resObject[resourceNames[i]].fields[field].type), uint(resObject[resourceNames[i]].fields[field].length));
				}
				
				GlobalData.allResources.push(resource);
			}
			
			_resourceList.updateAll();
			toggleInfoMessage();
		}
		
		private function onCreateProject(e:starling.events.Event):void
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
			
			_fileHandler.createProject(_projectNameInput.text, _packageInput.text, _versionInput.text);
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
			
			_resourceGroupList.width = this.width - 100;
			_resourceGroupList.height = this.height - _resourceGroupList.y - 110;
			
			_infoLabel.alignPivot();
			_infoLabel.x = _resourceGroupList.x + _resourceGroupList.width / 2;
			_infoLabel.y = _resourceGroupList.y + _resourceGroupList.height / 2;
		}
	}

}