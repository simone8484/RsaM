package com.gestioneUtente.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Criteria;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.gestioneUtente.model.Utente;

import com.gestioneUtente.model.OperatoreSanitario;

/**
 * Servlet implementation class GestioneUtenteHandler
 */
@WebServlet("/GestioneUtenteHandler.do")
public class GestioneUtenteHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LinkedList<String> voceMenu = new LinkedList<String>();
	LinkedList<String> linkMenu = new LinkedList<String>();
	Map<String, String> mappaturaLink = new HashMap<String, String>();
	

   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GestioneUtenteHandler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 HttpSession sessione = request.getSession();
		 String action = request.getParameter("action");

		Configuration config = new Configuration().configure();
		ServiceRegistry servReg = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		SessionFactory factory = config.buildSessionFactory(servReg);
		
		Session session = factory.openSession();
		org.hibernate.Transaction tr = session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Utente.class);
		List utenti = criteria.list();
		tr.commit();
		session.close();
			
		Iterator itr = utenti.iterator();
		while (itr.hasNext()) {

			Utente u = (Utente) itr.next();

			if(u.getCodiceFiscale().equals(request.getParameter("codiceFiscale"))){
				request.setAttribute("user", u.getCodiceFiscale());
				request.setAttribute("nome", u.getNome());
				request.setAttribute("privilegi", u.getPrivilegi());
				char[] temp = u.getPrivilegi().toCharArray();
				//request.setAttribute("temp", temp);
				inizializza();
				List<String> menuPrincipale = costruisciMenuPrincipale(temp);
				List<String> linkMenuPrincipale = costruisciLinkMenuPrincipale(temp);
				Map<String,String> menuPrincipaleMappato = costrisciMappaLink(menuPrincipale,linkMenuPrincipale);
				//request.setAttribute("menuPrincipaleMappato", menuPrincipaleMappato);
				sessione.setAttribute("menuPrincipaleMappato", menuPrincipaleMappato);
				//request.setAttribute("menuPrincipale", menuPrincipale);
				//request.setAttribute("linkMenuPrincipale", linkMenuPrincipale);
				
				
			}
			
			
		}
		
		request.setAttribute("utenti", utenti);
		RequestDispatcher view = request.getRequestDispatcher("startpage.jsp");
		view.forward(request, response);

		
		if (action.equals("nuovoDipendente")){ 
			Configuration config1 = new Configuration().configure();
			ServiceRegistry servReg1 = new StandardServiceRegistryBuilder().applySettings(config1.getProperties()).build();
			SessionFactory factory1 = config1.buildSessionFactory(servReg1);
			
			Session session1 = factory1.openSession();
			session1.beginTransaction();
			if(request.getParameter("mansione").equals("medico")||(request.getParameter("mansione").equals("infermiere"))){
				OperatoreSanitario op = new OperatoreSanitario(request.getParameter("nome"), request.getParameter("cognome"), request.getParameter("mansione"), request.getParameter("mail"), request.getParameter("codice fiscale"), request.getParameter("qualifica"));
				session1.save(op);
				session1.getTransaction().commit();
				session1.close();
			}
			else{
			Utente u = new Utente(request.getParameter("nome"), request.getParameter("cognome"), request.getParameter("mansione"), request.getParameter("mail"), request.getParameter("codice fiscale"));
			session1.save(u);
			session1.getTransaction().commit();
			session1.close();}
		}
		
	}
	
	public List<String> costruisciMenuPrincipale(char[] v){

		if(v[0] == '1'){
			voceMenu.add("gestione ospite");
			voceMenu.add("gestione attivitą");
			voceMenu.add("gestione notifiche");
			
		}
		if(v[1] =='1' || v[2] == '1'){
			voceMenu.add("visualizza reparto");
		}
		
		if(v[3] == '1'){
			voceMenu.add("gestione contabilitą");
		}
		if(v[4] == '1'){
			voceMenu.add("gestione ubicazione");
			voceMenu.add("gestione personale");
			voceMenu.add("gestione reparto");
		}
		if(v[5] == '1'){
			voceMenu.add("gestione dipendenti");

		}
		
		return voceMenu;
	}
	
	public List<String> costruisciLinkMenuPrincipale(char[] v){

		if(v[0] == '1'){
			linkMenu.add("gestioneOspite.jsp");
			linkMenu.add("gestioneAttivita.jsp");
			linkMenu.add("gestioneNotifiche.jsp");
		}
		if(v[1] =='1' || v[2] == '1'){
			linkMenu.add("visualizzaReparto.jsp");
		}
		
		if(v[3] == '1'){
			linkMenu.add("gestioneContabilita.jsp");
		}
		if(v[4] == '1'){
			linkMenu.add("gestioneUbicazione.jsp");
			linkMenu.add("gestionePersonale.jsp");
			linkMenu.add("gestioneReparto.jsp");
		}
		if(v[5] == '1'){
			linkMenu.add("gestioneDipendenti.jsp");
		}
		return linkMenu;
	}
	
	public Map <String, String> costrisciMappaLink(List<String> lista1, List<String>lista2){
		for(int i=0; i<lista1.size(); i++){
			mappaturaLink.put(lista1.get(i), lista2.get(i));
		}
		
		return mappaturaLink;
	}
	
	public void inizializza(){
		this.linkMenu.clear();
		this.voceMenu.clear();
		this.mappaturaLink.clear();
	}


}
