package org.lessons.java.shop;

public class Televisori extends Prodotto {
	
	 static int pollici;
	 static String smartTv = "no";
	 
	 public Televisori(int codiceProdotto, String nome, String marca, float prezzo, float iva, int pollici) {
		super(codiceProdotto, nome, marca, prezzo, iva);
		setPollici(pollici);
	 }

	static int getPollici() {
		return pollici;
	}

	static int setPollici(int pollici) {
		if(pollici>0) {
			return pollici;
		}else {
			System.out.println("i pollici devono essere superiori a 0");
			return 0;
		}
		
	}

	public static String getSmartTv() {
		return smartTv;
	}

	public static void setSmartTv(String smartTv) {
		Televisori.smartTv = smartTv;
	}

	
	 
}
