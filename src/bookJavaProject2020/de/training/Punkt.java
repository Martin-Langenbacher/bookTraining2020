package bookJavaProject2020.de.training;

public class Punkt {
	private double x;
	private double y;
	
	// Konstruktordefinition
	public Punkt(double a, double b) {
		this.x = a;
		this.y = b;
	}

	
	// Zugriffsmethoden: Getter & Setter
	public void setX(double x) {
		this.x = x;
		System.out.println("x-Wert gesetzt");
	}
	
	public void setY(double y) {
		this.y = y;
		System.out.println("y-Wert gesetzt");
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	
	// Instanzmethode für eine Punktanzeige
	public void anzeige() {
		System.out.println("(" + x + "," +y +")");
	}

}
