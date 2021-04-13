package TrabalhoExercicio3_1_Heranca;

import java.util.Scanner;

public class Principal extends Pessoa{
	
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite nome: ");
		String nome = entrada.nextLine();
		System.out.println("Digite idade: ");
		String idade = entrada.nextLine();
		System.out.println("Digite tipo: ");
		String tipo = entrada.nextLine();
		System.out.println("-----");
		System.out.println("Nome: " + nome + "\nIdade: "+ idade + "\nTipo: " + tipo);
		Andar();
		Falar();
		entrada.close();
	}
	
}
