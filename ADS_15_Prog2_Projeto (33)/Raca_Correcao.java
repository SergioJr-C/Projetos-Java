package TrabalhoExercicio4_4_Polimorfismo_EX_3_Correcao;

public class Raca_Correcao {
	protected String nome;
	protected String tipo;
	protected String reino;
	
	public Raca_Correcao() {}
	
	public Raca_Correcao(String nome, String tipo, String reino) {
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
	
	// M�todo com 3 par�metros e retorno
	// Aqui eu substitui o teu exibirDados por um m�todo para setar os dados com novos valores, e retornar uma mensagem
	// Pois o teu m�todo para exibir, n�o teria funcionalidade, uma vez que tu exibiria os atributos
	// da� n�o era necess�rio passar os atributos por parametros.
	// Dica: quando um m�todo recebe algum par�metro, esse par�metro � usado dentro do m�todo para 
	// alguma opera��o, para setar algum valor, e assim por diante.
	public String setarDados(String nome, String tipo, String reino) {
		this.nome = nome;
		this.tipo = tipo;
		this.reino = reino;
		return "Atributos atualizados com sucesso!";
	}
	
	// M�todo com 1 par�metro e sem retorno (ficou o mesmo que o setNome... mas n�o importa)
	public void setarDados(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "Nome: " + this.nome + "\nTipo: " + this.tipo + "\nReino: " + this.reino;
	}
	
	
}
