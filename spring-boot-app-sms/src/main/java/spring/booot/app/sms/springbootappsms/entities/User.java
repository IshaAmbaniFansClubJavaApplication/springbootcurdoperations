package spring.booot.app.sms.springbootappsms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_INFO")
public class User {
	@Id
	@Column(name="user_id",length=12)
	private long userId;
	@Column(name="user_first_name",length=10)
	private String userFirstName;
	@Column(name="user_last_name",length=10)
	private String userLastName;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	
	

}
