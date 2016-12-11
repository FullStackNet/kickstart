package platform.config;

import platform.util.Conf;



public class Reader {
	Conf conf = null;
	
	public Reader(String filename) {
		conf = new Conf(filename);
		conf.loadProperties();
	}
	
	public String getString(String key,String defaultValue) {
		if ( conf.getValue(key) != null) {
			return conf.getValue(key);
		}
		return defaultValue;
	}
	
	public int getInt(String key,int defaultValue) {
		if ( conf.getValueAsInt(key) != -1) {
			return conf.getValueAsInt(key);
		}
		return defaultValue;
	}
	
	public long getLong(String key,long defaultValue) {
		if ( conf.getValueAsInt(key) != -1) {
			return conf.getValueAsLong(key);
		}
		return defaultValue;
	}
	
	public Double getDouble(String key,double defaultValue) {
		if (!Double.isNaN(conf.getValueAsDouble(key))) {
			return conf.getValueAsDouble(key);
		}
		return defaultValue;
	}
	
	public byte getByte(String key,int defaultValue) {
		if ( conf.getValueAsInt(key) != -1) {
			return (byte)conf.getValueAsInt(key);
		}
		return  (byte)defaultValue;
	}
	
	public boolean getBoolean(String key,boolean defaultValue) {
		if ( conf.getValue(key) != null) {
			return conf.getValueAsBoolean(key);
		}
		return  defaultValue;
	}
	
	public void setString(String key,String value) {
		conf.setValue(key, value);
	}
	
	public void save() {
		conf.saveProperties();
	}
	
	// TODO Auto-generated method stub
}
