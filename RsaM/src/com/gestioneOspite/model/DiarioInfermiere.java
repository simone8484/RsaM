package com.gestioneOspite.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DiarioInfermiere {
	
	private int idDiarioInfermiere;
	private int idTerapia;
	private String codiceFiscaleInfermiere;
	private String descrizioneTerapia;
	private String noteInfermiere;
	private String dataSomministrazioneTerapia;
	
	
	public DiarioInfermiere(int idTerapia, String codiceFiscaleInfermiere,
			String descrizioneTerapia, String noteInfermiere) {
		super();
		this.idTerapia = idTerapia;
		this.codiceFiscaleInfermiere = codiceFiscaleInfermiere;
		this.descrizioneTerapia = descrizioneTerapia;
		this.noteInfermiere = noteInfermiere;
		this.dataSomministrazioneTerapia =  DateTimeFormatter.ofPattern("yyy/MM/dd").format(LocalDate.now());
	}


	public void setIdDiarioInfermiere(int idDiarioInfermiere) {
		this.idDiarioInfermiere = idDiarioInfermiere;
	}


	public void setIdTerapia(int idTerapia) {
		this.idTerapia = idTerapia;
	}


	public void setCodiceFiscaleInfermiere(String codiceFiscaleInfermiere) {
		this.codiceFiscaleInfermiere = codiceFiscaleInfermiere;
	}


	public void setDescrizioneTerapia(String descrizioneTerapia) {
		this.descrizioneTerapia = descrizioneTerapia;
	}


	public void setNoteInfermiere(String noteInfermiere) {
		this.noteInfermiere = noteInfermiere;
	}


	public void setDataSomministrazioneTerapia(String dataSomministrazioneTerapia) {
		this.dataSomministrazioneTerapia = dataSomministrazioneTerapia;
	}
	
	
	
	
	

}
