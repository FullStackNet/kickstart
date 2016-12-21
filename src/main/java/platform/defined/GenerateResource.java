package platform.defined;


public class GenerateResource {
	public static void main(String []args) throws Exception {
		ResourceGenerator generator = new ResourceGenerator("platform.defined.resource","./src/main/java/platform/defined/resource/");
		generator.generateCode("./src/main/java/platform/defined/", ResourcesToGenerate.resourceMaps);
	}
}