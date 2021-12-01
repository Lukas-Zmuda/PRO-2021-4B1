import java.util.Scanner;

public class Priemer1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cislo = 0;
		double suma = 0;
		int pocet = 0;
		
		System.out.println("Zadaj pocet cisel: ");
		pocet = sc.nextInt();
		
		for(int i = 0; i < pocet; i++) {
			System.out.println("Zadaj cislo:");
			cislo = sc.nextInt();
			suma += cislo;
		}
		
		System.out.println("Priemer je: " + (suma / pocet));
		

	}

}
