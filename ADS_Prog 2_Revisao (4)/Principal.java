package R_04_Classes_e_Atributos_4_Jogo_Rapido;

public class Principal {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.idade = 16;
		System.out.println("A idade da Pessoa 1 �: " + pessoa1.idade);
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.idade = 21;
		System.out.println("A idade da Pessoa 1 �: " + pessoa2.idade);
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.idade = 30;
		System.out.println("A idade da Pessoa 1 �: " + pessoa3.idade);
	}
}
