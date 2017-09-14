package com.kickstartapp.utils 
{
	/**
	 * ...
	 * @author Aditya
	 */
	public class Utils 
	{
		public static function getPomString(src:String, packageName:String, projectName:String, versionNumber:String):String
		{
			src = src.replace("${groupId}", packageName);
			src = src.replace("${artifactId}", projectName);
			src = src.replace("${version}", versionNumber);
			
			return src;
		}
	}

}