package Client;

import org.apache.http.client.ClientProtocolException;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedDeque;
import Interfacce.Divisione;
import Interfacce.InterConta;
import Interfacce.Iterate;
import Interfacce.Operation;

public class Services{

	public static void main(String[] args) throws ClientProtocolException, IOException , Exception {

		int value1 , value2 ,risult;
		Chiamata object;
		Operation op ;
		Divisione div;
		Iterate it;
		NavigOggetto navig;
		Substract soustraire;
		InterConta conta;

		object = new Chiamata("http://echo.jsontest.com/Operand1/10/Operand2/5/Operator/+");

		value1 = object.ServizioHttp().getInt("Operand1") ;
		value2 =  object.ServizioHttp().getInt("Operand2");
		risult = value1 + value2;

		object.ServizioHttp(); // ritorna il json object
		System.out.println("l'oggetto json è : " +object.ServizioHttp());

		System.out.println("------------------------------------------------------------------------------------------");

		object.getConc("http://echo.jsontest.com/Operand1/10/Operand2/5/Operator/+");
		
		System.out.println("------------------------------------------------------------------------------------------");

		navig = new NavigOggetto(object.ServizioHttp());
		navig.accessingJson();

		System.out.println("------------------------------------------------------------------------------------------");

		navig.Stampa(); // return "Kevin Xavier" + risult

		System.out.println("------------------------------------------------------------------------------------------");

		System.out.println("l'hashcode dell'oggetto è :" + navig.hashCode());

		System.out.println("------------------------------------------------------------------------------------------");

		it =  new MyClass(value1 , value2 , risult);
		
		it.Stampa();

		System.out.println("---------------------------------------------------------------------------------------");

		op = new Additional(value1, value2);
		
		op.Stampa();
		op.getDivisione();
		
		System.out.println("---------------------------------------------------------------------------------------");

		op.Multiplicazione();

		div =   new Extentio(risult);
		
		div.getDivisione();
		
		System.out.println("---------------------------------------------------------------------------------------");

		soustraire = new Substract(value1,value2);
		
		soustraire.OpSottrazione();
		
		System.out.println("---------------------------------------------------------------------------------------");
		
		conta = new Conta(value1, value2);
		conta.getFa();
		
	
		
		
	}


}