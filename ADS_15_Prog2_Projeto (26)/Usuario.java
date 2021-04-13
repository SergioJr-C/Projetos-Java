package TrabalhoExercicio3_0_Heranca_Jogo_Rapido;

public class Usuario {
	private String nome;
	private String email;
	private int telefone;
	
	public Usuario() {
		
	}
	
	public Usuario( String nome, String email, int telefone) {
		this.nome = nome;
		 this.email = email;
		 this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return 
		"\n Nome: " + nome
		+ "\n E-mail: " + email
		+ " \n Telefone: " + telefone ;
		
	}
}


