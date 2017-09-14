package com.kickstartapp.utils
{
	import com.kickstartapp.data.GlobalData;
	import com.kickstartapp.data.Resource;
	import flash.events.Event;
	import flash.events.EventDispatcher;
	import flash.events.IOErrorEvent;
	import flash.events.ProgressEvent;
	import flash.filesystem.File;
	import flash.filesystem.FileMode;
	import flash.filesystem.FileStream;
	
	/**
	 * ...
	 * @author Aditya
	 */
	public class FileWritingHandler extends EventDispatcher
	{
		private var _totalResources:uint = 0;
		private var _generatedResourceCount:uint = 0;
		private var _projectName:String;
		private var _packageName:String;
		private var _versionNumber:String;
		
		public function FileWritingHandler()
		{
		
		}
		
		public function init(projectName:String, packageName:String, versionNumber:String):void
		{
			log(this, "Init");
			
			_projectName = projectName;
			_packageName = packageName;
			_versionNumber = versionNumber;
			
			createFolderStructure();
			createPomFiles();
			copyStaticJavaFiles();
			createJSONResources();
			
			log(this, "All Done");
		}
		
		private function createFolderStructure():void 
		{
			var file:File;
			var folderPaths:Array = new Array();
			var rootPath:String = GlobalData.nativeProjectFolderPath + File.separator + _projectName + "-resource-app" + File.separator + "src" + File.separator + "main" + File.separator + "java";
			
			folderPaths.push(rootPath + File.separator + "application" + File.separator + "defined" + File.separator + "resource");
			folderPaths.push(rootPath + File.separator + "application" + File.separator + "helper");
			folderPaths.push(rootPath + File.separator + "application" + File.separator + "resource");
			folderPaths.push(rootPath + File.separator + "util");
			
			rootPath = GlobalData.nativeProjectFolderPath + File.separator + _projectName + "-web-app" + File.separator + "src" + File.separator + "main";
			
			folderPaths.push(rootPath + File.separator + "java" + File.separator + "application");
			folderPaths.push(rootPath + File.separator + "java" + File.separator + "controller");
			folderPaths.push(rootPath + File.separator + "java" + File.separator + "data");
			folderPaths.push(rootPath + File.separator + "java" + File.separator + "service");
			folderPaths.push(rootPath + File.separator + "java" + File.separator + "servlet");
			folderPaths.push(rootPath + File.separator + "java" + File.separator + "util");
			folderPaths.push(rootPath + File.separator + "resources");
			
			for (var l:int = 0; l < folderPaths.length; l++)
			{
				file = new File(folderPaths[l]);
				file.createDirectory();
			}
			
			folderPaths.length = 0;
			folderPaths = null;
			file = null;
		}
		
		private function createPomFiles():void
		{
			var srcData:String;
			var file:File = File.applicationDirectory.resolvePath("assets/resource-app-files/pom.xml");
			
			var fs:FileStream = new FileStream();
			fs.open(file, FileMode.READ)
			srcData = fs.readUTFBytes(fs.bytesAvailable);
			fs.close();
			
			srcData = srcData.split("${groupId}").join(_packageName);
			srcData = srcData.split("${artifactId}").join(_projectName);
			srcData = srcData.split("${version}").join(_versionNumber);
			
			file = new File(GlobalData.nativeProjectFolderPath + File.separator + _projectName + "-resource-app" + File.separator + "pom.xml");
			fs.open(file, FileMode.WRITE);
			fs.writeUTFBytes(srcData);
			fs.close();
			
			file = File.applicationDirectory.resolvePath("assets/web-app-files/pom.xml");
			fs.open(file, FileMode.READ)
			srcData = fs.readUTFBytes(fs.bytesAvailable);
			fs.close();
			
			srcData = srcData.split("${groupId}").join(_packageName);
			srcData = srcData.split("${artifactId}").join(_projectName);
			srcData = srcData.split("${version}").join(_versionNumber);
			
			file = new File(GlobalData.nativeProjectFolderPath + File.separator + _projectName + "-web-app" + File.separator + "pom.xml");
			fs.open(file, FileMode.WRITE);
			fs.writeUTFBytes(srcData);
			fs.close();
			file = null;
		}
		
		private function copyStaticJavaFiles():void
		{
			var filesToTransfer:Array = new Array();
			filesToTransfer.push({src: "assets/resource-app-files/LocalhostDBSetup.java", dest: String(GlobalData.nativeProjectFolderPath + File.separator + _projectName + "-resource-app" + File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + "util" + File.separator + "LocalhostDBSetup.java")});
			filesToTransfer.push({src: "assets/resource-app-files/GenerateResource.java", dest: String(GlobalData.nativeProjectFolderPath + File.separator + _projectName + "-resource-app" + File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + "application" + File.separator + "defined" + File.separator + "GenerateResource.java")});
			filesToTransfer.push({src: "assets/web-app-files/Application.java", dest: String(GlobalData.nativeProjectFolderPath + File.separator + _projectName + "-web-app" + File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + "application" + File.separator + "Application.java")});
			filesToTransfer.push({src: "assets/web-app-files/BaseController.java", dest: String(GlobalData.nativeProjectFolderPath + File.separator + _projectName + "-web-app" + File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + "controller" + File.separator + "BaseController.java")});
			
			for (var i:int = 0; i < filesToTransfer.length; i++)
			{
				var srcFile:File = File.applicationDirectory.resolvePath(filesToTransfer[i].src);
				var destFile:File = new File(filesToTransfer[i].dest);
				
				try 
				{
					srcFile.copyTo(destFile, true);
				} 
				catch (err:Error) 
				{
					log(this, "Error:", err.message);
				}
			}
		}
		
		private function createJSONResources():void 
		{
			_generatedResourceCount = 0;
			_totalResources = GlobalData.allResources.length;
			
			var rootPath:String = GlobalData.nativeProjectFolderPath + File.separator + _projectName + "-resource-app" + File.separator + "src" + File.separator + "main" + File.separator + "java";
			var jsonFolderPath:String = rootPath + File.separator + "application" + File.separator + "defined";
			
			for (var i:int = 0; i < _totalResources; i++)
			{
				var resource:Resource = GlobalData.allResources[i];
				var f:File = new File(jsonFolderPath + File.separator + resource.resourceName + ".json");
				
				var fileStream:FileStream = new FileStream();
				fileStream.open(f, FileMode.WRITE);
				
				var objToConvert:Object = new Object();
				var resourceObj:Object = new Object();
				resourceObj.cluster = resource.clusterName;
				
				var fields:Object = new Object();
				for (var j:int = 0; j < resource.fields.length; j++)
				{
					fields[resource.fields[j].fieldName] = new Object();
					fields[resource.fields[j].fieldName].type = resource.fields[j].fieldType;
					fields[resource.fields[j].fieldName].length = resource.fields[j].fieldLength;
				}
				
				resourceObj.fields = fields;
				objToConvert[resource.resourceName] = resourceObj;
				
				fileStream.writeUTFBytes(JSON.stringify(objToConvert));
				fileStream.close();
			}
		}
		
		private function onFileClosed(e:flash.events.Event):void
		{
			log(this, "Closed");
			
			_generatedResourceCount++;
			if (_generatedResourceCount == _totalResources)
			{
				log(this, "All resource generated!");
			}
		}
		
		private function progressHandler(e:ProgressEvent):void
		{
			log(this, "Progress");
		}
		
		private function errorHandler(e:IOErrorEvent):void
		{
			log(this, "Error");
		}
		
		private function onFileOpen(e:flash.events.Event):void
		{
			log(this, "Batch file opened");
		}
		
		private function onFileWritten(e:flash.events.Event):void
		{
			log(this, "Batch file writing over");
		}
	}

}