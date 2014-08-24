package platform.test;

import platform.notification.NotificationDispatcher;

public class TestNotificationWithDispatcher {
	public static void main(String[] args){
		try {
			NotificationDispatcher.getInstance().sendNotification("cc84de40-ce1d-11e3-8e00-005056c00008", "Stopreached", "Bus1");

		} catch (Exception e) {
			System.out.println("IOException: " + e.getMessage());
			e.printStackTrace();
		}
	}
}