package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;

import Interfacce.Operation;

public class Additional implements Operation{
	
	 int Operator1;
	 int Operator2;
	
	public Additional(int Operator1 , int Operator2) {
		this.Operator1 = Operator1;
		this.Operator2 = Operator2;
	}
	
	public int getOperator1() {
		return Operator1;
	}
	public void setOperator1(int operator1) {
		Operator1 = operator1;
	}
	public int getOperator2() {
		return Operator2;
	}
	public int getTotal() {
		return getOperator1() + getOperator2();
	}
	public int getMultiplicazione() {
		return getOperator1()*getOperator2();
	}
	public int getModulo() {
		return getOperator1()%getOperator2();
	}
	public void setOperator2(int operator2) {
		Operator2 = operator2;
	}
	
	public void Stampa() {
		// TODO Auto-generated method stub
		System.out.println("La Somma di : "+ getOperator1()+ "  e di : " +getOperator2()+ "  Vale:  " + getTotal());
	}

	

	@Override
	public void Multiplicazione() {
		System.out.println("La Multiplicazione di :"+ getOperator1()+ "  e di : " +getOperator2()+ "   Vale:  " + getMultiplicazione());
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("il Modulo di " + getOperator1() + "  per  " +getOperator2()+ "  vale  " +getModulo());
	}

	@Override
	public void getDivisione() {
		
		System.out.println("il risultato in Additional della divisione di " +getOperator1()+ " per " +getOperator2()+ " è : " + (getOperator1()/getOperator2()));

		//return (float)(getOperator1()/getOperator2());
	}
	

}
