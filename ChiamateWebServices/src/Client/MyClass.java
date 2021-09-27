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

import Interfacce.Divisione;
import Interfacce.Iterate;
import Interfacce.Operation;

import java.io.FileNotFoundException;
import java.io.FileReader;



public class MyClass implements Iterate{
	
	int value1;
	int value2;
	int risult;

	public MyClass(int value1, int value2, int risult) {
		this.value1=value1;
		this.risult=risult;
		this.value2=value2;
	}

	public int getValue1() {
		return value1;
	}

	public void setValue1(int value1) {
		this.value1 = value1;
	}

	public int getValue2() {
		return value2;
	}

	public void setValue2(int value2) {
		this.value2 = value2;
	}

	public int getRisult() {
		return (risult%2);
	}

	public void setRisult(int risult) {
		this.risult = risult;
	}
	
	public int getDo() {
		
		int tmp;
		
		if(getValue1() > getValue2()) {
			
			tmp = risult % (getValue1() * getValue2());
		}
		else {
			tmp = risult % (getValue1() * getValue2()) + 24;
	}
		return tmp;
	}

	@Override
	public void Stampa() {
		System.out.println("Quest'Operazione est fatta per generare il risultato di qualche confronto sui dati da input e vale: " +getDo());
		
	}

	



	
}
