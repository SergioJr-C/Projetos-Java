package TrabalhoExercicio2_3;

import java.util.Scanner;


public class Main {
	
	private static int vetor[];
	
	public static void main (String args[]) {
		vetor = new int[8];
		Scanner e = new Scanner(System.in);
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o valor da posição " + "["+i+"]" + " do vetor: ");
			vetor[i] = e.nextInt();
		}
		Vetores vet = new Vetores();
		int vetPar[] = vet.vetorPar(vetor);
		vet.exibeConteudo(vetPar);
		
		System.out.println("\n");

	}
}
