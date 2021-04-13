package TrabalhoExercicio2_3;

public class Vetores {

	public int[] vetorPar(int vet[]) {
		int par = 0;
		for (int i = 0; i < vet.length; i++) {
			if(vet[i] % 2 == 1){
				vet[i] = par;
			}
		}
		   return vet;
	}
	

	public void exibeConteudo(int vet[]) {
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}
	}
}



/*
Crie uma classe que recebe um vetor de inteiros e devolva à classe
principal apenas os que são pares
*/