package com.kickstartapp.popups 
{
	import com.kickstartapp.data.GlobalData;
	import feathers.controls.Button;
	import feathers.controls.Header;
	import feathers.controls.Label;
	import feathers.controls.Panel;
	import feathers.controls.ScrollBar;
	import feathers.controls.ScrollBarDisplayMode;
	import feathers.controls.ScrollPolicy;
	import feathers.controls.ScrollText;
	import feathers.core.PopUpManager;
	import starling.core.Starling;
	import starling.display.DisplayObject;
	import starling.events.Event;
	
	/**
	 * ...
	 * @author Aditya
	 */
	public class LogPopUp extends Panel 
	{
		private var _logLabel:ScrollText;
		
		public function LogPopUp() 
		{
			super();
			
		}
		
		override protected function initialize():void 
		{
			super.initialize();
			
			this.title = "Logs";
			this.verticalScrollPolicy = ScrollPolicy.OFF;
			this.horizontalScrollPolicy = ScrollPolicy.OFF;
			this.scrollBarDisplayMode = ScrollBarDisplayMode.NONE;
			this.footerFactory = function():Header
			{
				var foot:Header = new Header();
				
				var clearLogs:Button = new Button();
				clearLogs.label = "Clear";
				clearLogs.addEventListener(Event.TRIGGERED, onClearButton);
				
				var closeButton:Button = new Button();
				closeButton.label = "Close";
				closeButton.addEventListener(Event.TRIGGERED, onCloseButton);
				
				foot.rightItems = new <DisplayObject>[clearLogs, closeButton];
				return foot;
			}
			
			_logLabel = new ScrollText();
			_logLabel.width = 800;
			_logLabel.height = 400;
			_logLabel.text = GlobalData.logs;
			this.addChild(_logLabel);
			
			Starling.current.stage.addEventListener(Event.UPDATE, onLogUpdate);
		}
		
		private function onLogUpdate(e:Event):void 
		{
			if (_logLabel != null) 
			{
				_logLabel.text = GlobalData.logs;
				_logLabel.validate();
				_logLabel.scrollToPosition(0, _logLabel.maxVerticalScrollPosition, 0.3);
			}
		}
		
		private function onClearButton(e:Event):void 
		{
			GlobalData.logs = "";
			_logLabel.text = "";
		}
		
		private function onCloseButton(e:Event):void 
		{
			Starling.current.stage.removeEventListener(Event.UPDATE, onLogUpdate);
			PopUpManager.removePopUp(this, true);
		}
	}

}