package Jogo_rapido_1;


public class Vetor {
	/*Retorna o conteúdo do vetor recebido por parâmetro,
	 com a seguinte particularidade:  
	 para cada valor contido em cada posição do vetor 
	 recebido será somado o valor de 100 */
	public int[] processaConteudo(int vet[]) {
		for (int i = 0; i < vet.length; i++) {
			vet[i] = vet[i] + 100;
		}
		return vet;
	}
	
	public void exibeConteudo(int vet[]) {
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}
	}
}
