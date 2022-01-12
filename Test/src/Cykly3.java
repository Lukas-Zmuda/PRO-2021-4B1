import java.util.Scanner;

public class Cykly3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int pocet = 0;
		int cislo = 0;
		
		do {
			System.out.println("Zadaj cislo: ");
			cislo = sc.nextInt();
			pocet++;
		}while(cislo != -111);
		
		pocet--;
		
		System.out.println("Pocet zadanych cisel: " + pocet);

	}

}
