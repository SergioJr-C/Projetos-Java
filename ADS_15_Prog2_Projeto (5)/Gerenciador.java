package Jogo_rapido_1;

/*LEMBRAR: Instancia��o da classe, chamada de m�todo, passagem de par�metro dever� ser 
realizada na classe Gerenciador */
import java.util.Scanner;

//Classe com a fun��o para solicitar ao usu�rio o preenchimento das posi��es do vetor
public class Gerenciador {
	
	private static int vetor[];
	
	public static void main (String args[]) {
		vetor = new int[5];
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o valor da posi��o " + i + "do vetor: ");
			vetor[i] = entrada.nextInt();
		}
		Vetor vet = new Vetor();
		int vetorPosProcessamento[] = vet.processaConteudo(vetor);
		vet.exibeConteudo(vetorPosProcessamento);/*passando por par�metro todo o vetor lido na classe
		Gerenciador para que seja exibido o conte�do desse Vetor*/
	}
}
