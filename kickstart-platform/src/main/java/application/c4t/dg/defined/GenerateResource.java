package application.c4t.dg.defined;

import platform.defined.ResourceGenerator;


public class GenerateResource {
	public static void main(String []args) throws Exception {
		ResourceGenerator generator = new ResourceGenerator("application.c4t.dg.defined.resource", "./src/application/c4t/dg/defined/resource/");
		generator.generateCode("./src/application/c4t/dg/defined/", ResourcesToGenerate.resourceMaps);
	}
}
