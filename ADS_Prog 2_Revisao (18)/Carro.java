package R_18_Contru_e_Destru_Construtor_EX6_Clone;

public class Carro implements Cloneable {
	private String nomeCarro;
	private String corCarro = "Azul";
	
	//Utilizando mais de um construtor e v�rias inst�ncias na classe
	public Carro(String nome, String cor) {
		nomeCarro = nome;
		corCarro = cor;
	}
	
	
	public Carro(String nome) {
		nomeCarro = nome;
	}
	
	public void exibeNome() {
		System.out.println("O nome do carro �: " +nomeCarro);
		System.out.println("A cor do carro �: " +corCarro);
	}
	
	@Override
	public Carro clone() {
		try {
			return (Carro) super.clone();
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
}
