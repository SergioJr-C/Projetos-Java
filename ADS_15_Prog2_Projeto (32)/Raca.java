package TrabalhoExercicio4_4_Polimorfismo_EX_3;

public class Raca {
	protected String nome;
	protected String tipo;
	protected String reino;
	
	public Raca() {}
	
	public Raca(String nome, String tipo, String reino) {
		this.nome = nome;
		this.tipo = tipo;
		this.reino = reino;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getReino() {
		return reino;
	}

	public void setReino(String reino) {
		this.reino = reino;
	}
	
	public String setarDados(String nome, String tipo, String reino) {
		this.nome = nome;
		this.tipo = tipo;
		this.reino = reino;
		return "Atributos atualizados com sucesso!";
	}
	
	public void setarDados(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "Nome: " + this.nome + "\nTipo: " + this.tipo + "\nReino: " + this.reino;
	}
}
