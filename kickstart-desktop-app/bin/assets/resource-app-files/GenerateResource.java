package application.defined;

import platform.defined.ResourceGenerator;

public class GenerateResource {

	public static void main(String []args) throws Exception {

		ResourceGenerator generator = new ResourceGenerator("application.defined.resource", "$WorkingDir/src/main/java/application/defined/resource/");
		generator.generateCode("$WorkingDir/src/main/java/application/defined/", ResourcesToGenerate.resourceMaps);
		
	}
}
