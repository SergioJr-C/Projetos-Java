package TrabalhoExercicio4_4_Polimorfismo_EX_3_Correcao;
import java.util.Scanner;

public class Principal_Correcao extends Cavaleiro_Correcao {

	
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
		
		Cavaleiro_Correcao c = new Cavaleiro_Correcao(n, tpo, r, tlo);
		
		System.out.println("Cavaleiro:\n" + c +"\n\n");
		
		// Usando o método com 3 atributos e pegando o retorno e imprimindo.
		System.out.println(c.setarDados(n+"-Atualizado", tpo+"-Atualizado", r+"-Atualizado") +"\n\n");
		
		System.out.println("Cavaleiro:\n" + c +"\n\n");
		
		// Usando o método com 1 atributo, sem retorno
		c.setarDados(n);
		
		System.out.println("Cavaleiro:\n" + c +"\n\n");
		
		
		e.close();
	}
}
