package Exemplo_4_Criptografia;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		char alfabeto[] = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		Scanner entrada = new Scanner(System.in);
		String texto = "";

		System.out.println("Digite a frase: ");
		texto = entrada.nextLine();
		texto = texto.toUpperCase();
		
		System.out.println("Texto original: " + texto);
				
		char vetor[] = texto.toCharArray();
		for(int i=0; i<vetor.length; i++) {
			for(int j = 0; j < alfabeto.length; j++) {
				if(vetor[i] == alfabeto[j]) {
					if(j < alfabeto.length-1) {
						vetor[i] = alfabeto[j+1];
					}else {
						vetor[i] = alfabeto[0];
					}
					break;
				}
			}
		}
		
		String criptografado = "";
		for(int i =0 ; i<vetor.length; i++) {
			criptografado += vetor[i];
		}
		System.out.println("Texto criptografado: " + criptografado);
		
		
		for(int i=0; i<vetor.length; i++) {
			for(int j = 0; j < alfabeto.length; j++) {
				if(vetor[i] == alfabeto[j]) {
					if(j > 0) {
						vetor[i] = alfabeto[j-1];
					}else {
						vetor[i] = alfabeto[alfabeto.length-1];
					}
					break;
				}
			}
		}
		
		String descriptografado = "";
		for(int i =0 ; i<vetor.length; i++) {
			descriptografado += vetor[i];
		}
		System.out.println("Texto descriptografado: " + descriptografado);
	}

}
