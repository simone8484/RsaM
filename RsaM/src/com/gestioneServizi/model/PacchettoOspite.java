package com.gestioneServizi.model;

public class PacchettoOspite {
	
	private int idOspite;
	private RigaDiServizio rigaDiServizio;

	public PacchettoOspite(int idOspite) {
		super();
		this.idOspite = idOspite;
	}

	public int getIdOspite() {
		return idOspite;
	}

	public RigaDiServizio getRigaDiServizio() {
		return rigaDiServizio;
	}

	public void nuovaRigaDiServizio(String dataInizio, Servizio servizio) {
		this.rigaDiServizio = new RigaDiServizio(dataInizio, servizio);
	}

	public void setIdOspite(int idOspite) {
		this.idOspite = idOspite;
	}
	
	
	
	

}
