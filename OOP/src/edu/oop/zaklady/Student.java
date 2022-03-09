package edu.oop.zaklady;

public class Student {
	
	//instancne premenne
	//vlastnosti objektu
	String meno;
	String priezvisko;
	int vek;
	char pohlavie;
	
	//metody
	//schopnosti objektu
	
	String celeMeno() {
		return meno + " " + priezvisko;
	}
	
	
	void info() {
		System.out.println("Meno a priezvisko: " + celeMeno());
		System.out.println("Vek: " + vek);
		System.out.println("Pohlavie: " + pohlavie);
	}
	
	boolean plnolety() {
		//TODO
	}
	
	
	
	
	
	

}
