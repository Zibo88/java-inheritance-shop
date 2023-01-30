package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	private static int codiceProdotto;
	protected String nome;
	protected String marca;
	protected float prezzo;
	private static float iva = 0.21F;
	
	Random randomNumber = new Random();
	
	public Prodotto(int codiceProdotto, String nome, String marca, float prezzo, float iva) {
		super();
		codiceProdotto = randomNumber.nextInt(10000);
		setNome(nome);
		setMarca(marca);
		setPrezzo(prezzo);
		this.iva = iva;
	}

	static int getCodiceProdotto() {
		return codiceProdotto;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	static float getIva() {
		return iva;
	}
	
	static float prezzoIva(float prezzo, float iva) {
		if(prezzo>0) {
			return prezzo = prezzo +(prezzo*iva);
		}else{
			System.out.println("Il prezzo inserito non può essere inferiore a 1: stai visualizzando il prezzo base");
			return prezzo;
		}
		
	}
	

}
