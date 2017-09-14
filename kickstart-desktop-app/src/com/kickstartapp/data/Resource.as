package com.kickstartapp.data
{
	import feathers.controls.supportClasses.TextFieldViewPort;
	import starling.core.Starling;
	
	/**
	 * ...
	 * @author Aditya
	 */
	public class Resource
	{
		public var id:uint;
		public var header:Resource;
		
		public var resourceName:String;
		public var clusterName:String;
		public var fields:Vector.<Field>;
		
		public function Resource(name:String, cluster:String)
		{
			resourceName = name;
			clusterName = cluster;
			fields = new Vector.<Field>();
			
			header = this;
			id = new Date().getTime();
		}
		
		public function addField(fieldName:String, fieldType:String, fieldLength:uint):void
		{
			var field:Field = new Field();
			field.fieldName = fieldName;
			field.fieldType = fieldType;
			field.fieldLength = fieldLength;
			fields.push(field);
		}
	}
}

class Field
{
	public var fieldName:String = "";
	public var fieldType:String = "";
	public var fieldLength:uint = 0;
	
	private var _display:String = "";
	
	public function Field()
	{
		
	}
	
	public function get display():String 
	{
		_display = fieldName + " [type: " + fieldType + ", length: " + fieldLength + "]";
		return _display;
	}
	
	/*public function toJSON(s:String):*
	{
		var jsonString:String = "BLA";
		return jsonString;
	}*/
}