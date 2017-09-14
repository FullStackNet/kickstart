package com.kickstartapp
{
	import feathers.utils.ScreenDensityScaleFactorManager;
	import flash.display.Loader;
	import flash.display.Sprite;
	import flash.display.StageAlign;
	import flash.display.StageScaleMode;
	import flash.display3D.Context3DProfile;
	import flash.display3D.Context3DRenderMode;
	import flash.events.Event;
	import starling.core.Starling;
	
	/**
	 * ...
	 * @author Aditya
	 */
	[SWF(width="960",height="640",frameRate="60",backgroundColor="#ffffff")]
	public class Main extends Sprite 
	{
		private var _starling:Starling;
		private var _scaler:ScreenDensityScaleFactorManager;
		private var _launchImage:Loader;
		
		public function Main() 
		{
			if(this.stage)
			{
				this.stage.scaleMode = StageScaleMode.NO_SCALE;
				this.stage.align = StageAlign.TOP_LEFT;
			}
			
			this.mouseEnabled = this.mouseChildren = false;
			this.loaderInfo.addEventListener(Event.COMPLETE, loaderInfo_completeHandler);
		}
		
		private function loaderInfo_completeHandler(event:Event):void
		{
			Starling.multitouchEnabled = false;
			
			this._starling = new Starling(Root, this.stage, null, null, Context3DRenderMode.AUTO, Context3DProfile.BASELINE);
			this._starling.supportHighResolutions = true;
			this._starling.skipUnchangedFrames = true;
			this._starling.start();
			
			this._scaler = new ScreenDensityScaleFactorManager(this._starling);
			this.stage.addEventListener(Event.DEACTIVATE, stage_deactivateHandler, false, 0, true);
		}

		private function stage_deactivateHandler(event:Event):void
		{
			this._starling.stop(true);
			this.stage.addEventListener(Event.ACTIVATE, stage_activateHandler, false, 0, true);
		}

		private function stage_activateHandler(event:Event):void
		{
			this.stage.removeEventListener(Event.ACTIVATE, stage_activateHandler);
			this._starling.start();
		}
	}
	
}