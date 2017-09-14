package platform.filesystem.gridfs;

import platform.db.DBConsts;
import platform.db.DbConnection;
import platform.db.DbManager;
import platform.filesystem.BaseFileSystem;
import platform.filesystem.File;
import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;

public class GridFSFileSystem extends BaseFileSystem {
	@Override
	public void save(File file) throws ApplicationException {
		// TODO Auto-generated method stub
		DbConnection connection = DbManager.getInstance().getConnection((byte)DBConsts.DB_TYPE_MONGODB,file.getCluster(),file.getCluster());
		try {
			connection.saveFile(file.getFolder(), file.getName(), file.getTempFile());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ApplicationException(ExceptionSeverity.ERROR,"Failed to save File");
		}										
	}

	public File getFile(String folder, String fileName) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}
}
