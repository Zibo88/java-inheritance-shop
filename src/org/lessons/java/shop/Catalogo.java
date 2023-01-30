package org.lessons.java.shop;

import java.util.Random;
import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Smartphone nuovoSmartPhone;
		Televisori nuovoTelevisore;
		Cuffie nuoveCuffie;
		
		
		Random randomNumber = new Random();
		Scanner data = new Scanner(System.in);
		
		String userChoice = "";
		
//		Classe Prodotto
		String nome = "";
		String marca ="";
		float prezzo = 0;
		int memoria = 0;
		int codiceProdotto =  randomNumber.nextInt(10000);
		float iva = Prodotto.getIva();
		
		
//		Classe Smartphone
		int codiceImei = randomNumber.nextInt(10000);
		
//		Classe Televisori
		int pollici;
		String smartTv;
		
//		Classe Cuffie
		String wireless;
		String colore;
		
		
		
		System.out.println("Vuoi aggiungere un prodotto al tuo catalogo?");
		System.out.println("Scegli tra Smartphone, Televisori e Cuffie.");
		userChoice = data.nextLine().toLowerCase();
		
		
//		SMARTPHONE
		if(userChoice.equals("smartphone")) {
			System.out.println("inserisci il nome del tuo smartphone");
			nome = data.nextLine();
			System.out.println("inserisci la marca del tuo smartphone");
			marca = data.nextLine();
			System.out.println("inserisci il prezzo del tuo smartphone");
			prezzo = data.nextFloat();
			data.nextLine();
			System.out.println("inserisci la memoria in Giga del tuo smartphone");
			memoria = data.nextInt();
			
//			creo istanza
			nuovoSmartPhone = new Smartphone(Prodotto.getCodiceProdotto(), nome,  marca, prezzo, iva, codiceImei, memoria );
			System.out.println("codice prodotto:" +" "+Prodotto.getCodiceProdotto());
			System.out.println("nome:" +" "+nuovoSmartPhone.nome);
			System.out.println("marca:" +" "+nuovoSmartPhone.marca);
			System.out.println("prezzo senza Iva:" +" "+nuovoSmartPhone.prezzo);
			System.out.println("prezzo con Iva:" + " " + Prodotto.prezzoIva(prezzo, Prodotto.getIva()) + "€");
			System.out.println("codiceImei" + " " + Smartphone.setCodiceImei(codiceImei));
			System.out.println("memoria" + " " + nuovoSmartPhone.memoria + "Giga");
			
		}
		
		
//		TELEVISORI
		if(userChoice.equals("televisori")) {
			System.out.println("inserisci il nome del tuo televisore");
			nome = data.nextLine();
			System.out.println("inserisci la marca del tuo televisore");
			marca = data.nextLine();
			System.out.println("inserisci il prezzo del tuo televisore");
			prezzo = data.nextFloat();
			data.nextLine();
			System.out.println("digita no se il televisore NON è una smartTV oppure si se è smartTv");
			smartTv = data.nextLine();
			
			System.out.println("inserisci i pollici del tuo televisore");
			pollici = data.nextInt();
			
			
//			creo istanza
			nuovoTelevisore = new Televisori(Prodotto.getCodiceProdotto(), nome,  marca, prezzo, iva,  Televisori.setPollici(pollici));
			
			
			if(pollici>0 ) {
				System.out.println("codice prodotto:" +" "+Prodotto.getCodiceProdotto());
				System.out.println("nome:" +" "+nuovoTelevisore.nome);
				System.out.println("marca:" +" "+nuovoTelevisore.marca);
				System.out.println("prezzo senza Iva:" +" "+nuovoTelevisore.prezzo);
				System.out.println("prezzo con Iva:" + " " + Prodotto.prezzoIva(prezzo, Prodotto.getIva()) + "€");
				data.nextLine();
				System.out.println("pollici" + " " +Televisori.setPollici(pollici));
				
				
				if(smartTv.equals("si")) {
					Televisori.setSmartTv(smartTv);
					System.out.println("smartTv" + " " + smartTv);
				}else if(smartTv.equals("no")){
					Televisori.setSmartTv(smartTv);
					System.out.println("smartTv" + " " + "non è una smartTv");
				}
					

			}else {
				System.out.println("inserisci i pollici del tuo televisore");
				pollici = data.nextInt();
				
				System.out.println("codice prodotto:" +" "+Prodotto.getCodiceProdotto());
				System.out.println("nome:" +" "+nuovoTelevisore.nome);
				System.out.println("marca:" +" "+nuovoTelevisore.marca);
				System.out.println("prezzo senza Iva:" +" "+nuovoTelevisore.prezzo);
				data.nextLine();
				System.out.println("prezzo con Iva:" + " " + Prodotto.prezzoIva(prezzo, Prodotto.getIva()) + "€");
				data.nextLine();
				System.out.println("pollici" + " " + pollici);
			}
			

		}
		
//		CUFFIE
		if(userChoice.equals("cuffie")) {
			System.out.println("inserisci il nome delle tue cuffie");
			nome = data.nextLine();
			System.out.println("inserisci la marca delle tue cuffie");
			marca = data.nextLine();
			System.out.println("inserisci il prezzo delle tue cuffie");
			prezzo = data.nextFloat();
			data.nextLine();
			System.out.println("inserisci  il colore delle tue cuffie");
			colore = data.nextLine();
			System.out.println("sono wireless?");
			wireless = data.nextLine();
			
			nuoveCuffie = new Cuffie(Prodotto.getCodiceProdotto(), nome,  marca, prezzo, iva, colore, wireless);
			
			System.out.println("codice prodotto:" +" "+Prodotto.getCodiceProdotto());
			System.out.println("nome:" +" "+nuoveCuffie.nome);
			System.out.println("marca:" +" "+nuoveCuffie.marca);
			System.out.println("wireless:" +" "+ Cuffie.setWireless(wireless));
			System.out.println("colore:" +" "+nuoveCuffie.colore);
			System.out.println("prezzo senza Iva:" +" "+nuoveCuffie.prezzo);
			System.out.println("prezzo con Iva:" + " " + Prodotto.prezzoIva(prezzo, Prodotto.getIva()) + "€");
			data.nextLine();
		}

		data.close();
	}

}
