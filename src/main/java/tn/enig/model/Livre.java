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
} 

