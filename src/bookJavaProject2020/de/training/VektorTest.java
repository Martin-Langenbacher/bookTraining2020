package bookJavaProject2020.de.training;

public class VektorTest {

	public static void main(String[] args) {
		
		// Erzeugen von Vektor-Objekten mit den unterschiedlichen Konstruktoren
		Vektor v1 = new Vektor();
		v1.anzeigen();
		Vektor v2 = new Vektor(1,1,1);
		v2.anzeigen();
		Vektor v3 = new Vektor(v2);
		v3.anzeigen();
		
		// Erzeugen eines neuen Vektor-Objekts durch Veränderung des aufrufenden Objekts
		Vektor vneu = v1.neu(3, 3, 3);
		v1.anzeigen();
		vneu.anzeigen();
		
		// oder...
		v1 = new Vektor();
		Vektor vcopy = v1.neu(new Vektor(3,3,3));
		v1.anzeigen();
		vcopy.anzeigen();
		
		// Erzeugen eines neuen Vektor-Objekts durch Beibehalten des aufrufenden Objekts
		v1 = new Vektor();
		Vektor vneu1 = v1.neu1(2, 2, 2);
		v1.anzeigen();
		vneu1.anzeigen();
	}

}
