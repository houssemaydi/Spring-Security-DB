package tn.enig.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class User {
@Id
private String username;
private String password;
private int active;
@ManyToMany
 List<Role> roles;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(String username, String password, int active, List<Role> roles) {
	super();
	this.username = username;
	this.password = password;
	this.active = active;
	this.roles = roles;
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
public int getActive() {
	return active;
}
public void setActive(int active) {
	this.active = active;
}
public List<Role> getRoles() {
	return roles;
}
public void setRoles(List<Role> roles) {
	this.roles = roles;
}


}