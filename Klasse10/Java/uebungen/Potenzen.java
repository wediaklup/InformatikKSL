package uebungen;

public class Potenzen {
	public static void main(String[] args) {
		// Iteriert über alle Zahlen von 000 bis 999
		// Gibt alle Zahlen aus für die gilt: a³ + b³ +c³ = 100a + 10b + c
		for (int a = 0; a < 10; a++) {
			for (int b = 0; b < 10; b++) {
				for (int c = 0; c < 10; c++) {
					int dezimal = 100 * a + 10 * b + c; // Berechnet Dezimalzahl
					int potenz = a * a * a + b * b * b + c * c * c; // Berechnet Potenzsumme
					if (dezimal == potenz) {
						System.out.println("" + dezimal); // Gibt die Zahl aus
					}
				}
			}
		}
	}
}
