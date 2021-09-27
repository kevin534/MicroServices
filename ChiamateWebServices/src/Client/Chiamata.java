package Client;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileNotFoundException;
import java.io.FileReader;


public class Chiamata {

	
	String url;
	public Chiamata(String url) {
		
		this.url=url;
	}
	
	public  JSONObject ServizioHttp() throws ClientProtocolException, IOException , Exception{
		
		 HttpClient client = new DefaultHttpClient(); // il defaultHttpClient è deprecato
		  
		  HttpGet request = new HttpGet(this.url);
		 
		  HttpResponse response = client.execute(request);
		  
		  BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));

		  StringBuilder responseStrBuilder = new StringBuilder();

		  String inputStr;
		  while ((inputStr = rd.readLine()) != null) { 
			  
		    responseStrBuilder.append(inputStr) ;
		    //System.out.println(inputStr);
		    
		  }
		  
		  JSONObject json = new JSONObject(responseStrBuilder.toString());

		
		return json;
	}
	
	public void getConc(String url) {

		String str[];

		str= url.split("/");
		
		for(String a : str) {
			System.out.println("La split dell'url mi ritorna: " +a);

		}
	
		
		
	}

}
