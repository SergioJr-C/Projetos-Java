package R_03_Classes_e_Atributos_3_Criando_Objetos;

public class Principal {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Gustavo";
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "Jos�";
		
		System.out.println("O nome da Pessoa 1 �: " + pessoa1.nome);
		System.out.println("O nome da Pessoa 2 �: " + pessoa2.nome);
	}
}
