package com.gestioneStruttura.model;

import java.util.LinkedList;
import com.gestioneUtente.model.OperatoreSanitario;
import com.utility.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "REPARTI")

public class Reparto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_reparto", nullable=false, unique=true)
    private int id;
	
	@Column(name="nome", length=40, nullable=false)
	private String nome;
	
	@Column(name="tipologia", length=40, nullable=false)
	private String tipologia;
	
	@Column(name="collocazione_fisica", length=40, nullable=false)
	private String collocazioneFisica;
	
	@Column(name="num_stanze_singole_tot",  nullable=false)
	private int numeroStanzeSingoleTotali;
	
	@Column(name="num_stanze_doppie_tot",  nullable=false)
	private int numeroStanzeDoppieTotali;
	
	@Column(name="num_stanze_singole_disp",  nullable=false)
	private int numeroStanzeSingoleDisponibili;
	
	@Column(name="num_stanze_doppie_disp",  nullable=false)
	private int numeroStanzeDoppieDisponibili;
	
	@Column(name="codice_fiscale_resp_rep", length=40, nullable=true)
	private String codiceFiscaleResponsabileReparto;
	
	
	//private PersonaleReparto pr;
	//LinkedList<PersonaleReparto> personale = new LinkedList<PersonaleReparto>();
	
	public Reparto(){
		
	}
	
	public Reparto(String nome, String tipologia, String collocazioneFisica, int numeroStanzeSingole, int numeroStanzeDoppie) {
		this.nome = nome;
		this.tipologia = tipologia;
		this.collocazioneFisica = collocazioneFisica;
		this.numeroStanzeSingoleTotali = numeroStanzeSingole;
		this.numeroStanzeDoppieTotali = numeroStanzeDoppie;
		this.numeroStanzeDoppieDisponibili = numeroStanzeDoppie;
		this.numeroStanzeSingoleDisponibili = numeroStanzeSingole;
		this.codiceFiscaleResponsabileReparto = null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public String getCollocazioneFisica() {
		return collocazioneFisica;
	}

	public void setCollocazioneFisica(String collocazioneFisica) {
		this.collocazioneFisica = collocazioneFisica;
	}

	public int getNumeroStanzeSingole() {
		return numeroStanzeSingoleTotali;
	}

	public void setNumeroStanzeSingole(int numeroStanzeSingole) {
		this.numeroStanzeSingoleTotali = numeroStanzeSingole;
	}

	public int getNumeroStanzeDoppie() {
		return numeroStanzeDoppieTotali;
	}

	public void setNumeroStanzeDoppie(int numeroStanzeDoppie) {
		this.numeroStanzeDoppieTotali = numeroStanzeDoppie;
	}
	
	/*public void aggiungiPersonale(OperatoreSanitario m){
		this.pr = new PersonaleReparto(this.nome, OperazioniData.getDataAttuale(), m);
		personale.add(pr);
	}*/
	
	
	/*
	public void getPersonale(){
		for(PersonaleReparto personaleReparto : personale)
			personaleReparto.getPersonale();
	}*/

	@Override
	public String toString() {
		return "Reparto [nome=" + nome + ", tipologia=" + tipologia + ", collocazioneFisica=" + collocazioneFisica
				+ ", numeroStanzeSingoleTotali=" + numeroStanzeSingoleTotali + ", numeroStanzeDoppieTotali="
				+ numeroStanzeDoppieTotali + ", numeroStanzeSingoleDisponibili=" + numeroStanzeSingoleDisponibili
				+ ", numeroStanzeDoppieDisponibili=" + numeroStanzeDoppieDisponibili
				+ ", codiceFiscaleResponsabileReparto=" + codiceFiscaleResponsabileReparto + "]";
	}

	public String getCodiceFiscaleResponsabileReparto() {
		return codiceFiscaleResponsabileReparto;
	}

	public void setCodiceFiscaleResponsabileReparto(String codiceFiscaleResponsabileReparto) {
		this.codiceFiscaleResponsabileReparto = codiceFiscaleResponsabileReparto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumeroStanzeSingoleDisponibili() {
		return numeroStanzeSingoleDisponibili;
	}

	public int getNumeroStanzeDoppieDisponibili() {
		return numeroStanzeDoppieDisponibili;
	}

	
	
  
	
}
