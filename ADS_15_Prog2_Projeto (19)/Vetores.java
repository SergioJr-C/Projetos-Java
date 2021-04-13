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
Criar uma classe para ordenar um vetor de 8 n�meros inteiros,
recebido por par�metro. A classe de ordena��o dever� ter 2
m�todos: um para ordenar de modo crescente e outro para orde-
nar de modo decrescente. Na tela principal do programa dever�o
ser disponibilizadas as op��es para o usu�rio digitar os
n�meros e selecionar qual o m�todo de ordena��o ele deseja. 
Apresente na tela o resultado da ordena��o.
*/