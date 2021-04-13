package Jogo_rapido_1;

/*LEMBRAR: Instanciação da classe, chamada de método, passagem de parâmetro deverá ser 
realizada na classe Gerenciador */
import java.util.Scanner;

//Classe com a função para solicitar ao usuário o preenchimento das posições do vetor
public class Gerenciador {
	
	private static int vetor[];
	
	public static void main (String args[]) {
		vetor = new int[5];
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o valor da posição " + i + "do vetor: ");
			vetor[i] = entrada.nextInt();
		}
		Vetor vet = new Vetor();
		int vetorPosProcessamento[] = vet.processaConteudo(vetor);
		vet.exibeConteudo(vetorPosProcessamento);/*passando por parâmetro todo o vetor lido na classe
		Gerenciador para que seja exibido o conteúdo desse Vetor*/
	}
}
