package R_12_Vetores_e_Arquivos_Leitura;

import java.util.Scanner;

public class Gerenciador {
	
	private static int vetor[];
	
	public static void main(String args[]) {
//		Scanner leitura = new Scanner(System.in);
//		System.out.println("Digite a frase a ser gravada no arquivo: ");
//		String frase = leitura.nextLine();
		Arquivo arq = new Arquivo();
//		arq.gravar(frase);
		arq.ler();
	}
}

//Na classe Gerenciamento comente o c�digo de grava��o e crie um c�digo para leitura do arquivo texto
//gravado anteriormente.