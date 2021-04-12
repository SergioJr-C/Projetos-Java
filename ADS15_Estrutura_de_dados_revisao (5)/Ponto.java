package REV_04_Lista_Encadeada_TRAB_PRATICO_3;

public class Ponto {
	private double x;
	private double y;
	
	public Ponto() {}
	
	public Ponto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getDistancia(Ponto p2) {
		double dx = (this.x - p2.getX())*(this.x - p2.getX());
		double dy = Math.pow((this.y - p2.getY()), 2);
		return Math.sqrt((dx+dy));
		//
	}
	
	public String toString() { 
		return "[" +this.x + ", " + this.y + "]";
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}	
}
