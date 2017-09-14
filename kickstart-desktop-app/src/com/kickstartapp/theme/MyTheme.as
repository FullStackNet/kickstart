package com.kickstartapp.theme 
{
	import com.kickstartapp.utils.ResourceListHeader;
	import feathers.themes.MetalWorksDesktopTheme;
	import starling.display.Image;
	/**
	 * ...
	 * @author Aditya
	 */
	public class MyTheme extends MetalWorksDesktopTheme
	{
		
		public function MyTheme() 
		{
			
		}
		
		public function getBackGroundSkin():Image
		{
			var backgroundSkin:Image = new Image(this.headerBackgroundSkinTexture);
			backgroundSkin.scale9Grid = SIMPLE_SCALE9_GRID;
			return backgroundSkin;
		}
	}

}