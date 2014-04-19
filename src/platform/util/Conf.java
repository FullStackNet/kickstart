package platform.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

import platform.log.ApplicationLogger;



/**
 * 
 * review comments to incorporate:
 * 
 * support for sections.. like in ini file Call it M16ConfParserWrapper
 * M16ConfParserManager OR Factory
 * 
 * @author saurabhd
 * 
 */
enum CONFTYPE {
	PROPERTIES, XML;
}

public class Conf {
	String module;

	CONFTYPE type;

	Properties confProps = null;

	/**
	 * 
	 * @param module
	 */
	public Conf(String m) {
		super();
		this.module = m;
		this.type = CONFTYPE.PROPERTIES;
	}

	public Conf(String m, CONFTYPE types) {
		super();
		this.module = m;
		this.type = types;
	}

	public void loadProperties(String str) {
		InputStream inputStream = null;
		inputStream = new ByteArrayInputStream(str.getBytes());
		confProps = new Properties();
		try {
			confProps.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void loadProperties() {
		String fileName ="";
		String currentdir ="";
		try {
			if (type == CONFTYPE.PROPERTIES) {
				fileName = module + ".properties";
				confProps = new Properties();
				InputStream inputStream = null;
				try {
					System.out.println("Class Name"+this.getClass());
					inputStream = this.getClass().getClassLoader()
							.getResourceAsStream("conf/" + fileName);
					if (inputStream != null) {
						confProps.load(inputStream);
					} else {
						try {
							System.out.println("Read from local context ...");
							Map<String, String> env = System.getenv();
							currentdir = System.getProperty("user.dir");
							FileInputStream fi = new FileInputStream(currentdir
									+ File.separator + "conf" + File.separator
									+ fileName);
							confProps.load(fi);
							fi.close();
						} catch (Exception fileEx) {
							// If this also fails... then we have a genuine case of
							// File not found.
							System.out.println("unable to read from local context" +currentdir
									+ File.separator + "conf" + File.separator
									+ fileName);
							ApplicationLogger.error("Configuration file not found: "
									+ fileName, Conf.class);
						}
					}
				} catch (Exception ex) {
					System.out.println("unable to read from servlet context");
					ex.printStackTrace();
					// If we are not able to read from the tomcat m_Context, most
					// probably, we are in the local m_Context
					try {
						Map<String, String> env = System.getenv();
							currentdir = System.getProperty("user.dir");
						FileInputStream fi = new FileInputStream(currentdir
								+ File.separator + "conf" + File.separator
								+ fileName);
						confProps.load(fi);
						fi.close();
					} catch (Exception fileEx) {
						// If this also fails... then we have a genuine case of
						// File not found.
						System.out.println("unable to read from servlet context" +currentdir
								+ File.separator + "conf" + File.separator
								+ fileName);
						ApplicationLogger.error("Configuration file not found: "
								+ fileName, Conf.class);
					}
				}
				if (inputStream != null) {
					inputStream.close();
				}
			} else {
				fileName = module + ".xml";
				confProps = new Properties();
				FileInputStream fi = new FileInputStream("." + File.separator
						+ "conf" + File.separator + fileName);
				confProps.loadFromXML(fi);
				fi.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void saveProperties() {
		try {
			if (type == CONFTYPE.PROPERTIES) {
				String fileName = module + ".properties";
				FileOutputStream fo = new FileOutputStream("." + File.separator
						+ "conf" + File.separator + fileName);
				confProps.store(fo, "");
				fo.close();
			} else {
				String fileName = module + ".xml";
				FileOutputStream fo = new FileOutputStream("." + File.separator
						+ "conf" + File.separator + fileName);
				confProps.storeToXML(fo, "");
				fo.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param key
	 * @return
	 */
	public String getValue(String key) {
		return confProps.getProperty(key);
	}

	/**
	 * 
	 * @param key
	 * @return
	 */
	public boolean getValueAsBoolean(String key) {
		return Util.parseBoolean(confProps.getProperty(key), false);
	}

	/**
	 * 
	 * @param key
	 * @return
	 */
	public int getValueAsInt(String key) {
		return Util.parseInt(confProps.getProperty(key), -1);
	}

	public int getValueAsInt(String key, int defaultValue) {
		return Util.parseInt(confProps.getProperty(key), defaultValue);
	}

	/**
	 * 
	 * @param key
	 * @return
	 */
	public long getValueAsLong(String key) {
		return Util.parseLong(confProps.getProperty(key), -1);
	}

	/**
	 * 
	 * @param key
	 * @return
	 */
	public double getValueAsDouble(String key) {
		return Util.parseDouble(confProps.getProperty(key), -1);
	}

	/**
	 * 
	 * @param key
	 * @param value
	 */
	public void setValue(String key, String value) {
		confProps.setProperty(key, value);
		saveProperties();
	}

	/**
	 * 
	 * @param key
	 * @param value
	 */
	public void setValueAsInt(String key, int value) {
		confProps.setProperty(key, String.valueOf(value));
		saveProperties();
	}

	/**
	 * 
	 * @param key
	 * @param value
	 */
	public void setValueAsLong(String key, long value) {
		confProps.setProperty(key, String.valueOf(value));
		saveProperties();
	}

	/**
	 * 
	 * @param key
	 * @param value
	 */
	public void setValueAsDouble(String key, double value) {
		confProps.setProperty(key, String.valueOf(value));
		saveProperties();
	}

	/**
	 * 
	 * @return
	 */
	public Properties getAllProperties() {
		return this.confProps;
	}
}
