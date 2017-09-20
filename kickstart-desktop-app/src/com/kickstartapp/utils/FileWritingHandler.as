package com.kickstartapp.utils
{
	import com.kickstartapp.data.GlobalData;
	import com.kickstartapp.data.Resource;
	import com.kickstartapp.utils.scripthandler.ScriptHandler;
	import com.kickstartapp.utils.scripthandler.ScriptStatus;
	import flash.events.Event;
	import flash.events.EventDispatcher;
	import flash.filesystem.File;
	import flash.filesystem.FileMode;
	import flash.filesystem.FileStream;
	import flash.system.System;
	import starling.utils.AssetManager;
	
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
		private var _scriptHandler:ScriptHandler;
		private var _assetManager:AssetManager;
		
		public function FileWritingHandler()
		{
			_scriptHandler = new ScriptHandler();
			_scriptHandler.addEventListener(Event.COMPLETE, onScriptRunCompleted);
		}
		
		public function analyseSelectedDirectory():void
		{
			var resourceAppFolderName:String = "";
			var webAppFolderName:String = "";
			var file:File = new File(GlobalData.nativeProjectFolderPath);
			var files:Array = file.getDirectoryListing();
			for (var i:int = 0; i < files.length; i++)
			{
				var currentFile:File = files[i] as File;
				
				if (currentFile.isDirectory && currentFile.name.indexOf("-resource-app") != -1)
				{
					resourceAppFolderName = currentFile.name;
				}
				
				if (currentFile.isDirectory && currentFile.name.indexOf("-web-app") != -1)
				{
					webAppFolderName = currentFile.name;
				}
			}
			
			if (resourceAppFolderName != "" && webAppFolderName != "")
			{
				file = new File(GlobalData.nativeProjectFolderPath + "/" + webAppFolderName + "/pom.xml");
				var fileStream:FileStream = new FileStream();
				fileStream.open(file, FileMode.READ);
				var pomContent:String = fileStream.readUTFBytes(fileStream.bytesAvailable);
				fileStream.close();
				
				pomContent = pomContent.replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", "");
				
				var pomFile:XML = new XML(pomContent);
				var nss:Array = pomFile.namespaceDeclarations();
				for (var j:int = 0; j < nss.length; j++)
				{
					pomContent = pomContent.split("xmlns=\"" + nss[j] + "\"").join("");
				}
				pomFile = new XML(pomContent);
				
				_projectName = pomFile.artifactId.toString().replace("-web-app", "");
				_packageName = pomFile.groupId.toString();
				_versionNumber = pomFile.version.toString();
				
				file = new File(GlobalData.nativeProjectFolderPath + "/" + resourceAppFolderName + "/src/main/java/application/defined");
				_assetManager = new AssetManager();
				_assetManager.verbose = true;
				_assetManager.enqueue(file);
				_assetManager.loadQueue(onAssetLoadingProgress);
			}
			else
			{
				log(this, "Could not find kickstart project in the specified folder!!");
				this.dispatchEvent(new Event(Event.CLOSE, false));
			}
		}
		
		private function onAssetLoadingProgress(ratio:Number):void
		{
			if (ratio == 1)
			{
				// now would be a good time for a clean-up
				System.pauseForGCIfCollectionImminent(0);
				System.gc();
				
				log(this, "Completed loading assets.");
				this.dispatchEvent(new Event(Event.COMPLETE));
			}
		}
		
		public function updateProject():void
		{
			createJSONResources();
			_scriptHandler.runMaven(ScriptHandler.MVN_CLEAN_INSTALL_EXEC_JAVA, GlobalData.nativeProjectFolderPath + "/" + _projectName + "-resource-app/pom.xml", GlobalData.nativeProjectFolderPath + "/" + _projectName + "-resource-app");
		}
		
		public function createProject(projectName:String, packageName:String, versionNumber:String):void
		{
			log(this, "Init");
			
			_projectName = projectName;
			_packageName = packageName;
			_versionNumber = versionNumber;
			
			log(this, "Generating resources..");
			
			createFolderStructure();
			createPomFiles();
			copyStaticJavaFiles();
			createJSONResources();
			
			log(this, "Resources generation done");
			
			_scriptHandler.runMaven(ScriptHandler.MVN_CLEAN_INSTALL_EXEC_JAVA, GlobalData.nativeProjectFolderPath + "/" + _projectName + "-resource-app/pom.xml", GlobalData.nativeProjectFolderPath + "/" + _projectName + "-resource-app");
		}
		
		private function onScriptRunCompleted(e:Event):void
		{
			var scriptStatus:ScriptStatus = (e.target as ScriptHandler).currentProcessStatus;
			scriptStatus.isCompleted = true;
			
			switch (scriptStatus.mvnCommand)
			{
				case ScriptHandler.MVN_CLEAN_INSTALL_EXEC_JAVA: 
					log(this, "MVN_CLEAN_INSTALL_EXEC_JAVA complete..");
					writeJavaClassesForResourceApp();
					_scriptHandler.runMaven(ScriptHandler.MVN_CLEAN_INSTALL, GlobalData.nativeProjectFolderPath + "/" + _projectName + "-resource-app/pom.xml", GlobalData.nativeProjectFolderPath + "/" + _projectName + "-resource-app");
					break;
				case ScriptHandler.MVN_CLEAN_INSTALL: 
					writeJavaClassesForWebApp();
					break;
				default: 
			}
		}
		
		private function createFolderStructure():void
		{
			var file:File;
			var folderPaths:Array = new Array();
			var rootPath:String = GlobalData.nativeProjectFolderPath + "/" + _projectName + "-resource-app/src/main/java";
			
			folderPaths.push(rootPath + "/application/defined/resource");
			folderPaths.push(rootPath + "/application/helper");
			folderPaths.push(rootPath + "/application/resource");
			folderPaths.push(rootPath + "/util");
			
			rootPath = GlobalData.nativeProjectFolderPath + "/" + _projectName + "-web-app/src/main";
			
			folderPaths.push(rootPath + "/java/application");
			folderPaths.push(rootPath + "/java/controller");
			folderPaths.push(rootPath + "/java/data");
			folderPaths.push(rootPath + "/java/service");
			folderPaths.push(rootPath + "/java/servlet");
			folderPaths.push(rootPath + "/java/util");
			folderPaths.push(rootPath + "/resources");
			
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
			srcData = srcData.split("${working-dir}").join(GlobalData.nativeProjectFolderPath + "/" + _projectName + "-resource-app");
			
			file = new File(GlobalData.nativeProjectFolderPath + "/" + _projectName + "-resource-app/pom.xml");
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
			
			file = new File(GlobalData.nativeProjectFolderPath + "/" + _projectName + "-web-app/pom.xml");
			fs.open(file, FileMode.WRITE);
			fs.writeUTFBytes(srcData);
			fs.close();
			file = null;
		}
		
		private function copyStaticJavaFiles():void
		{
			var filesToTransfer:Array = new Array();
			filesToTransfer.push({src: "assets/resource-app-files/LocalhostDBSetup.java", dest: String(GlobalData.nativeProjectFolderPath + "/" + _projectName + "-resource-app/src/main/java/util/LocalhostDBSetup.java")});
			filesToTransfer.push({src: "assets/resource-app-files/GenerateResource.java", dest: String(GlobalData.nativeProjectFolderPath + "/" + _projectName + "-resource-app/src/main/java/application/defined/GenerateResource.java")});
			//filesToTransfer.push({src: "assets/resource-app-files/ResourcesToGenerate.java", dest: String(GlobalData.nativeProjectFolderPath + "/" + _projectName + "-resource-app/src/main/java/application/defined/ResourcesToGenerate.java")});
			filesToTransfer.push({src: "assets/web-app-files/Application.java", dest: String(GlobalData.nativeProjectFolderPath + "/" + _projectName + "-web-app/src/main/java/application/Application.java")});
			filesToTransfer.push({src: "assets/web-app-files/BaseController.java", dest: String(GlobalData.nativeProjectFolderPath + "/" + _projectName + "-web-app/src/main/java/controller/BaseController.java")});
			
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
			
			var file:File = new File(GlobalData.nativeProjectFolderPath + "/" + _projectName + "-resource-app/src/main/java/application/defined/GenerateResource.java");
			var fs:FileStream = new FileStream();
			fs.open(file, FileMode.READ)
			var srcData:String = fs.readUTFBytes(fs.bytesAvailable);
			fs.close();
			
			srcData = srcData.split("$WorkingDir").join(GlobalData.nativeProjectFolderPath + "/" + _projectName + "-resource-app");
			
			fs.open(file, FileMode.WRITE);
			fs.writeUTFBytes(srcData);
			fs.close();
			
			file = null;
		}
		
		private function createJSONResources():void
		{
			_generatedResourceCount = 0;
			_totalResources = GlobalData.allResources.length;
			
			var rootPath:String = GlobalData.nativeProjectFolderPath + "/" + _projectName + "-resource-app/src/main/java";
			var jsonFolderPath:String = rootPath + "/application/defined";
			var srcCodeForResourcesToGenerate:String = "";
			var srcData:String = "";
			
			for (var i:int = 0; i < _totalResources; i++)
			{
				var resource:Resource = GlobalData.allResources[i];
				var f:File = new File(jsonFolderPath + "/" + resource.resourceName + ".json");
				
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
				
				//generating code for ResourcesToGenerate.java class
				srcCodeForResourcesToGenerate += "\n\t\tnew ResourceMap(\"" + resource.resourceName + "\", \"application.resource." + resource.resourceName + "\")";
				if (i < _totalResources - 1)
				{
					srcCodeForResourcesToGenerate += ",";
				}
				else
				{
					srcCodeForResourcesToGenerate += "\n";
				}
			}
			
			var file:File = File.applicationDirectory.resolvePath("assets/resource-app-files/ResourcesToGenerate.java");
			var fs:FileStream = new FileStream();
			fs.open(file, FileMode.READ)
			srcData = fs.readUTFBytes(fs.bytesAvailable);
			fs.close();
			
			srcData = srcData.replace("/*code-goes-here*/", srcCodeForResourcesToGenerate);
			
			file = new File(GlobalData.nativeProjectFolderPath + "/" + _projectName + "-resource-app/src/main/java/application/defined/ResourcesToGenerate.java");
			fs.open(file, FileMode.WRITE);
			fs.writeUTFBytes(srcData);
			fs.close();
			
			file = null;
		}
		
		private function writeJavaClassesForResourceApp():void
		{
			log(this, "Writing java classes for resource app..");
			
			var rootPath:String = GlobalData.nativeProjectFolderPath + "/" + _projectName + "-resource-app/src/main/java";
			var srcData:String = "";
			var f:File;
			var fileStream:FileStream = new FileStream();
			
			for (var i:int = 0; i < _totalResources; i++)
			{
				var resource:Resource = GlobalData.allResources[i];
				
				//generate Base class
				f = File.applicationDirectory.resolvePath("assets/resource-app-files/GenericResourceClass.java");
				fileStream.open(f, FileMode.READ);
				srcData = fileStream.readUTFBytes(fileStream.bytesAvailable);
				fileStream.close();
				
				f = new File(GlobalData.nativeProjectFolderPath + "/" + _projectName + "-resource-app/src/main/java/application/resource/" + resource.resourceName + ".java");
				if (!f.exists)
				{
					fileStream.open(f, FileMode.WRITE);
					srcData = srcData.split("$resourcename").join(resource.resourceName);
					fileStream.writeUTFBytes(srcData);
					fileStream.close();
				}
				
				//generate Helper class
				f = File.applicationDirectory.resolvePath("assets/resource-app-files/GenericHelperClass.java");
				fileStream.open(f, FileMode.READ);
				srcData = fileStream.readUTFBytes(fileStream.bytesAvailable);
				fileStream.close();
				
				f = new File(GlobalData.nativeProjectFolderPath + "/" + _projectName + "-resource-app/src/main/java/application/helper/" + Utils.getFirstLetterUppercase(resource.resourceName).concat("Helper") + ".java");
				if (!f.exists)
				{
					fileStream.open(f, FileMode.WRITE);
					srcData = srcData.split("$resourcename").join(resource.resourceName);
					srcData = srcData.split("$Resourcename").join(Utils.getFirstLetterUppercase(resource.resourceName));
					fileStream.writeUTFBytes(srcData);
					fileStream.close();
				}
			}
			
			log(this, "Resource app java classes written");
		}
		
		private function writeJavaClassesForWebApp():void
		{
			log(this, "Writing java classes for web app..");
			
			var rootPath:String = GlobalData.nativeProjectFolderPath + "/" + _projectName + "-web-app/src/main/java";
			var srcData:String = "";
			var f:File;
			var fileStream:FileStream = new FileStream();
			
			for (var i:int = 0; i < _totalResources; i++)
			{
				var resource:Resource = GlobalData.allResources[i];
				
				//generate controller class
				f = File.applicationDirectory.resolvePath("assets/web-app-files/GenericController.java");
				fileStream.open(f, FileMode.READ);
				srcData = fileStream.readUTFBytes(fileStream.bytesAvailable);
				fileStream.close();
				
				f = new File(GlobalData.nativeProjectFolderPath + "/" + _projectName + "-web-app/src/main/java/controller/" + Utils.getFirstLetterUppercase(resource.resourceName).concat("Controller.java"));
				if (!f.exists)
				{
					fileStream.open(f, FileMode.WRITE);
					srcData = srcData.split("$resource-name").join(resource.resourceName);
					srcData = srcData.split("$Resource-name").join(Utils.getFirstLetterUppercase(resource.resourceName));
					fileStream.writeUTFBytes(srcData);
					fileStream.close();
				}
				
				//generate service class
				f = File.applicationDirectory.resolvePath("assets/web-app-files/GenericService.java");
				fileStream.open(f, FileMode.READ);
				srcData = fileStream.readUTFBytes(fileStream.bytesAvailable);
				fileStream.close();
				
				f = new File(GlobalData.nativeProjectFolderPath + "/" + _projectName + "-web-app/src/main/java/service/" + Utils.getFirstLetterUppercase(resource.resourceName).concat("Service.java"));
				if (!f.exists)
				{
					fileStream.open(f, FileMode.WRITE);
					srcData = srcData.split("$resource-name").join(resource.resourceName);
					srcData = srcData.split("$Resource-name").join(Utils.getFirstLetterUppercase(resource.resourceName));
					fileStream.writeUTFBytes(srcData);
					fileStream.close();
				}
			}
			
			log(this, "All Done");
		}
		
		public function get assetManager():AssetManager
		{
			return _assetManager;
		}
		
		public function get projectName():String
		{
			return _projectName;
		}
		
		public function get packageName():String
		{
			return _packageName;
		}
		
		public function get versionNumber():String
		{
			return _versionNumber;
		}
	}

}