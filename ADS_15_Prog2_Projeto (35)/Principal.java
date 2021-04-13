package TrabalhoExercicio4_6_Polimorfismo_EX_5;

import java.util.Scanner;

public class Principal extends Arquivo {
	public static void main(String args[]) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		String nome = leitura.nextLine();
		
		System.out.println("Digite o e-mail: ");
		String email = leitura.nextLine();
		
		Arquivo arq = new Arquivo();
		arq.gravar(nome, email);
		arq.ler(nome);
	}
}
