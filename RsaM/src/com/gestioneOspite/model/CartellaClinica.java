package com.gestioneOspite.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

public class CartellaClinica {
	
	
	private int idCartellaClinica;
	private int idOspite;
	private String dataCreazione;
	private SchedaInformativa schedaInformativa;
	private ParametriVitali parametriVitali;
	private Terapia terapia;
	private Diagnosi diagnosi;
	private LinkedList<Terapia> listaTerapie = new LinkedList<Terapia>();
	
		
	public CartellaClinica(int idOspite) {
		super();
		this.idOspite = idOspite;
		this.dataCreazione = DateTimeFormatter.ofPattern("yyy/MM/dd").format(LocalDate.now());
	}


	public int getIdOspite() {
		return idOspite;
	}


	public String getDataCreazione() {
		return dataCreazione;
	}
	
	


	public int getIdCartellaClinica() {
		return idCartellaClinica;
	}


	public void setIdCartellaClinica(int idCartellaClinica) {
		this.idCartellaClinica = idCartellaClinica;
	}


	public void setIdOspite(int idOspite) {
		this.idOspite = idOspite;
	}


	public SchedaInformativa getSchedaInformativa() {
		return schedaInformativa;
	}


	public SchedaInformativa aggiungiSchedaInformativa(String medicoFamiglia, String medicoIndirizzo, String medicoNumeroTelefono, int invalidita,
			String noteInvalidita, int protesi, String noteProtesi, String anamnesi, String codiceFiscaleMedico) {
		return this.schedaInformativa = new SchedaInformativa(medicoFamiglia,  medicoIndirizzo,  medicoNumeroTelefono,  invalidita,
				 noteInvalidita,  protesi,  noteProtesi,  anamnesi,  codiceFiscaleMedico,
				this.idCartellaClinica);
	}


	public ParametriVitali getParametriVitali() {
		return parametriVitali;
	}


	public ParametriVitali aggiungiParametriVitali(double peso, double temperatura, int pressioneMinima, int pressioneMax,
			int frequenzaCardiaca, String dataControllo, String note, String codiceFiscaleOperatoreSanitario,
			int idCartellaClinica) {
		return this.parametriVitali = new ParametriVitali(peso, temperatura, pressioneMinima, pressioneMax, frequenzaCardiaca,
				dataControllo, note, codiceFiscaleOperatoreSanitario, this.idCartellaClinica);
	}


	public Terapia getTerapia() {
		return terapia;
	}


	public Terapia aggiungiTerapia(String dataInizio, String terapia, String codiceFiscaleMedico, int idCartellaClinica) {
		return this.terapia = new Terapia(dataInizio, terapia, codiceFiscaleMedico, idCartellaClinica);
	}


	public Diagnosi getDiagnosi() {
		return diagnosi;
	}


	public Diagnosi aggiungiDiagnosi(String data, String diagnosi, String codiceFiscaleMedico, int idCartellaClinica) {
		 return this.diagnosi = new Diagnosi(data, diagnosi, codiceFiscaleMedico, idCartellaClinica);
	}
	
	
	public void setDataCreazione(String dataCreazione) {
		this.dataCreazione = dataCreazione;
	}


	public void setSchedaInformativa(SchedaInformativa schedaInformativa) {
		this.schedaInformativa = schedaInformativa;
	}


	public void setParametriVitali(ParametriVitali parametriVitali) {
		this.parametriVitali = parametriVitali;
	}


	public void setTerapia(Terapia terapia) {
		this.terapia = terapia;
	}


	public void setDiagnosi(Diagnosi diagnosi) {
		this.diagnosi = diagnosi;
	}
	
	public LinkedList<Terapia> getListaTerapie() {
		return listaTerapie;
	}


	public void setListaTerapie(LinkedList<Terapia> listaTerapie) {
		this.listaTerapie = listaTerapie;
	}


	public LinkedList<DiarioInfermiere> eseguiTerapia(String codiceFiscaleInfermiere, String noteInfermiere){

		LinkedList<DiarioInfermiere> terapieEseguite =  new LinkedList<DiarioInfermiere>();
		
		for(Terapia t : listaTerapie){
			if(t.getDataFine()==null){
				DiarioInfermiere di =t.aggiungiVoceDiarioInfermiere(t.getIdTerapia(), codiceFiscaleInfermiere, t.getTerapia(), noteInfermiere);
			    terapieEseguite.add(di);	
			}
		}
		
		return terapieEseguite;
	}
	
	

}
