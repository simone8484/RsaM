package com.gestioneOspite.model;

public class Diagnosi {
	
	private String data;
	private String diagnosi;
	private String codiceFiscaleMedico;
	private int idCartellaClinica;
	


	public Diagnosi(String data, String diagnosi, String codiceFiscaleMedico, int idCartellaClinica) {
		super();
		this.data = data;
		this.diagnosi = diagnosi;
		this.codiceFiscaleMedico = codiceFiscaleMedico;
		this.idCartellaClinica = idCartellaClinica;
	}



	public String getData() {
		return data;
	}



	public void setData(String data) {
		this.data = data;
	}



	public String getDiagnosi() {
		return diagnosi;
	}



	public void setDiagnosi(String diagnosi) {
		this.diagnosi = diagnosi;
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
