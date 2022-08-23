package io_uebungen;

import java.util.Scanner;

public class FantasyIO {

	static String name;
	static int strength = 0;
	static int health = 0;
	static int luck = 0;
	static Scanner s = new Scanner(System.in);
	
	public static int getRemainingPoints() {
		int remaining = 15 - strength - health - luck;
		if (remaining > 10) {
			return 10;
		} else {
			return remaining;
		}
	}

	public static void main(String[] args) {
		System.out.println("Geben sie ihren Spielernamen ein: ");
		name = s.next();
		System.out.println("Staerke eingeben (0-" + getRemainingPoints() + "): ");
		strength = s.nextInt();
		System.out.println("Gesundheit eingeben (0-" + getRemainingPoints() + "): ");
		health = s.nextInt();
		System.out.println("Glueck eingeben (0-" + getRemainingPoints() + "): ");
		luck = s.nextInt();
		
		if (getRemainingPoints() < 0 || strength > 10 || health > 10 || luck > 10) {
			strength = 5;
			health = 5;
			luck = 5;
			System.out.println("Sie haben zu viele Punkte vergeben!");
		}
		
		System.out.println(name + ", Staerke: " + strength + ", Gesundheit: " + health + ", Glueck: " + luck);
	}

}
