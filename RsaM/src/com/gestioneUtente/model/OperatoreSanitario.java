package com.gestioneUtente.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="UTENTI")
@DiscriminatorValue("O")
public class OperatoreSanitario extends Utente {
	
	@Column(name="qualifica", length=20, nullable=true)
	private String qualifica;

	public OperatoreSanitario(){
		super();
	}
	
	public OperatoreSanitario(String nome, String cognome, String mansione, String eMail, String codiceFiscale, String qualifica) {
		super(nome, cognome, mansione, eMail, codiceFiscale);
		this.qualifica = qualifica;
		
	}

	public String getQualifica() {
		return qualifica;
	}

	public void setQualifica(String qualifica) {
		this.qualifica = qualifica;
	}

	@Override
	public String toString() {
		return "OperatoreSanitario [qualifica=" + qualifica + ", idUtente=" + idUtente + ", nome=" + nome + ", cognome="
				+ cognome + ", mansione=" + mansione + ", privilegi=" + privilegi + ", password=" + password
				+ ", eMail=" + eMail + ", stato=" + stato + ", codiceFiscale=" + codiceFiscale + "]";
	}

	

}
