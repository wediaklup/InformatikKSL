package uebungen;

public class VertikaleAusgabe {

	static void gibausVertikal(String string) {
		if (string.length() == 0) {
			return;
		}
		System.out.println(string.charAt(0));
		gibAusVertikal(string.substring(1));
	}

	static void gibausVertikal(int integer) {
		gibausVertikal(String.valueOf(integer))
	}
	
	public static void main(String[] args) {
		gibausVertikal(1234);

	}

}
