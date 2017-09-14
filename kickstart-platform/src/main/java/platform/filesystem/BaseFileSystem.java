package platform.filesystem;

import platform.util.ApplicationException;

public abstract class BaseFileSystem {
	public abstract void save(File file) throws ApplicationException;
}
