package application.c4t.vehicle.defined;

import platform.defined.ResourceGenerator;


public class GenerateResource {
	public static void main(String []args) throws Exception {
		ResourceGenerator generator = new ResourceGenerator("application.c4t.vehicle.defined.resource", 
				"./src/application/c4t/vehicle/defined/resource/");
		generator.generateCode("./src/application/c4t/vehicle/defined/", 
				ResourcesToGenerate.resourceMaps);
	}
}
