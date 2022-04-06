package edu.oop.zaklady;

public class Student {
	
	//instancne premenne
	//vlastnosti objektu
	String meno;
	String priezvisko;
	private int vek;
	char pohlavie;
	
	//konstruktor
	public Student(){
		meno = "nezname";
		priezvisko = "nezname";
		vek = 5;
		pohlavie = 'n';
		System.out.println("Volany konstruktor bez parametra");
	}
	
	Student(String meno, String priezvisko, int vek, char pohlavie){
		
		this.meno = meno;
		this.priezvisko = priezvisko;
		this.vek = vek;
		this.pohlavie = pohlavie;
		System.out.println("Volany konstruktor s parametrami");
	}
	
	//metody
	//schopnosti objektu
	
	String celeMeno() {
		return meno + " " + priezvisko;
	}
	
	
	public void info() {
		System.out.println("Meno a priezvisko: " + celeMeno());
		System.out.println("Vek: " + vek);
		System.out.println("Pohlavie: " + pohlavie);
	}
	
	boolean plnolety() {
		return vek > 17;
	}
	
	int getVek(){
		return this.vek;
	}
	
	
	void setVek(int vek) {
		if(vek >0 ) {
			this.vek = vek;			
		}else {
			this.vek = 5;
		}
	}
	
	
	
	
	

}
