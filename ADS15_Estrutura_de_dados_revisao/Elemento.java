package Exercicios;

public class Elemento {
	private Paciente pessoa;
	private Elemento prox;
	
	public Elemento(Paciente pessoa) {
		this.pessoa = pessoa;
	}
	
	public Paciente getPessoa() {
		return pessoa;
	}
	
	public void setPessoa(Paciente pessoa) {
		this.pessoa = pessoa;
	}
	
	public Elemento getProx() {
		return prox;
	}
	
	public void setProx(Elemento prox) {
		this.prox = prox;
	}
	
	public String toString() {
		return pessoa.toString();
	}
}
