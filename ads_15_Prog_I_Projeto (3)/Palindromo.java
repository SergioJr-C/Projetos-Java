
package Licao_1_Ordenação_de_Vetores_FuncoesMatematicas_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindromo {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(
                new InputStreamReader (System.in));
        System.out.print("Frase: ");
        String frase = entrada.readLine();
        frase = frase.replace(" ", "");
        frase = frase.replace("-", "");
        String[] vetor = new String[frase.length()];
        for (int i = 0; i < frase.length(); i++) {
            vetor[i] = String.valueOf(frase.charAt(i));
            //System.out.print(vetor[i] + " ");
        }
        System.out.println("");
        boolean palindromo = true;
        int ultPos = vetor.length - 1;
        for (int i = 0; i < vetor.length/2; i++) {
            if (!vetor[i].equals(vetor[ultPos])){
                palindromo = false;
                break;
            }
            else{
                ultPos--;
            }
        }
        if (palindromo)
            System.out.println("É um Palíndromo");
        else
            System.out.println("Não é um Palíndromo");
    }
}
