
package Licao1_Estrutura_de_Repeticao;

import java.io.*;

public class Exercicio5 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(
            new InputStreamReader(System.in));
        System.out.print("Nome: ");
        String nome = input.readLine();
        nome = nome.toUpperCase();
        System.out.println("Nome: " + nome);
        nome = nome.toLowerCase();
        System.out.println("Nome: " + nome);
        int tamanho = nome.length();
        System.out.println("Quant. Carcters: " + tamanho);
    }
}
