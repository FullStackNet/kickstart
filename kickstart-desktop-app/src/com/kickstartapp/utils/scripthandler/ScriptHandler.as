package com.kickstartapp.utils.scripthandler
{
	import adobe.utils.CustomActions;
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
	import flash.system.Capabilities;
	
	/**
	 * ...
	 * @author Aditya
	 */
	public class ScriptHandler extends EventDispatcher
	{
		public static const MVN_CLEAN_INSTALL_EXEC_JAVA:uint = 0;
		static public const MVN_CLEAN_INSTALL:uint = 1;
		
		private var _process:NativeProcess;
		private var _currentProcessStatus:ScriptStatus;
		
		public function ScriptHandler()
		{
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
		}
		
		public function runBat(workingDirectoryPath:String):void
		{
			var file:File = new File(workingDirectoryPath + "/script.bat");
			var fileStream:FileStream = new FileStream();
			fileStream.open(file, FileMode.WRITE);
			fileStream.writeUTFBytes("mkdir NewWay");
			fileStream.close();
			
			var args:Vector.<String> = new Vector.<String>();
			args[0] = "/c";
			args[1] = new File(workingDirectoryPath + "/script.bat").nativePath;
			
			var nativeProcessStartupInfo:NativeProcessStartupInfo = new NativeProcessStartupInfo();
			nativeProcessStartupInfo.executable = new File("C:/WINDOWS/system32/cmd.exe");
			nativeProcessStartupInfo.arguments = args;
			nativeProcessStartupInfo.workingDirectory = new File(workingDirectoryPath);
			
			_process.start(nativeProcessStartupInfo);
		}
		
		public function runMaven(mvnCommand:uint, projectPomFilePath:String, workingDirectoryPath:String):void
		{
			var nativeProcessStartupInfo:NativeProcessStartupInfo = new NativeProcessStartupInfo();
			var mvnProcess:ScriptStatus = new ScriptStatus();
			mvnProcess.mvnCommand = mvnCommand;
			mvnProcess.isCompleted = false;
			_currentProcessStatus = mvnProcess;
			
			if ((Capabilities.os.indexOf("Windows") >= 0))
			{
				// in windows
				var cmd:File = new File("C:/WINDOWS/system32/cmd.exe");
				var args:Vector.<String> = new Vector.<String>();
				args[0] = "/c";
				
				switch (mvnCommand)
				{
					case MVN_CLEAN_INSTALL_EXEC_JAVA: 
						args[1] = "mvn clean install exec:java -f " + projectPomFilePath;
						break;
					case MVN_CLEAN_INSTALL: 
						args[1] = "mvn clean install -f " + projectPomFilePath;
						break;
					default: 
				}
				
				nativeProcessStartupInfo.executable = cmd;
				nativeProcessStartupInfo.arguments = args;
			}
			else
			{
				var file:File = new File(workingDirectoryPath + "/kickstart-script.sh");
				var fileStream:FileStream = new FileStream();
				fileStream.open(file, FileMode.WRITE);
				
				switch (mvnCommand)
				{
					case MVN_CLEAN_INSTALL_EXEC_JAVA: 
						fileStream.writeUTFBytes("mvn clean install exec:java");
						break;
					case MVN_CLEAN_INSTALL: 
						fileStream.writeUTFBytes("mvn clean install");
						break;
					default: 
				}
				
				fileStream.close();
				
				nativeProcessStartupInfo.executable = new File(workingDirectoryPath + "/kickstart-script.sh");
				nativeProcessStartupInfo.workingDirectory = new File(projectPomFilePath);
			}
			
			_process.start(nativeProcessStartupInfo);
		}
		
		private function onExit(event:NativeProcessExitEvent):void
		{
			log(this, "Process exited with ", event.exitCode);
			
			if (event.exitCode == 0)
			{
				var completeEvent:Event = new Event(Event.COMPLETE);
				this.dispatchEvent(completeEvent);
			}
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
			log(this, output);
		}
		
		private function onErrorData(event:ProgressEvent):void
		{
			log(this, "ERROR -", _process.standardError.readUTFBytes(_process.standardError.bytesAvailable));
		}
		
		private function onIOError(event:IOErrorEvent):void
		{
			log(this, event.toString());
		}
		
		public function get currentProcessStatus():ScriptStatus
		{
			return _currentProcessStatus;
		}
	}

}