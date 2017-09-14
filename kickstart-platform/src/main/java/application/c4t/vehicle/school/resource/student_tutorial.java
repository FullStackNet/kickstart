package application.c4t.vehicle.school.resource;

import platform.util.Util;
import application.c4t.vehicle.school.defined.resource.Basestudent_tutorial;

public class student_tutorial extends Basestudent_tutorial {

	/**
	 * 
	 */
	
	public static String TUTORIAL_STATUS_NOT_DOWNLOADED = "NOT DOWNLOADED";
	public static String TUTORIAL_STATUS_DOWNLOADED = "DOWNLOADED";
	public static String TUTORIAL_STATUS_COMPLETED = "COMPLETED";
	
	public static String ASSIGNMENT_STATUS_NOT_DOWNLOADED = "NOT DOWNLOADED";
	public static String ASSIGNMENT_STATUS_DOWNLOADED = "DOWNLOADED";
	public static String ASSIGNMENT_STATUS_COMPLETED = "COMPLETED";
	public static String ASSIGNMENT_STATUS_SENT = "SENT";
	public static String ASSIGNMENT_STATUS_RECEIVED = "RECEIVED";
	public static String ASSIGNMENT_STATUS_VERIFIED = "VERIFIED";
	
	public static String MCQ_STATUS_NOT_VIEWED = "NOT VIEWED";
	public static String MCQ_STATUS_STARTED = "STARTED";
	public static String MCQ_STATUS_COMPLETED = "COMPLETED";
	public static String MCQ_STATUS_REATTEMPT = "REATTEMPT";
	
	

	public static String[] getTutorialStatus() {
		return new String[]{TUTORIAL_STATUS_NOT_DOWNLOADED,TUTORIAL_STATUS_DOWNLOADED,TUTORIAL_STATUS_COMPLETED};
	}
	
	public static String[] getAssigmentStatus() {
		return new String[]{ASSIGNMENT_STATUS_NOT_DOWNLOADED,ASSIGNMENT_STATUS_DOWNLOADED,ASSIGNMENT_STATUS_COMPLETED,ASSIGNMENT_STATUS_SENT,ASSIGNMENT_STATUS_RECEIVED,ASSIGNMENT_STATUS_VERIFIED};
	}
	
	public static String[] getMCQStatus() {
		return new String[]{MCQ_STATUS_NOT_VIEWED,MCQ_STATUS_STARTED,MCQ_STATUS_COMPLETED,MCQ_STATUS_REATTEMPT};
	}
	
	private static final long serialVersionUID = 1L;
	
	public student_tutorial() {
		this.setId(Util.getUniqueId());
	}
	
	public student_tutorial(String id) {
		this.setId(id);
	}	
	
	@Override
	public Class<?> getResultClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
