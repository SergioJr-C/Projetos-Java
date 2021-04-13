package TrabalhoExercicio4_2_Polimorfismo_EX_1;

import java.util.Scanner;

public class Principal extends Usuario {
	public static void main (String args[]) {
		
		Scanner e = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String n = e.nextLine();
		
		System.out.println("Sobrenome: ");
		String s = e.nextLine();
		
		System.out.println("E-mail: ");
		String em = e.nextLine();
		
		System.out.println("Idade: ");
		String id = e.nextLine();
		
		System.out.println("Telefone: ");
		String t = e.nextLine();
		
		Usuario a = new Usuario(n, s, em, id, t);
		
		System.out.println("\n" +a);
		
		e.close();
	}
}
