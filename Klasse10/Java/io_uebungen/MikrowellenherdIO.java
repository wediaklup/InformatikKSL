package io_uebungen;

import java.util.Scanner;

public class MikrowellenherdIO {

	public static void main(String[] args) {
		int anzahl;								// Deklarationen
		double erhitzungszeit;					// Deklarationen
		Scanner s = new Scanner(System.in);		// Deklarationen
		
		System.out.println("Anzahl der Posten: ");
		anzahl = s.nextInt();
		System.out.println("Erhitzungszeit für einen Posten: ");
		erhitzungszeit = s.nextDouble();
		if (anzahl == 1) {
			System.out.println("Empfohlene Erhitzungszeit: " + erhitzungszeit);
		} else if (anzahl == 2) {
			System.out.println("Empfohlene Erhitzungszeit: " + erhitzungszeit * 1.5);
		} else if (anzahl == 3) {
			System.out.println("Empfohlene Erhitzungszeit: " + erhitzungszeit * 2);
		} else {
			System.out.println("Erhitzungsmenge nicht empfohlen!");
		}
		

	}

}
