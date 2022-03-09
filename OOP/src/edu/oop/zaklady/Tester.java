package edu.oop.zaklady;

public class Tester {

	public static void main(String[] args) {
		
		//deklaracia objektu
		Student s1;
		
		//inicializacia objektu v pamati
		s1 = new Student();
		
		Student s2 = new Student();
		
		s1.meno = "Janko";
		s1.priezvisko = "Hrasko";
		s1.vek = 22;
		s1.pohlavie = 'm';
		
		System.out.println("Janko Hrasko ma " + s1.vek + " rokov");
		
		//vytvorte dalsie 2 objekty triedy Student a naplnte ich hodnotami
		
		
		

	}

}
