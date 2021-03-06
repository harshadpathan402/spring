package com.sh.mvc1;

public class LoginModel {
	private String username;
	private String password;
	public LoginModel() {
		this("empty", "empty");
	}
	public LoginModel(String username, String password) {
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return String.format("LoginModel [username=%s, password=%s]", username, password);
	}
}
