package TrabalhoExercicio4_2_Polimorfismo_EX_1;

public class Usuario {
	protected String nome;
	protected String sobrenome;
	protected String email;
	protected String idade;
	protected String telefone;
	
	public Usuario (String nome,String sobrenome,String email,String idade, String telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.idade = idade;
		this.telefone = telefone;
	}
	
	public Usuario () {}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String toString() {
		return "Nome: " + this.nome
				+"\nSobrenome: " + this.sobrenome
				+ "\nE-mail: " + this.email
				+ "\nIdade: " + this.email
				+ "\nTelefone:  " + this.telefone;
	}
}
