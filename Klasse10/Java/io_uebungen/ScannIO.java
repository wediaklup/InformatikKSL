package io_uebungen;

import java.util.Scanner;

public class ScannIO {
	
	static boolean geschlecht; //True = Frau; False = Mann
	static int alter;
	static String name;
	static Scanner s = new Scanner(System.in);
	

	public static void main(String[] args) {
		System.out.println("Name eingeben: ");
		name = s.nextLine(); // Name eingeben
		System.out.println("Geschlecht (Mann/Frau) eingeben: ");
		if (s.next().equals("Frau")) {										// Wenn der Nutzer Frau eingibt
			geschlecht = true;												// wird das Geschlecht auf true(=Frau) gesezt
		} else {															// sonst
			geschlecht = false;												// wird das Geschlecht auf false(=Mann) gesetzt
		}
		System.out.println("Alter eingeben: ");
		alter = s.nextInt(); // Alter eingeben
		
		String anrede = "";						// Deklaration und Definition von anrede
		if (geschlecht) {						// Wenn das Geschlecht true(=Frau) ist
			anrede = "Frau";					// wird anrede auf Frau gesetzt
		} else {								// sonst (geschlecht = false(=Mann))
			anrede = "Herr";					// wird anrede auf Herr gesetzt
		}
		
		if (alter > 18) {											// Wenn die Person erwachsen ist
			System.out.println("Guten Tag " + anrede + " " + name); // wird in der Begrüßung eine Anrede verwendet
		} else {													// sonst (Person ist ein Kind)
			System.out.println("Hallo " + name);					// wird in der Begrüßung keine Anrede verwendet
		}
		

	}

}
