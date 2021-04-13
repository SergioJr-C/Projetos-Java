package Trabalho_Pratico_1_b;

public class Quadrado {
	private Ponto supEsq;
	private Ponto infDir;
	
	public Quadrado() {}
	
	public Quadrado(Ponto supEsq, Ponto infDir) {
		this.supEsq = supEsq;
		this.infDir = infDir;
	}

	public String toString() {
		return "Ponto Superior Esquerdo: " + this.supEsq + "\nPonto Inferior Direito: " + this.infDir;
	}
	
	public Ponto getSupEsq() {
		return supEsq;
	}
	public void setSupEsq(Ponto supEsq) {
		this.supEsq = supEsq;
	}
	public Ponto getInfDir() {
		return infDir;
	}
	public void setInfDir(Ponto infDir) {
		this.infDir = infDir;
	}
}
