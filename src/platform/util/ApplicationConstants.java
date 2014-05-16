package platform.util;

public class ApplicationConstants {
	public static String CONFIGURATION_FILE = "configuration";
	public static String MOBD_CONFIGURATION_FILE = "mobd";
	public static String DC_CONFIGURATION_FILE = "dc";
	public static String OBD_CONFIGURATION_FILE = "obd";
	public static String V3_CONFIGURATION_FILE = "v3";
	public static String V3TRACKER_CONFIGURATION_FILE = "v3tracker";
	public static String CISTRACKER_CONFIGURATION_FILE = "cistracker";
	public static String ACPTRACKER_CONFIGURATION_FILE = "acptracker";
	public static int PROCESS_WAIT_TIME_BEFORE_EXIT = 10000;
	
	public static String DB_FILE = "db";
	public static String DATA_FILE = "data";
	public static String DEFAULT_DB_CONFIG_NAME = "local";
	public static String PROPERTY_CONFIG_NAME = "config_name";
	public static String PROPERTY_CONNECT_URL = "connect_url";
	public static String PROPERTY_ID = "id";
	public static String PROPERTY_SELF_IP_ADDRESS = "self_ip_address";
	public static String PROPERTY_DB_ENABLED = "db_enabled";
	public static String PROPERTY_PROCESS_STAT_ENABLED = "process_stat_enabled";

	
	public static String PROPERTY_LOCATION = "location";
	public static String PROPERTY_NAME = "name";
	public static String PROPERTY_SERVER = "server";
	public static String PROPERTY_PORT = "port";
	public static String PROPERTY_USERNAME = "username";
	public static String PROPERTY_PASSWORD = "password";
	public static String PROPERTY_API_KEY = "api_key";
	public static String PROPERTY_MODULES = "modules";
	public static String PROPERTY_CLIENT_MESSAGE_QUEUE_SIZE = "client_message_queue_size";
	public static String PROPERTY_SERVER_MESSAGE_QUEUE_SIZE = "server_message_queue_size";
	public static String PROPERTY_MESSAGE_QUEUE_PER_CLIENT_SIZE = "message_queue_per_size_per_client";
	public static String PROPERTY_DATABASE = "database";
	public static String PROPERTY_SERVER_PORT = "server_port";
	public static String PROPERTY_OBD_SERVER = "obd_server";
	public static String PROPERTY_V3_SERVER = "v3_server";
	public static String PROPERTY_CISTRACKER_SERVER = "cistracker_server";
	public static String PROPERTY_OBD_SERVER_PORT = "obd_server_port";
	public static String PROPERTY_DC_SERVER_PORT = "dc_server_port";
	public static String PROPERTY_V3_SERVER_PORT = "v3_server_port";
	public static String PROPERTY_V3TRACKER_SERVER_PORT = "v3tracker_server_port";
	public static String PROPERTY_CISTRACKER_SERVER_PORT = "cistracker_server_port";
	public static String PROPERTY_ACPTRACKER_SERVER_PORT = "acptracker_server_port";
	public static String PROPERTY_MAX_CONNECTIONS = "max_connections";
	public static String PROPERTY_SIMULATORS = "simulators";
	public static String PROPERTY_REGISTERED_OBD = "registered_obd";
	public static String PROPERTY_OBD_DATA_SEND_INTERVAL = "obd_data_send_interval";
	public static String PROPERTY_V3_DATA_SEND_INTERVAL = "v3_data_send_interval";
	public static String PROPERTY_DATA_SEND_INTERVAL = "data_send_interval";
	public static String PROPERTY_OBD_AUTHORIZED_PHONE_NUMBER = "obd_authorized_phone_number";	
	public static String PROPERTY_OBD_LISTEN_IN_PHONE_NUMBER = "obd_listen_in_phone_number";	
	public static String PROPERTY_OBD_GPS_LOG_INTERVAL = "obd_gps_log_interval";		
	public static String PROPERTY_OBD_SPEED_ALARM_THRESHOLD = "obd_speed_alarm_threshold";		
	public static String PROPERTY_OBD_TOW_DETECTION_DURATION = "obd_tow_detection_duration";		
	public static String PROPERTY_MOBD_TC68 = "mobd_tc68";		
	public static String PROPERTY_CLIENT_ID = "client_id";
	public static String PROPERTY_GATEWAY_ID = "gateway_id";
	public static String PROPERTY_IMEI = "imei";
	public static String APPLICATION_NAME_MANAGER = "MANAGER";
	public static String APPLICATION_NAME_EMAIL_MANAGER = "EMAIL-MANAGER";
	public static String APPLICATION_NAME_SMS_MANAGER = "SMS-MANAGER";
	public static String APPLICATION_NAME_NOTIFICATION_MANAGER = "NOTIFICATION-MANAGER";
	public static String APPLICATION_NAME_MONITOR = "MONITOR";
	public static String APPLICATION_NAME_PACKET_LOGGER = "PACKET_LOGGER";
	public static String APPLICATION_NAME_ALERT_MANAGER = "ALERT-MANAGER";
	public static String APPLICATION_NAME_AGENT = "AGENT";
	public static String APPLICATION_NAME_MONGODB = "MONGODB";
	public static String APPLICATION_NAME_MONGODB_CONFIG_SERVER = "MONGODB-CONFIG-SERVER";
	public static String APPLICATION_NAME_MONGODB_DATA_SERVER = "MONGODB-DATA-SERVER";
	public static String APPLICATION_NAME_MONGODB_ROUTE_SERVER = "MONGODB-ROUTE-SERVER";
	public static String APPLICATION_NAME_MESSAGE_BUS = "MESSAGE-BUS";
	public static String APPLICATION_NAME_APPLICATION_SERVER = "APPLICATION-SERVER";
	public static String APPLICATION_NAME_MOBD_GATEWAY = "mobd-gateway";
	public static String APPLICATION_NAME_GATEWAY = "GATEWAY";
	public static int 	MANAGER_DEFAULT_PORT = 6381;
	public static int	MOBD_DEFAULT_PORT = 5381;
	public static int	OBD_DEFAULT_PORT = 5383;
	public static int	V3_DEFAULT_PORT = 5385;
	public static int	V3TRACKER_DEFAULT_PORT = 5387;
	public static int	CISTRACKER_DEFAULT_PORT = 5389;
	public static int	ACPTRACKER_DEFAULT_PORT = 5391;
	public static String DEFAULT_DB_SERVER = "localhost";
	public static String DEFAULT_DB_USERNAME = "root";
	public static String SESSION_ID = "session_id";
	public static String FORM = "form";
	public static String REQ_RESOURCE = "resource";
	public static String REQ_RESOURCES = "resources";
	public static String SENSOR_STATE_UNKNOWN = "UNKNOWN";
	public static String SENSOR_MANAGER_ACTION_REBUILD_NETWORK = "REBUILD_NETWORK";
	public static String SENSOR_ACTION_REFRESH_DATA = "REFRESH_DATA";
	public static String ID_SEPERATOR= "^";
	public static int VALUE_TYPE_INT = 1;
	public static int VALUE_TYPE_LONG = 2;
	public static int VALUE_TYPE_DOUBLE = 3;
	public static int VALUE_TYPE_STRING = 4;
	public static String CONNECTION_TYPE_OBD = "OBD";
	public static String CONNECTION_TYPE_GPS = "GPS";
	public static String CONNECTION_TYPE_CLOUD = "CLOUD";
	public static long MANAGED_OBJECT_HEARTBEAT = 30000L;
	public static int MANAGED_OBJECT_MONITOR_TYPE_HEARTBEAT = 1;
	public static int MANAGED_OBJECT_MONITOR_TYPE_PORT_SCAN = 2;
	public static double STOPAGE_RADIUS_KM = 0.350;

