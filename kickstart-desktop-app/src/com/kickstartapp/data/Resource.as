package com.kickstartapp.data
{
	
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
		
		public function updateField(fieldId:Number, fieldName:String, fieldType:String, fieldLength:uint):void
		{
			for (var i:int = 0; i < fields.length; i++)
			{
				if (fields[i].id == fieldId)
				{
					fields[i].fieldName = fieldName;
					fields[i].fieldType = fieldType;
					fields[i].fieldLength = fieldLength;
					return;
				}
			}
		}
	}
}