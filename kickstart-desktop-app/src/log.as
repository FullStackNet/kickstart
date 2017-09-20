package  
{
	import com.kickstartapp.data.GlobalData;
	import flash.utils.getQualifiedClassName;
	import starling.core.Starling;
	import starling.events.Event;
	
	/**
	 * ...
	 * @author Aditya
	 */
    public function log(thisClass:*, ...args):void 
	{
		var className:String = String(getQualifiedClassName(thisClass).split("::")[1]);
		
		var str:String = String(args).replace(",", " ");
     	trace("[" + className + "]", str);
		
		GlobalData.logs += "[" + className + "] " + str + "\n";
		Starling.current.stage.dispatchEventWith(Event.UPDATE, false);
    }

}