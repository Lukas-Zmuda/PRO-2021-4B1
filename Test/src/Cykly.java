
public class Cykly {

	public static void main(String[] args) {
		
		//cyklus s pevnym poctom opakovani
		for(int i = 0; i < 6; i++) {
			System.out.println((i + 1) + ". Java");
		}
		
		for(int i = 1; i < 11; i++) {
			System.out.print(i + ",");
		}
		System.out.println();
		
		for(int i = 10; i > 0; i--) {
			System.out.print(i + ",");
		}
		System.out.println();
		
		for(int i = 0; i < 11; i += 2) {
			System.out.print(i + ",");
		}
		System.out.println();
	}

}
