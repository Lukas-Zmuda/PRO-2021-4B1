package edu.oop.zaklady;

public class Tester {

	public static void main(String[] args) {
		
		//deklaracia objektu
		Student s1;
		
		//inicializacia objektu v pamati
		s1 = new Student();
		
		Student s2 = new Student();
		
		s1.info();
		
		s1.meno = "Janko";
		s1.priezvisko = "Hrasko";
		s1.setVek(22);
		s1.pohlavie = 'm';
		
		s2.meno = "Fero";
		s2.priezvisko = "Mravec";
		s2.setVek(15);
		s2.pohlavie = 'n';
		
		System.out.println("Janko Hrasko ma " + s1.getVek() + " rokov");
		
		//vytvorte dalsie 2 objekty triedy Student a naplnte ich hodnotami
		
		System.out.println("Cele meno: " + s1.celeMeno());
		
		s1.info();
		s2.info();
		
		Student s3 = new Student("Ivan", "Maturant", 19, 'm');
		s3.info();
		
		s3.setVek(-258);
		s3.info();
		

	}

}
