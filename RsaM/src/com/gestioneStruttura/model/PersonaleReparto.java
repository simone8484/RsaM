package com.gestioneStruttura.model;

import java.util.Date;
import com.gestioneUtente.model.OperatoreSanitario;

public class PersonaleReparto {
	
	private int id;
	private String reparto;
	private String dataInizio;
	OperatoreSanitario op;
	
	public PersonaleReparto(String reparto, String dataInizio, OperatoreSanitario op) {
		this.reparto = reparto;
		this.dataInizio = dataInizio;
		this.op = op;
	}


	public String getReparto() {
		return reparto;
	}

	public void setReparto(String reparto) {
		this.reparto = reparto;
	}

	public String getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(String dataInizio) {
		this.dataInizio = dataInizio;
	}

	/*public void getM() {
		this.m.toString();
	}

	public void setM(Medico m) {
		this.m = m;
	}

	@Override
	public String toString() {
		return "PersonaleReparto [reparto=" + reparto + ", dataInizio=" + dataInizio + ", m=" + m + ", i=" + i + "]";
	}*/
	public void getPersonale(){
		System.out.println(this.op.getCognome() + this.op.getMansione());
	}
	
	
	
	
	

}
