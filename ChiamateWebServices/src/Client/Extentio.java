package Client;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONObject;

import Interfacce.Divisione;
import Interfacce.Operation;

public class Extentio implements Divisione {

	int risult;
	public Extentio(int risult) {
		this.risult = risult;
	}

	
	public int getRisult() {
		return risult;
	}

	public void setRisult(int risult) {
		this.risult = risult;
	}
	public float getDivisione() {
		
		return (float)(getRisult()/3);
	}


	@Override
	public void StampaRisult() {
		// TODO Auto-generated method stub
		System.out.println( "il risultato in Extentio della divisione di " +getRisult()+ " per 3  è : " +getDivisione());
	}


	

	





}
