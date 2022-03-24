package edu.oop.zaklady;

public class Student {
	
	//instancne premenne
	//vlastnosti objektu
	String meno;
	String priezvisko;
	int vek;
	char pohlavie;
	
	//konstruktor
	Student(){
		meno = "nezname";
		priezvisko = "nezname";
		vek = 5;
		pohlavie = 'n';
		System.out.println("Volany konstruktor bez parametra");
	}
	
	Student(String m, String p, int v, char pp){
		meno = m;
		priezvisko = p;
		vek = v;
		pohlavie = pp;
		System.out.println("Volany konstruktor s parametrami");
	}
	
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
		return vek > 17;
	}
	
	
	
	
	
	

}
