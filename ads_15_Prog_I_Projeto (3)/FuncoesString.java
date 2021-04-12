
package Licao_1_Ordenação_de_Vetores_FuncoesMatematicas_String;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FuncoesString {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(
                new InputStreamReader (System.in));
        System.out.print("Nome: ");
        String nome = entrada.readLine();
        int tamanho = nome.length();
        System.out.println("Quant. caracteres: " + tamanho);
        String[] nomePessoa = new String[tamanho];
        for (int i = 0; i < tamanho; i++) {
            nomePessoa[i] = String.valueOf(nome.charAt(i));
            System.out.println(i + ": " + nomePessoa[i]);
        }
        System.out.println("Maísculas: " + nome.toUpperCase());
        System.out.println("Minúsculas: " + nome.toLowerCase());
    }
}
