package com.gestioneOspite.model;

public class Referente {

private int idOspite;
private int idReferente;
private String nome;
private String cognome;
private String indirizzo;
private String telefono;

public Referente(int idOspite, String nome, String cognome, String indirizzo, String telefono) {
	super();
	this.idOspite = idOspite;
	this.nome = nome;
	this.cognome = cognome;
	this.indirizzo = indirizzo;
	this.telefono = telefono;
}

public int getIdOspite() {
	return idOspite;
}

public void setIdOspite(int idOspite) {
	this.idOspite = idOspite;
}

public int getIdReferente() {
	return idReferente;
}

public void setIdReferente(int idReferente) {
	this.idReferente = idReferente;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCognome() {
	return cognome;
}

public void setCognome(String cognome) {
	this.cognome = cognome;
}

public String getIndirizzo() {
	return indirizzo;
}

public void setIndirizzo(String indirizzo) {
	this.indirizzo = indirizzo;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}






	
}
