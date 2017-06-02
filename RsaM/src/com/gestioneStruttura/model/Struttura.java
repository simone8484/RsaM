package com.gestioneStruttura.model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import com.gestioneUtente.model.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Criteria;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



public class Struttura {
	
	 private static Struttura struttura;

	
	LinkedList<Reparto> listaReparti = new LinkedList<Reparto>();
	LinkedList<OperatoreSanitario> listaMedici = new LinkedList<OperatoreSanitario>();
	Reparto reparto= null;
	
	private Struttura(){
		
	}
	
	public static Struttura getInstance()
	  {
	    if (struttura == null)
	    {
	      struttura = new Struttura();
	    }

	    return struttura;
	  }
	
	public Reparto creaReparto(String nome, String tipologia, String collocazioneFisica, int numeroStanzeSingole, int numeroStanzeDoppie){
		Reparto rep = new Reparto(nome, tipologia, collocazioneFisica, numeroStanzeSingole, numeroStanzeDoppie);
		return rep;
	}
	
	
	public void inserisciNuovoReparto(Reparto r){
		listaReparti.add(r);
	}
	
	public void getReparti(){
	      for (Reparto rep : listaReparti) 
	    	 System.out.println(rep);
	    	 System.out.println();
	}
	
	public Reparto selezionaReparto(String nomeReparto){
		for (Reparto rep : listaReparti)
		 if(rep.getNome().equals(nomeReparto)){
         reparto = rep;
  	  }
		return reparto;
	}
	
	public LinkedList<OperatoreSanitario> getListaMedici(String qualifica){
		
		Configuration config = new Configuration().configure();
		ServiceRegistry servReg = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		SessionFactory factory = config.buildSessionFactory(servReg);
		
		Session session = factory.openSession();
		org.hibernate.Transaction tr = session.beginTransaction();
		
		Criteria criteria = session.createCriteria(OperatoreSanitario.class);
		List<OperatoreSanitario> medici = criteria.list();
		
		tr.commit();
		session.close();
		
		
		for (OperatoreSanitario op : medici){
			if(op.getQualifica().equals(qualifica)){
				System.out.println(op.getNome());
				listaMedici.add(op);
			}
						
		}
		return listaMedici;
	}
	
	
	
	

}
