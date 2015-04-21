package application.community.defined;

import platform.defined.ResourceGenerator;


public class GenerateResource {
	public static void main(String []args) throws Exception {
		ResourceGenerator generator = new ResourceGenerator("application.community.defined.resource", "./src/application/community/defined/resource/");
		generator.generateCode("./src/application/community/defined/", ResourcesToGenerate.resourceMaps);
	}
}
