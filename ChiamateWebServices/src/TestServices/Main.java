package TestServices;
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


public class Main {
	 @SuppressWarnings("null")
	public static void main(String[] args) throws ClientProtocolException, IOException , Exception{
		// TODO Auto-generated method stub

		HttpClient client = new DefaultHttpClient(); // il defaultHttpClient è deprecato
		  
		  HttpGet request = new HttpGet("http://echo.jsontest.com/Operand1/10/Operand2/5/Operator/+");
		  
		  HttpResponse response = client.execute(request);
		  //JSONParser jsonParser = new JSONParser();
		  /*
		  JSONObject obj = new JSONObject(response);
		  
		  System.out.println(obj);
		  
		  Object firstName = obj.get("statusLine");
		  
		  Object secondName = obj.get("allHeaders");
		  
		  System.out.println("statusLine: " + firstName);
		  
		  System.out.println("------------------------------------------------------------------------");
		  
		  System.out.println("statusLine: " + secondName);
		  */
		  
		  
		  BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
		  
		  String line = "";
		  /*while ((line = rd.readLine()) != null) {
		    System.out.println(line);
		  }
		  */
		  StringBuilder responseStrBuilder = new StringBuilder();

		  String inputStr;
		  while ((inputStr = rd.readLine()) != null) { 
		    responseStrBuilder.append(inputStr) ;
		    //System.out.println(inputStr);
		  }
		  JSONObject json = new JSONObject(responseStrBuilder.toString());
		 
		  System.out.println(json);
		  
		  // gli Iteratori sono puntatori agli elementi delle collezioni come per esempio un array
		 Iterator<String> str =  json.keys();
		 
		 while( str.hasNext()) {
			 String risult = str.next();
			 System.out.println("la chiave : " +risult);
			 String val = json.getString(risult);
			 System.out.println("lA CHIAVE"+risult+ "ha valore: " + val );
		 }
		  
		int risult ;

		risult = json.getInt("Operand1") + json.getInt("Operand2");

		System.out.println("il risultato è: "+risult);
		 
		  
		  
		  
		  
		 
		  /*JSONParser parse = new JSONParser();
		  JSONObject jobj = (JSONObject)parse.parse(line);
		 */
		  //--------------------------------------------------------------------------------------------------------------------------------
		//Convert JSON string to JSON Object
		 //JSONObject json = new JSONObject();
		/* json.put("name", "Tom");
		 json.put("birthday", "1940-02-10");
		 json.put("age", 76);
		 json.put("married", false);
		System.out.println("My name is " +json.get("name"));
		  //List<json> list = new ArrayList<json>();
		Clas infos;
		*/
	}

}
