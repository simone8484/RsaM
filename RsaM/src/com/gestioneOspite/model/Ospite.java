package com.gestioneOspite.model;

import java.util.Date;
import java.util.LinkedList;

import com.gestioneServizi.model.PacchettoOspite;

public class Ospite {
	
	private int id;
	private String nome;
	private String cognome;
	private int sesso;
	private String luogoDiNascita;
	private Date dataDiNascita;
	private String numeroCartaIdentita;
	private Date dataScadenzaCarta;
	private String codiceFiscale;
	private double pensione;
	private String note;
	private int statoOspite;
	private int eta;
	private Referente referente;
	private LinkedList<Referente> listaReferenti;
	private CartellaClinica cartellaClinica;
	private PacchettoOspite pacchettoOspite;
	
	public Ospite(String nome, String cognome, int sesso, String luogoDiNascita, Date dataDiNascita,
			String numeroCartaIdentita, Date dataScadenzaCarta, String codiceFiscale, double pensione, String note,
			int eta) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.sesso = sesso;
		this.luogoDiNascita = luogoDiNascita;
		this.dataDiNascita = dataDiNascita;
		this.numeroCartaIdentita = numeroCartaIdentita;
		this.dataScadenzaCarta = dataScadenzaCarta;
		this.codiceFiscale = codiceFiscale;
		this.pensione = pensione;
		this.note = note;
		this.eta = eta;
		this.statoOspite = 0;
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

	public int getSesso() {
		return sesso;
	}

	public void setSesso(int sesso) {
		this.sesso = sesso;
	}

	public String getLuogoDiNascita() {
		return luogoDiNascita;
	}

	public void setLuogoDiNascita(String luogoDiNascita) {
		this.luogoDiNascita = luogoDiNascita;
	}

	public Date getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(Date dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public String getNumeroCartaIdentita() {
		return numeroCartaIdentita;
	}

	public void setNumeroCartaIdentita(String numeroCartaIdentita) {
		this.numeroCartaIdentita = numeroCartaIdentita;
	}

	public Date getDataScadenzaCarta() {
		return dataScadenzaCarta;
	}

	public void setDataScadenzaCarta(Date dataScadenzaCarta) {
		this.dataScadenzaCarta = dataScadenzaCarta;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public double getPensione() {
		return pensione;
	}

	public void setPensione(double pensione) {
		this.pensione = pensione;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getStatoOspite() {
		return statoOspite;
	}

	public void setStatoOspite(int statoOspite) {
		this.statoOspite = statoOspite;
	}
	
	public void aggiornaStato(){
		if(this.statoOspite < 5)
			this.statoOspite++;
		
		if(this.statoOspite == 6)
			this.statoOspite = 1;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public Referente getReferente() {
		return referente;
	}

	public Referente aggiungiReferente(String nome, String cognome, String indirizzo, String telefono) {
		return this.referente = new Referente( this.id, nome, cognome, indirizzo, telefono);
	}

	public LinkedList<Referente> getListaReferenti() {
		return listaReferenti;
	}

	public void setListaReferenti(LinkedList<Referente> listaReferenti) {
		this.listaReferenti = listaReferenti;
	}

	public CartellaClinica getCartellaClinica() {
		return cartellaClinica;
	}

	public CartellaClinica aggiungiCartellaClinica() {
		return this.cartellaClinica = new CartellaClinica(this.id);
	}

	public PacchettoOspite getPacchettoOspite() {
		return pacchettoOspite;
	}

	public PacchettoOspite creaPacchettoOspite() {
		return this.pacchettoOspite = new PacchettoOspite(this.id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setReferente(Referente referente) {
		this.referente = referente;
	}

	public void setCartellaClinica(CartellaClinica cartellaClinica) {
		this.cartellaClinica = cartellaClinica;
	}

	public void setPacchettoOspite(PacchettoOspite pacchettoOspite) {
		this.pacchettoOspite = pacchettoOspite;
	}
	
	
	
	

	
	


}
