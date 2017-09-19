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
	}

}