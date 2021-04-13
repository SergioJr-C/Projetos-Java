package R_09_Vetores_e_Arquivos_EX3;

import java.util.Scanner;

public class Gerenciador {
	
	private static int vetor[];
	
	public static void main(String args[]) {
		vetor = new int[5];
		Scanner entrada = new Scanner(System.in);
		for(int i=0; i <vetor.length; i++) {
			System.out.print("Digite o valor da posição " + i + " do vetor: ");
			vetor[i] = entrada.nextInt();
		}
		Vetor vet = new Vetor();
		vet.exibeConteudo(vetor);
	}
}
