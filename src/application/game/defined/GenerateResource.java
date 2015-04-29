package application.game.defined;

import platform.defined.ResourceGenerator;


public class GenerateResource {
	public static void main(String []args) throws Exception {
		ResourceGenerator generator = new ResourceGenerator("application.game.defined.resource", "./src/application/game/defined/resource/");
		generator.generateCode("./src/application/game/defined/", ResourcesToGenerate.resourceMaps);
	}
}
