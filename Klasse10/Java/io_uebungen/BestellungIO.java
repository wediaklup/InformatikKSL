package io_uebungen;

import java.util.Scanner;

public class BestellungIO {
	static String product;
	static double price;
	static boolean express;
	
	
	public static double getVersand() {
		double versand = 0;
		if (price == -1) {
		} else if (price < 10) { 	// Wenn das Produkt teurer als 10€ ist
			versand += 2;   		// Kostet der Versand 2€
		} else {					// Sonst
			versand += 3;			// 3€
		}
		
		if (express) {				// Wenn es sich um Expressversand handelt
			versand += 5;			// Kostet der Versand 5€ mehr
		}
		return versand;
	}

		
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Geben sie das Produkt ein: ");
		product = s.next();
		System.out.println("Geben sie den Preis ein: ");
		price = s.nextDouble();
		System.out.println("Expressversand (0 - nein; 1 - ja)");
		express = s.nextInt() == 1;
		
		System.out.println("Rechnung für: " + product);
		System.out.println("Preis: " + price);
		System.out.println("Versand: " + getVersand());

	}

}
