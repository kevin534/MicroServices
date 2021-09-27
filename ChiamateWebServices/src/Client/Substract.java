package Client;

import Interfacce.Sottrazione;

public class Substract implements Sottrazione {
 int value1;
 int value2;
	public Substract(int value1, int value2) {
		this.value1=value1;
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
	public int getTotal() {
		return getValue1() - getValue2();
	}
	public void OpSottrazione() {
	
		System.out.println("Il risultato della sottrazione è : " +getTotal());
		//return getTotal();
	}

}
