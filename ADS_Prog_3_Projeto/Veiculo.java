package Exec_2a_1;

public class Veiculo {
	private String nome;
	private String cor;
	private String anoFabri;
	
	public Veiculo () {
		nome = "Gol";
		cor = "Azul";
		anoFabri = "20/10/1990";		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAnoFabri() {
		return anoFabri;
	}

	public void setAnoFabri(String anoFabri) {
		this.anoFabri = anoFabri;
	}
	
	
}