	public static String MAIL_TYPE_INVITE_PARENT = "INVITE_PARENT";
	public static String MAIL_TYPE_INVITE_TEACHER = "INVITE_TEACHER";
	public static String MAIL_TYPE_FORGOT_PASSWORD = "FORGOT_PASSWORD";
	public static String MAIL_TYPE_STOPAGE_REACHED = "STOPAGE_REACHED";
	public static String MAIL_TYPE_INVITE_CUSTOMER_ADMIN = "INVITE_CUSTOMER_ADMIN";

	public static String MAIL_SUBJECT_INVITE_PARENT = "Activate student stpoage alert service";
	public static String MAIL_SUBJECT_INVITE_TEACHER = "Activate teacher account";
	public static String MAIL_SUBJECT_STOPAGE_REACHED = "Alert for Stopage Reached";
	public static String MAIL_SUBJECT_FORGOT_PASSWORD = "Forgot password";
	public static String MAIL_SUBJECT_INVITE_CUSTOMER_ADMIN = "Activate your customer admin account";
	
	public static String SMS_TYPE_INVITE_PARENT = "INVITE_PARENT";
	public static String SMS_TYPE_INVITE_TEACHER = "INVITE_TEACHER";
	public static String SMS_TYPE_SEND_STOPAGE_REACHED = "STOPAGE_REACHED";
	public static String SMS_TYPE_FORGOT_PASSWORD = "FORGOT_PASSWORD";
	
	public static String NOTIFICATION_TYPE_STOPAGE_REACHED = "STOPAGE_REACHED";
}
