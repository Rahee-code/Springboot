package controller;

public class User {
	private String name;
	private int number;
	private String email;
	private String pwd;
	
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
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public User(String name, int number, String email, String pwd) {
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
