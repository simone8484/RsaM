package com.gestioneOspite.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Terapia {
	
	private String dataInizio;
	private String dataFine;
	private String terapia;
	private String codiceFiscaleMedico;
	private int idCartellaClinica;
	private DiarioInfermiere diarioInfermiere;
	private int idTerapia;
	
	public Terapia(String dataInizio, String terapia, String codiceFiscaleMedico, int idCartellaClinica) {
		super();
		this.dataInizio = dataInizio;
		this.terapia = terapia;
		this.codiceFiscaleMedico = codiceFiscaleMedico;
		this.idCartellaClinica = idCartellaClinica;
	}

	public String getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(String dataInizio) {
		this.dataInizio = dataInizio;
	}

	public String getDataFine() {
		return dataFine;
	}

	public void concludiTerapia() {
		this.dataFine = DateTimeFormatter.ofPattern("yyy/MM/dd").format(LocalDate.now());
	}

	public String getTerapia() {
		return terapia;
	}

	public void setTerapia(String terapia) {
		this.terapia = terapia;
	}

	public String getCodiceFiscaleMedico() {
		return codiceFiscaleMedico;
	}

	public void setCodiceFiscaleMedico(String codiceFiscaleMedico) {
		this.codiceFiscaleMedico = codiceFiscaleMedico;
	}

	public int getIdCartellaClinica() {
		return idCartellaClinica;
	}

	public void setIdCartellaClinica(int idCartellaClinica) {
		this.idCartellaClinica = idCartellaClinica;
	}
	
	public DiarioInfermiere aggiungiVoceDiarioInfermiere(int idTerapia, String codiceFiscaleInfermiere,
			String descrizioneTerapia, String noteInfermiere) {
		return this.diarioInfermiere = new DiarioInfermiere(idTerapia, codiceFiscaleInfermiere, descrizioneTerapia, noteInfermiere);
	}

	
	public DiarioInfermiere getDiarioInfermiere() {
		return diarioInfermiere;
	}


	public void setDiarioInfermiere(DiarioInfermiere diarioInfermiere) {
		this.diarioInfermiere = diarioInfermiere;
	}

	public int getIdTerapia() {
		return idTerapia;
	}

	public void setIdTerapia(int idTerapia) {
		this.idTerapia = idTerapia;
	}

	public void setDataFine(String dataFine) {
		this.dataFine = dataFine;
	}
	
	

}
