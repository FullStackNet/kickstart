package application.brushupskills.defined;

import platform.defined.ResourceGenerator;


public class GenerateResource {
	public static void main(String []args) throws Exception {
		ResourceGenerator generator = new ResourceGenerator("application.brushupskills.defined.resource", "./src/application/brushupskills/defined/resource/");
		generator.generateCode("./src/application/brushupskills/defined/", ResourcesToGenerate.resourceMaps);
	}
}
