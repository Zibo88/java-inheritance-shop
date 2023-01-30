package org.lessons.java.shop;

public class Cuffie extends Prodotto {
	
	public String colore;
	public String wireless;
	public Cuffie(int codiceProdotto, String nome, String marca, float prezzo, float iva, String colore,
			String wireless) {
		super(codiceProdotto, nome, marca, prezzo, iva);
		this.colore = colore;
		this.wireless = wireless;
	}
	public String isWireless() {
		return wireless;
	}
	public void setWireless(String wireless) {
		this.wireless = wireless;
	}
	
	
	
}
