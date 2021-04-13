package TrabalhoExercicio4_4_Polimorfismo_EX_3_Correcao;
public class Cavaleiro_Correcao extends Raca_Correcao {
	
	// Aqui na classe filha, os atributos s�o privados.
	private String titulo;
	
	
	public Cavaleiro_Correcao() {}
	
	public Cavaleiro_Correcao(String nome, String tipo, String reino, String titulo) {
		super(nome,tipo,reino);	
		
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	// M�todo com 3 par�metros e retorno
	public String setarDados(String nome, String tipo, String reino) {
		this.nome = nome;
		this.tipo = tipo;
		this.reino = reino;
		return "Atributos Nome, Tipo e Reino do Cavaleiro atualizados com sucesso!";
	}
	
	// M�todo com 1 par�metro e sem retorno (ficou o mesmo que o setNome... mas n�o importa)
	public void setarDados(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return super.toString() + "\nTitulo: " + this.titulo;
	}
	
}

