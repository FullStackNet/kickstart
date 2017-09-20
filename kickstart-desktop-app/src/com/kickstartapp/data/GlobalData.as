package com.kickstartapp.data
{
	
	/**
	 * ...
	 * @author Aditya
	 */
	public class GlobalData
	{
		static public var nativeProjectFolderPath:String = "";
		static public var logs:String = "";
		static public var allResources:Vector.<Resource> = new Vector.<Resource>();
		
		static public function getBatchFileScript(projectName:String, packageName:String, versionNum:String):String
		{
			var batchFileScript:String = "@echo off\n";
			batchFileScript += "\ncall mvn";
			batchFileScript += " archetype:generate -B -DarchetypeCatalog=local -DarchetypeArtifactId=maven-kickstart-resource-app-archetype -DarchetypeGroupId=com.kickstart-resource-app.archetype -DarchetypeVersion=1.0";
			batchFileScript += " -DgroupId=" + packageName;
			batchFileScript += " -DartifactId=" + projectName;
			batchFileScript += " -Dversion=" + versionNum;
			batchFileScript += " -Dproject-name=" + projectName;
			batchFileScript += "\nren " + projectName + " " + projectName + "-resource-app";
			/*batchFileScript += "\ncall mvn archetype:generate -B -DarchetypeCatalog=local -DarchetypeArtifactId=maven-kickstart-web-app-archetype -DarchetypeGroupId=com.kickstart-web-app.archetype -DarchetypeVersion=1.0";
			batchFileScript += " -DgroupId=" + packageName;
			batchFileScript += " -DartifactId=" + projectName;
			batchFileScript += " -Dversion=" + versionNum;
			batchFileScript += " -Dproject-name=" + projectName;
			batchFileScript += "\nren " + projectName + " " + projectName + "-web-app";*/
			batchFileScript += "\necho Kickstart-Done";
			return batchFileScript;
		}
		
	}

}