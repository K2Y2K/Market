package entity;

public class Person {

	private int id ;
	private String userName ;
	private String password ;
	private String nickName ;
	private String userType ;
	public Person(int id, String userName, String password, String nickName,
			String userType) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.nickName = nickName;
		this.userType = userType;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
}