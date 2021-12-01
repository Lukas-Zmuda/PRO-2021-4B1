import java.util.Scanner;

public class UlohaCykly {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int pocet = 0, pocetParnych = 0, pocetZapornych = 0, cislo = 0;
		System.out.println("Zadaj pocet cisel: ");
		pocet = sc.nextInt();
		
		for(int i = 0; i < pocet; i++) {
			System.out.println("Zadaj cislo: ");
			cislo = sc.nextInt();
			if(cislo < 0) {
				pocetZapornych++;
			}
			if(cislo % 2 == 0) {
				pocetParnych++;
			}
		}
		
		System.out.println("Pocet parnych: " + pocetParnych);
		System.out.println("Pocet zapornych: " + pocetZapornych);
		

	}

}
