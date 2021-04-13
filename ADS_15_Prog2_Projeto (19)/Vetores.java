package TrabalhoExercicio2_1;

public class Vetores {

	public int[] vetorCrescente(int vet[]) {
		   for (int i = 0; i < 7; i++) {
	            int menor = vet[i];
	            for (int j = i + 1; j < 8; j++) {
	                if (menor > vet[j]){
	                    int aux = menor;
	                    menor = vet[j];
	                    vet[j] = aux;
	                }
	            }
	            vet[i] = menor;
	        }
		   return vet;
	}
	
	
	public int[] vetorDecrescente(int vet[]) {
		   for (int i = 0; i < 7; i++) {
	            int maior = vet[i];
	            for (int j = i + 1; j < 8; j++) {
	                if (maior < vet[j]){
	                    int aux = maior;
	                    maior = vet[j];
	                    vet[j] = aux;
	                }
	            }
	            vet[i] = maior;
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
Criar uma classe para ordenar um vetor de 8 números inteiros,
recebido por parâmetro. A classe de ordenação deverá ter 2
métodos: um para ordenar de modo crescente e outro para orde-
nar de modo decrescente. Na tela principal do programa deverão
ser disponibilizadas as opções para o usuário digitar os
números e selecionar qual o método de ordenação ele deseja. 
Apresente na tela o resultado da ordenação.
*/