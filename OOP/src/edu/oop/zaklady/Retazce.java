package edu.oop.zaklady;

public class Retazce {

	public static void main(String[] args) {
		
		String meno = "Lukas";
		
		String meno2 = new String("Lukas");
		
		String meno3 = "Lukas";
		
		String meno4 = "LuKaS";
		
		String meno5 = "   Lukas ";
		
		System.out.println(meno == meno2);
		System.out.println(meno == meno3);
		
		System.out.println(meno.equals(meno2));
		System.out.println(meno.equals(meno3));
		
		System.out.println(meno.toUpperCase());
		System.out.println(meno.toLowerCase());
		//System.out.println(meno);
		
		System.out.println(meno.toLowerCase().equals(meno4.toLowerCase()));
		System.out.println(meno.equalsIgnoreCase(meno4));
		
		//pozicia znaku v retazci
		System.out.println(meno.indexOf('k'));
		//znak na pozicii
		System.out.println(meno.charAt(0));
		//dlzka retazca
		System.out.println(meno.length());
		//posledny znak
		System.out.println(meno.charAt(meno.length() - 1));
		System.out.println(meno.substring(2));
		System.out.println(meno.substring(1, 4));
		
		System.out.println(meno.equals(meno5));
		
		//oreze retazec o prazdne znaky
		System.out.println(meno5.trim());
		
		System.out.println(meno.trim().equals(meno5.trim()));
	
		
	}

}
