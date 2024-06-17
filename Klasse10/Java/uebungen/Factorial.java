package uebungen;

public class Factorial {
	static int recFactorial(int n) {
		// Rekursiver Algorythmus
		if (n < 1) { // Abbruchbedingung
			return 1; // 0! = 1
		}
		return recFactorial(n - 1) * n; // n! = n * (n-1)!
	}
	
	static int iterFactorial(int n) {
		// Iterativer Algorythmus
		if (n < 1) { // 0! = 1
			return 1;
		}
		int a = 1;
		// Berechnet n * (n-1) * (n-2) * ...
		while (n > 1) { // Solange n größer 1 ist
			a *= n; // wird a mit n multipliziert
			n--;    // und n verringert
		}
		return a;
	}
	
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.println(recFactorial(i) + "\t" + iterFactorial(i));
		}

	}

}
