package R_15_Contru_e_Destru_Construtor_EX3;

public class Carro {
	private String nomeCarro;
	private String corCarro;
	
	//Utilizando mais de um Parâmetro no construtor
	public Carro(String nome, String cor) {
		nomeCarro = nome;
		corCarro = cor;
	}
	
	
	public void exibeNome() {
		System.out.println("O nome do carro é: " +nomeCarro);
		System.out.println("A cor do carro é: " +corCarro);
	}
}
