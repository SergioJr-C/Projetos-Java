package R_11_Vetores_e_Arquivos_gravarArquivo;

import java.util.Scanner;

public class Gerenciador {
	
	private static int vetor[];
	
	public static void main(String args[]) {
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite a frase a ser gravada no arquivo: ");
		String frase = leitura.nextLine();
		Arquivo arq = new Arquivo();
		arq.gravar(frase);
	}
}

//Criar uma classe Gerenciamento para solicitar ao usuário a digitação de uma frase,
//instanciar a classe Arquivo e gravar em um arquivo a frase digitada.