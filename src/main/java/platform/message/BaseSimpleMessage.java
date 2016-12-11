package platform.message;

import java.io.Serializable;

public class BaseSimpleMessage implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String id;
	public String sender;
	public String target;
	
	public BaseSimpleMessage() {
		
	}
	public BaseSimpleMessage(String id) {
		this.id = id;
	}
	public BaseSimpleMessage(String id, String sender,String target) {
		this.id = id;
		this.sender = sender;
		this.target = target;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
		
}
