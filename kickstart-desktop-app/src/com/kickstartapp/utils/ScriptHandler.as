package com.kickstartapp.utils
{
	import com.kickstartapp.data.GlobalData;
	import flash.desktop.NativeProcess;
	import flash.desktop.NativeProcessStartupInfo;
	import flash.desktop.SystemIdleMode;
	import flash.events.Event;
	import flash.events.IOErrorEvent;
	import flash.events.NativeProcessExitEvent;
	import flash.events.ProgressEvent;
	import flash.filesystem.File;
	import flash.filesystem.FileMode;
	import flash.filesystem.FileStream;
	import flash.events.EventDispatcher;
	
	/**
	 * ...
	 * @author Aditya
	 */
	public class ScriptHandler extends EventDispatcher
	{
		private var _process:NativeProcess;
		
		public function ScriptHandler()
		{
		
		}
		
		public function runMavenToBuildProject(projectPomFilePath:String):void 
		{
			var cmd:File = new File("C:\\WINDOWS\\system32\\cmd.exe");
			var args:Vector.<String> = new Vector.<String>();
			args[0] = "/c";
			args[1] = "mvn clean install exec:java -f " + projectPomFilePath;
			
			var nativeProcessStartupInfo:NativeProcessStartupInfo = new NativeProcessStartupInfo();
			nativeProcessStartupInfo.executable = cmd;
			nativeProcessStartupInfo.arguments = args;
			
			_process = new NativeProcess();
			_process.addEventListener(NativeProcessExitEvent.EXIT, onExit);
			_process.addEventListener(Event.STANDARD_ERROR_CLOSE, standardErrorClose);
			_process.addEventListener(ProgressEvent.STANDARD_ERROR_DATA, onErrorData);
			_process.addEventListener(IOErrorEvent.STANDARD_ERROR_IO_ERROR, onIOError);
			_process.addEventListener(Event.STANDARD_INPUT_CLOSE, standardInputClose);
			_process.addEventListener(IOErrorEvent.STANDARD_INPUT_IO_ERROR, onIOError);
			_process.addEventListener(ProgressEvent.STANDARD_INPUT_PROGRESS, standardInputProgress);
			_process.addEventListener(Event.STANDARD_OUTPUT_CLOSE, standardOutpoutClose);
			_process.addEventListener(ProgressEvent.STANDARD_OUTPUT_DATA, onOutputData);
			_process.addEventListener(IOErrorEvent.STANDARD_OUTPUT_IO_ERROR, onIOError);
			_process.start(nativeProcessStartupInfo);
		}
		
		public function startScript(batchFileScript:String):void
		{
			var cmd:File = new File("C:\\WINDOWS\\system32\\cmd.exe");
			var batFile:File = new File(GlobalData.nativeProjectFolderPath + File.separator + "kickstart.bat");
			var fileStream:FileStream = new FileStream();
			fileStream.open(batFile, FileMode.WRITE);
			fileStream.writeUTFBytes(batchFileScript);
			fileStream.close();
			
			var args:Vector.<String> = new Vector.<String>();
			args[0] = "/c";
			args[1] = batFile.nativePath;
			
			var nativeProcessStartupInfo:NativeProcessStartupInfo = new NativeProcessStartupInfo();
			nativeProcessStartupInfo.executable = cmd;
			nativeProcessStartupInfo.arguments = args;
			
			_process = new NativeProcess();
			_process.addEventListener(NativeProcessExitEvent.EXIT, onExit);
			_process.addEventListener(Event.STANDARD_ERROR_CLOSE, standardErrorClose);
			_process.addEventListener(ProgressEvent.STANDARD_ERROR_DATA, onErrorData);
			_process.addEventListener(IOErrorEvent.STANDARD_ERROR_IO_ERROR, onIOError);
			_process.addEventListener(Event.STANDARD_INPUT_CLOSE, standardInputClose);
			_process.addEventListener(IOErrorEvent.STANDARD_INPUT_IO_ERROR, onIOError);
			_process.addEventListener(ProgressEvent.STANDARD_INPUT_PROGRESS, standardInputProgress);
			_process.addEventListener(Event.STANDARD_OUTPUT_CLOSE, standardOutpoutClose);
			_process.addEventListener(ProgressEvent.STANDARD_OUTPUT_DATA, onOutputData);
			_process.addEventListener(IOErrorEvent.STANDARD_OUTPUT_IO_ERROR, onIOError);
			_process.start(nativeProcessStartupInfo);
		}
		
		private function standardOutpoutClose(evt:Event):void
		{
			log(this, "standardOutpoutClose");
		}
		
		private function standardInputProgress(evt:ProgressEvent):void
		{
			log(this, "standardInputProgress");
		}
		
		private function standardInputClose(event:Event):void
		{
			log(this, "standardInputClose");
		}
		
		private function standardErrorClose(event:Event):void
		{
			log(this, "standardErrorClose");
		}
		
		private function onOutputData(event:ProgressEvent):void
		{
			var output:String = _process.standardOutput.readUTFBytes(_process.standardOutput.bytesAvailable);
			if (output.indexOf("Kickstart-Done") != -1)
			{
				log(this, "-----------x-----------");
			}
			
			log(this, "Got: ", output);
		}
		
		private function onErrorData(event:ProgressEvent):void
		{
			log(this, "ERROR -", _process.standardError.readUTFBytes(_process.standardError.bytesAvailable));
		}
		
		private function onExit(event:NativeProcessExitEvent):void
		{
			log(this, "Process exited with ", event.exitCode);
			
			if (event.exitCode == 0)
			{
				this.dispatchEvent(new Event(Event.COMPLETE));
			}
		}
		
		private function onIOError(event:IOErrorEvent):void
		{
			log(this, event.toString());
		}
	}

}