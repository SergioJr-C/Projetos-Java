package R_14_Contru_e_Destru_Construtor_EX2;

public class Carro {
	private String nomeCarro;
	
	//Utilizando Par�metro no construtor
	public Carro(String nome) {
		nomeCarro = nome;
	}
	
	public void exibeNome() {
		System.out.println("O nome do carro �: " +nomeCarro);
	}
}
