package com.gestioneOspite.model;

public class SchedaInformativa {
	
	private int idSchedaInformativa;
	private String medicoFamiglia;
	private String medicoIndirizzo;
	private String medicoNumeroTelefono;
	private int invalidita;
	private String noteInvalidita;
	private int protesi;
	private String noteProtesi;
	private String Anamnesi;
	private String codiceFiscaleMedico;
	private int idCartellaClinica;
	
	public SchedaInformativa(String medicoFamiglia, String medicoIndirizzo, String medicoNumeroTelefono, int invalidita,
			String noteInvalidita, int protesi, String noteProtesi, String anamnesi, String codiceFiscaleMedico,
			int idCartellaClinica) {
		super();
		this.medicoFamiglia = medicoFamiglia;
		this.medicoIndirizzo = medicoIndirizzo;
		this.medicoNumeroTelefono = medicoNumeroTelefono;
		this.invalidita = invalidita;
		this.noteInvalidita = noteInvalidita;
		this.protesi = protesi;
		this.noteProtesi = noteProtesi;
		this.Anamnesi = anamnesi;
		this.codiceFiscaleMedico = codiceFiscaleMedico;
		this.idCartellaClinica = idCartellaClinica;
	}

	
	 
	public int getIdSchedaInformativa() {
		return idSchedaInformativa;
	}



	public void setIdSchedaInformativa(int idSchedaInformativa) {
		this.idSchedaInformativa = idSchedaInformativa;
	}



	public String getMedicoFamiglia() {
		return medicoFamiglia;
	}

	public void setMedicoFamiglia(String medicoFamiglia) {
		this.medicoFamiglia = medicoFamiglia;
	}

	public String getMedicoIndirizzo() {
		return medicoIndirizzo;
	}

	public void setMedicoIndirizzo(String medicoIndirizzo) {
		this.medicoIndirizzo = medicoIndirizzo;
	}

	public String getMedicoNumeroTelefono() {
		return medicoNumeroTelefono;
	}

	public void setMedicoNumeroTelefono(String medicoNumeroTelefono) {
		this.medicoNumeroTelefono = medicoNumeroTelefono;
	}

	public int getInvalidita() {
		return invalidita;
	}

	public void setInvalidita(int invalidita) {
		this.invalidita = invalidita;
	}

	public String getNoteInvalidita() {
		return noteInvalidita;
	}

	public void setNoteInvalidita(String noteInvalidita) {
		this.noteInvalidita = noteInvalidita;
	}

	public int getProtesi() {
		return protesi;
	}

	public void setProtesi(int protesi) {
		this.protesi = protesi;
	}

	public String getNoteProtesi() {
		return noteProtesi;
	}

	public void setNoteProtesi(String noteProtesi) {
		this.noteProtesi = noteProtesi;
	}

	public String getAnamnesi() {
		return Anamnesi;
	}

	public void setAnamnesi(String anamnesi) {
		Anamnesi = anamnesi;
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
	
	

	
	

}
