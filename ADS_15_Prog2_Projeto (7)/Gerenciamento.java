package Jogo_rapido_3_Gravacao_de_Dados_e_Leitura;

import java.util.Scanner;

public class Gerenciamento {
	public static void main(String args[]) {
//		Scanner leitura = new Scanner(System.in);
//		System.out.println("Digite a frase a ser gravada no arquivo: ");
//		String frase = leitura.nextLine();
		Arquivo arq = new Arquivo();
//		arq.gravar(frase);
		arq.ler();
	}
}
