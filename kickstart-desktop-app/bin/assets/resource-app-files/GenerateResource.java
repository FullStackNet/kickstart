package application.defined;

import platform.defined.ResourceGenerator;

public class GenerateResource {

	public static void main(String []args) throws Exception {

		ResourceGenerator generator = new ResourceGenerator("application.defined.resource", "./src/main/java/application/defined/resource/");
		generator.generateCode("./src/main/java/application/defined/", ResourcesToGenerate.resourceMaps);
		
	}
}
