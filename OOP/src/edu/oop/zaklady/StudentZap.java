package edu.oop.zaklady;

public class StudentZap {
	
	private String meno;
	private String priezvisko;
	private int vek;
	private char pohlavie;
	
	
	public StudentZap(String meno, String priezvisko, int vek, char pohlavie) {
		this.meno = meno;
		this.priezvisko = priezvisko;
		this.vek = vek;
		this.pohlavie = pohlavie;
	}


	public String getMeno() {
		return meno;
	}


	public void setMeno(String meno) {
		this.meno = meno;
	}


	public String getPriezvisko() {
		return priezvisko;
	}


	public void setPriezvisko(String priezvisko) {
		this.priezvisko = priezvisko;
	}


	public int getVek() {
		return vek;
	}


	public void setVek(int vek) {
		this.vek = vek;
	}


	public char getPohlavie() {
		return pohlavie;
	}


	public void setPohlavie(char pohlavie) {
		this.pohlavie = pohlavie;
	}
	
	
	
	

}
