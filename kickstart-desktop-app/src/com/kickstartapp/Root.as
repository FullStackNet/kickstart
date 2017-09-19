package com.kickstartapp 
{
	import com.kickstartapp.data.AppScreen;
	import com.kickstartapp.screens.screenmainmenu.MainMenuScreen;
	import com.kickstartapp.screens.screenprojectsetup.ProjectSetupScreen;
	import com.kickstartapp.theme.MyTheme;
	import feathers.controls.ScreenNavigator;
	import feathers.controls.ScreenNavigatorItem;
	import feathers.motion.Fade;
	import starling.display.Sprite;
	import starling.events.Event;
	
	/**
	 * ...
	 * @author Aditya
	 */
	public class Root extends Sprite 
	{
		private var _screenNavigator:ScreenNavigator;
		private var _myTheme:MyTheme;
		
		public function Root() 
		{
			super();
			this.addEventListener(Event.ADDED_TO_STAGE, addedToStageHandler);
		}
		
		private function addedToStageHandler(e:Event):void 
		{
			removeEventListener(Event.ADDED_TO_STAGE, addedToStageHandler);
			
			//theme initialisation
			_myTheme = new MyTheme();
			
			_screenNavigator = new ScreenNavigator();
			_screenNavigator.transition = Fade.createFadeInTransition(0.3);
			this.addChild(_screenNavigator);
			
			var mainMenuItem:ScreenNavigatorItem = new ScreenNavigatorItem(MainMenuScreen);
			mainMenuItem.setScreenIDForEvent(Event.CLOSE, AppScreen.SCREEN_PROJECT_SETUP);
			_screenNavigator.addScreen(AppScreen.SCREEN_MAIN_MENU, mainMenuItem);
			
			var projectSetupItem:ScreenNavigatorItem = new ScreenNavigatorItem(ProjectSetupScreen);
			projectSetupItem.setScreenIDForEvent(Event.CLOSE, AppScreen.SCREEN_MAIN_MENU);
			_screenNavigator.addScreen(AppScreen.SCREEN_PROJECT_SETUP, projectSetupItem);
			
			_screenNavigator.showScreen(AppScreen.SCREEN_MAIN_MENU);
		}
		
		public function get myTheme():MyTheme 
		{
			return _myTheme;
		}
		
	}

}