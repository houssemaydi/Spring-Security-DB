package tn.enig.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livre {

@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String Titre;
private int quantite;
public Livre() {
	super();
	// TODO Auto-generated constructor stub
}
public Livre(Integer id, String titre, int quantite) {
	super();
	this.id = id;
	Titre = titre;
	this.quantite = quantite;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getTitre() {
	return Titre;
}
public void setTitre(String titre) {
	Titre = titre;
}
public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}



} 

