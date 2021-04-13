package TrabalhoExercicio4_4_Polimorfismo_EX_3;

import java.util.Scanner;

public class Principal extends Cavaleiro {

	
	public static void main(String args[]) {
		Scanner e = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String n = e.nextLine();
		
		System.out.println("Tipo: ");
		String tpo = e.nextLine();
		
		System.out.println("Reino: ");
		String r = e.nextLine();
		
		System.out.println("Título: ");
		String tlo = e.nextLine();
		
		
		Cavaleiro c = new Cavaleiro(n, tpo, r, tlo);
		
		System.out.println("Cavaleiro:\n" + c +"\n\n");
		
		
		System.out.println(c.setarDados(n+"-Atualizado", tpo+"-Atualizado", r+"-Atualizado") +"\n\n");
		
		System.out.println("Cavaleiro:\n" + c +"\n\n");
		
		
		c.setarDados(n);
		
		System.out.println("Cavaleiro:\n" + c +"\n\n");
		
		
		e.close();
		
	}
}
