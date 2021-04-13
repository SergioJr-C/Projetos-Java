package Exec_2c_ex2;

public class Pessoa {
	protected String nome;
	protected String email;
	protected String telefone;

	
	public Pessoa() {
		
	}
	

	public Pessoa(String nome, String email, String telefone) {
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


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String[] toLinha() {
		return new String[] {this.nome, this.email, this.telefone};
	}
}
