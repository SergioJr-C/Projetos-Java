package Exercicios;

public class Paciente {
	private String nome;
	
	public Paciente() {}
	
	
	public Paciente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "" + this.nome;
	}
	
}
