package com.kickstartapp.screens.screenmainmenu
{
	import com.kickstartapp.data.GlobalData;
	import feathers.controls.Button;
	import feathers.controls.ButtonGroup;
	import feathers.controls.Label;
	import feathers.controls.Screen;
	import feathers.controls.TextCallout;
	import feathers.data.ArrayCollection;
	import feathers.layout.AnchorLayout;
	import feathers.layout.AnchorLayoutData;
	import feathers.layout.Direction;
	import flash.events.Event;
	import flash.filesystem.File;
	import starling.events.Event;
	
	
	/**
	 * ...
	 * @author Aditya
	 */
	public class MainMenuScreen extends Screen
	{
		private var menuGroup:ButtonGroup;
		
		public function MainMenuScreen()
		{
			super();
			log(this, "Constructor");
		}
		
		override protected function initialize():void
		{
			super.initialize();
			log(this, "Initialise");
			
			this.layout = new AnchorLayout();
			
			var layoutData:AnchorLayoutData = new AnchorLayoutData();
			layoutData.horizontalCenter = 0;
			layoutData.verticalCenter = 0;
			
			menuGroup = new ButtonGroup();
			menuGroup.direction = Direction.VERTICAL;
			menuGroup.gap = 10;
			menuGroup.height = 90;
			menuGroup.dataProvider = new ArrayCollection([{label: "Create Project", triggered: onCreateProject}, {label: "Open Project", triggered: onOpenProject}]);
			menuGroup.layoutData = layoutData;
			this.addChild(menuGroup);
			
			var welcomeLabelLayoutData:AnchorLayoutData = new AnchorLayoutData();
			welcomeLabelLayoutData.horizontalCenter = 0;
			welcomeLabelLayoutData.verticalCenter = -100;
			welcomeLabelLayoutData.verticalCenterAnchorDisplayObject = menuGroup;
			
			var welcomeLabel:Label = new Label();
			welcomeLabel.text = "Welcome to Kickstart";
			welcomeLabel.styleNameList.add(Label.ALTERNATE_STYLE_NAME_HEADING);
			welcomeLabel.layoutData = welcomeLabelLayoutData;
			this.addChild(welcomeLabel);
		}
		
		override protected function draw():void
		{
			super.draw();
		
		}
		
		private function onCreateProject(event:starling.events.Event):void
		{
			log(this, "Create a new project");
			var f:File = File.documentsDirectory;
			
			try
			{
				f.addEventListener(flash.events.Event.SELECT, onFolderSelected);
				f.browseForDirectory("Choose a directory");
			}
			catch (err:Error)
			{
				log(this, "Some error occurred!");
				TextCallout.show("Some error occurred!", event.target as Button);
			}
		}
		
		private function onFolderSelected(e:flash.events.Event):void
		{
			var nativePath:String = (e.target as File).nativePath;
			GlobalData.nativeProjectFolderPath = nativePath;
			GlobalData.nativeProjectFolderPath = GlobalData.nativeProjectFolderPath.split("\\").join("/");
			
			log(this, "Folder selected:", GlobalData.nativeProjectFolderPath);
			this.dispatchEventWith(starling.events.Event.CLOSE);
		}
		
		private function onOpenProject(event:starling.events.Event):void
		{
		
		}
	}

}