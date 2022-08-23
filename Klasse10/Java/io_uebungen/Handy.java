package io_uebungen;

import java.util.Scanner;

public class Handy {

	String PIN;
	String PUK;
	int numberOfWrongInputs;
	static Scanner s = new Scanner(System.in);

	public static String checkPIN() {
		System.out.println("PIN eingeben: ");
		return s.nextLine().equals(PIN);
	}

	public Handy(String pin, String puk) {	// Konstruktor
		super();
		PIN = pin;
		PUK = puk;
		numberOfWrongInputs = 0;
	}

	public void anschalten() { // Anschalt Methode
		while (numberOfWrongInputs < 3 && checkPIN() == false) { 	// Solange es weniger als 3 falsche Eingaben gab und die PIN-Eingabe nicht richtig ist 
			numberOfWrongInputs++;									// wird die Anzahl der falschen Eingaben erhöht 
		}
		if (numberOfWrongInputs < 3) {	// Wenn nach beenden der Schleife die Anzahl der Falschen eingaben kleiner als 3 ist
			numberOfWrongInputs = 0;	// wird die Anzahl der Falschen Eingaben zurückgesetzt
		}  else if (numberOfWrongInputs == 3) { //wenn die Anzahl der Falschen Eingaben gleich 3 ist
			System.out.println("Handy blockiert!\nPUK eingeben: "); // ist das Handy blockiert
			while (s.next().equals(PUK) == false) {
				System.out.println("PUK eingeben:");
			}
		}
		System.out.println("Handy entsperrt");
	}

	public static void main(String[] args) {
		Handy handy1 = new Handy("1234", "00000000");
		handy1.anschalten();

	}

}
