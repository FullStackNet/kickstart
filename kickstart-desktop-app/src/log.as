package  
{
	import flash.utils.getQualifiedClassName;
	
	/**
	 * ...
	 * @author Aditya
	 */
    public function log(thisClass:*, ...args):void 
	{
		var className:String = String(getQualifiedClassName(thisClass).split("::")[1]);
		
		var str:String = String(args).replace(",", " ");
     	trace("[" + className + "]", str);
    }

}