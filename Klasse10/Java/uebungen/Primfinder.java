package uebungen;

import java.util.ArrayList;

public class Primfinder {
	
	static ArrayList<Integer> primes = new ArrayList<Integer>(); // Liste an Primzahlen
	
	static boolean isPrime(int n) {
		// Prüft n als Primzahl
		int end = (int)Math.sqrt(n) + 1; // Prüft n auf Teiler bis Wurzel n
		int i = 0;
		while (primes.get(i) < end) { // Prüft alle Teiler bis der Teiler größer als end wird
			if (n % primes.get(i) == 0) { // Testet auf Teilbarkeit mit bereits gefundenen Primzahlen
				return false;
			}
			i++;
		}
		return true;
	}

	public static void main(String[] args) {
		primes.add(2);
		primes.add(3);
		primes.add(5);
		primes.add(7);
		primes.add(11);
		primes.add(13);
		
		int limit = 100000000; // Obergrenze
		
		int number = 14;
		while (number < limit) {
			if (isPrime(number)) {
				primes.add(number); // Fügt jede neue Primzahl der Liste hinzu
			}
			number++;
		}
		for (int i : primes) {
			System.out.println(i); // Ausgabe
		}
		
		
	}

}
