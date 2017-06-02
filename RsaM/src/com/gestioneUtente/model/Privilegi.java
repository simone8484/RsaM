package com.gestioneUtente.model;

public class Privilegi {
	
	
	
	public static String calcolaPrivilegi(String mansione){
		String privilegi = null;
		
		if(mansione.equals("operatore"))
			privilegi = "100000";
		else if(mansione.equals("medico"))
			privilegi = "010000";
		else if(mansione.equals("direttore sanitario"))
			privilegi = "000010";
		else if(mansione.equals("infermiere"))
			privilegi = "001000";
		else if(mansione.equals("contabile"))
			privilegi = "000100";
		else if(mansione.equals("amministratore"))
			privilegi = "111111";
		return privilegi;
	}

}
