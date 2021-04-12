package REV_13_Pilha_EX5;

import java.util.Scanner;


public class Main {
		
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		System.out.println("Digite a frase: \n");
		Scanner e = new Scanner(System.in);
		
		String palavra = e.nextLine();;
		for(int i=0; i < palavra.length(); i++) {
		    pilha.empilhar(palavra.charAt(i));
		}
		
		System.out.println("Toda a Pilha: ");
		pilha.listar();
		pilha.vazia();
		
		}
		

	}


