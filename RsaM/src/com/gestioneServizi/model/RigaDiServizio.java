package com.gestioneServizi.model;

public class RigaDiServizio {
	
	private String dataInizio;
	private String dataFine;
	private Servizio servizio;
	
	public RigaDiServizio(String dataInizio, Servizio servizio) {
		super();
		this.dataInizio = dataInizio;
		this.servizio = servizio;
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

	public void setDataFine(String dataFine) {
		this.dataFine = dataFine;
	}

	public Servizio getServizio() {
		return servizio;
	}

	public void setServizio(Servizio servizio) {
		this.servizio = servizio;
	}
	
	
	
	

}
