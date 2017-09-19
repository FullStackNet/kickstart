package com.kickstartapp.utils 
{
	/**
	 * ...
	 * @author Aditya
	 */
	public class Utils 
	{
		public static function getFirstLetterUppercase(value:String):String
		{
			var firstLetter:String = value.charAt(0);
			value = firstLetter.toUpperCase() + value.substring(1);
			return value;
		}
		
		static public function getProjectFileContent(projectName:String, packageName:String, versionNumber:String):String
		{
			var xml:XML = new XML(<project>
				<projectname>{projectName}</projectname>
				<packagename>{packageName}</packagename>
				<version>{versionNumber}</version>
			</project>);
			
			return xml.toString();
		}
	}

}