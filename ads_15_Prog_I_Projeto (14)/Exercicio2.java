
package Resolvidos_pelo_Professor_Lista1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor: ");
            vetor[i] = entrada.nextInt();
            soma += vetor[i];
        }
        System.out.println("Soma: " + soma);
    }
}
