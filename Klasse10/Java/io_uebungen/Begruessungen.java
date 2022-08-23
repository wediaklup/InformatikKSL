package io_uebungen;

import java.util.Scanner;

public class Begruessungen {

	public static void main(String[] args) {
		String geschlecht;
		int alter;
		String vorname;
		String nachname;

		Scanner s = new Scanner(System.in);
		System.out.println("Bitte Alter Eingeben:");
		alter = s.nextInt();
		if (alter >= 18) {
			System.out.println("Wie lautet ihr Nachname?");
			nachname = s.next();
			System.out.println("Geschlecht angeben (m/w): ");
			geschlecht = s.next();
			if (geschlecht.equals("m")) {
				System.out.println("Guten Tag Herr " + nachname + "!");
			}
			if (geschlecht.equals("w")) {
				System.out.println("Guten Tag Frau " + nachname + "!");
			}
		} else {
			System.out.println("Wie heiﬂt du?");
			vorname = s.next();
			System.out.println("Hallo " + vorname + "!");

		}

	}

}
