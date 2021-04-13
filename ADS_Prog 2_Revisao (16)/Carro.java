package R_16_Contru_e_Destru_Construtor_EX4;

public class Carro {
	private String nomeCarro;
	private String corCarro = "Azul";
	
	//Utilizando mais de um construtor e várias instâncias na classe
	public Carro(String nome, String cor) {
		nomeCarro = nome;
		corCarro = cor;
	}
	
	
	public Carro(String nome) {
		nomeCarro = nome;
	}
	
	public void exibeNome() {
		System.out.println("O nome do carro é: " +nomeCarro);
		System.out.println("A cor do carro é: " +corCarro);
	}
}
