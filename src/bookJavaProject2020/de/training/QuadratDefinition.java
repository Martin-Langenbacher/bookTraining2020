package bookJavaProject2020.de.training;

public class QuadratDefinition {
	int a;
	
	// Konstruktordefinition
	QuadratDefinition(int x) {
		a = x;
	}
	
	// Instanzmethode zum Berechnen des Flächeninhalts
	public int flaeche() {
		int f = a * a;
		return f;
	}
	
	// Gleichnamige Klassenmethode zum Berechnen des Flächeninhalts
	public static int flaeche(QuadratDefinition q) {
		int f = q.a * q.a;
		return f;
	}
}
