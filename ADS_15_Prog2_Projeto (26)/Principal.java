package TrabalhoExercicio3_0_Heranca_Jogo_Rapido;

import java.util.Scanner;

public class Principal extends Usuario{
	public static void main(String args[]) {
		Usuario U = new Usuario();
		
		Scanner e = new Scanner(System.in);
				
		System.out.println("Digite o nome: ");
		U.setNome(e.nextLine());

		System.out.println("Digite o E-mail: ");
		U.setEmail(e.nextLine());
		
		System.out.println("Digite o Telefone: ");
		U.setTelefone(e.nextInt());
		e.close();
		
		System.out.println(U);
		
		
	}
	
}

