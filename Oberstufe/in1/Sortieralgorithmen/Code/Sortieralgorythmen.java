package Code;

public class Sortieralgorythmen {
	
	static int linearSearch(int[] f, int k) {
		/*Funktion für die lineare Suche nach k in f*/
		for (int i = 0; i < f.length; i++) {	// Iteriert über alle Elemente
			if (f[i] == k) {					// Wenn k an dieser Stelle liegt
				return i;						// wird der Index zurückgegeben
			}
		}
		return -1;	// -1 als Fehlerwert, da der Index keine negative Zahl sein kann
	}
	
	static int binarySearch(int[] f, int k) {
		/*Funktion für die binäre Suche nach k in f*/
		int u = 0;				// Definiert die Untergrenze als Index 0
		int o = f.length - 1;	// Definiert die Obergrenze als Index (length - 1)
		while (u != o) {		// Solange der Raum nicht auf 0 Elemente eingeschränkt wurde
			int i = (u + o) / 2;	// wird als Index der Mittelwert genommen
			if (f[i] == k) {		// Wenn der k an dieser Stelle liegt
				return i;			// wird der index zurückgegeben
			} else if (f[i] < k) {	// Wenn k größer als der Wert an dieser Stelle ist
				u = i;				// wird die Untergrenze des Suchraums auf den aktuellen Index gelegt
			} else {				// Wenn k kleiner als der Wert an dieser Stelle ist
				o = i;				// wird die Obergrenze des Suchraums auf den aktuellen Index gelegt
			}
		}
		return -1;	// -1 als Fehlerwert, da der Index keine negative Zahl sein kann
	}

	public static void main(String[] args) {
		int[] a = {1, 2, 4, 7, 9, 12, 14, 16, 19, 24, 32, 42};
		System.out.println(binarySearch(a, 16));

	}

}
