package application.account.defined;

import platform.defined.ResourceGenerator;


public class GenerateResource {
	public static void main(String []args) throws Exception {
		ResourceGenerator generator = new ResourceGenerator("application.account.defined.resource", "./src/main/java/application/account/defined/resource/");
		generator.generateCode("./src/main/java/application/account/defined/", ResourcesToGenerate.resourceMaps);
	}
}
