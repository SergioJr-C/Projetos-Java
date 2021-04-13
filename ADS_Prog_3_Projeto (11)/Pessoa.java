package Exec_2d_2;

public class Pessoa {
	protected String nome;
	protected String sobrenome;
	protected String email;
	protected String turma;

	
	public Pessoa() {
		
	}
		
	
	
	public Pessoa(String nome, String sobrenome, String email, String turma) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.turma = turma;
	}


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

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String[] toLinha() {
		return new String[] {this.nome, this.sobrenome, this.email, this.turma};
	}
}
