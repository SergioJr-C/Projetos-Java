package REV_16_Fila_EX1;

public class Paciente {
	private String nome;
	private String data;
	private String cpf;
		
	public Paciente() {}
	
	public Paciente(String nome, String data, String cpf) {
		this.nome = nome;
		this.data = data;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString() {
		return "Nome: " + this.nome + "\n Data de Nascimento: " + this.data + "\nCpf: " + this.cpf + "\n";
	}
}
