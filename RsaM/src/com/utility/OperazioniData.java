package com.utility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class OperazioniData {
	
	
	public static String getDataAttuale(){
		 SimpleDateFormat sdf = new SimpleDateFormat(); // creo l'oggetto
		 String dataStr = sdf.format(new Date()); // data corrente 
		 sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		return dataStr;
		
	}

}
