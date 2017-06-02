package com.gestioneOspite.model;

public class ParametriVitali {
	
	private double peso;
	private double temperatura;
	private int pressioneMinima;
	private int pressioneMax;
	private int frequenzaCardiaca;
	private String dataControllo;
	private String note;
	private String codiceFiscaleOperatoreSanitario;
	private int idCartellaClinica;
	
	
	public ParametriVitali(double peso, double temperatura, int pressioneMinima, int pressioneMax,
			int frequenzaCardiaca, String dataControllo, String note, String codiceFiscaleOperatoreSanitario,
			int idCartellaClinica) {
		super();
		this.peso = peso;
		this.temperatura = temperatura;
		this.pressioneMinima = pressioneMinima;
		this.pressioneMax = pressioneMax;
		this.frequenzaCardiaca = frequenzaCardiaca;
		this.dataControllo = dataControllo;
		this.note = note;
		this.codiceFiscaleOperatoreSanitario = codiceFiscaleOperatoreSanitario;
		this.idCartellaClinica = idCartellaClinica;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getTemperatura() {
		return temperatura;
	}


	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}


	public int getPressioneMinima() {
		return pressioneMinima;
	}


	public void setPressioneMinima(int pressioneMinima) {
		this.pressioneMinima = pressioneMinima;
	}


	public int getPressioneMax() {
		return pressioneMax;
	}


	public void setPressioneMax(int pressioneMax) {
		this.pressioneMax = pressioneMax;
	}


	public int getFrequenzaCardiaca() {
		return frequenzaCardiaca;
	}


	public void setFrequenzaCardiaca(int frequenzaCardiaca) {
		this.frequenzaCardiaca = frequenzaCardiaca;
	}


	public String getDataControllo() {
		return dataControllo;
	}


	public void setDataControllo(String dataControllo) {
		this.dataControllo = dataControllo;
	}


	public String getNote() {
		return note;
	}


	public void setNote(String note) {
		this.note = note;
	}


	public String getCodiceFiscaleInfermiere() {
		return codiceFiscaleOperatoreSanitario;
	}


	public void setCodiceFiscaleInfermiere(String codiceFiscaleOperatoreSanitario) {
		this.codiceFiscaleOperatoreSanitario = codiceFiscaleOperatoreSanitario;
	}


	public int getIdCartellaClinica() {
		return idCartellaClinica;
	}


	public void setIdCartellaClinica(int idCartellaClinica) {
		this.idCartellaClinica = idCartellaClinica;
	}
	
	
	
	

}
