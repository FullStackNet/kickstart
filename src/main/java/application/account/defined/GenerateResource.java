package application.account.defined;

import platform.defined.ResourceGenerator;


public class GenerateResource {
	public static void main(String []args) throws Exception {
		ResourceGenerator generator = new ResourceGenerator("application.account.defined.resource", "./src/application/account/defined/resource/");
		generator.generateCode("./src/application/account/defined/", ResourcesToGenerate.resourceMaps);
	}
}
