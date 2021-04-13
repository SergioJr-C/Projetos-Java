package TrabalhoExercicio4_4_Polimorfismo_EX_3;

public class Cavaleiro extends Raca {
	
	private String titulo;
	
	
	public Cavaleiro() {}
	
	public Cavaleiro(String nome, String tipo, String reino, String titulo) {
		super(nome,tipo,reino);
		
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String setarDados(String nome, String tipo, String reino) {
		this.nome = nome;
		this.tipo = tipo;
		this.reino = reino;
		return "Atributos Nome, Tipo e Reino do Cavaleiro atualizados com sucesso!";
	}
	
	
	public void setarDados(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return super.toString() + "\nTitulo: " + this.titulo;
	}

	
}

