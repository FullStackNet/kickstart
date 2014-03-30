package platform.communication;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import platform.log.ApplicationLogger;

public class SessionManager {
	Map<Object, Session> sessionTable = null ;
	static SessionManager instance = null;

	public static SessionManager getInstance() {
		if (instance == null) {
			instance = new SessionManager();
		}
		return instance;
	}

	SessionManager() {
		sessionTable  = new ConcurrentHashMap<Object, Session>();
	}

	public Session getSession(Object key) {
		return (Session) sessionTable.get(key);
	}

	public void addSession(Session session) {
		ApplicationLogger.info("Total Sessions after adding session :"+(sessionTable.size()+1),this.getClass());
		sessionTable.put(session.getSessionKey(), session);
	}

	public void deleteSession(Object key) {
		Session session = (Session) sessionTable.get(key);
		if (session != null) {
			sessionTable.remove(key);
		}
		ApplicationLogger.info("Total Sessions after deleting session :"+sessionTable.size(),this.getClass());
	}
	
	public void markDeletedByClientId(String clientId) {
		for(Map.Entry<Object, Session> entry : sessionTable.entrySet()) {
			Session session = (Session)entry.getValue();
			if ((session.getClientId() != null) && (clientId.equalsIgnoreCase(session.getClientId().toString()))) {
				session.setDelete(true);
			}
		}
	}
	
	public void deleteOrphanedConnection() {
		for(Map.Entry<Object, Session> entry : sessionTable.entrySet()) {
			Session session = (Session)entry.getValue();
			if (session.getClientId() == null) {
				long currentTime = System.currentTimeMillis();
				if ((currentTime-session.getCreationTime()) > 20000) {
					session.setDelete(true);
				}
			}
		}
	}
	
	public void cleanupSession(Object key) {
		
	}
}
