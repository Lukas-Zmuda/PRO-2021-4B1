import java.util.Scanner;

public class Cykly2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int pocet = 0;
		int cislo = -1;
		
		while(cislo != -111) {
			System.out.println("Zadaj cislo: ");
			cislo = sc.nextInt();
			pocet++;
		}
		
		//pocet--;
		System.out.println("Pocet zadanych cisel: " + pocet);

	}

}
