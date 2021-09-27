package Client;

import Interfacce.InterConta;

public class Conta extends Additional implements InterConta{

	
	final int costante = 678;
	private int Operator1;
	private int Operator2;
	
	public Conta(int Operator1, int Operator2) {
		super(300, 45);
		
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

	public void setOperator2(int operator2) {
		Operator2 = operator2;
	}
	
	public int getEff(int Operator1, int Operator2) {
		int risult = 0;
		if(getOperator1() % 2 == 0) {
			
			risult = (costante* getMultiplicazione()) + getOperator1();
			
			return risult;
		}
		
		else if(getOperator2() > getOperator1()) {
			
			risult = (costante* getMultiplicazione()) + getOperator2();
			return risult;
		}
		return risult;
	}
	
	public void getFa() {
		System.out.println("l'operazione gera come risultato: " + getEff(Operator1, Operator2));
	}

}
