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
}