package REV_14_Pilha_EX6;


import java.util.Arrays;
import java.util.Scanner;


public class Main {
		
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		System.out.println("Digite a frase: \n");
		Scanner e = new Scanner(System.in);
		
		
		String palavra = e.nextLine();;
	
		for (int i = 0; i < palavra.length(); i++) {
			pilha.empilhar(palavra.charAt(i));
		}
	
		System.out.println("Toda a Pilha: ");
		pilha.listar();
		pilha.vazia();
		
		String PalavraInv ="";
		
		for(int i = 0; i < palavra.length(); i++) { 
			PalavraInv += pilha.desempilhar();
		}
		
			
//			System.out.print("Frase:" +palavra);
			System.out.print("\nFrase Invertida:" +PalavraInv);
			
			if(PalavraInv.equalsIgnoreCase(palavra)) {
			System.out.println(palavra +" \nÉ Palíndromo");
			}else {		
				System.out.println(palavra +" \nNão é Palíndromo");
		}
		

	
		}
	}

