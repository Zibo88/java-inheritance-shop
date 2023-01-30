package org.lessons.java.shop;

import java.util.Random;

public class Smartphone extends Prodotto {
	
	static int codiceImei;
	public int memoria;
	
	Random randomImei = new Random();
	
	public Smartphone(int codiceProdotto, String nome, String marca, float prezzo, float iva, int codiceImei, int memoria) {
		super(codiceProdotto, nome, marca, prezzo, iva);
		codiceImei = randomImei.nextInt(10000)+1;
		this.memoria = memoria;
	}

	static int setCodiceImei( int codiceImei ) {
		return codiceImei;
	}
	
	

	
	
	
	
	
	
	
}
