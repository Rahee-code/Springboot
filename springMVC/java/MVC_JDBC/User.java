package MVC_JDBC;

public class User {
	private String name;
	private int number;
	private String email;
	private int pwd;
	
	@Override
	public String toString() {
		return "User [name=" + name + ", number=" + number + ", email=" + email + ", pwd=" + pwd + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPwd() {
		return pwd;
	}
	public void setPwd(int pwd) {
		this.pwd = pwd;
	}
	
	public User(String name, int number, String email, int pwd) {
		super();
		this.name = name;
		this.number = number;
		this.email = email;
		this.pwd = pwd;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
