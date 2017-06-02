package com.gestioneServizi.model;

public class Servizio {
	
	private int idServizio;
	private String nome;
	
	public Servizio(int idServizio, String nome) {
		super();
		this.idServizio = idServizio;
		this.nome = nome;
	}
	
	public void setIdServizio(int idServizio) {
		this.idServizio = idServizio;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdServizio() {
		return idServizio;
	}
	
	

}
