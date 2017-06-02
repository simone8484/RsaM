package com.gestioneServizi.model;

public class DescrizioneServizio {
	
	private int idServizio;
	private String descrizione;
	private double costoGiornaliero;
	
	public DescrizioneServizio(int idServizio, String descrizione, double costoGiornaliero) {
		super();
		this.idServizio = idServizio;
		this.descrizione = descrizione;
		this.costoGiornaliero = costoGiornaliero;
	}

	public int getIdServizio() {
		return idServizio;
	}

	public void setIdServizio(int idServizio) {
		this.idServizio = idServizio;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getCostoGiornaliero() {
		return costoGiornaliero;
	}

	public void setCostoGiornaliero(double costoGiornaliero) {
		this.costoGiornaliero = costoGiornaliero;
	}
	
	
	
	

}
