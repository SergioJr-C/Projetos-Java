package TrabalhoExercicio2_2;

import java.util.Scanner;


public class Main {
	
	private static String vetor[];
	
	public static void main (String args[]) {
		vetor = new String[8];
		Scanner e = new Scanner(System.in);
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o valor da posição " + "["+i+"]" + " do vetor: ");
			vetor[i] = e.nextLine();
		}
		Vetores vet = new Vetores();
		System.out.println("\nVetor:");
		vet.exibeConteudo(vetor);
		System.out.println("\nVetor com Acréscimo: ");
		
		String vetFl[] = vet.vetFloat(vetor);
		
		
		vet.exibeConteudo(vetFl);
		
		
		
		System.out.println("\n");

	}
}


