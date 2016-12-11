package platform.defined;


public class GenerateResource {
	public static void main(String []args) throws Exception {
		ResourceGenerator generator = new ResourceGenerator("platform.defined.resource","./src/platform/defined/resource/");
		generator.generateCode("./src/platform/defined/", ResourcesToGenerate.resourceMaps);
	}
}