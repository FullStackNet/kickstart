package com.kickstartapp.data
{
	
	/**
	 * ...
	 * @author Aditya
	 */
	public class Field
	{
		public var id:Number;
		public var fieldName:String = "";
		public var fieldType:String = "";
		public var fieldLength:uint = 0;
		
		private var _display:String = "";
		
		public function Field()
		{
			id = Math.random() * 1000;
		}
		
		public function get display():String
		{
			_display = fieldName + " [type: " + fieldType + ", length: " + fieldLength + "]";
			return _display;
		}
	}

}