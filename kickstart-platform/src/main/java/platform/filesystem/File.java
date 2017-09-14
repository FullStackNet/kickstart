package platform.filesystem;

public abstract class File {
	byte[] content;
	long size;
	String folder;
	String name;
	String cluster;
	String tempFile;
	public File(String cluster,String folder,String name,String tempFile) {
		this.cluster = cluster;
		this.folder = folder;
		this.name = name;
		this.tempFile = tempFile;
	}
	public File(String cluster,String folder,String name,byte[] content) {
		this.cluster = cluster;
		this.folder = folder;
		this.name = name;
		this.content = content;
		this.size = content.length;
	}
	
	public byte[] getContent() {
		return content;
	}
	
	public long getSize() {
		return size;
	}
	
	public String getFolder() {
		return folder;
	}
	
	public String getName() {
		return name;
	}

	public String getCluster() {
		return cluster;
	}
	public String getTempFile() {
		return tempFile;
	}
	public void setTempFile(String tempFile) {
		this.tempFile = tempFile;
	}	
}