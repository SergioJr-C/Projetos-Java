package Trabalho_Pratico_Resolvido_Pelo_Professor;

public class Quadrado {
	private Ponto ps;
	private Ponto pi;
	
	public Quadrado() {}
	
	public Quadrado(Ponto ps, Ponto pi) {		
		this.ps = ps;
		this.pi = pi;
	}
	
	public double getDiagonal() {
		return ps.getDistancia(pi);
	}
	
	public double getLado() {
		return this.pi.getX() - this.ps.getX();
	}
	
	public double getArea() {
		double area = this.getLado() * this.getLado();
		return area;
	}
	
	public double getPerimetro() {
		double p = this.getLado()*4;
		return p;
	}
	
	public Ponto getPs() {
		return ps;
	}
	public void setPs(Ponto ps) {
		this.ps = ps;
	}
	public Ponto getPi() {
		return pi;
	}
	public void setPi(Ponto pi) {
		this.pi = pi;
	}
	
	public String toString() {
		return "Ponto Superior: " + ps + "\nPonto Inferior: " + pi;
	}

}
