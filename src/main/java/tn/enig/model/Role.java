package tn.enig.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {

@Id
private String role;

public Role() {
	super();
	// TODO Auto-generated constructor stub
}

public Role(String role) {
	super();
	this.role = role;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}


} 