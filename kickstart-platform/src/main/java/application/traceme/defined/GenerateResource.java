package application.traceme.defined;

import platform.defined.ResourceGenerator;


public class GenerateResource {
	public static void main(String []args) throws Exception {
		ResourceGenerator generator = new ResourceGenerator("application.traceme.defined.resource", "./src/application/traceme/defined/resource/");
		generator.generateCode("./src/application/traceme/defined/", ResourcesToGenerate.resourceMaps);
	}
}
