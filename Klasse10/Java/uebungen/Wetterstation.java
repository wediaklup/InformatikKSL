package uebungen;

public class Wetterstation {

	// __________________________________________
	// Aufgabe 5
	static void ausgabe(int[] temperaturen) {
		System.out.print("Tag:\t\t");
		for (int i = 0; i < temperaturen.length; i++) {
			System.out.print((i + 1) + "\t");
		}
		System.out.print("\nTemperatur:\t");
		for (int i = 0; i < temperaturen.length; i++) {
			System.out.print(temperaturen[i] + "\t");
		}
		System.out.println();
	}

	// __________________________________________
	// Aufgabe 2
	static int sum(int[] zahlen) {
		int sum = 0;
		for (int i = 0; i < zahlen.length; i++) {
			sum += zahlen[i];
		}
		return sum;
	}

	static double avg(int[] zahlen) {
		return sum(zahlen) / (double) zahlen.length;
	}

	// __________________________________________
	// Aufgabe 3
	static int max(int[] zahlen) {
		if (zahlen.length == 0) {
			return 0;
		}
		int max = zahlen[0];
		for (int i = 0; i < zahlen.length; i++) {
			if (zahlen[i] > max) {
				max = zahlen[i];
			}
		}
		return max;
	}

	static int min(int[] zahlen) {
		if (zahlen.length == 0) {
			return 0;
		}
		int min = zahlen[0];
		for (int i = 0; i < zahlen.length; i++) {
			if (zahlen[i] < min) {
				min = zahlen[i];
			}
		}
		return min;
	}

	// __________________________________________
	// Aufgabe 4
	static int maxDiff(int[] zahlen) {
		int diff = 0;
		for (int i = 1; i < zahlen.length; i++) {
			if (Math.abs(zahlen[i - 1] - zahlen[i]) > Math.abs(diff)) {
				diff = zahlen[i] - zahlen[i - 1];
			}
		}
		return diff;
	}

	static int getDiffIndex(int[] zahlen, int diff) {
		for (int i = 1; i < zahlen.length; i++) {
			if (zahlen[i] - zahlen[i - 1] == diff) {
				return i;
			}
		}
		return -1;
	}

	// __________________________________________
	// Main
	public static void main(String[] args) {
		int[] temperatur = { 12, 14, 9, 12, 15, 16, 15, 15, 11, 8, 13, 13, 15, 12 }; // Aufgabe 1
		ausgabe(temperatur); // Aufgabe 5
		System.out.println("Durchscnitt: " + avg(temperatur)); // Aufgabe 2
		System.out.println("Max: " + max(temperatur)); // Aufgabe 3
		System.out.println("Min: " + min(temperatur)); // Aufgabe 3
		System.out.println("Maximale Temperaturdifferenz: " + maxDiff(temperatur) + "° von Tag "
				+ (getDiffIndex(temperatur, maxDiff(temperatur))) + " auf Tag "
				+ (getDiffIndex(temperatur, maxDiff(temperatur)) + 1)); // Aufgabe 4
	}

}
