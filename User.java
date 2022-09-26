import java.util.Date;

public class User {
	int userId;
	String name;
	String dateOfBirth;
	String mobNo;
	String emailId;
	String sex;
	
	public User(int userId, String name, String mobNo, String emailId, String sex) {
		this.userId = userId;
		this.name = name;
		this.mobNo = mobNo;
		this.emailId = emailId;
		this.sex = sex;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	

}
