package Trabalho_Pratico_Resolvido_Pelo_Professor;

public class Ponto {
	private double x;
	private double y;
	
	public Ponto() {}
	
	public Ponto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getDistancia(Ponto p2) {
		return Math.sqrt(((this.x - p2.getX())*(this.x - p2.getX()) + (this.y - p2.getY())*(this.y - p2.getY())));
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

	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
}
