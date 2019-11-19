package com.collabera;

public class LoginBean {
	String name, password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginBean [name=" + name + ", password=" + password + "]";
	}
	public boolean validate() {
		if(password.equals("admin"))
			return true;
		else
			return false;
	}
}
