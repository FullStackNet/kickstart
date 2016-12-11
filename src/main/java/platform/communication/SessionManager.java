package platform.communication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import platform.log.ApplicationLogger;
import platform.util.TimeUtil;

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
			if (session.isExited()) {
				ApplicationLogger.info("Deleting the session as it is exited : ",this.getClass());
				deleteSession(session.getSessionKey());
				continue;
			}
			long currentTime = System.currentTimeMillis();
			if (session.getClientId() == null) {
				if ((currentTime-session.getCreationTime()) > 60000) {
					ApplicationLogger.info("Marking the null session delete :",this.getClass());
					session.setDelete(true);
				}
			}
			if ((currentTime - session.getLastUpdateTime()) > 300000L) {
				ApplicationLogger.info("Marking the delete for session for not responding sessions ...Last Heard from this " +TimeUtil.ago(session.getLastUpdateTime()) +" ->"+ session.getClientId(),this.getClass());
				session.setDelete(true);
			}
		}
	}
	
	public void cleanupSession(Object key) {
		sessionTable.remove(key);
	}
	
	public ArrayList<Map<String, Object>> getSessionListMap() {
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		for(Map.Entry<Object, Session> entry : sessionTable.entrySet()) {
			Session session = entry.getValue();
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("Session Id", session.getSessionKey());
			map.put("Client", session.getClientId());
			map.put("Created", TimeUtil.ago(session.getCreationTime()));
			map.put("Last Updated", TimeUtil.ago(session.getLastUpdateTime()));
			map.put("Deleted", session.isDelete());
			map.put("Pending Message", session.getPendingMessage());
			map.put("Processed Message", session.getProcessedMessage());
			list.add(map);
		}
		return list;
	}
}
