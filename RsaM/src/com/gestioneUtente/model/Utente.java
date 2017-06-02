package com.gestioneUtente.model;


import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Id;
import javax.persistence.Table;


import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

@Entity
@Table( name = "UTENTI")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
    name="discriminator",
    discriminatorType=DiscriminatorType.STRING
)
@DiscriminatorValue(value="U")
public class Utente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_utente", nullable=false, unique=true)
	protected int idUtente;
	
	@Column(name="nome", length=40, nullable=false)
	protected String nome;
	
	@Column(name="cognome", length=40, nullable=false)
	protected String cognome;
	
	@Column(name="mansione", length=40, nullable=false)
	protected String mansione;
	
	@Column(name="privilegi", length=40, nullable=false)
	protected String privilegi;
	
	@Column(name="password", length=40, nullable=false)
	protected String password;
	
	@Column(name="email", length=40, nullable=false)
	protected String eMail;
	
	@Column(name="stato",  nullable=false)
	protected int stato;
	
	@Column(name="codice_fiscale", length=16, nullable=false)
	protected String codiceFiscale;
	
	private static String oggetto = "Rsa managment";
	
	public Utente(){
		
	}
	
	public Utente(String nome, String cognome, String mansione, String eMail, String codiceFiscale) {
		this.cognome = cognome;
		this.mansione = mansione;
		this.nome=nome;
		this.privilegi=Privilegi.calcolaPrivilegi(mansione);
		this.password = generaPassword();
		this.eMail = eMail;
		this.stato = 0;
		this.codiceFiscale = codiceFiscale;
		this.inviaEmail(oggetto, eMail, codiceFiscale, password);
				
	}
	
	
		
	


	@Override
	public String toString() {
		return "Utente [idUtente=" + idUtente + ", nome=" + nome + ", cognome=" + cognome + ", mansione=" + mansione
				+ ", privilegi=" + privilegi + ", password=" + password + ", eMail=" + eMail + ", stato=" + stato
				+ ", codiceFiscale=" + codiceFiscale + "]";
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}


	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public String getMansione() {
		return mansione;
	}


	public void setMansione(String mansione) {
		this.mansione = mansione;
	}


	public String getPrivilegi() {
		return privilegi;
	}


	public void setPrivilegi(String privilegi) {
		this.privilegi = privilegi;
	}


	public String getPass() {
		return password;
	}


	public void setPass() {
		this.password = generaPassword();
	}


	public void stampaPrivilegi(){
		System.out.println("i privilegi sono:" + privilegi);
	}
	
	
	public void stampaPassword(){
		System.out.println("la password �:" + password);
	}
	
	private String generaPassword(){
		long seme = System.currentTimeMillis();
		Random r = new Random(seme);
		long pass = r.nextLong();
		String psw = Long.toUnsignedString(pass).substring(2, 9);
		return psw;
		
		
	}


	public int getIdUtente() {
		return idUtente;
	}


	public void setIdUtente(int idUtente) {
		this.idUtente = idUtente;
	}


	public String geteMail() {
		return eMail;
	}


	public void seteMail(String eMail) {
		this.eMail = eMail;
	}


	public int getStato() {
		return stato;
	}


	public void setStato(int stato) {
		this.stato = stato;
	}
	
	public void inviaEmail(String oggetto, String eMail, String codiceFiscale, String password) {
		
		String testoMail = "benvenuti in Rsa Management\n\n\n" + "il tuo user name e':" + codiceFiscale + "\n\n la tua password e':" + password;
		final String username = "simone.bonarrigo@gmail.com";
		final String psw = "09102010siM";
		
		    // Creazione di una mail session
		    Properties props = new Properties();
		    props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.port", "587");

			Session session = Session.getInstance(props,
					  new javax.mail.Authenticator() {
						protected PasswordAuthentication getPasswordAuthentication() {
							return new PasswordAuthentication(username, psw);
						}
					  });

					try {

						Message message = new MimeMessage(session);
						message.setFrom(new InternetAddress("from-email@gmail.com"));
						message.setRecipients(Message.RecipientType.TO,
							InternetAddress.parse(eMail));
						message.setSubject(oggetto);
						message.setText(testoMail);

						Transport.send(message);

						System.out.println("Done");

					} catch (MessagingException e) {
						throw new RuntimeException(e);
					}
		  
	}
	
	

}
