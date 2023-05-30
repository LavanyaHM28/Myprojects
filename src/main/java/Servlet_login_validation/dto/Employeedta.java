package Servlet_login_validation.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employeedta {
	@Id
	private String email;
	private String name;
	private int password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}

}
