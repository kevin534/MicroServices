package Client;

import java.util.Iterator;

import org.json.JSONObject;

import Interfacce.Testing;

public class NavigOggetto implements Testing {
final String str1 = "Kevin";
	
	final String str2 = "Xavier";
	
	final int costante = 31;

	JSONObject json;
	
public NavigOggetto(JSONObject servizioHttp) {
	json = servizioHttp;
		// TODO Auto-generated constructor stub
	}

public void accessingJson() {
		
		Iterator<String> str =  json.keys();
		 
		 while( str.hasNext()) {
			 String risult = str.next();
			 System.out.println("la chiave : " +risult);
			 String val = json.getString(risult);
			 System.out.println("la chiave : " +risult+ " ha valore: " + val );
			 if(str.equals(risult)) {
			
				 System.out.println(" value is true");
			 }
		 }
		 
		
	}

@Override
public String getConcat(String str1, String str2, int costante) {
	// TODO Auto-generated method stub
	return ("La concatenazione è: "+  str1 +"  "+ str2 + "  con Età:  " + costante);
}

@Override
public void Stampa() {
	// TODO Auto-generated method stub
	System.out.println(getConcat(str1, str2, costante));
}

}
